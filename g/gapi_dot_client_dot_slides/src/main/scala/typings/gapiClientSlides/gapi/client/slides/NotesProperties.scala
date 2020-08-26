package typings.gapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotesProperties extends js.Object {
  /**
    * The object ID of the shape on this notes page that contains the speaker
    * notes for the corresponding slide.
    * The actual shape may not always exist on the notes page. Inserting text
    * using this object ID will automatically create the shape. In this case, the
    * actual shape may have different object ID. The `GetPresentation` or
    * `GetPage` action will always return the latest object ID.
    */
  var speakerNotesObjectId: js.UndefOr[String] = js.native
}

object NotesProperties {
  @scala.inline
  def apply(): NotesProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotesProperties]
  }
  @scala.inline
  implicit class NotesPropertiesOps[Self <: NotesProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSpeakerNotesObjectId(value: String): Self = this.set("speakerNotesObjectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpeakerNotesObjectId: Self = this.set("speakerNotesObjectId", js.undefined)
  }
  
}

