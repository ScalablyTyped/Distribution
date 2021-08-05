package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This represents an enterprise admin who can manage the enterprise in the
  * managed Google Play store.
  */
trait SchemaAdministrator extends StObject {
  
  /**
    * The admin&#39;s email address.
    */
  var email: js.UndefOr[String] = js.undefined
}
object SchemaAdministrator {
  
  inline def apply(): SchemaAdministrator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdministrator]
  }
  
  extension [Self <: SchemaAdministrator](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
  }
}
