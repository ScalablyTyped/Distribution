package typings.go.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Link is a Part that connects Nodes.
  * The link relationship is directional, going from Link.fromNode to Link.toNode.
  * A link can connect to a specific port element in a node, as named by the Link.fromPortId
  * and Link.toPortId properties.
  */
@JSImport("go", "Link")
@js.native
/**
  * Constructs an empty link that does not connect any nodes.
  */
class Link () extends Part {
  
  /**
    * Add a point at the end of the route; this may only be called within an override of computePoints.
    * @param {Point} p  The new point, which should not have infinite or NaN coordinate values, and which must not be modified afterwards.
    */
  /* protected */ def addPoint(p: Point): Unit = js.native
  
  // undocumented
  /* protected */ def addPointAt(x: Double, y: Double): Unit = js.native
  
  /**Gets or sets how the route is computed, including whether it uses the points of its old route to determine the new route.*/
  var adjusting: EnumValue = js.native
  
  // undocumented
  /* protected */ def arrangeBundledLinks(links: js.Array[Link], reroute: Boolean): Unit = js.native
  
  /**
    * This predicate returns true if .relinkableFrom is true, if the layer's Layer.allowRelink is true, and if the diagram's Diagram.allowRelink is true.
    */
  def canRelinkFrom(): Boolean = js.native
  
  /**
    * This predicate returns true if .relinkableTo is true, if the layer's Layer.allowRelink is true, and if the diagram's Diagram.allowRelink is true.
    */
  def canRelinkTo(): Boolean = js.native
  
  /**
    * Remove all of the points from this link's route; this may only be called within an override of computePoints.
    */
  /* protected */ def clearPoints(): Unit = js.native
  
  // undocumented
  /* protected */ def computeCorner(): Double = js.native
  
  /**
    * Returns the curve}, unless this link is supposed to pretend to be curved, as with reflexive links.
    */
  /* protected */ def computeCurve(): EnumValue = js.native
  
  /**
    * Returns the curviness, if it's a number,
    * or else a computed value based on how many links connect this pair of nodes/ports.
    */
  /* protected */ def computeCurviness(): Double = js.native
  
  /**
    * Get the length of the end segment, typically a short distance, in document units.
    * For spot values that are Spot.isSide, this returns a computed value.
    * Depending on the <code>from</code> argument, this will return fromEndSegmentLength or toEndSegmentLength.
    * If the value is <code>NaN</code>, this will return the fromPort's GraphObject.fromEndSegmentLength
    * or the toPort's GraphObject.toEndSegmentLength.
    */
  /* protected */ def computeEndSegmentLength(node: Node, port: GraphObject, spot: Spot, from: Boolean): Double = js.native
  
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
  /* protected */ def computePoints(): Boolean = js.native
  
  // undocumented
  /* protected */ def computeShortLength(from: Boolean): Double = js.native
  
  /**
    * Returns the expected spacing between this link and others that connect this link's fromPort and toPort.
    * This calls computeThickness and also takes any "mid label"'s breadth into account.
    */
  /* protected */ def computeSpacing(): Double = js.native
  
  /**
    * Get the Spot that describes how the end of the link should connect with the port.
    * Depending on the <code>from</code> argument, this will return fromSpot or toSpot.
    * If the value is Spot.isDefault, this will return the fromPort's GraphObject.fromSpot
    * or the toPort's GraphObject.toSpot.
    */
  /* protected */ def computeSpot(from: Boolean): Spot = js.native
  
  /**
    * Returns the thickness of this link.
    * By default it uses the strokeWidth of the main element, assuming it's a Shape.
    */
  /* protected */ def computeThickness(): Double = js.native
  
  /**Gets or sets how rounded the corners are for adjacent line segments when the .curve is .None .JumpGap, or .JumpOver and the two line segments are orthogonal to each other.*/
  var corner: Double = js.native
  
  /**Gets or sets the way the path is generated from the route's points.*/
  var curve: EnumValue = js.native
  
  /**Gets or sets how far the control points are offset when the .curve is .Bezier or when there are multiple links between the same two ports.*/
  var curviness: Double = js.native
  
  /**
    * Find the index of the segment that is closest to a given point.
    * @param {Point} p the Point, in document coordinates.
    */
  def findClosestSegment(p: Point): Double = js.native
  
  // undocumented
  def findMidLabel(): GraphObject = js.native
  
  /**Gets or sets the Node that this link comes from.*/
  var fromNode: Node = js.native
  
  /**This read-only property returns a GraphObject that is the "from" port that this link is connected from.*/
  var fromPort: GraphObject = js.native
  
