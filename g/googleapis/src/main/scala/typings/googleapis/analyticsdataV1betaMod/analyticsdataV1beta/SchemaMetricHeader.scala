package typings.googleapis.analyticsdataV1betaMod.analyticsdataV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMetricHeader extends StObject {
  
  /**
    * The metric's name.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The metric's data type.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaMetricHeader {
  
  inline def apply(): SchemaMetricHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetricHeader]
  }
  
  extension [Self <: SchemaMetricHeader](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
