package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentDetails extends StObject {
  
  /**
    * An array of accepted payment methods:
    *
    * * `CreditCard`
    * * `ApplePay`
    * * `AndroidPay`
    * * `BankAccount`
    *
    * For example, if you only accept credit cards and ACH transfers, you would set this property to:
    *
    * `'["BankAccount", "CreditCard"]'`
    *
    * Do not specify `BankAccount` (ACH) if you are also using in-person signing.
    *
    */
  var allowedPaymentMethods: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The GUID set by the payment gateway (such as Stripe) that identifies a transaction. The `chargeId` is created when authorizing a payment and must be referenced when completing a payment.
    */
  var chargeId: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the three-letter
    * [ISO 4217][ISO4217] currency code for the payment.
    *
    * Supported currencies are:
    *
    * * AUD: Australian dollar
    * * CAD: Canadian dollar
    * * EUR: Euro
    * * GBP: Great Britain pound
    * * USD: United States dollar
    *
    * Specifying any other ISO 4217 code for payments is an error.
    *
    * [ISO4217]:          https://en.wikipedia.org/wiki/ISO_4217
    *
    */
  var currencyCode: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `currencyCode` property is editable.
    */
  var currencyCodeMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  /**
    * This is a sender-defined field that passes any extra metadata about the payment that will show up in the Authorize.net transaction under **Description**
    * in the merchant gateway portal. The custom metadata will be recorded in downloaded Authorize.net reports.
    *
    * The following example shows what the **Description** field of the transaction will look like:
    *
    * `<envelopeID>, <customMetadata>`
    */
  var customMetadata: js.UndefOr[String] = js.undefined
  
  /**
    * A sender-defined field that specifies whether custom metadata is required for the transaction. When set to **true**, custom metadata is required.
    * This property only applies if you are using an Authorize.net payment gateway account.
    */
  var customMetadataRequired: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The customer ID.
    */
  var customerId: js.UndefOr[String] = js.undefined
  
  /**
    * A GUID that identifies the payment gateway
    * connected to the sender's DocuSign account.
    *
    * There is no public API
    * for connecting payment gateway accounts
    * You must connect and manage payment gateway accounts
    * through the DocuSign Admin console
    * and through your chosen payment gateway.
    *
    * You can get the gateway account ID
    * in the Payments section
    * of the DocuSign Admin console.
    *
    *
    * [paymentgateways]:  https://support.docusign.com/en/guides/managing-payment-gateways
    *
    */
  var gatewayAccountId: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `gatewayAccountId` property is editable.
    */
  var gatewayAccountIdMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  /**
    * Display name of the gateway connected to sender's Docusign account.
    *
    * Possible values are: Stripe, Braintree, Authorize.Net.
    */
  var gatewayDisplayName: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the gateway connected to sender's DocuSign account.
    *
    * Possible values are:
    *
    * * `Stripe`
    * * `Braintree`
    * * `AuthorizeDotNet`
    */
  var gatewayName: js.UndefOr[String] = js.undefined
  
  /**
    * A payment formula can have
    * one or more line items
    * that provide detail about
    * individual items in a payment request.
    *
    * The list of line items
    * are returned as metadata
    * to the payment gateway.
    *
    */
  var lineItems: js.UndefOr[js.Array[PaymentLineItem]] = js.undefined
  
  /**
    * This property specifies how the signer's collected payment details will be used.
    *
    * Possible values:
    *
    * - `authorize`: The payment details will be used to collect payment. This is the default value.
    * - `save`: The signer's payment method (credit card or bank account) will be saved to the sender's payment gateway.
    * - `save_and_authorize`: The signer's payment method (credit card or bank account) will be saved to the sender's payment gateway and will also be used to collect payment.
    */
  var paymentOption: js.UndefOr[String] = js.undefined
  
  /**
    * The payment source ID.
    */
  var paymentSourceId: js.UndefOr[String] = js.undefined
  
  /**
    * This read-only property describes the status of a payment.
    *
    * * `new`<br>
    *   This is a new payment request.
    *   The envelope has been created,
    *   but no payment authorizations have been made.
    *
    * * `auth_complete`<br>
    *   A recipient has entered their credit card information,
    *   but the envelope has not been completed.
    *   The card has not been charged.
    *
    * * `payment_complete`<br>
    *   The recipient's card has been charged.
    *
    * * `payment_capture_failed`<br>
    *   Final charge failed.
    *   This can happen when too much time
    *   passes between authorizing the payment
    *   and completing the document.
    *
    * * `future_payment_saved` <br>
    * The recipient's payment method has been saved to the sender's payment gateway.
    *
    */
  var status: js.UndefOr[String] = js.undefined
  
  /**
    * This read-only property
    * is a currency-formatted string
    * that represents the total
    * of all the line items.
    * The total is available
    * only after the document is completed,
    * which is when all recipients have paid and
    * have completed all required fields.
    *
    */
  var total: js.UndefOr[Money] = js.undefined
}
object PaymentDetails {
  
