package typings.googleapis.analyticsdataV1betaMod.analyticsdataV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCaseExpression extends StObject {
  
  /**
    * Name of a dimension. The name must refer back to a name in dimensions field of the request.
    */
  var dimensionName: js.UndefOr[String | Null] = js.undefined
}
object SchemaCaseExpression {
  
  inline def apply(): SchemaCaseExpression = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCaseExpression]
  }
  
  extension [Self <: SchemaCaseExpression](x: Self) {
    
    inline def setDimensionName(value: String): Self = StObject.set(x, "dimensionName", value.asInstanceOf[js.Any])
    
    inline def setDimensionNameNull: Self = StObject.set(x, "dimensionName", null)
    
    inline def setDimensionNameUndefined: Self = StObject.set(x, "dimensionName", js.undefined)
  }
}
