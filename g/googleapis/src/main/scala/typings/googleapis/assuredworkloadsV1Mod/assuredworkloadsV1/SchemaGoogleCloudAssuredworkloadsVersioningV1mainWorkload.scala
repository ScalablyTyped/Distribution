package typings.googleapis.assuredworkloadsV1Mod.assuredworkloadsV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudAssuredworkloadsVersioningV1mainWorkload extends StObject {
  
  /**
    * Input only. The billing account used for the resources which are direct children of workload. This billing account is initially associated with the resources created as part of Workload creation. After the initial creation of these resources, the customer can change the assigned billing account. The resource name has the form `billingAccounts/{billing_account_id\}`. For example, `billingAccounts/012345-567890-ABCDEF`.
    */
  var billingAccount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Input only. Immutable. Settings specific to resources needed for CJIS.
    */
  var cjisSettings: js.UndefOr[SchemaGoogleCloudAssuredworkloadsVersioningV1mainWorkloadCJISSettings] = js.undefined
  
  /**
    * Required. Immutable. Compliance Regime associated with this workload.
    */
  var complianceRegime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Count of active Violations in the Workload.
    */
  var complianceStatus: js.UndefOr[SchemaGoogleCloudAssuredworkloadsVersioningV1mainWorkloadComplianceStatus] = js.undefined
  
  /**
    * Output only. Immutable. The Workload creation timestamp.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The user-assigned display name of the Workload. When present it must be between 4 to 30 characters. Allowed characters are: lowercase and uppercase letters, numbers, hyphen, and spaces. Example: My Workload
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Indicates the sovereignty status of the given workload. Currently meant to be used by Europe/Canada customers.
    */
  var enableSovereignControls: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Optional. ETag of the workload, it is calculated on the basis of the Workload contents. It will be used in Update & Delete operations.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Input only. Immutable. Settings specific to resources needed for FedRAMP High.
    */
  var fedrampHighSettings: js.UndefOr[SchemaGoogleCloudAssuredworkloadsVersioningV1mainWorkloadFedrampHighSettings] = js.undefined
  
  /**
    * Required. Input only. Immutable. Settings specific to resources needed for FedRAMP Moderate.
    */
  var fedrampModerateSettings: js.UndefOr[SchemaGoogleCloudAssuredworkloadsVersioningV1mainWorkloadFedrampModerateSettings] = js.undefined
  
  /**
    * Required. Input only. Immutable. Settings specific to resources needed for IL4.
    */
  var il4Settings: js.UndefOr[SchemaGoogleCloudAssuredworkloadsVersioningV1mainWorkloadIL4Settings] = js.undefined
  
  /**
    * Output only. Represents the KAJ enrollment state of the given workload.
    */
  var kajEnrollmentState: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Input only. Settings used to create a CMEK crypto key. When set, a project with a KMS CMEK key is provisioned. This field is deprecated as of Feb 28, 2022. In order to create a Keyring, callers should specify, ENCRYPTION_KEYS_PROJECT or KEYRING in ResourceSettings.resource_type field.
    */
  var kmsSettings: js.UndefOr[SchemaGoogleCloudAssuredworkloadsVersioningV1mainWorkloadKMSSettings] = js.undefined
  
  /**
    * Optional. Labels applied to the workload.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Optional. The resource name of the workload. Format: organizations/{organization\}/locations/{location\}/workloads/{workload\} Read-only.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Input only. The parent resource for the resources managed by this Assured Workload. May be either empty or a folder resource which is a child of the Workload parent. If not specified all resources are created under the parent organization. Format: folders/{folder_id\}
    */
  var provisionedResourcesParent: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Input only. Resource properties that are used to customize workload resources. These properties (such as custom project id) will be used to create workload resources if possible. This field is optional.
    */
  var resourceSettings: js.UndefOr[
    js.Array[SchemaGoogleCloudAssuredworkloadsVersioningV1mainWorkloadResourceSettings]
  ] = js.undefined
  
  /**
    * Output only. The resources associated with this workload. These resources will be created when creating the workload. If any of the projects already exist, the workload creation will fail. Always read only.
    */
  var resources: js.UndefOr[js.Array[SchemaGoogleCloudAssuredworkloadsVersioningV1mainWorkloadResourceInfo]] = js.undefined
  
  /**
    * Output only. Represents the SAA enrollment response of the given workload. SAA enrollment response is queried during GetWorkload call. In failure cases, user friendly error message is shown in SAA details page.
    */
  var saaEnrollmentResponse: js.UndefOr[SchemaGoogleCloudAssuredworkloadsVersioningV1mainWorkloadSaaEnrollmentResponse] = js.undefined
}
object SchemaGoogleCloudAssuredworkloadsVersioningV1mainWorkload {
  
