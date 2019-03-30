package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileIndexableText extends js.Object {
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object FileIndexableText {
  @scala.inline
  def apply(text: java.lang.String = null): FileIndexableText = {
    val __obj = js.Dynamic.literal()
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[FileIndexableText]
  }
}

