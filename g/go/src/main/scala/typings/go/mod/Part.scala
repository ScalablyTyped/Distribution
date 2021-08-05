package typings.go.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is the base class for all user-manipulated top-level objects.
  * Because it inherits from Panel, it is automatically a visual container
  * of other GraphObjects.
  * Because it thus also inherits from GraphObject, it also has properties such as
  * GraphObject.actualBounds, GraphObject.contextMenu, and GraphObject.visible.
  */
@JSImport("go", "Part")
@js.native
/**
  * The constructor builds an empty Part.
  * @param {EnumValue=} type if not supplied, the default Panel type is Panel.Position.
  */
class Part () extends Panel {
  def this(`type`: EnumValue) = this()
  
  /**
    * Associate an Adornment with this Part, perhaps replacing any existing adornment.
    * @param {string} category a string identifying the kind or role of the given adornment for this Part.
    * @param {Adornment} ad
    */
  def addAdornment(category: String, ad: Adornment): Unit = js.native
  
  /**This read-only property returns an iterator over all of the Adornments associated with this part.*/
  var adornments: Iterator[Adornment] = js.native
  
  /**
    * This predicate returns true if .copyable is true, if the layer's Layer.allowCopy is true, and if the diagram's Diagram.allowCopy is true.
    */
  def canCopy(): Boolean = js.native
  
  /**
    * This predicate returns true if .deletable is true, if the layer's Layer.allowDelete is true, and if the diagram's Diagram.allowDelete is true.
    */
  def canDelete(): Boolean = js.native
  
  /**
    * This predicate returns true if .textEditable is true, if the layer's Layer.allowTextEdit is true, and if the diagram's Diagram.allowTextEdit is true.
    */
  def canEdit(): Boolean = js.native
  
  /**
    * This predicate returns true if .groupable is true, if the layer's Layer.allowGroup is true, and if the diagram's Diagram.allowGroup is true.
    */
  def canGroup(): Boolean = js.native
  
  /**
    * This predicate is called by Layout implementations to decide whether this Part should be positioned and might affect the positioning of other Parts.
    */
  def canLayout(): Boolean = js.native
  
  /**
    * This predicate returns true if .movable is true, if the layer's Layer.allowMove is true, and if the diagram's Diagram.allowMove is true.
    */
  def canMove(): Boolean = js.native
  
  /**
    * This predicate returns true if .reshapable is true, if the layer's Layer.allowReshape is true, and if the diagram's Diagram.allowReshape is true.
    */
  def canReshape(): Boolean = js.native
  
  /**
    * This predicate returns true if .resizable is true, if the layer's Layer.allowResize is true, and if the diagram's Diagram.allowResize is true.
    */
  def canResize(): Boolean = js.native
  
  /**
    * This predicate returns true if .rotatable is true, if the layer's Layer.allowRotate is true, and if the diagram's Diagram.allowRotate is true.
    */
  def canRotate(): Boolean = js.native
  
  /**
    * This predicate returns true if .selectable is true, if the layer's Layer.allowSelect is true, and if the diagram's Diagram.allowSelect is true.
    */
  def canSelect(): Boolean = js.native
  
  /**Gets or sets the category of this part, typically used to distinguish different kinds of nodes or links.*/
  var category: String = js.native
  
  /**
    * Remove all adornments associated with this part.
    */
  def clearAdornments(): Unit = js.native
  
  /**Gets or sets the Group of which this Part or Node is a member.*/
  var containingGroup: Group = js.native
  
  /**Gets or sets the function that is called after this Part has changed which Group it belongs to, if any.*/
  def containingGroupChanged(member: Part, oldgrp: Group, newgrp: Group): Unit = js.native
  
  /**Gets or sets whether the user may copy this part.*/
  var copyable: Boolean = js.native
  
  /**Gets or sets whether the user may delete this part.*/
  var deletable: Boolean = js.native
  
  /**Gets or sets the function used to determine the location that this Part can be dragged to.*/
  def dragComputation(part: Part, oldloc: Point, newloc: Point): Point = js.native
  
