package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A person&#39;s email address.
  */
trait SchemaEmailAddress extends StObject {
  
  /**
    * The email address.
    */
  var emailAddress: js.UndefOr[String] = js.undefined
}
object SchemaEmailAddress {
  
  inline def apply(): SchemaEmailAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEmailAddress]
  }
  
  extension [Self <: SchemaEmailAddress](x: Self) {
    
    inline def setEmailAddress(value: String): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
    
    inline def setEmailAddressUndefined: Self = StObject.set(x, "emailAddress", js.undefined)
  }
}
