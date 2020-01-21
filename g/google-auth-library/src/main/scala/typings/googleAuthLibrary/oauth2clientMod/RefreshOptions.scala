package typings.googleAuthLibrary.oauth2clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefreshOptions extends js.Object {
  var eagerRefreshThresholdMillis: js.UndefOr[Double] = js.undefined
}

object RefreshOptions {
  @scala.inline
  def apply(eagerRefreshThresholdMillis: Int | Double = null): RefreshOptions = {
    val __obj = js.Dynamic.literal()
    if (eagerRefreshThresholdMillis != null) __obj.updateDynamic("eagerRefreshThresholdMillis")(eagerRefreshThresholdMillis.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshOptions]
  }
}