  /**
    * Measures if needed to make sure the GraphObject.measuredBounds and GraphObject.naturalBounds are all real numbers,
    * primarily to get the actual width and height.
    * GraphObject.actualBounds will get a real width and height, but the x and y values may continue to be <code>NaN</code>
    * if they were that way beforehand.
    */
  def ensureBounds(): Unit = js.native
  
  /**
    * Find an Adornment of a given category associated with this Part.
    * @param {string} category
    */
  def findAdornment(category: String): Adornment = js.native
  
  /**
    * Find the Group that contains both this part and another one.
    * @param {Part} other
    */
  def findCommonContainingGroup(other: Part): Group = js.native
  
  /**
    * Return how deep this part is in the hierarchy of nested Groups.
    * For top level parts, i.e. isTopLevel, this returns zero.
    */
  def findSubGraphLevel(): Double = js.native
  
  /**
    * Gets the top-level Part for this part, which is itself when .isTopLevel is true.
    */
  def findTopLevelPart(): Part = js.native
  
  /**Gets or sets whether the user may group this part to be a member of a new Group.*/
  var groupable: Boolean = js.native
  
  /**
    * Invalidate the Layout that is responsible for positioning this Part.
    * @param {number=} condition the reason that the layout should be invalidated --
    * some combination of "Layout..." flag values;
    * if this argument is not supplied, any value of .layoutConditions other than Part.LayoutNone
    * will allow the layout to be invalidated.
    */
  def invalidateLayout(): Unit = js.native
  def invalidateLayout(condition: Double): Unit = js.native
  
  /**Gets or sets whether this Part may be animated.*/
  var isAnimated: Boolean = js.native
  
  /**Gets or sets whether this Part is highlighted.*/
  var isHighlighted: Boolean = js.native
  
  /**Gets or sets whether this Part is part of the document bounds.*/
  var isInDocumentBounds: Boolean = js.native
  
  /**Gets or sets whether a Layout positions this Node or routes this Link.*/
  var isLayoutPositioned: Boolean = js.native
  
  /**
    * This predicate is true if this part is a member of the given Part, perhaps indirectly.
    * @param {Part} part
    */
  def isMemberOf(part: Part): Boolean = js.native
  
  /**Gets or sets whether this Part is selected.*/
  var isSelected: Boolean = js.native
  
  /**Gets or sets whether this part will draw shadows.*/
  var isShadowed: Boolean = js.native
  
  /**Gets whether this part is not member of any Group node nor is it a label node for a Link.*/
  var isTopLevel: Boolean = js.native
  
  /**
    * This predicate is true if this Part can be seen.
    */
  def isVisible(): Boolean = js.native
  
  /**Gets or sets the function to execute when this part changes layers.*/
  def layerChanged(part: Part, oldlayer: Layer, newlayer: Layer): Unit = js.native
  
  /**Gets or sets the layer name for this part.*/
  var layerName: String = js.native
  
  /**Gets or sets "Layout..." flags that control when the Layout that is responsible for this Part is invalidated.*/
  var layoutConditions: Double = js.native
  
  /**Gets or sets the position of this part in document coordinates, based on the .locationSpot in this part's .locationObject.*/
  var location: Point = js.native
  
  /**This read-only property returns the GraphObject that determines the location of this Part.*/
  var locationObject: GraphObject = js.native
  
  /**Gets or sets the name of the GraphObject that provides the location of this Part.*/
  var locationObjectName: String = js.native
  
  /**Gets or sets the location Spot of this Node, the spot on the .locationObject that is used in positioning this part in the diagram.*/
  var locationSpot: Spot = js.native
  
  /**Gets or sets the maximum location of this Part to which the user may drag using the DraggingTool.*/
  var maxLocation: Point = js.native
  
  /**Gets or sets the minimum location of this Part to which the user may drag using the DraggingTool.*/
  var minLocation: Point = js.native
  
  /**Gets or sets whether the user may move this part.*/
  var movable: Boolean = js.native
  
