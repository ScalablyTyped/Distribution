package typings.go.mod

import typings.go.anon.Random
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Force-directed layout treats the graph as if it were a system of physical
  * bodies with forces acting on them and between them.
  * The algorithm seeks a configuration of the bodies with locally minimal energy,
  * i.e. vertex positions such that the sum of the forces on each vertex is zero.
  */
@JSImport("go", "ForceDirectedLayout")
@js.native
/**
  * Constructs a ForceDirectedLayout with no Layout.network and with no owning Layout.diagram.
  */
class ForceDirectedLayout () extends Layout {
  /**Gets or sets the space between which the layout will position the connected graphs that together compose the network.*/
  var arrangementSpacing: Size = js.native
  /**Gets or sets whether .commitNodes should move all of the nodes so that the nodes all fit with the top-left corner at the Layout.arrangementOrigin.*/
  var arrangesToOrigin: Boolean = js.native
  /**Gets or sets whether to call .addComments.*/
  var comments: Boolean = js.native
  /**This read-only property returns the current iteration count, valid during a call to .doLayout.*/
  var currentIteration: Double = js.native
  /**Gets or sets the default value computed by .electricalCharge.*/
  var defaultCommentElectricalCharge: Double = js.native
  /**Gets or sets the default value computed by .springLength.*/
  var defaultCommentSpringLength: Double = js.native
  /**Gets or sets the default value computed by .electricalCharge.*/
  var defaultElectricalCharge: Double = js.native
  /**Gets or sets the default value computed by .gravitationalMass.*/
  var defaultGravitationalMass: Double = js.native
  /**Gets or sets the default value computed by .springLength.*/
  var defaultSpringLength: Double = js.native
  /**Gets or sets the default value computed by .springStiffness.*/
  var defaultSpringStiffness: Double = js.native
  /**Gets or sets approximately how far a node must move in order for the iterations to continue.*/
  var epsilonDistance: Double = js.native
  /**Gets or sets a threshold for the distance beyond which the electrical charge forces may be ignored.*/
  var infinityDistance: Double = js.native
  /**Gets or sets the maximum number of iterations to perform when doing the force-directed auto layout.*/
  var maxIterations: Double = js.native
  /**Gets or sets a random number generator with a random() method; set to null in order to use and reset an internal repeatable pseudo-random number generator.*/
  var randomNumberGenerator: Random = js.native
  /**Gets or sets whether the fromSpot and the toSpot of every Link should be set to Spot.Default.*/
  var setsPortSpots: Boolean = js.native
  /**
    * Find associated objects to be positioned along with the vertex.
    * @param {LayoutVertex} v
    */
  def addComments(v: ForceDirectedVertex): Unit = js.native
  /**
    * Commit the position and routing of all edge links.
    */
  def commitLinks(): Unit = js.native
  /**
    * Commit the position of all vertex nodes.
    */
  def commitNodes(): Unit = js.native
  /**
    * Returns the charge of the vertex,
    * the value of ForceDirectedVertex.charge if it's a number,
    * or else the value of .defaultElectricalCharge.
    * @param {ForceDirectedVertex} v
    */
  def electricalCharge(v: ForceDirectedVertex): Double = js.native
  /**
    * Returns the electrical field in the X direction acting on a vertex at the given point.
    *
    * Used to define an external electrical field at a point
    * independent of the vertex charges.
    * A vertex L is acted upon by a force in the X direction of magnitude
    * @param {number} x
    * @param {number} y
    */
  def electricalFieldX(x: Double, y: Double): Double = js.native
  /**
    * Returns the electrical field in the Y direction acting on a vertex at the given point.
    *
    * Used to define an external electrical field at a point
    * independent of the vertex charges.
    * A vertex L is acted upon by a force in the Y direction of magnitude
    * @param {number} x
    * @param {number} y
    */
  def electricalFieldY(x: Double, y: Double): Double = js.native
  /**
    * This returns the gravitational field in the X direction acting on a vertex at the given point.
    *
    * Used to define an external gravitational field at a point
    * independent of the vertex masses.
    * A vertex L is acted upon by a force in the X direction of magnitude
    * @param {number} x
    * @param {number} y
    */
  def gravitationalFieldX(x: Double, y: Double): Double = js.native
  /**
    * This returns the gravitational field in the Y direction acting on a vertex at the given point.
    *
    * Used to define an external gravitational field at a point
    * independent of the vertex masses.
    * A vertex L is acted upon by a force in the Y direction of magnitude
    * @param {number} x
    * @param {number} y
    */
  def gravitationalFieldY(x: Double, y: Double): Double = js.native
  /**
    * Returns the mass of the vertex,
    * the value of ForceDirectedVertex.mass if it's a number,
    * or else the value of .defaultGravitationalMass.
    * @param {ForceDirectedVertex} v
    */
  def gravitationalMass(v: ForceDirectedVertex): Double = js.native
  /**
    * This predicate returns true if the vertex should not be moved
    * by the layout algorithm but still have an effect on nearby and connected vertexes.
    * The default implementation returns ForceDirectedVertex.isFixed.
    * @param {ForceDirectedVertex} v
    */
  def isFixed(v: ForceDirectedVertex): Boolean = js.native
  /**
    * Maybe move a vertex that isFixed.
    * This is called each iteration on each such vertex.
    * By default this does nothing.
    */
  def moveFixedVertex(v: ForceDirectedVertex): Unit = js.native
  /**
    * Returns the length of the spring representing an edge.
    * The two vertexes connected by the edge E are acted upon by a force of magnitude
    * @param {ForceDirectedEdge} e
    */
  def springLength(e: ForceDirectedEdge): Double = js.native
  /**
    * Returns the stiffness of the spring representing an edge.
    * The two vertexes connected by the edge E are acted upon by a force of magnitude
    * @param {ForceDirectedEdge} e
    */
  def springStiffness(e: ForceDirectedEdge): Double = js.native
}

