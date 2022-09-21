package typings.devextreme.mod.DevExpress.viz

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxTreeMapNode extends StObject {
  
  /**
    * Customizes the node.
    */
  def customize(options: Any): Unit = js.native
  
  /**
    * The object from the data source visualized by the node.
    */
  var data: js.UndefOr[Any] = js.native
  
  /**
    * Drills down into the node.
    */
  def drillDown(): Unit = js.native
  
  /**
    * Returns all nodes nested in the current node.
    */
  def getAllChildren(): js.Array[dxTreeMapNode] = js.native
  
  /**
    * Returns all descendant nodes.
    */
  def getAllNodes(): js.Array[dxTreeMapNode] = js.native
  
  /**
    * Gets a specific node from a collection of direct descendants.
    */
  def getChild(index: Double): dxTreeMapNode = js.native
  
  /**
    * Indicates how many direct descendants the current node has.
    */
  def getChildrenCount(): Double = js.native
  
  /**
    * Returns the parent node of the current node.
    */
  def getParent(): dxTreeMapNode = js.native
  
  /**
    * The index of the current node in the array of all nodes on the same level.
    */
  var index: js.UndefOr[Double] = js.native
  
  /**
    * Indicates whether the current node is active.
    */
  def isActive(): Boolean = js.native
  
  /**
    * Indicates whether the node is in the hover state or not.
    */
  def isHovered(): Boolean = js.native
  
  /**
    * Indicates whether the node is visualized by a tile or a group of tiles.
    */
  def isLeaf(): Boolean = js.native
  
  /**
    * Indicates whether the node is selected or not.
    */
  def isSelected(): Boolean = js.native
  
  /**
    * Returns the label of the node.
    */
  def label(): String = js.native
  /**
    * Sets the label to the node.
    */
  def label(label: String): Unit = js.native
  
  /**
    * The level that the current node occupies in the hierarchy of nodes.
    */
  var level: js.UndefOr[Double] = js.native
  
  /**
    * Reverts the appearance of the node to the initial state.
    */
  def resetCustomization(): Unit = js.native
  
  /**
    * Sets the selection state of a node.
    */
  def select(state: Boolean): Unit = js.native
  
  /**
    * Shows the tooltip.
    */
  def showTooltip(): Unit = js.native
  
  /**
    * Gets the raw value of the node.
    */
  def value(): Double = js.native
}
