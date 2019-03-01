package typings
package gapiDotClientDotToolresultsLib.gapiNs.clientNs.toolresultsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FailureDetail extends js.Object {
  /** If the failure was severe because the system (app) under test crashed. */
  var crashed: js.UndefOr[scala.Boolean] = js.undefined
  /** If an app is not installed and thus no test can be run with the app. This might be caused by trying to run a test on an unsupported platform. */
  var notInstalled: js.UndefOr[scala.Boolean] = js.undefined
  /** If a native process (including any other than the app) crashed. */
  var otherNativeCrash: js.UndefOr[scala.Boolean] = js.undefined
  /** If the test overran some time limit, and that is why it failed. */
  var timedOut: js.UndefOr[scala.Boolean] = js.undefined
  /** If the robo was unable to crawl the app; perhaps because the app did not start. */
  var unableToCrawl: js.UndefOr[scala.Boolean] = js.undefined
}

object FailureDetail {
  @scala.inline
  def apply(
    crashed: js.UndefOr[scala.Boolean] = js.undefined,
    notInstalled: js.UndefOr[scala.Boolean] = js.undefined,
    otherNativeCrash: js.UndefOr[scala.Boolean] = js.undefined,
    timedOut: js.UndefOr[scala.Boolean] = js.undefined,
    unableToCrawl: js.UndefOr[scala.Boolean] = js.undefined
  ): FailureDetail = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(crashed)) __obj.updateDynamic("crashed")(crashed)
    if (!js.isUndefined(notInstalled)) __obj.updateDynamic("notInstalled")(notInstalled)
    if (!js.isUndefined(otherNativeCrash)) __obj.updateDynamic("otherNativeCrash")(otherNativeCrash)
    if (!js.isUndefined(timedOut)) __obj.updateDynamic("timedOut")(timedOut)
    if (!js.isUndefined(unableToCrawl)) __obj.updateDynamic("unableToCrawl")(unableToCrawl)
    __obj.asInstanceOf[FailureDetail]
  }
}

