package typings.googleAppsScript.GoogleAppsScript

import typings.googleAppsScript.GoogleAppsScript.AdminReseller.Collection.CustomersCollection
import typings.googleAppsScript.GoogleAppsScript.AdminReseller.Collection.ResellernotifyCollection
import typings.googleAppsScript.GoogleAppsScript.AdminReseller.Collection.SubscriptionsCollection
import typings.googleAppsScript.GoogleAppsScript.AdminReseller.Schema.Address
import typings.googleAppsScript.GoogleAppsScript.AdminReseller.Schema.ChangePlanRequest
import typings.googleAppsScript.GoogleAppsScript.AdminReseller.Schema.Customer
import typings.googleAppsScript.GoogleAppsScript.AdminReseller.Schema.RenewalSettings
import typings.googleAppsScript.GoogleAppsScript.AdminReseller.Schema.ResellernotifyGetwatchdetailsResponse
import typings.googleAppsScript.GoogleAppsScript.AdminReseller.Schema.ResellernotifyResource
import typings.googleAppsScript.GoogleAppsScript.AdminReseller.Schema.Seats
import typings.googleAppsScript.GoogleAppsScript.AdminReseller.Schema.Subscription
import typings.googleAppsScript.GoogleAppsScript.AdminReseller.Schema.SubscriptionPlan
import typings.googleAppsScript.GoogleAppsScript.AdminReseller.Schema.SubscriptionPlanCommitmentInterval
import typings.googleAppsScript.GoogleAppsScript.AdminReseller.Schema.SubscriptionTransferInfo
import typings.googleAppsScript.GoogleAppsScript.AdminReseller.Schema.SubscriptionTrialSettings
import typings.googleAppsScript.GoogleAppsScript.AdminReseller.Schema.Subscriptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdminReseller extends StObject {
  
  var Customers: js.UndefOr[CustomersCollection] = js.native
  
  var Resellernotify: js.UndefOr[ResellernotifyCollection] = js.native
  
  var Subscriptions: js.UndefOr[SubscriptionsCollection] = js.native
  
  // Create a new instance of Address
  def newAddress(): Address = js.native
  
  // Create a new instance of ChangePlanRequest
  def newChangePlanRequest(): ChangePlanRequest = js.native
  
  // Create a new instance of Customer
  def newCustomer(): Customer = js.native
  
  // Create a new instance of RenewalSettings
  def newRenewalSettings(): RenewalSettings = js.native
  
  // Create a new instance of Seats
  def newSeats(): Seats = js.native
  
  // Create a new instance of Subscription
  def newSubscription(): Subscription = js.native
  
  // Create a new instance of SubscriptionPlan
  def newSubscriptionPlan(): SubscriptionPlan = js.native
  
  // Create a new instance of SubscriptionPlanCommitmentInterval
  def newSubscriptionPlanCommitmentInterval(): SubscriptionPlanCommitmentInterval = js.native
  
  // Create a new instance of SubscriptionTransferInfo
  def newSubscriptionTransferInfo(): SubscriptionTransferInfo = js.native
  
  // Create a new instance of SubscriptionTrialSettings
  def newSubscriptionTrialSettings(): SubscriptionTrialSettings = js.native
}
object AdminReseller {
  
  @scala.inline
  def apply(
    newAddress: () => Address,
    newChangePlanRequest: () => ChangePlanRequest,
    newCustomer: () => Customer,
    newRenewalSettings: () => RenewalSettings,
    newSeats: () => Seats,
    newSubscription: () => Subscription,
    newSubscriptionPlan: () => SubscriptionPlan,
    newSubscriptionPlanCommitmentInterval: () => SubscriptionPlanCommitmentInterval,
    newSubscriptionTransferInfo: () => SubscriptionTransferInfo,
    newSubscriptionTrialSettings: () => SubscriptionTrialSettings
  ): AdminReseller = {
    val __obj = js.Dynamic.literal(newAddress = js.Any.fromFunction0(newAddress), newChangePlanRequest = js.Any.fromFunction0(newChangePlanRequest), newCustomer = js.Any.fromFunction0(newCustomer), newRenewalSettings = js.Any.fromFunction0(newRenewalSettings), newSeats = js.Any.fromFunction0(newSeats), newSubscription = js.Any.fromFunction0(newSubscription), newSubscriptionPlan = js.Any.fromFunction0(newSubscriptionPlan), newSubscriptionPlanCommitmentInterval = js.Any.fromFunction0(newSubscriptionPlanCommitmentInterval), newSubscriptionTransferInfo = js.Any.fromFunction0(newSubscriptionTransferInfo), newSubscriptionTrialSettings = js.Any.fromFunction0(newSubscriptionTrialSettings))
    __obj.asInstanceOf[AdminReseller]
  }
  
