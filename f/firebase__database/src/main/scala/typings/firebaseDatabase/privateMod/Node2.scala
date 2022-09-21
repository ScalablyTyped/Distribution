package typings.firebaseDatabase.privateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Node is an interface defining the common functionality for nodes in
  * a DataSnapshot.
  *
  * @interface
  */
@js.native
trait Node2 extends StObject {
  
  /**
    * @param other - Another node
    * @returns -1 for less than, 0 for equal, 1 for greater than other
    */
  def compareTo(other: Node2): Double = js.native
  
  /**
    * @returns Whether or not this snapshot equals other
    */
  def equals(other: Node2): Boolean = js.native
  
  /**
    * Calls action for each child.
    * @param action - Action to be called for
    * each child.  It's passed the child name and the child node.
    * @returns The first truthy value return by action, or the last falsey one
    */
  def forEachChild(index: Index, action: js.Function2[/* a */ String, /* b */ this.type, Unit]): Any = js.native
  
  /**
    * Returns a child by path, or null if it doesn't exist.
    * @param path - The path of the child to retrieve.
    * @returns The retrieved child or an empty node.
    */
  def getChild(path: Path): Node2 = js.native
  
  /**
    * Returns the specified immediate child, or null if it doesn't exist.
    * @param childName - The name of the child to retrieve.
    * @returns The retrieved child, or an empty node.
    */
  def getImmediateChild(childName: String): Node2 = js.native
  
  /**
    * Returns the name of the child immediately prior to the specified childNode, or null.
    * @param childName - The name of the child to find the predecessor of.
    * @param childNode - The node to find the predecessor of.
    * @param index - The index to use to determine the predecessor
    * @returns The name of the predecessor child, or null if childNode is the first child.
    */
  def getPredecessorChildName(childName: String, childNode: Node2, index: Index): String | Null = js.native
  
  /**
    * Gets the priority of the node.
    * @returns The priority of the node.
    */
  def getPriority(): Node2 = js.native
  
  /**
    * True if the immediate child specified exists
    */
  def hasChild(childName: String): Boolean = js.native
  
  /**
    * @returns hash representing the node contents.
    */
  def hash(): String = js.native
  
  /**
    * @returns True if this node has no value or children.
    */
  def isEmpty(): Boolean = js.native
  
  def isIndexed(indexDefinition: Index): Boolean = js.native
  
  /**
    * Whether this node is a leaf node.
    * @returns Whether this is a leaf node.
    */
  def isLeafNode(): Boolean = js.native
  
  /**
    * @returns The number of children of this node.
    */
  def numChildren(): Double = js.native
  
  /**
    * Returns a duplicate node, with the specified child updated.  Any value will
    * be removed.
    * @param path - The path of the child to update.
    * @param newChildNode - The new child node, which may be an empty node
    * @returns The updated node.
    */
  def updateChild(path: Path, newChildNode: Node2): Node2 = js.native
  
  /**
    * Returns a duplicate node, with the specified immediate child updated.
    * Any value in the node will be removed.
    * @param childName - The name of the child to update.
    * @param newChildNode - The new child node
    * @returns The updated node.
    */
  def updateImmediateChild(childName: String, newChildNode: Node2): Node2 = js.native
  
  /**
    * Returns a duplicate node with the new priority.
    * @param newPriorityNode - New priority to set for the node.
    * @returns Node with new priority.
    */
  def updatePriority(newPriorityNode: Node2): Node2 = js.native
  
  /**
    * @param exportFormat - True for export format (also wire protocol format).
    * @returns Value of this node as JSON.
    */
  def `val`(): Any = js.native
  def `val`(exportFormat: Boolean): Any = js.native
  
  /**
    * @returns This node, with the specified index now available
    */
  def withIndex(indexDefinition: Index): Node2 = js.native
}
