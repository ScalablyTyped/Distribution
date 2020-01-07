package typings.googleapis.buildSrcApisToolresultsV1beta3Mod.toolresults_v1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$SkippedDetail extends js.Object {
  /**
    * If the App doesn&#39;t support the specific API level.
    */
  var incompatibleAppVersion: js.UndefOr[Boolean] = js.native
  /**
    * If the App doesn&#39;t run on the specific architecture, for example,
    * x86.
    */
  var incompatibleArchitecture: js.UndefOr[Boolean] = js.native
  /**
    * If the requested OS version doesn&#39;t run on the specific device model.
    */
  var incompatibleDevice: js.UndefOr[Boolean] = js.native
}

object Schema$SkippedDetail {
  @scala.inline
  def apply(
    incompatibleAppVersion: js.UndefOr[Boolean] = js.undefined,
    incompatibleArchitecture: js.UndefOr[Boolean] = js.undefined,
    incompatibleDevice: js.UndefOr[Boolean] = js.undefined
  ): Schema$SkippedDetail = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(incompatibleAppVersion)) __obj.updateDynamic("incompatibleAppVersion")(incompatibleAppVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(incompatibleArchitecture)) __obj.updateDynamic("incompatibleArchitecture")(incompatibleArchitecture.asInstanceOf[js.Any])
    if (!js.isUndefined(incompatibleDevice)) __obj.updateDynamic("incompatibleDevice")(incompatibleDevice.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SkippedDetail]
  }
}

