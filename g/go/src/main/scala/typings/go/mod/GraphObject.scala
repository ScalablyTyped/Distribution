package typings.go.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is the abstract base class for all graphical objects.
  */
@JSImport("go", "GraphObject")
@js.native
/**
  * This is an abstract class, so you should not use this constructor.
  */
abstract class GraphObject () extends StObject {
  
  /**Gets or sets the function to execute when the ActionTool is cancelled and this GraphObject's .isActionable is set to true.*/
  def actionCancel(e: InputEvent, obj: GraphObject): Unit = js.native
  
  /**Gets or sets the function to execute on a mouse-down event when this GraphObject's .isActionable is set to true.*/
  def actionDown(e: InputEvent, obj: GraphObject): Unit = js.native
  
  /**Gets or sets the function to execute on a mouse-move event when this GraphObject's .isActionable is set to true.*/
  def actionMove(e: InputEvent, obj: GraphObject): Unit = js.native
  
  /**Gets or sets the function to execute on a mouse-up event when this GraphObject's .isActionable is set to true.*/
  def actionUp(e: InputEvent, obj: GraphObject): Unit = js.native
  
  /**This read-only property returns the bounds of this GraphObject in container coordinates.*/
  var actualBounds: Rect = js.native
  
  /**Gets or sets the alignment Spot of this GraphObject used in Panel layouts, to determine where in the area allocated by the panel this object should be placed.*/
  var alignment: Spot = js.native
  
  /**Gets or sets the spot on this GraphObject to be used as the alignment point in Spot and Fixed Panels.*/
  var alignmentFocus: Spot = js.native
  
  /**Gets or sets the angle transform, in degrees, of this GraphObject.*/
  var angle: Double = js.native
  
  /**Gets or sets the areaBackground Brush (or CSS color string) of this GraphObject.*/
  var areaBackground: BrushLike = js.native
  
  /**Gets or sets the background Brush (or CSS color string) of this GraphObject, filling the rectangle of this object's local coordinate space.*/
  var background: BrushLike = js.native
  
  /**
    * Add a data-binding of a property on this GraphObject to a property on a data object.
    * @param {Binding} binding
    */
  def bind(binding: Binding): Unit = js.native
  
  /**Gets or sets the function to execute when the user single-primary-clicks on this object.*/
  def click(e: InputEvent, obj: GraphObject): Unit = js.native
  
  // undocumented
  /* protected */ def cloneProtected(copy: GraphObject): Unit = js.native
  
  /**Gets or sets the column of this GraphObject if it is in a Table Panel.*/
  var column: Double = js.native
  
  /**Gets or sets the number of columns spanned by this GraphObject if it is in a Table Panel.*/
  var columnSpan: Double = js.native
  
  /**Gets or sets the function to execute when the user single-secondary-clicks on this object.*/
  def contextClick(e: InputEvent, obj: GraphObject): Unit = js.native
  
  /**This Adornment is shown upon a context click on this object.*/
  var contextMenu: Adornment = js.native
  
  /**
    * Creates a deep copy of this GraphObject and returns it.
    */
  def copy(): GraphObject = js.native
  
  /**Gets or sets the mouse cursor to use when the mouse is over this object with no mouse buttons pressed.*/
  var cursor: String = js.native
  
  /**Gets or sets the desired size of this GraphObject in local coordinates.*/
  var desiredSize: Size = js.native
  
  /**This read-only property returns the Diagram that this GraphObject is in, if it is.*/
  var diagram: Diagram = js.native
  
  /**Gets or sets the function to execute when the user double-primary-clicks on this object.*/
  def doubleClick(e: InputEvent, obj: GraphObject): Unit = js.native
  
  /**Gets or sets how the direction of the last segment of a link coming from this port is computed when the node is rotated.*/
  var fromEndSegmentDirection: EnumValue = js.native
  
  /**Gets or sets the length of the last segment of a link coming from this port.*/
  var fromEndSegmentLength: Double = js.native
  
  /**Gets or sets whether the user may draw Links from this port. The value must be either a boolean or null.*/
  var fromLinkable: Boolean = js.native
  
  /**Gets or sets whether the user may draw duplicate Links from this port.*/
  var fromLinkableDuplicates: Boolean = js.native
  
  /**Gets or sets whether the user may draw Links that connect from this port's Node.*/
  var fromLinkableSelfNode: Boolean = js.native
  
  /**Gets or sets the maximum number of links that may come out of this port.*/
  var fromMaxLinks: Double = js.native
  
