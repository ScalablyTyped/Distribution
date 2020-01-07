package typings.googleapis.buildSrcApisTagmanagerV2Mod.tagmanager_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of reverting a built-in variable in a workspace.
  */
@js.native
trait Schema$RevertBuiltInVariableResponse extends js.Object {
  /**
    * Whether the built-in variable is enabled after reversion.
    */
  var enabled: js.UndefOr[Boolean] = js.native
}

object Schema$RevertBuiltInVariableResponse {
  @scala.inline
  def apply(enabled: js.UndefOr[Boolean] = js.undefined): Schema$RevertBuiltInVariableResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RevertBuiltInVariableResponse]
  }
}

