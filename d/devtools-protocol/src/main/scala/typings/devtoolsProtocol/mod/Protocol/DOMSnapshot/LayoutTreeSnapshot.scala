package typings.devtoolsProtocol.mod.Protocol.DOMSnapshot

import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayoutTreeSnapshot extends StObject {
  
  /**
    * The absolute position bounding box.
    */
  var bounds: js.Array[Rectangle]
  
  /**
    * The client rect of nodes. Only available when includeDOMRects is set to true
    */
  var clientRects: js.UndefOr[js.Array[Rectangle]] = js.undefined
  
  /**
    * Index of the corresponding node in the `NodeTreeSnapshot` array returned by `captureSnapshot`.
    */
  var nodeIndex: js.Array[integer]
  
  /**
    * The offset rect of nodes. Only available when includeDOMRects is set to true
    */
  var offsetRects: js.UndefOr[js.Array[Rectangle]] = js.undefined
  
  /**
    * Global paint order index, which is determined by the stacking order of the nodes. Nodes
    * that are painted together will have the same index. Only provided if includePaintOrder in
    * captureSnapshot was true.
    */
  var paintOrders: js.UndefOr[js.Array[integer]] = js.undefined
  
  /**
    * The scroll rect of nodes. Only available when includeDOMRects is set to true
    */
  var scrollRects: js.UndefOr[js.Array[Rectangle]] = js.undefined
  
  /**
    * Stacking context information.
    */
  var stackingContexts: RareBooleanData
  
  /**
    * Array of indexes specifying computed style strings, filtered according to the `computedStyles` parameter passed to `captureSnapshot`.
    */
  var styles: js.Array[ArrayOfStrings]
  
  /**
    * Contents of the LayoutText, if any.
    */
  var text: js.Array[StringIndex]
}
object LayoutTreeSnapshot {
  
  inline def apply(
    bounds: js.Array[Rectangle],
    nodeIndex: js.Array[integer],
    stackingContexts: RareBooleanData,
    styles: js.Array[ArrayOfStrings],
    text: js.Array[StringIndex]
  ): LayoutTreeSnapshot = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], nodeIndex = nodeIndex.asInstanceOf[js.Any], stackingContexts = stackingContexts.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutTreeSnapshot]
  }
  
  extension [Self <: LayoutTreeSnapshot](x: Self) {
    
    inline def setBounds(value: js.Array[Rectangle]): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setBoundsVarargs(value: Rectangle*): Self = StObject.set(x, "bounds", js.Array(value :_*))
    
    inline def setClientRects(value: js.Array[Rectangle]): Self = StObject.set(x, "clientRects", value.asInstanceOf[js.Any])
    
    inline def setClientRectsUndefined: Self = StObject.set(x, "clientRects", js.undefined)
    
    inline def setClientRectsVarargs(value: Rectangle*): Self = StObject.set(x, "clientRects", js.Array(value :_*))
    
    inline def setNodeIndex(value: js.Array[integer]): Self = StObject.set(x, "nodeIndex", value.asInstanceOf[js.Any])
    
    inline def setNodeIndexVarargs(value: integer*): Self = StObject.set(x, "nodeIndex", js.Array(value :_*))
    
    inline def setOffsetRects(value: js.Array[Rectangle]): Self = StObject.set(x, "offsetRects", value.asInstanceOf[js.Any])
    
    inline def setOffsetRectsUndefined: Self = StObject.set(x, "offsetRects", js.undefined)
    
    inline def setOffsetRectsVarargs(value: Rectangle*): Self = StObject.set(x, "offsetRects", js.Array(value :_*))
    
    inline def setPaintOrders(value: js.Array[integer]): Self = StObject.set(x, "paintOrders", value.asInstanceOf[js.Any])
    
    inline def setPaintOrdersUndefined: Self = StObject.set(x, "paintOrders", js.undefined)
    
    inline def setPaintOrdersVarargs(value: integer*): Self = StObject.set(x, "paintOrders", js.Array(value :_*))
    
    inline def setScrollRects(value: js.Array[Rectangle]): Self = StObject.set(x, "scrollRects", value.asInstanceOf[js.Any])
    
    inline def setScrollRectsUndefined: Self = StObject.set(x, "scrollRects", js.undefined)
    
    inline def setScrollRectsVarargs(value: Rectangle*): Self = StObject.set(x, "scrollRects", js.Array(value :_*))
    
    inline def setStackingContexts(value: RareBooleanData): Self = StObject.set(x, "stackingContexts", value.asInstanceOf[js.Any])
    
    inline def setStyles(value: js.Array[ArrayOfStrings]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesVarargs(value: ArrayOfStrings*): Self = StObject.set(x, "styles", js.Array(value :_*))
    
    inline def setText(value: js.Array[StringIndex]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextVarargs(value: StringIndex*): Self = StObject.set(x, "text", js.Array(value :_*))
  }
}
