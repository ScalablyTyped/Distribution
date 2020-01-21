package typings.go.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is the base class for all of the predefined diagram layout implementations.
  * They only arrange Parts (primarily Nodes and Links) in a Diagram,
  * not to GraphObjects in Panels (i.e. panel layout).
  */
@JSImport("go", "Layout")
@js.native
/**
  * Create a minimal layout that only positions Nodes that do not have a location.
  */
class Layout () extends js.Object {
  /**Gets or sets the top-left point for where the graph should be positioned when laid out.*/
  var arrangementOrigin: Point = js.native
  /**This read-only property returns the Diagram that owns this layout, if it is the value of Diagram.layout.*/
  var diagram: Diagram = js.native
  /**This read-only property returns the Group that uses this layout, if it is the value of a group's Group.layout.*/
  var group: Group = js.native
  /**Gets or sets whether this layout is performed on an initial layout.*/
  var isInitial: Boolean = js.native
  /**Gets or sets whether this layout can be invalidated by .invalidateLayout.*/
  var isOngoing: Boolean = js.native
  /**Gets or sets whether this layout be performed in real-time, before the end of a transaction.*/
  var isRealtime: Boolean = js.native
  /**Gets or sets whether this layout routes Links.*/
  var isRouting: Boolean = js.native
  /**Gets or sets whether this layout needs to be performed again.*/
  var isValidLayout: Boolean = js.native
  /**Gets or sets whether this layout depends on the Diagram.viewportBounds's size.*/
  var isViewportSized: Boolean = js.native
  /**Gets or sets the LayoutNetwork used by this Layout, if any.*/
  var network: LayoutNetwork = js.native
  /**
    * Copies properties from this layout to the given layout, which must be of the same class as this layout.
    * @param {Layout} copy
    */
  /* protected */ def cloneProtected(copy: Layout): Unit = js.native
  def collectParts(coll: Iterable[Part]): Unit = js.native
  /**
    * When using a LayoutNetwork, commit changes to the diagram by setting Node positions and by routing the Links.
    */
  def commitLayout(): Unit = js.native
  /**
    * Creates a copy of this Layout and returns it.
    */
  def copy(): Layout = js.native
  /**
    * Create a new LayoutNetwork of LayoutVertexes and LayoutEdges.
    */
  def createNetwork(): LayoutNetwork = js.native
  /**
    * Position all of the nodes that do not have an assigned Part.location in the manner of a simple rectangular array.
    * @param {(Diagram | Group | Iterable<Part>)} coll A Diagram or a Group or a collection of Parts.
    */
  def doLayout(coll: Diagram): Unit = js.native
  def doLayout(coll: Group): Unit = js.native
  def doLayout(coll: Iterable[Part]): Unit = js.native
  /**
    * If .isOngoing is true and if an initial layout has not yet been performed, set the .isValidLayout property to false, and ask to perform another layout in the near future.
    */
  def invalidateLayout(): Unit = js.native
  /**
    * Create and initialize a LayoutNetwork with the given nodes and links.
    * @param {(Diagram | Group | Iterable<Part>)} coll A Diagram or a Group or a collection of Parts.
    */
  def makeNetwork(coll: Diagram): LayoutNetwork = js.native
  def makeNetwork(coll: Group): LayoutNetwork = js.native
  def makeNetwork(coll: Iterable[Part]): LayoutNetwork = js.native
  /**
    * When using a LayoutNetwork, update the "physical" node positionings and link routings.
    */
  def updateParts(): Unit = js.native
}

