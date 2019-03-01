package typings
package gapiDotClientDotSlidesLib.gapiNs.clientNs.slidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlideProperties extends js.Object {
  /** The object ID of the layout that this slide is based on. */
  var layoutObjectId: js.UndefOr[java.lang.String] = js.undefined
  /** The object ID of the master that this slide is based on. */
  var masterObjectId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The notes page that this slide is associated with. It defines the visual
    * appearance of a notes page when printing or exporting slides with speaker
    * notes. A notes page inherits properties from the
    * notes master.
    * The placeholder shape with type BODY on the notes page contains the speaker
    * notes for this slide. The ID of this shape is identified by the
    * speakerNotesObjectId field.
    * The notes page is read-only except for the text content and styles of the
    * speaker notes shape.
    */
  var notesPage: js.UndefOr[Page] = js.undefined
}

object SlideProperties {
  @scala.inline
  def apply(
    layoutObjectId: java.lang.String = null,
    masterObjectId: java.lang.String = null,
    notesPage: Page = null
  ): SlideProperties = {
    val __obj = js.Dynamic.literal()
    if (layoutObjectId != null) __obj.updateDynamic("layoutObjectId")(layoutObjectId)
    if (masterObjectId != null) __obj.updateDynamic("masterObjectId")(masterObjectId)
    if (notesPage != null) __obj.updateDynamic("notesPage")(notesPage)
    __obj.asInstanceOf[SlideProperties]
  }
}

