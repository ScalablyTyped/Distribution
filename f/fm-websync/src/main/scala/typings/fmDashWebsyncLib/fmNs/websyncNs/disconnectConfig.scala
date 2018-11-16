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