  /**
    * Move this part and any parts that are owned by this part to a new position.
    * @param {Point} newpos a new Point in document coordinates.
    */
  def move(newpos: Point): Unit = js.native
  
  /**
    * Move this part and any parts that are owned by this part to a new position.
    * @param {number} x the new X position in document coordinates.
    * @param {number} y the new Y position in document coordinates.
    */
  def moveTo(x: Double, y: Double): Unit = js.native
  
  /**
    * Remove any Adornment of the given category that may be associated with this Part.
    * @param {string} category a string identifying the kind or role of the given adornment for this Part.
    */
  def removeAdornment(category: String): Unit = js.native
  
  /**Gets or sets whether the user may reshape this part.*/
  var reshapable: Boolean = js.native
  
  /**Gets or sets whether the user may resize this part.*/
  var resizable: Boolean = js.native
  
  /**Gets or sets the adornment template used to create a resize handle Adornment for this part.*/
  var resizeAdornmentTemplate: Adornment = js.native
  
  /**Gets or sets the width and height multiples used when resizing.*/
  var resizeCellSize: Size = js.native
  
  /**This read-only property returns the GraphObject that should get resize handles when this part is selected.*/
  var resizeObject: GraphObject = js.native
  
  /**Gets or sets the name of the GraphObject that should get a resize handle when this part is selected.*/
  var resizeObjectName: String = js.native
  
  /**Gets or sets whether the user may rotate this part.*/
  var rotatable: Boolean = js.native
  
  /**Gets or sets the adornment template used to create a rotation handle Adornment for this part.*/
  var rotateAdornmentTemplate: Adornment = js.native
  
  /**This read-only property returns the GraphObject that should get rotate handles when this part is selected.*/
  var rotateObject: GraphObject = js.native
  
  /**Gets or sets the name of the GraphObject that should get a rotate handle when this part is selected.*/
  var rotateObjectName: String = js.native
  
  /**Gets or sets whether the user may select this part.*/
  var selectable: Boolean = js.native
  
  /**Gets or sets whether a selection adornment is shown for this part when it is selected.*/
  var selectionAdorned: Boolean = js.native
  
  /**Gets or sets the Adornment template used to create a selection handle for this Part.*/
  var selectionAdornmentTemplate: Adornment = js.native
  
  /**Gets or sets the function to execute when this part is selected or deselected.*/
  def selectionChanged(p: Part): Unit = js.native
  
  /**This read-only property returns the GraphObject that should get a selection handle when this part is selected.*/
  var selectionObject: GraphObject = js.native
  
  /**Gets or sets the name of the GraphObject that should get a selection handle when this part is selected.*/
  var selectionObjectName: String = js.native
  
  /**Gets or sets the numerical value that describes the shadow's blur.*/
  var shadowBlur: Double = js.native
  
  /**Gets or sets the CSS string that describes a shadow color.*/
  var shadowColor: String = js.native
  
  /**Gets or sets the X and Y offset of this part's shadow.*/
  var shadowOffset: Point = js.native
  
  /**Gets or sets whether this GraphObject will be shadowed inside a Part that has Part.isShadowed set to true; default is null, meaning obey default shadow rules for Part.isShadowed.*/
  var shadowVisible: Boolean = js.native
  
  /**Gets or sets a text string that is associated with this part.*/
  var text: String = js.native
  
  /**Gets or sets whether the user may do in-place text editing on TextBlocks in this part that have TextBlock.editable set to true.*/
  var textEditable: Boolean = js.native
  
  /**
    * This is responsible for creating any selection Adornment (if this Part .isSelected) and any tool adornments for this part.*/
  def updateAdornments(): Unit = js.native
  
  /**
    * Update all of the references to nodes in case they had been modified in the model without
    * properly notifying the model by calling GraphLinksModel.setGroupKeyForNodeData or
    * GraphLinksModel.setToKeyForLinkData or other similar methods.
    */
  def updateRelationshipsFromData(): Unit = js.native
  
  /**Gets or sets the Z-ordering position of this Part within its Layer; default value is NaN which means "don't care".*/
  var zOrder: Double = js.native
}
object Part {
  
