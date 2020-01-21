package typings.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotesProperties extends js.Object {
  var speakerNotesObjectId: js.UndefOr[String] = js.undefined
}

object NotesProperties {
  @scala.inline
  def apply(speakerNotesObjectId: String = null): NotesProperties = {
    val __obj = js.Dynamic.literal()
    if (speakerNotesObjectId != null) __obj.updateDynamic("speakerNotesObjectId")(speakerNotesObjectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotesProperties]
  }
}

