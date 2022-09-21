package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaArimaOrder extends StObject {
  
  /**
    * Order of the differencing part.
    */
  var d: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Order of the autoregressive part.
    */
  var p: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Order of the moving-average part.
    */
  var q: js.UndefOr[String | Null] = js.undefined
}
object SchemaArimaOrder {
  
  inline def apply(): SchemaArimaOrder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaArimaOrder]
  }
  
  extension [Self <: SchemaArimaOrder](x: Self) {
    
    inline def setD(value: String): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setDNull: Self = StObject.set(x, "d", null)
    
    inline def setDUndefined: Self = StObject.set(x, "d", js.undefined)
    
    inline def setP(value: String): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
    
    inline def setPNull: Self = StObject.set(x, "p", null)
    
    inline def setPUndefined: Self = StObject.set(x, "p", js.undefined)
    
    inline def setQ(value: String): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
    
    inline def setQNull: Self = StObject.set(x, "q", null)
    
    inline def setQUndefined: Self = StObject.set(x, "q", js.undefined)
  }
}
