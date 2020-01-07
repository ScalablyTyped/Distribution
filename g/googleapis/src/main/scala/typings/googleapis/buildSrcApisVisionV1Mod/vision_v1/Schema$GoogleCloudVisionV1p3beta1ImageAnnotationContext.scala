package typings.googleapis.buildSrcApisVisionV1Mod.vision_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * If an image was produced from a file (e.g. a PDF), this message gives
  * information about the source of that image.
  */
@js.native
trait Schema$GoogleCloudVisionV1p3beta1ImageAnnotationContext extends js.Object {
  /**
    * If the file was a PDF or TIFF, this field gives the page number within
    * the file used to produce the image.
    */
  var pageNumber: js.UndefOr[Double] = js.native
  /**
    * The URI of the file used to produce the image.
    */
  var uri: js.UndefOr[String] = js.native
}

object Schema$GoogleCloudVisionV1p3beta1ImageAnnotationContext {
  @scala.inline
  def apply(pageNumber: Int | Double = null, uri: String = null): Schema$GoogleCloudVisionV1p3beta1ImageAnnotationContext = {
    val __obj = js.Dynamic.literal()
    if (pageNumber != null) __obj.updateDynamic("pageNumber")(pageNumber.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudVisionV1p3beta1ImageAnnotationContext]
  }
}

