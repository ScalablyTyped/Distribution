package typings.firebaseDatabase

import typings.firebaseDatabase.indexMod.Index
import typings.firebaseDatabase.pathMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/snap/Node", JSImport.Namespace)
@js.native
object nodeMod extends js.Object {
  @js.native
  class NamedNode protected () extends js.Object {
    def this(name: String, node: Node) = this()
    var MAX: typings.firebaseDatabase.childrenNodeMod.firebaseDatabaseDistSrcCoreSnapNodeAugmentingMod.NamedNode = js.native
    var MIN: typings.firebaseDatabase.childrenNodeMod.firebaseDatabaseDistSrcCoreSnapNodeAugmentingMod.NamedNode = js.native
    var name: String = js.native
    var node: Node = js.native
  }
  
  @js.native
  trait Node extends js.Object {
    /**
      * @param {!Node} other Another node
      * @return {!number} -1 for less than, 0 for equal, 1 for greater than other
      */
    def compareTo(other: Node): Double = js.native
    /**
      * @param {!Node} other
      * @return {boolean} Whether or not this snapshot equals other
      */
    def equals(other: Node): Boolean = js.native
    /**
      * Calls action for each child.
      * @param {!Index} index
      * @param {function(string, !Node)} action Action to be called for
      * each child.  It's passed the child name and the child node.
      * @return {*} The first truthy value return by action, or the last falsey one
      */
    def forEachChild(index: Index, action: js.Function2[/* a */ String, /* b */ this.type, Unit]): js.Any = js.native
    /**
      * Returns a child by path, or null if it doesn't exist.
      * @param {!Path} path The path of the child to retrieve.
      * @return {!Node} The retrieved child or an empty node.
      */
    def getChild(path: Path): Node = js.native
    /**
      * Returns the specified immediate child, or null if it doesn't exist.
      * @param {string} childName The name of the child to retrieve.
      * @return {!Node} The retrieved child, or an empty node.
      */
    def getImmediateChild(childName: String): Node = js.native
    /**
      * Returns the name of the child immediately prior to the specified childNode, or null.
      * @param {!string} childName The name of the child to find the predecessor of.
      * @param {!Node} childNode The node to find the predecessor of.
      * @param {!Index} index The index to use to determine the predecessor
      * @return {?string} The name of the predecessor child, or null if childNode is the first child.
      */
    def getPredecessorChildName(childName: String, childNode: Node, index: Index): String | Null = js.native
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
    def hasChild(childName: String): Boolean = js.native
    /**
      * @return {string} hash representing the node contents.
      */
    def hash(): String = js.native
    /**
      * @return {boolean} True if this node has no value or children.
      */
    def isEmpty(): Boolean = js.native
    /**
      * @param {!Index} indexDefinition
      * @return {boolean}
      */
    def isIndexed(indexDefinition: Index): Boolean = js.native
    /**
      * Whether this node is a leaf node.
      * @return {boolean} Whether this is a leaf node.
      */
    def isLeafNode(): Boolean = js.native
    /**
      * @return {number} The number of children of this node.
      */
    def numChildren(): Double = js.native
    /**
      * Returns a duplicate node, with the specified child updated.  Any value will
      * be removed.
      * @param {!Path} path The path of the child to update.
      * @param {!Node} newChildNode The new child node, which may be an empty node
      * @return {!Node} The updated node.
      */
    def updateChild(path: Path, newChildNode: Node): Node = js.native
    /**
      * Returns a duplicate node, with the specified immediate child updated.
      * Any value in the node will be removed.
      * @param {string} childName The name of the child to update.
      * @param {!Node} newChildNode The new child node
      * @return {!Node} The updated node.
      */
    def updateImmediateChild(childName: String, newChildNode: Node): Node = js.native
    /**
      * Returns a duplicate node with the new priority.
      * @param {!Node} newPriorityNode New priority to set for the node.
      * @return {!Node} Node with new priority.
      */
    def updatePriority(newPriorityNode: Node): Node = js.native
    /**
      * @param exportFormat True for export format (also wire protocol format).
      * @return Value of this node as JSON.
      */
    def `val`(): js.Any = js.native
    def `val`(exportFormat: Boolean): js.Any = js.native
    /**
      * @param {!Index} indexDefinition
      * @return {!Node} This node, with the specified index now available
      */
    def withIndex(indexDefinition: Index): Node = js.native
  }
  
  /* static members */
  @js.native
  object NamedNode extends js.Object {
    /**
      *
      * @param {!string} name
      * @param {!Node} node
      * @return {NamedNode}
      */
    def Wrap(name: String, node: Node): NamedNode = js.native
  }
  
}

