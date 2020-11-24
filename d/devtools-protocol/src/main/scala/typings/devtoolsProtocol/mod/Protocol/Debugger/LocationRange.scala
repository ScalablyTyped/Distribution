package typings.devtoolsProtocol.mod.Protocol.Debugger

import typings.devtoolsProtocol.mod.Protocol.Runtime.ScriptId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationRange extends js.Object {
  
  var end: ScriptPosition = js.native
  
  var scriptId: ScriptId = js.native
  
  var start: ScriptPosition = js.native
}
object LocationRange {
  
  @scala.inline
  def apply(end: ScriptPosition, scriptId: ScriptId, start: ScriptPosition): LocationRange = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], scriptId = scriptId.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationRange]
  }
  
  @scala.inline
  implicit class LocationRangeOps[Self <: LocationRange] (val x: Self) extends AnyVal {
    
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
    def setEnd(value: ScriptPosition): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptId(value: ScriptId): Self = this.set("scriptId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: ScriptPosition): Self = this.set("start", value.asInstanceOf[js.Any])
  }
}
