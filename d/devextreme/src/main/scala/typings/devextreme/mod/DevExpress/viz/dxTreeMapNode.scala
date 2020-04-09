package typings.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxTreeMapNode extends js.Object {
  /** @name dxTreeMapNode.data */
  var data: js.Any = js.native
  /** @name dxTreeMapNode.index */
  var index: Double = js.native
  /** @name dxTreeMapNode.level */
  var level: Double = js.native
  /** @name dxTreeMapNode.customize(options) */
  def customize(options: js.Any): Unit = js.native
  /** @name dxTreeMapNode.drillDown() */
  def drillDown(): Unit = js.native
  /** @name dxTreeMapNode.getAllChildren() */
  def getAllChildren(): js.Array[dxTreeMapNode] = js.native
  /** @name dxTreeMapNode.getAllNodes() */
  def getAllNodes(): js.Array[dxTreeMapNode] = js.native
  /** @name dxTreeMapNode.getChild(index) */
  def getChild(index: Double): dxTreeMapNode = js.native
  /** @name dxTreeMapNode.getChildrenCount() */
  def getChildrenCount(): Double = js.native
  /** @name dxTreeMapNode.getParent() */
  def getParent(): dxTreeMapNode = js.native
  /** @name dxTreeMapNode.isActive() */
  def isActive(): Boolean = js.native
  /** @name dxTreeMapNode.isHovered() */
  def isHovered(): Boolean = js.native
  /** @name dxTreeMapNode.isLeaf() */
  def isLeaf(): Boolean = js.native
  /** @name dxTreeMapNode.isSelected() */
  def isSelected(): Boolean = js.native
  /** @name dxTreeMapNode.label() */
  def label(): String = js.native
  /** @name dxTreeMapNode.label(label) */
  def label(label: String): Unit = js.native
  /** @name dxTreeMapNode.resetCustomization() */
  def resetCustomization(): Unit = js.native
  /** @name dxTreeMapNode.select(state) */
  def select(state: Boolean): Unit = js.native
  /** @name dxTreeMapNode.showTooltip() */
  def showTooltip(): Unit = js.native
  /** @name dxTreeMapNode.value() */
  def value(): Double = js.native
}

