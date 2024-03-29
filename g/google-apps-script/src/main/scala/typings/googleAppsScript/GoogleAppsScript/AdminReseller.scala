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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdminReseller extends StObject {
  
  var Customers: js.UndefOr[CustomersCollection] = js.undefined
  
  var Resellernotify: js.UndefOr[ResellernotifyCollection] = js.undefined
  
  var Subscriptions: js.UndefOr[SubscriptionsCollection] = js.undefined
  
  // Create a new instance of Address
  def newAddress(): Address
  
  // Create a new instance of ChangePlanRequest
  def newChangePlanRequest(): ChangePlanRequest
  
  // Create a new instance of Customer
  def newCustomer(): Customer
  
  // Create a new instance of RenewalSettings
  def newRenewalSettings(): RenewalSettings
  
  // Create a new instance of Seats
  def newSeats(): Seats
  
  // Create a new instance of Subscription
  def newSubscription(): Subscription
  
  // Create a new instance of SubscriptionPlan
  def newSubscriptionPlan(): SubscriptionPlan
  
  // Create a new instance of SubscriptionPlanCommitmentInterval
  def newSubscriptionPlanCommitmentInterval(): SubscriptionPlanCommitmentInterval
  
  // Create a new instance of SubscriptionTransferInfo
  def newSubscriptionTransferInfo(): SubscriptionTransferInfo
  
  // Create a new instance of SubscriptionTrialSettings
  def newSubscriptionTrialSettings(): SubscriptionTrialSettings
}
object AdminReseller {
  
