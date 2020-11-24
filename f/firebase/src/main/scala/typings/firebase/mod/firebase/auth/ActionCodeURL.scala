package typings.firebase.mod.firebase.auth

import typings.firebase.mod.firebase.auth.ActionCodeInfo.Operation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A utility class to parse email action URLs.
  */
@js.native
trait ActionCodeURL extends js.Object {
  
  /**
    * The API key of the email action link.
    */
  var apiKey: String = js.native
  
  /**
    * The action code of the email action link.
    */
  var code: String = js.native
  
  /**
    * The continue URL of the email action link. Null if not provided.
    */
  var continueUrl: String | Null = js.native
  
  /**
    * The language code of the email action link. Null if not provided.
    */
  var languageCode: String | Null = js.native
  
  /**
    * The action performed by the email action link. It returns from one
    * of the types from {@link firebase.auth.ActionCodeInfo}.
    */
  var operation: Operation = js.native
  
  /**
    * The tenant ID of the email action link. Null if the email action
    * is from the parent project.
    */
  var tenantId: String | Null = js.native
}
object ActionCodeURL {
  
  @scala.inline
  def apply(apiKey: String, code: String, operation: Operation): ActionCodeURL = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionCodeURL]
  }
  
  @scala.inline
  implicit class ActionCodeURLOps[Self <: ActionCodeURL] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApiKey(value: String): Self = this.set("apiKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperation(value: Operation): Self = this.set("operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinueUrl(value: String): Self = this.set("continueUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinueUrlNull: Self = this.set("continueUrl", null)
    
    @scala.inline
    def setLanguageCode(value: String): Self = this.set("languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodeNull: Self = this.set("languageCode", null)
    
    @scala.inline
    def setTenantId(value: String): Self = this.set("tenantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTenantIdNull: Self = this.set("tenantId", null)
  }
}
