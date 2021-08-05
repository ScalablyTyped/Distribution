package typings.googleapis.clouddebuggerV2Mod.clouddebuggerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response for listing debuggees.
  */
trait SchemaListDebuggeesResponse extends StObject {
  
  /**
    * List of debuggees accessible to the calling user. The fields
    * `debuggee.id` and `description` are guaranteed to be set. The
    * `description` field is a human readable field provided by agents and can
    * be displayed to users.
    */
  var debuggees: js.UndefOr[js.Array[SchemaDebuggee]] = js.undefined
}
object SchemaListDebuggeesResponse {
  
  inline def apply(): SchemaListDebuggeesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListDebuggeesResponse]
  }
  
  extension [Self <: SchemaListDebuggeesResponse](x: Self) {
    
    inline def setDebuggees(value: js.Array[SchemaDebuggee]): Self = StObject.set(x, "debuggees", value.asInstanceOf[js.Any])
    
    inline def setDebuggeesUndefined: Self = StObject.set(x, "debuggees", js.undefined)
    
    inline def setDebuggeesVarargs(value: SchemaDebuggee*): Self = StObject.set(x, "debuggees", js.Array(value :_*))
  }
}
