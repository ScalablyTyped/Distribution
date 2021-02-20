package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A person&#39;s email address.
  */
@js.native
trait SchemaEmailAddress extends StObject {
  
  /**
    * The email address.
    */
  var emailAddress: js.UndefOr[String] = js.native
}
object SchemaEmailAddress {
  
  @scala.inline
  def apply(): SchemaEmailAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEmailAddress]
  }
  
  @scala.inline
  implicit class SchemaEmailAddressMutableBuilder[Self <: SchemaEmailAddress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmailAddress(value: String): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailAddressUndefined: Self = StObject.set(x, "emailAddress", js.undefined)
  }
}
