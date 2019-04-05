package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateParagraphBulletsRequest extends js.Object {
  var bulletPreset: js.UndefOr[java.lang.String] = js.undefined
  var range: js.UndefOr[Range] = js.undefined
}

object CreateParagraphBulletsRequest {
  @scala.inline
  def apply(bulletPreset: java.lang.String = null, range: Range = null): CreateParagraphBulletsRequest = {
    val __obj = js.Dynamic.literal()
    if (bulletPreset != null) __obj.updateDynamic("bulletPreset")(bulletPreset)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[CreateParagraphBulletsRequest]
  }
}

