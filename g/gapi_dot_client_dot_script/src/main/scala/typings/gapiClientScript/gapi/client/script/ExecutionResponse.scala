package typings.gapiClientScript.gapi.client.script

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecutionResponse extends js.Object {
  /**
    * The return value of the script function. The type matches the object type
    * returned in Apps Script. Functions called through the Execution API cannot
    * return Apps Script-specific objects (such as a `Document` or a `Calendar`);
    * they can only return primitive types such as a `string`, `number`, `array`,
    * `object`, or `boolean`.
    */
  var result: js.UndefOr[js.Any] = js.native
}

object ExecutionResponse {
  @scala.inline
  def apply(): ExecutionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecutionResponse]
  }
  @scala.inline
  implicit class ExecutionResponseOps[Self <: ExecutionResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setResult(value: js.Any): Self = this.set("result", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResult: Self = this.set("result", js.undefined)
  }
  
}

