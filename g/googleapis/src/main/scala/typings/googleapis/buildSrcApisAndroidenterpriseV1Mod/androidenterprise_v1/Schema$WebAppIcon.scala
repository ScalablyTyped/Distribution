package typings.googleapis.buildSrcApisAndroidenterpriseV1Mod.androidenterprise_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Icon for a web app.
  */
@js.native
trait Schema$WebAppIcon extends js.Object {
  /**
    * The actual bytes of the image in a base64url encoded string (c.f.
    * RFC4648, section 5 &quot;Base 64 Encoding with URL and Filename Safe
    * Alphabet&quot;).   - The image type can be png or jpg. - The image should
    * ideally be square. - The image should ideally have a size of 512x512.
    */
  var imageData: js.UndefOr[String] = js.native
}

object Schema$WebAppIcon {
  @scala.inline
  def apply(imageData: String = null): Schema$WebAppIcon = {
    val __obj = js.Dynamic.literal()
    if (imageData != null) __obj.updateDynamic("imageData")(imageData.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$WebAppIcon]
  }
}

