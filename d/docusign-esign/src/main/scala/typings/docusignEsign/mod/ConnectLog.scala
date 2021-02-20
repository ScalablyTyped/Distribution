package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectLog extends StObject {
  
  /**
    * The external account number (int) or account ID GUID.
    */
  var accountId: js.UndefOr[String] = js.native
  
  /**
    * The web address of the listener or retrieving service endpoint for Connect.
    */
  var configUrl: js.UndefOr[String] = js.native
  
  /**
    * A complex element containing information about the Connect configuration, error details, date/time, description and payload.
    * This information is included in the response only when the `additional_info` query is set to **true**.
    * This additional information is only available when retrieving general logs with
    * [ConnectEvents:get](https://developers.docusign.com/esign-rest-api/reference/Connect/ConnectEvents/get), but not when retrieving
    * failure logs with [ConnectEvents:listFailures](https://developers.docusign.com/esign-rest-api/reference/Connect/ConnectEvents/listFailures).
    */
  var connectDebugLog: js.UndefOr[js.Array[ConnectDebugLog]] = js.native
  
  /**
    * The id of the Connect configuration that failed. If an account has multiple Connect configurations, this value is used to look up the Connect configuration for the failed post.
    */
  var connectId: js.UndefOr[String] = js.native
  
  /**
    * The UTC DateTime when the Connect post was created.
    */
  var created: js.UndefOr[String] = js.native
  
  /**
    * The email address of the envelope sender.
    */
  var email: js.UndefOr[String] = js.native
  
  /**
    * The id of the envelope that failed to post.
    */
  var envelopeId: js.UndefOr[String] = js.native
  
  /**
    * The server error associated with the Connect post failure.
    */
  var error: js.UndefOr[String] = js.native
  
  /**
    * The id of the Connect post failure.
    */
  var failureId: js.UndefOr[String] = js.native
  
  /**
    * The URI for the Connect post failure.
    */
  var failureUri: js.UndefOr[String] = js.native
  
  /**
    * The UTC DateTime of the last attempt to post.
    */
  var lastTry: js.UndefOr[String] = js.native
  
  /**
    * The id of the Connect log entry.
    */
  var logId: js.UndefOr[String] = js.native
  
  /**
    * The URI for the Connect log entry.
    */
  var logUri: js.UndefOr[String] = js.native
  
  /**
    * The number of times the Connect post has been retried.
    */
  var retryCount: js.UndefOr[String] = js.native
  
  /**
    * A URI that you can use to retry to publish the Connect post.
    */
  var retryUri: js.UndefOr[String] = js.native
  
  /**
    * The envelope status for the Connect post. Possible values are:
    * - `Any`
    * - `Voided`
    * - `Created`
    * - `Deleted`
    * - `Sent`
    * - `Delivered`
    * - `Signed`
    * - `Completed`
    * - `Declined`
    * - `TimedOut`
    * - `Template`
    * - `Processing`
    *
    * For details about these statuses, see [Envelope Status Code Descriptions](https://developers.docusign.com/esign-rest-api/guides/status-and-error-codes#envelope-status-code-descriptions).
    */
  var status: js.UndefOr[String] = js.native
  
  /**
    * The subject of the envelope.
    */
  var subject: js.UndefOr[String] = js.native
  
  /**
    * The name of the sender of the envelope.
    */
  var userName: js.UndefOr[String] = js.native
}
object ConnectLog {
  
  @scala.inline
  def apply(): ConnectLog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectLog]
  }
  
  @scala.inline
  implicit class ConnectLogMutableBuilder[Self <: ConnectLog] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setConfigUrl(value: String): Self = StObject.set(x, "configUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigUrlUndefined: Self = StObject.set(x, "configUrl", js.undefined)
    
    @scala.inline
    def setConnectDebugLog(value: js.Array[ConnectDebugLog]): Self = StObject.set(x, "connectDebugLog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectDebugLogUndefined: Self = StObject.set(x, "connectDebugLog", js.undefined)
    
    @scala.inline
    def setConnectDebugLogVarargs(value: ConnectDebugLog*): Self = StObject.set(x, "connectDebugLog", js.Array(value :_*))
    
    @scala.inline
    def setConnectId(value: String): Self = StObject.set(x, "connectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectIdUndefined: Self = StObject.set(x, "connectId", js.undefined)
    
    @scala.inline
    def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setEnvelopeId(value: String): Self = StObject.set(x, "envelopeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvelopeIdUndefined: Self = StObject.set(x, "envelopeId", js.undefined)
    
    @scala.inline
    def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setFailureId(value: String): Self = StObject.set(x, "failureId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureIdUndefined: Self = StObject.set(x, "failureId", js.undefined)
    
    @scala.inline
    def setFailureUri(value: String): Self = StObject.set(x, "failureUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureUriUndefined: Self = StObject.set(x, "failureUri", js.undefined)
    
    @scala.inline
    def setLastTry(value: String): Self = StObject.set(x, "lastTry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastTryUndefined: Self = StObject.set(x, "lastTry", js.undefined)
    
    @scala.inline
    def setLogId(value: String): Self = StObject.set(x, "logId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogIdUndefined: Self = StObject.set(x, "logId", js.undefined)
    
    @scala.inline
    def setLogUri(value: String): Self = StObject.set(x, "logUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogUriUndefined: Self = StObject.set(x, "logUri", js.undefined)
    
    @scala.inline
    def setRetryCount(value: String): Self = StObject.set(x, "retryCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryCountUndefined: Self = StObject.set(x, "retryCount", js.undefined)
    
    @scala.inline
    def setRetryUri(value: String): Self = StObject.set(x, "retryUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryUriUndefined: Self = StObject.set(x, "retryUri", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    @scala.inline
    def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserNameUndefined: Self = StObject.set(x, "userName", js.undefined)
  }
}
