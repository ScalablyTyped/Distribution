package typings.googleapis.buildSrcApisCloudassetV1beta1Mod.cloudasset_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Cloud Storage location.
  */
@js.native
trait Schema$GcsDestination extends js.Object {
  /**
    * The uri of the Cloud Storage object. It&#39;s the same uri that is used
    * by gsutil. For example: &quot;gs://bucket_name/object_name&quot;. See
    * [Viewing and Editing Object
    * Metadata](https://cloud.google.com/storage/docs/viewing-editing-metadata)
    * for more information.
    */
  var uri: js.UndefOr[String] = js.native
}

object Schema$GcsDestination {
  @scala.inline
  def apply(uri: String = null): Schema$GcsDestination = {
    val __obj = js.Dynamic.literal()
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GcsDestination]
  }
}

