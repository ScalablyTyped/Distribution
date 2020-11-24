package typings.go.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Node is a Part that may connect to other nodes with Links,
  * or that may be a member of a Group.
  * Group inherits from Node,
  * enabling nodes to logically contain other nodes and links.
  */
@JSImport("go", "Node")
@js.native
/**
  * Constructs an empty Node.
  * @param {EnumValue=} type if not supplied, the default Panel type is Panel.Position.
  */
class Node () extends Part {
  def this(`type`: EnumValue) = this()
  
  /**Gets or sets whether this Node is to be avoided by Links whose Link.routing is Link.AvoidsNodes.*/
  var avoidable: Boolean = js.native
  
  /**Gets or sets the Margin (or number for a uniform Margin) around this Node in which avoidable links will not be routed.*/
  var avoidableMargin: MarginLike = js.native
  
  def canAvoid(): Boolean = js.native
  
  /**
    * Hide each child node and the connecting link, and recursively collapse each child node.
    * @param {number=} level How many levels of the tree, starting at this node, to keep expanded if already expanded;
    *    the default is 1, hiding all tree children of this node.  Values less than 1 are treated as 1.
    */
  def collapseTree(): Unit = js.native
  def collapseTree(level: Double): Unit = js.native
  
  /**
    * Show each child node and the connecting link, and perhaps recursively expand their child nodes.
    * @param {number=} level How many levels of the tree should be expanded;
    *    the default is 2, showing all tree children of this node and potentially more.
    *    Values less than 2 are treated as 2.
    */
  def expandTree(): Unit = js.native
  def expandTree(level: Double): Unit = js.native
  
  /**
    * Returns an iterator over all of the Links that go from this node to another node or vice-versa, perhaps limited to a given port id on this node and a port id on the other node.
    * @param {Node} othernode
    * @param {string|null=} pid A port identifier string; if null the link's portId is ignored and all links are included in the search.
    * @param {string|null=} otherpid A port identifier string; if null the link's portId is ignored and all links are included in the search.
    */
  def findLinksBetween(othernode: Node): Iterator[Link] = js.native
  def findLinksBetween(othernode: Node, pid: js.UndefOr[scala.Nothing], otherpid: String): Iterator[Link] = js.native
  def findLinksBetween(othernode: Node, pid: String): Iterator[Link] = js.native
  def findLinksBetween(othernode: Node, pid: String, otherpid: String): Iterator[Link] = js.native
  
  /**
    * Returns an iterator over all of the Links that connect with this node in either direction, perhaps limited to the given port id on this node.
    * @param {string|null=} pid A port identifier string; if null the link's portId is ignored and all links are included in the search.
    */
  def findLinksConnected(): Iterator[Link] = js.native
  def findLinksConnected(pid: String): Iterator[Link] = js.native
  
  /**
    * Returns an iterator over all of the Links that go into this node, perhaps limited to the given port id on this node.
    * @param {string|null=} pid A port identifier string; if null the link's portId is ignored and all links are included in the search.
    */
  def findLinksInto(): Iterator[Link] = js.native
  def findLinksInto(pid: String): Iterator[Link] = js.native
  
  /**
    * Returns an iterator over all of the Links that come out of this node, perhaps limited to the given port id on this node.
    * @param {string|null=} pid A port identifier string; if null the link's portId is ignored and all links are included in the search.
    */
  def findLinksOutOf(): Iterator[Link] = js.native
  def findLinksOutOf(pid: String): Iterator[Link] = js.native
  
  /**
    * Returns an iterator over all of the Links that go from this node to another node, perhaps limited to a given port id on this node and a port id on the other node.
    * @param {Node} othernode
    * @param {string|null=} pid A port identifier string; if null the link's portId is ignored and all links are included in the search.
    * @param {string|null=} otherpid A port identifier string; if null the link's portId is ignored and all links are included in the search.
    */
  def findLinksTo(othernode: Node): Iterator[Link] = js.native
  def findLinksTo(othernode: Node, pid: js.UndefOr[scala.Nothing], otherpid: String): Iterator[Link] = js.native
  def findLinksTo(othernode: Node, pid: String): Iterator[Link] = js.native
  def findLinksTo(othernode: Node, pid: String, otherpid: String): Iterator[Link] = js.native
  
  /**
    * Returns an iterator over the Nodes that are connected with this node in either direction, perhaps limited to the given port id on this node.
    * @param {string|null=} pid A port identifier string; if null the link's portId is ignored and all links are included in the search.
    */
  def findNodesConnected(): Iterator[Node] = js.native
  def findNodesConnected(pid: String): Iterator[Node] = js.native
  
  /**
    * Returns an iterator over the Nodes that are connected with this node by links going into this node, perhaps limited to the given port id on this node.
    * @param {string|null=} pid A port identifier string; if null the link's portId is ignored and all links are included in the search.
    */
  def findNodesInto(): Iterator[Node] = js.native
  def findNodesInto(pid: String): Iterator[Node] = js.native
  
  /**
    * Returns an iterator over the Nodes that are connected with this node by links coming out of this node, perhaps limited to the given port id on this node.
    * @param {string|null=} pid A port identifier string; if null the link's portId is ignored and all links are included in the search.
    */
  def findNodesOutOf(): Iterator[Node] = js.native
  def findNodesOutOf(pid: String): Iterator[Node] = js.native
  
  /**
    * Find a GraphObject with a given GraphObject.portId.
    * @param {string} pid
    */
  def findPort(pid: String): GraphObject = js.native
  
  /**
    * Returns an Iterator for the collection of Links that connect with the immediate tree children of this node.
    */
  def findTreeChildrenLinks(): Iterator[Link] = js.native
  
