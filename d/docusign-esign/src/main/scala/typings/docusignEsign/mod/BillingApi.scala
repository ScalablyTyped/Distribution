package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("docusign-esign", "BillingApi")
@js.native
class BillingApi protected () extends StObject {
  def this(apiClient: ApiClient) = this()
  
  def getBillingPlan(billingPlanId: String): js.Promise[BillingPlanResponse] = js.native
  def getBillingPlan(billingPlanId: String, callback: js.Function0[Unit]): js.Promise[BillingPlanResponse] = js.native
  
  def getCreditCardInfo(accountId: String): js.Promise[CreditCardInformation] = js.native
  def getCreditCardInfo(accountId: String, callback: js.Function0[Unit]): js.Promise[CreditCardInformation] = js.native
  
  def getDowngradeRequestBillingInfo(accountId: String): js.Promise[DowngradRequestBillingInfoResponse] = js.native
  def getDowngradeRequestBillingInfo(accountId: String, callback: js.Function0[Unit]): js.Promise[DowngradRequestBillingInfoResponse] = js.native
  
  def getInvoice(accountId: String, invoiceId: String): js.Promise[BillingInvoice] = js.native
  def getInvoice(accountId: String, invoiceId: String, callback: js.Function0[Unit]): js.Promise[BillingInvoice] = js.native
  
  def getPayment(accountId: String, paymentId: String): js.Promise[BillingPaymentItem] = js.native
  def getPayment(accountId: String, paymentId: String, callback: js.Function0[Unit]): js.Promise[BillingPaymentItem] = js.native
  
  def getPlan(accountId: String): js.Promise[AccountBillingPlanResponse] = js.native
  def getPlan(accountId: String, optsOrCallback: js.Any): js.Promise[AccountBillingPlanResponse] = js.native
  def getPlan(accountId: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[AccountBillingPlanResponse] = js.native
  def getPlan(accountId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[AccountBillingPlanResponse] = js.native
  
  def listBillingPlans(): js.Promise[BillingPlansResponse] = js.native
  def listBillingPlans(callback: js.Function0[Unit]): js.Promise[BillingPlansResponse] = js.native
  
  def listInvoices(accountId: String): js.Promise[BillingInvoicesResponse] = js.native
  def listInvoices(accountId: String, optsOrCallback: js.Any): js.Promise[BillingInvoicesResponse] = js.native
  def listInvoices(accountId: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[BillingInvoicesResponse] = js.native
  def listInvoices(accountId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[BillingInvoicesResponse] = js.native
  
  def listInvoicesPastDue(accountId: String): js.Promise[BillingInvoicesSummary] = js.native
  def listInvoicesPastDue(accountId: String, callback: js.Function0[Unit]): js.Promise[BillingInvoicesSummary] = js.native
  
  def listPayments(accountId: String): js.Promise[BillingPaymentsResponse] = js.native
  def listPayments(accountId: String, optsOrCallback: js.Any): js.Promise[BillingPaymentsResponse] = js.native
  def listPayments(accountId: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[BillingPaymentsResponse] = js.native
  def listPayments(accountId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[BillingPaymentsResponse] = js.native
  
  def makePayment(accountId: String): js.Promise[BillingPaymentResponse] = js.native
  def makePayment(accountId: String, optsOrCallback: js.Any): js.Promise[BillingPaymentResponse] = js.native
  def makePayment(accountId: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[BillingPaymentResponse] = js.native
  def makePayment(accountId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[BillingPaymentResponse] = js.native
  
  def purchaseEnvelopes(accountId: String): js.Promise[Unit] = js.native
  def purchaseEnvelopes(accountId: String, optsOrCallback: js.Any): js.Promise[Unit] = js.native
  def purchaseEnvelopes(accountId: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[Unit] = js.native
  def purchaseEnvelopes(accountId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[Unit] = js.native
  
  def updateDowngradeAccountBillingPlan(accountId: String): js.Promise[DowngradePlanUpdateResponse] = js.native
  def updateDowngradeAccountBillingPlan(accountId: String, optsOrCallback: js.Any): js.Promise[DowngradePlanUpdateResponse] = js.native
  def updateDowngradeAccountBillingPlan(accountId: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[DowngradePlanUpdateResponse] = js.native
  def updateDowngradeAccountBillingPlan(accountId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[DowngradePlanUpdateResponse] = js.native
  
  def updatePlan(accountId: String): js.Promise[BillingPlanUpdateResponse] = js.native
  def updatePlan(accountId: String, optsOrCallback: js.Any): js.Promise[BillingPlanUpdateResponse] = js.native
  def updatePlan(accountId: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[BillingPlanUpdateResponse] = js.native
  def updatePlan(accountId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[BillingPlanUpdateResponse] = js.native
}
