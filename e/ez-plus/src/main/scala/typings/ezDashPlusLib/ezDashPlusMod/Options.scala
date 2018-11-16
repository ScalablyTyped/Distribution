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

