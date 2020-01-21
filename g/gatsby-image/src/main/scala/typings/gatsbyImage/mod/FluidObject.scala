package typings.gatsbyImage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FluidObject extends js.Object {
  var aspectRatio: Double
  var base64: js.UndefOr[String] = js.undefined
  var media: js.UndefOr[String] = js.undefined
  var sizes: String
  var src: String
  var srcSet: String
  var srcSetWebp: js.UndefOr[String] = js.undefined
  var srcWebp: js.UndefOr[String] = js.undefined
  var tracedSVG: js.UndefOr[String] = js.undefined
}

object FluidObject {
  @scala.inline
  def apply(
    aspectRatio: Double,
    sizes: String,
    src: String,
    srcSet: String,
    base64: String = null,
    media: String = null,
    srcSetWebp: String = null,
    srcWebp: String = null,
    tracedSVG: String = null
  ): FluidObject = {
    val __obj = js.Dynamic.literal(aspectRatio = aspectRatio.asInstanceOf[js.Any], sizes = sizes.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], srcSet = srcSet.asInstanceOf[js.Any])
    if (base64 != null) __obj.updateDynamic("base64")(base64.asInstanceOf[js.Any])
    if (media != null) __obj.updateDynamic("media")(media.asInstanceOf[js.Any])
    if (srcSetWebp != null) __obj.updateDynamic("srcSetWebp")(srcSetWebp.asInstanceOf[js.Any])
    if (srcWebp != null) __obj.updateDynamic("srcWebp")(srcWebp.asInstanceOf[js.Any])
    if (tracedSVG != null) __obj.updateDynamic("tracedSVG")(tracedSVG.asInstanceOf[js.Any])
    __obj.asInstanceOf[FluidObject]
  }
}

