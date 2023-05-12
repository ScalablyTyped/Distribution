package typings.gestalt.mod

import typings.gestalt.gestaltStrings.`lazy`
import typings.gestalt.gestaltStrings.`use-credentials`
import typings.gestalt.gestaltStrings.anonymous
import typings.gestalt.gestaltStrings.async
import typings.gestalt.gestaltStrings.auto
import typings.gestalt.gestaltStrings.contain
import typings.gestalt.gestaltStrings.cover
import typings.gestalt.gestaltStrings.eager
import typings.gestalt.gestaltStrings.high
import typings.gestalt.gestaltStrings.img
import typings.gestalt.gestaltStrings.low
import typings.gestalt.gestaltStrings.none
import typings.gestalt.gestaltStrings.presentation
import typings.gestalt.gestaltStrings.sync
import typings.react.mod.SyntheticEvent
import typings.std.Event
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageProps extends StObject {
  
  var alt: String
  
  var children: js.UndefOr[Node] = js.undefined
  
  var color: js.UndefOr[String] = js.undefined
  
  var crossOrigin: js.UndefOr[anonymous | `use-credentials`] = js.undefined
  
  var decoding: js.UndefOr[sync | async | auto] = js.undefined
  
  var elementTiming: js.UndefOr[String] = js.undefined
  
  var fetchPriority: js.UndefOr[high | low | auto] = js.undefined
  
  var fit: js.UndefOr[cover | contain | none] = js.undefined
  
  var loading: js.UndefOr[eager | `lazy` | auto] = js.undefined
  
  var naturalHeight: Double
  
  var naturalWidth: Double
  
  var onError: js.UndefOr[AbstractEventHandler[SyntheticEvent[HTMLImageElement, Event], js.Object]] = js.undefined
  
  var onLoad: js.UndefOr[AbstractEventHandler[SyntheticEvent[HTMLImageElement, Event], js.Object]] = js.undefined
  
  var role: js.UndefOr[img | presentation] = js.undefined
  
  var sizes: js.UndefOr[String] = js.undefined
  
  var src: String
  
  var srcSet: js.UndefOr[String] = js.undefined
}
object ImageProps {
  
  inline def apply(alt: String, naturalHeight: Double, naturalWidth: Double, src: String): ImageProps = {
    val __obj = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any], naturalHeight = naturalHeight.asInstanceOf[js.Any], naturalWidth = naturalWidth.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageProps] (val x: Self) extends AnyVal {
    
    inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    inline def setChildren(value: Node): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setCrossOrigin(value: anonymous | `use-credentials`): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
    
    inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
    
    inline def setDecoding(value: sync | async | auto): Self = StObject.set(x, "decoding", value.asInstanceOf[js.Any])
    
    inline def setDecodingUndefined: Self = StObject.set(x, "decoding", js.undefined)
    
    inline def setElementTiming(value: String): Self = StObject.set(x, "elementTiming", value.asInstanceOf[js.Any])
    
    inline def setElementTimingUndefined: Self = StObject.set(x, "elementTiming", js.undefined)
    
    inline def setFetchPriority(value: high | low | auto): Self = StObject.set(x, "fetchPriority", value.asInstanceOf[js.Any])
    
    inline def setFetchPriorityUndefined: Self = StObject.set(x, "fetchPriority", js.undefined)
    
    inline def setFit(value: cover | contain | none): Self = StObject.set(x, "fit", value.asInstanceOf[js.Any])
    
    inline def setFitUndefined: Self = StObject.set(x, "fit", js.undefined)
    
    inline def setLoading(value: eager | `lazy` | auto): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
    
    inline def setNaturalHeight(value: Double): Self = StObject.set(x, "naturalHeight", value.asInstanceOf[js.Any])
    
    inline def setNaturalWidth(value: Double): Self = StObject.set(x, "naturalWidth", value.asInstanceOf[js.Any])
    
    inline def setOnError(
      value: /* arg */ js.Object & (typings.gestalt.anon.Event[SyntheticEvent[HTMLImageElement, Event]]) => Unit
    ): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    inline def setOnLoad(
      value: /* arg */ js.Object & (typings.gestalt.anon.Event[SyntheticEvent[HTMLImageElement, Event]]) => Unit
    ): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
    
    inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
    
    inline def setRole(value: img | presentation): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setSizes(value: String): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
    
    inline def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setSrcSet(value: String): Self = StObject.set(x, "srcSet", value.asInstanceOf[js.Any])
    
    inline def setSrcSetUndefined: Self = StObject.set(x, "srcSet", js.undefined)
  }
}
