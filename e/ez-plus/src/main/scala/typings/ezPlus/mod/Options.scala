package typings.ezPlus.mod

import typings.ezPlus.ezPlusBooleans.`false`
import typings.ezPlus.ezPlusNumbers.`0`
import typings.ezPlus.ezPlusNumbers.`1`
import typings.ezPlus.ezPlusStrings.click
import typings.ezPlus.ezPlusStrings.crosshair
import typings.ezPlus.ezPlusStrings.cursor
import typings.ezPlus.ezPlusStrings.default
import typings.ezPlus.ezPlusStrings.height
import typings.ezPlus.ezPlusStrings.hover
import typings.ezPlus.ezPlusStrings.inner
import typings.ezPlus.ezPlusStrings.lens
import typings.ezPlus.ezPlusStrings.round
import typings.ezPlus.ezPlusStrings.square
import typings.ezPlus.ezPlusStrings.width
import typings.ezPlus.ezPlusStrings.window
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
  var cursor: js.UndefOr[default | typings.ezPlus.ezPlusStrings.cursor | crosshair] = js.undefined
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
    borderSize: js.UndefOr[Double] = js.undefined,
    constrainSize: Double | `false` = null,
    constrainType: width | height = null,
    containLensZoom: js.UndefOr[Boolean] = js.undefined,
    container: String = null,
    cursor: default | cursor | crosshair = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    easing: js.UndefOr[Boolean] = js.undefined,
    easingAmount: js.UndefOr[Double] = js.undefined,
    easingDuration: js.UndefOr[Double] = js.undefined,
    easingType: String = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    gallery: String = null,
    galleryActiveClass: String = null,
    galleryEvent: String = null,
    galleryItem: String = null,
    gallerySelector: String | `false` = null,
    imageCrossfade: js.UndefOr[Boolean] = js.undefined,
    lensBorder: js.UndefOr[Double] = js.undefined,
    lensColour: String = null,
    lensFadeIn: js.UndefOr[Double] = js.undefined,
    lensFadeOut: js.UndefOr[Double] = js.undefined,
    lensOpacity: js.UndefOr[Double] = js.undefined,
    lensShape: square | round = null,
    lensSize: js.UndefOr[Double] = js.undefined,
    lenszoom: js.UndefOr[Boolean] = js.undefined,
    loadingIcon: Boolean | String = null,
    mantainZoomAspectRatio: js.UndefOr[Boolean] = js.undefined,
    maxZoomLevel: Double | `false` = null,
    minZoomLevel: js.UndefOr[Double] = js.undefined,
    preloading: `0` | `1` = null,
    respond: js.Array[_] = null,
    responsive: js.UndefOr[Boolean] = js.undefined,
    scrollZoom: js.UndefOr[Boolean] = js.undefined,
    scrollZoomIncrement: js.UndefOr[Double] = js.undefined,
    tint: js.UndefOr[Boolean] = js.undefined,
    tintColour: String = null,
    tintOpacity: js.UndefOr[Double] = js.undefined,
    touchEnabled: js.UndefOr[Boolean] = js.undefined,
    zIndex: js.UndefOr[Double] = js.undefined,
    zoomActivation: click | hover = null,
    zoomContainerAppendTo: String = null,
    zoomId: js.UndefOr[Double] = js.undefined,
    zoomLens: js.UndefOr[Boolean] = js.undefined,
    zoomLevel: js.UndefOr[Double] = js.undefined,
    zoomTintFadeIn: js.UndefOr[Double] = js.undefined,
    zoomTintFadeOut: js.UndefOr[Double] = js.undefined,
    zoomType: lens | window | inner = null,
    zoomWindowFadeIn: js.UndefOr[Double] = js.undefined,
    zoomWindowFadeOut: js.UndefOr[Double] = js.undefined,
    zoomWindowHeight: js.UndefOr[Double] = js.undefined,
    zoomWindowOffsetX: js.UndefOr[Double] = js.undefined,
    zoomWindowOffsetY: js.UndefOr[Double] = js.undefined,
    zoomWindowPosition: Double | String = null,
    zoomWindowWidth: js.UndefOr[Double] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (attrImageZoomSrc != null) __obj.updateDynamic("attrImageZoomSrc")(attrImageZoomSrc.asInstanceOf[js.Any])
    if (borderColour != null) __obj.updateDynamic("borderColour")(borderColour.asInstanceOf[js.Any])
    if (!js.isUndefined(borderSize)) __obj.updateDynamic("borderSize")(borderSize.get.asInstanceOf[js.Any])
    if (constrainSize != null) __obj.updateDynamic("constrainSize")(constrainSize.asInstanceOf[js.Any])
    if (constrainType != null) __obj.updateDynamic("constrainType")(constrainType.asInstanceOf[js.Any])
    if (!js.isUndefined(containLensZoom)) __obj.updateDynamic("containLensZoom")(containLensZoom.get.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.get.asInstanceOf[js.Any])
    if (!js.isUndefined(easing)) __obj.updateDynamic("easing")(easing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(easingAmount)) __obj.updateDynamic("easingAmount")(easingAmount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(easingDuration)) __obj.updateDynamic("easingDuration")(easingDuration.get.asInstanceOf[js.Any])
    if (easingType != null) __obj.updateDynamic("easingType")(easingType.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (gallery != null) __obj.updateDynamic("gallery")(gallery.asInstanceOf[js.Any])
    if (galleryActiveClass != null) __obj.updateDynamic("galleryActiveClass")(galleryActiveClass.asInstanceOf[js.Any])
    if (galleryEvent != null) __obj.updateDynamic("galleryEvent")(galleryEvent.asInstanceOf[js.Any])
    if (galleryItem != null) __obj.updateDynamic("galleryItem")(galleryItem.asInstanceOf[js.Any])
    if (gallerySelector != null) __obj.updateDynamic("gallerySelector")(gallerySelector.asInstanceOf[js.Any])
    if (!js.isUndefined(imageCrossfade)) __obj.updateDynamic("imageCrossfade")(imageCrossfade.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lensBorder)) __obj.updateDynamic("lensBorder")(lensBorder.get.asInstanceOf[js.Any])
    if (lensColour != null) __obj.updateDynamic("lensColour")(lensColour.asInstanceOf[js.Any])
    if (!js.isUndefined(lensFadeIn)) __obj.updateDynamic("lensFadeIn")(lensFadeIn.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lensFadeOut)) __obj.updateDynamic("lensFadeOut")(lensFadeOut.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lensOpacity)) __obj.updateDynamic("lensOpacity")(lensOpacity.get.asInstanceOf[js.Any])
    if (lensShape != null) __obj.updateDynamic("lensShape")(lensShape.asInstanceOf[js.Any])
    if (!js.isUndefined(lensSize)) __obj.updateDynamic("lensSize")(lensSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lenszoom)) __obj.updateDynamic("lenszoom")(lenszoom.get.asInstanceOf[js.Any])
    if (loadingIcon != null) __obj.updateDynamic("loadingIcon")(loadingIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(mantainZoomAspectRatio)) __obj.updateDynamic("mantainZoomAspectRatio")(mantainZoomAspectRatio.get.asInstanceOf[js.Any])
    if (maxZoomLevel != null) __obj.updateDynamic("maxZoomLevel")(maxZoomLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(minZoomLevel)) __obj.updateDynamic("minZoomLevel")(minZoomLevel.get.asInstanceOf[js.Any])
    if (preloading != null) __obj.updateDynamic("preloading")(preloading.asInstanceOf[js.Any])
    if (respond != null) __obj.updateDynamic("respond")(respond.asInstanceOf[js.Any])
    if (!js.isUndefined(responsive)) __obj.updateDynamic("responsive")(responsive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollZoom)) __obj.updateDynamic("scrollZoom")(scrollZoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollZoomIncrement)) __obj.updateDynamic("scrollZoomIncrement")(scrollZoomIncrement.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tint)) __obj.updateDynamic("tint")(tint.get.asInstanceOf[js.Any])
    if (tintColour != null) __obj.updateDynamic("tintColour")(tintColour.asInstanceOf[js.Any])
    if (!js.isUndefined(tintOpacity)) __obj.updateDynamic("tintOpacity")(tintOpacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(touchEnabled)) __obj.updateDynamic("touchEnabled")(touchEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndex)) __obj.updateDynamic("zIndex")(zIndex.get.asInstanceOf[js.Any])
    if (zoomActivation != null) __obj.updateDynamic("zoomActivation")(zoomActivation.asInstanceOf[js.Any])
    if (zoomContainerAppendTo != null) __obj.updateDynamic("zoomContainerAppendTo")(zoomContainerAppendTo.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomId)) __obj.updateDynamic("zoomId")(zoomId.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomLens)) __obj.updateDynamic("zoomLens")(zoomLens.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomLevel)) __obj.updateDynamic("zoomLevel")(zoomLevel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomTintFadeIn)) __obj.updateDynamic("zoomTintFadeIn")(zoomTintFadeIn.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomTintFadeOut)) __obj.updateDynamic("zoomTintFadeOut")(zoomTintFadeOut.get.asInstanceOf[js.Any])
    if (zoomType != null) __obj.updateDynamic("zoomType")(zoomType.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomWindowFadeIn)) __obj.updateDynamic("zoomWindowFadeIn")(zoomWindowFadeIn.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomWindowFadeOut)) __obj.updateDynamic("zoomWindowFadeOut")(zoomWindowFadeOut.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomWindowHeight)) __obj.updateDynamic("zoomWindowHeight")(zoomWindowHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomWindowOffsetX)) __obj.updateDynamic("zoomWindowOffsetX")(zoomWindowOffsetX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomWindowOffsetY)) __obj.updateDynamic("zoomWindowOffsetY")(zoomWindowOffsetY.get.asInstanceOf[js.Any])
    if (zoomWindowPosition != null) __obj.updateDynamic("zoomWindowPosition")(zoomWindowPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomWindowWidth)) __obj.updateDynamic("zoomWindowWidth")(zoomWindowWidth.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

