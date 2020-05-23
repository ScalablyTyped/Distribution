package typings.ejWebAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropDownTree_ extends Widget_ {
  var defaults: typings.ejWebAll.ej.DropDownTree.Model = js.native
  @JSName("model")
  var model_DropDownTree_ : typings.ejWebAll.ej.DropDownTree.Model = js.native
  /** Checks all the nodes in the DropDownTree.
    * @returns {void}
    */
  def checkAll(): Unit = js.native
  /** Checks a node in the DropDownTree.
    * @param {string|any|any[]}  ID of the DropDownTree node/object of the DropDownTree node/collection of the ID/object of the DropDownTree nodes.
    * @returns {void}
    */
  def checkNode(element: String): Unit = js.native
  def checkNode(element: js.Any): Unit = js.native
  def checkNode(element: js.Array[_]): Unit = js.native
  /** Clears the text in the DropDownTree.
    * @returns {void}
    */
  def clearText(): Unit = js.native
  /** Returns the selected value.
    * @returns {void}
    */
  def getValue(): Unit = js.native
  /** Hides the popup in the DropDownTree.
    * @returns {void}
    */
  def hidePopup(): Unit = js.native
  /** Moves the DropDownTree node within the same DropDownTree. The new position of the given DropDownTree node will be based on destination node and index position.
    * @param {string|any} ID of the DropDownTree node/object of the DropDownTree node.
    * @param {string|any} ID of the DropDownTree node/object of the DropDownTree node.
    * @param {number} New index position of the given source node.
    * @returns {void}
    */
  def moveNode(sourceNode: String, destinationNode: String, index: Double): Unit = js.native
  def moveNode(sourceNode: String, destinationNode: js.Any, index: Double): Unit = js.native
  def moveNode(sourceNode: js.Any, destinationNode: String, index: Double): Unit = js.native
  def moveNode(sourceNode: js.Any, destinationNode: js.Any, index: Double): Unit = js.native
  /** Removes all the nodes in the DropDownTree.
    * @returns {void}
    */
  def removeAll(): Unit = js.native
  /** Removes a node in the DropDownTree.
    * @param {string|any|any[]}  ID of the DropDownTree node/object of the DropDownTree node/collectionof the ID/object of the DropDownTree nodes.
    * @returns {void}
    */
  def removeNode(element: String): Unit = js.native
  def removeNode(element: js.Any): Unit = js.native
  def removeNode(element: js.Array[_]): Unit = js.native
  /** Selects all the DropDownTree nodes when allowMultiSelection field is enabled in the treeViewSettings property.
    * @returns {void}
    */
  def selectAll(): Unit = js.native
  /** Selects a node in the DropDownTree control. To select the collection of nodes in the DropDownTree control, enable allowMultiSelection field of the treeViewSettings property.
    * @param {string|any|any[]}  ID of the DropDownTree node/object of the DropDownTree node/ collection of I the D/object of the DropDownTree nodes.
    * @returns {void}
    */
  def selectNode(element: String): Unit = js.native
  def selectNode(element: js.Any): Unit = js.native
  def selectNode(element: js.Array[_]): Unit = js.native
  /** Shows the DropDownTree control with the popup.
    * @returns {void}
    */
  def showPopup(): Unit = js.native
  /** Unchecks all the nodes in the DropDownTree.
    * @returns {void}
    */
  def unCheckAll(): Unit = js.native
  /** Unchecks a node in the DropDownTree.
    * @param {string|any|any[]} ID of the DropDownTree node/object of the DropDownTree node/collection of the ID/object of the DropDownTree nodes.
    * @returns {void}
    */
  def unCheckNode(element: String): Unit = js.native
  def unCheckNode(element: js.Any): Unit = js.native
  def unCheckNode(element: js.Array[_]): Unit = js.native
  /** Unselects all the DropDownTree nodes when allowMultiSelection field of the treeViewSettings property is enabled.
    * @returns {void}
    */
  def unselectAll(): Unit = js.native
  /** Unselects a node in the DropDownTree control. To unselect the collection of nodes in the DropDownTree control, enable allowMultiSelection field of the treeViewSettings property.
    * @param {string|any|any[]}  ID of the DropDownTree node/object of the DropDownTree node/ collection of the ID/object of the DropDownTree nodes.
    * @returns {void}
    */
  def unselectNode(element: String): Unit = js.native
  def unselectNode(element: js.Any): Unit = js.native
  def unselectNode(element: js.Array[_]): Unit = js.native
}

