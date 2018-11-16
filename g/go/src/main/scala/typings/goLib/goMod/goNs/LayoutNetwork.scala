package typings
package goLib.goMod.goNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * This provides an abstract view of a diagram as a
     * network (graph) of vertexes and directed edges.
     * The network contains vertexes and edges corresponding to Nodes and Links.
     */
@js.native
trait LayoutNetwork extends js.Object {
  /**Gets a collection of all of the LayoutEdges in this network.*/
  var edges: Set[LayoutEdge] = js.native
  /**This read-only property returns the Layout that uses this network of LayoutVertexes and LayoutEdges.*/
  var layout: Layout = js.native
  /**Gets a collection of all of the LayoutVertexes in this network.*/
  var vertexes: Set[LayoutVertex] = js.native
  /**
          * Adds a LayoutEdge to the network.
          * @param {LayoutEdge} edge
          */
  def addEdge(edge: LayoutEdge): scala.Unit = js.native
  /**
          * This convenience method makes sure there is a LayoutEdge in this network corresponding to a Link.
          * @param {Link} link
          * @param {Link} link
          */
  def addLink(link: Link): LayoutEdge = js.native
  /**
          * This convenience method makes sure there is a LayoutVertex in this network corresponding to a Node.
          * @param {Node} node
          */
  def addNode(node: Node): LayoutVertex = js.native
  /**
          * Creates a network of LayoutVertexes and LayoutEdges corresponding to the given Nodes and Links.
          * @param {Iterable<Part>} parts A collection of Nodes or Links.
          * @param {boolean=} toplevelonly whether to skip Parts in the given collection that are contained by Groups; default is false.
          * @param {function(Part):boolean|null=} pred optional predicate to apply to each Part --
          *        if it returns false do not include Vertex or Edge in the network for that Part;
          *        default ignores link label nodes or links connecting with them
          */
  def addParts(parts: Iterable[Part]): scala.Unit = js.native
  /**
          * Creates a network of LayoutVertexes and LayoutEdges corresponding to the given Nodes and Links.
          * @param {Iterable<Part>} parts A collection of Nodes or Links.
          * @param {boolean=} toplevelonly whether to skip Parts in the given collection that are contained by Groups; default is false.
          * @param {function(Part):boolean|null=} pred optional predicate to apply to each Part --
          *        if it returns false do not include Vertex or Edge in the network for that Part;
          *        default ignores link label nodes or links connecting with them
          */
  def addParts(parts: Iterable[Part], toplevelonly: scala.Boolean): scala.Unit = js.native
  /**
          * Creates a network of LayoutVertexes and LayoutEdges corresponding to the given Nodes and Links.
          * @param {Iterable<Part>} parts A collection of Nodes or Links.
          * @param {boolean=} toplevelonly whether to skip Parts in the given collection that are contained by Groups; default is false.
          * @param {function(Part):boolean|null=} pred optional predicate to apply to each Part --
          *        if it returns false do not include Vertex or Edge in the network for that Part;
          *        default ignores link label nodes or links connecting with them
          */
  def addParts(
    parts: Iterable[Part],
    toplevelonly: scala.Boolean,
    pred: js.Function1[/* part */ Part, scala.Boolean]
  ): scala.Unit = js.native
  /**
          * Adds a LayoutVertex to the network.
          * @param {LayoutVertex} vertex
          */
  def addVertex(vertex: LayoutVertex): scala.Unit = js.native
  /**
          * Allocate a new instance of LayoutEdge.
          */
  def createEdge(): LayoutEdge = js.native
  /**
          * Allocate a new instance of LayoutVertex.
          */
  def createVertex(): LayoutVertex = js.native
  /**
          * Deletes all vertexes and edges that have no Part associated with them.
          */
  def deleteArtificialVertexes(): scala.Unit = js.native
  /**
          * Removes a LayoutEdge from the network.
          * @param {LayoutEdge} edge
          */
  def deleteEdge(edge: LayoutEdge): scala.Unit = js.native
  /**
          * This convenience method deletes from this network any LayoutEdge corresponding to a Link.
          * @param {Link} link
          */
  def deleteLink(link: Link): scala.Unit = js.native
  /**
          * This convenience method deletes any LayoutVertex corresponding to a Node.
          * @param {Node} node
          */
  def deleteNode(node: Node): scala.Unit = js.native
  /**
          * Deletes all LayoutEdges whose "to vertex" and "from vertex" are the same vertex.
          */
  def deleteSelfEdges(): scala.Unit = js.native
  /**
          * Removes a LayoutVertex from the network.
          * @param {LayoutVertex} vertex
          */
  def deleteVertex(vertex: LayoutVertex): scala.Unit = js.native
  /**
          * Retrieve all of the Nodes and Links from the LayoutVertexes and LayoutEdges that are in this network.
          */
  def findAllParts(): Set[Part] = js.native
  /**
          * Returns the LayoutEdge that was constructed for the Link.
          * @param {Link} link
          */
  def findEdge(link: Link): LayoutEdge = js.native
  /**
          * Returns the LayoutVertex that was constructed for the Node.
          * @param {Node} node
          */
  def findVertex(node: Node): LayoutVertex = js.native
  /**
          * Links two vertexes already in the network and returns the created LayoutEdge.
          * @param {LayoutVertex} fromVertex
          * @param {LayoutVertex} toVertex
          * @param {Link} link
          */
  def linkVertexes(fromVertex: LayoutVertex, toVertex: LayoutVertex, link: Link): LayoutEdge = js.native
  /**
          * Reverses the direction of a LayoutEdge in the network.
          * @param {LayoutEdge} edge
          */
  def reverseEdge(edge: LayoutEdge): scala.Unit = js.native
  /**
          * Modify this network by splitting it up into separate subnetworks, each of which has all of its vertexes connected to each other, but not to any vertexes in any other subnetworks.
          */
  def splitIntoSubNetworks(): List[LayoutNetwork] = js.native
}

