package typings
package googleDashAuthDashLibraryLib.buildSrcAuthOauth2clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefreshOptions extends js.Object {
  var eagerRefreshThresholdMillis: js.UndefOr[scala.Double] = js.undefined
}

object RefreshOptions {
  @scala.inline
  def apply(eagerRefreshThresholdMillis: scala.Int | scala.Double = null): RefreshOptions = {
    val __obj = js.Dynamic.literal()
    if (eagerRefreshThresholdMillis != null) __obj.updateDynamic("eagerRefreshThresholdMillis")(eagerRefreshThresholdMillis.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshOptions]
  }
}

