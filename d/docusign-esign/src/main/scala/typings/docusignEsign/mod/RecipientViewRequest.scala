package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecipientViewRequest extends StObject {
  
  /**
    * A unique identifier of the authentication event executed by the client application.
    */
  var assertionId: js.UndefOr[String] = js.undefined
  
  /**
    * A sender-generated value that indicates the date and time that the signer was authenticated.
    */
  var authenticationInstant: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Choose a value that most closely matches the technique your application used to authenticate the recipient / signer.
    *
    * Choose a value from this list:
    * * Biometric
    * * Email
    * * HTTPBasicAuth
    * * Kerberos
    * * KnowledgeBasedAuth
    * * None
    * * PaperDocuments
    * * Password
    * * RSASecureID
    * * SingleSignOn_CASiteminder
    * * SingleSignOn_InfoCard
    * * SingleSignOn_MicrosoftActiveDirectory
    * * SingleSignOn_Other
    * * SingleSignOn_Passport
    * * SingleSignOn_SAML
    * * Smartcard
    * * SSLMutualAuth
    * * X509Certificate
    *
    * This information is included in the Certificate of Completion.
    */
  var authenticationMethod: js.UndefOr[String] = js.undefined
  
  /**
    * A sender-created value. If provided, the recipient is treated as an embedded (captive) recipient or signer.
    *
    * Use your application's client ID (user ID) for the recipient. Doing so enables the details of your application's authentication of
    * the recipient to be connected to the recipient's signature if the signature is disputed or repudiated.
    *
    * Maximum length: 100 characters.
    */
  var clientUserId: js.UndefOr[String] = js.undefined
  
  /**
    * (Required) Specifies the email of the recipient. You can use either `email` and `userName` or `userId` to identify the recipient.
    */
  var email: js.UndefOr[String] = js.undefined
  
  /**
    * Only used if `pingUrl` is specified. This is the interval, in seconds, between pings on the `pingUrl`.  The default is `300` seconds. Valid values are 60-1200 seconds.
    */
  var pingFrequency: js.UndefOr[String] = js.undefined
  
  /**
    * The client URL that the DocuSign Signing experience should ping to indicate to the client that Signing is active. An HTTP GET call is executed against the client.
    * The response from the client is ignored. The intent is for the client to reset its session timer when the request is received.
    */
  var pingUrl: js.UndefOr[String] = js.undefined
  
  /**
    * A local reference that senders use to map recipients to other objects, such as specific document tabs. Within an envelope, each `recipientId` must be unique,
    * but there is no uniqueness requirement across envelopes. For example, many envelopes assign the first recipient a `recipientId` of `1`.
    */
  var recipientId: js.UndefOr[String] = js.undefined
  
  /**
    * (Optional) The URL to which the user should be redirected
    * after the signing session has ended.
    * DocuSign redirects to the URL
    * and includes an `event` query parameter
    * that can be used by your application.
    *
    * Maximum Length: 500 characters. If the `returnUrl` exceeds this limit, the user is redirected to a truncated URL.
    *
    * Possible `event` parameter values include:
    *
    * * `access_code_failed`: Recipient used incorrect access code.
    * * `cancel`: Recipient canceled the signing operation,
    *   possibly by using the **Finish Later** option.
    * * `decline`: Recipient declined to sign.
    * * `exception`: A system error occurred during the signing process.
    * * `fax_pending`: Recipient has a fax pending.
    * * `id_check_failed`: Recipient failed an ID check.
    * * `session_timeout`: The session timed out. An account can control this timeout by using the **Signer Session Timeout** option.
    * * `signing_complete`: The recipient completed the signing ceremony.
    * * `ttl_expired`: The Time To Live token for the envelope has expired.
    *   After being successfully invoked, these tokens expire
    *   after 5 minutes or if the envelope is voided.
    * * `viewing_complete`: The recipient completed viewing an envelope
    *   that is in a read-only/terminal state,
    *   such as completed, declined, or voided.
    *
    * Ensure that you include `https://` in the URL to prevent the redirect from failing on certain browsers.
    *
    */
  var returnUrl: js.UndefOr[String] = js.undefined
  
  /**
    * The domain in which the user authenticated.
    */
  var securityDomain: js.UndefOr[String] = js.undefined
  
  /**
    * The user ID of the recipient. You can use either the user ID or email and user name to identify the recipient.
    *
    * If `userId` is used and a `clientUserId` is provided, the value in the `userId` property must match a `recipientId` (which you can retrieve with a GET
    * recipients call) for the envelope.
    *
    * If a `userId` is used and a `clientUserId` is not provided, the `userId` must match the user ID of the authenticating user.
    */
  var userId: js.UndefOr[String] = js.undefined
  
  /**
    * The username of the recipient. You can use either `email` and `userName` or `userId` to identify the recipient.
    */
  var userName: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether a browser should be allowed to render a page in a frame or IFrame. Setting this property ensures that your content is not embedded into
    * unauthorized pages or frames.
    *
    * Valid values are:
    *
    * - `deny`: The page cannot be displayed in a frame.
    * - `same_origin`: The page can only be displayed in a frame on the same origin as the page itself.
    * - `allow_from`: The page can only be displayed in a frame on the origin specified by the `xFrameOptionsAllowFromUrl` property.
    */
  var xFrameOptions: js.UndefOr[String] = js.undefined
  
  /**
    * When the value of `xFrameOptions` is `allow_from`, this property specifies the origin on which the page is allowed to display in a frame.
    * If the value of `xFrameOptions` is `allow_from`, you must include a value for this property.
    */
  var xFrameOptionsAllowFromUrl: js.UndefOr[String] = js.undefined
}
object RecipientViewRequest {
  
