package typings.gatsbyImage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FixedObject extends js.Object {
  var base64: js.UndefOr[String] = js.undefined
  var height: Double
  var media: js.UndefOr[String] = js.undefined
  var src: String
  var srcSet: String
  var srcSetWebp: js.UndefOr[String] = js.undefined
  var srcWebp: js.UndefOr[String] = js.undefined
  var tracedSVG: js.UndefOr[String] = js.undefined
  var width: Double
}

object FixedObject {
  @scala.inline
  def apply(
    height: Double,
    src: String,
    srcSet: String,
    width: Double,
    base64: String = null,
    media: String = null,
    srcSetWebp: String = null,
    srcWebp: String = null,
    tracedSVG: String = null
  ): FixedObject = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], srcSet = srcSet.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (base64 != null) __obj.updateDynamic("base64")(base64.asInstanceOf[js.Any])
    if (media != null) __obj.updateDynamic("media")(media.asInstanceOf[js.Any])
    if (srcSetWebp != null) __obj.updateDynamic("srcSetWebp")(srcSetWebp.asInstanceOf[js.Any])
    if (srcWebp != null) __obj.updateDynamic("srcWebp")(srcWebp.asInstanceOf[js.Any])
    if (tracedSVG != null) __obj.updateDynamic("tracedSVG")(tracedSVG.asInstanceOf[js.Any])
    __obj.asInstanceOf[FixedObject]
  }
}

