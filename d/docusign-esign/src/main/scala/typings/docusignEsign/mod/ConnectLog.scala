package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectLog extends StObject {
  
  /**
    * The external account number (int) or account ID GUID.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * The web address of the listener or retrieving service endpoint for Connect.
    */
  var configUrl: js.UndefOr[String] = js.undefined
  
  /**
    * A complex element containing information about the Connect configuration, error details, date/time, description and payload.
    * This information is included in the response only when the `additional_info` query is set to **true**.
    * This additional information is only available when retrieving general logs with
    * [ConnectEvents:get](https://developers.docusign.com/esign-rest-api/reference/Connect/ConnectEvents/get), but not when retrieving
    * failure logs with [ConnectEvents:listFailures](https://developers.docusign.com/esign-rest-api/reference/Connect/ConnectEvents/listFailures).
    */
  var connectDebugLog: js.UndefOr[js.Array[ConnectDebugLog]] = js.undefined
  
  /**
    * The id of the Connect configuration that failed. If an account has multiple Connect configurations, this value is used to look up the Connect configuration for the failed post.
    */
  var connectId: js.UndefOr[String] = js.undefined
  
  /**
    * The UTC DateTime when the Connect post was created.
    */
  var created: js.UndefOr[String] = js.undefined
  
  /**
    * The email address of the envelope sender.
    */
  var email: js.UndefOr[String] = js.undefined
  
  /**
    * The id of the envelope that failed to post.
    */
  var envelopeId: js.UndefOr[String] = js.undefined
  
  /**
    * The server error associated with the Connect post failure.
    */
  var error: js.UndefOr[String] = js.undefined
  
  /**
    * The id of the Connect post failure.
    */
  var failureId: js.UndefOr[String] = js.undefined
  
  /**
    * The URI for the Connect post failure.
    */
  var failureUri: js.UndefOr[String] = js.undefined
  
  /**
    * The UTC DateTime of the last attempt to post.
    */
  var lastTry: js.UndefOr[String] = js.undefined
  
  /**
    * The id of the Connect log entry.
    */
  var logId: js.UndefOr[String] = js.undefined
  
  /**
    * The URI for the Connect log entry.
    */
  var logUri: js.UndefOr[String] = js.undefined
  
  /**
    * The number of times the Connect post has been retried.
    */
  var retryCount: js.UndefOr[String] = js.undefined
  
  /**
    * A URI that you can use to retry to publish the Connect post.
    */
  var retryUri: js.UndefOr[String] = js.undefined
  
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
  var status: js.UndefOr[String] = js.undefined
  
  /**
    * The subject of the envelope.
    */
  var subject: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the sender of the envelope.
    */
  var userName: js.UndefOr[String] = js.undefined
}
object ConnectLog {
  
  inline def apply(): ConnectLog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectLog]
  }
  
  extension [Self <: ConnectLog](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setConfigUrl(value: String): Self = StObject.set(x, "configUrl", value.asInstanceOf[js.Any])
    
    inline def setConfigUrlUndefined: Self = StObject.set(x, "configUrl", js.undefined)
    
    inline def setConnectDebugLog(value: js.Array[ConnectDebugLog]): Self = StObject.set(x, "connectDebugLog", value.asInstanceOf[js.Any])
    
    inline def setConnectDebugLogUndefined: Self = StObject.set(x, "connectDebugLog", js.undefined)
    
    inline def setConnectDebugLogVarargs(value: ConnectDebugLog*): Self = StObject.set(x, "connectDebugLog", js.Array(value*))
    
    inline def setConnectId(value: String): Self = StObject.set(x, "connectId", value.asInstanceOf[js.Any])
    
    inline def setConnectIdUndefined: Self = StObject.set(x, "connectId", js.undefined)
    
    inline def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setEnvelopeId(value: String): Self = StObject.set(x, "envelopeId", value.asInstanceOf[js.Any])
    
    inline def setEnvelopeIdUndefined: Self = StObject.set(x, "envelopeId", js.undefined)
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setFailureId(value: String): Self = StObject.set(x, "failureId", value.asInstanceOf[js.Any])
    
    inline def setFailureIdUndefined: Self = StObject.set(x, "failureId", js.undefined)
    
    inline def setFailureUri(value: String): Self = StObject.set(x, "failureUri", value.asInstanceOf[js.Any])
    
    inline def setFailureUriUndefined: Self = StObject.set(x, "failureUri", js.undefined)
    
    inline def setLastTry(value: String): Self = StObject.set(x, "lastTry", value.asInstanceOf[js.Any])
    
    inline def setLastTryUndefined: Self = StObject.set(x, "lastTry", js.undefined)
    
    inline def setLogId(value: String): Self = StObject.set(x, "logId", value.asInstanceOf[js.Any])
    
    inline def setLogIdUndefined: Self = StObject.set(x, "logId", js.undefined)
    
    inline def setLogUri(value: String): Self = StObject.set(x, "logUri", value.asInstanceOf[js.Any])
    
    inline def setLogUriUndefined: Self = StObject.set(x, "logUri", js.undefined)
    
    inline def setRetryCount(value: String): Self = StObject.set(x, "retryCount", value.asInstanceOf[js.Any])
    
    inline def setRetryCountUndefined: Self = StObject.set(x, "retryCount", js.undefined)
    
    inline def setRetryUri(value: String): Self = StObject.set(x, "retryUri", value.asInstanceOf[js.Any])
    
    inline def setRetryUriUndefined: Self = StObject.set(x, "retryUri", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
    
    inline def setUserNameUndefined: Self = StObject.set(x, "userName", js.undefined)
  }
}
