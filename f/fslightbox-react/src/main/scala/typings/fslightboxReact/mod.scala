package typings.fslightboxReact

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
  
  type FsLightbox = Component[FsLightboxProps, js.Object, Any]
  
  trait FsLightboxProps extends StObject {
    
    // custom sources
    var customSources: js.UndefOr[js.Array[Element]] = js.undefined
    
    // types
    var disableLocalStorage: js.UndefOr[Boolean] = js.undefined
    
    // preferences
    var loadOnlyCurrentSource: js.UndefOr[Boolean] = js.undefined
    
    var maxYoutubeVideoDimensions: js.UndefOr[VideoDimensions] = js.undefined
    
    var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onInit: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    // events
    var onOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onShow: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var openOnMount: js.UndefOr[Boolean] = js.undefined
    
    var showThumbsOnMount: js.UndefOr[Boolean] = js.undefined
    
    // slide number controlling
    var slide: js.UndefOr[Double] = js.undefined
    
    var slideDistance: js.UndefOr[Double] = js.undefined
    
    var source: js.UndefOr[String] = js.undefined
    
    var sourceIndex: js.UndefOr[Double] = js.undefined
    
    var sources: js.UndefOr[js.Array[String]] = js.undefined
    
    var toggler: Boolean
    
    var `type`: js.UndefOr[SourceType] = js.undefined
    
    var types: js.UndefOr[js.Array[SourceType]] = js.undefined
    
    // sources
    var videosPosters: js.UndefOr[js.Array[VideoPoster]] = js.undefined
  }
  object FsLightboxProps {
    
    inline def apply(toggler: Boolean): FsLightboxProps = {
      val __obj = js.Dynamic.literal(toggler = toggler.asInstanceOf[js.Any])
      __obj.asInstanceOf[FsLightboxProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FsLightboxProps] (val x: Self) extends AnyVal {
      
      inline def setCustomSources(value: js.Array[Element]): Self = StObject.set(x, "customSources", value.asInstanceOf[js.Any])
      
      inline def setCustomSourcesUndefined: Self = StObject.set(x, "customSources", js.undefined)
      
      inline def setCustomSourcesVarargs(value: Element*): Self = StObject.set(x, "customSources", js.Array(value*))
      
      inline def setDisableLocalStorage(value: Boolean): Self = StObject.set(x, "disableLocalStorage", value.asInstanceOf[js.Any])
      
      inline def setDisableLocalStorageUndefined: Self = StObject.set(x, "disableLocalStorage", js.undefined)
      
      inline def setLoadOnlyCurrentSource(value: Boolean): Self = StObject.set(x, "loadOnlyCurrentSource", value.asInstanceOf[js.Any])
      
      inline def setLoadOnlyCurrentSourceUndefined: Self = StObject.set(x, "loadOnlyCurrentSource", js.undefined)
      
      inline def setMaxYoutubeVideoDimensions(value: VideoDimensions): Self = StObject.set(x, "maxYoutubeVideoDimensions", value.asInstanceOf[js.Any])
      
      inline def setMaxYoutubeVideoDimensionsUndefined: Self = StObject.set(x, "maxYoutubeVideoDimensions", js.undefined)
      
      inline def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOnInit(value: () => Unit): Self = StObject.set(x, "onInit", js.Any.fromFunction0(value))
      
      inline def setOnInitUndefined: Self = StObject.set(x, "onInit", js.undefined)
      
      inline def setOnOpen(value: () => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction0(value))
      
      inline def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      inline def setOnShow(value: () => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction0(value))
      
      inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      inline def setOpenOnMount(value: Boolean): Self = StObject.set(x, "openOnMount", value.asInstanceOf[js.Any])
      
      inline def setOpenOnMountUndefined: Self = StObject.set(x, "openOnMount", js.undefined)
      
      inline def setShowThumbsOnMount(value: Boolean): Self = StObject.set(x, "showThumbsOnMount", value.asInstanceOf[js.Any])
      
      inline def setShowThumbsOnMountUndefined: Self = StObject.set(x, "showThumbsOnMount", js.undefined)
      
      inline def setSlide(value: Double): Self = StObject.set(x, "slide", value.asInstanceOf[js.Any])
      
      inline def setSlideDistance(value: Double): Self = StObject.set(x, "slideDistance", value.asInstanceOf[js.Any])
      
      inline def setSlideDistanceUndefined: Self = StObject.set(x, "slideDistance", js.undefined)
      
      inline def setSlideUndefined: Self = StObject.set(x, "slide", js.undefined)
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceIndex(value: Double): Self = StObject.set(x, "sourceIndex", value.asInstanceOf[js.Any])
      
      inline def setSourceIndexUndefined: Self = StObject.set(x, "sourceIndex", js.undefined)
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setSources(value: js.Array[String]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
      
      inline def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
      
      inline def setSourcesVarargs(value: String*): Self = StObject.set(x, "sources", js.Array(value*))
      
      inline def setToggler(value: Boolean): Self = StObject.set(x, "toggler", value.asInstanceOf[js.Any])
      
      inline def setType(value: SourceType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeNull: Self = StObject.set(x, "type", null)
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setTypes(value: js.Array[SourceType]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
      
      inline def setTypesVarargs(value: SourceType*): Self = StObject.set(x, "types", js.Array(value*))
      
      inline def setVideosPosters(value: js.Array[VideoPoster]): Self = StObject.set(x, "videosPosters", value.asInstanceOf[js.Any])
      
      inline def setVideosPostersUndefined: Self = StObject.set(x, "videosPosters", js.undefined)
      
      inline def setVideosPostersVarargs(value: VideoPoster*): Self = StObject.set(x, "videosPosters", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.fslightboxReact.fslightboxReactStrings.image
    - typings.fslightboxReact.fslightboxReactStrings.video
    - typings.fslightboxReact.fslightboxReactStrings.youtube
    - scala.Null
  */
  type SourceType = _SourceType | Null
  
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
  
  type VideoPoster = String | Null
  
  trait _SourceType extends StObject
}
