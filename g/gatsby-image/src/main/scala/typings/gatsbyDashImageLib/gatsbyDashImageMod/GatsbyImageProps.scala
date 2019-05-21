package typings
package gatsbyDashImageLib.gatsbyDashImageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GatsbyImageProps extends js.Object {
  var Tag: js.UndefOr[java.lang.String] = js.undefined
  var alt: js.UndefOr[java.lang.String] = js.undefined
  var backgroundColor: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  var className: js.UndefOr[java.lang.String | js.Object] = js.undefined
  var critical: js.UndefOr[scala.Boolean] = js.undefined
  var crossOrigin: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  var fadeIn: js.UndefOr[scala.Boolean] = js.undefined
  var fixed: js.UndefOr[FixedObject] = js.undefined
  var fluid: js.UndefOr[FluidObject] = js.undefined
  var imgStyle: js.UndefOr[js.Object] = js.undefined
  var itemProp: js.UndefOr[java.lang.String] = js.undefined
  var loading: js.UndefOr[
    gatsbyDashImageLib.gatsbyDashImageLibStrings.auto | gatsbyDashImageLib.gatsbyDashImageLibStrings.`lazy` | gatsbyDashImageLib.gatsbyDashImageLibStrings.eager
  ] = js.undefined
  var onError: js.UndefOr[js.Function1[/* event */ js.Any, scala.Unit]] = js.undefined
  var onLoad: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onStartLoad: js.UndefOr[js.Function1[/* param */ gatsbyDashImageLib.Anon_WasCached, scala.Unit]] = js.undefined
  var placeholderStyle: js.UndefOr[js.Object] = js.undefined
  var resolutions: js.UndefOr[FixedObject] = js.undefined
  var sizes: js.UndefOr[FluidObject] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object GatsbyImageProps {
  @scala.inline
  def apply(
    Tag: java.lang.String = null,
    alt: java.lang.String = null,
    backgroundColor: java.lang.String | scala.Boolean = null,
    className: java.lang.String | js.Object = null,
    critical: js.UndefOr[scala.Boolean] = js.undefined,
    crossOrigin: java.lang.String | scala.Boolean = null,
    fadeIn: js.UndefOr[scala.Boolean] = js.undefined,
    fixed: FixedObject = null,
    fluid: FluidObject = null,
    imgStyle: js.Object = null,
    itemProp: java.lang.String = null,
    loading: gatsbyDashImageLib.gatsbyDashImageLibStrings.auto | gatsbyDashImageLib.gatsbyDashImageLibStrings.`lazy` | gatsbyDashImageLib.gatsbyDashImageLibStrings.eager = null,
    onError: /* event */ js.Any => scala.Unit = null,
    onLoad: () => scala.Unit = null,
    onStartLoad: /* param */ gatsbyDashImageLib.Anon_WasCached => scala.Unit = null,
    placeholderStyle: js.Object = null,
    resolutions: FixedObject = null,
    sizes: FluidObject = null,
    style: js.Object = null,
    title: java.lang.String = null
  ): GatsbyImageProps = {
    val __obj = js.Dynamic.literal()
    if (Tag != null) __obj.updateDynamic("Tag")(Tag)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(critical)) __obj.updateDynamic("critical")(critical)
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (!js.isUndefined(fadeIn)) __obj.updateDynamic("fadeIn")(fadeIn)
    if (fixed != null) __obj.updateDynamic("fixed")(fixed)
    if (fluid != null) __obj.updateDynamic("fluid")(fluid)
    if (imgStyle != null) __obj.updateDynamic("imgStyle")(imgStyle)
    if (itemProp != null) __obj.updateDynamic("itemProp")(itemProp)
    if (loading != null) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction0(onLoad))
    if (onStartLoad != null) __obj.updateDynamic("onStartLoad")(js.Any.fromFunction1(onStartLoad))
    if (placeholderStyle != null) __obj.updateDynamic("placeholderStyle")(placeholderStyle)
    if (resolutions != null) __obj.updateDynamic("resolutions")(resolutions)
    if (sizes != null) __obj.updateDynamic("sizes")(sizes)
    if (style != null) __obj.updateDynamic("style")(style)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[GatsbyImageProps]
  }
}

