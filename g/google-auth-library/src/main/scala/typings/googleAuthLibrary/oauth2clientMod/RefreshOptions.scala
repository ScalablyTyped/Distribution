package typings.googleAuthLibrary.oauth2clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefreshOptions extends js.Object {
  var eagerRefreshThresholdMillis: js.UndefOr[Double] = js.undefined
  var forceRefreshOnFailure: js.UndefOr[Boolean] = js.undefined
}

object RefreshOptions {
  @scala.inline
  def apply(
    eagerRefreshThresholdMillis: Int | Double = null,
    forceRefreshOnFailure: js.UndefOr[Boolean] = js.undefined
  ): RefreshOptions = {
    val __obj = js.Dynamic.literal()
    if (eagerRefreshThresholdMillis != null) __obj.updateDynamic("eagerRefreshThresholdMillis")(eagerRefreshThresholdMillis.asInstanceOf[js.Any])
    if (!js.isUndefined(forceRefreshOnFailure)) __obj.updateDynamic("forceRefreshOnFailure")(forceRefreshOnFailure.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshOptions]
  }
}

