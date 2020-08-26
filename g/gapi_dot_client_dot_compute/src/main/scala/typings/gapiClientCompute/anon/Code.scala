package typings.gapiClientCompute.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Code extends js.Object {
  /** [Output Only] A warning code, if applicable. For example, Compute Engine returns NO_RESULTS_ON_PAGE if there are no results in the response. */
  var code: js.UndefOr[String] = js.native
  /**
    * [Output Only] Metadata about this warning in key: value format. For example:
    * "data": [ { "key": "scope", "value": "zones/us-east1-d" }
    */
  var data: js.UndefOr[js.Array[Key]] = js.native
  /** [Output Only] A human-readable description of the warning code. */
  var message: js.UndefOr[String] = js.native
}

object Code {
  @scala.inline
  def apply(): Code = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Code]
  }
  @scala.inline
  implicit class CodeOps[Self <: Code] (val x: Self) extends AnyVal {
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
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    @scala.inline
    def setDataVarargs(value: Key*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[Key]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
  }
  
}

