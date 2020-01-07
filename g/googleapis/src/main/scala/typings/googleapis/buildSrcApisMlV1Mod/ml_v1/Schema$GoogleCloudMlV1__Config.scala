package typings.googleapis.buildSrcApisMlV1Mod.ml_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$GoogleCloudMlV1__Config extends js.Object {
  /**
    * The service account Cloud ML uses to run on TPU node.
    */
  var tpuServiceAccount: js.UndefOr[String] = js.native
}

object Schema$GoogleCloudMlV1__Config {
  @scala.inline
  def apply(tpuServiceAccount: String = null): Schema$GoogleCloudMlV1__Config = {
    val __obj = js.Dynamic.literal()
    if (tpuServiceAccount != null) __obj.updateDynamic("tpuServiceAccount")(tpuServiceAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudMlV1__Config]
  }
}

