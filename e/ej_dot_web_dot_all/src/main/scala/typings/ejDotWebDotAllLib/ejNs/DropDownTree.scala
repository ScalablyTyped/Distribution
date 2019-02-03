package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.DropDownTree")
@js.native
class DropDownTree protected () extends Widget {
  def this(element: ejDotWebDotAllLib.JQuery) = this()
  def this(element: stdLib.Element) = this()
  def this(element: ejDotWebDotAllLib.JQuery, options: ejDotWebDotAllLib.ejNs.DropDownTreeNs.Model) = this()
  def this(element: stdLib.Element, options: ejDotWebDotAllLib.ejNs.DropDownTreeNs.Model) = this()
  var defaults: ejDotWebDotAllLib.ejNs.DropDownTreeNs.Model = js.native
  @JSName("model")
  var model_DropDownTree: ejDotWebDotAllLib.ejNs.DropDownTreeNs.Model = js.native
  /** Checks all the nodes in the DropDownTree.
    * @returns {void}
    */
  def checkAll(): scala.Unit = js.native
  /** Checks a node in the DropDownTree.
    * @param {string|any|any[]}  ID of the DropDownTree node/object of the DropDownTree node/collection of the ID/object of the DropDownTree nodes.
    * @returns {void}
    */
  def checkNode(element: java.lang.String): scala.Unit = js.native
  def checkNode(element: js.Any): scala.Unit = js.native
  def checkNode(element: js.Array[_]): scala.Unit = js.native
  /** Clears the text in the DropDownTree.
    * @returns {void}
    */
  def clearText(): scala.Unit = js.native
  /** Returns the selected value.
    * @returns {void}
    */
  def getValue(): scala.Unit = js.native
  /** Hides the popup in the DropDownTree.
    * @returns {void}
    */
  def hidePopup(): scala.Unit = js.native
  /** Moves the DropDownTree node within the same DropDownTree. The new position of the given DropDownTree node will be based on destination node and index position.
    * @param {string|any} ID of the DropDownTree node/object of the DropDownTree node.
    * @param {string|any} ID of the DropDownTree node/object of the DropDownTree node.
    * @param {number} New index position of the given source node.
    * @returns {void}
    */
  def moveNode(sourceNode: java.lang.String, destinationNode: java.lang.String, index: scala.Double): scala.Unit = js.native
  def moveNode(sourceNode: java.lang.String, destinationNode: js.Any, index: scala.Double): scala.Unit = js.native
  def moveNode(sourceNode: js.Any, destinationNode: java.lang.String, index: scala.Double): scala.Unit = js.native
  def moveNode(sourceNode: js.Any, destinationNode: js.Any, index: scala.Double): scala.Unit = js.native
  /** Removes all the nodes in the DropDownTree.
    * @returns {void}
    */
  def removeAll(): scala.Unit = js.native
  /** Removes a node in the DropDownTree.
    * @param {string|any|any[]}  ID of the DropDownTree node/object of the DropDownTree node/collectionof the ID/object of the DropDownTree nodes.
    * @returns {void}
    */
  def removeNode(element: java.lang.String): scala.Unit = js.native
  def removeNode(element: js.Any): scala.Unit = js.native
  def removeNode(element: js.Array[_]): scala.Unit = js.native
  /** Selects all the DropDownTree nodes when allowMultiSelection field is enabled in the treeViewSettings property.
    * @returns {void}
    */
  def selectAll(): scala.Unit = js.native
  /** Selects a node in the DropDownTree control. To select the collection of nodes in the DropDownTree control, enable allowMultiSelection field of the treeViewSettings property.
    * @param {string|any|any[]}  ID of the DropDownTree node/object of the DropDownTree node/ collection of I the D/object of the DropDownTree nodes.
    * @returns {void}
    */
  def selectNode(element: java.lang.String): scala.Unit = js.native
  def selectNode(element: js.Any): scala.Unit = js.native
  def selectNode(element: js.Array[_]): scala.Unit = js.native
  /** Shows the DropDownTree control with the popup.
    * @returns {void}
    */
  def showPopup(): scala.Unit = js.native
  /** Unchecks all the nodes in the DropDownTree.
    * @returns {void}
    */
  def unCheckAll(): scala.Unit = js.native
  /** Unchecks a node in the DropDownTree.
    * @param {string|any|any[]} ID of the DropDownTree node/object of the DropDownTree node/collection of the ID/object of the DropDownTree nodes.
    * @returns {void}
    */
  def unCheckNode(element: java.lang.String): scala.Unit = js.native
  def unCheckNode(element: js.Any): scala.Unit = js.native
  def unCheckNode(element: js.Array[_]): scala.Unit = js.native
  /** Unselects all the DropDownTree nodes when allowMultiSelection field of the treeViewSettings property is enabled.
    * @returns {void}
    */
  def unselectAll(): scala.Unit = js.native
  /** Unselects a node in the DropDownTree control. To unselect the collection of nodes in the DropDownTree control, enable allowMultiSelection field of the treeViewSettings property.
    * @param {string|any|any[]}  ID of the DropDownTree node/object of the DropDownTree node/ collection of the ID/object of the DropDownTree nodes.
    * @returns {void}
    */
  def unselectNode(element: java.lang.String): scala.Unit = js.native
  def unselectNode(element: js.Any): scala.Unit = js.native
  def unselectNode(element: js.Array[_]): scala.Unit = js.native
}

/* static members */
@JSGlobal("ej.DropDownTree")
@js.native
object DropDownTree extends js.Object {
  var Locale: js.Any = js.native
  var fn: ejDotWebDotAllLib.ejNs.DropDownTree = js.native
}

