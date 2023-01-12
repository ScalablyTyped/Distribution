package typings.devtoolsProtocol.mod.Protocol.Debugger

import typings.devtoolsProtocol.mod.Protocol.Runtime.ScriptId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationRange extends StObject {
  
  var end: ScriptPosition
  
  var scriptId: ScriptId
  
  var start: ScriptPosition
}
object LocationRange {
  
  inline def apply(end: ScriptPosition, scriptId: ScriptId, start: ScriptPosition): LocationRange = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], scriptId = scriptId.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationRange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LocationRange] (val x: Self) extends AnyVal {
    
    inline def setEnd(value: ScriptPosition): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setScriptId(value: ScriptId): Self = StObject.set(x, "scriptId", value.asInstanceOf[js.Any])
    
    inline def setStart(value: ScriptPosition): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
