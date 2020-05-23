package typings.googleCloudCommon.serviceObjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetConfig extends js.Object {
  /**
    * Create the object if it doesn't already exist.
    */
  var autoCreate: js.UndefOr[Boolean] = js.undefined
}

object GetConfig {
  @scala.inline
  def apply(autoCreate: js.UndefOr[Boolean] = js.undefined): GetConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoCreate)) __obj.updateDynamic("autoCreate")(autoCreate.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConfig]
  }
}

