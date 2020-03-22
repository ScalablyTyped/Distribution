package typings.go.mod

import typings.go.AnonBackground
import typings.go.AnonDocument
import typings.std.Event_
import typings.std.HTMLDivElement
import typings.std.HTMLImageElement
import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Diagram is associated with an HTML DIV element. Constructing a Diagram creates
  * an HTML Canvas element which it places inside of the given DIV element, in addition to several helper divs.
  * GoJS will manage the contents of this DIV, and the contents should not be modified otherwise,
  * though the given DIV may be styled (background, border, etc) and positioned as needed.
  */
@JSImport("go", "Diagram")
@js.native
/**
  * Construct an empty Diagram for a particular DIV HTML element.
  * @param {string=} div The ID of a DIV element in the DOM.
  * If no DIV identifier is supplied one will be created in memory. The Diagram's Diagram.div property
  * can then be set later on.
  */
class Diagram () extends js.Object {
  def this(div: String) = this()
  /**
    * Construct an empty Diagram for a particular DIV HTML element.
    * @param {HTMLDivElement} div A reference to a DIV HTML element in the DOM.
    * If no DIV is supplied one will be created in memory. The Diagram's Diagram.div property
    * can then be set later on.
    */
  def this(div: HTMLDivElement) = this()
  /**Gets or sets whether the user may copy to or paste parts from the internal clipboard.*/
  var allowClipboard: Boolean = js.native
  /**Gets or sets whether the user may copy objects.*/
  var allowCopy: Boolean = js.native
  /**Gets or sets whether the user may delete objects from the Diagram.*/
  var allowDelete: Boolean = js.native
  /**Gets or sets whether the user may start a drag-and-drop in this Diagram, possibly dropping in a different element.*/
  var allowDragOut: Boolean = js.native
  /**Gets or sets whether the user may end a drag-and-drop operation in this Diagram.*/
  var allowDrop: Boolean = js.native
  /**Gets or sets whether the user may group parts together.*/
  var allowGroup: Boolean = js.native
  /**Gets or sets whether the user is allowed to use the horizontal scrollbar.*/
  var allowHorizontalScroll: Boolean = js.native
  /**Gets or sets whether the user may add parts to the Diagram.*/
  var allowInsert: Boolean = js.native
  /**Gets or sets whether the user may draw new links.*/
  var allowLink: Boolean = js.native
  /**Gets or sets whether the user may move objects.*/
  var allowMove: Boolean = js.native
  /**Gets or sets whether the user may reconnect existing links.*/
  var allowRelink: Boolean = js.native
  /**Gets or sets whether the user may reshape parts.*/
  var allowReshape: Boolean = js.native
  /**Gets or sets whether the user may resize parts.*/
  var allowResize: Boolean = js.native
  /**Gets or sets whether the user may rotate parts.*/
  var allowRotate: Boolean = js.native
  /**Gets or sets whether the user may select objects.*/
  var allowSelect: Boolean = js.native
  /**Gets or sets whether the user may do in-place text editing.*/
  var allowTextEdit: Boolean = js.native
  /**Gets or sets whether the user may undo or redo any changes.*/
  var allowUndo: Boolean = js.native
  /**Gets or sets whether the user may ungroup existing groups.*/
  var allowUngroup: Boolean = js.native
  /**Gets or sets whether the user is allowed to use the vertical scrollbar.*/
  var allowVerticalScroll: Boolean = js.native
  /**Gets or sets whether the user may zoom into or out of the Diagram.*/
  var allowZoom: Boolean = js.native
  /**This read-only property returns the AnimationManager for this Diagram.*/
  var animationManager: AnimationManager = js.native
  /**Gets or sets the autoScale of the Diagram, controlling whether or not the Diagram's bounds automatically scale to fit the view.*/
  var autoScale: EnumValue = js.native
  /**Gets or sets the Margin (or number for a uniform Margin) that describes the Diagram's autoScrollRegion.*/
  var autoScrollRegion: MarginLike = js.native
  /**Gets or sets the CommandHandler for this Diagram.*/
  var commandHandler: CommandHandler = js.native
  /**Gets or sets the content alignment Spot of this Diagram, to be used in determining how parts are positioned when the .viewportBounds width or height is smaller than the .documentBounds.*/
  var contentAlignment: Spot = js.native
  /**This Adornment is shown when the use context clicks in the background.*/
  var contextMenu: Adornment = js.native
  /**Gets or sets the current cursor for the Diagram, overriding the .defaultCursor.*/
  var currentCursor: String = js.native
  /**Gets or sets the current tool for this Diagram that handles all input events.*/
  var currentTool: Tool = js.native
  /**Gets or sets the cursor to be used for the Diagram when no GraphObject specifies a different cursor.*/
  var defaultCursor: String = js.native
  /**Gets or sets the default tool for this Diagram that becomes the current tool when the current tool stops.*/
  var defaultTool: Tool = js.native
  /**Gets or sets the Diagram's HTMLDivElement, via an HTML Element ID.*/
  var div: HTMLDivElement = js.native
  /**This read-only property returns the model-coordinate bounds of the Diagram.*/
  var documentBounds: Rect = js.native
  /**Gets or sets the most recent mouse-down InputEvent that occurred.*/
  var firstInput: InputEvent = js.native
  /**Gets or sets a fixed bounding rectangle to be returned by .documentBounds and .computeBounds.*/
  var fixedBounds: Rect = js.native
  /**Gets or sets a Panel of type Panel.Grid acting as the background grid extending across the whole viewport of this diagram.*/
  var grid: Panel = js.native
  /**Gets or sets the default selection Adornment template, used to adorn selected Groups.*/
  var groupSelectionAdornmentTemplate: Adornment = js.native
  /**Gets or sets the default Group template used as the archetype for group data that is added to the .model.*/
  var groupTemplate: Group = js.native
  /**Gets or sets a Map mapping template names to Groups.*/
  var groupTemplateMap: Map[String, Group] = js.native
  /**Gets or sets whether the Diagram has a horizontal Scrollbar.*/
  var hasHorizontalScrollbar: Boolean = js.native
  /**Gets or sets whether the Diagram has a vertical Scrollbar.*/
  var hasVerticalScrollbar: Boolean = js.native
  /**This read-only property returns the read-only collection of highlighted Parts.*/
  var highlighteds: Set[Part] = js.native
  /**Gets or sets the initialAutoScale of the Diagram.*/
  var initialAutoScale: EnumValue = js.native
  /**Gets or sets the initial content alignment Spot of this Diagram, to be used in determining how parts are positioned initially relative to the viewport.*/
  var initialContentAlignment: Spot = js.native
  /**Gets or sets the spot in the document's area that should be coincident with the .initialViewportSpot of the viewport when the document is first initialized.*/
  var initialDocumentSpot: Spot = js.native
  /**Gets or sets the initial coordinates of this Diagram in the viewport, eventually setting the .position.*/
  var initialPosition: Point = js.native
  /**Gets or sets the initial scale of this Diagram in the viewport, eventually setting the .scale.*/
  var initialScale: Double = js.native
  /**Gets or sets the spot in the viewport that should be coincident with the .initialDocumentSpot of the document when the document is first initialized.*/
  var initialViewportSpot: Spot = js.native
  /**Gets or sets whether the user may interact with the Diagram.*/
  var isEnabled: Boolean = js.native
  /**Gets or sets whether the Diagram's Diagram.model is Model.isReadOnly.*/
  var isModelReadOnly: Boolean = js.native
  /**Gets or sets whether this Diagram's state has been modified.*/
  var isModified: Boolean = js.native
  /**Gets or sets whether mouse events initiated within the Diagram will be captured.*/
  var isMouseCaptured: Boolean = js.native
  /**Gets or sets whether the Diagram may be modified by the user, while still allowing the user to scroll, zoom, and select.*/
  var isReadOnly: Boolean = js.native
  /**Gets or sets whether the Diagram tree structure is defined by links going from the parent node to their children, or vice-versa.*/
  var isTreePathToChildren: Boolean = js.native
  /**Gets or sets the last InputEvent that occurred.*/
  var lastInput: InputEvent = js.native
  /**Gets an iterator for this Diagram's Layers.*/
  var layers: Iterator[Layer] = js.native
  /**Gets or sets the Layout used to position all of the top-level nodes and links in this Diagram.*/
  var layout: Layout = js.native
  /**Gets or sets the default selection Adornment template, used to adorn selected Links.*/
  var linkSelectionAdornmentTemplate: Adornment = js.native
  /**Gets or sets the default Link template used as the archetype for link data that is added to the .model.*/
  var linkTemplate: Link = js.native
  /**Gets or sets a Map mapping template names to Links.*/
  var linkTemplateMap: Map[String, Link] = js.native
  /**Returns an iterator of all Links in the Diagram.*/
  var links: Iterator[Link] = js.native
  /**Gets or sets the largest value that .scale may take.*/
  var maxScale: Double = js.native
  /**Gets or sets the maximum number of selected objects.*/
  var maxSelectionCount: Double = js.native
  /**Gets or sets the smallest value greater than zero that .scale may take.*/
  var minScale: Double = js.native
  /**Gets or sets the Model holding data corresponding to the data-bound nodes and links of this Diagram.*/
  var model: Model = js.native
  /**Gets or sets the default selection Adornment template, used to adorn selected Parts other than Groups or Links.*/
  var nodeSelectionAdornmentTemplate: Adornment = js.native
  /**Gets or sets the default Node template used as the archetype for node data that is added to the .model.*/
  var nodeTemplate: Part = js.native
  /**Gets or sets a Map mapping template names to Parts.*/
  var nodeTemplateMap: Map[String, Part] = js.native
  /**Returns an iterator of all Nodes and Groups in the Diagram.*/
  var nodes: Iterator[Node] = js.native
  /**Gets or sets the Margin (or number for a uniform Margin) that describes the Diagram's padding, which controls how much extra space there is around the area occupied by the document.*/
  var padding: MarginLike = js.native
  /**Returns an iterator of all Parts in the Diagram that are not Nodes or Links or Adornments.*/
  var parts: Iterator[Part] = js.native
  /**Gets or sets the coordinates of this Diagram in the viewport.*/
  var position: Point = js.native
  /**Gets or sets the scale transform of this Diagram.*/
  var scale: Double = js.native
  /**Gets or sets the distance in screen pixels that the horizontal scrollbar will scroll when scrolling by a line.*/
  var scrollHorizontalLineChange: Double = js.native
  /**Gets or sets the Margin (or number for a uniform Margin) that describes a scrollable area that surrounds the document bounds, allowing the user to scroll into empty space.*/
  var scrollMargin: MarginLike = js.native
  /**Gets or sets the scrollMode of the Diagram.*/
  var scrollMode: EnumValue = js.native
  /**Gets or sets the distance in screen pixels that the vertical scrollbar will scroll when scrolling by a line.*/
  var scrollVerticalLineChange: Double = js.native
  /**This read-only property returns the read-only collection of selected Parts.*/
  var selection: Set[Part] = js.native
  /**Gets or sets whether ChangedEvents are not recorded by the UndoManager.*/
  var skipsUndoManager: Boolean = js.native
  /**This read-only property returns the ToolManager for this Diagram.*/
  var toolManager: ToolManager = js.native
  /**This Adornment is shown when the mouse stays motionless in the background.*/
  var toolTip: Adornment = js.native
    // undocumented
  var treeCollapsePolicy: EnumValue = js.native
  /**This read-only property returns the UndoManager for this Diagram, which actually belongs to the .model.*/
  var undoManager: UndoManager = js.native
  /**Gets or sets what kinds of graphs this diagram allows the user to draw.*/
  var validCycle: EnumValue = js.native
  /**This read-only property returns the bounds of the portion of the Diagram that is viewable from its HTML Canvas.*/
  var viewportBounds: Rect = js.native
  /**Gets or sets the point, in viewport coordinates, where changes to the .scale will keep the focus in the document.*/
  var zoomPoint: Point = js.native
  /**
    * Adds a Part to the Layer that matches the Part's Part.layerName, or else to the default layer, which is named with the empty string.
    * @param {Part} part
    */
  def add(part: Part): Unit = js.native
  /**
    * Register an event handler that is called when there is a ChangedEvent.
    * @param {function(ChangedEvent)} listener a function that takes a ChangedEvent as its argument.
    */
  def addChangedListener(listener: js.Function1[/* e */ ChangedEvent, Unit]): Unit = js.native
  /**
    * Register an event handler that is called when there is a DiagramEvent of a given name.
    * @param {string} name the name is normally capitalized, but this method uses case-insensitive comparison.
    * @param {function(DiagramEvent)} listener a function that takes a DiagramEvent as its argument.
    */
  def addDiagramListener(name: String, listener: js.Function1[/* e */ DiagramEvent, Unit]): Unit = js.native
  /**
    * Adds a Layer to the list of layers.
    * @param {Layer} layer The Layer to add.
    */
  def addLayer(layer: Layer): Unit = js.native
  /**
    * Adds a layer to the list of layers after a specified layer.
    * @param {Layer} layer The Layer to add.
    * @param {Layer} existingLayer The layer to insert after.
    */
  def addLayerAfter(layer: Layer, existingLayer: Layer): Unit = js.native
  /**
    * Adds a layer to the list of layers before a specified layer.
    * @param {Layer} layer The Layer to add.
    * @param {Layer} existingLayer The layer to insert before.
    */
  def addLayerBefore(layer: Layer, existingLayer: Layer): Unit = js.native
  /**
    * Register an event handler that is called when there is a ChangedEvent for the Diagram's Model.
    * @param {function(ChangedEvent)} listener a function that takes a ChangedEvent as its argument.
    */
  def addModelChangedListener(listener: js.Function1[/* e */ ChangedEvent, Unit]): Unit = js.native
  /**
    * Aligns the Diagram's .position based on a desired document Spot and viewport Spot.
    * @param {Spot} documentspot
    * @param {Spot} viewportspot
    */
  def alignDocument(documentspot: Spot, viewportspot: Spot): Unit = js.native
  /**
    * Modifies the .position to show a given Rect of the Diagram by centering the viewport on that Rect.
    * @param {Rect} r
    */
  def centerRect(r: Rect): Unit = js.native
  /**
    * Removes all Parts from the Diagram, including unbound Parts and the background grid, and also clears out the Model and UndoManager.
    */
  def clear(): Unit = js.native
  /**
    * Remove highlights from all Parts.
    */
  def clearHighlighteds(): Unit = js.native
  /**
    * Deselect all selected Parts.
    */
  def clearSelection(): Unit = js.native
  /**Gets or sets the function to execute when the user single-primary-clicks on the background of the Diagram.*/
  def click(e: InputEvent): Unit = js.native
  /**
    * Commit the changes of the current transaction.
    * This just calls UndoManager.commitTransaction.
    * @param {string=} tname a descriptive name for the transaction.
    */
  def commitTransaction(): Boolean = js.native
  def commitTransaction(tname: String): Boolean = js.native
  /**
    * This is called during a Diagram update to determine a new value for .documentBounds.
    */
  def computeBounds(): Rect = js.native
  /**
    * Find the union of the GraphObject.actualBounds of all of the Parts in the given collection.
    * @param {Iterable<Part>} coll a collection of Parts.
    */
  def computePartsBounds(coll: Iterable[Part]): Rect = js.native
  /**Gets or sets the function to execute when the user single-secondary-clicks on the background of the Diagram.*/
  def contextClick(e: InputEvent): Unit = js.native
  /**
    * Make a copy of a collection of Parts and return them in a Map mapping each original Part to its copy.
    * @param {Iterable<Part>} coll  A List or a Set or Iterator of Parts.
    * @param {Diagram} diagram  The destination diagram; if null, the copied parts are not added to this diagram.
    * @param {boolean} check  Whether to check Part.canCopy on each part.
    */
  def copyParts(coll: Iterable[Part], diagram: Diagram, check: Boolean): Unit = js.native
  /**
    * Updates the diagram immediately, then resets initialization flags so that actions taken in the argument function will be considered part of Diagram initialization, and will participate in initial layouts, .initialAutoScale, .initialContentAlignment, etc.
    * @param {function()|null=} func an optional function of actions to perform as part of another diagram initialization.
    */
  def delayInitialization(): Unit = js.native
  def delayInitialization(func: js.Function0[Unit]): Unit = js.native
  /**Gets or sets the function to execute when the user double-primary-clicks on the background of the Diagram.*/
  def doubleClick(e: InputEvent): Unit = js.native
  /**
    * Finds a layer with a given name.
    * @param {string} name
    */
  def findLayer(name: String): Layer = js.native
  /**
    * Look for a Link corresponding to a GraphLinksModel's link data object.
    * @param {Object} linkdata
    */
  def findLinkForData(linkdata: js.Object): Link = js.native
  /**
    * Return a collection of Links that are bound to data whose properties have values
    * that match those specified by the given example data.
    * @param {...Object} examples
    */
  def findLinksByExample(examples: js.Object*): Iterator[Link] = js.native
  /**
    * Look for a Node or Group corresponding to a model's node data object.
    * @param {Object} nodedata
    */
  def findNodeForData(nodedata: js.Object): Node = js.native
  /**
    * Look for a Node or Group corresponding to a model's node data object's unique key.
    * @param {*} key a string or number.
    */
  def findNodeForKey(key: Key): Node = js.native
  /**
    * Return a collection of Nodes and Groups that are bound to data whose properties have values
    * that match those specified by the given example data.
    * @param {...Object} examples
    */
  def findNodesByExample(examples: js.Object*): Iterator[Node] = js.native
  /**
    * Find the front-most GraphObject at the given point in document coordinates.
    * @param {Point} p A Point in document coordinates.
    * @param {function(GraphObject):GraphObject | null=} navig A function taking a GraphObject and
    * returning a GraphObject, defaulting to the identity.
    * @param {function(GraphObject):boolean | null=} pred A function taking the GraphObject
    * returned by navig and returning true if that object should be returned,
    * defaulting to a predicate that always returns true.
    */
  def findObjectAt(p: Point): GraphObject = js.native
  def findObjectAt(p: Point, navig: js.Function1[/* obj */ GraphObject, GraphObject]): GraphObject = js.native
  def findObjectAt(
    p: Point,
    navig: js.Function1[/* obj */ GraphObject, GraphObject],
    pred: js.Function1[/* obj */ GraphObject, Boolean]
  ): GraphObject = js.native
  def findObjectsAt(p: Point): Set[GraphObject] = js.native
  def findObjectsAt(p: Point, navig: js.Function1[/* obj */ GraphObject, GraphObject]): Set[GraphObject] = js.native
  def findObjectsAt(
    p: Point,
    navig: js.Function1[/* obj */ GraphObject, GraphObject],
    pred: js.Function1[/* obj */ GraphObject, Boolean]
  ): Set[GraphObject] = js.native
  def findObjectsAt(
    p: Point,
    navig: js.Function1[/* obj */ GraphObject, GraphObject],
    pred: js.Function1[/* obj */ GraphObject, Boolean],
    coll: List[GraphObject]
  ): List[GraphObject] = js.native
  def findObjectsAt(
    p: Point,
    navig: js.Function1[/* obj */ GraphObject, GraphObject],
    pred: js.Function1[/* obj */ GraphObject, Boolean],
    coll: Set[GraphObject]
  ): Set[GraphObject] = js.native
  /**
    * Return a collection of the GraphObjects at the given point in document coordinates.
    * @param {Point} p A Point in document coordinates.
    * @param {function(GraphObject):GraphObject | null=} navig A function taking a GraphObject and
    * returning a GraphObject, defaulting to the identity.
    * If this function returns null, the given GraphObject will not be included in the results.
    * @param {function(GraphObject):boolean | null=} pred A function taking the GraphObject
    * returned by navig and returning true if that object should be returned,
    * defaulting to a predicate that always returns true.
    * @param {List|Set=} coll An optional collection (List or Set) to add the results to.
    */
  @JSName("findObjectsAt")
  def findObjectsAt_List(p: Point): List[GraphObject] = js.native
  @JSName("findObjectsAt")
  def findObjectsAt_List(p: Point, navig: js.Function1[/* obj */ GraphObject, GraphObject]): List[GraphObject] = js.native
  @JSName("findObjectsAt")
  def findObjectsAt_List(
    p: Point,
    navig: js.Function1[/* obj */ GraphObject, GraphObject],
    pred: js.Function1[/* obj */ GraphObject, Boolean]
  ): List[GraphObject] = js.native
  def findObjectsIn(r: Rect): Set[GraphObject] = js.native
  def findObjectsIn(r: Rect, navig: js.Function1[/* obj */ GraphObject, GraphObject]): Set[GraphObject] = js.native
  def findObjectsIn(
    r: Rect,
    navig: js.Function1[/* obj */ GraphObject, GraphObject],
    pred: js.Function1[/* obj */ GraphObject, Boolean]
  ): Set[GraphObject] = js.native
  def findObjectsIn(
    r: Rect,
    navig: js.Function1[/* obj */ GraphObject, GraphObject],
    pred: js.Function1[/* obj */ GraphObject, Boolean],
    partialInclusion: Boolean
  ): Set[GraphObject] = js.native
  def findObjectsIn(
    r: Rect,
    navig: js.Function1[/* obj */ GraphObject, GraphObject],
    pred: js.Function1[/* obj */ GraphObject, Boolean],
    partialInclusion: Boolean,
    coll: List[GraphObject]
  ): List[GraphObject] = js.native
  def findObjectsIn(
    r: Rect,
    navig: js.Function1[/* obj */ GraphObject, GraphObject],
    pred: js.Function1[/* obj */ GraphObject, Boolean],
    partialInclusion: Boolean,
    coll: Set[GraphObject]
  ): Set[GraphObject] = js.native
  /**
    * Returns a collection of all GraphObjects that are inside or that intersect a given Rect in document coordinates.
    * @param {Rect} r A Rect in document coordinates.
    * @param {function(GraphObject):GraphObject | null=} navig A function taking a GraphObject and
    * returning a GraphObject, defaulting to the identity.
    * If this function returns null, the given GraphObject will not be included in the results.
    * @param {function(GraphObject):boolean | null=} pred A function taking the GraphObject
    * returned by navig and returning true if that object should be returned,
    * defaulting to a predicate that always returns true.
    * @param {boolean=} partialInclusion Whether an object can match if it merely intersects the rectangular area (true) or
    * if it must be entirely inside the rectangular area (false).  The default value is false.
    * @param {List|Set=} coll An optional collection (List or Set) to add the results to.
    */
  @JSName("findObjectsIn")
  def findObjectsIn_List(r: Rect): List[GraphObject] = js.native
  @JSName("findObjectsIn")
  def findObjectsIn_List(r: Rect, navig: js.Function1[/* obj */ GraphObject, GraphObject]): List[GraphObject] = js.native
  @JSName("findObjectsIn")
  def findObjectsIn_List(
    r: Rect,
    navig: js.Function1[/* obj */ GraphObject, GraphObject],
    pred: js.Function1[/* obj */ GraphObject, Boolean]
  ): List[GraphObject] = js.native
  @JSName("findObjectsIn")
  def findObjectsIn_List(
    r: Rect,
    navig: js.Function1[/* obj */ GraphObject, GraphObject],
    pred: js.Function1[/* obj */ GraphObject, Boolean],
    partialInclusion: Boolean
  ): List[GraphObject] = js.native
  def findObjectsNear(p: Point, dist: Double): Set[GraphObject] = js.native
  def findObjectsNear(p: Point, dist: Double, navig: js.Function1[/* obj */ GraphObject, GraphObject]): Set[GraphObject] = js.native
  def findObjectsNear(
    p: Point,
    dist: Double,
    navig: js.Function1[/* obj */ GraphObject, GraphObject],
    pred: js.Function1[/* obj */ GraphObject, Boolean]
  ): Set[GraphObject] = js.native
  def findObjectsNear(
    p: Point,
    dist: Double,
    navig: js.Function1[/* obj */ GraphObject, GraphObject],
    pred: js.Function1[/* obj */ GraphObject, Boolean],
    partialInclusion: Boolean
  ): Set[GraphObject] = js.native
  def findObjectsNear(
    p: Point,
    dist: Double,
    navig: js.Function1[/* obj */ GraphObject, GraphObject],
    pred: js.Function1[/* obj */ GraphObject, Boolean],
    partialInclusion: Boolean,
    coll: List[GraphObject]
  ): List[GraphObject] = js.native
  def findObjectsNear(
    p: Point,
    dist: Double,
    navig: js.Function1[/* obj */ GraphObject, GraphObject],
    pred: js.Function1[/* obj */ GraphObject, Boolean],
    partialInclusion: Boolean,
    coll: Set[GraphObject]
  ): Set[GraphObject] = js.native
  /**
    * Returns a collection of all GraphObjects that are within a certain distance of a given point in document coordinates.
    * @param {Point} p A Point in document coordinates.
    * @param {number} dist The distance from the point.
    * @param {function(GraphObject):GraphObject | null=} navig A function taking a GraphObject and
    * returning a GraphObject, defaulting to the identity.
    * If this function returns null, the given GraphObject will not be included in the results.
    * @param {function(GraphObject):boolean | null=} pred A function taking the GraphObject
    * returned by navig and returning true if that object should be returned,
    * defaulting to a predicate that always returns true.
    * @param {boolean=} partialInclusion Whether an object can match if it merely intersects the circular area (true) or
    * if it must be entirely inside the circular area (false).  The default value is true.
    * The default is true.
    * @param {List|Set=} coll An optional collection (List or Set) to add the results to.
    */
  @JSName("findObjectsNear")
  def findObjectsNear_List(p: Point, dist: Double): List[GraphObject] = js.native
  @JSName("findObjectsNear")
  def findObjectsNear_List(p: Point, dist: Double, navig: js.Function1[/* obj */ GraphObject, GraphObject]): List[GraphObject] = js.native
  @JSName("findObjectsNear")
  def findObjectsNear_List(
    p: Point,
    dist: Double,
    navig: js.Function1[/* obj */ GraphObject, GraphObject],
    pred: js.Function1[/* obj */ GraphObject, Boolean]
  ): List[GraphObject] = js.native
  @JSName("findObjectsNear")
  def findObjectsNear_List(
    p: Point,
    dist: Double,
    navig: js.Function1[/* obj */ GraphObject, GraphObject],
    pred: js.Function1[/* obj */ GraphObject, Boolean],
    partialInclusion: Boolean
  ): List[GraphObject] = js.native
  /**
    * This convenience function finds the front-most Part that is at a given point and that might be selectable.
    * @param {Point} p a Point in document coordinates.
    * @param {boolean} selectable Whether to only consider parts that are Part.selectable.
    */
  def findPartAt(p: Point, selectable: Boolean): Part = js.native
  /**
    * Look for a Part, Node, Group, or Link corresponding to a Model's data object.
    * @param {Object} data
    */
  def findPartForData(data: js.Object): Part = js.native
  /**
    * Look for a Part or Node or Group corresponding to a model's data object's unique key.
    * @param {*} key a string or number.
    */
  def findPartForKey(key: Key): Part = js.native
  /**
    * Returns an iterator of all Groups that are at top-level, in other words that are not themselves inside other Groups.
    */
  def findTopLevelGroups(): Iterator[Group] = js.native
  /**
    * Returns an iterator of all top-level Nodes that have no tree parents.
    */
  def findTreeRoots(): Iterator[Node] = js.native
  /**
    * Explicitly bring focus to the Diagram's canvas.
    */
  def focus(): Unit = js.native
    // undocumented
  def getInputOption(name: String): js.Any = js.native
    // undocumented
  def getRenderingHint(name: String): js.Any = js.native
  /**
    * Make the given part the only highlighted part.
    * @param {Part} part
    */
  def highlight(part: Part): Unit = js.native
  def highlightCollection(coll: js.Array[Part]): Unit = js.native
  /**
    * Highlight all of the Parts supplied in the given collection, and clear all other highlighted Parts.
    * @param {Iterable<Part>|Array<Part>} coll an Iterable of Parts
    */
  def highlightCollection(coll: Iterable[Part]): Unit = js.native
  /**
    * Perform all invalid layouts.
    * @param {boolean=} invalidateAll If true, this will explicitly set Layout.isValidLayout to false on each Layout in the diagram.
    */
  def layoutDiagram(): Unit = js.native
  def layoutDiagram(invalidateAll: Boolean): Unit = js.native
  /**
    * Create an HTMLImageElement that contains a bitmap of the current Diagram.
    * @param {Object=} properties For details see the argument description of .makeImageData.
    */
  def makeImage(): HTMLImageElement = js.native
  def makeImage(properties: AnonBackground): HTMLImageElement = js.native
  /**
    * Create a bitmap of the current Diagram encoded as a base64 string.
    * @param {Object=} properties a JavaScript object detailing optional arguments for image creation, to be passed to makeImageData.
    */
  def makeImageData(): String = js.native
  def makeImageData(properties: AnonBackground): String = js.native
  /**
    * Create an SVGElement that contains a SVG rendering of the current Diagram.
    * By default this method returns a snapshot of the visible diagram, but optional arguments give more options.
    * @param {Object=} properties a JavaScript object detailing optional arguments for SVG creation.
    * @return {SVGElement}
    */
  def makeSvg(): SVGElement = js.native
  def makeSvg(properties: AnonDocument): SVGElement = js.native
    // undocumented
  def maybeUpdate(): Unit = js.native
  /**Gets or sets the function to execute when the user is dragging the selection in the background of the Diagram during a DraggingTool drag-and-drop, not over any GraphObjects.*/
  def mouseDragOver(e: InputEvent): Unit = js.native
  /**Gets or sets the function to execute when the user drops the selection in the background of the Diagram at the end of a DraggingTool drag-and-drop, not onto any GraphObjects.*/
  def mouseDrop(e: InputEvent): Unit = js.native
  /**Gets or sets the function to execute when the user holds the mouse stationary in the background of the Diagram while holding down a button, not over any GraphObjects.*/
  def mouseHold(e: InputEvent): Unit = js.native
  /**Gets or sets the function to execute when the user holds the mouse stationary in the background of the Diagram without holding down any buttons, not over any GraphObjects.*/
  def mouseHover(e: InputEvent): Unit = js.native
  /**Gets or sets the function to execute when the user moves the mouse in the background of the Diagram without holding down any buttons, not over any GraphObjects.*/
  def mouseOver(e: InputEvent): Unit = js.native
  /**
    * Move a collection of Parts in this Diagram by a given offset.
    * @param {Iterable<Part>} coll  A List or a Set or Iterator of Parts.
    * @param {Point} offset  the X and Y change to be made to each Part, in document coordinates.
    * @param {boolean} check  Whether to check Part.canMove on each part.
    */
  def moveParts(coll: Iterable[Part], offset: Point, check: Boolean): Unit = js.native
  /**Gets or sets the function used to determine the position that this Diagram can be scrolled or moved to.*/
  def positionComputation(d: Diagram, p: Point): Point = js.native
  /**
    * Remove all of the Parts created from model data and then create them again.
    */
  def rebuildParts(): Unit = js.native
  /**
    * Removes a Part from its Layer, provided the Layer is in this Diagram.
    * @param {Part} part
    */
  def remove(part: Part): Unit = js.native
  /**
    * Unregister an event handler listener.
    * @param {function(ChangedEvent)} listener a function that takes a ChangedEvent as its argument.
    */
  def removeChangedListener(listener: js.Function1[/* e */ ChangedEvent, Unit]): Unit = js.native
  /**
    * Unregister a DiagramEvent handler.
    * @param {string} name the name is normally capitalized, but this method uses case-insensitive comparison.
    * @param {function(DiagramEvent)} listener a function that takes a DiagramEvent as its argument.
    */
  def removeDiagramListener(name: String, listener: js.Function1[/* e */ DiagramEvent, Unit]): Unit = js.native
  /**
    * Removes the given layer from the list of layers.
    * @param {Layer} layer
    */
  def removeLayer(layer: Layer): Unit = js.native
  /**
    * Unregister an event handler listener for the Diagram's Model.
    * @param {function(ChangedEvent)} listener a function that takes a ChangedEvent as its argument.
    */
  def removeModelChangedListener(listener: js.Function1[/* e */ ChangedEvent, Unit]): Unit = js.native
  def removeParts(coll: js.Array[Part], check: Boolean): Unit = js.native
  /**
    * This method removes from this Diagram all of the Parts in a collection.
    * @param {Iterable<Part>|Array<Part>} coll A List or Set or Iterator of Parts.
    * @param {boolean} check Whether to check Part.canDelete on each part.
    */
  def removeParts(coll: Iterable[Part], check: Boolean): Unit = js.native
  /**
    * Requests that in the near-future the diagram makes sure all GraphObjects are arranged,
    * recomputes the document bounds, updates the scrollbars, and redraws the viewport.
    * Usage of this method is uncommon and may affect performance --
    * for efficiency do not call this method unless you have a well-defined need.
    * Normally, GoJS updates the diagram automatically, and completeing a transaction ensures an immediate update.
    * <p>
    * @param {boolean=} alwaysQueueUpdate If true the Diagram will queue another update,
    * even if an update is already occurring. The default value is false.
    * Side effects in an "InitialLayoutCompleted" DiagramEvent listener might necessitate setting this parameter.
    */
  def requestUpdate(): Unit = js.native
  def requestUpdate(alwaysQueueUpdate: Boolean): Unit = js.native
    // undocumented
  def reset(): Unit = js.native
  /**
    * Rollback the current transaction, undoing any recorded changes.
    * This just calls UndoManager.rollbackTransaction.
    */
  def rollbackTransaction(): Boolean = js.native
  /**Gets or sets the function used to determine the scale that this Diagram can be set to.*/
  def scaleComputation(d: Diagram, s: Double): Double = js.native
  /**
    * Scrolling function used by primarily by .commandHandler's CommandHandler.doKeyDown.
    * @param {string} unit A string representing the unit of the scroll operation. Can be 'pixel', 'line', or 'page'.
    * @param {string} dir The direction of the scroll operation. Can be 'up', 'down', 'left', or 'right'.
    * @param {number=} dist An optional distance multiplier, for multiple pixels, lines, or pages. Default is 1.
    */
  def scroll(unit: String, dir: String): Unit = js.native
  def scroll(unit: String, dir: String, dist: Double): Unit = js.native
  /**
    * Modifies the .position to show a given Rect of the Diagram by centering the viewport on that Rect.
    * @param {Rect} r
    */
  def scrollToRect(r: Rect): Unit = js.native
  /**
    * Make the given object the only selected object.
    * @param {GraphObject} part a GraphObject that is already in a layer of this Diagram.
    * If the value is null, this does nothing.
    */
  def select(part: Part): Unit = js.native
  def selectCollection(coll: js.Array[Part]): Unit = js.native
  /**
    * Select all of the Parts supplied in the given collection.
    * @param {Iterable<Part>|Array<Part>} coll a List or Set of Parts to be selected.
    */
  def selectCollection(coll: Iterable[Part]): Unit = js.native
    // undocumented
  def setInputOption(name: String, `val`: js.Any): Unit = js.native
  /**
    * This method sets a collection of properties according to the property/value pairs that have been set on the given Object,
    * in the same manner as GraphObject.make does when constructing a Diagram with an argument that is a simple JavaScript Object.
    */
  def setProperties(props: js.Object): Unit = js.native
    // undocumented
  def setRenderingHint(name: String, `val`: js.Any): Unit = js.native
    // undocumented
  def simulatedMouseMove(e: Event_, modelpt: Point): Boolean = js.native
  def simulatedMouseMove(e: Event_, modelpt: Point, overdiag: Diagram): Boolean = js.native
    // undocumented
  def simulatedMouseUp(e: Event_, other: Diagram, modelpt: Point): Boolean = js.native
  def simulatedMouseUp(e: Event_, other: Diagram, modelpt: Point, curdiag: Diagram): Boolean = js.native
  /**
    * Begin a transaction, where the changes are held by a Transaction object in the UndoManager.
    * This just calls UndoManager.startTransaction.
    * @param {string=} tname a descriptive name for the transaction.
    */
  def startTransaction(): Boolean = js.native
  def startTransaction(tname: String): Boolean = js.native
  /**
    * Given a Point in document coordinates, return a new Point in viewport coordinates.
    * @param {Point} p
    */
  def transformDocToView(p: Point): Point = js.native
  /**
    * Given a point in viewport coordinates, return a new point in document coordinates.
    * @param {Point} p
    */
  def transformViewToDoc(p: Point): Point = js.native
  /**
    * Update all of the references to nodes in case they had been modified in the model without
    * properly notifying the model by calling GraphLinksModel.setGroupKeyForNodeData or
    * GraphLinksModel.setToKeyForLinkData or other similar methods.
    */
  def updateAllRelationshipsFromData(): Unit = js.native
  /**
    * Update all of the data-bound properties of Nodes and Links in this diagram.
    */
  def updateAllTargetBindings(): Unit = js.native
  /**
    * Scales the Diagram to uniformly fit into the viewport.
    */
  def zoomToFit(): Unit = js.native
  /**
    * Modifies the .scale and .position of the Diagram so that the viewport displays a given document-coordinates rectangle.
    * @param {Rect} r rectangular bounds in document coordinates.
    * @param {EnumValue=} scaling an optional value of either .Uniform (the default) or .UniformToFill.
    */
  def zoomToRect(r: Rect): Unit = js.native
  def zoomToRect(r: Rect, scaling: EnumValue): Unit = js.native
}

