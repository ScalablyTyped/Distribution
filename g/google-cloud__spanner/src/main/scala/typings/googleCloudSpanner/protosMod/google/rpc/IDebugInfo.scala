package typings.googleCloudSpanner.protosMod.google.rpc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a DebugInfo. */
trait IDebugInfo extends StObject {
  
  /** DebugInfo detail */
  var detail: js.UndefOr[String | Null] = js.undefined
  
  /** DebugInfo stackEntries */
  var stackEntries: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object IDebugInfo {
  
  inline def apply(): IDebugInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDebugInfo]
  }
  
  extension [Self <: IDebugInfo](x: Self) {
    
    inline def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDetailNull: Self = StObject.set(x, "detail", null)
    
    inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    inline def setStackEntries(value: js.Array[String]): Self = StObject.set(x, "stackEntries", value.asInstanceOf[js.Any])
    
    inline def setStackEntriesNull: Self = StObject.set(x, "stackEntries", null)
    
    inline def setStackEntriesUndefined: Self = StObject.set(x, "stackEntries", js.undefined)
    
    inline def setStackEntriesVarargs(value: String*): Self = StObject.set(x, "stackEntries", js.Array(value*))
  }
}
