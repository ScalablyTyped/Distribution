package typings.googleapis.buildSrcApisTagmanagerV2Mod.tagmanager_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of reverting a variable in a workspace.
  */
@js.native
trait Schema$RevertVariableResponse extends js.Object {
  /**
    * Variable as it appears in the latest container version since the last
    * workspace synchronization operation. If no variable is present, that
    * means the variable was deleted in the latest container version.
    */
  var variable: js.UndefOr[Schema$Variable] = js.native
}

object Schema$RevertVariableResponse {
  @scala.inline
  def apply(variable: Schema$Variable = null): Schema$RevertVariableResponse = {
    val __obj = js.Dynamic.literal()
    if (variable != null) __obj.updateDynamic("variable")(variable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RevertVariableResponse]
  }
}