  inline def apply(
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AdminReseller] (val x: Self) extends AnyVal {
    
    inline def setCustomers(value: CustomersCollection): Self = StObject.set(x, "Customers", value.asInstanceOf[js.Any])
    
    inline def setCustomersUndefined: Self = StObject.set(x, "Customers", js.undefined)
    
    inline def setNewAddress(value: () => Address): Self = StObject.set(x, "newAddress", js.Any.fromFunction0(value))
    
    inline def setNewChangePlanRequest(value: () => ChangePlanRequest): Self = StObject.set(x, "newChangePlanRequest", js.Any.fromFunction0(value))
    
    inline def setNewCustomer(value: () => Customer): Self = StObject.set(x, "newCustomer", js.Any.fromFunction0(value))
    
    inline def setNewRenewalSettings(value: () => RenewalSettings): Self = StObject.set(x, "newRenewalSettings", js.Any.fromFunction0(value))
    
    inline def setNewSeats(value: () => Seats): Self = StObject.set(x, "newSeats", js.Any.fromFunction0(value))
    
    inline def setNewSubscription(value: () => Subscription): Self = StObject.set(x, "newSubscription", js.Any.fromFunction0(value))
    
    inline def setNewSubscriptionPlan(value: () => SubscriptionPlan): Self = StObject.set(x, "newSubscriptionPlan", js.Any.fromFunction0(value))
    
    inline def setNewSubscriptionPlanCommitmentInterval(value: () => SubscriptionPlanCommitmentInterval): Self = StObject.set(x, "newSubscriptionPlanCommitmentInterval", js.Any.fromFunction0(value))
    
    inline def setNewSubscriptionTransferInfo(value: () => SubscriptionTransferInfo): Self = StObject.set(x, "newSubscriptionTransferInfo", js.Any.fromFunction0(value))
    
    inline def setNewSubscriptionTrialSettings(value: () => SubscriptionTrialSettings): Self = StObject.set(x, "newSubscriptionTrialSettings", js.Any.fromFunction0(value))
    
    inline def setResellernotify(value: ResellernotifyCollection): Self = StObject.set(x, "Resellernotify", value.asInstanceOf[js.Any])
    
    inline def setResellernotifyUndefined: Self = StObject.set(x, "Resellernotify", js.undefined)
    
    inline def setSubscriptions(value: SubscriptionsCollection): Self = StObject.set(x, "Subscriptions", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionsUndefined: Self = StObject.set(x, "Subscriptions", js.undefined)
  }
  
  object Schema {
    
    trait Address extends StObject {
      
      var addressLine1: js.UndefOr[String] = js.undefined
      
      var addressLine2: js.UndefOr[String] = js.undefined
      
      var addressLine3: js.UndefOr[String] = js.undefined
      
      var contactName: js.UndefOr[String] = js.undefined
      
      var countryCode: js.UndefOr[String] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var locality: js.UndefOr[String] = js.undefined
      
      var organizationName: js.UndefOr[String] = js.undefined
      
      var postalCode: js.UndefOr[String] = js.undefined
      
      var region: js.UndefOr[String] = js.undefined
    }
    object Address {
      
      inline def apply(): Address = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Address]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Address] (val x: Self) extends AnyVal {
        
        inline def setAddressLine1(value: String): Self = StObject.set(x, "addressLine1", value.asInstanceOf[js.Any])
        
        inline def setAddressLine1Undefined: Self = StObject.set(x, "addressLine1", js.undefined)
        
        inline def setAddressLine2(value: String): Self = StObject.set(x, "addressLine2", value.asInstanceOf[js.Any])
        
        inline def setAddressLine2Undefined: Self = StObject.set(x, "addressLine2", js.undefined)
        
        inline def setAddressLine3(value: String): Self = StObject.set(x, "addressLine3", value.asInstanceOf[js.Any])
        
        inline def setAddressLine3Undefined: Self = StObject.set(x, "addressLine3", js.undefined)
        
        inline def setContactName(value: String): Self = StObject.set(x, "contactName", value.asInstanceOf[js.Any])
        
        inline def setContactNameUndefined: Self = StObject.set(x, "contactName", js.undefined)
        
        inline def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
        
        inline def setCountryCodeUndefined: Self = StObject.set(x, "countryCode", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setLocality(value: String): Self = StObject.set(x, "locality", value.asInstanceOf[js.Any])
        
        inline def setLocalityUndefined: Self = StObject.set(x, "locality", js.undefined)
        
        inline def setOrganizationName(value: String): Self = StObject.set(x, "organizationName", value.asInstanceOf[js.Any])
        
        inline def setOrganizationNameUndefined: Self = StObject.set(x, "organizationName", js.undefined)
        
        inline def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
        
        inline def setPostalCodeUndefined: Self = StObject.set(x, "postalCode", js.undefined)
        
        inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
        
        inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      }
    }
    
    trait ChangePlanRequest extends StObject {
      
      var dealCode: js.UndefOr[String] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var planName: js.UndefOr[String] = js.undefined
      
      var purchaseOrderId: js.UndefOr[String] = js.undefined
      
      var seats: js.UndefOr[Seats] = js.undefined
    }
    object ChangePlanRequest {
      
      inline def apply(): ChangePlanRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ChangePlanRequest]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ChangePlanRequest] (val x: Self) extends AnyVal {
        
        inline def setDealCode(value: String): Self = StObject.set(x, "dealCode", value.asInstanceOf[js.Any])
        
        inline def setDealCodeUndefined: Self = StObject.set(x, "dealCode", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setPlanName(value: String): Self = StObject.set(x, "planName", value.asInstanceOf[js.Any])
        
        inline def setPlanNameUndefined: Self = StObject.set(x, "planName", js.undefined)
        
        inline def setPurchaseOrderId(value: String): Self = StObject.set(x, "purchaseOrderId", value.asInstanceOf[js.Any])
        
        inline def setPurchaseOrderIdUndefined: Self = StObject.set(x, "purchaseOrderId", js.undefined)
        
        inline def setSeats(value: Seats): Self = StObject.set(x, "seats", value.asInstanceOf[js.Any])
        
        inline def setSeatsUndefined: Self = StObject.set(x, "seats", js.undefined)
      }
    }
    
    trait Customer extends StObject {
      
