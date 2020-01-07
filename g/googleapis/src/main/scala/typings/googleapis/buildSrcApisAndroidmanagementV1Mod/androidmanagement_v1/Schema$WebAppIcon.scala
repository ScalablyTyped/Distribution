package typings.googleapis.buildSrcApisAndroidmanagementV1Mod.androidmanagement_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An icon for a web app. Supported formats are: png, jpg and webp.
  */
@js.native
trait Schema$WebAppIcon extends js.Object {
  /**
    * The actual bytes of the image in a base64url encoded string (c.f.
    * RFC4648, section 5 &quot;Base 64 Encoding with URL and Filename Safe
    * Alphabet&quot;). &lt;ul&gt; &lt;li&gt;The image type can be png or jpg.
    * &lt;li&gt;The image should ideally be square. &lt;li&gt;The image should
    * ideally have a size of 512x512. &lt;/ul&gt;
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

