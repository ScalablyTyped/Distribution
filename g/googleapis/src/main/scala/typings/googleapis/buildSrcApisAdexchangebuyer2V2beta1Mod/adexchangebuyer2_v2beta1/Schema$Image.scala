package typings.googleapis.buildSrcApisAdexchangebuyer2V2beta1Mod.adexchangebuyer2_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An image resource. You may provide a larger image than was requested, so
  * long as the aspect ratio is preserved.
  */
@js.native
trait Schema$Image extends js.Object {
  /**
    * Image height in pixels.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * The URL of the image.
    */
  var url: js.UndefOr[String] = js.native
  /**
    * Image width in pixels.
    */
  var width: js.UndefOr[Double] = js.native
}

object Schema$Image {
  @scala.inline
  def apply(height: Int | Double = null, url: String = null, width: Int | Double = null): Schema$Image = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Image]
  }
}

