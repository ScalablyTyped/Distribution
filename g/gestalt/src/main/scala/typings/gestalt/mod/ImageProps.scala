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
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageProps extends StObject {
  
  var alt: String
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var color: String
  
  var crossOrigin: js.UndefOr[anonymous | `use-credentials`] = js.undefined
  
  var decoding: js.UndefOr[sync | async | auto] = js.undefined
  
  var elementTiming: js.UndefOr[String] = js.undefined
  
  var fit: js.UndefOr[cover | contain | none] = js.undefined
  
  var importance: js.UndefOr[high | low | auto] = js.undefined
  
  var loading: js.UndefOr[eager | `lazy` | auto] = js.undefined
  
  var naturalHeight: Double
  
  var naturalWidth: Double
  
  var onError: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onLoad: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var role: js.UndefOr[img | presentation] = js.undefined
  
  var sizes: js.UndefOr[String] = js.undefined
  
  var src: String
  
  var srcSet: js.UndefOr[String] = js.undefined
}
object ImageProps {
  
  inline def apply(alt: String, color: String, naturalHeight: Double, naturalWidth: Double, src: String): ImageProps = {
    val __obj = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], naturalHeight = naturalHeight.asInstanceOf[js.Any], naturalWidth = naturalWidth.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageProps]
  }
  
  extension [Self <: ImageProps](x: Self) {
    
    inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setCrossOrigin(value: anonymous | `use-credentials`): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
    
    inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
    
    inline def setDecoding(value: sync | async | auto): Self = StObject.set(x, "decoding", value.asInstanceOf[js.Any])
    
    inline def setDecodingUndefined: Self = StObject.set(x, "decoding", js.undefined)
    
    inline def setElementTiming(value: String): Self = StObject.set(x, "elementTiming", value.asInstanceOf[js.Any])
    
    inline def setElementTimingUndefined: Self = StObject.set(x, "elementTiming", js.undefined)
    
    inline def setFit(value: cover | contain | none): Self = StObject.set(x, "fit", value.asInstanceOf[js.Any])
    
    inline def setFitUndefined: Self = StObject.set(x, "fit", js.undefined)
    
    inline def setImportance(value: high | low | auto): Self = StObject.set(x, "importance", value.asInstanceOf[js.Any])
    
    inline def setImportanceUndefined: Self = StObject.set(x, "importance", js.undefined)
    
    inline def setLoading(value: eager | `lazy` | auto): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
    
    inline def setNaturalHeight(value: Double): Self = StObject.set(x, "naturalHeight", value.asInstanceOf[js.Any])
    
    inline def setNaturalWidth(value: Double): Self = StObject.set(x, "naturalWidth", value.asInstanceOf[js.Any])
    
    inline def setOnError(value: () => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction0(value))
    
    inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    inline def setOnLoad(value: () => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction0(value))
    
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
