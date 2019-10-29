package typings.gatsbyDashImage.gatsbyDashImageMod

import typings.gatsbyDashImage.Anon_WasCached
import typings.gatsbyDashImage.gatsbyDashImageStrings.`lazy`
import typings.gatsbyDashImage.gatsbyDashImageStrings.auto
import typings.gatsbyDashImage.gatsbyDashImageStrings.eager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GatsbyImageProps extends js.Object {
  var Tag: js.UndefOr[String] = js.undefined
  var alt: js.UndefOr[String] = js.undefined
  var backgroundColor: js.UndefOr[String | Boolean] = js.undefined
  var className: js.UndefOr[String | js.Object] = js.undefined
  var critical: js.UndefOr[Boolean] = js.undefined
  var crossOrigin: js.UndefOr[String | Boolean] = js.undefined
  var draggable: js.UndefOr[Boolean] = js.undefined
  var durationFadeIn: js.UndefOr[Double] = js.undefined
  var fadeIn: js.UndefOr[Boolean] = js.undefined
  var fixed: js.UndefOr[FixedObject | js.Array[FixedObject]] = js.undefined
  var fluid: js.UndefOr[FluidObject | js.Array[FluidObject]] = js.undefined
  var imgStyle: js.UndefOr[js.Object] = js.undefined
  var itemProp: js.UndefOr[String] = js.undefined
  var loading: js.UndefOr[auto | `lazy` | eager] = js.undefined
  var onClick: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onError: js.UndefOr[js.Function1[/* event */ js.Any, Unit]] = js.undefined
  var onLoad: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onStartLoad: js.UndefOr[js.Function1[/* param */ Anon_WasCached, Unit]] = js.undefined
  var placeholderClassName: js.UndefOr[String] = js.undefined
  var placeholderStyle: js.UndefOr[js.Object] = js.undefined
  var resolutions: js.UndefOr[FixedObject] = js.undefined
  var sizes: js.UndefOr[FluidObject] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object GatsbyImageProps {
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
    onClick: () => Unit = null,
    onError: /* event */ js.Any => Unit = null,
    onLoad: () => Unit = null,
    onStartLoad: /* param */ Anon_WasCached => Unit = null,
    placeholderClassName: String = null,
    placeholderStyle: js.Object = null,
    resolutions: FixedObject = null,
    sizes: FluidObject = null,
    style: js.Object = null,
    title: String = null
  ): GatsbyImageProps = {
    val __obj = js.Dynamic.literal()
    if (Tag != null) __obj.updateDynamic("Tag")(Tag)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(critical)) __obj.updateDynamic("critical")(critical)
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable)
    if (durationFadeIn != null) __obj.updateDynamic("durationFadeIn")(durationFadeIn.asInstanceOf[js.Any])
    if (!js.isUndefined(fadeIn)) __obj.updateDynamic("fadeIn")(fadeIn)
    if (fixed != null) __obj.updateDynamic("fixed")(fixed.asInstanceOf[js.Any])
    if (fluid != null) __obj.updateDynamic("fluid")(fluid.asInstanceOf[js.Any])
    if (imgStyle != null) __obj.updateDynamic("imgStyle")(imgStyle)
    if (itemProp != null) __obj.updateDynamic("itemProp")(itemProp)
    if (loading != null) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction0(onClick))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction0(onLoad))
    if (onStartLoad != null) __obj.updateDynamic("onStartLoad")(js.Any.fromFunction1(onStartLoad))
    if (placeholderClassName != null) __obj.updateDynamic("placeholderClassName")(placeholderClassName)
    if (placeholderStyle != null) __obj.updateDynamic("placeholderStyle")(placeholderStyle)
    if (resolutions != null) __obj.updateDynamic("resolutions")(resolutions)
    if (sizes != null) __obj.updateDynamic("sizes")(sizes)
    if (style != null) __obj.updateDynamic("style")(style)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[GatsbyImageProps]
  }
}