  /**Gets or sets the function that is called after this Link changes which Node or port it connects from.*/
  def fromPortChanged(a: Link, b: GraphObject, c: GraphObject): Unit = js.native
  
  /**Gets or sets the identifier of the port that this link comes from.*/
  var fromPortId: String = js.native
  
  /**This read-only property returns the Geometry that is used by the .path, the link Shape based on the route points.*/
  var geometry: Geometry = js.native
  
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
    from: Boolean,
    ortho: Boolean,
    othernode: Node,
    otherport: GraphObject
  ): Double = js.native
  
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
    from: Boolean,
    ortho: Boolean,
    othernode: Node,
    otherport: GraphObject
  ): Point = js.native
  def getLinkPoint(
    node: Node,
    port: GraphObject,
    spot: Spot,
    from: Boolean,
    ortho: Boolean,
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
  def getLinkPointFromPoint(node: Node, port: GraphObject, focus: Point, p: Point, from: Boolean): Point = js.native
  def getLinkPointFromPoint(node: Node, port: GraphObject, focus: Point, p: Point, from: Boolean, result: Point): Point = js.native
  
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
  def getPoint(i: Double): Point = js.native
  
  /**
    * Returns true if an extra or a different point is needed based on curviness.
    */
  /* protected */ def hasCurviness(): Boolean = js.native
  
  /**
    * Insert a point at a particular position in the route, without replacing an existing point; this may only be called within an override of computePoints.
    * @param {number} i int  The zero-based index of the new point.
    * @param {Point} p  The new point, which should not have infinite or NaN coordinate values, and which must not be modified afterwards.
    */
  /* protected */ def insertPoint(i: Double, p: Point): Unit = js.native
  
  // undocumented
  /* protected */ def insertPointAt(i: Double, x: Double, y: Double): Unit = js.native
  
  // undocumented
  def invalidateGeometry(): Unit = js.native
  
  /**
    * Declare that the route (the points) of this Link need to be recomputed soon.
    * This causes updateRoute to be called, which will call computePoints
    * to perform the actual determination of the route.
    */
  def invalidateRoute(): Unit = js.native
  
  /**This read-only property is true when this Link has any label Nodes, Nodes that are owned by this Link and are arranged along its path.*/
  var isLabeledLink: Boolean = js.native
  
  /**This read-only property true if .routing is a value that implies that the points of the route should be orthogonal, such that each point shares a common X or a common Y value with the immediately previous and next points.*/
  var isOrthogonal: Boolean = js.native
  
  /**Gets or sets whether this Link is part of the tree for tree operations such as Node.findTreeChildrenNodes or Node.collapseTree.*/
  var isTreeLink: Boolean = js.native
  
  /**This read-only property returns an iterator over the Nodes that act as labels on this Link.*/
  var labelNodes: Iterator[Node] = js.native
  
  /**
    * Produce a Geometry given the points of this route,
    * depending on the value of curve and corner and perhaps other properties.
    */
  /* protected */ def makeGeometry(): Geometry = js.native
  
  /**This read-only property returns the angle of the path at the .midPoint.*/
  var midAngle: Double = js.native
  
  /**This read-only property returns the point at the middle of the path.*/
  var midPoint: Point = js.native
  
  /**This read-only property returns the Shape representing the path of this Link.*/
  var path: Shape = js.native
  
  /**Gets or sets the List of Points in the route. Can also be set as an Array of numbers.*/
  var points: List[Point] = js.native
  
  /**This read-only property returns the number of points in the route.*/
  var pointsCount: Double = js.native
  
  /**Gets or sets whether the user may reconnect an existing link at the "from" end.*/
  var relinkableFrom: Boolean = js.native
  
  /**Gets or sets whether the user may reconnect an existing link at the "to" end.*/
  var relinkableTo: Boolean = js.native
  
  /**
    * Remove a particular point from the route; this may only be called within an override of computePoints.
    * @param {number} i int  The zero-based index of the point to extract.
    */
  /* protected */ def removePoint(i: Double): Unit = js.native
  
  /**Gets or sets whether the user may change the number of segments in this Link, if the link has straight segments.*/
  var resegmentable: Boolean = js.native
  
  var routeBounds: Rect = js.native
  
  /**Gets or sets whether the link's path tries to avoid other nodes.*/
  var routing: EnumValue = js.native
  
  /**
    * Sets a particular point of the route; this may only be called within an override of computePoints.
    * @param {number} i int  The zero-based index of the desired point.
    * @param {Point} p  The new point, which should not have infinite or NaN coordinate values, and which must not be modified afterwards.
    */
  /* protected */ def setPoint(i: Double, p: Point): Unit = js.native
  
  // undocumented
  /* protected */ def setPointAt(i: Double, x: Double, y: Double): Unit = js.native
  
  /**Gets or sets how far the control points are from the points of the route when .routing is .Orthogonal and .curve is .Bezier.*/
  var smoothness: Double = js.native
  
  /**Gets or sets the Node that this link goes to.*/
  var toNode: Node = js.native
  
  /**This read-only property returns a GraphObject that is the "to" port that this link is connected to.*/
  var toPort: GraphObject = js.native
  
  /**Gets or sets the function that is called after this Link changes which Node or port it connects to.*/
  def toPortChanged(a: Link, b: GraphObject, c: GraphObject): Unit = js.native
  
  /**Gets or sets the identifier of the port that this link goes to.*/
  var toPortId: String = js.native
  
  /**
    * This method recomputes the route if the route is invalid, to make sure the points are up-to-date.
    * This method calls computePoints in order to calculate a new route.
    */
  def updateRoute(): Unit = js.native
}
object Link {
  
