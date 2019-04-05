package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotesProperties extends js.Object {
  var speakerNotesObjectId: js.UndefOr[java.lang.String] = js.undefined
}

object NotesProperties {
  @scala.inline
  def apply(speakerNotesObjectId: java.lang.String = null): NotesProperties = {
    val __obj = js.Dynamic.literal()
    if (speakerNotesObjectId != null) __obj.updateDynamic("speakerNotesObjectId")(speakerNotesObjectId)
    __obj.asInstanceOf[NotesProperties]
  }
}

