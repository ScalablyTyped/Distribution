package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEventAnnotation extends StObject {
  
  var `type`: js.UndefOr[Double | Null] = js.undefined
  
  var value: js.UndefOr[String | Null] = js.undefined
}
object SchemaEventAnnotation {
  
  inline def apply(): SchemaEventAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEventAnnotation]
  }
  
  extension [Self <: SchemaEventAnnotation](x: Self) {
    
    inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
