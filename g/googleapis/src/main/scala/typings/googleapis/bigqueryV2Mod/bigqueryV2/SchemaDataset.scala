package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StringDictionary
import typings.googleapis.anon.Dataset
import typings.googleapis.anon.TagKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDataset extends StObject {
  
  /**
    * [Optional] An array of objects that define dataset access for one or more entities. You can set this property when inserting or updating a dataset in order to control who is allowed to access the data. If unspecified at dataset creation time, BigQuery adds default dataset access for the following entities: access.specialGroup: projectReaders; access.role: READER; access.specialGroup: projectWriters; access.role: WRITER; access.specialGroup: projectOwners; access.role: OWNER; access.userByEmail: [dataset creator email]; access.role: OWNER;
    */
  var access: js.UndefOr[js.Array[Dataset] | Null] = js.undefined
  
  /**
    * [Output-only] The time when this dataset was created, in milliseconds since the epoch.
    */
  var creationTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Required] A reference that identifies the dataset.
    */
  var datasetReference: js.UndefOr[SchemaDatasetReference] = js.undefined
  
  /**
    * [Output-only] The default collation of the dataset.
    */
  var defaultCollation: js.UndefOr[String | Null] = js.undefined
  
  var defaultEncryptionConfiguration: js.UndefOr[SchemaEncryptionConfiguration] = js.undefined
  
  /**
    * [Optional] The default partition expiration for all partitioned tables in the dataset, in milliseconds. Once this property is set, all newly-created partitioned tables in the dataset will have an expirationMs property in the timePartitioning settings set to this value, and changing the value will only affect new tables, not existing ones. The storage in a partition will have an expiration time of its partition time plus this value. Setting this property overrides the use of defaultTableExpirationMs for partitioned tables: only one of defaultTableExpirationMs and defaultPartitionExpirationMs will be used for any new partitioned table. If you provide an explicit timePartitioning.expirationMs when creating or updating a partitioned table, that value takes precedence over the default partition expiration time indicated by this property.
    */
  var defaultPartitionExpirationMs: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Optional] The default lifetime of all tables in the dataset, in milliseconds. The minimum value is 3600000 milliseconds (one hour). Once this property is set, all newly-created tables in the dataset will have an expirationTime property set to the creation time plus the value in this property, and changing the value will only affect new tables, not existing ones. When the expirationTime for a given table is reached, that table will be deleted automatically. If a table's expirationTime is modified or removed before the table expires, or if you provide an explicit expirationTime when creating a table, that value takes precedence over the default expiration time indicated by this property.
    */
  var defaultTableExpirationMs: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Optional] A user-friendly description of the dataset.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output-only] A hash of the resource.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Optional] A descriptive name for the dataset.
    */
  var friendlyName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output-only] The fully-qualified unique name of the dataset in the format projectId:datasetId. The dataset name without the project name is given in the datasetId field. When creating a new dataset, leave this field blank, and instead specify the datasetId field.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Optional] Indicates if table names are case insensitive in the dataset.
    */
  var isCaseInsensitive: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * [Output-only] The resource type.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The labels associated with this dataset. You can use these to organize and group your datasets. You can set this property when inserting or updating a dataset. See Creating and Updating Dataset Labels for more information.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * [Output-only] The date when this dataset or any of its tables was last modified, in milliseconds since the epoch.
    */
  var lastModifiedTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The geographic location where the dataset should reside. The default value is US. See details at https://cloud.google.com/bigquery/docs/locations.
    */
  var location: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Optional] Number of hours for the max time travel for all tables in the dataset.
    */
  var maxTimeTravelHours: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output-only] Reserved for future use.
    */
  var satisfiesPzs: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * [Output-only] A URL that can be used to access the resource again. You can use this URL in Get or Update requests to the resource.
    */
  var selfLink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Optional]The tags associated with this dataset. Tag keys are globally unique.
    */
  var tags: js.UndefOr[js.Array[TagKey] | Null] = js.undefined
}
object SchemaDataset {
  
