package typings.devtoolsProtocol.mod.Protocol.DOMSnapshot

import typings.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayoutTreeSnapshot extends js.Object {
  /**
    * The absolute position bounding box.
    */
  var bounds: js.Array[Rectangle] = js.native
  /**
    * The client rect of nodes. Only available when includeDOMRects is set to true
    */
  var clientRects: js.UndefOr[js.Array[Rectangle]] = js.native
  /**
    * Index of the corresponding node in the `NodeTreeSnapshot` array returned by `captureSnapshot`.
    */
  var nodeIndex: js.Array[integer] = js.native
  /**
    * The offset rect of nodes. Only available when includeDOMRects is set to true
    */
  var offsetRects: js.UndefOr[js.Array[Rectangle]] = js.native
  /**
    * Global paint order index, which is determined by the stacking order of the nodes. Nodes
    * that are painted together will have the same index. Only provided if includePaintOrder in
    * captureSnapshot was true.
    */
  var paintOrders: js.UndefOr[js.Array[integer]] = js.native
  /**
    * The scroll rect of nodes. Only available when includeDOMRects is set to true
    */
  var scrollRects: js.UndefOr[js.Array[Rectangle]] = js.native
  /**
    * Stacking context information.
    */
  var stackingContexts: RareBooleanData = js.native
  /**
    * Array of indexes specifying computed style strings, filtered according to the `computedStyles` parameter passed to `captureSnapshot`.
    */
  var styles: js.Array[ArrayOfStrings] = js.native
  /**
    * Contents of the LayoutText, if any.
    */
  var text: js.Array[StringIndex] = js.native
}

object LayoutTreeSnapshot {
  @scala.inline
  def apply(
    bounds: js.Array[Rectangle],
    nodeIndex: js.Array[integer],
    stackingContexts: RareBooleanData,
    styles: js.Array[ArrayOfStrings],
    text: js.Array[StringIndex]
  ): LayoutTreeSnapshot = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], nodeIndex = nodeIndex.asInstanceOf[js.Any], stackingContexts = stackingContexts.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutTreeSnapshot]
  }
  @scala.inline
  implicit class LayoutTreeSnapshotOps[Self <: LayoutTreeSnapshot] (val x: Self) extends AnyVal {
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
    def setBoundsVarargs(value: Rectangle*): Self = this.set("bounds", js.Array(value :_*))
    @scala.inline
    def setBounds(value: js.Array[Rectangle]): Self = this.set("bounds", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodeIndexVarargs(value: integer*): Self = this.set("nodeIndex", js.Array(value :_*))
    @scala.inline
    def setNodeIndex(value: js.Array[integer]): Self = this.set("nodeIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setStackingContexts(value: RareBooleanData): Self = this.set("stackingContexts", value.asInstanceOf[js.Any])
    @scala.inline
    def setStylesVarargs(value: ArrayOfStrings*): Self = this.set("styles", js.Array(value :_*))
    @scala.inline
    def setStyles(value: js.Array[ArrayOfStrings]): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextVarargs(value: StringIndex*): Self = this.set("text", js.Array(value :_*))
    @scala.inline
    def setText(value: js.Array[StringIndex]): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientRectsVarargs(value: Rectangle*): Self = this.set("clientRects", js.Array(value :_*))
    @scala.inline
    def setClientRects(value: js.Array[Rectangle]): Self = this.set("clientRects", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientRects: Self = this.set("clientRects", js.undefined)
    @scala.inline
    def setOffsetRectsVarargs(value: Rectangle*): Self = this.set("offsetRects", js.Array(value :_*))
    @scala.inline
    def setOffsetRects(value: js.Array[Rectangle]): Self = this.set("offsetRects", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetRects: Self = this.set("offsetRects", js.undefined)
    @scala.inline
    def setPaintOrdersVarargs(value: integer*): Self = this.set("paintOrders", js.Array(value :_*))
    @scala.inline
    def setPaintOrders(value: js.Array[integer]): Self = this.set("paintOrders", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaintOrders: Self = this.set("paintOrders", js.undefined)
    @scala.inline
    def setScrollRectsVarargs(value: Rectangle*): Self = this.set("scrollRects", js.Array(value :_*))
    @scala.inline
    def setScrollRects(value: js.Array[Rectangle]): Self = this.set("scrollRects", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollRects: Self = this.set("scrollRects", js.undefined)
  }
  
}

