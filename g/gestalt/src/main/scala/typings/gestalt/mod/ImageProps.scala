package typings.gestalt.mod

import typings.gestalt.gestaltStrings.`lazy`
import typings.gestalt.gestaltStrings.auto
import typings.gestalt.gestaltStrings.contain
import typings.gestalt.gestaltStrings.cover
import typings.gestalt.gestaltStrings.eager
import typings.gestalt.gestaltStrings.high
import typings.gestalt.gestaltStrings.low
import typings.gestalt.gestaltStrings.none
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageProps extends StObject {
  
  var alt: String = js.native
  
  var children: js.UndefOr[ReactNode] = js.native
  
  var color: String = js.native
  
  var fit: js.UndefOr[cover | contain | none] = js.native
  
  var importance: js.UndefOr[high | low | auto] = js.native
  
  var loading: js.UndefOr[eager | `lazy` | auto] = js.native
  
  var naturalHeight: Double = js.native
  
  var naturalWidth: Double = js.native
  
  var onError: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onLoad: js.UndefOr[js.Function0[Unit]] = js.native
  
  var sizes: js.UndefOr[String] = js.native
  
  var src: String = js.native
  
  var srcSet: js.UndefOr[String] = js.native
}
object ImageProps {
  
  @scala.inline
  def apply(alt: String, color: String, naturalHeight: Double, naturalWidth: Double, src: String): ImageProps = {
    val __obj = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], naturalHeight = naturalHeight.asInstanceOf[js.Any], naturalWidth = naturalWidth.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageProps]
  }
  
  @scala.inline
  implicit class ImagePropsMutableBuilder[Self <: ImageProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFit(value: cover | contain | none): Self = StObject.set(x, "fit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFitUndefined: Self = StObject.set(x, "fit", js.undefined)
    
    @scala.inline
    def setImportance(value: high | low | auto): Self = StObject.set(x, "importance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportanceUndefined: Self = StObject.set(x, "importance", js.undefined)
    
    @scala.inline
    def setLoading(value: eager | `lazy` | auto): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
    
    @scala.inline
    def setNaturalHeight(value: Double): Self = StObject.set(x, "naturalHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNaturalWidth(value: Double): Self = StObject.set(x, "naturalWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnError(value: () => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    @scala.inline
    def setOnLoad(value: () => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
    
    @scala.inline
    def setSizes(value: String): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
    
    @scala.inline
    def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcSet(value: String): Self = StObject.set(x, "srcSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcSetUndefined: Self = StObject.set(x, "srcSet", js.undefined)
  }
}
