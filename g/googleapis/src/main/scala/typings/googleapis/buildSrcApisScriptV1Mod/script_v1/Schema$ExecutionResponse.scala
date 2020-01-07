package typings.googleapis.buildSrcApisScriptV1Mod.script_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object that provides the return value of a function executed using the
  * Apps Script API. If the script function returns successfully, the response
  * body&#39;s response field contains this `ExecutionResponse` object.
  */
@js.native
trait Schema$ExecutionResponse extends js.Object {
  /**
    * The return value of the script function. The type matches the object type
    * returned in Apps Script. Functions called using the Apps Script API
    * cannot return Apps Script-specific objects (such as a `Document` or a
    * `Calendar`); they can only return primitive types such as a `string`,
    * `number`, `array`, `object`, or `boolean`.
    */
  var result: js.UndefOr[js.Any] = js.native
}

object Schema$ExecutionResponse {
  @scala.inline
  def apply(result: js.Any = null): Schema$ExecutionResponse = {
    val __obj = js.Dynamic.literal()
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ExecutionResponse]
  }
}

