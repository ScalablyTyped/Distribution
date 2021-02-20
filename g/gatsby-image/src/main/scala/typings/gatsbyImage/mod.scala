package typings.gatsbyImage

import typings.gatsbyImage.anon.WasCached
import typings.gatsbyImage.gatsbyImageStrings.`lazy`
import typings.gatsbyImage.gatsbyImageStrings.auto
import typings.gatsbyImage.gatsbyImageStrings.eager
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gatsby-image", JSImport.Default)
  @js.native
  class default ()
    extends Component[GatsbyImageProps, js.Any, js.Any]
  
  @js.native
  trait FixedObject extends StObject {
    
    var base64: js.UndefOr[String] = js.native
    
    var height: Double = js.native
    
    var media: js.UndefOr[String] = js.native
    
    var src: String = js.native
    
    var srcSet: String = js.native
    
    var srcSetWebp: js.UndefOr[String] = js.native
    
    var srcWebp: js.UndefOr[String] = js.native
    
    var tracedSVG: js.UndefOr[String] = js.native
    
    var width: Double = js.native
  }
  object FixedObject {
    
    @scala.inline
    def apply(height: Double, src: String, srcSet: String, width: Double): FixedObject = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], srcSet = srcSet.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[FixedObject]
    }
    
    @scala.inline
    implicit class FixedObjectMutableBuilder[Self <: FixedObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBase64(value: String): Self = StObject.set(x, "base64", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBase64Undefined: Self = StObject.set(x, "base64", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMedia(value: String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
      
      @scala.inline
      def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcSet(value: String): Self = StObject.set(x, "srcSet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcSetWebp(value: String): Self = StObject.set(x, "srcSetWebp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcSetWebpUndefined: Self = StObject.set(x, "srcSetWebp", js.undefined)
      
      @scala.inline
      def setSrcWebp(value: String): Self = StObject.set(x, "srcWebp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcWebpUndefined: Self = StObject.set(x, "srcWebp", js.undefined)
      
      @scala.inline
      def setTracedSVG(value: String): Self = StObject.set(x, "tracedSVG", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTracedSVGUndefined: Self = StObject.set(x, "tracedSVG", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FluidObject extends StObject {
    
    var aspectRatio: Double = js.native
    
    var base64: js.UndefOr[String] = js.native
    
    var media: js.UndefOr[String] = js.native
    
    var sizes: String = js.native
    
    var src: String = js.native
    
    var srcSet: String = js.native
    
    var srcSetWebp: js.UndefOr[String] = js.native
    
    var srcWebp: js.UndefOr[String] = js.native
    
    var tracedSVG: js.UndefOr[String] = js.native
  }
  object FluidObject {
    
    @scala.inline
    def apply(aspectRatio: Double, sizes: String, src: String, srcSet: String): FluidObject = {
      val __obj = js.Dynamic.literal(aspectRatio = aspectRatio.asInstanceOf[js.Any], sizes = sizes.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], srcSet = srcSet.asInstanceOf[js.Any])
      __obj.asInstanceOf[FluidObject]
    }
    
    @scala.inline
    implicit class FluidObjectMutableBuilder[Self <: FluidObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAspectRatio(value: Double): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBase64(value: String): Self = StObject.set(x, "base64", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBase64Undefined: Self = StObject.set(x, "base64", js.undefined)
      
      @scala.inline
      def setMedia(value: String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
      
      @scala.inline
      def setSizes(value: String): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcSet(value: String): Self = StObject.set(x, "srcSet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcSetWebp(value: String): Self = StObject.set(x, "srcSetWebp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcSetWebpUndefined: Self = StObject.set(x, "srcSetWebp", js.undefined)
      
      @scala.inline
      def setSrcWebp(value: String): Self = StObject.set(x, "srcWebp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcWebpUndefined: Self = StObject.set(x, "srcWebp", js.undefined)
      
      @scala.inline
      def setTracedSVG(value: String): Self = StObject.set(x, "tracedSVG", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTracedSVGUndefined: Self = StObject.set(x, "tracedSVG", js.undefined)
    }
  }
  
  type GatsbyImage = Component[GatsbyImageProps, js.Any, js.Any]
  
  @js.native
  trait GatsbyImageFixedProps
    extends GatsbyImageOptionalProps
       with GatsbyImageProps {
    
    var fixed: FixedObject | js.Array[FixedObject] = js.native
  }
  object GatsbyImageFixedProps {
    
    @scala.inline
    def apply(fixed: FixedObject | js.Array[FixedObject]): GatsbyImageFixedProps = {
      val __obj = js.Dynamic.literal(fixed = fixed.asInstanceOf[js.Any])
      __obj.asInstanceOf[GatsbyImageFixedProps]
    }
    
    @scala.inline
    implicit class GatsbyImageFixedPropsMutableBuilder[Self <: GatsbyImageFixedProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFixed(value: FixedObject | js.Array[FixedObject]): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedVarargs(value: FixedObject*): Self = StObject.set(x, "fixed", js.Array(value :_*))
    }
  }
  
  @js.native
  trait GatsbyImageFluidProps
    extends GatsbyImageOptionalProps
       with GatsbyImageProps {
    
    var fluid: FluidObject | js.Array[FluidObject] = js.native
  }
  object GatsbyImageFluidProps {
    
    @scala.inline
    def apply(fluid: FluidObject | js.Array[FluidObject]): GatsbyImageFluidProps = {
      val __obj = js.Dynamic.literal(fluid = fluid.asInstanceOf[js.Any])
      __obj.asInstanceOf[GatsbyImageFluidProps]
    }
    
    @scala.inline
    implicit class GatsbyImageFluidPropsMutableBuilder[Self <: GatsbyImageFluidProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFluid(value: FluidObject | js.Array[FluidObject]): Self = StObject.set(x, "fluid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFluidVarargs(value: FluidObject*): Self = StObject.set(x, "fluid", js.Array(value :_*))
    }
  }
  
  @js.native
  trait GatsbyImageOptionalProps extends StObject {
    
    var Tag: js.UndefOr[String] = js.native
    
    var alt: js.UndefOr[String] = js.native
    
    var backgroundColor: js.UndefOr[String | Boolean] = js.native
    
    var className: js.UndefOr[String | js.Object] = js.native
    
    var critical: js.UndefOr[Boolean] = js.native
    
    var crossOrigin: js.UndefOr[String | Boolean] = js.native
    
    var draggable: js.UndefOr[Boolean] = js.native
    
    var durationFadeIn: js.UndefOr[Double] = js.native
    
    var fadeIn: js.UndefOr[Boolean] = js.native
    
    var imgStyle: js.UndefOr[js.Object] = js.native
    
    var itemProp: js.UndefOr[String] = js.native
    
    var loading: js.UndefOr[auto | `lazy` | eager] = js.native
    
    var onError: js.UndefOr[js.Function1[/* event */ js.Any, Unit]] = js.native
    
    var onLoad: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onStartLoad: js.UndefOr[js.Function1[/* param */ WasCached, Unit]] = js.native
    
    var placeholderClassName: js.UndefOr[String] = js.native
    
    var placeholderStyle: js.UndefOr[js.Object] = js.native
    
    /**
      * @deprecated Use `fixed`
      */
    var resolutions: js.UndefOr[FixedObject] = js.native
    
    /**
      * @deprecated Use `fluid`
      */
    var sizes: js.UndefOr[FluidObject] = js.native
    
    var style: js.UndefOr[js.Object] = js.native
    
    var title: js.UndefOr[String] = js.native
  }
  object GatsbyImageOptionalProps {
    
    @scala.inline
    def apply(): GatsbyImageOptionalProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GatsbyImageOptionalProps]
    }
    
    @scala.inline
    implicit class GatsbyImageOptionalPropsMutableBuilder[Self <: GatsbyImageOptionalProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      @scala.inline
      def setBackgroundColor(value: String | Boolean): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      @scala.inline
      def setClassName(value: String | js.Object): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCritical(value: Boolean): Self = StObject.set(x, "critical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCriticalUndefined: Self = StObject.set(x, "critical", js.undefined)
      
      @scala.inline
      def setCrossOrigin(value: String | Boolean): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
      
      @scala.inline
      def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      @scala.inline
      def setDurationFadeIn(value: Double): Self = StObject.set(x, "durationFadeIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationFadeInUndefined: Self = StObject.set(x, "durationFadeIn", js.undefined)
      
      @scala.inline
      def setFadeIn(value: Boolean): Self = StObject.set(x, "fadeIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFadeInUndefined: Self = StObject.set(x, "fadeIn", js.undefined)
      
      @scala.inline
      def setImgStyle(value: js.Object): Self = StObject.set(x, "imgStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImgStyleUndefined: Self = StObject.set(x, "imgStyle", js.undefined)
      
      @scala.inline
      def setItemProp(value: String): Self = StObject.set(x, "itemProp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemPropUndefined: Self = StObject.set(x, "itemProp", js.undefined)
      
      @scala.inline
      def setLoading(value: auto | `lazy` | eager): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      @scala.inline
      def setOnError(value: /* event */ js.Any => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      @scala.inline
      def setOnLoad(value: () => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      @scala.inline
      def setOnStartLoad(value: /* param */ WasCached => Unit): Self = StObject.set(x, "onStartLoad", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnStartLoadUndefined: Self = StObject.set(x, "onStartLoad", js.undefined)
      
      @scala.inline
      def setPlaceholderClassName(value: String): Self = StObject.set(x, "placeholderClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderClassNameUndefined: Self = StObject.set(x, "placeholderClassName", js.undefined)
      
      @scala.inline
      def setPlaceholderStyle(value: js.Object): Self = StObject.set(x, "placeholderStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderStyleUndefined: Self = StObject.set(x, "placeholderStyle", js.undefined)
      
      @scala.inline
      def setResolutions(value: FixedObject): Self = StObject.set(x, "resolutions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolutionsUndefined: Self = StObject.set(x, "resolutions", js.undefined)
      
      @scala.inline
      def setSizes(value: FluidObject): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.gatsbyImage.mod.GatsbyImageFluidProps
    - typings.gatsbyImage.mod.GatsbyImageFixedProps
  */
  trait GatsbyImageProps extends StObject
  object GatsbyImageProps {
    
    @scala.inline
    def GatsbyImageFixedProps(fixed: FixedObject | js.Array[FixedObject]): typings.gatsbyImage.mod.GatsbyImageFixedProps = {
      val __obj = js.Dynamic.literal(fixed = fixed.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.gatsbyImage.mod.GatsbyImageFixedProps]
    }
    
    @scala.inline
    def GatsbyImageFluidProps(fluid: FluidObject | js.Array[FluidObject]): typings.gatsbyImage.mod.GatsbyImageFluidProps = {
      val __obj = js.Dynamic.literal(fluid = fluid.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.gatsbyImage.mod.GatsbyImageFluidProps]
    }
  }
}