  inline def apply(): SchemaDataset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDataset]
  }
  
  extension [Self <: SchemaDataset](x: Self) {
    
    inline def setAccess(value: js.Array[Dataset]): Self = StObject.set(x, "access", value.asInstanceOf[js.Any])
    
    inline def setAccessNull: Self = StObject.set(x, "access", null)
    
    inline def setAccessUndefined: Self = StObject.set(x, "access", js.undefined)
    
    inline def setAccessVarargs(value: Dataset*): Self = StObject.set(x, "access", js.Array(value*))
    
    inline def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeNull: Self = StObject.set(x, "creationTime", null)
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setDatasetReference(value: SchemaDatasetReference): Self = StObject.set(x, "datasetReference", value.asInstanceOf[js.Any])
    
    inline def setDatasetReferenceUndefined: Self = StObject.set(x, "datasetReference", js.undefined)
    
    inline def setDefaultCollation(value: String): Self = StObject.set(x, "defaultCollation", value.asInstanceOf[js.Any])
    
    inline def setDefaultCollationNull: Self = StObject.set(x, "defaultCollation", null)
    
    inline def setDefaultCollationUndefined: Self = StObject.set(x, "defaultCollation", js.undefined)
    
    inline def setDefaultEncryptionConfiguration(value: SchemaEncryptionConfiguration): Self = StObject.set(x, "defaultEncryptionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setDefaultEncryptionConfigurationUndefined: Self = StObject.set(x, "defaultEncryptionConfiguration", js.undefined)
    
    inline def setDefaultPartitionExpirationMs(value: String): Self = StObject.set(x, "defaultPartitionExpirationMs", value.asInstanceOf[js.Any])
    
    inline def setDefaultPartitionExpirationMsNull: Self = StObject.set(x, "defaultPartitionExpirationMs", null)
    
    inline def setDefaultPartitionExpirationMsUndefined: Self = StObject.set(x, "defaultPartitionExpirationMs", js.undefined)
    
    inline def setDefaultTableExpirationMs(value: String): Self = StObject.set(x, "defaultTableExpirationMs", value.asInstanceOf[js.Any])
    
    inline def setDefaultTableExpirationMsNull: Self = StObject.set(x, "defaultTableExpirationMs", null)
    
    inline def setDefaultTableExpirationMsUndefined: Self = StObject.set(x, "defaultTableExpirationMs", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
    
    inline def setFriendlyNameNull: Self = StObject.set(x, "friendlyName", null)
    
    inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIsCaseInsensitive(value: Boolean): Self = StObject.set(x, "isCaseInsensitive", value.asInstanceOf[js.Any])
    
    inline def setIsCaseInsensitiveNull: Self = StObject.set(x, "isCaseInsensitive", null)
    
    inline def setIsCaseInsensitiveUndefined: Self = StObject.set(x, "isCaseInsensitive", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLastModifiedTime(value: String): Self = StObject.set(x, "lastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeNull: Self = StObject.set(x, "lastModifiedTime", null)
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "lastModifiedTime", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationNull: Self = StObject.set(x, "location", null)
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setMaxTimeTravelHours(value: String): Self = StObject.set(x, "maxTimeTravelHours", value.asInstanceOf[js.Any])
    
    inline def setMaxTimeTravelHoursNull: Self = StObject.set(x, "maxTimeTravelHours", null)
    
    inline def setMaxTimeTravelHoursUndefined: Self = StObject.set(x, "maxTimeTravelHours", js.undefined)
    
    inline def setSatisfiesPzs(value: Boolean): Self = StObject.set(x, "satisfiesPzs", value.asInstanceOf[js.Any])
    
    inline def setSatisfiesPzsNull: Self = StObject.set(x, "satisfiesPzs", null)
    
    inline def setSatisfiesPzsUndefined: Self = StObject.set(x, "satisfiesPzs", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkNull: Self = StObject.set(x, "selfLink", null)
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setTags(value: js.Array[TagKey]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsNull: Self = StObject.set(x, "tags", null)
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: TagKey*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
