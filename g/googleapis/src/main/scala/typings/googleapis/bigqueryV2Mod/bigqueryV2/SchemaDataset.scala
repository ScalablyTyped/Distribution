package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StringDictionary
import typings.googleapis.anon.Domain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaDataset extends js.Object {
  
  /**
    * [Optional] An array of objects that define dataset access for one or more
    * entities. You can set this property when inserting or updating a dataset
    * in order to control who is allowed to access the data. If unspecified at
    * dataset creation time, BigQuery adds default dataset access for the
    * following entities: access.specialGroup: projectReaders; access.role:
    * READER; access.specialGroup: projectWriters; access.role: WRITER;
    * access.specialGroup: projectOwners; access.role: OWNER;
    * access.userByEmail: [dataset creator email]; access.role: OWNER;
    */
  var access: js.UndefOr[js.Array[Domain]] = js.native
  
  /**
    * [Output-only] The time when this dataset was created, in milliseconds
    * since the epoch.
    */
  var creationTime: js.UndefOr[String] = js.native
  
  /**
    * [Required] A reference that identifies the dataset.
    */
  var datasetReference: js.UndefOr[SchemaDatasetReference] = js.native
  
  /**
    * [Optional] The default partition expiration for all partitioned tables in
    * the dataset, in milliseconds. Once this property is set, all
    * newly-created partitioned tables in the dataset will have an expirationMs
    * property in the timePartitioning settings set to this value, and changing
    * the value will only affect new tables, not existing ones. The storage in
    * a partition will have an expiration time of its partition time plus this
    * value. Setting this property overrides the use of
    * defaultTableExpirationMs for partitioned tables: only one of
    * defaultTableExpirationMs and defaultPartitionExpirationMs will be used
    * for any new partitioned table. If you provide an explicit
    * timePartitioning.expirationMs when creating or updating a partitioned
    * table, that value takes precedence over the default partition expiration
    * time indicated by this property.
    */
  var defaultPartitionExpirationMs: js.UndefOr[String] = js.native
  
  /**
    * [Optional] The default lifetime of all tables in the dataset, in
    * milliseconds. The minimum value is 3600000 milliseconds (one hour). Once
    * this property is set, all newly-created tables in the dataset will have
    * an expirationTime property set to the creation time plus the value in
    * this property, and changing the value will only affect new tables, not
    * existing ones. When the expirationTime for a given table is reached, that
    * table will be deleted automatically. If a table&#39;s expirationTime is
    * modified or removed before the table expires, or if you provide an
    * explicit expirationTime when creating a table, that value takes
    * precedence over the default expiration time indicated by this property.
    */
  var defaultTableExpirationMs: js.UndefOr[String] = js.native
  
  /**
    * [Optional] A user-friendly description of the dataset.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * [Output-only] A hash of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  
  /**
    * [Optional] A descriptive name for the dataset.
    */
  var friendlyName: js.UndefOr[String] = js.native
  
  /**
    * [Output-only] The fully-qualified unique name of the dataset in the
    * format projectId:datasetId. The dataset name without the project name is
    * given in the datasetId field. When creating a new dataset, leave this
    * field blank, and instead specify the datasetId field.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * [Output-only] The resource type.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The labels associated with this dataset. You can use these to organize
    * and group your datasets. You can set this property when inserting or
    * updating a dataset. See Creating and Updating Dataset Labels for more
    * information.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * [Output-only] The date when this dataset or any of its tables was last
    * modified, in milliseconds since the epoch.
    */
  var lastModifiedTime: js.UndefOr[String] = js.native
  
  /**
    * The geographic location where the dataset should reside. The default
    * value is US. See details at
    * https://cloud.google.com/bigquery/docs/locations.
    */
  var location: js.UndefOr[String] = js.native
  
  /**
    * [Output-only] A URL that can be used to access the resource again. You
    * can use this URL in Get or Update requests to the resource.
    */
  var selfLink: js.UndefOr[String] = js.native
}
object SchemaDataset {
  
  @scala.inline
  def apply(): SchemaDataset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDataset]
  }
  
  @scala.inline
  implicit class SchemaDatasetOps[Self <: SchemaDataset] (val x: Self) extends AnyVal {
    
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
    def setAccessVarargs(value: Domain*): Self = this.set("access", js.Array(value :_*))
    
    @scala.inline
    def setAccess(value: js.Array[Domain]): Self = this.set("access", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccess: Self = this.set("access", js.undefined)
    
    @scala.inline
    def setCreationTime(value: String): Self = this.set("creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTime: Self = this.set("creationTime", js.undefined)
    
    @scala.inline
    def setDatasetReference(value: SchemaDatasetReference): Self = this.set("datasetReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatasetReference: Self = this.set("datasetReference", js.undefined)
    
    @scala.inline
    def setDefaultPartitionExpirationMs(value: String): Self = this.set("defaultPartitionExpirationMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultPartitionExpirationMs: Self = this.set("defaultPartitionExpirationMs", js.undefined)
    
    @scala.inline
    def setDefaultTableExpirationMs(value: String): Self = this.set("defaultTableExpirationMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultTableExpirationMs: Self = this.set("defaultTableExpirationMs", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    
    @scala.inline
    def setFriendlyName(value: String): Self = this.set("friendlyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFriendlyName: Self = this.set("friendlyName", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setLastModifiedTime(value: String): Self = this.set("lastModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedTime: Self = this.set("lastModifiedTime", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
  }
}
