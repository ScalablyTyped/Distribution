package typings.fbt.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FbtRuntimeCallInput extends StObject {
  
  var args: js.UndefOr[Any] = js.undefined
  
  var options: js.UndefOr[Any] = js.undefined
  
  var table: Any
}
object FbtRuntimeCallInput {
  
  inline def apply(table: Any): FbtRuntimeCallInput = {
    val __obj = js.Dynamic.literal(table = table.asInstanceOf[js.Any])
    __obj.asInstanceOf[FbtRuntimeCallInput]
  }
  
  extension [Self <: FbtRuntimeCallInput](x: Self) {
    
    inline def setArgs(value: Any): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setTable(value: Any): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
  }
}
