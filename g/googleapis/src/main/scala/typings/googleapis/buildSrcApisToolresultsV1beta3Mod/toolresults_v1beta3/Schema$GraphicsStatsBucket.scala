package typings.googleapis.buildSrcApisToolresultsV1beta3Mod.toolresults_v1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$GraphicsStatsBucket extends js.Object {
  /**
    * Number of frames in the bucket.
    */
  var frameCount: js.UndefOr[String] = js.native
  /**
    * Lower bound of render time in milliseconds.
    */
  var renderMillis: js.UndefOr[String] = js.native
}

object Schema$GraphicsStatsBucket {
  @scala.inline
  def apply(frameCount: String = null, renderMillis: String = null): Schema$GraphicsStatsBucket = {
    val __obj = js.Dynamic.literal()
    if (frameCount != null) __obj.updateDynamic("frameCount")(frameCount.asInstanceOf[js.Any])
    if (renderMillis != null) __obj.updateDynamic("renderMillis")(renderMillis.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GraphicsStatsBucket]
  }
}

