package typings
package gestaltLib.gestaltMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageProps extends js.Object {
  var alt: java.lang.String
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var color: java.lang.String
  var fit: js.UndefOr[
    gestaltLib.gestaltLibStrings.cover | gestaltLib.gestaltLibStrings.contain | gestaltLib.gestaltLibStrings.none
  ] = js.undefined
  var naturalHeight: scala.Double
  var naturalWidth: scala.Double
  var onError: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onLoad: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var size: js.UndefOr[java.lang.String] = js.undefined
  var src: java.lang.String
  var srcSet: js.UndefOr[java.lang.String] = js.undefined
}

object ImageProps {
  @scala.inline
  def apply(
    alt: java.lang.String,
    color: java.lang.String,
    naturalHeight: scala.Double,
    naturalWidth: scala.Double,
    src: java.lang.String,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    fit: gestaltLib.gestaltLibStrings.cover | gestaltLib.gestaltLibStrings.contain | gestaltLib.gestaltLibStrings.none = null,
    onError: js.Function0[scala.Unit] = null,
    onLoad: js.Function0[scala.Unit] = null,
    size: java.lang.String = null,
    srcSet: java.lang.String = null
  ): ImageProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("alt")(alt)
    __obj.updateDynamic("color")(color)
    __obj.updateDynamic("naturalHeight")(naturalHeight)
    __obj.updateDynamic("naturalWidth")(naturalWidth)
    __obj.updateDynamic("src")(src)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (fit != null) __obj.updateDynamic("fit")(fit.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(onError)
    if (onLoad != null) __obj.updateDynamic("onLoad")(onLoad)
    if (size != null) __obj.updateDynamic("size")(size)
    if (srcSet != null) __obj.updateDynamic("srcSet")(srcSet)
    __obj.asInstanceOf[ImageProps]
  }
}

