package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectConfigurations extends js.Object {
  
  /**
    * When set to **true**, the tracked envelope and recipient events for all users, including users that are added a later time, are sent through Connect.
    */
  var allUsers: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, data is sent to the urlToPublishTo web address. This option can be set to false to stop sending data while maintaining the Connect configuration information.
    */
  var allowEnvelopePublish: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**  (default), DocuSign sends data to the designated Salesforce account through Connect.
    */
  var allowSalesforcePublish: js.UndefOr[String] = js.native
  
  /**
    * If you are using merge fields, this property specifies the type of the merge field. The only supported value is `salesforce`.
    */
  var configurationType: js.UndefOr[String] = js.native
  
  /**
    * The DocuSign-generated ID for the Connect configuration. This property is read only.
    */
  var connectId: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, Connect logging is turned on. We recommend that you enable this functionality, which helps you troubleshoot any issues.
    *
    * You can have a maximum of 100 active logs in your account. You can view the entries in active logs in the **Logs** tab in the console.
    */
  var enableLog: js.UndefOr[String] = js.native
  
  /**
    * An array of strings that lists envelope-related events to track through Connect. The possible event values are:
    *
    * - `sent`: An envelope has the status `sent` in the following scenarios:
    *    - When the envelope has been sent to recipients.
    *    - When using remote signing, this event is triggered when the email notification with a link to the documents is sent to at least one recipient.
    *    - When using embedded signing, this event is triggered when the link is ready for the recipient to sign the envelope.
    *
    *    An envelope remains in this state until all recipients have viewed or taken action on the envelope.
    *
    * - `delivered`: This status is triggered when all recipients have opened the envelope, selected the **Continue** button in the interface, and viewed the documents.
    * - `completed`: This status is triggered when all recipients have completed their assigned actions on an envelope.
    * - `declined`: This status is triggered when a recipient has declined to sign the envelope.
    * - `voided`: The voided status indicates that the sender has voided the envelope.
    *
    * **Note**: In previous versions of the API, this value was a single comma-separated string.
    *
    */
  var envelopeEvents: js.UndefOr[js.Array[String]] = js.native
  
  var eventData: js.UndefOr[ConnectEventData] = js.native
  
  /**
    * The id of an external folder.
    */
  var externalFolderId: js.UndefOr[String] = js.native
  
  /**
    * The label for an external folder.
    */
  var externalFolderLabel: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, a certificate for a SOAP header is included in messages sent through Connect.
    */
  var includeCertSoapHeader: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the Connect Service includes the Certificate of Completion with completed envelopes.
    */
  var includeCertificateOfCompletion: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the Document Fields associated with the envelope's documents are included in the notification messages.
    * Document Fields are optional custom name-value pairs added to documents using the API.
    */
  var includeDocumentFields: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, Connect attaches the envelope documents to the XML payloads of your event notification messages.
    *
    * **Note**: Consider resources and scaling when adding documents to your event payloads. Documents attached to these messages are sent in base64 XML element nodes,
    * which are larger than binary document data. This can significantly increase your payload size, opening up windows for failure. If you include documents,
    * you must build your application to scale in these situations.
    */
  var includeDocuments: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, Connect will include the voidedReason for voided envelopes.
    */
  var includeEnvelopeVoidReason: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, a Hash-based Message Authentication Code (HMAC) signature is included in messages sent through Connect.
    * For more information, see [Using HMAC Security with DocuSign Connect](https://developers.docusign.com/esign-rest-api/guides/connect-hmac).
    */
  var includeHMAC: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, Connect will include the sender account as Custom Field in the data.
    */
  var includeSenderAccountasCustomField: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, Connect will include the envelope time zone information.
    */
  var includeTimeZoneInformation: js.UndefOr[String] = js.native
  
  /**
    * The name of the Connect configuration. The name helps identify the configuration in the list.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The user's encrypted password hash.
    */
  var password: js.UndefOr[String] = js.native
  
  /**
    * An array of strings that lists of recipient-related events that trigger a notification
    * to your webhook Connect listener. The possible event values are:
    *
    * - `sent`: If a recipient type is set to receive an email notification to take action on an envelope, the recipient status is set to `sent` upon delivery of the email.
    * - `delivered`: The recipient has viewed the documents in the envelope. This recipient status does not indicate email delivery of the documents in the envelope.
    * - `completed`: The recipient has completed their assigned actions on an envelope.
    * - `declined`: The recipient has declined to sign a document in the envelope.
    * - `authenticationfailed`: At least one signer has failed the authentication check on the document. If this occurs, you have two options:
    *    - Send a reminder to the recipients, which provides the signer with another chance to access and pass the authentication.
    *    - Correct the document and modify the authentication setting.
    * - `autoresponded`: The recipient's email system sent back an automatic response. This status is only used when **Send-on-behalf-of** is turned off for the account.
    *
    * **Note**: In previous versions of the API, this value was a single comma-separated string.
    *
    */
  var recipientEvents: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * When set to **true**, [Mutual TLS](https://developers.docusign.com/esign-rest-api/guides/mutual-tls-intro) authentication is enabled.
    */
  var requireMutualTls: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, event delivery acknowledgements are enabled for your Connect configuration.
    *
    * DocuSign Connect awaits a valid 200 response from your application acknowledging that it received a message. If you do not acknowledge receiving an
    * event notification message within 100 seconds, DocuSign treats the message as a failure and places it into a failure queue.
    * It is imperative that you acknowledge successful receipt of Connect events as they occur by sending a 200 event back.
    *
    * #### When set to **true** and Send Individual Messages (SIM) mode is activated
    *
    * If the HTTP status response to a notification message is not in the range of 200-299,
    * then the message delivery failed, and the configuration is marked as down.
    *
    * The message will be queued and retried once per day.
    * While a Connect configuration is marked down, subsequent notifications will not be tried. Instead they will be immediately queued with the reason `Pending`.
    * When a message succeeds, all queued messages for the configuration will be tried immediately, in order.
    *
    * There is a maximum of ten retries. Alternately, you can use **Republish Connect Information** to manually republish the notification.
    *
    * #### When set to **true** and SIM mode is not activated
    *
    * If the HTTP Status response to a notification message is not in the range of 200-299,  then the message delivery failed, and the message is queued.
    *
    * The message will be retried after at least a day the next time a subsequent message is successfully sent to this configuration (subscription).
    * Subsequent notifications will be tried when they occur.
    * There is a maximum of ten retries. Alternately, you can use **Republish Connect Information** to manually republish the notification.
    *
    * #### When set to **false**
    *
    * When `requiresAcknowledgement` is set to **false** and you do not acknowledge receiving an event notification message within 100 seconds,
    * DocuSign treats the message as a failure and determines that the server is unavailable. It does not retry to send the notification message,
    * and you must handle the failure manually.
    *
    *
    */
  var requiresAcknowledgement: js.UndefOr[String] = js.native
  
  /**
    * The version of the Salesforce API that you are using.
    */
  var salesforceApiVersion: js.UndefOr[String] = js.native
  
  var salesforceAuthcode: js.UndefOr[String] = js.native
  
  var salesforceCallBackUrl: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, DocuSign can use documents in your Salesforce account for sending and signing.
    */
  var salesforceDocumentsAsContentFiles: js.UndefOr[String] = js.native
  
  var senderOverride: js.UndefOr[String] = js.native
  
  /**
    * This property sets the items that are available for selection when adding or editing Connect objects.
    */
  var senderSelectableItems: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * An array of Salesforce objects.
    */
  var sfObjects: js.UndefOr[js.Array[ConnectSalesforceObject]] = js.native
  
  /**
    * When set to **true**, Mutual TLS will be enabled for notifications. Mutual TLS must be initiated by the listener (the customer's web server) during the TLS handshake protocol.
    */
  var signMessageWithX509Certificate: js.UndefOr[String] = js.native
  
  /**
    * The namespace of the SOAP interface.
    *
    * **Note**: If `useSoapInterface` is set to **true**, you must set this value.
    */
  var soapNamespace: js.UndefOr[String] = js.native
  
  /**
    * The endpoint to which Connect should send webhook notification messages via an HTTPS POST request. The URL must start with `https`.
    * The customer's web server must use an SSL/TLS certificate whose CA is in the Microsoft list of trusted CAs. Self-signed certificates are not acceptable,
    * but you can use free certificates from Let's Encrypt.
    */
  var urlToPublishTo: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, indicates that the `urlToPublishTo` property contains a SOAP endpoint.
    */
  var useSoapInterface: js.UndefOr[String] = js.native
  
  /**
    * A comma-separated list of userIds. This sets the users associated with the tracked envelope and recipient events.
    * When a tracked event occurs for a set user, the a notification message is sent to your Connect listener.
    *
    * ###### Note: If allUsers is set to `false` then you must provide a list of user ids.
    */
  var userIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The name of the user.
    */
  var userName: js.UndefOr[String] = js.native
}
object ConnectConfigurations {
  
  @scala.inline
  def apply(): ConnectConfigurations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectConfigurations]
  }
  
  @scala.inline
  implicit class ConnectConfigurationsOps[Self <: ConnectConfigurations] (val x: Self) extends AnyVal {
    
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
    def setAllUsers(value: String): Self = this.set("allUsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllUsers: Self = this.set("allUsers", js.undefined)
    
    @scala.inline
    def setAllowEnvelopePublish(value: String): Self = this.set("allowEnvelopePublish", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowEnvelopePublish: Self = this.set("allowEnvelopePublish", js.undefined)
    
    @scala.inline
    def setAllowSalesforcePublish(value: String): Self = this.set("allowSalesforcePublish", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowSalesforcePublish: Self = this.set("allowSalesforcePublish", js.undefined)
    
    @scala.inline
    def setConfigurationType(value: String): Self = this.set("configurationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigurationType: Self = this.set("configurationType", js.undefined)
    
    @scala.inline
    def setConnectId(value: String): Self = this.set("connectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectId: Self = this.set("connectId", js.undefined)
    
    @scala.inline
    def setEnableLog(value: String): Self = this.set("enableLog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableLog: Self = this.set("enableLog", js.undefined)
    
    @scala.inline
    def setEnvelopeEventsVarargs(value: String*): Self = this.set("envelopeEvents", js.Array(value :_*))
    
    @scala.inline
    def setEnvelopeEvents(value: js.Array[String]): Self = this.set("envelopeEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvelopeEvents: Self = this.set("envelopeEvents", js.undefined)
    
    @scala.inline
    def setEventData(value: ConnectEventData): Self = this.set("eventData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventData: Self = this.set("eventData", js.undefined)
    
    @scala.inline
    def setExternalFolderId(value: String): Self = this.set("externalFolderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalFolderId: Self = this.set("externalFolderId", js.undefined)
    
    @scala.inline
    def setExternalFolderLabel(value: String): Self = this.set("externalFolderLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalFolderLabel: Self = this.set("externalFolderLabel", js.undefined)
    
    @scala.inline
    def setIncludeCertSoapHeader(value: String): Self = this.set("includeCertSoapHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeCertSoapHeader: Self = this.set("includeCertSoapHeader", js.undefined)
    
    @scala.inline
    def setIncludeCertificateOfCompletion(value: String): Self = this.set("includeCertificateOfCompletion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeCertificateOfCompletion: Self = this.set("includeCertificateOfCompletion", js.undefined)
    
    @scala.inline
    def setIncludeDocumentFields(value: String): Self = this.set("includeDocumentFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeDocumentFields: Self = this.set("includeDocumentFields", js.undefined)
    
    @scala.inline
    def setIncludeDocuments(value: String): Self = this.set("includeDocuments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeDocuments: Self = this.set("includeDocuments", js.undefined)
    
    @scala.inline
    def setIncludeEnvelopeVoidReason(value: String): Self = this.set("includeEnvelopeVoidReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeEnvelopeVoidReason: Self = this.set("includeEnvelopeVoidReason", js.undefined)
    
    @scala.inline
    def setIncludeHMAC(value: String): Self = this.set("includeHMAC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeHMAC: Self = this.set("includeHMAC", js.undefined)
    
    @scala.inline
    def setIncludeSenderAccountasCustomField(value: String): Self = this.set("includeSenderAccountasCustomField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeSenderAccountasCustomField: Self = this.set("includeSenderAccountasCustomField", js.undefined)
    
    @scala.inline
    def setIncludeTimeZoneInformation(value: String): Self = this.set("includeTimeZoneInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeTimeZoneInformation: Self = this.set("includeTimeZoneInformation", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    
    @scala.inline
    def setRecipientEventsVarargs(value: String*): Self = this.set("recipientEvents", js.Array(value :_*))
    
    @scala.inline
    def setRecipientEvents(value: js.Array[String]): Self = this.set("recipientEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipientEvents: Self = this.set("recipientEvents", js.undefined)
    
    @scala.inline
    def setRequireMutualTls(value: String): Self = this.set("requireMutualTls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequireMutualTls: Self = this.set("requireMutualTls", js.undefined)
    
    @scala.inline
    def setRequiresAcknowledgement(value: String): Self = this.set("requiresAcknowledgement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequiresAcknowledgement: Self = this.set("requiresAcknowledgement", js.undefined)
    
    @scala.inline
    def setSalesforceApiVersion(value: String): Self = this.set("salesforceApiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSalesforceApiVersion: Self = this.set("salesforceApiVersion", js.undefined)
    
    @scala.inline
    def setSalesforceAuthcode(value: String): Self = this.set("salesforceAuthcode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSalesforceAuthcode: Self = this.set("salesforceAuthcode", js.undefined)
    
    @scala.inline
    def setSalesforceCallBackUrl(value: String): Self = this.set("salesforceCallBackUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSalesforceCallBackUrl: Self = this.set("salesforceCallBackUrl", js.undefined)
    
    @scala.inline
    def setSalesforceDocumentsAsContentFiles(value: String): Self = this.set("salesforceDocumentsAsContentFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSalesforceDocumentsAsContentFiles: Self = this.set("salesforceDocumentsAsContentFiles", js.undefined)
    
    @scala.inline
    def setSenderOverride(value: String): Self = this.set("senderOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSenderOverride: Self = this.set("senderOverride", js.undefined)
    
    @scala.inline
    def setSenderSelectableItemsVarargs(value: String*): Self = this.set("senderSelectableItems", js.Array(value :_*))
    
    @scala.inline
    def setSenderSelectableItems(value: js.Array[String]): Self = this.set("senderSelectableItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSenderSelectableItems: Self = this.set("senderSelectableItems", js.undefined)
    
    @scala.inline
    def setSfObjectsVarargs(value: ConnectSalesforceObject*): Self = this.set("sfObjects", js.Array(value :_*))
    
    @scala.inline
    def setSfObjects(value: js.Array[ConnectSalesforceObject]): Self = this.set("sfObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSfObjects: Self = this.set("sfObjects", js.undefined)
    
    @scala.inline
    def setSignMessageWithX509Certificate(value: String): Self = this.set("signMessageWithX509Certificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignMessageWithX509Certificate: Self = this.set("signMessageWithX509Certificate", js.undefined)
    
    @scala.inline
    def setSoapNamespace(value: String): Self = this.set("soapNamespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSoapNamespace: Self = this.set("soapNamespace", js.undefined)
    
    @scala.inline
    def setUrlToPublishTo(value: String): Self = this.set("urlToPublishTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrlToPublishTo: Self = this.set("urlToPublishTo", js.undefined)
    
    @scala.inline
    def setUseSoapInterface(value: String): Self = this.set("useSoapInterface", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseSoapInterface: Self = this.set("useSoapInterface", js.undefined)
    
    @scala.inline
    def setUserIdsVarargs(value: String*): Self = this.set("userIds", js.Array(value :_*))
    
    @scala.inline
    def setUserIds(value: js.Array[String]): Self = this.set("userIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserIds: Self = this.set("userIds", js.undefined)
    
    @scala.inline
    def setUserName(value: String): Self = this.set("userName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserName: Self = this.set("userName", js.undefined)
  }
}
