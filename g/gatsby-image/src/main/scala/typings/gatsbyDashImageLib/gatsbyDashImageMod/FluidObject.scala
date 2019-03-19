package typings
package gatsbyDashImageLib.gatsbyDashImageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FluidObject extends js.Object {
  var aspectRatio: scala.Double
  var base64: js.UndefOr[java.lang.String] = js.undefined
  var sizes: java.lang.String
  var src: java.lang.String
  var srcSet: java.lang.String
  var srcSetWebp: js.UndefOr[java.lang.String] = js.undefined
  var srcWebp: js.UndefOr[java.lang.String] = js.undefined
  var tracedSVG: js.UndefOr[java.lang.String] = js.undefined
}

object FluidObject {
  @scala.inline
  def apply(
    aspectRatio: scala.Double,
    sizes: java.lang.String,
    src: java.lang.String,
    srcSet: java.lang.String,
    base64: java.lang.String = null,
    srcSetWebp: java.lang.String = null,
    srcWebp: java.lang.String = null,
    tracedSVG: java.lang.String = null
  ): FluidObject = {
    val __obj = js.Dynamic.literal(aspectRatio = aspectRatio, sizes = sizes, src = src, srcSet = srcSet)
    if (base64 != null) __obj.updateDynamic("base64")(base64)
    if (srcSetWebp != null) __obj.updateDynamic("srcSetWebp")(srcSetWebp)
    if (srcWebp != null) __obj.updateDynamic("srcWebp")(srcWebp)
    if (tracedSVG != null) __obj.updateDynamic("tracedSVG")(tracedSVG)
    __obj.asInstanceOf[FluidObject]
  }
}

