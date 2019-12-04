package typings.gatsbyDashImage.withIEPolyfillMod

import typings.gatsbyDashImage.Anon_WasCached
import typings.gatsbyDashImage.gatsbyDashImageMod.FixedObject
import typings.gatsbyDashImage.gatsbyDashImageMod.FluidObject
import typings.gatsbyDashImage.gatsbyDashImageMod.GatsbyImageProps
import typings.gatsbyDashImage.gatsbyDashImageStrings.`lazy`
import typings.gatsbyDashImage.gatsbyDashImageStrings.`scale-down`
import typings.gatsbyDashImage.gatsbyDashImageStrings.auto
import typings.gatsbyDashImage.gatsbyDashImageStrings.contain
import typings.gatsbyDashImage.gatsbyDashImageStrings.cover
import typings.gatsbyDashImage.gatsbyDashImageStrings.eager
import typings.gatsbyDashImage.gatsbyDashImageStrings.fill
import typings.gatsbyDashImage.gatsbyDashImageStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GatsbyImageWithIEPolyfillProps extends GatsbyImageProps {
  var objectFit: js.UndefOr[fill | contain | cover | none | `scale-down`] = js.undefined
  var objectPosition: js.UndefOr[String] = js.undefined
}

object GatsbyImageWithIEPolyfillProps {
  @scala.inline
  def apply(
    Tag: String = null,
    alt: String = null,
    backgroundColor: String | Boolean = null,
    className: String | js.Object = null,
    critical: js.UndefOr[Boolean] = js.undefined,
    crossOrigin: String | Boolean = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    durationFadeIn: Int | Double = null,
    fadeIn: js.UndefOr[Boolean] = js.undefined,
    fixed: FixedObject | js.Array[FixedObject] = null,
    fluid: FluidObject | js.Array[FluidObject] = null,
    imgStyle: js.Object = null,
    itemProp: String = null,
    loading: auto | `lazy` | eager = null,
    objectFit: fill | contain | cover | none | `scale-down` = null,
    objectPosition: String = null,
    onError: /* event */ js.Any => Unit = null,
    onLoad: () => Unit = null,
    onStartLoad: /* param */ Anon_WasCached => Unit = null,
    placeholderClassName: String = null,
    placeholderStyle: js.Object = null,
    resolutions: FixedObject = null,
    sizes: FluidObject = null,
    style: js.Object = null,
    title: String = null
  ): GatsbyImageWithIEPolyfillProps = {
    val __obj = js.Dynamic.literal()
    if (Tag != null) __obj.updateDynamic("Tag")(Tag.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(critical)) __obj.updateDynamic("critical")(critical.asInstanceOf[js.Any])
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (durationFadeIn != null) __obj.updateDynamic("durationFadeIn")(durationFadeIn.asInstanceOf[js.Any])
    if (!js.isUndefined(fadeIn)) __obj.updateDynamic("fadeIn")(fadeIn.asInstanceOf[js.Any])
    if (fixed != null) __obj.updateDynamic("fixed")(fixed.asInstanceOf[js.Any])
    if (fluid != null) __obj.updateDynamic("fluid")(fluid.asInstanceOf[js.Any])
    if (imgStyle != null) __obj.updateDynamic("imgStyle")(imgStyle.asInstanceOf[js.Any])
    if (itemProp != null) __obj.updateDynamic("itemProp")(itemProp.asInstanceOf[js.Any])
    if (loading != null) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (objectFit != null) __obj.updateDynamic("objectFit")(objectFit.asInstanceOf[js.Any])
    if (objectPosition != null) __obj.updateDynamic("objectPosition")(objectPosition.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction0(onLoad))
    if (onStartLoad != null) __obj.updateDynamic("onStartLoad")(js.Any.fromFunction1(onStartLoad))
    if (placeholderClassName != null) __obj.updateDynamic("placeholderClassName")(placeholderClassName.asInstanceOf[js.Any])
    if (placeholderStyle != null) __obj.updateDynamic("placeholderStyle")(placeholderStyle.asInstanceOf[js.Any])
    if (resolutions != null) __obj.updateDynamic("resolutions")(resolutions.asInstanceOf[js.Any])
    if (sizes != null) __obj.updateDynamic("sizes")(sizes.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatsbyImageWithIEPolyfillProps]
  }
}

