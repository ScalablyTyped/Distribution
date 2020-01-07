package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * State family configuration.
  */
@js.native
trait Schema$StateFamilyConfig extends js.Object {
  /**
    * If true, this family corresponds to a read operation.
    */
  var isRead: js.UndefOr[Boolean] = js.native
  /**
    * The state family value.
    */
  var stateFamily: js.UndefOr[String] = js.native
}

object Schema$StateFamilyConfig {
  @scala.inline
  def apply(isRead: js.UndefOr[Boolean] = js.undefined, stateFamily: String = null): Schema$StateFamilyConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isRead)) __obj.updateDynamic("isRead")(isRead.asInstanceOf[js.Any])
    if (stateFamily != null) __obj.updateDynamic("stateFamily")(stateFamily.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$StateFamilyConfig]
  }
}

