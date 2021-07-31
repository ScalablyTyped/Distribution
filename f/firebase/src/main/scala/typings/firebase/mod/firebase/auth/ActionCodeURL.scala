package typings.firebase.mod.firebase.auth

import typings.firebase.mod.firebase.auth.ActionCodeInfo.Operation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A utility class to parse email action URLs.
  */
trait ActionCodeURL extends StObject {
  
  /**
    * The API key of the email action link.
    */
  var apiKey: String
  
  /**
    * The action code of the email action link.
    */
  var code: String
  
  /**
    * The continue URL of the email action link. Null if not provided.
    */
  var continueUrl: String | Null
  
  /**
    * The language code of the email action link. Null if not provided.
    */
  var languageCode: String | Null
  
  /**
    * The action performed by the email action link. It returns from one
    * of the types from {@link firebase.auth.ActionCodeInfo}.
    */
  var operation: Operation
  
  /**
    * The tenant ID of the email action link. Null if the email action
    * is from the parent project.
    */
  var tenantId: String | Null
}
object ActionCodeURL {
  
  @scala.inline
  def apply(apiKey: String, code: String, operation: Operation): ActionCodeURL = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], continueUrl = null, languageCode = null, tenantId = null)
    __obj.asInstanceOf[ActionCodeURL]
  }
  
  @scala.inline
  implicit class ActionCodeURLMutableBuilder[Self <: ActionCodeURL] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinueUrl(value: String): Self = StObject.set(x, "continueUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinueUrlNull: Self = StObject.set(x, "continueUrl", null)
    
    @scala.inline
    def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodeNull: Self = StObject.set(x, "languageCode", null)
    
    @scala.inline
    def setOperation(value: Operation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTenantIdNull: Self = StObject.set(x, "tenantId", null)
  }
}
