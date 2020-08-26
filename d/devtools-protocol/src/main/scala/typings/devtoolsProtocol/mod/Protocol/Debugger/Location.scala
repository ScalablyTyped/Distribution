package typings.devtoolsProtocol.mod.Protocol.Debugger

import typings.devtoolsProtocol.mod.Protocol.Runtime.ScriptId
import typings.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Location extends js.Object {
  /**
    * Column number in the script (0-based).
    */
  var columnNumber: js.UndefOr[integer] = js.native
  /**
    * Line number in the script (0-based).
    */
  var lineNumber: integer = js.native
  /**
    * Script identifier as reported in the `Debugger.scriptParsed`.
    */
  var scriptId: ScriptId = js.native
}

object Location {
  @scala.inline
  def apply(lineNumber: integer, scriptId: ScriptId): Location = {
    val __obj = js.Dynamic.literal(lineNumber = lineNumber.asInstanceOf[js.Any], scriptId = scriptId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Location]
  }
  @scala.inline
  implicit class LocationOps[Self <: Location] (val x: Self) extends AnyVal {
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
    def setLineNumber(value: integer): Self = this.set("lineNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setScriptId(value: ScriptId): Self = this.set("scriptId", value.asInstanceOf[js.Any])
    @scala.inline
    def setColumnNumber(value: integer): Self = this.set("columnNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnNumber: Self = this.set("columnNumber", js.undefined)
  }
  
}

