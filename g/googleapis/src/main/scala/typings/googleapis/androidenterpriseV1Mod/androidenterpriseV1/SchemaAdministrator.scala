package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAdministrator extends StObject {
  
  /**
    * The admin's email address.
    */
  var email: js.UndefOr[String | Null] = js.undefined
}
object SchemaAdministrator {
  
  inline def apply(): SchemaAdministrator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdministrator]
  }
  
  extension [Self <: SchemaAdministrator](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailNull: Self = StObject.set(x, "email", null)
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
  }
}
