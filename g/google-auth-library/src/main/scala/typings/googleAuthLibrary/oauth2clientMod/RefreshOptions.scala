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
    eagerRefreshThresholdMillis: js.UndefOr[Double] = js.undefined,
    forceRefreshOnFailure: js.UndefOr[Boolean] = js.undefined
  ): RefreshOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(eagerRefreshThresholdMillis)) __obj.updateDynamic("eagerRefreshThresholdMillis")(eagerRefreshThresholdMillis.get.asInstanceOf[js.Any])
    if (!js.isUndefined(forceRefreshOnFailure)) __obj.updateDynamic("forceRefreshOnFailure")(forceRefreshOnFailure.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshOptions]
  }
}

