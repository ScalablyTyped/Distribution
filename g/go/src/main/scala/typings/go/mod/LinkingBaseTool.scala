package typings.go.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This abstract class is the base class for the LinkingTool and RelinkingTool classes.
  * This class includes properties for defining and accessing any temporary nodes and temporary link
  * that are used during any linking operation, as well as access to the existing diagram's nodes and link
  * (if any) that are involved with the linking operation.
  */
@JSImport("go", "LinkingBaseTool")
@js.native
/**
  * Don't construct this directly -- this is an abstract class.
  */
abstract class LinkingBaseTool () extends Tool {
  
  /**
    * Make a temporary port look and act like a real one.
    * @param {Node} realnode
    * @param {GraphObject} realport
    * @param {Node} tempnode
    * @param {GraphObject} tempport
    * @param {boolean} toend
    */
  def copyPortProperties(realnode: Node, realport: GraphObject, tempnode: Node, tempport: GraphObject, toend: Boolean): Unit = js.native
  
  /**
    * Find a port with which the user could complete a valid link.
    * @param {boolean} toend true if looking for a "to" port.
    */
  def findTargetPort(toend: Boolean): GraphObject = js.native
  
  /**Gets whether the linking operation is in the forwards direction, connecting from the "From" port to the "To" port.*/
  var isForwards: Boolean = js.native
  
  /**
    * This predicate is true if both argument ports are in the same Node.
    * @param {GraphObject} fromport
    * @param {GraphObject} toport
    */
  def isInSameNode(fromport: GraphObject, toport: GraphObject): Boolean = js.native
  
  /**
    * This predicate is true if there is a link in the diagram going from the given port to the given port
    * @param {GraphObject} fromport
    * @param {GraphObject} toport.
    */
  def isLinked(fromport: GraphObject, toport: GraphObject): Boolean = js.native
  
  /**Gets or sets whether it is valid to have partly or completely unconnected links.*/
  var isUnconnectedLinkValid: Boolean = js.native
  
  /**
    * Checks whether a proposed link would be valid according to Diagram.validCycle.
    * This does not distinguish between different ports on a node, so this method does not need to take port arguments.
    * This is called by isValidLink.
    * @param {Node} from
    * @param {Node} to
    * @param {Link} ignore may be null; this is useful during relinking to ignore the originalLink
    * @return {boolean}
    */
  def isValidCycle(from: Node, to: Node, ignore: Link): Boolean = js.native
  
  /**
    * This predicate is true if it is permissible to connect a link from a given node/port.
    * @param {Node} fromnode
    * @param {GraphObject} fromport
    * False if the node is in a Layer that does not Layer.allowLink.
    * False if the port's GraphObject.fromLinkable is either false or null.
    * False if the number of links connected to the port would exceed the port's GraphObject.fromMaxLinks.
    * Otherwise true.
    */
  def isValidFrom(fromnode: Node, fromport: GraphObject): Boolean = js.native
  
  /**
    * This predicate should be true when it is logically valid to connect a new link from one node/port to another node/port.
    * @param {Node} fromnode the "from" Node.
    * @param {GraphObject} fromport the "from" GraphObject port.
    * @param {Node} tonode the "to" Node.
    * @param {GraphObject} toport the "to" GraphObject port.
    * False if .isValidFrom is false for the "from" node/port.
    * False if .isValidTo is false for the "to" node/port.
    * False if .isInSameNode is true unless GraphObject.fromLinkableSelfNode
    * and GraphObject.toLinkableSelfNode are true for the two ports.
    * False if .isLinked is true unless GraphObject.fromLinkableDuplicates
    * and GraphObject.toLinkableDuplicates are true for the two ports.
    * False if trying to link to the link's own label node(s).
    * If .linkValidation is a predicate and if it returns false, this predicate returns false.
    * Otherwise this predicate is true.
    */
  def isValidLink(fromnode: Node, fromport: GraphObject, tonode: Node, toport: GraphObject): Boolean = js.native
  
  /**
    * This predicate is true if it is permissible to connect a link to a given node/port.
    * @param {Node} tonode
    * @param {GraphObject} toport
    * False if the node is in a Layer that does not Layer.allowLink.
    * False if the port's GraphObject.toLinkable is either false or null.
    * False if the number of links connected from the port would exceed the port's GraphObject.toMaxLinks.
    * Otherwise true.
    */
  def isValidTo(tonode: Node, toport: GraphObject): Boolean = js.native
  
  /**Gets or sets a predicate that determines whether or not a new link between two ports would be valid.*/
  def linkValidation(fromNode: Node, fromPort: GraphObject, toNode: Node, toPort: GraphObject, link: Link): Boolean = js.native
  
  /**Gets or sets the original Node from which the new link is being drawn or from which the .originalLink was connected when being relinked.*/
  var originalFromNode: Node = js.native
  
  /**Gets or sets the GraphObject that is the port in the .originalFromNode.*/
  var originalFromPort: GraphObject = js.native
  
  /**Gets or sets the original Link being reconnected by the RelinkingTool.*/
  var originalLink: Link = js.native
  
  /**Gets or sets the original Node to which the new link is being drawn or to which the .originalLink was connected when being relinked.*/
  var originalToNode: Node = js.native
  
  /**Gets or sets the GraphObject that is the port in the .originalToNode.*/
  var originalToPort: GraphObject = js.native
  
  /**Gets or sets the distance at which link snapping occurs.*/
  var portGravity: Double = js.native
  
  /**Gets or sets a function that is called as the tool targets the nearest valid port.*/
  def portTargeted(realNode: Node, realPort: GraphObject, tempNode: Node, tempPort: GraphObject, toend: Boolean): Unit = js.native
  
  /**
    * Reset a temporary port's properties to neutral values when there is no target port.
    * @param {Node} tempnode
    * @param {GraphObject} tempport
    * @param {boolean} toend
    */
  def setNoTargetPortProperties(tempnode: Node, tempport: GraphObject, toend: Boolean): Unit = js.native
  
  /**Gets or sets a proposed GraphObject port for connecting a link.*/
  var targetPort: GraphObject = js.native
  
  /**Gets or sets the temporary Node at the "from" end of the .temporaryLink while the user is drawing or reconnecting a link.*/
  var temporaryFromNode: Node = js.native
  
  /**Gets or sets the GraphObject that is the port at the "from" end of the .temporaryLink while the user is drawing or reconnecting a link.*/
  var temporaryFromPort: GraphObject = js.native
  
  /**Gets or sets the temporary Link that is shown while the user is drawing or reconnecting a link.*/
  var temporaryLink: Link = js.native
  
  /**Gets or sets the temporary Node at the "to" end of the .temporaryLink while the user is drawing or reconnecting a link.*/
  var temporaryToNode: Node = js.native
  
  /**Gets or sets the GraphObject that is the port at the "to" end of the .temporaryLink while the user is drawing or reconnecting a link.*/
  var temporaryToPort: GraphObject = js.native
}
