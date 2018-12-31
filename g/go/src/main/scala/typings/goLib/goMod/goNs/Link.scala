package typings
package goLib.goMod.goNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Link is a Part that connects Nodes.
  * The link relationship is directional, going from Link.fromNode to Link.toNode.
  * A link can connect to a specific port element in a node, as named by the Link.fromPortId
  * and Link.toPortId properties.
  */
@js.native
trait Link extends Part {
  /**Gets or sets how the route is computed, including whether it uses the points of its old route to determine the new route.*/
  var adjusting: EnumValue = js.native
  /**Gets or sets how rounded the corners are for adjacent line segments when the .curve is .None .JumpGap, or .JumpOver and the two line segments are orthogonal to each other.*/
  var corner: scala.Double = js.native
  /**Gets or sets the way the path is generated from the route's points.*/
  var curve: EnumValue = js.native
  /**Gets or sets how far the control points are offset when the .curve is .Bezier or when there are multiple links between the same two ports.*/
  var curviness: scala.Double = js.native
  /**Gets or sets the Node that this link comes from.*/
  var fromNode: Node = js.native
  /**This read-only property returns a GraphObject that is the "from" port that this link is connected from.*/
  var fromPort: GraphObject = js.native
  /**Gets or sets the identifier of the port that this link comes from.*/
  var fromPortId: java.lang.String = js.native
  /**This read-only property returns the Geometry that is used by the .path, the link Shape based on the route points.*/
  var geometry: Geometry = js.native
  /**This read-only property is true when this Link has any label Nodes, Nodes that are owned by this Link and are arranged along its path.*/
  var isLabeledLink: scala.Boolean = js.native
  /**This read-only property true if .routing is a value that implies that the points of the route should be orthogonal, such that each point shares a common X or a common Y value with the immediately previous and next points.*/
  var isOrthogonal: scala.Boolean = js.native
  /**Gets or sets whether this Link is part of the tree for tree operations such as Node.findTreeChildrenNodes or Node.collapseTree.*/
  var isTreeLink: scala.Boolean = js.native
  /**This read-only property returns an iterator over the Nodes that act as labels on this Link.*/
  var labelNodes: Iterator[Node] = js.native
  /**This read-only property returns the angle of the path at the .midPoint.*/
  var midAngle: scala.Double = js.native
  /**This read-only property returns the point at the middle of the path.*/
  var midPoint: Point = js.native
  /**This read-only property returns the Shape representing the path of this Link.*/
  var path: Shape = js.native
  /**Gets or sets the List of Points in the route. Can also be set as an Array of numbers.*/
  var points: List[Point] = js.native
  /**This read-only property returns the number of points in the route.*/
  var pointsCount: scala.Double = js.native
  /**Gets or sets whether the user may reconnect an existing link at the "from" end.*/
  var relinkableFrom: scala.Boolean = js.native
  /**Gets or sets whether the user may reconnect an existing link at the "to" end.*/
  var relinkableTo: scala.Boolean = js.native
  /**Gets or sets whether the user may change the number of segments in this Link, if the link has straight segments.*/
  var resegmentable: scala.Boolean = js.native
  var routeBounds: Rect = js.native
  /**Gets or sets whether the link's path tries to avoid other nodes.*/
  var routing: EnumValue = js.native
  /**Gets or sets how far the control points are from the points of the route when .routing is .Orthogonal and .curve is .Bezier.*/
  var smoothness: scala.Double = js.native
  /**Gets or sets the Node that this link goes to.*/
  var toNode: Node = js.native
  /**This read-only property returns a GraphObject that is the "to" port that this link is connected to.*/
  var toPort: GraphObject = js.native
  /**Gets or sets the identifier of the port that this link goes to.*/
  var toPortId: java.lang.String = js.native
  /**
    * Add a point at the end of the route; this may only be called within an override of computePoints.
    * @param {Point} p  The new point, which should not have infinite or NaN coordinate values, and which must not be modified afterwards.
    */
  /* protected */ def addPoint(p: Point): scala.Unit = js.native
    // undocumented
  /* protected */ def addPointAt(x: scala.Double, y: scala.Double): scala.Unit = js.native
    // undocumented
  /* protected */ def arrangeBundledLinks(links: js.Array[Link], reroute: scala.Boolean): scala.Unit = js.native
  /**
    * This predicate returns true if .relinkableFrom is true, if the layer's Layer.allowRelink is true, and if the diagram's Diagram.allowRelink is true.
    */
  def canRelinkFrom(): scala.Boolean = js.native
  /**
    * This predicate returns true if .relinkableTo is true, if the layer's Layer.allowRelink is true, and if the diagram's Diagram.allowRelink is true.
    */
  def canRelinkTo(): scala.Boolean = js.native
  /**
    * Remove all of the points from this link's route; this may only be called within an override of computePoints.
    */
  /* protected */ def clearPoints(): scala.Unit = js.native
    // undocumented
  /* protected */ def computeCorner(): scala.Double = js.native
  /**
    * Returns the curve}, unless this link is supposed to pretend to be curved, as with reflexive links.
    */
  /* protected */ def computeCurve(): EnumValue = js.native
  /**
    * Returns the curviness, if it's a number,
    * or else a computed value based on how many links connect this pair of nodes/ports.
    */
  /* protected */ def computeCurviness(): scala.Double = js.native
  /**
    * Get the length of the end segment, typically a short distance, in document units.
    * For spot values that are Spot.isSide, this returns a computed value.
    * Depending on the <code>from</code> argument, this will return fromEndSegmentLength or toEndSegmentLength.
    * If the value is <code>NaN</code>, this will return the fromPort's GraphObject.fromEndSegmentLength
    * or the toPort's GraphObject.toEndSegmentLength.
    */
  /* protected */ def computeEndSegmentLength(node: Node, port: GraphObject, spot: Spot, from: scala.Boolean): scala.Double = js.native
  /**
    * Find the approximate point of the other end of the link.
    * This is useful when computing the connection point when there is no specific spot, to have an idea of which general direction the link should be going.
    * By default this will return the center of the other port.
    */
  /* protected */ def computeOtherPoint(othernode: Node, otherport: GraphObject): Point = js.native
  /**
    * The code that constructs a new route by modifying the points.
    * It is only called by updateRoute, when needed.
    */
  /* protected */ def computePoints(): scala.Boolean = js.native
    // undocumented
  /* protected */ def computeShortLength(from: scala.Boolean): scala.Double = js.native
  /**
    * Returns the expected spacing between this link and others that connect this link's fromPort and toPort.
    * This calls computeThickness and also takes any "mid label"'s breadth into account.
    */
  /* protected */ def computeSpacing(): scala.Double = js.native
  /**
    * Get the Spot that describes how the end of the link should connect with the port.
    * Depending on the <code>from</code> argument, this will return fromSpot or toSpot.
    * If the value is Spot.isDefault, this will return the fromPort's GraphObject.fromSpot
    * or the toPort's GraphObject.toSpot.
    */
  /* protected */ def computeSpot(from: scala.Boolean): Spot = js.native
  /**
    * Returns the thickness of this link.
    * By default it uses the strokeWidth of the main element, assuming it's a Shape.
    */
  /* protected */ def computeThickness(): scala.Double = js.native
  /**
    * Find the index of the segment that is closest to a given point.
    * @param {Point} p the Point, in document coordinates.
    */
  def findClosestSegment(p: Point): scala.Double = js.native
    // undocumented
  def findMidLabel(): GraphObject = js.native
  /**Gets or sets the function that is called after this Link changes which Node or port it connects from.*/
  def fromPortChanged(a: Link, b: GraphObject, c: GraphObject): scala.Unit = js.native
  /**
    * Compute the direction in which a link should go from a given connection point.
    * @param {Node} node
    * @param {GraphObject} port the GraphObject representing a port on the node.
    * @param {Point} linkpoint the connection point, in document coordinates.
    * @param {Spot} spot a Spot value describing where the link should connect.
    * @param {boolean} from true if the link is coming out of the port; false if going to the port.
    * @param {boolean} ortho whether the link should have orthogonal segments.
    * @param {Node} othernode the node at the other end of the link.
    * @param {GraphObject} otherport the GraphObject port at the other end of the link.
    */
  def getLinkDirection(
    node: Node,
    port: GraphObject,
    linkpoint: Point,
    spot: Spot,
    from: scala.Boolean,
    ortho: scala.Boolean,
    othernode: Node,
    otherport: GraphObject
  ): scala.Double = js.native
  /**
    * Compute the point on a node/port at which the route of a link should end.
    * @param {Node} node
    * @param {GraphObject} port the GraphObject representing a port on the node.
    * @param {Spot} spot a Spot value describing where the link should connect.
    * @param {boolean} from true if the link is coming out of the port; false if going to the port.
    * @param {boolean} ortho whether the link should have orthogonal segments.
    * @param {Node} othernode the node at the other end of the link.
    * @param {GraphObject} otherport the GraphObject port at the other end of the link.
    * @param {Point=} result an optional Point that is modified and returned; otherwise it allocates and returns a new Point
    */
  def getLinkPoint(
    node: Node,
    port: GraphObject,
    spot: Spot,
    from: scala.Boolean,
    ortho: scala.Boolean,
    othernode: Node,
    otherport: GraphObject
  ): Point = js.native
  def getLinkPoint(
    node: Node,
    port: GraphObject,
    spot: Spot,
    from: scala.Boolean,
    ortho: scala.Boolean,
    othernode: Node,
    otherport: GraphObject,
    result: Point
  ): Point = js.native
  /**
    * Compute the intersection point for the edge of a particular port GraphObject, given a point, when no particular spot or side has been specified.
    * @param {Node} node
    * @param {GraphObject} port the GraphObject representing a port on the node.
    * @param {Point} focus the point in document coordinates to/from which the link should point,
    *   normally the center of the port.
    * @param {Point} p often this point is far away from the node, to give a general direction,
    *   particularly an orthogonal one.
    * @param {boolean} from true if the link is coming out of the port; false if going to the port.
    * @param {Point=} result an optional Point that is modified and returned; otherwise it allocates and returns a new Point
    */
  def getLinkPointFromPoint(node: Node, port: GraphObject, focus: Point, p: Point, from: scala.Boolean): Point = js.native
  def getLinkPointFromPoint(node: Node, port: GraphObject, focus: Point, p: Point, from: scala.Boolean, result: Point): Point = js.native
  /**
    * Given a Node, return the node at the other end of this link.
    * @param {Node} node
    */
  def getOtherNode(node: Node): Node = js.native
  /**
    * Given a GraphObject that is a "port", return the port at the other end of this link.
    * @param {GraphObject} port
    */
  def getOtherPort(port: GraphObject): GraphObject = js.native
  /**
    * Gets a particular point of the route.
    * @param {number} i  The zero-based index of the desired point.
    */
  def getPoint(i: scala.Double): Point = js.native
  /**
    * Returns true if an extra or a different point is needed based on curviness.
    */
  /* protected */ def hasCurviness(): scala.Boolean = js.native
  /**
    * Insert a point at a particular position in the route, without replacing an existing point; this may only be called within an override of computePoints.
    * @param {number} i int  The zero-based index of the new point.
    * @param {Point} p  The new point, which should not have infinite or NaN coordinate values, and which must not be modified afterwards.
    */
  /* protected */ def insertPoint(i: scala.Double, p: Point): scala.Unit = js.native
    // undocumented
  /* protected */ def insertPointAt(i: scala.Double, x: scala.Double, y: scala.Double): scala.Unit = js.native
    // undocumented
  def invalidateGeometry(): scala.Unit = js.native
  /**
    * Declare that the route (the points) of this Link need to be recomputed soon.
    * This causes updateRoute to be called, which will call computePoints
    * to perform the actual determination of the route.
    */
  def invalidateRoute(): scala.Unit = js.native
  /**
    * Produce a Geometry given the points of this route,
    * depending on the value of curve and corner and perhaps other properties.
    */
  /* protected */ def makeGeometry(): Geometry = js.native
  /**
    * Remove a particular point from the route; this may only be called within an override of computePoints.
    * @param {number} i int  The zero-based index of the point to extract.
    */
  /* protected */ def removePoint(i: scala.Double): scala.Unit = js.native
  /**
    * Sets a particular point of the route; this may only be called within an override of computePoints.
    * @param {number} i int  The zero-based index of the desired point.
    * @param {Point} p  The new point, which should not have infinite or NaN coordinate values, and which must not be modified afterwards.
    */
  /* protected */ def setPoint(i: scala.Double, p: Point): scala.Unit = js.native
    // undocumented
  /* protected */ def setPointAt(i: scala.Double, x: scala.Double, y: scala.Double): scala.Unit = js.native
  /**Gets or sets the function that is called after this Link changes which Node or port it connects to.*/
  def toPortChanged(a: Link, b: GraphObject, c: GraphObject): scala.Unit = js.native
  /**
    * This method recomputes the route if the route is invalid, to make sure the points are up-to-date.
    * This method calls computePoints in order to calculate a new route.
    */
  def updateRoute(): scala.Unit = js.native
}

