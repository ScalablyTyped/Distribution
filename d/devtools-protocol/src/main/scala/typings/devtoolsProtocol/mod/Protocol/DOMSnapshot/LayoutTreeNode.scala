package typings.devtoolsProtocol.mod.Protocol.DOMSnapshot

import typings.devtoolsProtocol.mod.Protocol.DOM.Rect
import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayoutTreeNode extends StObject {
  
  /**
    * The bounding box in document coordinates. Note that scroll offset of the document is ignored.
    */
  var boundingBox: Rect
  
  /**
    * The index of the related DOM node in the `domNodes` array returned by `getSnapshot`.
    */
  var domNodeIndex: integer
  
  /**
    * The post-layout inline text nodes, if any.
    */
  var inlineTextNodes: js.UndefOr[js.Array[InlineTextBox]] = js.undefined
  
  /**
    * Set to true to indicate the element begins a new stacking context.
    */
  var isStackingContext: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Contents of the LayoutText, if any.
    */
  var layoutText: js.UndefOr[String] = js.undefined
  
  /**
    * Global paint order index, which is determined by the stacking order of the nodes. Nodes
    * that are painted together will have the same index. Only provided if includePaintOrder in
    * getSnapshot was true.
    */
  var paintOrder: js.UndefOr[integer] = js.undefined
  
  /**
    * Index into the `computedStyles` array returned by `getSnapshot`.
    */
  var styleIndex: js.UndefOr[integer] = js.undefined
}
object LayoutTreeNode {
  
  inline def apply(boundingBox: Rect, domNodeIndex: integer): LayoutTreeNode = {
    val __obj = js.Dynamic.literal(boundingBox = boundingBox.asInstanceOf[js.Any], domNodeIndex = domNodeIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutTreeNode]
  }
  
  extension [Self <: LayoutTreeNode](x: Self) {
    
    inline def setBoundingBox(value: Rect): Self = StObject.set(x, "boundingBox", value.asInstanceOf[js.Any])
    
    inline def setDomNodeIndex(value: integer): Self = StObject.set(x, "domNodeIndex", value.asInstanceOf[js.Any])
    
    inline def setInlineTextNodes(value: js.Array[InlineTextBox]): Self = StObject.set(x, "inlineTextNodes", value.asInstanceOf[js.Any])
    
    inline def setInlineTextNodesUndefined: Self = StObject.set(x, "inlineTextNodes", js.undefined)
    
    inline def setInlineTextNodesVarargs(value: InlineTextBox*): Self = StObject.set(x, "inlineTextNodes", js.Array(value :_*))
    
    inline def setIsStackingContext(value: Boolean): Self = StObject.set(x, "isStackingContext", value.asInstanceOf[js.Any])
    
    inline def setIsStackingContextUndefined: Self = StObject.set(x, "isStackingContext", js.undefined)
    
    inline def setLayoutText(value: String): Self = StObject.set(x, "layoutText", value.asInstanceOf[js.Any])
    
    inline def setLayoutTextUndefined: Self = StObject.set(x, "layoutText", js.undefined)
    
    inline def setPaintOrder(value: integer): Self = StObject.set(x, "paintOrder", value.asInstanceOf[js.Any])
    
    inline def setPaintOrderUndefined: Self = StObject.set(x, "paintOrder", js.undefined)
    
    inline def setStyleIndex(value: integer): Self = StObject.set(x, "styleIndex", value.asInstanceOf[js.Any])
    
    inline def setStyleIndexUndefined: Self = StObject.set(x, "styleIndex", js.undefined)
  }
}