  /**
    * Returns an Iterator for the collection of Nodes that are the immediate tree children of this node.
    */
  def findTreeChildrenNodes(): Iterator[Node] = js.native
  
  /**
    * Return how deep this node is in a tree structure.
    * For tree root nodes, this returns zero.
    */
  def findTreeLevel(): Double = js.native
  
  /**
    * Returns the Link that connects with the tree parent Node of this node if the graph is tree-structured, if there is such a link and Link.isTreeLink is true.
    */
  def findTreeParentLink(): Link = js.native
  
  /**
    * Returns the Node that is the tree parent of this node if the graph is tree-structured, if there is a parent.
    */
  def findTreeParentNode(): Node = js.native
  
  /**
    * Return a collection of Parts including this Node, all of the Links going to child Nodes, and all of their tree child nodes and links.
    * @param {number=} level How many levels of the tree, starting at this node, to include;
    *    the default is Infinity, including all tree children of this node.  Values less than 1 are treated as 1.
    */
  def findTreeParts(): Set[Part] = js.native
  def findTreeParts(level: Double): Set[Part] = js.native
  
  /**
    * Return the Node that is at the root of the tree that this node is in, perhaps this node itself.
    */
  def findTreeRoot(): Node = js.native
  
    // undocumented
  def findVisibleNode(): Node = js.native
  
    // undocumented
  def getAvoidableRect(result: Rect): Rect = js.native
  
    // undocumented
  def invalidateConnectedLinks(): Unit = js.native
  
    // undocumented
  def invalidateLinkBundle(other: Node): Unit = js.native
  def invalidateLinkBundle(other: Node, thisportid: js.UndefOr[scala.Nothing], otherportid: String): Unit = js.native
  def invalidateLinkBundle(other: Node, thisportid: String): Unit = js.native
  def invalidateLinkBundle(other: Node, thisportid: String, otherportid: String): Unit = js.native
  
  /**
    * This predicate is true if this node is a child of the given Node, perhaps indirectly as a descendant.
    * @param {Node} node the Node that might be a parent or ancestor of this node.
    */
  def isInTreeOf(node: Node): Boolean = js.native
  
  /**This read-only property is true when this Node is a label node for a Link.*/
  var isLinkLabel: Boolean = js.native
  
  /**Gets or sets whether the subtree graph starting at this node is expanded.*/
  var isTreeExpanded: Boolean = js.native
  
  /**Gets whether this node has no tree children.*/
  var isTreeLeaf: Boolean = js.native
  
  /**Gets or sets the Link for which this Node is acting as a smart label.*/
  var labeledLink: Link = js.native
  
  /**Gets or sets the function that is called after a Link has been connected with this Node.*/
  def linkConnected(a: Node, b: Link, c: GraphObject): Unit = js.native
  
  /**Gets or sets the function that is called after a Link has been disconnected from this Node.*/
  def linkDisconnected(a: Node, b: Link, c: GraphObject): Unit = js.native
  
  /**Gets or sets a predicate that determines whether or not a Link may be connected with this node; any of the arguments may be null.*/
  def linkValidation(from: Node, fromPort: GraphObject, to: Node, toPort: GraphObject, link: Link): Boolean = js.native
  
  /**This read-only property returns an iterator over all of the Links that are connected with this node.*/
  var linksConnected: Iterator[Link] = js.native
  
  /**This read-only property returns the primary GraphObject representing a port in this node.*/
  var port: GraphObject = js.native
  
  /**Gets or sets how link points are computed when the port spot is a "side" spot.*/
  var portSpreading: EnumValue = js.native
  
  /**This read-only property returns an iterator over all of the GraphObjects in this node that act as ports.*/
  var ports: Iterator[GraphObject] = js.native
  
  /**Gets or sets the function that is called when .isTreeExpanded has changed value.*/
  def treeExpandedChanged(node: Node): Unit = js.native
  
  /**Gets or sets whether the subtree graph starting at this node had been collapsed by a call to .expandTree on the parent node.*/
  var wasTreeExpanded: Boolean = js.native
}
/* static members */
@JSImport("go", "Node")
@js.native
object Node extends js.Object {
  
  /**This value for GraphObject.fromEndSegmentDirection and GraphObject.toEndSegmentDirection indicates that the link's end segment angle stays the same even if the node is rotated.*/
  var DirectionAbsolute: EnumValue = js.native
  
  /**This value for Link.fromEndSegmentDirection and Link.toEndSegmentDirection indicates that the real value is inherited from the corresponding connected port.*/
  var DirectionDefault: EnumValue = js.native
  
  /**This value for GraphObject.fromEndSegmentDirection and GraphObject.toEndSegmentDirection indicates that the link's end segment angle is rotated to match the node's angle.*/
  var DirectionRotatedNode: EnumValue = js.native
  
  /**This value for GraphObject.fromEndSegmentDirection and GraphObject.toEndSegmentDirection indicates that the link's end segment angle is rotated to match the node's angle, but only in increments of 90 degrees.*/
  var DirectionRotatedNodeOrthogonal: EnumValue = js.native
  
  /**This value for Node.portSpreading indicates that links connecting with a port should be distributed evenly along the side(s) indicated by a Spot that is a "side" Spot.*/
  var SpreadingEvenly: EnumValue = js.native
  
  /**This value for Node.portSpreading indicates that links connecting with a port should connect at a single point on the side(s) indicated by a Spot that is a "side" Spot.*/
  var SpreadingNone: EnumValue = js.native
  
  /**This value for Node.portSpreading indicates that links connecting with a port should be packed together based on the link's shape's width on the side(s) indicated by a Spot that is a "side" Spot.*/
  var SpreadingPacked: EnumValue = js.native
}