  inline def apply(): PaymentDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaymentDetails]
  }
  
  extension [Self <: PaymentDetails](x: Self) {
    
    inline def setAllowedPaymentMethods(value: js.Array[String]): Self = StObject.set(x, "allowedPaymentMethods", value.asInstanceOf[js.Any])
    
    inline def setAllowedPaymentMethodsUndefined: Self = StObject.set(x, "allowedPaymentMethods", js.undefined)
    
    inline def setAllowedPaymentMethodsVarargs(value: String*): Self = StObject.set(x, "allowedPaymentMethods", js.Array(value*))
    
    inline def setChargeId(value: String): Self = StObject.set(x, "chargeId", value.asInstanceOf[js.Any])
    
    inline def setChargeIdUndefined: Self = StObject.set(x, "chargeId", js.undefined)
    
    inline def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
    
    inline def setCurrencyCodeMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "currencyCodeMetadata", value.asInstanceOf[js.Any])
    
    inline def setCurrencyCodeMetadataUndefined: Self = StObject.set(x, "currencyCodeMetadata", js.undefined)
    
    inline def setCurrencyCodeUndefined: Self = StObject.set(x, "currencyCode", js.undefined)
    
    inline def setCustomMetadata(value: String): Self = StObject.set(x, "customMetadata", value.asInstanceOf[js.Any])
    
    inline def setCustomMetadataRequired(value: Boolean): Self = StObject.set(x, "customMetadataRequired", value.asInstanceOf[js.Any])
    
    inline def setCustomMetadataRequiredUndefined: Self = StObject.set(x, "customMetadataRequired", js.undefined)
    
    inline def setCustomMetadataUndefined: Self = StObject.set(x, "customMetadata", js.undefined)
    
    inline def setCustomerId(value: String): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
    
    inline def setCustomerIdUndefined: Self = StObject.set(x, "customerId", js.undefined)
    
    inline def setGatewayAccountId(value: String): Self = StObject.set(x, "gatewayAccountId", value.asInstanceOf[js.Any])
    
    inline def setGatewayAccountIdMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "gatewayAccountIdMetadata", value.asInstanceOf[js.Any])
    
    inline def setGatewayAccountIdMetadataUndefined: Self = StObject.set(x, "gatewayAccountIdMetadata", js.undefined)
    
    inline def setGatewayAccountIdUndefined: Self = StObject.set(x, "gatewayAccountId", js.undefined)
    
    inline def setGatewayDisplayName(value: String): Self = StObject.set(x, "gatewayDisplayName", value.asInstanceOf[js.Any])
    
    inline def setGatewayDisplayNameUndefined: Self = StObject.set(x, "gatewayDisplayName", js.undefined)
    
    inline def setGatewayName(value: String): Self = StObject.set(x, "gatewayName", value.asInstanceOf[js.Any])
    
    inline def setGatewayNameUndefined: Self = StObject.set(x, "gatewayName", js.undefined)
    
    inline def setLineItems(value: js.Array[PaymentLineItem]): Self = StObject.set(x, "lineItems", value.asInstanceOf[js.Any])
    
    inline def setLineItemsUndefined: Self = StObject.set(x, "lineItems", js.undefined)
    
    inline def setLineItemsVarargs(value: PaymentLineItem*): Self = StObject.set(x, "lineItems", js.Array(value*))
    
    inline def setPaymentOption(value: String): Self = StObject.set(x, "paymentOption", value.asInstanceOf[js.Any])
    
    inline def setPaymentOptionUndefined: Self = StObject.set(x, "paymentOption", js.undefined)
    
    inline def setPaymentSourceId(value: String): Self = StObject.set(x, "paymentSourceId", value.asInstanceOf[js.Any])
    
    inline def setPaymentSourceIdUndefined: Self = StObject.set(x, "paymentSourceId", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTotal(value: Money): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
  }
}
