package typings
package goLib.goMod.goNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The DraggingTool is used to move or copy selected parts with the mouse.
  * Dragging the selection moves parts for which Part.canMove is true.
  * If the user holds down the Control key, this tool will make a copy of the parts being dragged,
  * for those parts for which Part.canCopy is true.
  */
@js.native
trait DraggingTool extends Tool {
  /**This read-only property returns the collection of Parts that this tool has copied.*/
  var copiedParts: Map[Part, DraggingInfo] = js.native
  /**Gets or sets whether for a copying operation the extended selection is copied or only the selected parts.*/
  var copiesEffectiveCollection: scala.Boolean = js.native
  /**This read-only property returns the Part found at the mouse point.*/
  var currentPart: Part = js.native
  /**On touch gestures only, this property gets or sets the time in milliseconds for which the mouse must be stationary before this tool can be started.*/
  var delay: scala.Double = js.native
  /**This read-only property returns the collection of Parts being dragged.*/
  var draggedParts: Map[Part, DraggingInfo] = js.native
  /**Gets or sets whether the user can drag a single Link, disconnecting it from its connected nodes and possibly connecting it to valid ports when the link is dropped.*/
  var dragsLink: scala.Boolean = js.native
  /**Gets or sets whether moving or copying a node also includes all of the node's tree children and their descendants, along with the links to those additional nodes.*/
  var dragsTree: scala.Boolean = js.native
  /**Gets or sets the size of the grid cell used when snapping during a drag if the value of .isGridSnapEnabled is true.*/
  var gridSnapCellSize: Size = js.native
  /**Gets or sets the Spot that specifies what point in the grid cell dragged parts snap to, if the value of .isGridSnapEnabled is true.*/
  var gridSnapCellSpot: Spot = js.native
  /**Gets or sets the snapping grid's origin point, in document coordinates, if the value of .isGridSnapEnabled is true.*/
  var gridSnapOrigin: Point = js.native
  /**Gets or sets whether for any internal copying operation is permitted by control-drag-and-drop.*/
  var isCopyEnabled: scala.Boolean = js.native
  /**Gets or sets whether the DraggingTool snaps objects to grid points.*/
  var isGridSnapEnabled: scala.Boolean = js.native
  /**Gets or sets whether the DraggingTool snaps objects to grid points during the drag.*/
  var isGridSnapRealtime: scala.Boolean = js.native
  /**Gets or sets the mouse point from which parts start to move.*/
  var startPoint: Point = js.native
  /**
    * Find the actual collection of nodes and links to be moved or copied, given an initial collection.
    * @param {Iterable<Part>} parts A Set or List of Parts.
    */
  def computeEffectiveCollection(parts: Iterable[Part]): Map[Part, DraggingInfo] = js.native
  /**
    * This method computes the new location for a Node or simple Part, given a new desired location and an optional Map of dragged parts, taking any grid-snapping into consideration, any Part.dragComputation function, and any Part.minLocation and Part.maxLocation.
    * @param {Part} n
    * @param {Point} newloc
    * @param {Map=} draggedparts  an optional Map mapping Parts to JavaScript Objects that have a "point" property remembering the original location of that Part.
    * @param {Point=} result  an optional Point that is modified and returned
    */
  def computeMove(n: Part, newloc: Point): Point = js.native
  def computeMove(n: Part, newloc: Point, draggedparts: Map[Part, DraggingInfo]): Point = js.native
  def computeMove(n: Part, newloc: Point, draggedparts: Map[Part, DraggingInfo], result: Point): Point = js.native
  /**
    * Perform any additional side-effects during a drag, whether an internal move or copy or an external drag, that may affect the existing non-moved object(s).
    * @param {Point} pt a Point in document coordinates.
    * @param {GraphObject} obj the GraphObject at the point,
    * excluding what is being dragged or temporary objects;
    * the argument may be null if the drag is occurring in the background of the diagram.
    * Use GraphObject.part to get the Node or Part at the root of
    * the visual tree of the stationary object.
    */
  def doDragOver(pt: Point, obj: GraphObject): scala.Unit = js.native
  /**
    * Perform any additional side-effects after a drop, whether an internal move or copy or an external drop, that may affect the existing non-moved object(s).
    * @param {Point} pt a Point in document coordinates.
    * @param {GraphObject} obj the GraphObject where the drop occurred,
    * excluding what was dropped or temporary objects;
    * the argument may be null if the drop occurred in the background of the diagram.
    * Use GraphObject.part to get the Node or Part at the root of
    * the visual tree of the stationary object.
    */
  def doDropOnto(pt: Point, obj: GraphObject): scala.Unit = js.native
  /**
    * Return the selectable and movable/copyable Part at the mouse-down point.
    */
  def findDraggablePart(): Part = js.native
  /**
    * This predicate is true when the diagram allows objects to be copied and inserted, and some object in the selection is copyable, and the user is holding down the Control key.
    */
  def mayCopy(): scala.Boolean = js.native
  /**
    * This predicate is true when the diagram allows objects to be moved, and some object in the selection is movable.
    */
  def mayMove(): scala.Boolean = js.native
  /**
    Move a collection of Parts by a given offset.
    * @param {Map} parts  a Map mapping Parts to JavaScript Objects that have a "point" property remembering the original location of that Part.
    * @param {Point} offset
    * @param {boolean} check  Whether to check Part.canMove on each part.
    */
  def moveParts(parts: Map[Part, DraggingInfo], offset: Point, check: scala.Boolean): scala.Unit = js.native
}

