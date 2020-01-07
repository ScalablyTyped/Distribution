package typings.googleapis.buildSrcApisVisionV1Mod.vision_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The desired input location and metadata.
  */
@js.native
trait Schema$InputConfig extends js.Object {
  /**
    * The Google Cloud Storage location to read the input from.
    */
  var gcsSource: js.UndefOr[Schema$GcsSource] = js.native
  /**
    * The type of the file. Currently only &quot;application/pdf&quot; and
    * &quot;image/tiff&quot; are supported. Wildcards are not supported.
    */
  var mimeType: js.UndefOr[String] = js.native
}

object Schema$InputConfig {
  @scala.inline
  def apply(gcsSource: Schema$GcsSource = null, mimeType: String = null): Schema$InputConfig = {
    val __obj = js.Dynamic.literal()
    if (gcsSource != null) __obj.updateDynamic("gcsSource")(gcsSource.asInstanceOf[js.Any])
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$InputConfig]
  }
}

