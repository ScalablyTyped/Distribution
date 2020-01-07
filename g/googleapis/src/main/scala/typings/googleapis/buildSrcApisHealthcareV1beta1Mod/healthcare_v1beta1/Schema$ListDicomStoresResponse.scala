package typings.googleapis.buildSrcApisHealthcareV1beta1Mod.healthcare_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Lists the DICOM stores in the given dataset.
  */
@js.native
trait Schema$ListDicomStoresResponse extends js.Object {
  /**
    * The returned DICOM stores. Won&#39;t be more DICOM stores than the value
    * of page_size in the request.
    */
  var dicomStores: js.UndefOr[js.Array[Schema$DicomStore]] = js.native
  /**
    * Token to retrieve the next page of results or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$ListDicomStoresResponse {
  @scala.inline
  def apply(dicomStores: js.Array[Schema$DicomStore] = null, nextPageToken: String = null): Schema$ListDicomStoresResponse = {
    val __obj = js.Dynamic.literal()
    if (dicomStores != null) __obj.updateDynamic("dicomStores")(dicomStores.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListDicomStoresResponse]
  }
}

