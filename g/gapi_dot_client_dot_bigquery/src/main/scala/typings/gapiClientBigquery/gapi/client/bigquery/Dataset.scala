package typings.gapiClientBigquery.gapi.client.bigquery

import typings.gapiClientBigquery.anon.Domain
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dataset extends js.Object {
  /**
    * [Optional] An array of objects that define dataset access for one or more entities. You can set this property when inserting or updating a dataset in
    * order to control who is allowed to access the data. If unspecified at dataset creation time, BigQuery adds default dataset access for the following
    * entities: access.specialGroup: projectReaders; access.role: READER; access.specialGroup: projectWriters; access.role: WRITER; access.specialGroup:
    * projectOwners; access.role: OWNER; access.userByEmail: [dataset creator email]; access.role: OWNER;
    */
  var access: js.UndefOr[js.Array[Domain]] = js.native
  /** [Output-only] The time when this dataset was created, in milliseconds since the epoch. */
  var creationTime: js.UndefOr[String] = js.native
  /** [Required] A reference that identifies the dataset. */
  var datasetReference: js.UndefOr[DatasetReference] = js.native
  /**
    * [Optional] The default lifetime of all tables in the dataset, in milliseconds. The minimum value is 3600000 milliseconds (one hour). Once this property
    * is set, all newly-created tables in the dataset will have an expirationTime property set to the creation time plus the value in this property, and
    * changing the value will only affect new tables, not existing ones. When the expirationTime for a given table is reached, that table will be deleted
    * automatically. If a table's expirationTime is modified or removed before the table expires, or if you provide an explicit expirationTime when creating
    * a table, that value takes precedence over the default expiration time indicated by this property.
    */
  var defaultTableExpirationMs: js.UndefOr[String] = js.native
  /** [Optional] A user-friendly description of the dataset. */
  var description: js.UndefOr[String] = js.native
  /** [Output-only] A hash of the resource. */
  var etag: js.UndefOr[String] = js.native
  /** [Optional] A descriptive name for the dataset. */
  var friendlyName: js.UndefOr[String] = js.native
  /**
    * [Output-only] The fully-qualified unique name of the dataset in the format projectId:datasetId. The dataset name without the project name is given in
    * the datasetId field. When creating a new dataset, leave this field blank, and instead specify the datasetId field.
    */
  var id: js.UndefOr[String] = js.native
  /** [Output-only] The resource type. */
  var kind: js.UndefOr[String] = js.native
  /**
    * The labels associated with this dataset. You can use these to organize and group your datasets. You can set this property when inserting or updating a
    * dataset. See Labeling Datasets for more information.
    */
  var labels: js.UndefOr[Record[String, String]] = js.native
  /** [Output-only] The date when this dataset or any of its tables was last modified, in milliseconds since the epoch. */
  var lastModifiedTime: js.UndefOr[String] = js.native
  /** The geographic location where the dataset should reside. Possible values include EU and US. The default value is US. */
  var location: js.UndefOr[String] = js.native
  /** [Output-only] A URL that can be used to access the resource again. You can use this URL in Get or Update requests to the resource. */
  var selfLink: js.UndefOr[String] = js.native
}

object Dataset {
  @scala.inline
  def apply(): Dataset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dataset]
  }
  @scala.inline
  implicit class DatasetOps[Self <: Dataset] (val x: Self) extends AnyVal {
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
    def setDatasetReference(value: DatasetReference): Self = this.set("datasetReference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatasetReference: Self = this.set("datasetReference", js.undefined)
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
    def setLabels(value: Record[String, String]): Self = this.set("labels", value.asInstanceOf[js.Any])
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

