package typings.googleapis.alertcenterV1beta1Mod.alertcenterV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUserChanges extends StObject {
  
  /**
    * Rule name
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaUserChanges {
  
  inline def apply(): SchemaUserChanges = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserChanges]
  }
  
  extension [Self <: SchemaUserChanges](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
