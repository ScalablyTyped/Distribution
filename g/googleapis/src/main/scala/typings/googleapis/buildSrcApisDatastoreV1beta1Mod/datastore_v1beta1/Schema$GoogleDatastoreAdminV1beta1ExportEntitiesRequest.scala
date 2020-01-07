package typings.googleapis.buildSrcApisDatastoreV1beta1Mod.datastore_v1beta1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request for
  * google.datastore.admin.v1beta1.DatastoreAdmin.ExportEntities.
  */
@js.native
trait Schema$GoogleDatastoreAdminV1beta1ExportEntitiesRequest extends js.Object {
  /**
    * Description of what data from the project is included in the export.
    */
  var entityFilter: js.UndefOr[Schema$GoogleDatastoreAdminV1beta1EntityFilter] = js.native
  /**
    * Client-assigned labels.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Location for the export metadata and data files.  The full resource URL
    * of the external storage location. Currently, only Google Cloud Storage is
    * supported. So output_url_prefix should be of the form:
    * `gs://BUCKET_NAME[/NAMESPACE_PATH]`, where `BUCKET_NAME` is the name of
    * the Cloud Storage bucket and `NAMESPACE_PATH` is an optional Cloud
    * Storage namespace path (this is not a Cloud Datastore namespace). For
    * more information about Cloud Storage namespace paths, see [Object name
    * considerations](https://cloud.google.com/storage/docs/naming#object-considerations).
    * The resulting files will be nested deeper than the specified URL prefix.
    * The final output URL will be provided in the
    * google.datastore.admin.v1beta1.ExportEntitiesResponse.output_url field.
    * That value should be used for subsequent ImportEntities operations.  By
    * nesting the data files deeper, the same Cloud Storage bucket can be used
    * in multiple ExportEntities operations without conflict.
    */
  var outputUrlPrefix: js.UndefOr[String] = js.native
}

object Schema$GoogleDatastoreAdminV1beta1ExportEntitiesRequest {
  @scala.inline
  def apply(
    entityFilter: Schema$GoogleDatastoreAdminV1beta1EntityFilter = null,
    labels: StringDictionary[String] = null,
    outputUrlPrefix: String = null
  ): Schema$GoogleDatastoreAdminV1beta1ExportEntitiesRequest = {
    val __obj = js.Dynamic.literal()
    if (entityFilter != null) __obj.updateDynamic("entityFilter")(entityFilter.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (outputUrlPrefix != null) __obj.updateDynamic("outputUrlPrefix")(outputUrlPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleDatastoreAdminV1beta1ExportEntitiesRequest]
  }
}

