package typings.go.mod

import typings.std.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Diagram.commandHandler implements various
  * commands such as CommandHandler.deleteSelection or CommandHandler.redo.
  * The CommandHandler includes keyboard event handling to interpret
  * key presses as commands.
  */
@JSImport("go", "CommandHandler")
@js.native
/**
  * The constructor produces a CommandHandler with the default key bindings.
  */
class CommandHandler () extends StObject {
  
  /**
    * Make sure all of the unnested Parts in the given collection are removed from any containing Groups.
    * @param {Iterable<Part>} coll a collection of Parts.
    * @param {boolean=} check whether to call .isValidMember to confirm that changing the Part to be a top-level Part is valid.
    */
  def addTopLevelParts(coll: Iterable[Part]): Boolean = js.native
  def addTopLevelParts(coll: Iterable[Part], check: Boolean): Boolean = js.native
  
  /**Gets or sets a data object that is copied by .groupSelection when creating a new Group. The default value is null. The value must be an Object or null.*/
  var archetypeGroupData: js.Any = js.native
  
  /**
    * This predicate controls whether the user can collapse expanded Groups.
    * @param {Group=} group if supplied, ignore the selection and consider collapsing this particular Group.
    */
  def canCollapseSubGraph(): Boolean = js.native
  def canCollapseSubGraph(group: Group): Boolean = js.native
  
  /**
    * This predicate controls whether the user can collapse expanded subtrees of Nodes.
    * @param {Node=} node if supplied, ignore the selection and consider collapsing this particular Node.
    */
  def canCollapseTree(): Boolean = js.native
  def canCollapseTree(node: Node): Boolean = js.native
  
  /**
    * This predicate controls whether or not the user can invoke the .copySelection command.
    */
  def canCopySelection(): Boolean = js.native
  
  /**
    * This predicate controls whether or not the user can invoke the .cutSelection command.
    */
  def canCutSelection(): Boolean = js.native
  
  /**
    * This predicate controls whether or not the user can invoke the .decreaseZoom command.
    * @param {number=} factor This defaults to 1/.zoomFactor.  The value should be less than one.
    */
  def canDecreaseZoom(): Boolean = js.native
  def canDecreaseZoom(factor: Double): Boolean = js.native
  
  /**
    * This predicate controls whether or not the user can invoke the .deleteSelection command.
    */
  def canDeleteSelection(): Boolean = js.native
  
  /**
    * This predicate controls whether or not the user can invoke the .editTextBlock command.
    * @param {TextBlock=} textblock the TextBlock to consider editing.
    */
  def canEditTextBlock(): Boolean = js.native
  def canEditTextBlock(textblock: TextBlock): Boolean = js.native
  
  /**
    * This predicate controls whether the user can expand collapsed Groups.
    * @param {Group=} group if supplied, ignore the selection and consider expanding this particular Group.
    */
  def canExpandSubGraph(): Boolean = js.native
  def canExpandSubGraph(group: Group): Boolean = js.native
  
  /**
    * This predicate controls whether the user can expand collapsed subtrees of Nodes.
    * @param {Node=} node if supplied, ignore the selection and consider expanding this particular Node.
    */
  def canExpandTree(): Boolean = js.native
  def canExpandTree(node: Node): Boolean = js.native
  
  /**
    * This predicate controls whether or not the user can invoke the .groupSelection command.
    */
  def canGroupSelection(): Boolean = js.native
  
  /**
    * This predicate controls whether or not the user can invoke the .increaseZoom command.
    * @param {number=} factor This defaults to .zoomFactor.  The value should be greater than one.
    */
  def canIncreaseZoom(): Boolean = js.native
  def canIncreaseZoom(factor: Double): Boolean = js.native
  
  /**
    * This predicate controls whether or not the user can invoke the .pasteSelection command.
    */
  def canPasteSelection(): Boolean = js.native
  
  /**
    * This predicate controls whether or not the user can invoke the .redo command.
    */
  def canRedo(): Boolean = js.native
  
  /**
    * This predicate controls whether or not the user can invoke the .resetZoom command.
    * @param {number=} newscale This defaults to 1.  The value should be greater than zero.
    */
  def canResetZoom(): Boolean = js.native
  def canResetZoom(newscale: Double): Boolean = js.native
  
  /**
    * This predicate controls whether or not the user can invoke the scrollToPart command.
    * This returns false if there is no argument Part and there are no selected Parts.
    * @this {CommandHandler}
    * @param {Part=} part This defaults to the first selected Part of Diagram.selection
    * @return {boolean}
    * This returns true if Diagram.allowHorizontalScroll and Diagram.allowVerticalScroll are true.
    */
  def canScrollToPart(): Boolean = js.native
  def canScrollToPart(part: Part): Boolean = js.native
  
