package typings.googleapis.buildSrcApisHealthcareV1alpha2Mod.healthcare_v1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Lists the Annotation stores in the given dataset.
  */
@js.native
trait Schema$ListAnnotationStoresResponse extends js.Object {
  /**
    * The returned Annotation stores. Won&#39;t be more Annotation stores than
    * the value of page_size in the request.
    */
  var annotationStores: js.UndefOr[js.Array[Schema$AnnotationStore]] = js.native
  /**
    * Token to retrieve the next page of results or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$ListAnnotationStoresResponse {
  @scala.inline
  def apply(annotationStores: js.Array[Schema$AnnotationStore] = null, nextPageToken: String = null): Schema$ListAnnotationStoresResponse = {
    val __obj = js.Dynamic.literal()
    if (annotationStores != null) __obj.updateDynamic("annotationStores")(annotationStores.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListAnnotationStoresResponse]
  }
}

