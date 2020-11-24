package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecipientViewRequest extends js.Object {
  
  /**
    * A unique identifier of the authentication event executed by the client application.
    */
  var assertionId: js.UndefOr[String] = js.native
  
  /**
    * A sender-generated value that indicates the date and time that the signer was authenticated.
    */
  var authenticationInstant: js.UndefOr[String] = js.native
  
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
  var authenticationMethod: js.UndefOr[String] = js.native
  
  /**
    * A sender-created value. If provided, the recipient is treated as an embedded (captive) recipient or signer.
    *
    * Use your application's client ID (user ID) for the recipient. Doing so enables the details of your application's authentication of
    * the recipient to be connected to the recipient's signature if the signature is disputed or repudiated.
    *
    * Maximum length: 100 characters.
    */
  var clientUserId: js.UndefOr[String] = js.native
  
  /**
    * (Required) Specifies the email of the recipient. You can use either `email` and `userName` or `userId` to identify the recipient.
    */
  var email: js.UndefOr[String] = js.native
  
  /**
    * Only used if `pingUrl` is specified. This is the interval, in seconds, between pings on the `pingUrl`.  The default is `300` seconds. Valid values are 60-1200 seconds.
    */
  var pingFrequency: js.UndefOr[String] = js.native
  
  /**
    * The client URL that the DocuSign Signing experience should ping to indicate to the client that Signing is active. An HTTP GET call is executed against the client.
    * The response from the client is ignored. The intent is for the client to reset its session timer when the request is received.
    */
  var pingUrl: js.UndefOr[String] = js.native
  
  /**
    * A local reference that senders use to map recipients to other objects, such as specific document tabs. Within an envelope, each `recipientId` must be unique,
    * but there is no uniqueness requirement across envelopes. For example, many envelopes assign the first recipient a `recipientId` of `1`.
    */
  var recipientId: js.UndefOr[String] = js.native
  
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
  var returnUrl: js.UndefOr[String] = js.native
  
  /**
    * The domain in which the user authenticated.
    */
  var securityDomain: js.UndefOr[String] = js.native
  
  /**
    * The user ID of the recipient. You can use either the user ID or email and user name to identify the recipient.
    *
    * If `userId` is used and a `clientUserId` is provided, the value in the `userId` property must match a `recipientId` (which you can retrieve with a GET
    * recipients call) for the envelope.
    *
    * If a `userId` is used and a `clientUserId` is not provided, the `userId` must match the user ID of the authenticating user.
    */
  var userId: js.UndefOr[String] = js.native
  
  /**
    * The username of the recipient. You can use either `email` and `userName` or `userId` to identify the recipient.
    */
  var userName: js.UndefOr[String] = js.native
  
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
  var xFrameOptions: js.UndefOr[String] = js.native
  
  /**
    * When the value of `xFrameOptions` is `allow_from`, this property specifies the origin on which the page is allowed to display in a frame.
    * If the value of `xFrameOptions` is `allow_from`, you must include a value for this property.
    */
  var xFrameOptionsAllowFromUrl: js.UndefOr[String] = js.native
}
object RecipientViewRequest {
  
  @scala.inline
  def apply(): RecipientViewRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecipientViewRequest]
  }
  
  @scala.inline
  implicit class RecipientViewRequestOps[Self <: RecipientViewRequest] (val x: Self) extends AnyVal {
    
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
    def setAssertionId(value: String): Self = this.set("assertionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssertionId: Self = this.set("assertionId", js.undefined)
    
    @scala.inline
    def setAuthenticationInstant(value: String): Self = this.set("authenticationInstant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthenticationInstant: Self = this.set("authenticationInstant", js.undefined)
    
    @scala.inline
    def setAuthenticationMethod(value: String): Self = this.set("authenticationMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthenticationMethod: Self = this.set("authenticationMethod", js.undefined)
    
    @scala.inline
    def setClientUserId(value: String): Self = this.set("clientUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientUserId: Self = this.set("clientUserId", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    
    @scala.inline
    def setPingFrequency(value: String): Self = this.set("pingFrequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePingFrequency: Self = this.set("pingFrequency", js.undefined)
    
    @scala.inline
    def setPingUrl(value: String): Self = this.set("pingUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePingUrl: Self = this.set("pingUrl", js.undefined)
    
    @scala.inline
    def setRecipientId(value: String): Self = this.set("recipientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipientId: Self = this.set("recipientId", js.undefined)
    
    @scala.inline
    def setReturnUrl(value: String): Self = this.set("returnUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnUrl: Self = this.set("returnUrl", js.undefined)
    
    @scala.inline
    def setSecurityDomain(value: String): Self = this.set("securityDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityDomain: Self = this.set("securityDomain", js.undefined)
    
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserId: Self = this.set("userId", js.undefined)
    
    @scala.inline
    def setUserName(value: String): Self = this.set("userName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserName: Self = this.set("userName", js.undefined)
    
    @scala.inline
    def setXFrameOptions(value: String): Self = this.set("xFrameOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXFrameOptions: Self = this.set("xFrameOptions", js.undefined)
    
    @scala.inline
    def setXFrameOptionsAllowFromUrl(value: String): Self = this.set("xFrameOptionsAllowFromUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXFrameOptionsAllowFromUrl: Self = this.set("xFrameOptionsAllowFromUrl", js.undefined)
  }
}
