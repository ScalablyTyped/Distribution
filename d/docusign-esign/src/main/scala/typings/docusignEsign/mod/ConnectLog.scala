package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectLog extends js.Object {
  
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
  implicit class ConnectLogOps[Self <: ConnectLog] (val x: Self) extends AnyVal {
    
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
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    
    @scala.inline
    def setConfigUrl(value: String): Self = this.set("configUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigUrl: Self = this.set("configUrl", js.undefined)
    
    @scala.inline
    def setConnectDebugLogVarargs(value: ConnectDebugLog*): Self = this.set("connectDebugLog", js.Array(value :_*))
    
    @scala.inline
    def setConnectDebugLog(value: js.Array[ConnectDebugLog]): Self = this.set("connectDebugLog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectDebugLog: Self = this.set("connectDebugLog", js.undefined)
    
    @scala.inline
    def setConnectId(value: String): Self = this.set("connectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectId: Self = this.set("connectId", js.undefined)
    
    @scala.inline
    def setCreated(value: String): Self = this.set("created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    
    @scala.inline
    def setEnvelopeId(value: String): Self = this.set("envelopeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvelopeId: Self = this.set("envelopeId", js.undefined)
    
    @scala.inline
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setFailureId(value: String): Self = this.set("failureId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureId: Self = this.set("failureId", js.undefined)
    
    @scala.inline
    def setFailureUri(value: String): Self = this.set("failureUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureUri: Self = this.set("failureUri", js.undefined)
    
    @scala.inline
    def setLastTry(value: String): Self = this.set("lastTry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastTry: Self = this.set("lastTry", js.undefined)
    
    @scala.inline
    def setLogId(value: String): Self = this.set("logId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogId: Self = this.set("logId", js.undefined)
    
    @scala.inline
    def setLogUri(value: String): Self = this.set("logUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogUri: Self = this.set("logUri", js.undefined)
    
    @scala.inline
    def setRetryCount(value: String): Self = this.set("retryCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetryCount: Self = this.set("retryCount", js.undefined)
    
    @scala.inline
    def setRetryUri(value: String): Self = this.set("retryUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetryUri: Self = this.set("retryUri", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setSubject(value: String): Self = this.set("subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
    
    @scala.inline
    def setUserName(value: String): Self = this.set("userName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserName: Self = this.set("userName", js.undefined)
  }
}
