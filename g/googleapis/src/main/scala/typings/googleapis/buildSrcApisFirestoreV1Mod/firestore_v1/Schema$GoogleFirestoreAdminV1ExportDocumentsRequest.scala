package typings.googleapis.buildSrcApisFirestoreV1Mod.firestore_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request for FirestoreAdmin.ExportDocuments.
  */
@js.native
trait Schema$GoogleFirestoreAdminV1ExportDocumentsRequest extends js.Object {
  /**
    * Which collection ids to export. Unspecified means all collections.
    */
  var collectionIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * The output URI. Currently only supports Google Cloud Storage URIs of the
    * form: `gs://BUCKET_NAME[/NAMESPACE_PATH]`, where `BUCKET_NAME` is the
    * name of the Google Cloud Storage bucket and `NAMESPACE_PATH` is an
    * optional Google Cloud Storage namespace path. When choosing a name, be
    * sure to consider Google Cloud Storage naming guidelines:
    * https://cloud.google.com/storage/docs/naming. If the URI is a bucket
    * (without a namespace path), a prefix will be generated based on the start
    * time.
    */
  var outputUriPrefix: js.UndefOr[String] = js.native
}

object Schema$GoogleFirestoreAdminV1ExportDocumentsRequest {
  @scala.inline
  def apply(collectionIds: js.Array[String] = null, outputUriPrefix: String = null): Schema$GoogleFirestoreAdminV1ExportDocumentsRequest = {
    val __obj = js.Dynamic.literal()
    if (collectionIds != null) __obj.updateDynamic("collectionIds")(collectionIds.asInstanceOf[js.Any])
    if (outputUriPrefix != null) __obj.updateDynamic("outputUriPrefix")(outputUriPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleFirestoreAdminV1ExportDocumentsRequest]
  }
}