  inline def apply(): RecipientViewRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecipientViewRequest]
  }
  
  extension [Self <: RecipientViewRequest](x: Self) {
    
    inline def setAssertionId(value: String): Self = StObject.set(x, "assertionId", value.asInstanceOf[js.Any])
    
    inline def setAssertionIdUndefined: Self = StObject.set(x, "assertionId", js.undefined)
    
    inline def setAuthenticationInstant(value: String): Self = StObject.set(x, "authenticationInstant", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationInstantUndefined: Self = StObject.set(x, "authenticationInstant", js.undefined)
    
    inline def setAuthenticationMethod(value: String): Self = StObject.set(x, "authenticationMethod", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationMethodUndefined: Self = StObject.set(x, "authenticationMethod", js.undefined)
    
    inline def setClientUserId(value: String): Self = StObject.set(x, "clientUserId", value.asInstanceOf[js.Any])
    
    inline def setClientUserIdUndefined: Self = StObject.set(x, "clientUserId", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setPingFrequency(value: String): Self = StObject.set(x, "pingFrequency", value.asInstanceOf[js.Any])
    
    inline def setPingFrequencyUndefined: Self = StObject.set(x, "pingFrequency", js.undefined)
    
    inline def setPingUrl(value: String): Self = StObject.set(x, "pingUrl", value.asInstanceOf[js.Any])
    
    inline def setPingUrlUndefined: Self = StObject.set(x, "pingUrl", js.undefined)
    
    inline def setRecipientId(value: String): Self = StObject.set(x, "recipientId", value.asInstanceOf[js.Any])
    
    inline def setRecipientIdUndefined: Self = StObject.set(x, "recipientId", js.undefined)
    
    inline def setReturnUrl(value: String): Self = StObject.set(x, "returnUrl", value.asInstanceOf[js.Any])
    
    inline def setReturnUrlUndefined: Self = StObject.set(x, "returnUrl", js.undefined)
    
    inline def setSecurityDomain(value: String): Self = StObject.set(x, "securityDomain", value.asInstanceOf[js.Any])
    
    inline def setSecurityDomainUndefined: Self = StObject.set(x, "securityDomain", js.undefined)
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
    
    inline def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
    
    inline def setUserNameUndefined: Self = StObject.set(x, "userName", js.undefined)
    
    inline def setXFrameOptions(value: String): Self = StObject.set(x, "xFrameOptions", value.asInstanceOf[js.Any])
    
    inline def setXFrameOptionsAllowFromUrl(value: String): Self = StObject.set(x, "xFrameOptionsAllowFromUrl", value.asInstanceOf[js.Any])
    
    inline def setXFrameOptionsAllowFromUrlUndefined: Self = StObject.set(x, "xFrameOptionsAllowFromUrl", js.undefined)
    
    inline def setXFrameOptionsUndefined: Self = StObject.set(x, "xFrameOptions", js.undefined)
  }
}
