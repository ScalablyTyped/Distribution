package typings.devtoolsProtocol.mod.Protocol.DOMSnapshot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CaptureSnapshotRequest extends StObject {
  
  /**
    * Whitelist of computed styles to return.
    */
  var computedStyles: js.Array[String]
  
  /**
    * Whether to include blended background colors in the snapshot (default: false).
    * Blended background color is achieved by blending background colors of all elements
    * that overlap with the current element.
    */
  var includeBlendedBackgroundColors: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to include DOM rectangles (offsetRects, clientRects, scrollRects) into the snapshot
    */
  var includeDOMRects: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to include layout object paint orders into the snapshot.
    */
  var includePaintOrder: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to include text color opacity in the snapshot (default: false).
    * An element might have the opacity property set that affects the text color of the element.
    * The final text color opacity is computed based on the opacity of all overlapping elements.
    */
  var includeTextColorOpacities: js.UndefOr[Boolean] = js.undefined
}
object CaptureSnapshotRequest {
  
  inline def apply(computedStyles: js.Array[String]): CaptureSnapshotRequest = {
    val __obj = js.Dynamic.literal(computedStyles = computedStyles.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptureSnapshotRequest]
  }
  
  extension [Self <: CaptureSnapshotRequest](x: Self) {
    
    inline def setComputedStyles(value: js.Array[String]): Self = StObject.set(x, "computedStyles", value.asInstanceOf[js.Any])
    
    inline def setComputedStylesVarargs(value: String*): Self = StObject.set(x, "computedStyles", js.Array(value*))
    
    inline def setIncludeBlendedBackgroundColors(value: Boolean): Self = StObject.set(x, "includeBlendedBackgroundColors", value.asInstanceOf[js.Any])
    
    inline def setIncludeBlendedBackgroundColorsUndefined: Self = StObject.set(x, "includeBlendedBackgroundColors", js.undefined)
    
    inline def setIncludeDOMRects(value: Boolean): Self = StObject.set(x, "includeDOMRects", value.asInstanceOf[js.Any])
    
    inline def setIncludeDOMRectsUndefined: Self = StObject.set(x, "includeDOMRects", js.undefined)
    
    inline def setIncludePaintOrder(value: Boolean): Self = StObject.set(x, "includePaintOrder", value.asInstanceOf[js.Any])
    
    inline def setIncludePaintOrderUndefined: Self = StObject.set(x, "includePaintOrder", js.undefined)
    
    inline def setIncludeTextColorOpacities(value: Boolean): Self = StObject.set(x, "includeTextColorOpacities", value.asInstanceOf[js.Any])
    
    inline def setIncludeTextColorOpacitiesUndefined: Self = StObject.set(x, "includeTextColorOpacities", js.undefined)
  }
}
