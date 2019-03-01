package typings
package fmDashWebsyncLib.fmNs.websyncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait disconnectConfig extends baseRequestConfig {
  /**
    * The callback to invoke after onSuccess or onFailure. See disconnectCompleteArgs for callback argument details.
    */
  var onComplete: js.UndefOr[js.Function1[/* args */ baseResponseArgs, scala.Unit]] = js.undefined
  /**
    * The callback to invoke if the disconnect fails. See disconnectFailureArgs for callback argument details.
    */
  var onFailure: js.UndefOr[js.Function1[/* args */ baseFailureArgs, scala.Unit]] = js.undefined
  /**
    * The callback to invoke if the disconnect succeeds. See disconnectSuccessArgs for callback argument details.
    */
  var onSuccess: js.UndefOr[js.Function1[/* args */ baseResponseArgs, scala.Unit]] = js.undefined
}

object disconnectConfig {
  @scala.inline
  def apply(
    meta: js.Any = null,
    onComplete: js.Function1[/* args */ baseResponseArgs, scala.Unit] = null,
    onFailure: js.Function1[/* args */ baseFailureArgs, scala.Unit] = null,
    onSuccess: js.Function1[/* args */ baseResponseArgs, scala.Unit] = null,
    requestUrl: java.lang.String = null,
    suppressErrors: js.UndefOr[scala.Boolean] = js.undefined,
    sync: js.UndefOr[scala.Boolean] = js.undefined
  ): disconnectConfig = {
    val __obj = js.Dynamic.literal()
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (onComplete != null) __obj.updateDynamic("onComplete")(onComplete)
    if (onFailure != null) __obj.updateDynamic("onFailure")(onFailure)
    if (onSuccess != null) __obj.updateDynamic("onSuccess")(onSuccess)
    if (requestUrl != null) __obj.updateDynamic("requestUrl")(requestUrl)
    if (!js.isUndefined(suppressErrors)) __obj.updateDynamic("suppressErrors")(suppressErrors)
    if (!js.isUndefined(sync)) __obj.updateDynamic("sync")(sync)
    __obj.asInstanceOf[disconnectConfig]
  }
}

