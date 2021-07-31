package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A service account that can be used to authenticate as the enterprise to API
  * calls that require such authentication.
  */
trait SchemaEnterpriseAccount extends StObject {
  
  /**
    * The email address of the service account.
    */
  var accountEmail: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#enterpriseAccount&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
}
object SchemaEnterpriseAccount {
  
  @scala.inline
  def apply(): SchemaEnterpriseAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEnterpriseAccount]
  }
  
  @scala.inline
  implicit class SchemaEnterpriseAccountMutableBuilder[Self <: SchemaEnterpriseAccount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountEmail(value: String): Self = StObject.set(x, "accountEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountEmailUndefined: Self = StObject.set(x, "accountEmail", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
