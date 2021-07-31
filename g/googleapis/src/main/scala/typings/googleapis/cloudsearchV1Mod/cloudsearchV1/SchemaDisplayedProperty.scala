package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A reference to a top-level property within the object that should be
  * displayed in search results. The values of the chosen properties will be
  * displayed in the search results along with the dislpay label for that
  * property if one is specified. If a display label is not specified, only the
  * values will be shown.
  */
trait SchemaDisplayedProperty extends StObject {
  
  /**
    * The name of the top-level property as defined in a property definition
    * for the object. If the name is not a defined property in the schema, an
    * error will be given when attempting to update the schema.
    */
  var propertyName: js.UndefOr[String] = js.undefined
}
object SchemaDisplayedProperty {
  
  @scala.inline
  def apply(): SchemaDisplayedProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDisplayedProperty]
  }
  
  @scala.inline
  implicit class SchemaDisplayedPropertyMutableBuilder[Self <: SchemaDisplayedProperty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPropertyName(value: String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyNameUndefined: Self = StObject.set(x, "propertyName", js.undefined)
  }
}
