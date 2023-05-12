package typings.fslightboxReact

import org.scalablytyped.runtime.StringDictionary
import typings.fslightboxReact.anon.SlideButtons
import typings.fslightboxReact.fslightboxReactBooleans.`false`
import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fslightbox-react", JSImport.Default)
  @js.native
  open class default ()
    extends Component[FsLightboxProps, js.Object, Any]
  
  /* Inlined parent std.Required<fslightbox-react.fslightbox-react.ToolbarButtonProps> */
  trait CustomToolbarButtonProps extends StObject {
    
    var d: String
    
    var height: String
    
    def onClick(instance: Any): Unit
    
    var title: String
    
    var viewBox: String
    
    var width: String
  }
  object CustomToolbarButtonProps {
    
    inline def apply(d: String, height: String, onClick: Any => Unit, title: String, viewBox: String, width: String): CustomToolbarButtonProps = {
      val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick), title = title.asInstanceOf[js.Any], viewBox = viewBox.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomToolbarButtonProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CustomToolbarButtonProps] (val x: Self) extends AnyVal {
      
      inline def setD(value: String): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setOnClick(value: Any => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setViewBox(value: String): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  type FsLightbox = Component[FsLightboxProps, js.Object, Any]
  
  trait FsLightboxProps extends StObject {
    
    // pro feature
    var UIFadeOutTime: js.UndefOr[Double | `false`] = js.undefined
    
    // captions
    var captions: js.UndefOr[js.Array[String | Element]] = js.undefined
    
    // pro feature
    // custom attributes
    var customAttributes: js.UndefOr[js.Array[StringDictionary[String] | Null]] = js.undefined
    
    // pro feature
    // toolbar
    var customToolbarButtons: js.UndefOr[js.Array[CustomToolbarButtonProps]] = js.undefined
    
    // pro feature
    // preferences
    var disableBackgroundClose: js.UndefOr[Boolean] = js.undefined
    
    // pro feature
    // types
    var disableLocalStorage: js.UndefOr[Boolean] = js.undefined
    
    var disableSlideSwiping: js.UndefOr[Boolean] = js.undefined
    
    // pro feature
    var disableThumbs: js.UndefOr[Boolean] = js.undefined
    
    var exitFullscreenOnClose: js.UndefOr[Boolean] = js.undefined
    
    // pro feature
    // animations
    var initialAnimation: js.UndefOr[String] = js.undefined
    
    var loadOnlyCurrentSource: js.UndefOr[Boolean] = js.undefined
    
    // sources
    var maxYoutubeVideoDimensions: js.UndefOr[VideoDimensions] = js.undefined
    
    var onClose: js.UndefOr[js.Function1[/* instance */ FsLightbox, Unit]] = js.undefined
    
    var onInit: js.UndefOr[js.Function1[/* instance */ FsLightbox, Unit]] = js.undefined
    
    // events
    var onOpen: js.UndefOr[js.Function1[/* instance */ FsLightbox, Unit]] = js.undefined
    
    var onShow: js.UndefOr[js.Function1[/* instance */ FsLightbox, Unit]] = js.undefined
    
    var onSlideChange: js.UndefOr[js.Function1[/* instance */ FsLightbox, Unit]] = js.undefined
    
    // pro feature
    var openOnMount: js.UndefOr[Boolean] = js.undefined
    
    var showThumbsOnMount: js.UndefOr[Boolean] = js.undefined
    
    // slide number controlling
    var slide: js.UndefOr[Double] = js.undefined
    
    // pro feature
    var slideChangeAnimation: js.UndefOr[String] = js.undefined
    
    // pro feature
    var slideDistance: js.UndefOr[Double] = js.undefined
    
    var slideshowTime: js.UndefOr[Double] = js.undefined
    
    var source: js.UndefOr[String] = js.undefined
    
    var sourceIndex: js.UndefOr[Double] = js.undefined
    
    var sources: js.UndefOr[js.Array[String | Element]] = js.undefined
    
    // svg icons (pro feature)
    var svg: js.UndefOr[SlideButtons] = js.undefined
    
    // thumbs
    var thumbs: js.UndefOr[js.Array[String | Null]] = js.undefined
    
    // pro feature
    var thumbsIcons: js.UndefOr[js.Array[Element | Null]] = js.undefined
    
    var toggler: Boolean
    
    var `type`: js.UndefOr[SourceType] = js.undefined
    
    var types: js.UndefOr[js.Array[SourceType]] = js.undefined
    
    // pro feature
    var zoomIncrement: js.UndefOr[Double] = js.undefined
  }
  object FsLightboxProps {
    
    inline def apply(toggler: Boolean): FsLightboxProps = {
      val __obj = js.Dynamic.literal(toggler = toggler.asInstanceOf[js.Any])
      __obj.asInstanceOf[FsLightboxProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FsLightboxProps] (val x: Self) extends AnyVal {
      
      inline def setCaptions(value: js.Array[String | Element]): Self = StObject.set(x, "captions", value.asInstanceOf[js.Any])
      
      inline def setCaptionsUndefined: Self = StObject.set(x, "captions", js.undefined)
      
      inline def setCaptionsVarargs(value: (String | Element)*): Self = StObject.set(x, "captions", js.Array(value*))
      
      inline def setCustomAttributes(value: js.Array[StringDictionary[String] | Null]): Self = StObject.set(x, "customAttributes", value.asInstanceOf[js.Any])
      
      inline def setCustomAttributesUndefined: Self = StObject.set(x, "customAttributes", js.undefined)
      
      inline def setCustomAttributesVarargs(value: (StringDictionary[String] | Null)*): Self = StObject.set(x, "customAttributes", js.Array(value*))
      
      inline def setCustomToolbarButtons(value: js.Array[CustomToolbarButtonProps]): Self = StObject.set(x, "customToolbarButtons", value.asInstanceOf[js.Any])
      
      inline def setCustomToolbarButtonsUndefined: Self = StObject.set(x, "customToolbarButtons", js.undefined)
      
      inline def setCustomToolbarButtonsVarargs(value: CustomToolbarButtonProps*): Self = StObject.set(x, "customToolbarButtons", js.Array(value*))
      
      inline def setDisableBackgroundClose(value: Boolean): Self = StObject.set(x, "disableBackgroundClose", value.asInstanceOf[js.Any])
      
      inline def setDisableBackgroundCloseUndefined: Self = StObject.set(x, "disableBackgroundClose", js.undefined)
      
      inline def setDisableLocalStorage(value: Boolean): Self = StObject.set(x, "disableLocalStorage", value.asInstanceOf[js.Any])
      
      inline def setDisableLocalStorageUndefined: Self = StObject.set(x, "disableLocalStorage", js.undefined)
      
      inline def setDisableSlideSwiping(value: Boolean): Self = StObject.set(x, "disableSlideSwiping", value.asInstanceOf[js.Any])
      
      inline def setDisableSlideSwipingUndefined: Self = StObject.set(x, "disableSlideSwiping", js.undefined)
      
      inline def setDisableThumbs(value: Boolean): Self = StObject.set(x, "disableThumbs", value.asInstanceOf[js.Any])
      
      inline def setDisableThumbsUndefined: Self = StObject.set(x, "disableThumbs", js.undefined)
      
      inline def setExitFullscreenOnClose(value: Boolean): Self = StObject.set(x, "exitFullscreenOnClose", value.asInstanceOf[js.Any])
      
      inline def setExitFullscreenOnCloseUndefined: Self = StObject.set(x, "exitFullscreenOnClose", js.undefined)
      
      inline def setInitialAnimation(value: String): Self = StObject.set(x, "initialAnimation", value.asInstanceOf[js.Any])
      
      inline def setInitialAnimationUndefined: Self = StObject.set(x, "initialAnimation", js.undefined)
      
      inline def setLoadOnlyCurrentSource(value: Boolean): Self = StObject.set(x, "loadOnlyCurrentSource", value.asInstanceOf[js.Any])
      
      inline def setLoadOnlyCurrentSourceUndefined: Self = StObject.set(x, "loadOnlyCurrentSource", js.undefined)
      
      inline def setMaxYoutubeVideoDimensions(value: VideoDimensions): Self = StObject.set(x, "maxYoutubeVideoDimensions", value.asInstanceOf[js.Any])
      
      inline def setMaxYoutubeVideoDimensionsUndefined: Self = StObject.set(x, "maxYoutubeVideoDimensions", js.undefined)
      
      inline def setOnClose(value: /* instance */ FsLightbox => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOnInit(value: /* instance */ FsLightbox => Unit): Self = StObject.set(x, "onInit", js.Any.fromFunction1(value))
      
      inline def setOnInitUndefined: Self = StObject.set(x, "onInit", js.undefined)
      
      inline def setOnOpen(value: /* instance */ FsLightbox => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction1(value))
      
      inline def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      inline def setOnShow(value: /* instance */ FsLightbox => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction1(value))
      
      inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      inline def setOnSlideChange(value: /* instance */ FsLightbox => Unit): Self = StObject.set(x, "onSlideChange", js.Any.fromFunction1(value))
      
      inline def setOnSlideChangeUndefined: Self = StObject.set(x, "onSlideChange", js.undefined)
      
      inline def setOpenOnMount(value: Boolean): Self = StObject.set(x, "openOnMount", value.asInstanceOf[js.Any])
      
      inline def setOpenOnMountUndefined: Self = StObject.set(x, "openOnMount", js.undefined)
      
      inline def setShowThumbsOnMount(value: Boolean): Self = StObject.set(x, "showThumbsOnMount", value.asInstanceOf[js.Any])
      
      inline def setShowThumbsOnMountUndefined: Self = StObject.set(x, "showThumbsOnMount", js.undefined)
      
      inline def setSlide(value: Double): Self = StObject.set(x, "slide", value.asInstanceOf[js.Any])
      
      inline def setSlideChangeAnimation(value: String): Self = StObject.set(x, "slideChangeAnimation", value.asInstanceOf[js.Any])
      
      inline def setSlideChangeAnimationUndefined: Self = StObject.set(x, "slideChangeAnimation", js.undefined)
      
      inline def setSlideDistance(value: Double): Self = StObject.set(x, "slideDistance", value.asInstanceOf[js.Any])
      
      inline def setSlideDistanceUndefined: Self = StObject.set(x, "slideDistance", js.undefined)
      
      inline def setSlideUndefined: Self = StObject.set(x, "slide", js.undefined)
      
      inline def setSlideshowTime(value: Double): Self = StObject.set(x, "slideshowTime", value.asInstanceOf[js.Any])
      
      inline def setSlideshowTimeUndefined: Self = StObject.set(x, "slideshowTime", js.undefined)
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceIndex(value: Double): Self = StObject.set(x, "sourceIndex", value.asInstanceOf[js.Any])
      
      inline def setSourceIndexUndefined: Self = StObject.set(x, "sourceIndex", js.undefined)
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setSources(value: js.Array[String | Element]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
      
      inline def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
      
      inline def setSourcesVarargs(value: (String | Element)*): Self = StObject.set(x, "sources", js.Array(value*))
      
      inline def setSvg(value: SlideButtons): Self = StObject.set(x, "svg", value.asInstanceOf[js.Any])
      
      inline def setSvgUndefined: Self = StObject.set(x, "svg", js.undefined)
      
      inline def setThumbs(value: js.Array[String | Null]): Self = StObject.set(x, "thumbs", value.asInstanceOf[js.Any])
      
      inline def setThumbsIcons(value: js.Array[Element | Null]): Self = StObject.set(x, "thumbsIcons", value.asInstanceOf[js.Any])
      
      inline def setThumbsIconsUndefined: Self = StObject.set(x, "thumbsIcons", js.undefined)
      
      inline def setThumbsIconsVarargs(value: (Element | Null)*): Self = StObject.set(x, "thumbsIcons", js.Array(value*))
      
      inline def setThumbsUndefined: Self = StObject.set(x, "thumbs", js.undefined)
      
      inline def setThumbsVarargs(value: (String | Null)*): Self = StObject.set(x, "thumbs", js.Array(value*))
      
      inline def setToggler(value: Boolean): Self = StObject.set(x, "toggler", value.asInstanceOf[js.Any])
      
      inline def setType(value: SourceType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeNull: Self = StObject.set(x, "type", null)
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setTypes(value: js.Array[SourceType]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
      
      inline def setTypesVarargs(value: SourceType*): Self = StObject.set(x, "types", js.Array(value*))
      
      inline def setUIFadeOutTime(value: Double | `false`): Self = StObject.set(x, "UIFadeOutTime", value.asInstanceOf[js.Any])
      
      inline def setUIFadeOutTimeUndefined: Self = StObject.set(x, "UIFadeOutTime", js.undefined)
      
      inline def setZoomIncrement(value: Double): Self = StObject.set(x, "zoomIncrement", value.asInstanceOf[js.Any])
      
      inline def setZoomIncrementUndefined: Self = StObject.set(x, "zoomIncrement", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.fslightboxReact.fslightboxReactStrings.image
    - typings.fslightboxReact.fslightboxReactStrings.video
    - typings.fslightboxReact.fslightboxReactStrings.youtube
    - scala.Null
  */
  type SourceType = _SourceType | Null
  
  trait ToolbarButtonProps extends StObject {
    
    var d: js.UndefOr[String] = js.undefined
    
    var height: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var viewBox: js.UndefOr[String] = js.undefined
    
    var width: js.UndefOr[String] = js.undefined
  }
  object ToolbarButtonProps {
    
    inline def apply(): ToolbarButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToolbarButtonProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ToolbarButtonProps] (val x: Self) extends AnyVal {
      
      inline def setD(value: String): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
      
      inline def setDUndefined: Self = StObject.set(x, "d", js.undefined)
      
      inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setViewBox(value: String): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
      
      inline def setViewBoxUndefined: Self = StObject.set(x, "viewBox", js.undefined)
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait VideoDimensions extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object VideoDimensions {
    
    inline def apply(height: Double, width: Double): VideoDimensions = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[VideoDimensions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VideoDimensions] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait _SourceType extends StObject
}
