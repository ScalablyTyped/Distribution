package typings.googleapis.alertcenterV1beta1Mod.alertcenterV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaStateSponsoredAttack extends StObject {
  
  /**
    * The email of the user this incident was created for.
    */
  var email: js.UndefOr[String | Null] = js.undefined
}
object SchemaStateSponsoredAttack {
  
  inline def apply(): SchemaStateSponsoredAttack = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStateSponsoredAttack]
  }
  
  extension [Self <: SchemaStateSponsoredAttack](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailNull: Self = StObject.set(x, "email", null)
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
  }
}
