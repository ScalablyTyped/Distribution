package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteParagraphBulletsRequest extends js.Object {
  var range: js.UndefOr[Range] = js.undefined
}

object DeleteParagraphBulletsRequest {
  @scala.inline
  def apply(range: Range = null): DeleteParagraphBulletsRequest = {
    val __obj = js.Dynamic.literal()
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[DeleteParagraphBulletsRequest]
  }
}

