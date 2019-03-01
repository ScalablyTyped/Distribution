package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlideProperties extends js.Object {
  // The object ID of the layout that this slide is based on. This property is
  // read-only.
  var layout_object_id: java.lang.String
  // The object ID of the master that this slide is based on. This property is
  // read-only.
  var master_object_id: java.lang.String
  // The notes page that this slide is associated with. It defines the visual
  // appearance of a notes page when printing or exporting slides with speaker
  // notes. A notes page inherits properties from the notes master.
  // The placeholder shape with type BODY on the notes page contains the speaker
  // notes for this slide. The ID of this shape is identified by the speakerNotesObjectId field.
  // The notes page is read-only except for the text content and styles of the
  // speaker notes shape. This property is read-only.
  var notes_page: Page
}

object SlideProperties {
  @scala.inline
  def apply(layout_object_id: java.lang.String, master_object_id: java.lang.String, notes_page: Page): SlideProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("layout_object_id")(layout_object_id)
    __obj.updateDynamic("master_object_id")(master_object_id)
    __obj.updateDynamic("notes_page")(notes_page)
    __obj.asInstanceOf[SlideProperties]
  }
}

