package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventNotification extends js.Object {
  
  /**
    * A list of envelope-level event statuses that will trigger Connect to send updates to the endpoint specified in the `url` property.
    *
    * To receive notifications, you must include either an `envelopeEvents` node or a `recipientEvents` node. You do not need to specify both.
    */
  var envelopeEvents: js.UndefOr[
    js.Array[/* For which envelope events should your webhook be called? */ EnvelopeEvent]
  ] = js.native
  
  var eventData: js.UndefOr[ConnectEventData] = js.native
  
  /**
    * When set to **true**, the Connect Service includes the Certificate of Completion with completed envelopes.
    */
  var includeCertificateOfCompletion: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the Connect service will digitally sign the XML data. The signature will be included in the XML message.
    */
  var includeCertificateWithSoap: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the Document Fields associated with the envelope's documents are included in the notification messages.
    * Document Fields are optional custom name-value pairs added to documents using the API.
    */
  var includeDocumentFields: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the XML webhook messages will include the envelope's PDF documents. Including the PDF documents will greatly increase
    * the size of the notification messages. Ensure that your listener can handle incoming messages that are 25MB or larger.
    */
  var includeDocuments: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, if the envelope is voided, the Connect Service notification will include the void reason, as entered by the person that voided the envelope.
    */
  var includeEnvelopeVoidReason: js.UndefOr[String] = js.native
  
  var includeHMAC: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, Connect will include the sender account as Custom Field in the data.
    */
  var includeSenderAccountAsCustomField: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the envelope's time zone information is included in the webhook messages.
    */
  var includeTimeZone: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the webhook messages are logged. They can be viewed on the DocuSign Administration Web Tool in the Connect section. Logged messages can also be
    * downloaded via the [ConnectEvents resource](https://developers.docusign.com/esign-rest-api/reference/Connect/ConnectEvents).
    */
  var loggingEnabled: js.UndefOr[String] = js.native
  
  /**
    * An array of recipient event statuses that will trigger Connect to send notifications to your webhook listener at the url endpoint specified in the `url` property.
    *
    * To receive notifications, you must include either an `envelopeEvents` node or a `recipientEvents` node. You do not need to specify both.
    */
  var recipientEvents: js.UndefOr[js.Array[RecipientEvent]] = js.native
  
  /**
    * When set to **true**, the DocuSign Connect service checks that the message was received and retries on failures.
    */
  var requireAcknowledgment: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, Mutual TLS will be enabled for notifications. Mutual TLS must be initiated by the listener (the customer's web server) during the TLS handshake protocol.
    */
  var signMessageWithX509Cert: js.UndefOr[String] = js.native
  
  /**
    * The namespace of the SOAP interface.
    *
    * The namespace value must be set if useSoapexport interface is set to true.
    */
  var soapNameSpace: js.UndefOr[String] = js.native
  
  /**
    * The endpoint to which webhook notification messages are sent via an HTTPS POST request. The url must start with https. The customer's web server must use an SSL/TLS
    * certificate whose CA is in the Microsoft list of trusted CAs. Self-signed certificates are not ok. Free certificates from Let's Encrypt can be used.
    */
  var url: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the notifications are sent to your endpoint as SOAP requests.
    */
  var useSoapInterface: js.UndefOr[String] = js.native
}
object EventNotification {
  
  @scala.inline
  def apply(): EventNotification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventNotification]
  }
  
  @scala.inline
  implicit class EventNotificationOps[Self <: EventNotification] (val x: Self) extends AnyVal {
    
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
    def setEnvelopeEventsVarargs(value: (/* For which envelope events should your webhook be called? */ EnvelopeEvent)*): Self = this.set("envelopeEvents", js.Array(value :_*))
    
    @scala.inline
    def setEnvelopeEvents(value: js.Array[/* For which envelope events should your webhook be called? */ EnvelopeEvent]): Self = this.set("envelopeEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvelopeEvents: Self = this.set("envelopeEvents", js.undefined)
    
    @scala.inline
    def setEventData(value: ConnectEventData): Self = this.set("eventData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventData: Self = this.set("eventData", js.undefined)
    
    @scala.inline
    def setIncludeCertificateOfCompletion(value: String): Self = this.set("includeCertificateOfCompletion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeCertificateOfCompletion: Self = this.set("includeCertificateOfCompletion", js.undefined)
    
    @scala.inline
    def setIncludeCertificateWithSoap(value: String): Self = this.set("includeCertificateWithSoap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeCertificateWithSoap: Self = this.set("includeCertificateWithSoap", js.undefined)
    
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
    def setIncludeSenderAccountAsCustomField(value: String): Self = this.set("includeSenderAccountAsCustomField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeSenderAccountAsCustomField: Self = this.set("includeSenderAccountAsCustomField", js.undefined)
    
    @scala.inline
    def setIncludeTimeZone(value: String): Self = this.set("includeTimeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeTimeZone: Self = this.set("includeTimeZone", js.undefined)
    
    @scala.inline
    def setLoggingEnabled(value: String): Self = this.set("loggingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoggingEnabled: Self = this.set("loggingEnabled", js.undefined)
    
    @scala.inline
    def setRecipientEventsVarargs(value: RecipientEvent*): Self = this.set("recipientEvents", js.Array(value :_*))
    
    @scala.inline
    def setRecipientEvents(value: js.Array[RecipientEvent]): Self = this.set("recipientEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipientEvents: Self = this.set("recipientEvents", js.undefined)
    
    @scala.inline
    def setRequireAcknowledgment(value: String): Self = this.set("requireAcknowledgment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequireAcknowledgment: Self = this.set("requireAcknowledgment", js.undefined)
    
    @scala.inline
    def setSignMessageWithX509Cert(value: String): Self = this.set("signMessageWithX509Cert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignMessageWithX509Cert: Self = this.set("signMessageWithX509Cert", js.undefined)
    
    @scala.inline
    def setSoapNameSpace(value: String): Self = this.set("soapNameSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSoapNameSpace: Self = this.set("soapNameSpace", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setUseSoapInterface(value: String): Self = this.set("useSoapInterface", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseSoapInterface: Self = this.set("useSoapInterface", js.undefined)
  }
}
