package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccessPolicy extends js.Object {
  var allowed: js.UndefOr[scala.Boolean] = js.undefined
  var exception: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object AccessPolicy {
  @scala.inline
  def apply(allowed: js.UndefOr[scala.Boolean] = js.undefined, exception: js.Array[java.lang.String] = null): AccessPolicy = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowed)) __obj.updateDynamic("allowed")(allowed)
    if (exception != null) __obj.updateDynamic("exception")(exception)
    __obj.asInstanceOf[AccessPolicy]
  }
}

