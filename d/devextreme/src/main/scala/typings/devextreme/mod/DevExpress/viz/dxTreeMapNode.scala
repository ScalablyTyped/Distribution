package typings.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxTreeMapNode extends js.Object {
  
  /**
    * [descr:dxTreeMapNode.customize(options)]
    */
  def customize(options: js.Any): Unit = js.native
  
  /**
    * [descr:dxTreeMapNode.data]
    */
  var data: js.UndefOr[js.Any] = js.native
  
  /**
    * [descr:dxTreeMapNode.drillDown()]
    */
  def drillDown(): Unit = js.native
  
  /**
    * [descr:dxTreeMapNode.getAllChildren()]
    */
  def getAllChildren(): js.Array[dxTreeMapNode] = js.native
  
  /**
    * [descr:dxTreeMapNode.getAllNodes()]
    */
  def getAllNodes(): js.Array[dxTreeMapNode] = js.native
  
  /**
    * [descr:dxTreeMapNode.getChild(index)]
    */
  def getChild(index: Double): dxTreeMapNode = js.native
  
  /**
    * [descr:dxTreeMapNode.getChildrenCount()]
    */
  def getChildrenCount(): Double = js.native
  
  /**
    * [descr:dxTreeMapNode.getParent()]
    */
  def getParent(): dxTreeMapNode = js.native
  
  /**
    * [descr:dxTreeMapNode.index]
    */
  var index: js.UndefOr[Double] = js.native
  
  /**
    * [descr:dxTreeMapNode.isActive()]
    */
  def isActive(): Boolean = js.native
  
  /**
    * [descr:dxTreeMapNode.isHovered()]
    */
  def isHovered(): Boolean = js.native
  
  /**
    * [descr:dxTreeMapNode.isLeaf()]
    */
  def isLeaf(): Boolean = js.native
  
  /**
    * [descr:dxTreeMapNode.isSelected()]
    */
  def isSelected(): Boolean = js.native
  
  /**
    * [descr:dxTreeMapNode.label()]
    */
  def label(): String = js.native
  /**
    * [descr:dxTreeMapNode.label(label)]
    */
  def label(label: String): Unit = js.native
  
  /**
    * [descr:dxTreeMapNode.level]
    */
  var level: js.UndefOr[Double] = js.native
  
  /**
    * [descr:dxTreeMapNode.resetCustomization()]
    */
  def resetCustomization(): Unit = js.native
  
  /**
    * [descr:dxTreeMapNode.select(state)]
    */
  def select(state: Boolean): Unit = js.native
  
  /**
    * [descr:dxTreeMapNode.showTooltip()]
    */
  def showTooltip(): Unit = js.native
  
  /**
    * [descr:dxTreeMapNode.value()]
    */
  def value(): Double = js.native
}
