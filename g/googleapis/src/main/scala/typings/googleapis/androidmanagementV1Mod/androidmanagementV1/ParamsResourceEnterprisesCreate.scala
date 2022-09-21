package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceEnterprisesCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Whether the enterprise admin has seen and agreed to the managed Google Play Agreement (https://www.android.com/enterprise/terms/). Do not set this field for any customer-managed enterprise (https://developers.google.com/android/management/create-enterprise#customer-managed_enterprises). Set this to field to true for all EMM-managed enterprises (https://developers.google.com/android/management/create-enterprise#emm-managed_enterprises).
    */
  var agreementAccepted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The enterprise token appended to the callback URL. Set this when creating a customer-managed enterprise (https://developers.google.com/android/management/create-enterprise#customer-managed_enterprises) and not when creating a deprecated EMM-managed enterprise (https://developers.google.com/android/management/create-enterprise#emm-managed_enterprises).
    */
  var enterpriseToken: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the Google Cloud Platform project which will own the enterprise.
    */
  var projectId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaEnterprise] = js.undefined
  
  /**
    * The name of the SignupUrl used to sign up for the enterprise. Set this when creating a customer-managed enterprise (https://developers.google.com/android/management/create-enterprise#customer-managed_enterprises) and not when creating a deprecated EMM-managed enterprise (https://developers.google.com/android/management/create-enterprise#emm-managed_enterprises).
    */
  var signupUrlName: js.UndefOr[String] = js.undefined
}
object ParamsResourceEnterprisesCreate {
  
  inline def apply(): ParamsResourceEnterprisesCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceEnterprisesCreate]
  }
  
  extension [Self <: ParamsResourceEnterprisesCreate](x: Self) {
    
    inline def setAgreementAccepted(value: Boolean): Self = StObject.set(x, "agreementAccepted", value.asInstanceOf[js.Any])
    
    inline def setAgreementAcceptedUndefined: Self = StObject.set(x, "agreementAccepted", js.undefined)
    
    inline def setEnterpriseToken(value: String): Self = StObject.set(x, "enterpriseToken", value.asInstanceOf[js.Any])
    
    inline def setEnterpriseTokenUndefined: Self = StObject.set(x, "enterpriseToken", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setRequestBody(value: SchemaEnterprise): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setSignupUrlName(value: String): Self = StObject.set(x, "signupUrlName", value.asInstanceOf[js.Any])
    
    inline def setSignupUrlNameUndefined: Self = StObject.set(x, "signupUrlName", js.undefined)
  }
}
