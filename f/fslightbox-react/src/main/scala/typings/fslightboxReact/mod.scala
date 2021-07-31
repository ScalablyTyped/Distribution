package typings.fslightboxReact

import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fslightbox-react", JSImport.Default)
  @js.native
  class default ()
    extends Component[FsLightboxProps, js.Object, js.Any]
  
  type FsLightbox = Component[FsLightboxProps, js.Object, js.Any]
  
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
    
    @scala.inline
    def apply(toggler: Boolean): FsLightboxProps = {
      val __obj = js.Dynamic.literal(toggler = toggler.asInstanceOf[js.Any])
      __obj.asInstanceOf[FsLightboxProps]
    }
    
    @scala.inline
    implicit class FsLightboxPropsMutableBuilder[Self <: FsLightboxProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomSources(value: js.Array[Element]): Self = StObject.set(x, "customSources", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomSourcesUndefined: Self = StObject.set(x, "customSources", js.undefined)
      
      @scala.inline
      def setCustomSourcesVarargs(value: Element*): Self = StObject.set(x, "customSources", js.Array(value :_*))
      
      @scala.inline
      def setDisableLocalStorage(value: Boolean): Self = StObject.set(x, "disableLocalStorage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableLocalStorageUndefined: Self = StObject.set(x, "disableLocalStorage", js.undefined)
      
      @scala.inline
      def setLoadOnlyCurrentSource(value: Boolean): Self = StObject.set(x, "loadOnlyCurrentSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadOnlyCurrentSourceUndefined: Self = StObject.set(x, "loadOnlyCurrentSource", js.undefined)
      
      @scala.inline
      def setMaxYoutubeVideoDimensions(value: VideoDimensions): Self = StObject.set(x, "maxYoutubeVideoDimensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxYoutubeVideoDimensionsUndefined: Self = StObject.set(x, "maxYoutubeVideoDimensions", js.undefined)
      
      @scala.inline
      def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setOnInit(value: () => Unit): Self = StObject.set(x, "onInit", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnInitUndefined: Self = StObject.set(x, "onInit", js.undefined)
      
      @scala.inline
      def setOnOpen(value: () => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      @scala.inline
      def setOnShow(value: () => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      @scala.inline
      def setOpenOnMount(value: Boolean): Self = StObject.set(x, "openOnMount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenOnMountUndefined: Self = StObject.set(x, "openOnMount", js.undefined)
      
      @scala.inline
      def setSlide(value: Double): Self = StObject.set(x, "slide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlideDistance(value: Double): Self = StObject.set(x, "slideDistance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlideDistanceUndefined: Self = StObject.set(x, "slideDistance", js.undefined)
      
      @scala.inline
      def setSlideUndefined: Self = StObject.set(x, "slide", js.undefined)
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceIndex(value: Double): Self = StObject.set(x, "sourceIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceIndexUndefined: Self = StObject.set(x, "sourceIndex", js.undefined)
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      @scala.inline
      def setSources(value: js.Array[String]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
      
      @scala.inline
      def setSourcesVarargs(value: String*): Self = StObject.set(x, "sources", js.Array(value :_*))
      
      @scala.inline
      def setToggler(value: Boolean): Self = StObject.set(x, "toggler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: SourceType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeNull: Self = StObject.set(x, "type", null)
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setTypes(value: js.Array[SourceType]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
      
      @scala.inline
      def setTypesVarargs(value: SourceType*): Self = StObject.set(x, "types", js.Array(value :_*))
      
      @scala.inline
      def setVideosPosters(value: js.Array[VideoPoster]): Self = StObject.set(x, "videosPosters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVideosPostersUndefined: Self = StObject.set(x, "videosPosters", js.undefined)
      
      @scala.inline
      def setVideosPostersVarargs(value: VideoPoster*): Self = StObject.set(x, "videosPosters", js.Array(value :_*))
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
    
    @scala.inline
    def apply(height: Double, width: Double): VideoDimensions = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[VideoDimensions]
    }
    
    @scala.inline
    implicit class VideoDimensionsMutableBuilder[Self <: VideoDimensions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  type VideoPoster = String | Null
  
  trait _SourceType extends StObject
}
