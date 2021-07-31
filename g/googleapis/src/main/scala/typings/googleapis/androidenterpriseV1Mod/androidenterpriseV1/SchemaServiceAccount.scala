package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A service account identity, including the name and credentials that can be
  * used to authenticate as the service account.
  */
trait SchemaServiceAccount extends StObject {
  
  /**
    * Credentials that can be used to authenticate as this ServiceAccount.
    */
  var key: js.UndefOr[SchemaServiceAccountKey] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#serviceAccount&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The account name of the service account, in the form of an email address.
    * Assigned by the server.
    */
  var name: js.UndefOr[String] = js.undefined
}
object SchemaServiceAccount {
  
  @scala.inline
  def apply(): SchemaServiceAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServiceAccount]
  }
  
  @scala.inline
  implicit class SchemaServiceAccountMutableBuilder[Self <: SchemaServiceAccount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: SchemaServiceAccountKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
