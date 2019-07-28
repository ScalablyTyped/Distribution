package typings.go.goMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * TreeModels support tree-structured graphs of nodes and links.
  * Each node can have at most one "tree parent"; cycles are not permitted.
  * The reference to the parent node's key is a property of the child node data.
  */
@JSImport("go", "TreeModel")
@js.native
/**
  * This constructs an empty TreeModel unless one provides arguments as the initial data array values for the Model.nodeDataArray property.
  * @param {Array<Object>=} nodedataarray an optional Array containing JavaScript objects to be represented by Nodes.
  */
class TreeModel () extends Model {
  def this(nodedataarray: js.Array[js.Object]) = this()
  /**
    * Gets or sets the name of the property on node data that specifies
    * the string or number key of the node data that acts as the "parent" for this "child" node data,
    * or a function that takes a node data object and returns that parent key;
    * the default value is the name 'parent'.
    * The value must not be null nor an empty string.
    */
  var nodeParentKeyProperty: PropertyAccessor = js.native
  /**
    * Gets or sets the name of the data property that returns a string describing that node data's parent link's category,
    * or a function that takes a node data object and returns its parent link's category string;
    * the default value is the name 'parentLinkCategory'.
    * This is used by the diagram to distinguish between different kinds of links.
    * The name must not be null.
    */
  var parentLinkCategoryProperty: PropertyAccessor = js.native
  /**
    * If there is a parent node for the given node data, return the parent's key.
    * @param {Object} nodedata a JavaScript object representing a node.
    */
  def getParentKeyForNodeData(nodedata: js.Object): Key = js.native
  /**
    * Find the category for the parent link of a given child node data, a string naming the link template
    * that the Diagram should use to represent the link.
    * @param {Object} childdata a JavaScript object representing a node data.
    */
  def getParentLinkCategoryForNodeData(childdata: js.Object): String = js.native
  /**
    * Change the parent node for the given node data, given a key for the new parent, or undefined if there should be no parent.
    * @param {Object} nodedata a JavaScript object representing a node.
    * @param {string|number|undefined} key This may be undefined if there should be no parent node data.
    */
  def setParentKeyForNodeData(nodedata: js.Object, key: Key): Unit = js.native
  /**
    * Change the category for the parent link of a given child node data, a string naming the link template
    * that the Diagram should use to represent the link.
    * Changing the link template will cause any existing Link
    * to be removed from the Diagram and replaced with a new Link
    * created by copying the new link template and applying any data-bindings.
    * @param {Object} childdata a JavaScript object representing a node data.
    * @param {string} cat Must not be null.
    */
  def setParentLinkCategoryForNodeData(childdata: js.Object, cat: String): Unit = js.native
}

