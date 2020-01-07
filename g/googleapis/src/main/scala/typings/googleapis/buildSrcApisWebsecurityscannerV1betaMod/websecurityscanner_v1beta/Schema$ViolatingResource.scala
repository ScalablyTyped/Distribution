package typings.googleapis.buildSrcApisWebsecurityscannerV1betaMod.websecurityscanner_v1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information regarding any resource causing the vulnerability such as
  * JavaScript sources, image, audio files, etc.
  */
@js.native
trait Schema$ViolatingResource extends js.Object {
  /**
    * The MIME type of this resource.
    */
  var contentType: js.UndefOr[String] = js.native
  /**
    * URL of this violating resource.
    */
  var resourceUrl: js.UndefOr[String] = js.native
}

object Schema$ViolatingResource {
  @scala.inline
  def apply(contentType: String = null, resourceUrl: String = null): Schema$ViolatingResource = {
    val __obj = js.Dynamic.literal()
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (resourceUrl != null) __obj.updateDynamic("resourceUrl")(resourceUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ViolatingResource]
  }
}