      var alternateEmail: js.UndefOr[String] = js.undefined
      
      var customerDomain: js.UndefOr[String] = js.undefined
      
      var customerDomainVerified: js.UndefOr[Boolean] = js.undefined
      
      var customerId: js.UndefOr[String] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var phoneNumber: js.UndefOr[String] = js.undefined
      
      var postalAddress: js.UndefOr[Address] = js.undefined
      
      var resourceUiUrl: js.UndefOr[String] = js.undefined
    }
    object Customer {
      
      inline def apply(): Customer = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Customer]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Customer] (val x: Self) extends AnyVal {
        
        inline def setAlternateEmail(value: String): Self = StObject.set(x, "alternateEmail", value.asInstanceOf[js.Any])
        
        inline def setAlternateEmailUndefined: Self = StObject.set(x, "alternateEmail", js.undefined)
        
        inline def setCustomerDomain(value: String): Self = StObject.set(x, "customerDomain", value.asInstanceOf[js.Any])
        
        inline def setCustomerDomainUndefined: Self = StObject.set(x, "customerDomain", js.undefined)
        
        inline def setCustomerDomainVerified(value: Boolean): Self = StObject.set(x, "customerDomainVerified", value.asInstanceOf[js.Any])
        
        inline def setCustomerDomainVerifiedUndefined: Self = StObject.set(x, "customerDomainVerified", js.undefined)
        
        inline def setCustomerId(value: String): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
        
        inline def setCustomerIdUndefined: Self = StObject.set(x, "customerId", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
        
        inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
        
        inline def setPostalAddress(value: Address): Self = StObject.set(x, "postalAddress", value.asInstanceOf[js.Any])
        
        inline def setPostalAddressUndefined: Self = StObject.set(x, "postalAddress", js.undefined)
        
        inline def setResourceUiUrl(value: String): Self = StObject.set(x, "resourceUiUrl", value.asInstanceOf[js.Any])
        
        inline def setResourceUiUrlUndefined: Self = StObject.set(x, "resourceUiUrl", js.undefined)
      }
    }
    
    trait RenewalSettings extends StObject {
      
      var kind: js.UndefOr[String] = js.undefined
      
      var renewalType: js.UndefOr[String] = js.undefined
    }
    object RenewalSettings {
      
      inline def apply(): RenewalSettings = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[RenewalSettings]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: RenewalSettings] (val x: Self) extends AnyVal {
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setRenewalType(value: String): Self = StObject.set(x, "renewalType", value.asInstanceOf[js.Any])
        
        inline def setRenewalTypeUndefined: Self = StObject.set(x, "renewalType", js.undefined)
      }
    }
    
    trait ResellernotifyGetwatchdetailsResponse extends StObject {
      
      var serviceAccountEmailAddresses: js.UndefOr[js.Array[String]] = js.undefined
      
      var topicName: js.UndefOr[String] = js.undefined
    }
    object ResellernotifyGetwatchdetailsResponse {
      
      inline def apply(): ResellernotifyGetwatchdetailsResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ResellernotifyGetwatchdetailsResponse]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ResellernotifyGetwatchdetailsResponse] (val x: Self) extends AnyVal {
        
        inline def setServiceAccountEmailAddresses(value: js.Array[String]): Self = StObject.set(x, "serviceAccountEmailAddresses", value.asInstanceOf[js.Any])
        
        inline def setServiceAccountEmailAddressesUndefined: Self = StObject.set(x, "serviceAccountEmailAddresses", js.undefined)
        
        inline def setServiceAccountEmailAddressesVarargs(value: String*): Self = StObject.set(x, "serviceAccountEmailAddresses", js.Array(value*))
        
        inline def setTopicName(value: String): Self = StObject.set(x, "topicName", value.asInstanceOf[js.Any])
        
        inline def setTopicNameUndefined: Self = StObject.set(x, "topicName", js.undefined)
      }
    }
    
    trait ResellernotifyResource extends StObject {
      
      var topicName: js.UndefOr[String] = js.undefined
    }
    object ResellernotifyResource {
      
      inline def apply(): ResellernotifyResource = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ResellernotifyResource]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ResellernotifyResource] (val x: Self) extends AnyVal {
        
        inline def setTopicName(value: String): Self = StObject.set(x, "topicName", value.asInstanceOf[js.Any])
        
        inline def setTopicNameUndefined: Self = StObject.set(x, "topicName", js.undefined)
      }
    }
    
    trait Seats extends StObject {
      
      var kind: js.UndefOr[String] = js.undefined
      
      var licensedNumberOfSeats: js.UndefOr[Double] = js.undefined
      
      var maximumNumberOfSeats: js.UndefOr[Double] = js.undefined
      
      var numberOfSeats: js.UndefOr[Double] = js.undefined
    }
    object Seats {
      
      inline def apply(): Seats = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Seats]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Seats] (val x: Self) extends AnyVal {
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setLicensedNumberOfSeats(value: Double): Self = StObject.set(x, "licensedNumberOfSeats", value.asInstanceOf[js.Any])
        
        inline def setLicensedNumberOfSeatsUndefined: Self = StObject.set(x, "licensedNumberOfSeats", js.undefined)
        
        inline def setMaximumNumberOfSeats(value: Double): Self = StObject.set(x, "maximumNumberOfSeats", value.asInstanceOf[js.Any])
        
        inline def setMaximumNumberOfSeatsUndefined: Self = StObject.set(x, "maximumNumberOfSeats", js.undefined)
        
        inline def setNumberOfSeats(value: Double): Self = StObject.set(x, "numberOfSeats", value.asInstanceOf[js.Any])
        
        inline def setNumberOfSeatsUndefined: Self = StObject.set(x, "numberOfSeats", js.undefined)
      }
    }
    
    trait Subscription extends StObject {
      
      var billingMethod: js.UndefOr[String] = js.undefined
      
      var creationTime: js.UndefOr[String] = js.undefined
      
      var customerDomain: js.UndefOr[String] = js.undefined
      
      var customerId: js.UndefOr[String] = js.undefined
      
      var dealCode: js.UndefOr[String] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var plan: js.UndefOr[SubscriptionPlan] = js.undefined
      
      var purchaseOrderId: js.UndefOr[String] = js.undefined
      
      var renewalSettings: js.UndefOr[RenewalSettings] = js.undefined
      
      var resourceUiUrl: js.UndefOr[String] = js.undefined
      
      var seats: js.UndefOr[Seats] = js.undefined
      
      var skuId: js.UndefOr[String] = js.undefined
      
      var skuName: js.UndefOr[String] = js.undefined
      
      var status: js.UndefOr[String] = js.undefined
      
      var subscriptionId: js.UndefOr[String] = js.undefined
      
      var suspensionReasons: js.UndefOr[js.Array[String]] = js.undefined
      
      var transferInfo: js.UndefOr[SubscriptionTransferInfo] = js.undefined
      
      var trialSettings: js.UndefOr[SubscriptionTrialSettings] = js.undefined
    }
    object Subscription {
      
      inline def apply(): Subscription = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Subscription]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Subscription] (val x: Self) extends AnyVal {
        
        inline def setBillingMethod(value: String): Self = StObject.set(x, "billingMethod", value.asInstanceOf[js.Any])
        
        inline def setBillingMethodUndefined: Self = StObject.set(x, "billingMethod", js.undefined)
        
        inline def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
        
        inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
        
        inline def setCustomerDomain(value: String): Self = StObject.set(x, "customerDomain", value.asInstanceOf[js.Any])
        
        inline def setCustomerDomainUndefined: Self = StObject.set(x, "customerDomain", js.undefined)
        
        inline def setCustomerId(value: String): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
        
        inline def setCustomerIdUndefined: Self = StObject.set(x, "customerId", js.undefined)
        
        inline def setDealCode(value: String): Self = StObject.set(x, "dealCode", value.asInstanceOf[js.Any])
        
        inline def setDealCodeUndefined: Self = StObject.set(x, "dealCode", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setPlan(value: SubscriptionPlan): Self = StObject.set(x, "plan", value.asInstanceOf[js.Any])
        
        inline def setPlanUndefined: Self = StObject.set(x, "plan", js.undefined)
        
        inline def setPurchaseOrderId(value: String): Self = StObject.set(x, "purchaseOrderId", value.asInstanceOf[js.Any])
        
        inline def setPurchaseOrderIdUndefined: Self = StObject.set(x, "purchaseOrderId", js.undefined)
        
        inline def setRenewalSettings(value: RenewalSettings): Self = StObject.set(x, "renewalSettings", value.asInstanceOf[js.Any])
        
        inline def setRenewalSettingsUndefined: Self = StObject.set(x, "renewalSettings", js.undefined)
        
        inline def setResourceUiUrl(value: String): Self = StObject.set(x, "resourceUiUrl", value.asInstanceOf[js.Any])
        
        inline def setResourceUiUrlUndefined: Self = StObject.set(x, "resourceUiUrl", js.undefined)
        
        inline def setSeats(value: Seats): Self = StObject.set(x, "seats", value.asInstanceOf[js.Any])
        
        inline def setSeatsUndefined: Self = StObject.set(x, "seats", js.undefined)
        
        inline def setSkuId(value: String): Self = StObject.set(x, "skuId", value.asInstanceOf[js.Any])
        
        inline def setSkuIdUndefined: Self = StObject.set(x, "skuId", js.undefined)
        
        inline def setSkuName(value: String): Self = StObject.set(x, "skuName", value.asInstanceOf[js.Any])
        
        inline def setSkuNameUndefined: Self = StObject.set(x, "skuName", js.undefined)
        
        inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
        
        inline def setSubscriptionId(value: String): Self = StObject.set(x, "subscriptionId", value.asInstanceOf[js.Any])
        
        inline def setSubscriptionIdUndefined: Self = StObject.set(x, "subscriptionId", js.undefined)
        
        inline def setSuspensionReasons(value: js.Array[String]): Self = StObject.set(x, "suspensionReasons", value.asInstanceOf[js.Any])
        
        inline def setSuspensionReasonsUndefined: Self = StObject.set(x, "suspensionReasons", js.undefined)
        
        inline def setSuspensionReasonsVarargs(value: String*): Self = StObject.set(x, "suspensionReasons", js.Array(value*))
        
        inline def setTransferInfo(value: SubscriptionTransferInfo): Self = StObject.set(x, "transferInfo", value.asInstanceOf[js.Any])
        
        inline def setTransferInfoUndefined: Self = StObject.set(x, "transferInfo", js.undefined)
        
        inline def setTrialSettings(value: SubscriptionTrialSettings): Self = StObject.set(x, "trialSettings", value.asInstanceOf[js.Any])
        
        inline def setTrialSettingsUndefined: Self = StObject.set(x, "trialSettings", js.undefined)
      }
    }
    
    trait SubscriptionPlan extends StObject {
      
      var commitmentInterval: js.UndefOr[SubscriptionPlanCommitmentInterval] = js.undefined
      
      var isCommitmentPlan: js.UndefOr[Boolean] = js.undefined
      
      var planName: js.UndefOr[String] = js.undefined
    }
    object SubscriptionPlan {
      
      inline def apply(): SubscriptionPlan = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SubscriptionPlan]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: SubscriptionPlan] (val x: Self) extends AnyVal {
        
        inline def setCommitmentInterval(value: SubscriptionPlanCommitmentInterval): Self = StObject.set(x, "commitmentInterval", value.asInstanceOf[js.Any])
        
        inline def setCommitmentIntervalUndefined: Self = StObject.set(x, "commitmentInterval", js.undefined)
        
        inline def setIsCommitmentPlan(value: Boolean): Self = StObject.set(x, "isCommitmentPlan", value.asInstanceOf[js.Any])
        
        inline def setIsCommitmentPlanUndefined: Self = StObject.set(x, "isCommitmentPlan", js.undefined)
        
        inline def setPlanName(value: String): Self = StObject.set(x, "planName", value.asInstanceOf[js.Any])
        
        inline def setPlanNameUndefined: Self = StObject.set(x, "planName", js.undefined)
      }
    }
    
    trait SubscriptionPlanCommitmentInterval extends StObject {
      
      var endTime: js.UndefOr[String] = js.undefined
      
      var startTime: js.UndefOr[String] = js.undefined
    }
    object SubscriptionPlanCommitmentInterval {
      
      inline def apply(): SubscriptionPlanCommitmentInterval = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SubscriptionPlanCommitmentInterval]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: SubscriptionPlanCommitmentInterval] (val x: Self) extends AnyVal {
        
        inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
        
        inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
        
        inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
        
        inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
      }
    }
    
    trait SubscriptionTransferInfo extends StObject {
      
      var minimumTransferableSeats: js.UndefOr[Double] = js.undefined
      
      var transferabilityExpirationTime: js.UndefOr[String] = js.undefined
    }
    object SubscriptionTransferInfo {
      
      inline def apply(): SubscriptionTransferInfo = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SubscriptionTransferInfo]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: SubscriptionTransferInfo] (val x: Self) extends AnyVal {
        
        inline def setMinimumTransferableSeats(value: Double): Self = StObject.set(x, "minimumTransferableSeats", value.asInstanceOf[js.Any])
        
        inline def setMinimumTransferableSeatsUndefined: Self = StObject.set(x, "minimumTransferableSeats", js.undefined)
        
        inline def setTransferabilityExpirationTime(value: String): Self = StObject.set(x, "transferabilityExpirationTime", value.asInstanceOf[js.Any])
        
        inline def setTransferabilityExpirationTimeUndefined: Self = StObject.set(x, "transferabilityExpirationTime", js.undefined)
      }
    }
    
    trait SubscriptionTrialSettings extends StObject {
      
      var isInTrial: js.UndefOr[Boolean] = js.undefined
      
      var trialEndTime: js.UndefOr[String] = js.undefined
    }
    object SubscriptionTrialSettings {
      
      inline def apply(): SubscriptionTrialSettings = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SubscriptionTrialSettings]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: SubscriptionTrialSettings] (val x: Self) extends AnyVal {
        
        inline def setIsInTrial(value: Boolean): Self = StObject.set(x, "isInTrial", value.asInstanceOf[js.Any])
        
        inline def setIsInTrialUndefined: Self = StObject.set(x, "isInTrial", js.undefined)
        
        inline def setTrialEndTime(value: String): Self = StObject.set(x, "trialEndTime", value.asInstanceOf[js.Any])
        
        inline def setTrialEndTimeUndefined: Self = StObject.set(x, "trialEndTime", js.undefined)
      }
    }
    
    trait Subscriptions extends StObject {
      
      var kind: js.UndefOr[String] = js.undefined
      
      var nextPageToken: js.UndefOr[String] = js.undefined
      
      var subscriptions: js.UndefOr[js.Array[Subscription]] = js.undefined
    }
    object Subscriptions {
      
      inline def apply(): Subscriptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Subscriptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Subscriptions] (val x: Self) extends AnyVal {
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        
        inline def setSubscriptions(value: js.Array[Subscription]): Self = StObject.set(x, "subscriptions", value.asInstanceOf[js.Any])
        
        inline def setSubscriptionsUndefined: Self = StObject.set(x, "subscriptions", js.undefined)
        
        inline def setSubscriptionsVarargs(value: Subscription*): Self = StObject.set(x, "subscriptions", js.Array(value*))
      }
    }
  }
}
