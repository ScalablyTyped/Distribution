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

@js.native
trait Options extends js.Object {
  /**
    * Attribute to plugin use for zoom
    */
  var attrImageZoomSrc: js.UndefOr[String] = js.native
  /**
    * Border Colour
    */
  var borderColour: js.UndefOr[String] = js.native
  /**
    * Border Size of the ZoomBox
    */
  var borderSize: js.UndefOr[Double] = js.native
  /**
    * In pixels the dimensions you want to constrain on
    */
  var constrainSize: js.UndefOr[Double | `false`] = js.native
  var constrainType: js.UndefOr[width | height] = js.native
  var containLensZoom: js.UndefOr[Boolean] = js.native
  var container: js.UndefOr[String] = js.native
  /**
    * Type of cursor
    */
  var cursor: js.UndefOr[default | typings.ezPlus.ezPlusStrings.cursor | crosshair] = js.native
  var debug: js.UndefOr[Boolean] = js.native
  /**
    * Activate easing
    */
  var easing: js.UndefOr[Boolean] = js.native
  var easingAmount: js.UndefOr[Double] = js.native
  var easingDuration: js.UndefOr[Double] = js.native
  var easingType: js.UndefOr[String] = js.native
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * This assigns a set of gallery links to the zoom image
    */
  var gallery: js.UndefOr[String] = js.native
  var galleryActiveClass: js.UndefOr[String] = js.native
  var galleryEvent: js.UndefOr[String] = js.native
  var galleryItem: js.UndefOr[String] = js.native
  var gallerySelector: js.UndefOr[String | `false`] = js.native
  /**
    * Activate simultaneous crossfade of images on gallery change
    */
  var imageCrossfade: js.UndefOr[Boolean] = js.native
  /**
    * Width in pixels of the lens border
    */
  var lensBorder: js.UndefOr[Double] = js.native
  /**
    * Colour of the lens background
    */
  var lensColour: js.UndefOr[String] = js.native
  /**
    * Speed of Lens fadeIn
    */
  var lensFadeIn: js.UndefOr[Double] = js.native
  /**
    * Speed of Lens fadeOut
    */
  var lensFadeOut: js.UndefOr[Double] = js.native
  /**
    * Opacity of lens
    */
  var lensOpacity: js.UndefOr[Double] = js.native
  /**
    * Type of lens
    */
  var lensShape: js.UndefOr[square | round] = js.native
  /**
    * Used when zoomType set to lens
    */
  var lensSize: js.UndefOr[Double] = js.native
  var lenszoom: js.UndefOr[Boolean] = js.native
  /**
    * Activate spinner icon or url
    */
  var loadingIcon: js.UndefOr[Boolean | String] = js.native
  var mantainZoomAspectRatio: js.UndefOr[Boolean] = js.native
  var maxZoomLevel: js.UndefOr[Double | `false`] = js.native
  var minZoomLevel: js.UndefOr[Double] = js.native
  var preloading: js.UndefOr[`0` | `1`] = js.native
  var respond: js.UndefOr[js.Array[_]] = js.native
  /**
    * Activate responsivenes
    */
  var responsive: js.UndefOr[Boolean] = js.native
  /**
    * Activate zoom on mouse scroll
    */
  var scrollZoom: js.UndefOr[Boolean] = js.native
  /**
    * Steps of the scrollzoom
    */
  var scrollZoomIncrement: js.UndefOr[Double] = js.native
  /**
    * Enable a tint overlay
    */
  var tint: js.UndefOr[Boolean] = js.native
  /**
    * Colour of the tin
    */
  var tintColour: js.UndefOr[String] = js.native
  /**
    * Opacity of the tint
    */
  var tintOpacity: js.UndefOr[Double] = js.native
  var touchEnabled: js.UndefOr[Boolean] = js.native
  var zIndex: js.UndefOr[Double] = js.native
  var zoomActivation: js.UndefOr[click | hover] = js.native
  /**
    * Zoom container parent selector
    */
  var zoomContainerAppendTo: js.UndefOr[String] = js.native
  /**
    * Identifier for the zoom container
    */
  var zoomId: js.UndefOr[Double] = js.native
  /**
    * Enable Lens
    */
  var zoomLens: js.UndefOr[Boolean] = js.native
  /**
    * Zoom level of image
    */
  var zoomLevel: js.UndefOr[Double] = js.native
  /**
    * Speed of Tint fadeIn
    */
  var zoomTintFadeIn: js.UndefOr[Double] = js.native
  /**
    * Speed of Tint fadeOut
    */
  var zoomTintFadeOut: js.UndefOr[Double] = js.native
  /**
    * Type of zoom
    */
  var zoomType: js.UndefOr[lens | window | inner] = js.native
  /**
    * Speed of Window fadeIn
    */
  var zoomWindowFadeIn: js.UndefOr[Double] = js.native
  /**
    * Speed of Window fadeOut
    */
  var zoomWindowFadeOut: js.UndefOr[Double] = js.native
  /**
    * Height of the zoomWindow
    */
  var zoomWindowHeight: js.UndefOr[Double] = js.native
  /**
    * x-axis offset of the zoom window
    */
  var zoomWindowOffsetX: js.UndefOr[Double] = js.native
  /**
    * y-axis offset of the zoom window
    */
  var zoomWindowOffsetY: js.UndefOr[Double] = js.native
  var zoomWindowPosition: js.UndefOr[Double | String] = js.native
  /**
    * Width of the zoomWindow
    */
  var zoomWindowWidth: js.UndefOr[Double] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAttrImageZoomSrc(value: String): Self = this.set("attrImageZoomSrc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttrImageZoomSrc: Self = this.set("attrImageZoomSrc", js.undefined)
    @scala.inline
    def setBorderColour(value: String): Self = this.set("borderColour", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderColour: Self = this.set("borderColour", js.undefined)
    @scala.inline
    def setBorderSize(value: Double): Self = this.set("borderSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderSize: Self = this.set("borderSize", js.undefined)
    @scala.inline
    def setConstrainSize(value: Double | `false`): Self = this.set("constrainSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConstrainSize: Self = this.set("constrainSize", js.undefined)
    @scala.inline
    def setConstrainType(value: width | height): Self = this.set("constrainType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConstrainType: Self = this.set("constrainType", js.undefined)
    @scala.inline
    def setContainLensZoom(value: Boolean): Self = this.set("containLensZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainLensZoom: Self = this.set("containLensZoom", js.undefined)
    @scala.inline
    def setContainer(value: String): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    @scala.inline
    def setCursor(value: default | cursor | crosshair): Self = this.set("cursor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCursor: Self = this.set("cursor", js.undefined)
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    @scala.inline
    def setEasing(value: Boolean): Self = this.set("easing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
    @scala.inline
    def setEasingAmount(value: Double): Self = this.set("easingAmount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEasingAmount: Self = this.set("easingAmount", js.undefined)
    @scala.inline
    def setEasingDuration(value: Double): Self = this.set("easingDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEasingDuration: Self = this.set("easingDuration", js.undefined)
    @scala.inline
    def setEasingType(value: String): Self = this.set("easingType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEasingType: Self = this.set("easingType", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setGallery(value: String): Self = this.set("gallery", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGallery: Self = this.set("gallery", js.undefined)
    @scala.inline
    def setGalleryActiveClass(value: String): Self = this.set("galleryActiveClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGalleryActiveClass: Self = this.set("galleryActiveClass", js.undefined)
    @scala.inline
    def setGalleryEvent(value: String): Self = this.set("galleryEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGalleryEvent: Self = this.set("galleryEvent", js.undefined)
    @scala.inline
    def setGalleryItem(value: String): Self = this.set("galleryItem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGalleryItem: Self = this.set("galleryItem", js.undefined)
    @scala.inline
    def setGallerySelector(value: String | `false`): Self = this.set("gallerySelector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGallerySelector: Self = this.set("gallerySelector", js.undefined)
    @scala.inline
    def setImageCrossfade(value: Boolean): Self = this.set("imageCrossfade", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageCrossfade: Self = this.set("imageCrossfade", js.undefined)
    @scala.inline
    def setLensBorder(value: Double): Self = this.set("lensBorder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLensBorder: Self = this.set("lensBorder", js.undefined)
    @scala.inline
    def setLensColour(value: String): Self = this.set("lensColour", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLensColour: Self = this.set("lensColour", js.undefined)
    @scala.inline
    def setLensFadeIn(value: Double): Self = this.set("lensFadeIn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLensFadeIn: Self = this.set("lensFadeIn", js.undefined)
    @scala.inline
    def setLensFadeOut(value: Double): Self = this.set("lensFadeOut", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLensFadeOut: Self = this.set("lensFadeOut", js.undefined)
    @scala.inline
    def setLensOpacity(value: Double): Self = this.set("lensOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLensOpacity: Self = this.set("lensOpacity", js.undefined)
    @scala.inline
    def setLensShape(value: square | round): Self = this.set("lensShape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLensShape: Self = this.set("lensShape", js.undefined)
    @scala.inline
    def setLensSize(value: Double): Self = this.set("lensSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLensSize: Self = this.set("lensSize", js.undefined)
    @scala.inline
    def setLenszoom(value: Boolean): Self = this.set("lenszoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLenszoom: Self = this.set("lenszoom", js.undefined)
    @scala.inline
    def setLoadingIcon(value: Boolean | String): Self = this.set("loadingIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadingIcon: Self = this.set("loadingIcon", js.undefined)
    @scala.inline
    def setMantainZoomAspectRatio(value: Boolean): Self = this.set("mantainZoomAspectRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMantainZoomAspectRatio: Self = this.set("mantainZoomAspectRatio", js.undefined)
    @scala.inline
    def setMaxZoomLevel(value: Double | `false`): Self = this.set("maxZoomLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxZoomLevel: Self = this.set("maxZoomLevel", js.undefined)
    @scala.inline
    def setMinZoomLevel(value: Double): Self = this.set("minZoomLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinZoomLevel: Self = this.set("minZoomLevel", js.undefined)
    @scala.inline
    def setPreloading(value: `0` | `1`): Self = this.set("preloading", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreloading: Self = this.set("preloading", js.undefined)
    @scala.inline
    def setRespondVarargs(value: js.Any*): Self = this.set("respond", js.Array(value :_*))
    @scala.inline
    def setRespond(value: js.Array[_]): Self = this.set("respond", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRespond: Self = this.set("respond", js.undefined)
    @scala.inline
    def setResponsive(value: Boolean): Self = this.set("responsive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponsive: Self = this.set("responsive", js.undefined)
    @scala.inline
    def setScrollZoom(value: Boolean): Self = this.set("scrollZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollZoom: Self = this.set("scrollZoom", js.undefined)
    @scala.inline
    def setScrollZoomIncrement(value: Double): Self = this.set("scrollZoomIncrement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollZoomIncrement: Self = this.set("scrollZoomIncrement", js.undefined)
    @scala.inline
    def setTint(value: Boolean): Self = this.set("tint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTint: Self = this.set("tint", js.undefined)
    @scala.inline
    def setTintColour(value: String): Self = this.set("tintColour", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTintColour: Self = this.set("tintColour", js.undefined)
    @scala.inline
    def setTintOpacity(value: Double): Self = this.set("tintOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTintOpacity: Self = this.set("tintOpacity", js.undefined)
    @scala.inline
    def setTouchEnabled(value: Boolean): Self = this.set("touchEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTouchEnabled: Self = this.set("touchEnabled", js.undefined)
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
    @scala.inline
    def setZoomActivation(value: click | hover): Self = this.set("zoomActivation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomActivation: Self = this.set("zoomActivation", js.undefined)
    @scala.inline
    def setZoomContainerAppendTo(value: String): Self = this.set("zoomContainerAppendTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomContainerAppendTo: Self = this.set("zoomContainerAppendTo", js.undefined)
    @scala.inline
    def setZoomId(value: Double): Self = this.set("zoomId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomId: Self = this.set("zoomId", js.undefined)
    @scala.inline
    def setZoomLens(value: Boolean): Self = this.set("zoomLens", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomLens: Self = this.set("zoomLens", js.undefined)
    @scala.inline
    def setZoomLevel(value: Double): Self = this.set("zoomLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomLevel: Self = this.set("zoomLevel", js.undefined)
    @scala.inline
    def setZoomTintFadeIn(value: Double): Self = this.set("zoomTintFadeIn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomTintFadeIn: Self = this.set("zoomTintFadeIn", js.undefined)
    @scala.inline
    def setZoomTintFadeOut(value: Double): Self = this.set("zoomTintFadeOut", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomTintFadeOut: Self = this.set("zoomTintFadeOut", js.undefined)
    @scala.inline
    def setZoomType(value: lens | window | inner): Self = this.set("zoomType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomType: Self = this.set("zoomType", js.undefined)
    @scala.inline
    def setZoomWindowFadeIn(value: Double): Self = this.set("zoomWindowFadeIn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomWindowFadeIn: Self = this.set("zoomWindowFadeIn", js.undefined)
    @scala.inline
    def setZoomWindowFadeOut(value: Double): Self = this.set("zoomWindowFadeOut", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomWindowFadeOut: Self = this.set("zoomWindowFadeOut", js.undefined)
    @scala.inline
    def setZoomWindowHeight(value: Double): Self = this.set("zoomWindowHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomWindowHeight: Self = this.set("zoomWindowHeight", js.undefined)
    @scala.inline
    def setZoomWindowOffsetX(value: Double): Self = this.set("zoomWindowOffsetX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomWindowOffsetX: Self = this.set("zoomWindowOffsetX", js.undefined)
    @scala.inline
    def setZoomWindowOffsetY(value: Double): Self = this.set("zoomWindowOffsetY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomWindowOffsetY: Self = this.set("zoomWindowOffsetY", js.undefined)
    @scala.inline
    def setZoomWindowPosition(value: Double | String): Self = this.set("zoomWindowPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomWindowPosition: Self = this.set("zoomWindowPosition", js.undefined)
    @scala.inline
    def setZoomWindowWidth(value: Double): Self = this.set("zoomWindowWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomWindowWidth: Self = this.set("zoomWindowWidth", js.undefined)
  }
  
}

