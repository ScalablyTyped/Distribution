package typings.gapiDotClientDotToolresults.gapiNs.clientNs.toolresultsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkippedDetail extends js.Object {
  /** If the App doesn't support the specific API level. */
  var incompatibleAppVersion: js.UndefOr[Boolean] = js.undefined
  /** If the App doesn't run on the specific architecture, for example, x86. */
  var incompatibleArchitecture: js.UndefOr[Boolean] = js.undefined
  /** If the requested OS version doesn't run on the specific device model. */
  var incompatibleDevice: js.UndefOr[Boolean] = js.undefined
}

object SkippedDetail {
  @scala.inline
  def apply(
    incompatibleAppVersion: js.UndefOr[Boolean] = js.undefined,
    incompatibleArchitecture: js.UndefOr[Boolean] = js.undefined,
    incompatibleDevice: js.UndefOr[Boolean] = js.undefined
  ): SkippedDetail = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(incompatibleAppVersion)) __obj.updateDynamic("incompatibleAppVersion")(incompatibleAppVersion)
    if (!js.isUndefined(incompatibleArchitecture)) __obj.updateDynamic("incompatibleArchitecture")(incompatibleArchitecture)
    if (!js.isUndefined(incompatibleDevice)) __obj.updateDynamic("incompatibleDevice")(incompatibleDevice)
    __obj.asInstanceOf[SkippedDetail]
  }
}