  inline def apply(): SchemaGoogleCloudAssuredworkloadsVersioningV1mainWorkload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudAssuredworkloadsVersioningV1mainWorkload]
  }
  
  extension [Self <: SchemaGoogleCloudAssuredworkloadsVersioningV1mainWorkload](x: Self) {
    
    inline def setBillingAccount(value: String): Self = StObject.set(x, "billingAccount", value.asInstanceOf[js.Any])
    
    inline def setBillingAccountNull: Self = StObject.set(x, "billingAccount", null)
    
    inline def setBillingAccountUndefined: Self = StObject.set(x, "billingAccount", js.undefined)
    
    inline def setCjisSettings(value: SchemaGoogleCloudAssuredworkloadsVersioningV1mainWorkloadCJISSettings): Self = StObject.set(x, "cjisSettings", value.asInstanceOf[js.Any])
    
    inline def setCjisSettingsUndefined: Self = StObject.set(x, "cjisSettings", js.undefined)
    
    inline def setComplianceRegime(value: String): Self = StObject.set(x, "complianceRegime", value.asInstanceOf[js.Any])
    
    inline def setComplianceRegimeNull: Self = StObject.set(x, "complianceRegime", null)
    
    inline def setComplianceRegimeUndefined: Self = StObject.set(x, "complianceRegime", js.undefined)
    
    inline def setComplianceStatus(value: SchemaGoogleCloudAssuredworkloadsVersioningV1mainWorkloadComplianceStatus): Self = StObject.set(x, "complianceStatus", value.asInstanceOf[js.Any])
    
    inline def setComplianceStatusUndefined: Self = StObject.set(x, "complianceStatus", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEnableSovereignControls(value: Boolean): Self = StObject.set(x, "enableSovereignControls", value.asInstanceOf[js.Any])
    
    inline def setEnableSovereignControlsNull: Self = StObject.set(x, "enableSovereignControls", null)
    
    inline def setEnableSovereignControlsUndefined: Self = StObject.set(x, "enableSovereignControls", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setFedrampHighSettings(value: SchemaGoogleCloudAssuredworkloadsVersioningV1mainWorkloadFedrampHighSettings): Self = StObject.set(x, "fedrampHighSettings", value.asInstanceOf[js.Any])
    
    inline def setFedrampHighSettingsUndefined: Self = StObject.set(x, "fedrampHighSettings", js.undefined)
    
    inline def setFedrampModerateSettings(value: SchemaGoogleCloudAssuredworkloadsVersioningV1mainWorkloadFedrampModerateSettings): Self = StObject.set(x, "fedrampModerateSettings", value.asInstanceOf[js.Any])
    
    inline def setFedrampModerateSettingsUndefined: Self = StObject.set(x, "fedrampModerateSettings", js.undefined)
    
    inline def setIl4Settings(value: SchemaGoogleCloudAssuredworkloadsVersioningV1mainWorkloadIL4Settings): Self = StObject.set(x, "il4Settings", value.asInstanceOf[js.Any])
    
    inline def setIl4SettingsUndefined: Self = StObject.set(x, "il4Settings", js.undefined)
    
    inline def setKajEnrollmentState(value: String): Self = StObject.set(x, "kajEnrollmentState", value.asInstanceOf[js.Any])
    
    inline def setKajEnrollmentStateNull: Self = StObject.set(x, "kajEnrollmentState", null)
    
    inline def setKajEnrollmentStateUndefined: Self = StObject.set(x, "kajEnrollmentState", js.undefined)
    
    inline def setKmsSettings(value: SchemaGoogleCloudAssuredworkloadsVersioningV1mainWorkloadKMSSettings): Self = StObject.set(x, "kmsSettings", value.asInstanceOf[js.Any])
    
    inline def setKmsSettingsUndefined: Self = StObject.set(x, "kmsSettings", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProvisionedResourcesParent(value: String): Self = StObject.set(x, "provisionedResourcesParent", value.asInstanceOf[js.Any])
    
    inline def setProvisionedResourcesParentNull: Self = StObject.set(x, "provisionedResourcesParent", null)
    
    inline def setProvisionedResourcesParentUndefined: Self = StObject.set(x, "provisionedResourcesParent", js.undefined)
    
    inline def setResourceSettings(value: js.Array[SchemaGoogleCloudAssuredworkloadsVersioningV1mainWorkloadResourceSettings]): Self = StObject.set(x, "resourceSettings", value.asInstanceOf[js.Any])
    
    inline def setResourceSettingsUndefined: Self = StObject.set(x, "resourceSettings", js.undefined)
    
    inline def setResourceSettingsVarargs(value: SchemaGoogleCloudAssuredworkloadsVersioningV1mainWorkloadResourceSettings*): Self = StObject.set(x, "resourceSettings", js.Array(value*))
    
    inline def setResources(value: js.Array[SchemaGoogleCloudAssuredworkloadsVersioningV1mainWorkloadResourceInfo]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    inline def setResourcesVarargs(value: SchemaGoogleCloudAssuredworkloadsVersioningV1mainWorkloadResourceInfo*): Self = StObject.set(x, "resources", js.Array(value*))
    
    inline def setSaaEnrollmentResponse(value: SchemaGoogleCloudAssuredworkloadsVersioningV1mainWorkloadSaaEnrollmentResponse): Self = StObject.set(x, "saaEnrollmentResponse", value.asInstanceOf[js.Any])
    
    inline def setSaaEnrollmentResponseUndefined: Self = StObject.set(x, "saaEnrollmentResponse", js.undefined)
  }
}
