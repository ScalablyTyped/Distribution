package typings.googleapis.cloudassetV1Mod.cloudassetV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaResourceSearchResult extends StObject {
  
  /**
    * The additional searchable attributes of this resource. The attributes may vary from one resource type to another. Examples: `projectId` for Project, `dnsName` for DNS ManagedZone. This field contains a subset of the resource metadata fields that are returned by the List or Get APIs provided by the corresponding GCP service (e.g., Compute Engine). see [API references and supported searchable attributes](https://cloud.google.com/asset-inventory/docs/supported-asset-types#searchable_asset_types) to see which fields are included. You can search values of these fields through free text search. However, you should not consume the field programically as the field names and values may change as the GCP service updates to a new incompatible API version. To search against the `additional_attributes`: * use a free text query to match the attributes values. Example: to search `additional_attributes = { dnsName: "foobar" \}`, you can issue a query `foobar`.
    */
  var additionalAttributes: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
  
  /**
    * The type of this resource. Example: `compute.googleapis.com/Disk`. To search against the `asset_type`: * specify the `asset_type` field in your search request.
    */
  var assetType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Attached resources of this resource. For example, an OSConfig Inventory is an attached resource of a Compute Instance. This field is repeated because a resource could have multiple attached resources. This `attached_resources` field is not searchable. Some attributes of the attached resources are exposed in `additional_attributes` field, so as to allow users to search on them.
    */
  var attachedResources: js.UndefOr[js.Array[SchemaAttachedResource]] = js.undefined
  
  /**
    * The create timestamp of this resource, at which the resource was created. The granularity is in seconds. Timestamp.nanos will always be 0. This field is available only when the resource's Protobuf contains it. To search against `create_time`: * use a field query. - value in seconds since unix epoch. Example: `createTime \> 1609459200` - value in date string. Example: `createTime \> 2021-01-01` - value in date-time string (must be quoted). Example: `createTime \> "2021-01-01T00:00:00"`
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * One or more paragraphs of text description of this resource. Maximum length could be up to 1M bytes. This field is available only when the resource's Protobuf contains it. To search against the `description`: * use a field query. Example: `description:"important instance"` * use a free text query. Example: `"important instance"`
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The display name of this resource. This field is available only when the resource's Protobuf contains it. To search against the `display_name`: * use a field query. Example: `displayName:"My Instance"` * use a free text query. Example: `"My Instance"`
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The folder(s) that this resource belongs to, in the form of folders/{FOLDER_NUMBER\}. This field is available when the resource belongs to one or more folders. To search against `folders`: * use a field query. Example: `folders:(123 OR 456)` * use a free text query. Example: `123` * specify the `scope` field as this folder in your search request.
    */
  var folders: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The Cloud KMS [CryptoKey](https://cloud.google.com/kms/docs/reference/rest/v1/projects.locations.keyRings.cryptoKeys) name or [CryptoKeyVersion](https://cloud.google.com/kms/docs/reference/rest/v1/projects.locations.keyRings.cryptoKeys.cryptoKeyVersions) name. This field is available only when the resource's Protobuf contains it. To search against the `kms_key`: * use a field query. Example: `kmsKey:key` * use a free text query. Example: `key`
    */
  var kmsKey: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Labels associated with this resource. See [Labelling and grouping GCP resources](https://cloud.google.com/blog/products/gcp/labelling-and-grouping-your-google-cloud-platform-resources) for more information. This field is available only when the resource's Protobuf contains it. To search against the `labels`: * use a field query: - query on any label's key or value. Example: `labels:prod` - query by a given label. Example: `labels.env:prod` - query by a given label's existence. Example: `labels.env:*` * use a free text query. Example: `prod`
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Location can be `global`, regional like `us-east1`, or zonal like `us-west1-b`. This field is available only when the resource's Protobuf contains it. To search against the `location`: * use a field query. Example: `location:us-west*` * use a free text query. Example: `us-west*`
    */
  var location: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The full resource name of this resource. Example: `//compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1`. See [Cloud Asset Inventory Resource Name Format](https://cloud.google.com/asset-inventory/docs/resource-name-format) for more information. To search against the `name`: * use a field query. Example: `name:instance1` * use a free text query. Example: `instance1`
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Network tags associated with this resource. Like labels, network tags are a type of annotations used to group GCP resources. See [Labelling GCP resources](https://cloud.google.com/blog/products/gcp/labelling-and-grouping-your-google-cloud-platform-resources) for more information. This field is available only when the resource's Protobuf contains it. To search against the `network_tags`: * use a field query. Example: `networkTags:internal` * use a free text query. Example: `internal`
    */
  var networkTags: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The organization that this resource belongs to, in the form of organizations/{ORGANIZATION_NUMBER\}. This field is available when the resource belongs to an organization. To search against `organization`: * use a field query. Example: `organization:123` * use a free text query. Example: `123` * specify the `scope` field as this organization in your search request.
    */
  var organization: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of this resource's immediate parent, if there is one. To search against the `parent_asset_type`: * use a field query. Example: `parentAssetType:"cloudresourcemanager.googleapis.com/Project"` * use a free text query. Example: `cloudresourcemanager.googleapis.com/Project`
    */
  var parentAssetType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The full resource name of this resource's parent, if it has one. To search against the `parent_full_resource_name`: * use a field query. Example: `parentFullResourceName:"project-name"` * use a free text query. Example: `project-name`
    */
  var parentFullResourceName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The project that this resource belongs to, in the form of projects/{PROJECT_NUMBER\}. This field is available when the resource belongs to a project. To search against `project`: * use a field query. Example: `project:12345` * use a free text query. Example: `12345` * specify the `scope` field as this project in your search request.
    */
  var project: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A map of related resources of this resource, keyed by the relationship type. A relationship type is in the format of {SourceType\}_{ACTION\}_{DestType\}. Example: `DISK_TO_INSTANCE`, `DISK_TO_NETWORK`, `INSTANCE_TO_INSTANCEGROUP`. See [supported relationship types](https://cloud.google.com/asset-inventory/docs/supported-asset-types#supported_relationship_types).
    */
  var relationships: js.UndefOr[StringDictionary[SchemaRelatedResources] | Null] = js.undefined
  
  /**
    * The state of this resource. Different resources types have different state definitions that are mapped from various fields of different resource types. This field is available only when the resource's Protobuf contains it. Example: If the resource is an instance provided by Compute Engine, its state will include PROVISIONING, STAGING, RUNNING, STOPPING, SUSPENDING, SUSPENDED, REPAIRING, and TERMINATED. See `status` definition in [API Reference](https://cloud.google.com/compute/docs/reference/rest/v1/instances). If the resource is a project provided by Cloud Resource Manager, its state will include LIFECYCLE_STATE_UNSPECIFIED, ACTIVE, DELETE_REQUESTED and DELETE_IN_PROGRESS. See `lifecycleState` definition in [API Reference](https://cloud.google.com/resource-manager/reference/rest/v1/projects). To search against the `state`: * use a field query. Example: `state:RUNNING` * use a free text query. Example: `RUNNING`
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * TagKey namespaced names, in the format of {ORG_ID\}/{TAG_KEY_SHORT_NAME\}. To search against the `tagKeys`: * use a field query. Example: - `tagKeys:"123456789/env*"` - `tagKeys="123456789/env"` - `tagKeys:"env"` * use a free text query. Example: - `env`
    */
  var tagKeys: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * TagValue IDs, in the format of tagValues/{TAG_VALUE_ID\}. To search against the `tagValueIds`: * use a field query. Example: - `tagValueIds:"456"` - `tagValueIds="tagValues/456"` * use a free text query. Example: - `456`
    */
  var tagValueIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * TagValue namespaced names, in the format of {ORG_ID\}/{TAG_KEY_SHORT_NAME\}/{TAG_VALUE_SHORT_NAME\}. To search against the `tagValues`: * use a field query. Example: - `tagValues:"env"` - `tagValues:"env/prod"` - `tagValues:"123456789/env/prod*"` - `tagValues="123456789/env/prod"` * use a free text query. Example: - `prod`
    */
  var tagValues: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The last update timestamp of this resource, at which the resource was last modified or deleted. The granularity is in seconds. Timestamp.nanos will always be 0. This field is available only when the resource's Protobuf contains it. To search against `update_time`: * use a field query. - value in seconds since unix epoch. Example: `updateTime < 1609459200` - value in date string. Example: `updateTime < 2021-01-01` - value in date-time string (must be quoted). Example: `updateTime < "2021-01-01T00:00:00"`
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Versioned resource representations of this resource. This is repeated because there could be multiple versions of resource representations during version migration. This `versioned_resources` field is not searchable. Some attributes of the resource representations are exposed in `additional_attributes` field, so as to allow users to search on them.
    */
  var versionedResources: js.UndefOr[js.Array[SchemaVersionedResource]] = js.undefined
}
object SchemaResourceSearchResult {
  
  inline def apply(): SchemaResourceSearchResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourceSearchResult]
  }
  
  extension [Self <: SchemaResourceSearchResult](x: Self) {
    
    inline def setAdditionalAttributes(value: StringDictionary[Any]): Self = StObject.set(x, "additionalAttributes", value.asInstanceOf[js.Any])
    
    inline def setAdditionalAttributesNull: Self = StObject.set(x, "additionalAttributes", null)
    
    inline def setAdditionalAttributesUndefined: Self = StObject.set(x, "additionalAttributes", js.undefined)
    
    inline def setAssetType(value: String): Self = StObject.set(x, "assetType", value.asInstanceOf[js.Any])
    
    inline def setAssetTypeNull: Self = StObject.set(x, "assetType", null)
    
    inline def setAssetTypeUndefined: Self = StObject.set(x, "assetType", js.undefined)
    
    inline def setAttachedResources(value: js.Array[SchemaAttachedResource]): Self = StObject.set(x, "attachedResources", value.asInstanceOf[js.Any])
    
    inline def setAttachedResourcesUndefined: Self = StObject.set(x, "attachedResources", js.undefined)
    
    inline def setAttachedResourcesVarargs(value: SchemaAttachedResource*): Self = StObject.set(x, "attachedResources", js.Array(value*))
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setFolders(value: js.Array[String]): Self = StObject.set(x, "folders", value.asInstanceOf[js.Any])
    
    inline def setFoldersNull: Self = StObject.set(x, "folders", null)
    
    inline def setFoldersUndefined: Self = StObject.set(x, "folders", js.undefined)
    
    inline def setFoldersVarargs(value: String*): Self = StObject.set(x, "folders", js.Array(value*))
    
    inline def setKmsKey(value: String): Self = StObject.set(x, "kmsKey", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyNull: Self = StObject.set(x, "kmsKey", null)
    
    inline def setKmsKeyUndefined: Self = StObject.set(x, "kmsKey", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationNull: Self = StObject.set(x, "location", null)
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNetworkTags(value: js.Array[String]): Self = StObject.set(x, "networkTags", value.asInstanceOf[js.Any])
    
    inline def setNetworkTagsNull: Self = StObject.set(x, "networkTags", null)
    
    inline def setNetworkTagsUndefined: Self = StObject.set(x, "networkTags", js.undefined)
    
    inline def setNetworkTagsVarargs(value: String*): Self = StObject.set(x, "networkTags", js.Array(value*))
    
    inline def setOrganization(value: String): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setOrganizationNull: Self = StObject.set(x, "organization", null)
    
    inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    inline def setParentAssetType(value: String): Self = StObject.set(x, "parentAssetType", value.asInstanceOf[js.Any])
    
    inline def setParentAssetTypeNull: Self = StObject.set(x, "parentAssetType", null)
    
    inline def setParentAssetTypeUndefined: Self = StObject.set(x, "parentAssetType", js.undefined)
    
    inline def setParentFullResourceName(value: String): Self = StObject.set(x, "parentFullResourceName", value.asInstanceOf[js.Any])
    
    inline def setParentFullResourceNameNull: Self = StObject.set(x, "parentFullResourceName", null)
    
    inline def setParentFullResourceNameUndefined: Self = StObject.set(x, "parentFullResourceName", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectNull: Self = StObject.set(x, "project", null)
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setRelationships(value: StringDictionary[SchemaRelatedResources]): Self = StObject.set(x, "relationships", value.asInstanceOf[js.Any])
    
    inline def setRelationshipsNull: Self = StObject.set(x, "relationships", null)
    
    inline def setRelationshipsUndefined: Self = StObject.set(x, "relationships", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTagKeys(value: js.Array[String]): Self = StObject.set(x, "tagKeys", value.asInstanceOf[js.Any])
    
    inline def setTagKeysNull: Self = StObject.set(x, "tagKeys", null)
    
    inline def setTagKeysUndefined: Self = StObject.set(x, "tagKeys", js.undefined)
    
    inline def setTagKeysVarargs(value: String*): Self = StObject.set(x, "tagKeys", js.Array(value*))
    
    inline def setTagValueIds(value: js.Array[String]): Self = StObject.set(x, "tagValueIds", value.asInstanceOf[js.Any])
    
    inline def setTagValueIdsNull: Self = StObject.set(x, "tagValueIds", null)
    
    inline def setTagValueIdsUndefined: Self = StObject.set(x, "tagValueIds", js.undefined)
    
    inline def setTagValueIdsVarargs(value: String*): Self = StObject.set(x, "tagValueIds", js.Array(value*))
    
    inline def setTagValues(value: js.Array[String]): Self = StObject.set(x, "tagValues", value.asInstanceOf[js.Any])
    
    inline def setTagValuesNull: Self = StObject.set(x, "tagValues", null)
    
    inline def setTagValuesUndefined: Self = StObject.set(x, "tagValues", js.undefined)
    
    inline def setTagValuesVarargs(value: String*): Self = StObject.set(x, "tagValues", js.Array(value*))
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    inline def setVersionedResources(value: js.Array[SchemaVersionedResource]): Self = StObject.set(x, "versionedResources", value.asInstanceOf[js.Any])
    
    inline def setVersionedResourcesUndefined: Self = StObject.set(x, "versionedResources", js.undefined)
    
    inline def setVersionedResourcesVarargs(value: SchemaVersionedResource*): Self = StObject.set(x, "versionedResources", js.Array(value*))
  }
}
