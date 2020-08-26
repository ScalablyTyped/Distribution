package typings.devtoolsProtocol.mod.Protocol.Debugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnableRequest extends js.Object {
  /**
    * The maximum size in bytes of collected scripts (not referenced by other heap objects)
    * the debugger can hold. Puts no limit if paramter is omitted.
    */
  var maxScriptsCacheSize: js.UndefOr[Double] = js.native
}

object EnableRequest {
  @scala.inline
  def apply(): EnableRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnableRequest]
  }
  @scala.inline
  implicit class EnableRequestOps[Self <: EnableRequest] (val x: Self) extends AnyVal {
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
    def setMaxScriptsCacheSize(value: Double): Self = this.set("maxScriptsCacheSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxScriptsCacheSize: Self = this.set("maxScriptsCacheSize", js.undefined)
  }
  
}