  @JSImport("go", "Part")
  @js.native
  val ^ : js.Any = js.native
  
  /**This flag may be combined with other "Layout" flags as the value of the Part.layoutConditions property to indicate that when a Part is added to a Diagram or Group, it invalidates the Layout responsible for the Part.*/
  /* static member */
  @JSImport("go", "Part.LayoutAdded")
  @js.native
  def LayoutAdded: Double = js.native
  inline def LayoutAdded_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LayoutAdded")(x.asInstanceOf[js.Any])
  
  /**This flag may be combined with other "Layout" flags as the value of the Part.layoutConditions property to indicate that when a Group has been laid out, it invalidates the Layout responsible for that Group; this flag is ignored for Parts that are not Groups.*/
  /* static member */
  @JSImport("go", "Part.LayoutGroupLayout")
  @js.native
  def LayoutGroupLayout: Double = js.native
  inline def LayoutGroupLayout_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LayoutGroupLayout")(x.asInstanceOf[js.Any])
  
  /**This flag may be combined with other "Layout" flags as the value of the Part.layoutConditions property to indicate that when a Part's GraphObject.visible becomes false, it invalidates the Layout responsible for the Part.*/
  /* static member */
  @JSImport("go", "Part.LayoutHidden")
  @js.native
  def LayoutHidden: Double = js.native
  inline def LayoutHidden_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LayoutHidden")(x.asInstanceOf[js.Any])
  
  /**This flag may be combined with other "Layout" flags as the value of the Part.layoutConditions property to indicate that when a Node or simple Part's .category changes, it invalidates the Layout responsible for the Part; this flag is ignored for Parts that are Links.*/
  /* static member */
  @JSImport("go", "Part.LayoutNodeReplaced")
  @js.native
  def LayoutNodeReplaced: Double = js.native
  inline def LayoutNodeReplaced_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LayoutNodeReplaced")(x.asInstanceOf[js.Any])
  
  /**This flag may be combined with other "Layout" flags as the value of the Part.layoutConditions property to indicate that when a Part's GraphObject.actualBounds changes size, it invalidates the Layout responsible for the Part; this flag is ignored for Parts that are Links.*/
  /* static member */
  @JSImport("go", "Part.LayoutNodeSized")
  @js.native
  def LayoutNodeSized: Double = js.native
  inline def LayoutNodeSized_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LayoutNodeSized")(x.asInstanceOf[js.Any])
  
  /**This value may be used as the value of the Part.layoutConditions property to indicate that no operation on this Part causes invalidation of the Layout responsible for this Part.*/
  /* static member */
  @JSImport("go", "Part.LayoutNone")
  @js.native
  def LayoutNone: Double = js.native
  inline def LayoutNone_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LayoutNone")(x.asInstanceOf[js.Any])
  
  /**This flag may be combined with other "Layout" flags as the value of the Part.layoutConditions property to indicate that when a Part is removed from a Diagram or Group, it invalidates the Layout responsible for the Part.*/
  /* static member */
  @JSImport("go", "Part.LayoutRemoved")
  @js.native
  def LayoutRemoved: Double = js.native
  inline def LayoutRemoved_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LayoutRemoved")(x.asInstanceOf[js.Any])
  
  /**This flag may be combined with other "Layout" flags as the value of the Part.layoutConditions property to indicate that when a Part's GraphObject.visible becomes true, it invalidates the Layout responsible for the Part.*/
  /* static member */
  @JSImport("go", "Part.LayoutShown")
  @js.native
  def LayoutShown: Double = js.native
  inline def LayoutShown_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LayoutShown")(x.asInstanceOf[js.Any])
  
  /**This is the default value for the Part.layoutConditions property: the Layout responsible for the Part is invalidated when the Part is added or removed from the Diagram or Group or when it changes visibility or size or when a Group's layout has been performed.*/
  /* static member */
  @JSImport("go", "Part.LayoutStandard")
  @js.native
  def LayoutStandard: Double = js.native
  inline def LayoutStandard_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LayoutStandard")(x.asInstanceOf[js.Any])
}
