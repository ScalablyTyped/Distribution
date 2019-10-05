package typings.gapiDotClientDotVision.gapi.client.vision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Image extends js.Object {
  /**
    * Image content, represented as a stream of bytes.
    * Note: as with all `bytes` fields, protobuffers use a pure binary
    * representation, whereas JSON representations use base64.
    */
  var content: js.UndefOr[String] = js.undefined
  /**
    * Google Cloud Storage image location. If both `content` and `source`
    * are provided for an image, `content` takes precedence and is
    * used to perform the image annotation request.
    */
  var source: js.UndefOr[ImageSource] = js.undefined
}

object Image {
  @scala.inline
  def apply(content: String = null, source: ImageSource = null): Image = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[Image]
  }
}

