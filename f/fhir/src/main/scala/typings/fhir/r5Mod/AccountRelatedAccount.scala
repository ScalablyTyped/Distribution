package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountRelatedAccount
  extends StObject
     with BackboneElement {
  
  /**
    * Reference to an associated Account.
    */
  var account: Reference
  
  /**
    * Relationship of the associated Account.
    */
  var relationship: js.UndefOr[CodeableConcept] = js.undefined
}
object AccountRelatedAccount {
  
  inline def apply(account: Reference): AccountRelatedAccount = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountRelatedAccount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccountRelatedAccount] (val x: Self) extends AnyVal {
    
    inline def setAccount(value: Reference): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setRelationship(value: CodeableConcept): Self = StObject.set(x, "relationship", value.asInstanceOf[js.Any])
    
    inline def setRelationshipUndefined: Self = StObject.set(x, "relationship", js.undefined)
  }
}
