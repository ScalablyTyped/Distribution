package typings.googleapis.buildSrcApisTagmanagerV2Mod.tagmanager_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$CreateBuiltInVariableResponse extends js.Object {
  /**
    * List of created built-in variables.
    */
  var builtInVariable: js.UndefOr[js.Array[Schema$BuiltInVariable]] = js.native
}

object Schema$CreateBuiltInVariableResponse {
  @scala.inline
  def apply(builtInVariable: js.Array[Schema$BuiltInVariable] = null): Schema$CreateBuiltInVariableResponse = {
    val __obj = js.Dynamic.literal()
    if (builtInVariable != null) __obj.updateDynamic("builtInVariable")(builtInVariable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CreateBuiltInVariableResponse]
  }
}