  /**
    * This predicate controls whether or not the user can invoke the .selectAll command.
    */
  def canSelectAll(): Boolean = js.native
  
  /**
    * This predicate controls whether or not the user can invoke the .showContextMenu command.
    * @param {GraphObject|Diagram=} obj a GraphObject or Diagram with a contextMenu defined.
    * If none is given, this method will use the first selected object, or else the Diagram.
    */
  def canShowContextMenu(): Boolean = js.native
  def canShowContextMenu(obj: Diagram): Boolean = js.native
  def canShowContextMenu(obj: GraphObject): Boolean = js.native
  
  /**
    * This predicate controls whether the user may stop the current tool.
    */
  def canStopCommand(): Boolean = js.native
  
  /**
    * This predicate controls whether or not the user can invoke the .undo command.
    */
  def canUndo(): Boolean = js.native
  
  /**
    * This predicate controls whether or not the user can invoke the .ungroupSelection command.
    * @param {Group=} group if supplied, ignore the selection and consider ungrouping this particular Group.
    */
  def canUngroupSelection(): Boolean = js.native
  def canUngroupSelection(group: Group): Boolean = js.native
  
  /**
    * This predicate controls whether or not the user can invoke the .zoomToFit command.
    */
  def canZoomToFit(): Boolean = js.native
  
  /**
    * Collapse all expanded selected Groups.
    * @param {Group=} group if supplied, ignore the selection and collapse this particular Group.
    */
  def collapseSubGraph(): Unit = js.native
  def collapseSubGraph(group: Group): Unit = js.native
  
  /**
    * Collapse all expanded selected Nodes.
    * @param {Node=} node if supplied, ignore the selection and collapse this particular Node subtree.
    */
  def collapseTree(): Unit = js.native
  def collapseTree(node: Node): Unit = js.native
  
  /**Gets or sets whether copySelection should also copy Links that connect with selected Nodes.*/
  var copiesConnectedLinks: Boolean = js.native
  
  /**Gets or sets whether copySelection and copyToClipboard copy the node data property whose value is the containing group data's key. The default value is false.*/
  var copiesGroupKey: Boolean = js.native
  
  /**Gets or sets whether copySelection and copyToClipboard copy the node data property whose value is the tree-parent node data's key. The default value is false.*/
  var copiesParentKey: Boolean = js.native
  
  /**Gets or sets whether .copySelection should also copy subtrees. The default value is false.*/
  var copiesTree: Boolean = js.native
  
  /**
    * Copy the currently selected parts, Diagram.selection, from the Diagram into the clipboard.
    */
  def copySelection(): Unit = js.native
  
  /**
    * This makes a copy of the given collection of Parts and stores it in a static variable acting as the clipboard.
    * @param {Iterable<Part>} coll A collection of Parts.
    */
  def copyToClipboard(coll: Iterable[Part]): Unit = js.native
  
  /**
    * Execute a .copySelection followed by a .deleteSelection.
    */
  def cutSelection(): Unit = js.native
  
  /**
    * Decrease the Diagram.scale by a given factor.
    * @param {number=} factor This defaults to 1/.zoomFactor.  The value should be less than one.
    */
  def decreaseZoom(): Unit = js.native
  def decreaseZoom(factor: Double): Unit = js.native
  
  /**Gets or sets the Diagram.scale set by resetZoom. The default value is 1.0.*/
  var defaultScale: Double = js.native
  
  /**
    * Delete the currently selected parts from the diagram.
    */
  def deleteSelection(): Unit = js.native
  
  /**Gets or sets whether .deleteSelection should also delete links that are connected with deleted nodes. The default value is true.*/
  var deletesConnectedLinks: Boolean = js.native
  
  /**Gets or sets whether .deleteSelection should also delete subtrees. The default value is false.*/
  var deletesTree: Boolean = js.native
  
  /**This read-only property returns the Diagram that is using this CommandHandler.*/
  var diagram: Diagram = js.native
  
  /**
    * This is called by tools to handle keyboard commands.
    */
  def doKeyDown(): Unit = js.native
  
  /**
    * This is called by tools to handle keyboard commands.
    */
  def doKeyUp(): Unit = js.native
  
  /**
    * Start in-place editing of a TextBlock in the selected Part.
    * @param {TextBlock=} textblock the TextBlock to start editing.
    */
  def editTextBlock(): Unit = js.native
  def editTextBlock(textblock: TextBlock): Unit = js.native
  
