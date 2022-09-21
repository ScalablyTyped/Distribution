package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudChannelV1alpha1Entitlement extends StObject {
  
  /**
    * The current number of users that are assigned a license for the product defined in provisioned_service.skuId. Read-only. Deprecated: Use `parameters` instead.
    */
  var assignedUnits: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Association information to other entitlements.
    */
  var associationInfo: js.UndefOr[SchemaGoogleCloudChannelV1alpha1AssociationInfo] = js.undefined
  
  /**
    * Cloud Identity ID of a channel partner who will be the direct reseller for the customer's order. This field is generally used in 2-tier ordering, where the order is placed by a top-level distributor on behalf of their channel partner or reseller. Required for distributors. Deprecated: `channel_partner_id` has been moved to the Customer.
    */
  var channelPartnerId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Commitment settings for a commitment-based Offer. Required for commitment based offers.
    */
  var commitmentSettings: js.UndefOr[SchemaGoogleCloudChannelV1alpha1CommitmentSettings] = js.undefined
  
  /**
    * Output only. The time at which the entitlement is created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Maximum number of units for a non commitment-based Offer, such as Flexible, Trial or Free entitlements. For commitment-based entitlements, this is a read-only field, which only the internal support team can update. Deprecated: Use `parameters` instead.
    */
  var maxUnits: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Output only. Resource name of an entitlement in the form: accounts/{account_id\}/customers/{customer_id\}/entitlements/{entitlement_id\}.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Number of units for a commitment-based Offer. For example, for seat-based Offers, this would be the number of seats; for license-based Offers, this would be the number of licenses. Required for creating commitment-based Offers. Deprecated: Use `parameters` instead.
    */
  var numUnits: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Required. The offer resource name for which the entitlement is to be created. Takes the form: accounts/{account_id\}/offers/{offer_id\}.
    */
  var offer: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Extended entitlement parameters. When creating an entitlement, valid parameter names and values are defined in the Offer.parameter_definitions. The response may include the following output-only Parameters: - assigned_units: The number of licenses assigned to users. - max_units: The maximum assignable units for a flexible offer. - num_units: The total commitment for commitment-based offers.
    */
  var parameters: js.UndefOr[js.Array[SchemaGoogleCloudChannelV1alpha1Parameter]] = js.undefined
  
  /**
    * Output only. Service provisioning details for the entitlement.
    */
  var provisionedService: js.UndefOr[SchemaGoogleCloudChannelV1alpha1ProvisionedService] = js.undefined
  
  /**
    * Output only. Current provisioning state of the entitlement.
    */
  var provisioningState: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. This purchase order (PO) information is for resellers to use for their company tracking usage. If a purchaseOrderId value is given, it appears in the API responses and shows up in the invoice. The property accepts up to 80 plain text characters. This is only supported for Google Workspace entitlements.
    */
  var purchaseOrderId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Enumerable of all current suspension reasons for an entitlement.
    */
  var suspensionReasons: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Output only. Settings for trial offers.
    */
  var trialSettings: js.UndefOr[SchemaGoogleCloudChannelV1alpha1TrialSettings] = js.undefined
  
  /**
    * Output only. The time at which the entitlement is updated.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudChannelV1alpha1Entitlement {
  
  inline def apply(): SchemaGoogleCloudChannelV1alpha1Entitlement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudChannelV1alpha1Entitlement]
  }
  
  extension [Self <: SchemaGoogleCloudChannelV1alpha1Entitlement](x: Self) {
    
    inline def setAssignedUnits(value: Double): Self = StObject.set(x, "assignedUnits", value.asInstanceOf[js.Any])
    
    inline def setAssignedUnitsNull: Self = StObject.set(x, "assignedUnits", null)
    
    inline def setAssignedUnitsUndefined: Self = StObject.set(x, "assignedUnits", js.undefined)
    
    inline def setAssociationInfo(value: SchemaGoogleCloudChannelV1alpha1AssociationInfo): Self = StObject.set(x, "associationInfo", value.asInstanceOf[js.Any])
    
    inline def setAssociationInfoUndefined: Self = StObject.set(x, "associationInfo", js.undefined)
    
    inline def setChannelPartnerId(value: String): Self = StObject.set(x, "channelPartnerId", value.asInstanceOf[js.Any])
    
    inline def setChannelPartnerIdNull: Self = StObject.set(x, "channelPartnerId", null)
    
    inline def setChannelPartnerIdUndefined: Self = StObject.set(x, "channelPartnerId", js.undefined)
    
    inline def setCommitmentSettings(value: SchemaGoogleCloudChannelV1alpha1CommitmentSettings): Self = StObject.set(x, "commitmentSettings", value.asInstanceOf[js.Any])
    
    inline def setCommitmentSettingsUndefined: Self = StObject.set(x, "commitmentSettings", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setMaxUnits(value: Double): Self = StObject.set(x, "maxUnits", value.asInstanceOf[js.Any])
    
    inline def setMaxUnitsNull: Self = StObject.set(x, "maxUnits", null)
    
    inline def setMaxUnitsUndefined: Self = StObject.set(x, "maxUnits", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNumUnits(value: Double): Self = StObject.set(x, "numUnits", value.asInstanceOf[js.Any])
    
    inline def setNumUnitsNull: Self = StObject.set(x, "numUnits", null)
    
    inline def setNumUnitsUndefined: Self = StObject.set(x, "numUnits", js.undefined)
    
    inline def setOffer(value: String): Self = StObject.set(x, "offer", value.asInstanceOf[js.Any])
    
    inline def setOfferNull: Self = StObject.set(x, "offer", null)
    
    inline def setOfferUndefined: Self = StObject.set(x, "offer", js.undefined)
    
    inline def setParameters(value: js.Array[SchemaGoogleCloudChannelV1alpha1Parameter]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setParametersVarargs(value: SchemaGoogleCloudChannelV1alpha1Parameter*): Self = StObject.set(x, "parameters", js.Array(value*))
    
    inline def setProvisionedService(value: SchemaGoogleCloudChannelV1alpha1ProvisionedService): Self = StObject.set(x, "provisionedService", value.asInstanceOf[js.Any])
    
    inline def setProvisionedServiceUndefined: Self = StObject.set(x, "provisionedService", js.undefined)
    
    inline def setProvisioningState(value: String): Self = StObject.set(x, "provisioningState", value.asInstanceOf[js.Any])
    
    inline def setProvisioningStateNull: Self = StObject.set(x, "provisioningState", null)
    
    inline def setProvisioningStateUndefined: Self = StObject.set(x, "provisioningState", js.undefined)
    
    inline def setPurchaseOrderId(value: String): Self = StObject.set(x, "purchaseOrderId", value.asInstanceOf[js.Any])
    
    inline def setPurchaseOrderIdNull: Self = StObject.set(x, "purchaseOrderId", null)
    
    inline def setPurchaseOrderIdUndefined: Self = StObject.set(x, "purchaseOrderId", js.undefined)
    
    inline def setSuspensionReasons(value: js.Array[String]): Self = StObject.set(x, "suspensionReasons", value.asInstanceOf[js.Any])
    
    inline def setSuspensionReasonsNull: Self = StObject.set(x, "suspensionReasons", null)
    
    inline def setSuspensionReasonsUndefined: Self = StObject.set(x, "suspensionReasons", js.undefined)
    
    inline def setSuspensionReasonsVarargs(value: String*): Self = StObject.set(x, "suspensionReasons", js.Array(value*))
    
    inline def setTrialSettings(value: SchemaGoogleCloudChannelV1alpha1TrialSettings): Self = StObject.set(x, "trialSettings", value.asInstanceOf[js.Any])
    
    inline def setTrialSettingsUndefined: Self = StObject.set(x, "trialSettings", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
