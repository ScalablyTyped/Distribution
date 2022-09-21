package typings.googleapis.cloudfunctionsV2Mod.cloudfunctionsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListRuntimesResponse extends StObject {
  
  /**
    * The runtimes that match the request.
    */
  var runtimes: js.UndefOr[js.Array[SchemaRuntime]] = js.undefined
}
object SchemaListRuntimesResponse {
  
  inline def apply(): SchemaListRuntimesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListRuntimesResponse]
  }
  
  extension [Self <: SchemaListRuntimesResponse](x: Self) {
    
    inline def setRuntimes(value: js.Array[SchemaRuntime]): Self = StObject.set(x, "runtimes", value.asInstanceOf[js.Any])
    
    inline def setRuntimesUndefined: Self = StObject.set(x, "runtimes", js.undefined)
    
    inline def setRuntimesVarargs(value: SchemaRuntime*): Self = StObject.set(x, "runtimes", js.Array(value*))
  }
}
