package typings.googleapis.analyticsdataV1alphaMod.analyticsdataV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDimensionHeader extends StObject {
  
  /**
    * The dimension's name.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaDimensionHeader {
  
  inline def apply(): SchemaDimensionHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDimensionHeader]
  }
  
  extension [Self <: SchemaDimensionHeader](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
