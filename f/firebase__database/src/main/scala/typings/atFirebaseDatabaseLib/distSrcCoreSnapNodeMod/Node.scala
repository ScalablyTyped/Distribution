package typings
package atFirebaseDatabaseLib.distSrcCoreSnapNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Node extends js.Object {
  /**
    * @param {!Node} other Another node
    * @return {!number} -1 for less than, 0 for equal, 1 for greater than other
    */
  def compareTo(other: Node): scala.Double = js.native
  /**
    * @param {!Node} other
    * @return {boolean} Whether or not this snapshot equals other
    */
  def equals(other: Node): scala.Boolean = js.native
  /**
    * Calls action for each child.
    * @param {!Index} index
    * @param {function(string, !Node)} action Action to be called for
    * each child.  It's passed the child name and the child node.
    * @return {*} The first truthy value return by action, or the last falsey one
    */
  def forEachChild(
    index: atFirebaseDatabaseLib.distSrcCoreSnapIndexesIndexMod.Index,
    action: js.Function2[/* a */ java.lang.String, /* b */ this.type, scala.Unit]
  ): js.Any = js.native
  /**
    * Returns a child by path, or null if it doesn't exist.
    * @param {!Path} path The path of the child to retrieve.
    * @return {!Node} The retrieved child or an empty node.
    */
  def getChild(path: atFirebaseDatabaseLib.distSrcCoreUtilPathMod.Path): Node = js.native
  /**
    * Returns the specified immediate child, or null if it doesn't exist.
    * @param {string} childName The name of the child to retrieve.
    * @return {!Node} The retrieved child, or an empty node.
    */
  def getImmediateChild(childName: java.lang.String): Node = js.native
  /**
    * Returns the name of the child immediately prior to the specified childNode, or null.
    * @param {!string} childName The name of the child to find the predecessor of.
    * @param {!Node} childNode The node to find the predecessor of.
    * @param {!Index} index The index to use to determine the predecessor
    * @return {?string} The name of the predecessor child, or null if childNode is the first child.
    */
  def getPredecessorChildName(
    childName: java.lang.String,
    childNode: Node,
    index: atFirebaseDatabaseLib.distSrcCoreSnapIndexesIndexMod.Index
  ): java.lang.String | scala.Null = js.native
  /**
    * Gets the priority of the node.
    * @return {!Node} The priority of the node.
    */
  def getPriority(): Node = js.native
  /**
    * True if the immediate child specified exists
    * @param {!string} childName
    * @return {boolean}
    */
  def hasChild(childName: java.lang.String): scala.Boolean = js.native
  /**
    * @return {string} hash representing the node contents.
    */
  def hash(): java.lang.String = js.native
  /**
    * @return {boolean} True if this node has no value or children.
    */
  def isEmpty(): scala.Boolean = js.native
  /**
    * @param {!Index} indexDefinition
    * @return {boolean}
    */
  def isIndexed(indexDefinition: atFirebaseDatabaseLib.distSrcCoreSnapIndexesIndexMod.Index): scala.Boolean = js.native
  /**
    * Whether this node is a leaf node.
    * @return {boolean} Whether this is a leaf node.
    */
  def isLeafNode(): scala.Boolean = js.native
  /**
    * @return {number} The number of children of this node.
    */
  def numChildren(): scala.Double = js.native
  /**
    * Returns a duplicate node, with the specified child updated.  Any value will
    * be removed.
    * @param {!Path} path The path of the child to update.
    * @param {!Node} newChildNode The new child node, which may be an empty node
    * @return {!Node} The updated node.
    */
  def updateChild(path: atFirebaseDatabaseLib.distSrcCoreUtilPathMod.Path, newChildNode: Node): Node = js.native
  /**
    * Returns a duplicate node, with the specified immediate child updated.
    * Any value in the node will be removed.
    * @param {string} childName The name of the child to update.
    * @param {!Node} newChildNode The new child node
    * @return {!Node} The updated node.
    */
  def updateImmediateChild(childName: java.lang.String, newChildNode: Node): Node = js.native
  /**
    * Returns a duplicate node with the new priority.
    * @param {!Node} newPriorityNode New priority to set for the node.
    * @return {!Node} Node with new priority.
    */
  def updatePriority(newPriorityNode: Node): Node = js.native
  /**
    * @param {boolean=} exportFormat True for export format (also wire protocol format).
    * @return {*} Value of this node as JSON.
    */
  def `val`(): js.Object = js.native
  def `val`(exportFormat: scala.Boolean): js.Object = js.native
  /**
    * @param {!Index} indexDefinition
    * @return {!Node} This node, with the specified index now available
    */
  def withIndex(indexDefinition: atFirebaseDatabaseLib.distSrcCoreSnapIndexesIndexMod.Index): Node = js.native
}

