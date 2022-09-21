package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDisplayedProperty extends StObject {
  
  /**
    * The name of the top-level property as defined in a property definition for the object. If the name is not a defined property in the schema, an error is given when attempting to update the schema.
    */
  var propertyName: js.UndefOr[String | Null] = js.undefined
}
object SchemaDisplayedProperty {
  
  inline def apply(): SchemaDisplayedProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDisplayedProperty]
  }
  
  extension [Self <: SchemaDisplayedProperty](x: Self) {
    
    inline def setPropertyName(value: String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
    
    inline def setPropertyNameNull: Self = StObject.set(x, "propertyName", null)
    
    inline def setPropertyNameUndefined: Self = StObject.set(x, "propertyName", js.undefined)
  }
}