/* static members */
@JSImport("go", "Diagram")
@js.native
object Diagram extends js.Object {
    // undocumented
  /** This value for Diagram.treeCollapsePolicy states that all of the Node.findNodesInto or Node.findNodesOutOf, depending on Diagram.isTreePathToChildren being true or false, need to be not Node.isTreeExpanded in order for a "child" node to be not visible.*/
  var AllParentsCollapsed: EnumValue = js.native
  /**This value for Diagram.validCycle states that there are no restrictions on making cycles of links.*/
  var CycleAll: EnumValue = js.native
  /**This value for Diagram.validCycle states that any number of destination links may go out of a node, but at most one source link may come into a node, and there are no directed cycles.*/
  var CycleDestinationTree: EnumValue = js.native
  /**This value for Diagram.validCycle states that a valid link from a node will not produce a directed cycle in the graph.*/
  var CycleNotDirected: EnumValue = js.native
  /**This value for Diagram.validCycle states that a valid link from a node will not produce an undirected cycle in the graph.*/
  var CycleNotUndirected: EnumValue = js.native
  /**This value for Diagram.validCycle states that any number of source links may come into a node, but at most one destination link may go out of a node, and there are no directed cycles.*/
  var CycleSourceTree: EnumValue = js.native
  /**This value for Diagram.scrollMode states that the viewport constrains scrolling to the Diagram document bounds.*/
  var DocumentScroll: EnumValue = js.native
  /**This value for Diagram.scrollMode states that the viewport does not constrain scrolling to the Diagram document bounds.*/
  var InfiniteScroll: EnumValue = js.native
  /**The default autoScale type, used as the value of Diagram.autoScale: The Diagram does not attempt to scale its bounds to fit the view.*/
  var None: EnumValue = js.native
  /** This value for Diagram.treeCollapsePolicy states that only the Node.findTreeParentNode's Node.isTreeExpanded property determines whether a "child" node is visible.*/
  var TreeParentCollapsed: EnumValue = js.native
  /**Diagrams with this autoScale type, used as the value of Diagram.autoScale, are scaled uniformly until the documentBounds fits in the view.*/
  var Uniform: EnumValue = js.native
  /**Diagrams with this autoScale type, used as the value of Diagram.autoScale, are scaled uniformly until the documentBounds fits in the view.*/
  var UniformToFill: EnumValue = js.native
  /**
    * This static function gets the Diagram that is attached to an HTML DIV element.
    * @param {HTMLDivElement} div
    */
  def fromDiv(div: HTMLDivElement): Diagram = js.native
  /**
    * This static function declares that a class (constructor function) derives from another class -- but please note that most classes do not support inheritance.
    * @param {Function} derivedclass
    * @param {Function} baseclass
    */
  def inherit(derivedclass: Constructor, baseclass: Constructor): Unit = js.native
}

