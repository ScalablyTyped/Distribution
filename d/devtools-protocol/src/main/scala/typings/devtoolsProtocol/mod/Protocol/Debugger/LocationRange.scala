package typings.devtoolsProtocol.mod.Protocol.Debugger

import typings.devtoolsProtocol.mod.Protocol.Runtime.ScriptId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationRange extends StObject {
  
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
  implicit class LocationRangeMutableBuilder[Self <: LocationRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: ScriptPosition): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptId(value: ScriptId): Self = StObject.set(x, "scriptId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: ScriptPosition): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
