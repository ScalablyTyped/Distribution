package typings.ezPlus

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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  trait Options extends StObject {
    
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
    
    var respond: js.UndefOr[js.Array[js.Any]] = js.undefined
    
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
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttrImageZoomSrc(value: String): Self = StObject.set(x, "attrImageZoomSrc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttrImageZoomSrcUndefined: Self = StObject.set(x, "attrImageZoomSrc", js.undefined)
      
      @scala.inline
      def setBorderColour(value: String): Self = StObject.set(x, "borderColour", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderColourUndefined: Self = StObject.set(x, "borderColour", js.undefined)
      
      @scala.inline
      def setBorderSize(value: Double): Self = StObject.set(x, "borderSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderSizeUndefined: Self = StObject.set(x, "borderSize", js.undefined)
      
      @scala.inline
      def setConstrainSize(value: Double | `false`): Self = StObject.set(x, "constrainSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConstrainSizeUndefined: Self = StObject.set(x, "constrainSize", js.undefined)
      
      @scala.inline
      def setConstrainType(value: width | height): Self = StObject.set(x, "constrainType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConstrainTypeUndefined: Self = StObject.set(x, "constrainType", js.undefined)
      
      @scala.inline
      def setContainLensZoom(value: Boolean): Self = StObject.set(x, "containLensZoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainLensZoomUndefined: Self = StObject.set(x, "containLensZoom", js.undefined)
      
      @scala.inline
      def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      @scala.inline
      def setCursor(value: default | cursor | crosshair): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setEasing(value: Boolean): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEasingAmount(value: Double): Self = StObject.set(x, "easingAmount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEasingAmountUndefined: Self = StObject.set(x, "easingAmount", js.undefined)
      
      @scala.inline
      def setEasingDuration(value: Double): Self = StObject.set(x, "easingDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEasingDurationUndefined: Self = StObject.set(x, "easingDuration", js.undefined)
      
      @scala.inline
      def setEasingType(value: String): Self = StObject.set(x, "easingType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEasingTypeUndefined: Self = StObject.set(x, "easingType", js.undefined)
      
      @scala.inline
      def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setGallery(value: String): Self = StObject.set(x, "gallery", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGalleryActiveClass(value: String): Self = StObject.set(x, "galleryActiveClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGalleryActiveClassUndefined: Self = StObject.set(x, "galleryActiveClass", js.undefined)
      
      @scala.inline
      def setGalleryEvent(value: String): Self = StObject.set(x, "galleryEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGalleryEventUndefined: Self = StObject.set(x, "galleryEvent", js.undefined)
      
      @scala.inline
      def setGalleryItem(value: String): Self = StObject.set(x, "galleryItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGalleryItemUndefined: Self = StObject.set(x, "galleryItem", js.undefined)
      
      @scala.inline
      def setGallerySelector(value: String | `false`): Self = StObject.set(x, "gallerySelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGallerySelectorUndefined: Self = StObject.set(x, "gallerySelector", js.undefined)
      
      @scala.inline
      def setGalleryUndefined: Self = StObject.set(x, "gallery", js.undefined)
      
      @scala.inline
      def setImageCrossfade(value: Boolean): Self = StObject.set(x, "imageCrossfade", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageCrossfadeUndefined: Self = StObject.set(x, "imageCrossfade", js.undefined)
      
      @scala.inline
      def setLensBorder(value: Double): Self = StObject.set(x, "lensBorder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLensBorderUndefined: Self = StObject.set(x, "lensBorder", js.undefined)
      
      @scala.inline
      def setLensColour(value: String): Self = StObject.set(x, "lensColour", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLensColourUndefined: Self = StObject.set(x, "lensColour", js.undefined)
      
      @scala.inline
      def setLensFadeIn(value: Double): Self = StObject.set(x, "lensFadeIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLensFadeInUndefined: Self = StObject.set(x, "lensFadeIn", js.undefined)
      
      @scala.inline
      def setLensFadeOut(value: Double): Self = StObject.set(x, "lensFadeOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLensFadeOutUndefined: Self = StObject.set(x, "lensFadeOut", js.undefined)
      
      @scala.inline
      def setLensOpacity(value: Double): Self = StObject.set(x, "lensOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLensOpacityUndefined: Self = StObject.set(x, "lensOpacity", js.undefined)
      
      @scala.inline
      def setLensShape(value: square | round): Self = StObject.set(x, "lensShape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLensShapeUndefined: Self = StObject.set(x, "lensShape", js.undefined)
      
      @scala.inline
      def setLensSize(value: Double): Self = StObject.set(x, "lensSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLensSizeUndefined: Self = StObject.set(x, "lensSize", js.undefined)
      
      @scala.inline
      def setLenszoom(value: Boolean): Self = StObject.set(x, "lenszoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLenszoomUndefined: Self = StObject.set(x, "lenszoom", js.undefined)
      
      @scala.inline
      def setLoadingIcon(value: Boolean | String): Self = StObject.set(x, "loadingIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingIconUndefined: Self = StObject.set(x, "loadingIcon", js.undefined)
      
      @scala.inline
      def setMantainZoomAspectRatio(value: Boolean): Self = StObject.set(x, "mantainZoomAspectRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMantainZoomAspectRatioUndefined: Self = StObject.set(x, "mantainZoomAspectRatio", js.undefined)
      
      @scala.inline
      def setMaxZoomLevel(value: Double | `false`): Self = StObject.set(x, "maxZoomLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxZoomLevelUndefined: Self = StObject.set(x, "maxZoomLevel", js.undefined)
      
      @scala.inline
      def setMinZoomLevel(value: Double): Self = StObject.set(x, "minZoomLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinZoomLevelUndefined: Self = StObject.set(x, "minZoomLevel", js.undefined)
      
      @scala.inline
      def setPreloading(value: `0` | `1`): Self = StObject.set(x, "preloading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreloadingUndefined: Self = StObject.set(x, "preloading", js.undefined)
      
      @scala.inline
      def setRespond(value: js.Array[js.Any]): Self = StObject.set(x, "respond", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRespondUndefined: Self = StObject.set(x, "respond", js.undefined)
      
      @scala.inline
      def setRespondVarargs(value: js.Any*): Self = StObject.set(x, "respond", js.Array(value :_*))
      
      @scala.inline
      def setResponsive(value: Boolean): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
      
      @scala.inline
      def setScrollZoom(value: Boolean): Self = StObject.set(x, "scrollZoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollZoomIncrement(value: Double): Self = StObject.set(x, "scrollZoomIncrement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollZoomIncrementUndefined: Self = StObject.set(x, "scrollZoomIncrement", js.undefined)
      
      @scala.inline
      def setScrollZoomUndefined: Self = StObject.set(x, "scrollZoom", js.undefined)
      
      @scala.inline
      def setTint(value: Boolean): Self = StObject.set(x, "tint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTintColour(value: String): Self = StObject.set(x, "tintColour", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTintColourUndefined: Self = StObject.set(x, "tintColour", js.undefined)
      
      @scala.inline
      def setTintOpacity(value: Double): Self = StObject.set(x, "tintOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTintOpacityUndefined: Self = StObject.set(x, "tintOpacity", js.undefined)
      
      @scala.inline
      def setTintUndefined: Self = StObject.set(x, "tint", js.undefined)
      
      @scala.inline
      def setTouchEnabled(value: Boolean): Self = StObject.set(x, "touchEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchEnabledUndefined: Self = StObject.set(x, "touchEnabled", js.undefined)
      
      @scala.inline
      def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
      
      @scala.inline
      def setZoomActivation(value: click | hover): Self = StObject.set(x, "zoomActivation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomActivationUndefined: Self = StObject.set(x, "zoomActivation", js.undefined)
      
      @scala.inline
      def setZoomContainerAppendTo(value: String): Self = StObject.set(x, "zoomContainerAppendTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomContainerAppendToUndefined: Self = StObject.set(x, "zoomContainerAppendTo", js.undefined)
      
      @scala.inline
      def setZoomId(value: Double): Self = StObject.set(x, "zoomId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomIdUndefined: Self = StObject.set(x, "zoomId", js.undefined)
      
      @scala.inline
      def setZoomLens(value: Boolean): Self = StObject.set(x, "zoomLens", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomLensUndefined: Self = StObject.set(x, "zoomLens", js.undefined)
      
      @scala.inline
      def setZoomLevel(value: Double): Self = StObject.set(x, "zoomLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomLevelUndefined: Self = StObject.set(x, "zoomLevel", js.undefined)
      
      @scala.inline
      def setZoomTintFadeIn(value: Double): Self = StObject.set(x, "zoomTintFadeIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomTintFadeInUndefined: Self = StObject.set(x, "zoomTintFadeIn", js.undefined)
      
      @scala.inline
      def setZoomTintFadeOut(value: Double): Self = StObject.set(x, "zoomTintFadeOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomTintFadeOutUndefined: Self = StObject.set(x, "zoomTintFadeOut", js.undefined)
      
      @scala.inline
      def setZoomType(value: lens | window | inner): Self = StObject.set(x, "zoomType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomTypeUndefined: Self = StObject.set(x, "zoomType", js.undefined)
      
      @scala.inline
      def setZoomWindowFadeIn(value: Double): Self = StObject.set(x, "zoomWindowFadeIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomWindowFadeInUndefined: Self = StObject.set(x, "zoomWindowFadeIn", js.undefined)
      
      @scala.inline
      def setZoomWindowFadeOut(value: Double): Self = StObject.set(x, "zoomWindowFadeOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomWindowFadeOutUndefined: Self = StObject.set(x, "zoomWindowFadeOut", js.undefined)
      
      @scala.inline
      def setZoomWindowHeight(value: Double): Self = StObject.set(x, "zoomWindowHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomWindowHeightUndefined: Self = StObject.set(x, "zoomWindowHeight", js.undefined)
      
      @scala.inline
      def setZoomWindowOffsetX(value: Double): Self = StObject.set(x, "zoomWindowOffsetX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomWindowOffsetXUndefined: Self = StObject.set(x, "zoomWindowOffsetX", js.undefined)
      
      @scala.inline
      def setZoomWindowOffsetY(value: Double): Self = StObject.set(x, "zoomWindowOffsetY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomWindowOffsetYUndefined: Self = StObject.set(x, "zoomWindowOffsetY", js.undefined)
      
      @scala.inline
      def setZoomWindowPosition(value: Double | String): Self = StObject.set(x, "zoomWindowPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomWindowPositionUndefined: Self = StObject.set(x, "zoomWindowPosition", js.undefined)
      
      @scala.inline
      def setZoomWindowWidth(value: Double): Self = StObject.set(x, "zoomWindowWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomWindowWidthUndefined: Self = StObject.set(x, "zoomWindowWidth", js.undefined)
    }
  }
  
  object global {
    
    @js.native
    trait JQuery extends StObject {
      
      /**
        * Initialize ElevateZoom Plugin
        */
      def ezPlus(): JQuery = js.native
      def ezPlus(options: Options): JQuery = js.native
    }
  }
}