  @JSImport("go", "Link")
  @js.native
  val ^ : js.Any = js.native
  
  /**Used as a value for Link.routing: each segment is horizontal or vertical, but the route tries to avoid crossing over nodes.*/
  /* static member */
  @JSImport("go", "Link.AvoidsNodes")
  @js.native
  def AvoidsNodes: EnumValue = js.native
  inline def AvoidsNodes_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AvoidsNodes")(x.asInstanceOf[js.Any])
  
  /**Used as a value for Link.curve, to indicate that the link path uses Bezier curve segments.*/
  /* static member */
  @JSImport("go", "Link.Bezier")
  @js.native
  def Bezier: EnumValue = js.native
  inline def Bezier_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Bezier")(x.asInstanceOf[js.Any])
  
  /**Used as a value for Link.adjusting, to indicate that the link route computation should keep the intermediate points of the previous route, just modifying the first and/or last points; if the routing is orthogonal, it will only modify the first two and/or last two points.*/
  /* static member */
  @JSImport("go", "Link.End")
  @js.native
  def End: EnumValue = js.native
  inline def End_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("End")(x.asInstanceOf[js.Any])
  
  /**Used as a value for Link.curve, to indicate that orthogonal link segments will be discontinuous where they cross over other orthogonal link segments that have a Link.curve or JumpOver or JumpGap.*/
  /* static member */
  @JSImport("go", "Link.JumpGap")
  @js.native
  def JumpGap: EnumValue = js.native
  inline def JumpGap_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JumpGap")(x.asInstanceOf[js.Any])
  
  /**Used as a value for Link.curve, to indicate that orthogonal link segments will veer around where they cross over other orthogonal link segments that have a Link.curve or JumpOver or JumpGap.*/
  /* static member */
  @JSImport("go", "Link.JumpOver")
  @js.native
  def JumpOver: EnumValue = js.native
  inline def JumpOver_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JumpOver")(x.asInstanceOf[js.Any])
  
  /**This is the default value for Link.curve and Link.adjusting, to indicate that the path geometry consists of straight line segments and to indicate that the link route computation does not depend on any previous route points; this can also be used as a value for GraphObject.segmentOrientation to indicate that the object is never rotated along the link route -- its angle is unchanged.*/
  /* static member */
  @JSImport("go", "Link.None")
  @js.native
  def None: EnumValue = js.native
  inline def None_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("None")(x.asInstanceOf[js.Any])
  
  /**Used as the default value for Link.routing: the route goes fairly straight between ports.*/
  /* static member */
  @JSImport("go", "Link.Normal")
  @js.native
  def Normal: EnumValue = js.native
  inline def Normal_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Normal")(x.asInstanceOf[js.Any])
  
  /**This value for GraphObject.segmentOrientation results in the GraphObject turned to have the same angle as the route: the GraphObject's angle is always the same as the angle of the link's route at the segment where the GraphObject is attached; use this orientation for arrow heads.*/
  /* static member */
  @JSImport("go", "Link.OrientAlong")
  @js.native
  def OrientAlong: EnumValue = js.native
  inline def OrientAlong_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OrientAlong")(x.asInstanceOf[js.Any])
  
  /**This value for GraphObject.segmentOrientation results in the GraphObject being turned counter-clockwise to be perpendicular to the route: the GraphObject's angle is always 90 degrees less than the angle of the link's route at the segment where the GraphObject is attached.*/
  /* static member */
  @JSImport("go", "Link.OrientMinus90")
  @js.native
  def OrientMinus90: EnumValue = js.native
  
