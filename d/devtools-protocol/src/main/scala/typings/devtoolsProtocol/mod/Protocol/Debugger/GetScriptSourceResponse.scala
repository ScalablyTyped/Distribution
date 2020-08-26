package typings.devtoolsProtocol.mod.Protocol.Debugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetScriptSourceResponse extends js.Object {
  /**
    * Wasm bytecode.
    */
  var bytecode: js.UndefOr[String] = js.native
  /**
    * Script source (empty in case of Wasm bytecode).
    */
  var scriptSource: String = js.native
}

object GetScriptSourceResponse {
  @scala.inline
  def apply(scriptSource: String): GetScriptSourceResponse = {
    val __obj = js.Dynamic.literal(scriptSource = scriptSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetScriptSourceResponse]
  }
  @scala.inline
  implicit class GetScriptSourceResponseOps[Self <: GetScriptSourceResponse] (val x: Self) extends AnyVal {
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
    def setScriptSource(value: String): Self = this.set("scriptSource", value.asInstanceOf[js.Any])
    @scala.inline
    def setBytecode(value: String): Self = this.set("bytecode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBytecode: Self = this.set("bytecode", js.undefined)
  }
  
}

