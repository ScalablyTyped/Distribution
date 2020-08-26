package typings.devtoolsProtocol.mod.Protocol.DOMSnapshot

import typings.devtoolsProtocol.mod.Protocol.DOM.Rect
import typings.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayoutTreeNode extends js.Object {
  /**
    * The bounding box in document coordinates. Note that scroll offset of the document is ignored.
    */
  var boundingBox: Rect = js.native
  /**
    * The index of the related DOM node in the `domNodes` array returned by `getSnapshot`.
    */
  var domNodeIndex: integer = js.native
  /**
    * The post-layout inline text nodes, if any.
    */
  var inlineTextNodes: js.UndefOr[js.Array[InlineTextBox]] = js.native
  /**
    * Set to true to indicate the element begins a new stacking context.
    */
  var isStackingContext: js.UndefOr[Boolean] = js.native
  /**
    * Contents of the LayoutText, if any.
    */
  var layoutText: js.UndefOr[String] = js.native
  /**
    * Global paint order index, which is determined by the stacking order of the nodes. Nodes
    * that are painted together will have the same index. Only provided if includePaintOrder in
    * getSnapshot was true.
    */
  var paintOrder: js.UndefOr[integer] = js.native
  /**
    * Index into the `computedStyles` array returned by `getSnapshot`.
    */
  var styleIndex: js.UndefOr[integer] = js.native
}

object LayoutTreeNode {
  @scala.inline
  def apply(boundingBox: Rect, domNodeIndex: integer): LayoutTreeNode = {
    val __obj = js.Dynamic.literal(boundingBox = boundingBox.asInstanceOf[js.Any], domNodeIndex = domNodeIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutTreeNode]
  }
  @scala.inline
  implicit class LayoutTreeNodeOps[Self <: LayoutTreeNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBoundingBox(value: Rect): Self = this.set("boundingBox", value.asInstanceOf[js.Any])
    @scala.inline
    def setDomNodeIndex(value: integer): Self = this.set("domNodeIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setInlineTextNodesVarargs(value: InlineTextBox*): Self = this.set("inlineTextNodes", js.Array(value :_*))
    @scala.inline
    def setInlineTextNodes(value: js.Array[InlineTextBox]): Self = this.set("inlineTextNodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInlineTextNodes: Self = this.set("inlineTextNodes", js.undefined)
    @scala.inline
    def setIsStackingContext(value: Boolean): Self = this.set("isStackingContext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsStackingContext: Self = this.set("isStackingContext", js.undefined)
    @scala.inline
    def setLayoutText(value: String): Self = this.set("layoutText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayoutText: Self = this.set("layoutText", js.undefined)
    @scala.inline
    def setPaintOrder(value: integer): Self = this.set("paintOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaintOrder: Self = this.set("paintOrder", js.undefined)
    @scala.inline
    def setStyleIndex(value: integer): Self = this.set("styleIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyleIndex: Self = this.set("styleIndex", js.undefined)
  }
  
}

