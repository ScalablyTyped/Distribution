package typings.ezDashPlus.ezDashPlusMod

import typings.ezDashPlus.ezDashPlusBooleans.`false`
import typings.ezDashPlus.ezDashPlusNumbers.`0`
import typings.ezDashPlus.ezDashPlusNumbers.`1`
import typings.ezDashPlus.ezDashPlusStrings.click
import typings.ezDashPlus.ezDashPlusStrings.crosshair
import typings.ezDashPlus.ezDashPlusStrings.cursor
import typings.ezDashPlus.ezDashPlusStrings.default
import typings.ezDashPlus.ezDashPlusStrings.height
import typings.ezDashPlus.ezDashPlusStrings.hover
import typings.ezDashPlus.ezDashPlusStrings.inner
import typings.ezDashPlus.ezDashPlusStrings.lens
import typings.ezDashPlus.ezDashPlusStrings.round
import typings.ezDashPlus.ezDashPlusStrings.square
import typings.ezDashPlus.ezDashPlusStrings.width
import typings.ezDashPlus.ezDashPlusStrings.window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Attribute to plugin use for zoom
    */
  var attrImageZoomSrc: js.UndefOr[String] = js.undefined
  /**
    * Border Colour
    */
  var borderColour: js.UndefOr[String] = js.undefined
  /**
    * Border Size of the ZoomBox
    */
  var borderSize: js.UndefOr[Double] = js.undefined
  /**
    * In pixels the dimensions you want to constrain on
    */
  var constrainSize: js.UndefOr[Double | `false`] = js.undefined
  var constrainType: js.UndefOr[width | height] = js.undefined
  var containLensZoom: js.UndefOr[Boolean] = js.undefined
  var container: js.UndefOr[String] = js.undefined
  /**
    * Type of cursor
    */
  var cursor: js.UndefOr[default | typings.ezDashPlus.ezDashPlusStrings.cursor | crosshair] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
  /**
    * Activate easing
    */
  var easing: js.UndefOr[Boolean] = js.undefined
  var easingAmount: js.UndefOr[Double] = js.undefined
  var easingDuration: js.UndefOr[Double] = js.undefined
  var easingType: js.UndefOr[String] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * This assigns a set of gallery links to the zoom image
    */
  var gallery: js.UndefOr[String] = js.undefined
  var galleryActiveClass: js.UndefOr[String] = js.undefined
  var galleryEvent: js.UndefOr[String] = js.undefined
  var galleryItem: js.UndefOr[String] = js.undefined
  var gallerySelector: js.UndefOr[String | `false`] = js.undefined
  /**
    * Activate simultaneous crossfade of images on gallery change
    */
  var imageCrossfade: js.UndefOr[Boolean] = js.undefined
  /**
    * Width in pixels of the lens border
    */
  var lensBorder: js.UndefOr[Double] = js.undefined
  /**
    * Colour of the lens background
    */
  var lensColour: js.UndefOr[String] = js.undefined
  /**
    * Speed of Lens fadeIn
    */
  var lensFadeIn: js.UndefOr[Double] = js.undefined
  /**
    * Speed of Lens fadeOut
    */
  var lensFadeOut: js.UndefOr[Double] = js.undefined
  /**
    * Opacity of lens
    */
  var lensOpacity: js.UndefOr[Double] = js.undefined
  /**
    * Type of lens
    */
  var lensShape: js.UndefOr[square | round] = js.undefined
  /**
    * Used when zoomType set to lens
    */
  var lensSize: js.UndefOr[Double] = js.undefined
  var lenszoom: js.UndefOr[Boolean] = js.undefined
  /**
    * Activate spinner icon or url
    */
  var loadingIcon: js.UndefOr[Boolean | String] = js.undefined
  var mantainZoomAspectRatio: js.UndefOr[Boolean] = js.undefined
  var maxZoomLevel: js.UndefOr[Double | `false`] = js.undefined
  var minZoomLevel: js.UndefOr[Double] = js.undefined
  var preloading: js.UndefOr[`0` | `1`] = js.undefined
  var respond: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Activate responsivenes
    */
  var responsive: js.UndefOr[Boolean] = js.undefined
  /**
    * Activate zoom on mouse scroll
    */
  var scrollZoom: js.UndefOr[Boolean] = js.undefined
  /**
    * Steps of the scrollzoom
    */
  var scrollZoomIncrement: js.UndefOr[Double] = js.undefined
  /**
    * Enable a tint overlay
    */
  var tint: js.UndefOr[Boolean] = js.undefined
  /**
    * Colour of the tin
    */
  var tintColour: js.UndefOr[String] = js.undefined
  /**
    * Opacity of the tint
    */
  var tintOpacity: js.UndefOr[Double] = js.undefined
  var touchEnabled: js.UndefOr[Boolean] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
  var zoomActivation: js.UndefOr[click | hover] = js.undefined
  /**
    * Zoom container parent selector
    */
  var zoomContainerAppendTo: js.UndefOr[String] = js.undefined
  /**
    * Identifier for the zoom container
    */
  var zoomId: js.UndefOr[Double] = js.undefined
  /**
    * Enable Lens
    */
  var zoomLens: js.UndefOr[Boolean] = js.undefined
  /**
    * Zoom level of image
    */
  var zoomLevel: js.UndefOr[Double] = js.undefined
  /**
    * Speed of Tint fadeIn
    */
  var zoomTintFadeIn: js.UndefOr[Double] = js.undefined
  /**
    * Speed of Tint fadeOut
    */
  var zoomTintFadeOut: js.UndefOr[Double] = js.undefined
  /**
    * Type of zoom
    */
  var zoomType: js.UndefOr[lens | window | inner] = js.undefined
  /**
    * Speed of Window fadeIn
    */
  var zoomWindowFadeIn: js.UndefOr[Double] = js.undefined
  /**
    * Speed of Window fadeOut
    */
  var zoomWindowFadeOut: js.UndefOr[Double] = js.undefined
  /**
    * Height of the zoomWindow
    */
  var zoomWindowHeight: js.UndefOr[Double] = js.undefined
  /**
    * x-axis offset of the zoom window
    */
  var zoomWindowOffsetX: js.UndefOr[Double] = js.undefined
  /**
    * y-axis offset of the zoom window
    */
  var zoomWindowOffsetY: js.UndefOr[Double] = js.undefined
  var zoomWindowPosition: js.UndefOr[Double | String] = js.undefined
  /**
    * Width of the zoomWindow
    */
  var zoomWindowWidth: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    attrImageZoomSrc: String = null,
    borderColour: String = null,
    borderSize: Int | Double = null,
    constrainSize: Double | `false` = null,
    constrainType: width | height = null,
    containLensZoom: js.UndefOr[Boolean] = js.undefined,
    container: String = null,
    cursor: default | cursor | crosshair = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    easing: js.UndefOr[Boolean] = js.undefined,
    easingAmount: Int | Double = null,
    easingDuration: Int | Double = null,
    easingType: String = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    gallery: String = null,
    galleryActiveClass: String = null,
    galleryEvent: String = null,
    galleryItem: String = null,
    gallerySelector: String | `false` = null,
    imageCrossfade: js.UndefOr[Boolean] = js.undefined,
    lensBorder: Int | Double = null,
    lensColour: String = null,
    lensFadeIn: Int | Double = null,
    lensFadeOut: Int | Double = null,
    lensOpacity: Int | Double = null,
    lensShape: square | round = null,
    lensSize: Int | Double = null,
    lenszoom: js.UndefOr[Boolean] = js.undefined,
    loadingIcon: Boolean | String = null,
    mantainZoomAspectRatio: js.UndefOr[Boolean] = js.undefined,
    maxZoomLevel: Double | `false` = null,
    minZoomLevel: Int | Double = null,
    preloading: `0` | `1` = null,
    respond: js.Array[_] = null,
    responsive: js.UndefOr[Boolean] = js.undefined,
    scrollZoom: js.UndefOr[Boolean] = js.undefined,
    scrollZoomIncrement: Int | Double = null,
    tint: js.UndefOr[Boolean] = js.undefined,
    tintColour: String = null,
    tintOpacity: Int | Double = null,
    touchEnabled: js.UndefOr[Boolean] = js.undefined,
    zIndex: Int | Double = null,
    zoomActivation: click | hover = null,
    zoomContainerAppendTo: String = null,
    zoomId: Int | Double = null,
    zoomLens: js.UndefOr[Boolean] = js.undefined,
    zoomLevel: Int | Double = null,
    zoomTintFadeIn: Int | Double = null,
    zoomTintFadeOut: Int | Double = null,
    zoomType: lens | window | inner = null,
    zoomWindowFadeIn: Int | Double = null,
    zoomWindowFadeOut: Int | Double = null,
    zoomWindowHeight: Int | Double = null,
    zoomWindowOffsetX: Int | Double = null,
    zoomWindowOffsetY: Int | Double = null,
    zoomWindowPosition: Double | String = null,
    zoomWindowWidth: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (attrImageZoomSrc != null) __obj.updateDynamic("attrImageZoomSrc")(attrImageZoomSrc.asInstanceOf[js.Any])
    if (borderColour != null) __obj.updateDynamic("borderColour")(borderColour.asInstanceOf[js.Any])
    if (borderSize != null) __obj.updateDynamic("borderSize")(borderSize.asInstanceOf[js.Any])
    if (constrainSize != null) __obj.updateDynamic("constrainSize")(constrainSize.asInstanceOf[js.Any])
    if (constrainType != null) __obj.updateDynamic("constrainType")(constrainType.asInstanceOf[js.Any])
    if (!js.isUndefined(containLensZoom)) __obj.updateDynamic("containLensZoom")(containLensZoom.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (!js.isUndefined(easing)) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (easingAmount != null) __obj.updateDynamic("easingAmount")(easingAmount.asInstanceOf[js.Any])
    if (easingDuration != null) __obj.updateDynamic("easingDuration")(easingDuration.asInstanceOf[js.Any])
    if (easingType != null) __obj.updateDynamic("easingType")(easingType.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (gallery != null) __obj.updateDynamic("gallery")(gallery.asInstanceOf[js.Any])
    if (galleryActiveClass != null) __obj.updateDynamic("galleryActiveClass")(galleryActiveClass.asInstanceOf[js.Any])
    if (galleryEvent != null) __obj.updateDynamic("galleryEvent")(galleryEvent.asInstanceOf[js.Any])
    if (galleryItem != null) __obj.updateDynamic("galleryItem")(galleryItem.asInstanceOf[js.Any])
    if (gallerySelector != null) __obj.updateDynamic("gallerySelector")(gallerySelector.asInstanceOf[js.Any])
    if (!js.isUndefined(imageCrossfade)) __obj.updateDynamic("imageCrossfade")(imageCrossfade.asInstanceOf[js.Any])
    if (lensBorder != null) __obj.updateDynamic("lensBorder")(lensBorder.asInstanceOf[js.Any])
    if (lensColour != null) __obj.updateDynamic("lensColour")(lensColour.asInstanceOf[js.Any])
    if (lensFadeIn != null) __obj.updateDynamic("lensFadeIn")(lensFadeIn.asInstanceOf[js.Any])
    if (lensFadeOut != null) __obj.updateDynamic("lensFadeOut")(lensFadeOut.asInstanceOf[js.Any])
    if (lensOpacity != null) __obj.updateDynamic("lensOpacity")(lensOpacity.asInstanceOf[js.Any])
    if (lensShape != null) __obj.updateDynamic("lensShape")(lensShape.asInstanceOf[js.Any])
    if (lensSize != null) __obj.updateDynamic("lensSize")(lensSize.asInstanceOf[js.Any])
    if (!js.isUndefined(lenszoom)) __obj.updateDynamic("lenszoom")(lenszoom.asInstanceOf[js.Any])
    if (loadingIcon != null) __obj.updateDynamic("loadingIcon")(loadingIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(mantainZoomAspectRatio)) __obj.updateDynamic("mantainZoomAspectRatio")(mantainZoomAspectRatio.asInstanceOf[js.Any])
    if (maxZoomLevel != null) __obj.updateDynamic("maxZoomLevel")(maxZoomLevel.asInstanceOf[js.Any])
    if (minZoomLevel != null) __obj.updateDynamic("minZoomLevel")(minZoomLevel.asInstanceOf[js.Any])
    if (preloading != null) __obj.updateDynamic("preloading")(preloading.asInstanceOf[js.Any])
    if (respond != null) __obj.updateDynamic("respond")(respond.asInstanceOf[js.Any])
    if (!js.isUndefined(responsive)) __obj.updateDynamic("responsive")(responsive.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollZoom)) __obj.updateDynamic("scrollZoom")(scrollZoom.asInstanceOf[js.Any])
    if (scrollZoomIncrement != null) __obj.updateDynamic("scrollZoomIncrement")(scrollZoomIncrement.asInstanceOf[js.Any])
    if (!js.isUndefined(tint)) __obj.updateDynamic("tint")(tint.asInstanceOf[js.Any])
    if (tintColour != null) __obj.updateDynamic("tintColour")(tintColour.asInstanceOf[js.Any])
    if (tintOpacity != null) __obj.updateDynamic("tintOpacity")(tintOpacity.asInstanceOf[js.Any])
    if (!js.isUndefined(touchEnabled)) __obj.updateDynamic("touchEnabled")(touchEnabled.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    if (zoomActivation != null) __obj.updateDynamic("zoomActivation")(zoomActivation.asInstanceOf[js.Any])
    if (zoomContainerAppendTo != null) __obj.updateDynamic("zoomContainerAppendTo")(zoomContainerAppendTo.asInstanceOf[js.Any])
    if (zoomId != null) __obj.updateDynamic("zoomId")(zoomId.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomLens)) __obj.updateDynamic("zoomLens")(zoomLens.asInstanceOf[js.Any])
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

