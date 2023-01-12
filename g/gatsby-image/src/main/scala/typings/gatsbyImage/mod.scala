package typings.gatsbyImage

import typings.gatsbyImage.anon.WasCached
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gatsby-image", JSImport.Default)
  @js.native
  open class default () extends Component[GatsbyImageProps, Any, Any]
  
  trait FixedObject extends StObject {
    
    var base64: js.UndefOr[String] = js.undefined
    
    var height: Double
    
    var media: js.UndefOr[String] = js.undefined
    
    var src: String
    
    var srcSet: String
    
    var srcSetWebp: js.UndefOr[String] = js.undefined
    
    var srcWebp: js.UndefOr[String] = js.undefined
    
    var tracedSVG: js.UndefOr[String] = js.undefined
    
    var width: Double
  }
  object FixedObject {
    
    inline def apply(height: Double, src: String, srcSet: String, width: Double): FixedObject = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], srcSet = srcSet.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[FixedObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FixedObject] (val x: Self) extends AnyVal {
      
      inline def setBase64(value: String): Self = StObject.set(x, "base64", value.asInstanceOf[js.Any])
      
      inline def setBase64Undefined: Self = StObject.set(x, "base64", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setMedia(value: String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
      
      inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcSet(value: String): Self = StObject.set(x, "srcSet", value.asInstanceOf[js.Any])
      
      inline def setSrcSetWebp(value: String): Self = StObject.set(x, "srcSetWebp", value.asInstanceOf[js.Any])
      
      inline def setSrcSetWebpUndefined: Self = StObject.set(x, "srcSetWebp", js.undefined)
      
      inline def setSrcWebp(value: String): Self = StObject.set(x, "srcWebp", value.asInstanceOf[js.Any])
      
      inline def setSrcWebpUndefined: Self = StObject.set(x, "srcWebp", js.undefined)
      
      inline def setTracedSVG(value: String): Self = StObject.set(x, "tracedSVG", value.asInstanceOf[js.Any])
      
      inline def setTracedSVGUndefined: Self = StObject.set(x, "tracedSVG", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait FluidObject extends StObject {
    
    var aspectRatio: Double
    
    var base64: js.UndefOr[String] = js.undefined
    
    var media: js.UndefOr[String] = js.undefined
    
    var sizes: String
    
    var src: String
    
    var srcSet: String
    
    var srcSetWebp: js.UndefOr[String] = js.undefined
    
    var srcWebp: js.UndefOr[String] = js.undefined
    
    var tracedSVG: js.UndefOr[String] = js.undefined
  }
  object FluidObject {
    
    inline def apply(aspectRatio: Double, sizes: String, src: String, srcSet: String): FluidObject = {
      val __obj = js.Dynamic.literal(aspectRatio = aspectRatio.asInstanceOf[js.Any], sizes = sizes.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], srcSet = srcSet.asInstanceOf[js.Any])
      __obj.asInstanceOf[FluidObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FluidObject] (val x: Self) extends AnyVal {
      
      inline def setAspectRatio(value: Double): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
      
      inline def setBase64(value: String): Self = StObject.set(x, "base64", value.asInstanceOf[js.Any])
      
      inline def setBase64Undefined: Self = StObject.set(x, "base64", js.undefined)
      
      inline def setMedia(value: String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
      
      inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
      
      inline def setSizes(value: String): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcSet(value: String): Self = StObject.set(x, "srcSet", value.asInstanceOf[js.Any])
      
      inline def setSrcSetWebp(value: String): Self = StObject.set(x, "srcSetWebp", value.asInstanceOf[js.Any])
      
      inline def setSrcSetWebpUndefined: Self = StObject.set(x, "srcSetWebp", js.undefined)
      
      inline def setSrcWebp(value: String): Self = StObject.set(x, "srcWebp", value.asInstanceOf[js.Any])
      
      inline def setSrcWebpUndefined: Self = StObject.set(x, "srcWebp", js.undefined)
      
      inline def setTracedSVG(value: String): Self = StObject.set(x, "tracedSVG", value.asInstanceOf[js.Any])
      
      inline def setTracedSVGUndefined: Self = StObject.set(x, "tracedSVG", js.undefined)
    }
  }
  
  type GatsbyImage = Component[GatsbyImageProps, Any, Any]
  
  trait GatsbyImageFixedProps
    extends StObject
       with GatsbyImageOptionalProps
       with GatsbyImageProps {
    
    var fixed: FixedObject | js.Array[FixedObject]
  }
  object GatsbyImageFixedProps {
    
    inline def apply(fixed: FixedObject | js.Array[FixedObject]): GatsbyImageFixedProps = {
      val __obj = js.Dynamic.literal(fixed = fixed.asInstanceOf[js.Any])
      __obj.asInstanceOf[GatsbyImageFixedProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GatsbyImageFixedProps] (val x: Self) extends AnyVal {
      
      inline def setFixed(value: FixedObject | js.Array[FixedObject]): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      inline def setFixedVarargs(value: FixedObject*): Self = StObject.set(x, "fixed", js.Array(value*))
    }
  }
  
  trait GatsbyImageFluidProps
    extends StObject
       with GatsbyImageOptionalProps
       with GatsbyImageProps {
    
    var fluid: FluidObject | js.Array[FluidObject]
  }
  object GatsbyImageFluidProps {
    
    inline def apply(fluid: FluidObject | js.Array[FluidObject]): GatsbyImageFluidProps = {
      val __obj = js.Dynamic.literal(fluid = fluid.asInstanceOf[js.Any])
      __obj.asInstanceOf[GatsbyImageFluidProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GatsbyImageFluidProps] (val x: Self) extends AnyVal {
      
      inline def setFluid(value: FluidObject | js.Array[FluidObject]): Self = StObject.set(x, "fluid", value.asInstanceOf[js.Any])
      
      inline def setFluidVarargs(value: FluidObject*): Self = StObject.set(x, "fluid", js.Array(value*))
    }
  }
  
  trait GatsbyImageOptionalProps extends StObject {
    
    var Tag: js.UndefOr[String] = js.undefined
    
    var alt: js.UndefOr[String] = js.undefined
    
    var backgroundColor: js.UndefOr[String | Boolean] = js.undefined
    
    var className: js.UndefOr[String | js.Object] = js.undefined
    
    var critical: js.UndefOr[Boolean] = js.undefined
    
    var crossOrigin: js.UndefOr[String | Boolean] = js.undefined
    
    var draggable: js.UndefOr[Boolean] = js.undefined
    
    var durationFadeIn: js.UndefOr[Double] = js.undefined
    
    var fadeIn: js.UndefOr[Boolean] = js.undefined
    
    var imgStyle: js.UndefOr[js.Object] = js.undefined
    
    var itemProp: js.UndefOr[String] = js.undefined
    
    var loading: js.UndefOr[/* template literal string: auto */ String] = js.undefined
    
    var onError: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
    
    var onLoad: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onStartLoad: js.UndefOr[js.Function1[/* param */ WasCached, Unit]] = js.undefined
    
    var placeholderClassName: js.UndefOr[String] = js.undefined
    
    var placeholderStyle: js.UndefOr[js.Object] = js.undefined
    
    /**
      * @deprecated Use `fixed`
      */
    var resolutions: js.UndefOr[FixedObject] = js.undefined
    
    /**
      * @deprecated Use `fluid`
      */
    var sizes: js.UndefOr[FluidObject] = js.undefined
    
    var style: js.UndefOr[js.Object] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object GatsbyImageOptionalProps {
    
    inline def apply(): GatsbyImageOptionalProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GatsbyImageOptionalProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GatsbyImageOptionalProps] (val x: Self) extends AnyVal {
      
      inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      inline def setBackgroundColor(value: String | Boolean): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setClassName(value: String | js.Object): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCritical(value: Boolean): Self = StObject.set(x, "critical", value.asInstanceOf[js.Any])
      
      inline def setCriticalUndefined: Self = StObject.set(x, "critical", js.undefined)
      
      inline def setCrossOrigin(value: String | Boolean): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
      
      inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
      
      inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      inline def setDurationFadeIn(value: Double): Self = StObject.set(x, "durationFadeIn", value.asInstanceOf[js.Any])
      
      inline def setDurationFadeInUndefined: Self = StObject.set(x, "durationFadeIn", js.undefined)
      
      inline def setFadeIn(value: Boolean): Self = StObject.set(x, "fadeIn", value.asInstanceOf[js.Any])
      
      inline def setFadeInUndefined: Self = StObject.set(x, "fadeIn", js.undefined)
      
      inline def setImgStyle(value: js.Object): Self = StObject.set(x, "imgStyle", value.asInstanceOf[js.Any])
      
      inline def setImgStyleUndefined: Self = StObject.set(x, "imgStyle", js.undefined)
      
      inline def setItemProp(value: String): Self = StObject.set(x, "itemProp", value.asInstanceOf[js.Any])
      
      inline def setItemPropUndefined: Self = StObject.set(x, "itemProp", js.undefined)
      
      inline def setLoading(value: /* template literal string: auto */ String): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      inline def setOnError(value: /* event */ Any => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnLoad(value: () => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction0(value))
      
      inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      inline def setOnStartLoad(value: /* param */ WasCached => Unit): Self = StObject.set(x, "onStartLoad", js.Any.fromFunction1(value))
      
      inline def setOnStartLoadUndefined: Self = StObject.set(x, "onStartLoad", js.undefined)
      
      inline def setPlaceholderClassName(value: String): Self = StObject.set(x, "placeholderClassName", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderClassNameUndefined: Self = StObject.set(x, "placeholderClassName", js.undefined)
      
      inline def setPlaceholderStyle(value: js.Object): Self = StObject.set(x, "placeholderStyle", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderStyleUndefined: Self = StObject.set(x, "placeholderStyle", js.undefined)
      
      inline def setResolutions(value: FixedObject): Self = StObject.set(x, "resolutions", value.asInstanceOf[js.Any])
      
      inline def setResolutionsUndefined: Self = StObject.set(x, "resolutions", js.undefined)
      
      inline def setSizes(value: FluidObject): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
      
      inline def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
      
      inline def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.gatsbyImage.mod.GatsbyImageFluidProps
    - typings.gatsbyImage.mod.GatsbyImageFixedProps
  */
  trait GatsbyImageProps extends StObject
  object GatsbyImageProps {
    
    inline def GatsbyImageFixedProps(fixed: FixedObject | js.Array[FixedObject]): typings.gatsbyImage.mod.GatsbyImageFixedProps = {
      val __obj = js.Dynamic.literal(fixed = fixed.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.gatsbyImage.mod.GatsbyImageFixedProps]
    }
    
    inline def GatsbyImageFluidProps(fluid: FluidObject | js.Array[FluidObject]): typings.gatsbyImage.mod.GatsbyImageFluidProps = {
      val __obj = js.Dynamic.literal(fluid = fluid.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.gatsbyImage.mod.GatsbyImageFluidProps]
    }
  }
}
