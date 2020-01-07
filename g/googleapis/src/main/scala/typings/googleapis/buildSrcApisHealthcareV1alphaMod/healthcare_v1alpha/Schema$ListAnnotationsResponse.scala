package typings.googleapis.buildSrcApisHealthcareV1alphaMod.healthcare_v1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Lists the Annotations in the specified Annotation store.
  */
@js.native
trait Schema$ListAnnotationsResponse extends js.Object {
  /**
    * The returned Annotations names. Won&#39;t be more values than the value
    * of page_size in the request.
    */
  var annotations: js.UndefOr[js.Array[String]] = js.native
  /**
    * Token to retrieve the next page of results or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$ListAnnotationsResponse {
  @scala.inline
  def apply(annotations: js.Array[String] = null, nextPageToken: String = null): Schema$ListAnnotationsResponse = {
    val __obj = js.Dynamic.literal()
    if (annotations != null) __obj.updateDynamic("annotations")(annotations.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListAnnotationsResponse]
  }
}

