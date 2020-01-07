package typings.googleapis.buildSrcApisVisionV1p2beta1Mod.vision_v1p2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Google Cloud Storage location where the input will be read from.
  */
@js.native
trait Schema$GoogleCloudVisionV1p2beta1GcsSource extends js.Object {
  /**
    * Google Cloud Storage URI for the input file. This must only be a Google
    * Cloud Storage object. Wildcards are not currently supported.
    */
  var uri: js.UndefOr[String] = js.native
}

object Schema$GoogleCloudVisionV1p2beta1GcsSource {
  @scala.inline
  def apply(uri: String = null): Schema$GoogleCloudVisionV1p2beta1GcsSource = {
    val __obj = js.Dynamic.literal()
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudVisionV1p2beta1GcsSource]
  }
}

