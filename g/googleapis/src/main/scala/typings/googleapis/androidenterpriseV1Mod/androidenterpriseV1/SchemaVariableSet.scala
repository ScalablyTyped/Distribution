package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVariableSet extends StObject {
  
  /**
    * The placeholder string; defined by EMM.
    */
  var placeholder: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The value of the placeholder, specific to the user.
    */
  var userValue: js.UndefOr[String | Null] = js.undefined
}
object SchemaVariableSet {
  
  inline def apply(): SchemaVariableSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVariableSet]
  }
  
  extension [Self <: SchemaVariableSet](x: Self) {
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderNull: Self = StObject.set(x, "placeholder", null)
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setUserValue(value: String): Self = StObject.set(x, "userValue", value.asInstanceOf[js.Any])
    
    inline def setUserValueNull: Self = StObject.set(x, "userValue", null)
    
    inline def setUserValueUndefined: Self = StObject.set(x, "userValue", js.undefined)
  }
}
