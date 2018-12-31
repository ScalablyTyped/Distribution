package typings
package goLib.goMod.goNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is the base class for all user-manipulated top-level objects.
  * Because it inherits from Panel, it is automatically a visual container
  * of other GraphObjects.
  * Because it thus also inherits from GraphObject, it also has properties such as
  * GraphObject.actualBounds, GraphObject.contextMenu, and GraphObject.visible.
  */
@js.native
trait Part extends Panel {
  /**This read-only property returns an iterator over all of the Adornments associated with this part.*/
  var adornments: Iterator[Adornment] = js.native
  /**Gets or sets the category of this part, typically used to distinguish different kinds of nodes or links.*/
  var category: java.lang.String = js.native
  /**Gets or sets the Group of which this Part or Node is a member.*/
  var containingGroup: Group = js.native
  /**Gets or sets whether the user may copy this part.*/
  var copyable: scala.Boolean = js.native
  /**Gets or sets whether the user may delete this part.*/
  var deletable: scala.Boolean = js.native
  /**Gets or sets whether the user may group this part to be a member of a new Group.*/
  var groupable: scala.Boolean = js.native
  /**Gets or sets whether this Part may be animated.*/
  var isAnimated: scala.Boolean = js.native
  /**Gets or sets whether this Part is highlighted.*/
  var isHighlighted: scala.Boolean = js.native
  /**Gets or sets whether this Part is part of the document bounds.*/
  var isInDocumentBounds: scala.Boolean = js.native
  /**Gets or sets whether a Layout positions this Node or routes this Link.*/
  var isLayoutPositioned: scala.Boolean = js.native
  /**Gets or sets whether this Part is selected.*/
  var isSelected: scala.Boolean = js.native
  /**Gets or sets whether this part will draw shadows.*/
  var isShadowed: scala.Boolean = js.native
  /**Gets whether this part is not member of any Group node nor is it a label node for a Link.*/
  var isTopLevel: scala.Boolean = js.native
  /**Gets or sets the layer name for this part.*/
  var layerName: java.lang.String = js.native
  /**Gets or sets "Layout..." flags that control when the Layout that is responsible for this Part is invalidated.*/
  var layoutConditions: scala.Double = js.native
  /**Gets or sets the position of this part in document coordinates, based on the .locationSpot in this part's .locationObject.*/
  var location: Point = js.native
  /**This read-only property returns the GraphObject that determines the location of this Part.*/
  var locationObject: GraphObject = js.native
  /**Gets or sets the name of the GraphObject that provides the location of this Part.*/
  var locationObjectName: java.lang.String = js.native
  /**Gets or sets the location Spot of this Node, the spot on the .locationObject that is used in positioning this part in the diagram.*/
  var locationSpot: Spot = js.native
  /**Gets or sets the maximum location of this Part to which the user may drag using the DraggingTool.*/
  var maxLocation: Point = js.native
  /**Gets or sets the minimum location of this Part to which the user may drag using the DraggingTool.*/
  var minLocation: Point = js.native
  /**Gets or sets whether the user may move this part.*/
  var movable: scala.Boolean = js.native
  /**Gets or sets whether the user may reshape this part.*/
  var reshapable: scala.Boolean = js.native
  /**Gets or sets whether the user may resize this part.*/
  var resizable: scala.Boolean = js.native
  /**Gets or sets the adornment template used to create a resize handle Adornment for this part.*/
  var resizeAdornmentTemplate: Adornment = js.native
  /**Gets or sets the width and height multiples used when resizing.*/
  var resizeCellSize: Size = js.native
  /**This read-only property returns the GraphObject that should get resize handles when this part is selected.*/
  var resizeObject: GraphObject = js.native
  /**Gets or sets the name of the GraphObject that should get a resize handle when this part is selected.*/
  var resizeObjectName: java.lang.String = js.native
  /**Gets or sets whether the user may rotate this part.*/
  var rotatable: scala.Boolean = js.native
  /**Gets or sets the adornment template used to create a rotation handle Adornment for this part.*/
  var rotateAdornmentTemplate: Adornment = js.native
  /**This read-only property returns the GraphObject that should get rotate handles when this part is selected.*/
  var rotateObject: GraphObject = js.native
  /**Gets or sets the name of the GraphObject that should get a rotate handle when this part is selected.*/
  var rotateObjectName: java.lang.String = js.native
  /**Gets or sets whether the user may select this part.*/
  var selectable: scala.Boolean = js.native
  /**Gets or sets whether a selection adornment is shown for this part when it is selected.*/
  var selectionAdorned: scala.Boolean = js.native
  /**Gets or sets the Adornment template used to create a selection handle for this Part.*/
  var selectionAdornmentTemplate: Adornment = js.native
  /**This read-only property returns the GraphObject that should get a selection handle when this part is selected.*/
  var selectionObject: GraphObject = js.native
  /**Gets or sets the name of the GraphObject that should get a selection handle when this part is selected.*/
  var selectionObjectName: java.lang.String = js.native
  /**Gets or sets the numerical value that describes the shadow's blur.*/
  var shadowBlur: scala.Double = js.native
  /**Gets or sets the CSS string that describes a shadow color.*/
  var shadowColor: java.lang.String = js.native
  /**Gets or sets the X and Y offset of this part's shadow.*/
  var shadowOffset: Point = js.native
  /**Gets or sets whether this GraphObject will be shadowed inside a Part that has Part.isShadowed set to true; default is null, meaning obey default shadow rules for Part.isShadowed.*/
  var shadowVisible: scala.Boolean = js.native
  /**Gets or sets a text string that is associated with this part.*/
  var text: java.lang.String = js.native
  /**Gets or sets whether the user may do in-place text editing on TextBlocks in this part that have TextBlock.editable set to true.*/
  var textEditable: scala.Boolean = js.native
  /**Gets or sets the Z-ordering position of this Part within its Layer; default value is NaN which means "don't care".*/
  var zOrder: scala.Double = js.native
  /**
    * Associate an Adornment with this Part, perhaps replacing any existing adornment.
    * @param {string} category a string identifying the kind or role of the given adornment for this Part.
    * @param {Adornment} ad
    */
  def addAdornment(category: java.lang.String, ad: Adornment): scala.Unit = js.native
  /**
    * This predicate returns true if .copyable is true, if the layer's Layer.allowCopy is true, and if the diagram's Diagram.allowCopy is true.
    */
  def canCopy(): scala.Boolean = js.native
  /**
    * This predicate returns true if .deletable is true, if the layer's Layer.allowDelete is true, and if the diagram's Diagram.allowDelete is true.
    */
  def canDelete(): scala.Boolean = js.native
  /**
    * This predicate returns true if .textEditable is true, if the layer's Layer.allowTextEdit is true, and if the diagram's Diagram.allowTextEdit is true.
    */
  def canEdit(): scala.Boolean = js.native
  /**
    * This predicate returns true if .groupable is true, if the layer's Layer.allowGroup is true, and if the diagram's Diagram.allowGroup is true.
    */
  def canGroup(): scala.Boolean = js.native
  /**
    * This predicate is called by Layout implementations to decide whether this Part should be positioned and might affect the positioning of other Parts.
    */
  def canLayout(): scala.Boolean = js.native
  /**
    * This predicate returns true if .movable is true, if the layer's Layer.allowMove is true, and if the diagram's Diagram.allowMove is true.
    */
  def canMove(): scala.Boolean = js.native
  /**
    * This predicate returns true if .reshapable is true, if the layer's Layer.allowReshape is true, and if the diagram's Diagram.allowReshape is true.
    */
  def canReshape(): scala.Boolean = js.native
  /**
    * This predicate returns true if .resizable is true, if the layer's Layer.allowResize is true, and if the diagram's Diagram.allowResize is true.
    */
  def canResize(): scala.Boolean = js.native
  /**
    * This predicate returns true if .rotatable is true, if the layer's Layer.allowRotate is true, and if the diagram's Diagram.allowRotate is true.
    */
  def canRotate(): scala.Boolean = js.native
  /**
    * This predicate returns true if .selectable is true, if the layer's Layer.allowSelect is true, and if the diagram's Diagram.allowSelect is true.
    */
  def canSelect(): scala.Boolean = js.native
  /**
    * Remove all adornments associated with this part.
    */
  def clearAdornments(): scala.Unit = js.native
  /**Gets or sets the function that is called after this Part has changed which Group it belongs to, if any.*/
  def containingGroupChanged(member: Part, oldgrp: Group, newgrp: Group): scala.Unit = js.native
  /**Gets or sets the function used to determine the location that this Part can be dragged to.*/
  def dragComputation(part: Part, oldloc: Point, newloc: Point): Point = js.native
  /**
    * Measures if needed to make sure the GraphObject.measuredBounds and GraphObject.naturalBounds are all real numbers,
    * primarily to get the actual width and height.
    * GraphObject.actualBounds will get a real width and height, but the x and y values may continue to be <code>NaN</code>
    * if they were that way beforehand.
    */
  def ensureBounds(): scala.Unit = js.native
  /**
    * Find an Adornment of a given category associated with this Part.
    * @param {string} category
    */
  def findAdornment(category: java.lang.String): Adornment = js.native
  /**
    * Find the Group that contains both this part and another one.
    * @param {Part} other
    */
  def findCommonContainingGroup(other: Part): Group = js.native
  /**
    * Return how deep this part is in the hierarchy of nested Groups.
    * For top level parts, i.e. isTopLevel, this returns zero.
    */
  def findSubGraphLevel(): scala.Double = js.native
  /**
    * Gets the top-level Part for this part, which is itself when .isTopLevel is true.
    */
  def findTopLevelPart(): Part = js.native
  /**
    * Invalidate the Layout that is responsible for positioning this Part.
    * @param {number=} condition the reason that the layout should be invalidated --
    * some combination of "Layout..." flag values;
    * if this argument is not supplied, any value of .layoutConditions other than Part.LayoutNone
    * will allow the layout to be invalidated.
    */
  def invalidateLayout(): scala.Unit = js.native
  def invalidateLayout(condition: scala.Double): scala.Unit = js.native
  /**
    * This predicate is true if this part is a member of the given Part, perhaps indirectly.
    * @param {Part} part
    */
  def isMemberOf(part: Part): scala.Boolean = js.native
  /**
    * This predicate is true if this Part can be seen.
    */
  def isVisible(): scala.Boolean = js.native
  /**Gets or sets the function to execute when this part changes layers.*/
  def layerChanged(part: Part, oldlayer: Layer, newlayer: Layer): scala.Unit = js.native
  /**
    * Move this part and any parts that are owned by this part to a new position.
    * @param {Point} newpos a new Point in document coordinates.
    */
  def move(newpos: Point): scala.Unit = js.native
  /**
    * Move this part and any parts that are owned by this part to a new position.
    * @param {number} x the new X position in document coordinates.
    * @param {number} y the new Y position in document coordinates.
    */
  def moveTo(x: scala.Double, y: scala.Double): scala.Unit = js.native
  /**
    * Remove any Adornment of the given category that may be associated with this Part.
    * @param {string} category a string identifying the kind or role of the given adornment for this Part.
    */
  def removeAdornment(category: java.lang.String): scala.Unit = js.native
  /**Gets or sets the function to execute when this part is selected or deselected.*/
  def selectionChanged(p: Part): scala.Unit = js.native
  /**
    * This is responsible for creating any selection Adornment (if this Part .isSelected) and any tool adornments for this part.*/
  def updateAdornments(): scala.Unit = js.native
  /**
    * Update all of the references to nodes in case they had been modified in the model without
    * properly notifying the model by calling GraphLinksModel.setGroupKeyForNodeData or
    * GraphLinksModel.setToKeyForLinkData or other similar methods.
    */
  def updateRelationshipsFromData(): scala.Unit = js.native
}

