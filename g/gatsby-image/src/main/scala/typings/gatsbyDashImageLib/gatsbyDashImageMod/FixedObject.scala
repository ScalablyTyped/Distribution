package typings
package gatsbyDashImageLib.gatsbyDashImageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FixedObject extends js.Object {
  var base64: js.UndefOr[java.lang.String] = js.undefined
  var height: scala.Double
  var media: js.UndefOr[java.lang.String] = js.undefined
  var src: java.lang.String
  var srcSet: java.lang.String
  var srcSetWebp: js.UndefOr[java.lang.String] = js.undefined
  var srcWebp: js.UndefOr[java.lang.String] = js.undefined
  var tracedSVG: js.UndefOr[java.lang.String] = js.undefined
  var width: scala.Double
}

object FixedObject {
  @scala.inline
  def apply(
    height: scala.Double,
    src: java.lang.String,
    srcSet: java.lang.String,
    width: scala.Double,
    base64: java.lang.String = null,
    media: java.lang.String = null,
    srcSetWebp: java.lang.String = null,
    srcWebp: java.lang.String = null,
    tracedSVG: java.lang.String = null
  ): FixedObject = {
    val __obj = js.Dynamic.literal(height = height, src = src, srcSet = srcSet, width = width)
    if (base64 != null) __obj.updateDynamic("base64")(base64)
    if (media != null) __obj.updateDynamic("media")(media)
    if (srcSetWebp != null) __obj.updateDynamic("srcSetWebp")(srcSetWebp)
    if (srcWebp != null) __obj.updateDynamic("srcWebp")(srcWebp)
    if (tracedSVG != null) __obj.updateDynamic("tracedSVG")(tracedSVG)
    __obj.asInstanceOf[FixedObject]
  }
}