  @scala.inline
  implicit class AdminResellerMutableBuilder[Self <: AdminReseller] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomers(value: CustomersCollection): Self = StObject.set(x, "Customers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomersUndefined: Self = StObject.set(x, "Customers", js.undefined)
    
    @scala.inline
    def setNewAddress(value: () => Address): Self = StObject.set(x, "newAddress", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewChangePlanRequest(value: () => ChangePlanRequest): Self = StObject.set(x, "newChangePlanRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewCustomer(value: () => Customer): Self = StObject.set(x, "newCustomer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewRenewalSettings(value: () => RenewalSettings): Self = StObject.set(x, "newRenewalSettings", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewSeats(value: () => Seats): Self = StObject.set(x, "newSeats", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewSubscription(value: () => Subscription): Self = StObject.set(x, "newSubscription", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewSubscriptionPlan(value: () => SubscriptionPlan): Self = StObject.set(x, "newSubscriptionPlan", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewSubscriptionPlanCommitmentInterval(value: () => SubscriptionPlanCommitmentInterval): Self = StObject.set(x, "newSubscriptionPlanCommitmentInterval", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewSubscriptionTransferInfo(value: () => SubscriptionTransferInfo): Self = StObject.set(x, "newSubscriptionTransferInfo", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewSubscriptionTrialSettings(value: () => SubscriptionTrialSettings): Self = StObject.set(x, "newSubscriptionTrialSettings", js.Any.fromFunction0(value))
    
    @scala.inline
    def setResellernotify(value: ResellernotifyCollection): Self = StObject.set(x, "Resellernotify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResellernotifyUndefined: Self = StObject.set(x, "Resellernotify", js.undefined)
    
    @scala.inline
    def setSubscriptions(value: SubscriptionsCollection): Self = StObject.set(x, "Subscriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionsUndefined: Self = StObject.set(x, "Subscriptions", js.undefined)
  }
  
  object Collection {
    
    @js.native
    trait CustomersCollection extends StObject {
      
      // Get a customer account.
      def get(customerId: String): Customer = js.native
      
      // Order a new customer's account.
      def insert(resource: Customer): Customer = js.native
      // Order a new customer's account.
      def insert(resource: Customer, optionalArgs: js.Object): Customer = js.native
      
      // Update a customer account's settings. This method supports patch semantics.
      def patch(resource: Customer, customerId: String): Customer = js.native
      
      // Update a customer account's settings.
      def update(resource: Customer, customerId: String): Customer = js.native
    }
    
    @js.native
    trait ResellernotifyCollection extends StObject {
      
      // Returns all the details of the watch corresponding to the reseller.
      def getwatchdetails(): ResellernotifyGetwatchdetailsResponse = js.native
      
      // Registers a Reseller for receiving notifications.
      def register(): ResellernotifyResource = js.native
      // Registers a Reseller for receiving notifications.
      def register(optionalArgs: js.Object): ResellernotifyResource = js.native
      
      // Unregisters a Reseller for receiving notifications.
      def unregister(): ResellernotifyResource = js.native
      // Unregisters a Reseller for receiving notifications.
      def unregister(optionalArgs: js.Object): ResellernotifyResource = js.native
    }
    
    @js.native
    trait SubscriptionsCollection extends StObject {
      
      // Activates a subscription previously suspended by the reseller
      def activate(customerId: String, subscriptionId: String): Subscription = js.native
      
      // Update a subscription plan. Use this method to update a plan for a 30-day trial or a flexible plan subscription to an annual commitment plan with monthly or yearly payments.
      def changePlan(resource: ChangePlanRequest, customerId: String, subscriptionId: String): Subscription = js.native
      
      // Update a user license's renewal settings. This is applicable for accounts with annual commitment plans only.
      def changeRenewalSettings(resource: RenewalSettings, customerId: String, subscriptionId: String): Subscription = js.native
      
      // Update a subscription's user license settings.
      def changeSeats(resource: Seats, customerId: String, subscriptionId: String): Subscription = js.native
      
      // Get a specific subscription.
      def get(customerId: String, subscriptionId: String): Subscription = js.native
      
      // Create or transfer a subscription.
      def insert(resource: Subscription, customerId: String): Subscription = js.native
      // Create or transfer a subscription.
      def insert(resource: Subscription, customerId: String, optionalArgs: js.Object): Subscription = js.native
      
      // List of subscriptions managed by the reseller. The list can be all subscriptions, all of a customer's subscriptions, or all of a customer's transferable subscriptions.
      def list(): Subscriptions = js.native
      // List of subscriptions managed by the reseller. The list can be all subscriptions, all of a customer's subscriptions, or all of a customer's transferable subscriptions.
      def list(optionalArgs: js.Object): Subscriptions = js.native
      
      // Cancel or transfer a subscription to direct.
      def remove(customerId: String, subscriptionId: String, deletionType: String): Unit = js.native
      
      // Immediately move a 30-day free trial subscription to a paid service subscription.
      def startPaidService(customerId: String, subscriptionId: String): Subscription = js.native
      
      // Suspends an active subscription.
      def suspend(customerId: String, subscriptionId: String): Subscription = js.native
    }
  }
  
  object Schema {
    
    @js.native
    trait Address extends StObject {
      
      var addressLine1: js.UndefOr[String] = js.native
      
      var addressLine2: js.UndefOr[String] = js.native
      
      var addressLine3: js.UndefOr[String] = js.native
      
      var contactName: js.UndefOr[String] = js.native
      
      var countryCode: js.UndefOr[String] = js.native
      
      var kind: js.UndefOr[String] = js.native
      
      var locality: js.UndefOr[String] = js.native
      
      var organizationName: js.UndefOr[String] = js.native
      
      var postalCode: js.UndefOr[String] = js.native
      
      var region: js.UndefOr[String] = js.native
    }
    object Address {
      
      @scala.inline
      def apply(): Address = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Address]
      }
      
      @scala.inline
      implicit class AddressMutableBuilder[Self <: Address] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAddressLine1(value: String): Self = StObject.set(x, "addressLine1", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAddressLine1Undefined: Self = StObject.set(x, "addressLine1", js.undefined)
        
        @scala.inline
        def setAddressLine2(value: String): Self = StObject.set(x, "addressLine2", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAddressLine2Undefined: Self = StObject.set(x, "addressLine2", js.undefined)
        
        @scala.inline
        def setAddressLine3(value: String): Self = StObject.set(x, "addressLine3", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAddressLine3Undefined: Self = StObject.set(x, "addressLine3", js.undefined)
        
        @scala.inline
        def setContactName(value: String): Self = StObject.set(x, "contactName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContactNameUndefined: Self = StObject.set(x, "contactName", js.undefined)
        
        @scala.inline
        def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCountryCodeUndefined: Self = StObject.set(x, "countryCode", js.undefined)
        
        @scala.inline
        def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        @scala.inline
        def setLocality(value: String): Self = StObject.set(x, "locality", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLocalityUndefined: Self = StObject.set(x, "locality", js.undefined)
        
        @scala.inline
        def setOrganizationName(value: String): Self = StObject.set(x, "organizationName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOrganizationNameUndefined: Self = StObject.set(x, "organizationName", js.undefined)
        
        @scala.inline
        def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPostalCodeUndefined: Self = StObject.set(x, "postalCode", js.undefined)
        
        @scala.inline
        def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      }
    }
    
    @js.native
    trait ChangePlanRequest extends StObject {
      
      var dealCode: js.UndefOr[String] = js.native
      
      var kind: js.UndefOr[String] = js.native
      
      var planName: js.UndefOr[String] = js.native
      
      var purchaseOrderId: js.UndefOr[String] = js.native
      
      var seats: js.UndefOr[Seats] = js.native
    }
    object ChangePlanRequest {
      
      @scala.inline
      def apply(): ChangePlanRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ChangePlanRequest]
      }
      
      @scala.inline
      implicit class ChangePlanRequestMutableBuilder[Self <: ChangePlanRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDealCode(value: String): Self = StObject.set(x, "dealCode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDealCodeUndefined: Self = StObject.set(x, "dealCode", js.undefined)
        
        @scala.inline
        def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        @scala.inline
        def setPlanName(value: String): Self = StObject.set(x, "planName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPlanNameUndefined: Self = StObject.set(x, "planName", js.undefined)
        
        @scala.inline
        def setPurchaseOrderId(value: String): Self = StObject.set(x, "purchaseOrderId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPurchaseOrderIdUndefined: Self = StObject.set(x, "purchaseOrderId", js.undefined)
        
        @scala.inline
        def setSeats(value: Seats): Self = StObject.set(x, "seats", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSeatsUndefined: Self = StObject.set(x, "seats", js.undefined)
      }
    }
    
    @js.native
    trait Customer extends StObject {
      
      var alternateEmail: js.UndefOr[String] = js.native
      
      var customerDomain: js.UndefOr[String] = js.native
      
      var customerDomainVerified: js.UndefOr[Boolean] = js.native
      
      var customerId: js.UndefOr[String] = js.native
      
      var kind: js.UndefOr[String] = js.native
      
      var phoneNumber: js.UndefOr[String] = js.native
      
      var postalAddress: js.UndefOr[Address] = js.native
      
      var resourceUiUrl: js.UndefOr[String] = js.native
    }
    object Customer {
      
      @scala.inline
      def apply(): Customer = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Customer]
      }
      
      @scala.inline
      implicit class CustomerMutableBuilder[Self <: Customer] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAlternateEmail(value: String): Self = StObject.set(x, "alternateEmail", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAlternateEmailUndefined: Self = StObject.set(x, "alternateEmail", js.undefined)
        
        @scala.inline
        def setCustomerDomain(value: String): Self = StObject.set(x, "customerDomain", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCustomerDomainUndefined: Self = StObject.set(x, "customerDomain", js.undefined)
        
        @scala.inline
        def setCustomerDomainVerified(value: Boolean): Self = StObject.set(x, "customerDomainVerified", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCustomerDomainVerifiedUndefined: Self = StObject.set(x, "customerDomainVerified", js.undefined)
        
        @scala.inline
        def setCustomerId(value: String): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCustomerIdUndefined: Self = StObject.set(x, "customerId", js.undefined)
        
        @scala.inline
        def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        @scala.inline
        def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
        
        @scala.inline
        def setPostalAddress(value: Address): Self = StObject.set(x, "postalAddress", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPostalAddressUndefined: Self = StObject.set(x, "postalAddress", js.undefined)
        
        @scala.inline
        def setResourceUiUrl(value: String): Self = StObject.set(x, "resourceUiUrl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResourceUiUrlUndefined: Self = StObject.set(x, "resourceUiUrl", js.undefined)
      }
    }
    
    @js.native
    trait RenewalSettings extends StObject {
      
      var kind: js.UndefOr[String] = js.native
      
      var renewalType: js.UndefOr[String] = js.native
    }
    object RenewalSettings {
      
      @scala.inline
      def apply(): RenewalSettings = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[RenewalSettings]
      }
      
      @scala.inline
      implicit class RenewalSettingsMutableBuilder[Self <: RenewalSettings] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        @scala.inline
        def setRenewalType(value: String): Self = StObject.set(x, "renewalType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRenewalTypeUndefined: Self = StObject.set(x, "renewalType", js.undefined)
      }
    }
    
    @js.native
    trait ResellernotifyGetwatchdetailsResponse extends StObject {
      
      var serviceAccountEmailAddresses: js.UndefOr[js.Array[String]] = js.native
      
      var topicName: js.UndefOr[String] = js.native
    }
    object ResellernotifyGetwatchdetailsResponse {
      
      @scala.inline
      def apply(): ResellernotifyGetwatchdetailsResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ResellernotifyGetwatchdetailsResponse]
      }
      
      @scala.inline
      implicit class ResellernotifyGetwatchdetailsResponseMutableBuilder[Self <: ResellernotifyGetwatchdetailsResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setServiceAccountEmailAddresses(value: js.Array[String]): Self = StObject.set(x, "serviceAccountEmailAddresses", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setServiceAccountEmailAddressesUndefined: Self = StObject.set(x, "serviceAccountEmailAddresses", js.undefined)
        
        @scala.inline
        def setServiceAccountEmailAddressesVarargs(value: String*): Self = StObject.set(x, "serviceAccountEmailAddresses", js.Array(value :_*))
        
        @scala.inline
        def setTopicName(value: String): Self = StObject.set(x, "topicName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTopicNameUndefined: Self = StObject.set(x, "topicName", js.undefined)
      }
    }
    
    @js.native
    trait ResellernotifyResource extends StObject {
      
      var topicName: js.UndefOr[String] = js.native
    }
    object ResellernotifyResource {
      
      @scala.inline
      def apply(): ResellernotifyResource = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ResellernotifyResource]
      }
      
      @scala.inline
      implicit class ResellernotifyResourceMutableBuilder[Self <: ResellernotifyResource] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setTopicName(value: String): Self = StObject.set(x, "topicName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTopicNameUndefined: Self = StObject.set(x, "topicName", js.undefined)
      }
    }
    
    @js.native
    trait Seats extends StObject {
      
      var kind: js.UndefOr[String] = js.native
      
      var licensedNumberOfSeats: js.UndefOr[Double] = js.native
      
      var maximumNumberOfSeats: js.UndefOr[Double] = js.native
      
      var numberOfSeats: js.UndefOr[Double] = js.native
    }
    object Seats {
      
      @scala.inline
      def apply(): Seats = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Seats]
      }
      
      @scala.inline
      implicit class SeatsMutableBuilder[Self <: Seats] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        @scala.inline
        def setLicensedNumberOfSeats(value: Double): Self = StObject.set(x, "licensedNumberOfSeats", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLicensedNumberOfSeatsUndefined: Self = StObject.set(x, "licensedNumberOfSeats", js.undefined)
        
        @scala.inline
        def setMaximumNumberOfSeats(value: Double): Self = StObject.set(x, "maximumNumberOfSeats", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMaximumNumberOfSeatsUndefined: Self = StObject.set(x, "maximumNumberOfSeats", js.undefined)
        
        @scala.inline
        def setNumberOfSeats(value: Double): Self = StObject.set(x, "numberOfSeats", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNumberOfSeatsUndefined: Self = StObject.set(x, "numberOfSeats", js.undefined)
      }
    }
    
    @js.native
    trait Subscription extends StObject {
      
      var billingMethod: js.UndefOr[String] = js.native
      
      var creationTime: js.UndefOr[String] = js.native
      
      var customerDomain: js.UndefOr[String] = js.native
      
      var customerId: js.UndefOr[String] = js.native
      
      var dealCode: js.UndefOr[String] = js.native
      
      var kind: js.UndefOr[String] = js.native
      
      var plan: js.UndefOr[SubscriptionPlan] = js.native
      
      var purchaseOrderId: js.UndefOr[String] = js.native
      
      var renewalSettings: js.UndefOr[RenewalSettings] = js.native
      
      var resourceUiUrl: js.UndefOr[String] = js.native
      
      var seats: js.UndefOr[Seats] = js.native
      
      var skuId: js.UndefOr[String] = js.native
      
      var skuName: js.UndefOr[String] = js.native
      
      var status: js.UndefOr[String] = js.native
      
      var subscriptionId: js.UndefOr[String] = js.native
      
      var suspensionReasons: js.UndefOr[js.Array[String]] = js.native
      
      var transferInfo: js.UndefOr[SubscriptionTransferInfo] = js.native
      
      var trialSettings: js.UndefOr[SubscriptionTrialSettings] = js.native
    }
    object Subscription {
      
      @scala.inline
      def apply(): Subscription = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Subscription]
      }
      
      @scala.inline
      implicit class SubscriptionMutableBuilder[Self <: Subscription] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBillingMethod(value: String): Self = StObject.set(x, "billingMethod", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBillingMethodUndefined: Self = StObject.set(x, "billingMethod", js.undefined)
        
        @scala.inline
        def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
        
        @scala.inline
        def setCustomerDomain(value: String): Self = StObject.set(x, "customerDomain", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCustomerDomainUndefined: Self = StObject.set(x, "customerDomain", js.undefined)
        
        @scala.inline
        def setCustomerId(value: String): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCustomerIdUndefined: Self = StObject.set(x, "customerId", js.undefined)
        
        @scala.inline
        def setDealCode(value: String): Self = StObject.set(x, "dealCode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDealCodeUndefined: Self = StObject.set(x, "dealCode", js.undefined)
        
        @scala.inline
        def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        @scala.inline
        def setPlan(value: SubscriptionPlan): Self = StObject.set(x, "plan", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPlanUndefined: Self = StObject.set(x, "plan", js.undefined)
        
        @scala.inline
        def setPurchaseOrderId(value: String): Self = StObject.set(x, "purchaseOrderId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPurchaseOrderIdUndefined: Self = StObject.set(x, "purchaseOrderId", js.undefined)
        
        @scala.inline
        def setRenewalSettings(value: RenewalSettings): Self = StObject.set(x, "renewalSettings", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRenewalSettingsUndefined: Self = StObject.set(x, "renewalSettings", js.undefined)
        
        @scala.inline
        def setResourceUiUrl(value: String): Self = StObject.set(x, "resourceUiUrl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResourceUiUrlUndefined: Self = StObject.set(x, "resourceUiUrl", js.undefined)
        
        @scala.inline
        def setSeats(value: Seats): Self = StObject.set(x, "seats", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSeatsUndefined: Self = StObject.set(x, "seats", js.undefined)
        
        @scala.inline
        def setSkuId(value: String): Self = StObject.set(x, "skuId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSkuIdUndefined: Self = StObject.set(x, "skuId", js.undefined)
        
        @scala.inline
        def setSkuName(value: String): Self = StObject.set(x, "skuName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSkuNameUndefined: Self = StObject.set(x, "skuName", js.undefined)
        
        @scala.inline
        def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
        
        @scala.inline
        def setSubscriptionId(value: String): Self = StObject.set(x, "subscriptionId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSubscriptionIdUndefined: Self = StObject.set(x, "subscriptionId", js.undefined)
        
        @scala.inline
        def setSuspensionReasons(value: js.Array[String]): Self = StObject.set(x, "suspensionReasons", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSuspensionReasonsUndefined: Self = StObject.set(x, "suspensionReasons", js.undefined)
        
        @scala.inline
        def setSuspensionReasonsVarargs(value: String*): Self = StObject.set(x, "suspensionReasons", js.Array(value :_*))
        
        @scala.inline
        def setTransferInfo(value: SubscriptionTransferInfo): Self = StObject.set(x, "transferInfo", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTransferInfoUndefined: Self = StObject.set(x, "transferInfo", js.undefined)
        
        @scala.inline
        def setTrialSettings(value: SubscriptionTrialSettings): Self = StObject.set(x, "trialSettings", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTrialSettingsUndefined: Self = StObject.set(x, "trialSettings", js.undefined)
      }
    }
    
    @js.native
    trait SubscriptionPlan extends StObject {
      
      var commitmentInterval: js.UndefOr[SubscriptionPlanCommitmentInterval] = js.native
      
      var isCommitmentPlan: js.UndefOr[Boolean] = js.native
      
      var planName: js.UndefOr[String] = js.native
    }
    object SubscriptionPlan {
      
      @scala.inline
      def apply(): SubscriptionPlan = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SubscriptionPlan]
      }
      
      @scala.inline
      implicit class SubscriptionPlanMutableBuilder[Self <: SubscriptionPlan] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCommitmentInterval(value: SubscriptionPlanCommitmentInterval): Self = StObject.set(x, "commitmentInterval", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCommitmentIntervalUndefined: Self = StObject.set(x, "commitmentInterval", js.undefined)
        
        @scala.inline
        def setIsCommitmentPlan(value: Boolean): Self = StObject.set(x, "isCommitmentPlan", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsCommitmentPlanUndefined: Self = StObject.set(x, "isCommitmentPlan", js.undefined)
        
        @scala.inline
        def setPlanName(value: String): Self = StObject.set(x, "planName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPlanNameUndefined: Self = StObject.set(x, "planName", js.undefined)
      }
    }
    
    @js.native
    trait SubscriptionPlanCommitmentInterval extends StObject {
      
      var endTime: js.UndefOr[String] = js.native
      
      var startTime: js.UndefOr[String] = js.native
    }
    object SubscriptionPlanCommitmentInterval {
      
      @scala.inline
      def apply(): SubscriptionPlanCommitmentInterval = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SubscriptionPlanCommitmentInterval]
      }
      
      @scala.inline
      implicit class SubscriptionPlanCommitmentIntervalMutableBuilder[Self <: SubscriptionPlanCommitmentInterval] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
        
        @scala.inline
        def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
      }
    }
    
    @js.native
    trait SubscriptionTransferInfo extends StObject {
      
      var minimumTransferableSeats: js.UndefOr[Double] = js.native
      
      var transferabilityExpirationTime: js.UndefOr[String] = js.native
    }
    object SubscriptionTransferInfo {
      
      @scala.inline
      def apply(): SubscriptionTransferInfo = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SubscriptionTransferInfo]
      }
      
      @scala.inline
      implicit class SubscriptionTransferInfoMutableBuilder[Self <: SubscriptionTransferInfo] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMinimumTransferableSeats(value: Double): Self = StObject.set(x, "minimumTransferableSeats", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMinimumTransferableSeatsUndefined: Self = StObject.set(x, "minimumTransferableSeats", js.undefined)
        
        @scala.inline
        def setTransferabilityExpirationTime(value: String): Self = StObject.set(x, "transferabilityExpirationTime", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTransferabilityExpirationTimeUndefined: Self = StObject.set(x, "transferabilityExpirationTime", js.undefined)
      }
    }
    
    @js.native
    trait SubscriptionTrialSettings extends StObject {
      
      var isInTrial: js.UndefOr[Boolean] = js.native
      
      var trialEndTime: js.UndefOr[String] = js.native
    }
    object SubscriptionTrialSettings {
      
      @scala.inline
      def apply(): SubscriptionTrialSettings = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SubscriptionTrialSettings]
      }
      
      @scala.inline
      implicit class SubscriptionTrialSettingsMutableBuilder[Self <: SubscriptionTrialSettings] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setIsInTrial(value: Boolean): Self = StObject.set(x, "isInTrial", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsInTrialUndefined: Self = StObject.set(x, "isInTrial", js.undefined)
        
        @scala.inline
        def setTrialEndTime(value: String): Self = StObject.set(x, "trialEndTime", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTrialEndTimeUndefined: Self = StObject.set(x, "trialEndTime", js.undefined)
      }
    }
    
    @js.native
    trait Subscriptions extends StObject {
      
      var kind: js.UndefOr[String] = js.native
      
      var nextPageToken: js.UndefOr[String] = js.native
      
      var subscriptions: js.UndefOr[js.Array[Subscription]] = js.native
    }
    object Subscriptions {
      
      @scala.inline
      def apply(): Subscriptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Subscriptions]
      }
      
      @scala.inline
      implicit class SubscriptionsMutableBuilder[Self <: Subscriptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        @scala.inline
        def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        
        @scala.inline
        def setSubscriptions(value: js.Array[Subscription]): Self = StObject.set(x, "subscriptions", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSubscriptionsUndefined: Self = StObject.set(x, "subscriptions", js.undefined)
        
        @scala.inline
        def setSubscriptionsVarargs(value: Subscription*): Self = StObject.set(x, "subscriptions", js.Array(value :_*))
      }
    }
  }
}