  /**Gets or sets how far the end segment of a link coming from this port stops short of the actual port.*/
  var fromShortLength: Double = js.native
  
  /**Gets or sets where a link should connect from this port.*/
  var fromSpot: Spot = js.native
  
  /**
    * Returns the effective angle that the object is drawn at, in document coordinates.
    */
  def getDocumentAngle(): Double = js.native
  
  /**
    * Returns the Point in document coordinates for a given Spot in this object's bounds.
    * @param {Spot} s a real Spot describing a location relative to the GraphObject.
    * @param {Point=} result an optional Point that is modified and returned.
    */
  def getDocumentPoint(s: Spot): Point = js.native
  def getDocumentPoint(s: Spot, result: Point): Point = js.native
  
  /**
    * Returns the total scale that the object is drawn at, in document coordinates.
    */
  def getDocumentScale(): Double = js.native
  
  /**
    * Given a Point in document coordinates, returns a new Point in local coordinates.
    * @param {Point} p a Point in document coordinates.
    * @param {Point=} result an optional Point that is modified and returned.
    */
  def getLocalPoint(p: Point): Point = js.native
  def getLocalPoint(p: Point, result: Point): Point = js.native
  
  /**Gets or sets the desired height of this GraphObject in local coordinates.*/
  var height: Double = js.native
  
  /**This property determines whether or not this GraphObject's events occur before all other events, including selection.*/
  var isActionable: Boolean = js.native
  
  /**
    * This predicate is true if this object is an element, perhaps indirectly, of the given panel.
    * @param {GraphObject} panel
    * or if it is contained by another panel that is contained by the given panel,
    * to any depth; false if the argument is null or is not a Panel.
    */
  def isContainedBy(panel: GraphObject): Boolean = js.native
  
  /**Gets or sets whether a GraphObject is the "main" object for some types of Panel.*/
  var isPanelMain: Boolean = js.native
  
  /**
    * This predicate is true if this object is .visible and each of its visual containing panels are also visible.
    */
  def isVisibleObject(): Boolean = js.native
  
  /**This read-only property returns the GraphObject's containing Layer, if there is any.*/
  var layer: Layer = js.native
  
  /**Gets or sets the size of empty area around this GraphObject, as a Margin (or number for a uniform Margin), in the containing Panel coordinates.*/
  var margin: MarginLike = js.native
  
  /**Gets or sets the maximum size of this GraphObject in container coordinates (either a Panel or the document).*/
  var maxSize: Size = js.native
  
  /**This read-only property returns the measuredBounds of the GraphObject in container coordinates (either a Panel or the document).*/
  var measuredBounds: Rect = js.native
  
  /**Gets or sets the minimum size of this GraphObject in container coordinates (either a Panel or the document).*/
  var minSize: Size = js.native
  
  /**Gets or sets the function to execute when the user moves the mouse into this stationary object during a DraggingTool drag.*/
  def mouseDragEnter(e: InputEvent, obj: GraphObject, prev: GraphObject): Unit = js.native
  
  /**Gets or sets the function to execute when the user moves the mouse out of this stationary object during a DraggingTool drag.*/
  def mouseDragLeave(e: InputEvent, obj: GraphObject, prev: GraphObject): Unit = js.native
  
  /**Gets or sets the function to execute when a user drops the selection on this object at the end of a DraggingTool drag.*/
  def mouseDrop(e: InputEvent, obj: GraphObject): Unit = js.native
  
  /**Gets or sets the function to execute when the user moves the mouse into this object without holding down any buttons.*/
  def mouseEnter(e: InputEvent, obj: GraphObject, prev: GraphObject): Unit = js.native
  
  /**Gets or sets the function to execute when the user holds the mouse stationary in the background of the diagram while holding down a button over this object.*/
  def mouseHold(e: InputEvent, obj: GraphObject): Unit = js.native
  
  /**Gets or sets the function to execute when the user holds the mouse stationary in the background of the diagram without holding down any buttons over this object.*/
  def mouseHover(e: InputEvent, obj: GraphObject): Unit = js.native
  
  /**Gets or sets the function to execute when the user moves the mouse into this object without holding down any buttons.*/
  def mouseLeave(e: InputEvent, obj: GraphObject, prev: GraphObject): Unit = js.native
  
  /**Gets or sets the function to execute when the user moves the mouse over this object without holding down any buttons.*/
  def mouseOver(e: InputEvent, obj: GraphObject): Unit = js.native
  
  /**Gets or sets the name for this object.*/
  var name: String = js.native
  