  /**This value for GraphObject.segmentOrientation results in the GraphObject turned counter-clockwise to be perpendicular to the route, just like Link.OrientMinus90, but is never upside down: the GraphObject's angle always being 90 degrees less than the angle of the link's route at the segment where the GraphObject is attached; this is typically only used for TextBlocks or Panels that contain text.*/
  /* static member */
  @JSImport("go", "Link.OrientMinus90Upright")
  @js.native
  def OrientMinus90Upright: EnumValue = js.native
  inline def OrientMinus90Upright_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OrientMinus90Upright")(x.asInstanceOf[js.Any])
  
  inline def OrientMinus90_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OrientMinus90")(x.asInstanceOf[js.Any])
  
  /**This value for GraphObject.segmentOrientation results in the GraphObject's angle always being 180 degrees opposite from the angle of the link's route at the segment where the GraphObject is attached.*/
  /* static member */
  @JSImport("go", "Link.OrientOpposite")
  @js.native
  def OrientOpposite: EnumValue = js.native
  inline def OrientOpposite_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OrientOpposite")(x.asInstanceOf[js.Any])
  
  /**This value for GraphObject.segmentOrientation results in the GraphObject is turned clockwise to be perpendicular to the route: the GraphObject's angle is always 90 degrees more than the angle of the link's route at the segment where the GraphObject is attached.*/
  /* static member */
  @JSImport("go", "Link.OrientPlus90")
  @js.native
  def OrientPlus90: EnumValue = js.native
  
  /**This value for GraphObject.segmentOrientation results in the GraphObject turned clockwise to be perpendicular to the route, just like Link.OrientPlus90, but is never upside down: the GraphObject's angle always being 90 degrees more than the angle of the link's route at the segment where the GraphObject is attached; this is typically only used for TextBlocks or Panels that contain text.*/
  /* static member */
  @JSImport("go", "Link.OrientPlus90Upright")
  @js.native
  def OrientPlus90Upright: EnumValue = js.native
  inline def OrientPlus90Upright_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OrientPlus90Upright")(x.asInstanceOf[js.Any])
  
  inline def OrientPlus90_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OrientPlus90")(x.asInstanceOf[js.Any])
  
  /**This value for GraphObject.segmentOrientation results in the GraphObject turned to have the same angle as the route, just like Link.OrientAlong, but is never upside down: the GraphObject's angle always following the angle of the link's route at the segment where the GraphObject is attached; this is typically only used for TextBlocks or Panels that contain text.*/
  /* static member */
  @JSImport("go", "Link.OrientUpright")
  @js.native
  def OrientUpright: EnumValue = js.native
  
  /**This value for GraphObject.segmentOrientation results in the GraphObject's angle always following the angle of the link's route at the segment where the GraphObject is attached, but never upside down and never angled more than +/- 45 degrees: when the route's angle is within 45 degrees of vertical (90 or 270 degrees), the GraphObject's angle is set to zero; this is typically only used for TextBlocks or Panels that contain text.*/
  /* static member */
  @JSImport("go", "Link.OrientUpright45")
  @js.native
  def OrientUpright45: EnumValue = js.native
  inline def OrientUpright45_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OrientUpright45")(x.asInstanceOf[js.Any])
  
  inline def OrientUpright_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OrientUpright")(x.asInstanceOf[js.Any])
  
  /**Used as a value for Link.routing: each segment is horizontal or vertical.*/
  /* static member */
  @JSImport("go", "Link.Orthogonal")
  @js.native
  def Orthogonal: EnumValue = js.native
  inline def Orthogonal_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Orthogonal")(x.asInstanceOf[js.Any])
  
  /**Used as a value for Link.adjusting, to indicate that the link route computation should scale and rotate the intermediate points so that the link's shape looks approximately the same; if the routing is orthogonal, this value is treated as if it were Link.End.*/
  /* static member */
  @JSImport("go", "Link.Scale")
  @js.native
  def Scale: EnumValue = js.native
  inline def Scale_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Scale")(x.asInstanceOf[js.Any])
  
  /**Used as a value for Link.adjusting, to indicate that the link route computation should linearly interpolate the intermediate points so that the link's shape looks stretched; if the routing is orthogonal, this value is treated as if it were Link.End.*/
  /* static member */
  @JSImport("go", "Link.Stretch")
  @js.native
  def Stretch: EnumValue = js.native
  inline def Stretch_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Stretch")(x.asInstanceOf[js.Any])
}
