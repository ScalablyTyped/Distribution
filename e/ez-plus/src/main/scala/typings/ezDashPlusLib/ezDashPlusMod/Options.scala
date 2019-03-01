package typings
package ezDashPlusLib.ezDashPlusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Attribute to plugin use for zoom
    */
  var attrImageZoomSrc: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Border Colour
    */
  var borderColour: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Border Size of the ZoomBox
    */
  var borderSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * In pixels the dimensions you want to constrain on
    */
  var constrainSize: js.UndefOr[scala.Double | ezDashPlusLib.ezDashPlusLibNumbers.`false`] = js.undefined
  var constrainType: js.UndefOr[
    ezDashPlusLib.ezDashPlusLibStrings.width | ezDashPlusLib.ezDashPlusLibStrings.height
  ] = js.undefined
  var containLensZoom: js.UndefOr[scala.Boolean] = js.undefined
  var container: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Type of cursor
    */
  var cursor: js.UndefOr[
    ezDashPlusLib.ezDashPlusLibStrings.default | ezDashPlusLib.ezDashPlusLibStrings.cursor | ezDashPlusLib.ezDashPlusLibStrings.crosshair
  ] = js.undefined
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Activate easing
    */
  var easing: js.UndefOr[scala.Boolean] = js.undefined
  var easingAmount: js.UndefOr[scala.Double] = js.undefined
  var easingDuration: js.UndefOr[scala.Double] = js.undefined
  var easingType: js.UndefOr[java.lang.String] = js.undefined
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * This assigns a set of gallery links to the zoom image
    */
  var gallery: js.UndefOr[java.lang.String] = js.undefined
  var galleryActiveClass: js.UndefOr[java.lang.String] = js.undefined
  var galleryEvent: js.UndefOr[java.lang.String] = js.undefined
  var galleryItem: js.UndefOr[java.lang.String] = js.undefined
  var gallerySelector: js.UndefOr[java.lang.String | ezDashPlusLib.ezDashPlusLibNumbers.`false`] = js.undefined
  /**
    * Activate simultaneous crossfade of images on gallery change
    */
  var imageCrossfade: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Width in pixels of the lens border
    */
  var lensBorder: js.UndefOr[scala.Double] = js.undefined
  /**
    * Colour of the lens background
    */
  var lensColour: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Speed of Lens fadeIn
    */
  var lensFadeIn: js.UndefOr[scala.Double] = js.undefined
  /**
    * Speed of Lens fadeOut
    */
  var lensFadeOut: js.UndefOr[scala.Double] = js.undefined
  /**
    * Opacity of lens
    */
  var lensOpacity: js.UndefOr[scala.Double] = js.undefined
  /**
    * Type of lens
    */
  var lensShape: js.UndefOr[
    ezDashPlusLib.ezDashPlusLibStrings.square | ezDashPlusLib.ezDashPlusLibStrings.round
  ] = js.undefined
  /**
    * Used when zoomType set to lens
    */
  var lensSize: js.UndefOr[scala.Double] = js.undefined
  var lenszoom: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Activate spinner icon or url
    */
  var loadingIcon: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  var mantainZoomAspectRatio: js.UndefOr[scala.Boolean] = js.undefined
  var maxZoomLevel: js.UndefOr[scala.Double | ezDashPlusLib.ezDashPlusLibNumbers.`false`] = js.undefined
  var minZoomLevel: js.UndefOr[scala.Double] = js.undefined
  var preloading: js.UndefOr[ezDashPlusLib.ezDashPlusLibNumbers.`0` | ezDashPlusLib.ezDashPlusLibNumbers.`1`] = js.undefined
  var respond: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Activate responsivenes
    */
  var responsive: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Activate zoom on mouse scroll
    */
  var scrollZoom: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Steps of the scrollzoom
    */
  var scrollZoomIncrement: js.UndefOr[scala.Double] = js.undefined
  /**
    * Enable a tint overlay
    */
  var tint: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Colour of the tin
    */
  var tintColour: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Opacity of the tint
    */
  var tintOpacity: js.UndefOr[scala.Double] = js.undefined
  var touchEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var zIndex: js.UndefOr[scala.Double] = js.undefined
  var zoomActivation: js.UndefOr[
    ezDashPlusLib.ezDashPlusLibStrings.click | ezDashPlusLib.ezDashPlusLibStrings.hover
  ] = js.undefined
  /**
    * Zoom container parent selector
    */
  var zoomContainerAppendTo: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Identifier for the zoom container
    */
  var zoomId: js.UndefOr[scala.Double] = js.undefined
  /**
    * Enable Lens
    */
  var zoomLens: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Zoom level of image
    */
  var zoomLevel: js.UndefOr[scala.Double] = js.undefined
  /**
    * Speed of Tint fadeIn
    */
  var zoomTintFadeIn: js.UndefOr[scala.Double] = js.undefined
  /**
    * Speed of Tint fadeOut
    */
  var zoomTintFadeOut: js.UndefOr[scala.Double] = js.undefined
  /**
    * Type of zoom
    */
  var zoomType: js.UndefOr[
    ezDashPlusLib.ezDashPlusLibStrings.lens | ezDashPlusLib.ezDashPlusLibStrings.window | ezDashPlusLib.ezDashPlusLibStrings.inner
  ] = js.undefined
  /**
    * Speed of Window fadeIn
    */
  var zoomWindowFadeIn: js.UndefOr[scala.Double] = js.undefined
  /**
    * Speed of Window fadeOut
    */
  var zoomWindowFadeOut: js.UndefOr[scala.Double] = js.undefined
  /**
    * Height of the zoomWindow
    */
  var zoomWindowHeight: js.UndefOr[scala.Double] = js.undefined
  /**
    * x-axis offset of the zoom window
    */
  var zoomWindowOffsetX: js.UndefOr[scala.Double] = js.undefined
  /**
    * y-axis offset of the zoom window
    */
  var zoomWindowOffsetY: js.UndefOr[scala.Double] = js.undefined
  var zoomWindowPosition: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * Width of the zoomWindow
    */
  var zoomWindowWidth: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    attrImageZoomSrc: java.lang.String = null,
    borderColour: java.lang.String = null,
    borderSize: scala.Int | scala.Double = null,
    constrainSize: scala.Double | ezDashPlusLib.ezDashPlusLibNumbers.`false` = null,
    constrainType: ezDashPlusLib.ezDashPlusLibStrings.width | ezDashPlusLib.ezDashPlusLibStrings.height = null,
    containLensZoom: js.UndefOr[scala.Boolean] = js.undefined,
    container: java.lang.String = null,
    cursor: ezDashPlusLib.ezDashPlusLibStrings.default | ezDashPlusLib.ezDashPlusLibStrings.cursor | ezDashPlusLib.ezDashPlusLibStrings.crosshair = null,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    easing: js.UndefOr[scala.Boolean] = js.undefined,
    easingAmount: scala.Int | scala.Double = null,
    easingDuration: scala.Int | scala.Double = null,
    easingType: java.lang.String = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    gallery: java.lang.String = null,
    galleryActiveClass: java.lang.String = null,
    galleryEvent: java.lang.String = null,
    galleryItem: java.lang.String = null,
    gallerySelector: java.lang.String | ezDashPlusLib.ezDashPlusLibNumbers.`false` = null,
    imageCrossfade: js.UndefOr[scala.Boolean] = js.undefined,
    lensBorder: scala.Int | scala.Double = null,
    lensColour: java.lang.String = null,
    lensFadeIn: scala.Int | scala.Double = null,
    lensFadeOut: scala.Int | scala.Double = null,
    lensOpacity: scala.Int | scala.Double = null,
    lensShape: ezDashPlusLib.ezDashPlusLibStrings.square | ezDashPlusLib.ezDashPlusLibStrings.round = null,
    lensSize: scala.Int | scala.Double = null,
    lenszoom: js.UndefOr[scala.Boolean] = js.undefined,
    loadingIcon: scala.Boolean | java.lang.String = null,
    mantainZoomAspectRatio: js.UndefOr[scala.Boolean] = js.undefined,
    maxZoomLevel: scala.Double | ezDashPlusLib.ezDashPlusLibNumbers.`false` = null,
    minZoomLevel: scala.Int | scala.Double = null,
    preloading: ezDashPlusLib.ezDashPlusLibNumbers.`0` | ezDashPlusLib.ezDashPlusLibNumbers.`1` = null,
    respond: js.Array[_] = null,
    responsive: js.UndefOr[scala.Boolean] = js.undefined,
    scrollZoom: js.UndefOr[scala.Boolean] = js.undefined,
    scrollZoomIncrement: scala.Int | scala.Double = null,
    tint: js.UndefOr[scala.Boolean] = js.undefined,
    tintColour: java.lang.String = null,
    tintOpacity: scala.Int | scala.Double = null,
    touchEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    zIndex: scala.Int | scala.Double = null,
    zoomActivation: ezDashPlusLib.ezDashPlusLibStrings.click | ezDashPlusLib.ezDashPlusLibStrings.hover = null,
    zoomContainerAppendTo: java.lang.String = null,
    zoomId: scala.Int | scala.Double = null,
    zoomLens: js.UndefOr[scala.Boolean] = js.undefined,
    zoomLevel: scala.Int | scala.Double = null,
    zoomTintFadeIn: scala.Int | scala.Double = null,
    zoomTintFadeOut: scala.Int | scala.Double = null,
    zoomType: ezDashPlusLib.ezDashPlusLibStrings.lens | ezDashPlusLib.ezDashPlusLibStrings.window | ezDashPlusLib.ezDashPlusLibStrings.inner = null,
    zoomWindowFadeIn: scala.Int | scala.Double = null,
    zoomWindowFadeOut: scala.Int | scala.Double = null,
    zoomWindowHeight: scala.Int | scala.Double = null,
    zoomWindowOffsetX: scala.Int | scala.Double = null,
    zoomWindowOffsetY: scala.Int | scala.Double = null,
    zoomWindowPosition: scala.Double | java.lang.String = null,
    zoomWindowWidth: scala.Int | scala.Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (attrImageZoomSrc != null) __obj.updateDynamic("attrImageZoomSrc")(attrImageZoomSrc)
    if (borderColour != null) __obj.updateDynamic("borderColour")(borderColour)
    if (borderSize != null) __obj.updateDynamic("borderSize")(borderSize.asInstanceOf[js.Any])
    if (constrainSize != null) __obj.updateDynamic("constrainSize")(constrainSize.asInstanceOf[js.Any])
    if (constrainType != null) __obj.updateDynamic("constrainType")(constrainType.asInstanceOf[js.Any])
    if (!js.isUndefined(containLensZoom)) __obj.updateDynamic("containLensZoom")(containLensZoom)
    if (container != null) __obj.updateDynamic("container")(container)
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (!js.isUndefined(easing)) __obj.updateDynamic("easing")(easing)
    if (easingAmount != null) __obj.updateDynamic("easingAmount")(easingAmount.asInstanceOf[js.Any])
    if (easingDuration != null) __obj.updateDynamic("easingDuration")(easingDuration.asInstanceOf[js.Any])
    if (easingType != null) __obj.updateDynamic("easingType")(easingType)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (gallery != null) __obj.updateDynamic("gallery")(gallery)
    if (galleryActiveClass != null) __obj.updateDynamic("galleryActiveClass")(galleryActiveClass)
    if (galleryEvent != null) __obj.updateDynamic("galleryEvent")(galleryEvent)
    if (galleryItem != null) __obj.updateDynamic("galleryItem")(galleryItem)
    if (gallerySelector != null) __obj.updateDynamic("gallerySelector")(gallerySelector.asInstanceOf[js.Any])
    if (!js.isUndefined(imageCrossfade)) __obj.updateDynamic("imageCrossfade")(imageCrossfade)
    if (lensBorder != null) __obj.updateDynamic("lensBorder")(lensBorder.asInstanceOf[js.Any])
    if (lensColour != null) __obj.updateDynamic("lensColour")(lensColour)
    if (lensFadeIn != null) __obj.updateDynamic("lensFadeIn")(lensFadeIn.asInstanceOf[js.Any])
    if (lensFadeOut != null) __obj.updateDynamic("lensFadeOut")(lensFadeOut.asInstanceOf[js.Any])
    if (lensOpacity != null) __obj.updateDynamic("lensOpacity")(lensOpacity.asInstanceOf[js.Any])
    if (lensShape != null) __obj.updateDynamic("lensShape")(lensShape.asInstanceOf[js.Any])
    if (lensSize != null) __obj.updateDynamic("lensSize")(lensSize.asInstanceOf[js.Any])
    if (!js.isUndefined(lenszoom)) __obj.updateDynamic("lenszoom")(lenszoom)
    if (loadingIcon != null) __obj.updateDynamic("loadingIcon")(loadingIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(mantainZoomAspectRatio)) __obj.updateDynamic("mantainZoomAspectRatio")(mantainZoomAspectRatio)
    if (maxZoomLevel != null) __obj.updateDynamic("maxZoomLevel")(maxZoomLevel.asInstanceOf[js.Any])
    if (minZoomLevel != null) __obj.updateDynamic("minZoomLevel")(minZoomLevel.asInstanceOf[js.Any])
    if (preloading != null) __obj.updateDynamic("preloading")(preloading.asInstanceOf[js.Any])
    if (respond != null) __obj.updateDynamic("respond")(respond)
    if (!js.isUndefined(responsive)) __obj.updateDynamic("responsive")(responsive)
    if (!js.isUndefined(scrollZoom)) __obj.updateDynamic("scrollZoom")(scrollZoom)
    if (scrollZoomIncrement != null) __obj.updateDynamic("scrollZoomIncrement")(scrollZoomIncrement.asInstanceOf[js.Any])
    if (!js.isUndefined(tint)) __obj.updateDynamic("tint")(tint)
    if (tintColour != null) __obj.updateDynamic("tintColour")(tintColour)
    if (tintOpacity != null) __obj.updateDynamic("tintOpacity")(tintOpacity.asInstanceOf[js.Any])
    if (!js.isUndefined(touchEnabled)) __obj.updateDynamic("touchEnabled")(touchEnabled)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    if (zoomActivation != null) __obj.updateDynamic("zoomActivation")(zoomActivation.asInstanceOf[js.Any])
    if (zoomContainerAppendTo != null) __obj.updateDynamic("zoomContainerAppendTo")(zoomContainerAppendTo)
    if (zoomId != null) __obj.updateDynamic("zoomId")(zoomId.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomLens)) __obj.updateDynamic("zoomLens")(zoomLens)
    if (zoomLevel != null) __obj.updateDynamic("zoomLevel")(zoomLevel.asInstanceOf[js.Any])
    if (zoomTintFadeIn != null) __obj.updateDynamic("zoomTintFadeIn")(zoomTintFadeIn.asInstanceOf[js.Any])
    if (zoomTintFadeOut != null) __obj.updateDynamic("zoomTintFadeOut")(zoomTintFadeOut.asInstanceOf[js.Any])
    if (zoomType != null) __obj.updateDynamic("zoomType")(zoomType.asInstanceOf[js.Any])
    if (zoomWindowFadeIn != null) __obj.updateDynamic("zoomWindowFadeIn")(zoomWindowFadeIn.asInstanceOf[js.Any])
    if (zoomWindowFadeOut != null) __obj.updateDynamic("zoomWindowFadeOut")(zoomWindowFadeOut.asInstanceOf[js.Any])
    if (zoomWindowHeight != null) __obj.updateDynamic("zoomWindowHeight")(zoomWindowHeight.asInstanceOf[js.Any])
    if (zoomWindowOffsetX != null) __obj.updateDynamic("zoomWindowOffsetX")(zoomWindowOffsetX.asInstanceOf[js.Any])
    if (zoomWindowOffsetY != null) __obj.updateDynamic("zoomWindowOffsetY")(zoomWindowOffsetY.asInstanceOf[js.Any])
    if (zoomWindowPosition != null) __obj.updateDynamic("zoomWindowPosition")(zoomWindowPosition.asInstanceOf[js.Any])
    if (zoomWindowWidth != null) __obj.updateDynamic("zoomWindowWidth")(zoomWindowWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