  /**This read-only property returns the natural bounding rectangle of this GraphObject in local coordinates, before any transformation by .scale or .angle, and before any resizing due to .minSize or .maxSize or .stretch.*/
  var naturalBounds: Rect = js.native
  
  /**Gets or sets the multiplicative opacity for this GraphObject and (if a Panel) all nested elements.*/
  var opacity: Double = js.native
  
  /**This read-only property returns the GraphObject's containing Panel, or null if this object is not in a Panel.*/
  var panel: Panel = js.native
  
  /**This read-only property returns the Part containing this object, if any.*/
  var part: Part = js.native
  
  /**Gets or sets whether or not this GraphObject can be chosen by visual "find" methods such as Diagram.findObjectAt.*/
  var pickable: Boolean = js.native
  
  /**Gets or sets an identifier for an object acting as a port on a Node.*/
  var portId: String = js.native
  
  /**Gets or sets the position of this GraphObject in container coordinates (either a Panel or the document).*/
  var position: Point = js.native
  
  /**Gets or sets the row of this GraphObject if it is in a Table Panel.*/
  var row: Double = js.native
  
  /**Gets or sets the number of rows spanned by this GraphObject if it is in a Table Panel.*/
  var rowSpan: Double = js.native
  
  /**Gets or sets the scale transform of this GraphObject.*/
  var scale: Double = js.native
  
  /**Gets or sets the fractional distance along a segment of a GraphObject that is in a Link.*/
  var segmentFraction: Double = js.native
  
  /**Gets or sets the segment index of a GraphObject that is in a Link.*/
  var segmentIndex: Double = js.native
  
  /**Gets or sets the offset of a GraphObject that is in a Link from a point on a segment.*/
  var segmentOffset: Point = js.native
  
  /**Gets or sets the orientation of a GraphObject that is in a Link.*/
  var segmentOrientation: EnumValue = js.native
  
  /**
    * This method sets a collection of properties according to the property/value pairs that have been set on the given Object,
    * in the same manner as GraphObject.make does when constructing a GraphObject with an argument that is a simple JavaScript Object.
    */
  def setProperties(props: js.Object): Unit = js.native
  
  def spanAllocation(obj: GraphObject, r: RowColumnDefinition, n: Double): Double = js.native
  
  /**Gets or sets the stretch of the GraphObject.*/
  var stretch: EnumValue = js.native
  
  /**Gets or sets how the direction of the last segment of a link going to this port is computed when the node is rotated.*/
  var toEndSegmentDirection: EnumValue = js.native
  
  /**Gets or sets the length of the last segment of a link going to this port.*/
  var toEndSegmentLength: Double = js.native
  
  /**Gets or sets whether the user may draw Links to this port. The value must be either a boolean or null.*/
  var toLinkable: Boolean = js.native
  
  /**Gets or sets whether the user may draw duplicate Links to this port.*/
  var toLinkableDuplicates: Boolean = js.native
  
  /**Gets or sets whether the user may draw Links that connect to this port's Node.*/
  var toLinkableSelfNode: Boolean = js.native
  
  /**Gets or sets the maximum number of links that may go into this port.*/
  var toMaxLinks: Double = js.native
  
  /**Gets or sets how far the end segment of a link going to this port stops short of the actual port.*/
  var toShortLength: Double = js.native
  
  /**Gets or sets where a link should connect to this port.*/
  var toSpot: Spot = js.native
  
  /**This Adornment is shown when the mouse hovers over this object.*/
  var toolTip: Adornment = js.native
  
  /**Gets or sets whether a GraphObject is visible.*/
  var visible: Boolean = js.native
  
  /**Gets or sets the desired width of this GraphObject in local coordinates.*/
  var width: Double = js.native
}
object GraphObject {
  
  @JSImport("go", "GraphObject")
  @js.native
  val ^ : js.Any = js.native
  
  /**GraphObjects with this as the value of GraphObject.stretch are stretched depending on the context they are used.*/
  /* static member */
  @JSImport("go", "GraphObject.Default")
  @js.native
  def Default: EnumValue = js.native
  inline def Default_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Default")(x.asInstanceOf[js.Any])
  
  /**GraphObjects with this as the value of GraphObject.stretch are scaled in both directions so as to fit exactly in the given bounds; there is no clipping but the aspect ratio may change, causing the object to appear stretched.*/
  /* static member */
  @JSImport("go", "GraphObject.Fill")
  @js.native
  def Fill: EnumValue = js.native
  inline def Fill_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Fill")(x.asInstanceOf[js.Any])
  