  /**
    * Expand all collapsed selected Groups.
    * @param {Group=} group if supplied, ignore the selection and expand this particular Group.
    */
  def expandSubGraph(): Unit = js.native
  def expandSubGraph(group: Group): Unit = js.native
  
  /**
    * Expand all collapsed selected Nodes.
    * @param {Node=} node if supplied, ignore the selection and collapse this particular Node subtree.
    */
  def expandTree(): Unit = js.native
  def expandTree(node: Node): Unit = js.native
  
  /**
    * Add a copy of .archetypeGroupData and add it to the diagram's model to create a new Group and then add the selected Parts to that new group.
    */
  def groupSelection(): Unit = js.native
  
  /**
    * Increase the Diagram.scale by a given factor.
    * @param {number=} factor This defaults to .zoomFactor.  The value should be greater than one.
    */
  def increaseZoom(): Unit = js.native
  def increaseZoom(factor: Number): Unit = js.native
  
  /**
    * This predicate is called to determine whether a Node may be added as a member of a Group.
    * @param {Group} group this may be null if the node is being added as a top-level node.
    * @param {Part} part a Part, usually a Node, possibly another Group, but not a Link or an Adornment.
    */
  def isValidMember(group: Group, part: Part): Boolean = js.native
  
  /**Gets or sets the predicate that determines whether or not a node may become a member of a group. The default predicate is null, which is equivalent to simply returning true.*/
  def memberValidation(g: Group, p: Part): Boolean = js.native
  
  /**
    * If the clipboard holds a collection of Parts, and if the Model.dataFormat matches that stored in the clipboard, this makes a copy of the clipboard's parts and adds the copies to this Diagram.
    */
  def pasteFromClipboard(): Set[Part] = js.native
  
  /**
    * Copy the contents of the clipboard into this diagram, and make those new parts the new selection.
    * @param {Point=} pos Point at which to center the newly pasted parts; if not present the parts are not moved.
    */
  def pasteSelection(): Unit = js.native
  def pasteSelection(pos: Point): Unit = js.native
  
  /**
    * Call UndoManager.redo.
    */
  def redo(): Unit = js.native
  
  /**
    * Set the Diagram.scale to a new scale value, by default 1.
    * @param {number=} newscale This defaults to 1.  The value should be greater than zero.
    */
  def resetZoom(): Unit = js.native
  def resetZoom(newscale: Double): Unit = js.native
  
  /**
    * This command scrolls the diagram to make a highlighted or selected Part visible in the viewport.
    * Call this command repeatedly to cycle through the Diagram.highlighteds collection,
    * if there are any Parts in that collection, or else in the Diagram.selection collection,
    * scrolling to each one in turn.
    * <p>
    * This is normally invoked by the <code>Space</code> keyboard shortcut.
    * If there is no argument and there is no highlighted or selected Part, this command does nothing.
    * @expose
    * @this {CommandHandler}
    * @param {Part=} part This defaults to the first highlighted Part of Diagram.highlighteds,
    *                     or, if there are no highlighted Parts, the first selected Part.
    */
  def scrollToPart(): Unit = js.native
  def scrollToPart(part: Part): Unit = js.native
  
  /**
    * Select all of the selectable Parts in the diagram.
    */
  def selectAll(): Unit = js.native
  
  /**
    * Open the context menu of a given GraphObject.
    * The given GraphObject must have a GraphObject.contextMenu
    * defined in order to show anything.
    * @param {GraphObject|Diagram=} obj a GraphObject or Diagram with a contextMenu defined.
    * If none is given, this method will use the first selected object, or else the Diagram.
    */
  def showContextMenu(): Unit = js.native
  def showContextMenu(obj: Diagram): Unit = js.native
  def showContextMenu(obj: GraphObject): Unit = js.native
  
  /**
    * Cancel the operation of the current tool.
    */
  def stopCommand(): Unit = js.native
  
  /**
    * Call UndoManager.undo.
    */
  def undo(): Unit = js.native
  
  /**
    * Remove the group from the diagram without removing its members from the diagram.
    * @param {Group=} group if supplied, ignore the selection and consider ungrouping this particular Group.
    */
  def ungroupSelection(): Unit = js.native
  def ungroupSelection(group: Group): Unit = js.native
  
  /**Gets or sets the amount by which .decreaseZoom and .increaseZoom change the Diagram.scale. The default value is 1.05 (5%).*/
  var zoomFactor: Double = js.native
  
  /**
    * Change the Diagram.scale so that the Diagram.documentBounds fits within the viewport.
    */
  def zoomToFit(): Unit = js.native
}