  /**GraphObjects with this as the value of GraphObject.stretch are scaled as much as possible in the x-axis*/
  /* static member */
  @JSImport("go", "GraphObject.Horizontal")
  @js.native
  def Horizontal: EnumValue = js.native
  inline def Horizontal_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Horizontal")(x.asInstanceOf[js.Any])
  
  /**GraphObjects with this as the value of GraphObject.stretch are not automatically scaled to fit in the given bounds; there may be clipping in one or both directions.*/
  /* static member */
  @JSImport("go", "GraphObject.None")
  @js.native
  def None: EnumValue = js.native
  inline def None_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("None")(x.asInstanceOf[js.Any])
  
  /**Pictures with this as the value of Picture.imageStretch are drawn with equal scale in both directions to fit the arranged (actual) bounds.*/
  /* static member */
  @JSImport("go", "GraphObject.Uniform")
  @js.native
  def Uniform: EnumValue = js.native
  
  /**Pictures with this as the value of Picture.imageStretch are drawn with equal scale in both directions to fit the larger side of the image bounds.*/
  /* static member */
  @JSImport("go", "GraphObject.UniformToFill")
  @js.native
  def UniformToFill: EnumValue = js.native
  inline def UniformToFill_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UniformToFill")(x.asInstanceOf[js.Any])
  
  inline def Uniform_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Uniform")(x.asInstanceOf[js.Any])
  
  /**GraphObjects with this as the value of GraphObject.stretch are scaled as much as possible in the y-axis*/
  /* static member */
  @JSImport("go", "GraphObject.Vertical")
  @js.native
  def Vertical: EnumValue = js.native
  inline def Vertical_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Vertical")(x.asInstanceOf[js.Any])
  
  /**
    * This static function defines a named function that GraphObject.make can use to build objects.
    * @param {string} name a capitalized name; must not be "" or "None"
    * @param {function(Array<*>):Object} func
    */
  /* static member */
  inline def defineBuilder(name: String, func: js.Function1[/* args */ js.Array[Any], js.Object]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defineBuilder")(name.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  // undocumented
  /* static member */
  inline def getBuilders(): Map[String, js.Function1[/* args */ js.Array[Any], js.Object]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBuilders")().asInstanceOf[Map[String, js.Function1[/* args */ js.Array[Any], js.Object]]]
  
  inline def make(`type`: String, initializers: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("make")(scala.List(`type`.asInstanceOf[js.Any]).`++`(initializers.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
  /**
    * This static function builds an object given its class and additional arguments providing initial properties or GraphObjects that become Panel elements.
    * @param {function()|string} type a class function or the name of a class in the "go" namespace,
    * or one of several predefined kinds of Panels: "Button", "TreeExpanderButton",
    * "SubGraphExpanderButton", or "ContextMenuButton".
    * @param {...*} initializers zero or more values that initialize the new object,
    * typically an Object with properties whose values that get set on the new object,
    * or a GraphObject that is added to a Panel,
    * or a Binding for one of the new object's properties,
    * or an EnumValue as the initial value of a single property of the new object that
    * is recognized to take that value,
    * or a string that is used as the value of a commonly set property.
    */
  /* static member */
  inline def make(`type`: Constructor, initializers: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("make")(scala.List(`type`.asInstanceOf[js.Any]).`++`(initializers.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
  
  /**
    * This static function returns the first argument from the arguments array passed
    * to a GraphObject.defineBuilder function by GraphObject.make.
    * By default this requires the first argument to be a string,
    * but you can provide a predicate to determine whether the argument is suitable.
    * @param {Array} args
    * @param {*=} defval the default value to return if the argument is optional and not present as the first argument
    * @param {function(*):boolean|null=} pred a predicate to determine the acceptability of the argument;
    *        the default predicate checks whether the argument is a string
    * @return {*}
    */
  /* static member */
  inline def takeBuilderArgument(args: js.Array[Any]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("takeBuilderArgument")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def takeBuilderArgument(args: js.Array[Any], defval: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("takeBuilderArgument")(args.asInstanceOf[js.Any], defval.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def takeBuilderArgument(args: js.Array[Any], defval: Any, pred: js.Function1[/* arg */ Any, Boolean]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("takeBuilderArgument")(args.asInstanceOf[js.Any], defval.asInstanceOf[js.Any], pred.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def takeBuilderArgument(args: js.Array[Any], defval: Unit, pred: js.Function1[/* arg */ Any, Boolean]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("takeBuilderArgument")(args.asInstanceOf[js.Any], defval.asInstanceOf[js.Any], pred.asInstanceOf[js.Any])).asInstanceOf[Any]
}
