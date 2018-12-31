package typings
package goLib.goMod.goNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Diagram.commandHandler implements various
  * commands such as CommandHandler.deleteSelection or CommandHandler.redo.
  * The CommandHandler includes keyboard event handling to interpret
  * key presses as commands.
  */
@js.native
trait CommandHandler extends js.Object {
  /**Gets or sets a data object that is copied by .groupSelection when creating a new Group. The default value is null. The value must be an Object or null.*/
  var archetypeGroupData: js.Any = js.native
  /**Gets or sets whether copySelection should also copy Links that connect with selected Nodes.*/
  var copiesConnectedLinks: scala.Boolean = js.native
  /**Gets or sets whether copySelection and copyToClipboard copy the node data property whose value is the containing group data's key. The default value is false.*/
  var copiesGroupKey: scala.Boolean = js.native
  /**Gets or sets whether copySelection and copyToClipboard copy the node data property whose value is the tree-parent node data's key. The default value is false.*/
  var copiesParentKey: scala.Boolean = js.native
  /**Gets or sets whether .copySelection should also copy subtrees. The default value is false.*/
  var copiesTree: scala.Boolean = js.native
  /**Gets or sets the Diagram.scale set by resetZoom. The default value is 1.0.*/
  var defaultScale: scala.Double = js.native
  /**Gets or sets whether .deleteSelection should also delete links that are connected with deleted nodes. The default value is true.*/
  var deletesConnectedLinks: scala.Boolean = js.native
  /**Gets or sets whether .deleteSelection should also delete subtrees. The default value is false.*/
  var deletesTree: scala.Boolean = js.native
  /**This read-only property returns the Diagram that is using this CommandHandler.*/
  var diagram: Diagram = js.native
  /**Gets or sets the amount by which .decreaseZoom and .increaseZoom change the Diagram.scale. The default value is 1.05 (5%).*/
  var zoomFactor: scala.Double = js.native
  /**
    * Make sure all of the unnested Parts in the given collection are removed from any containing Groups.
    * @param {Iterable<Part>} coll a collection of Parts.
    * @param {boolean=} check whether to call .isValidMember to confirm that changing the Part to be a top-level Part is valid.
    */
  def addTopLevelParts(coll: Iterable[Part]): scala.Boolean = js.native
  def addTopLevelParts(coll: Iterable[Part], check: scala.Boolean): scala.Boolean = js.native
  /**
    * This predicate controls whether the user can collapse expanded Groups.
    * @param {Group=} group if supplied, ignore the selection and consider collapsing this particular Group.
    */
  def canCollapseSubGraph(): scala.Boolean = js.native
  def canCollapseSubGraph(group: Group): scala.Boolean = js.native
  /**
    * This predicate controls whether the user can collapse expanded subtrees of Nodes.
    * @param {Node=} node if supplied, ignore the selection and consider collapsing this particular Node.
    */
  def canCollapseTree(): scala.Boolean = js.native
  def canCollapseTree(node: Node): scala.Boolean = js.native
  /**
    * This predicate controls whether or not the user can invoke the .copySelection command.
    */
  def canCopySelection(): scala.Boolean = js.native
  /**
    * This predicate controls whether or not the user can invoke the .cutSelection command.
    */
  def canCutSelection(): scala.Boolean = js.native
  /**
    * This predicate controls whether or not the user can invoke the .decreaseZoom command.
    * @param {number=} factor This defaults to 1/.zoomFactor.  The value should be less than one.
    */
  def canDecreaseZoom(): scala.Boolean = js.native
  def canDecreaseZoom(factor: scala.Double): scala.Boolean = js.native
  /**
    * This predicate controls whether or not the user can invoke the .deleteSelection command.
    */
  def canDeleteSelection(): scala.Boolean = js.native
  /**
    * This predicate controls whether or not the user can invoke the .editTextBlock command.
    * @param {TextBlock=} textblock the TextBlock to consider editing.
    */
  def canEditTextBlock(): scala.Boolean = js.native
  def canEditTextBlock(textblock: TextBlock): scala.Boolean = js.native
  /**
    * This predicate controls whether the user can expand collapsed Groups.
    * @param {Group=} group if supplied, ignore the selection and consider expanding this particular Group.
    */
  def canExpandSubGraph(): scala.Boolean = js.native
  def canExpandSubGraph(group: Group): scala.Boolean = js.native
  /**
    * This predicate controls whether the user can expand collapsed subtrees of Nodes.
    * @param {Node=} node if supplied, ignore the selection and consider expanding this particular Node.
    */
  def canExpandTree(): scala.Boolean = js.native
  def canExpandTree(node: Node): scala.Boolean = js.native
  /**
    * This predicate controls whether or not the user can invoke the .groupSelection command.
    */
  def canGroupSelection(): scala.Boolean = js.native
  /**
    * This predicate controls whether or not the user can invoke the .increaseZoom command.
    * @param {number=} factor This defaults to .zoomFactor.  The value should be greater than one.
    */
  def canIncreaseZoom(): scala.Boolean = js.native
  def canIncreaseZoom(factor: scala.Double): scala.Boolean = js.native
  /**
    * This predicate controls whether or not the user can invoke the .pasteSelection command.
    */
  def canPasteSelection(): scala.Boolean = js.native
  /**
    * This predicate controls whether or not the user can invoke the .redo command.
    */
  def canRedo(): scala.Boolean = js.native
  /**
    * This predicate controls whether or not the user can invoke the .resetZoom command.
    * @param {number=} newscale This defaults to 1.  The value should be greater than zero.
    */
  def canResetZoom(): scala.Boolean = js.native
  def canResetZoom(newscale: scala.Double): scala.Boolean = js.native
  /**
    * This predicate controls whether or not the user can invoke the scrollToPart command.
    * This returns false if there is no argument Part and there are no selected Parts.
    * @this {CommandHandler}
    * @param {Part=} part This defaults to the first selected Part of Diagram.selection
    * @return {boolean}
    * This returns true if Diagram.allowHorizontalScroll and Diagram.allowVerticalScroll are true.
    */
  def canScrollToPart(): scala.Boolean = js.native
  def canScrollToPart(part: Part): scala.Boolean = js.native
  /**
    * This predicate controls whether or not the user can invoke the .selectAll command.
    */
  def canSelectAll(): scala.Boolean = js.native
  /**
    * This predicate controls whether or not the user can invoke the .showContextMenu command.
    * @param {GraphObject|Diagram=} obj a GraphObject or Diagram with a contextMenu defined.
    * If none is given, this method will use the first selected object, or else the Diagram.
    */
  def canShowContextMenu(): scala.Boolean = js.native
  def canShowContextMenu(obj: Diagram): scala.Boolean = js.native
  def canShowContextMenu(obj: GraphObject): scala.Boolean = js.native
  /**
    * This predicate controls whether the user may stop the current tool.
    */
  def canStopCommand(): scala.Boolean = js.native
  /**
    * This predicate controls whether or not the user can invoke the .undo command.
    */
  def canUndo(): scala.Boolean = js.native
  /**
    * This predicate controls whether or not the user can invoke the .ungroupSelection command.
    * @param {Group=} group if supplied, ignore the selection and consider ungrouping this particular Group.
    */
  def canUngroupSelection(): scala.Boolean = js.native
  def canUngroupSelection(group: Group): scala.Boolean = js.native
  /**
    * This predicate controls whether or not the user can invoke the .zoomToFit command.
    */
  def canZoomToFit(): scala.Boolean = js.native
  /**
    * Collapse all expanded selected Groups.
    * @param {Group=} group if supplied, ignore the selection and collapse this particular Group.
    */
  def collapseSubGraph(): scala.Unit = js.native
  def collapseSubGraph(group: Group): scala.Unit = js.native
  /**
    * Collapse all expanded selected Nodes.
    * @param {Node=} node if supplied, ignore the selection and collapse this particular Node subtree.
    */
  def collapseTree(): scala.Unit = js.native
  def collapseTree(node: Node): scala.Unit = js.native
  /**
    * Copy the currently selected parts, Diagram.selection, from the Diagram into the clipboard.
    */
  def copySelection(): scala.Unit = js.native
  /**
    * This makes a copy of the given collection of Parts and stores it in a static variable acting as the clipboard.
    * @param {Iterable<Part>} coll A collection of Parts.
    */
  def copyToClipboard(coll: Iterable[Part]): scala.Unit = js.native
  /**
    * Execute a .copySelection followed by a .deleteSelection.
    */
  def cutSelection(): scala.Unit = js.native
  /**
    * Decrease the Diagram.scale by a given factor.
    * @param {number=} factor This defaults to 1/.zoomFactor.  The value should be less than one.
    */
  def decreaseZoom(): scala.Unit = js.native
  def decreaseZoom(factor: scala.Double): scala.Unit = js.native
  /**
    * Delete the currently selected parts from the diagram.
    */
  def deleteSelection(): scala.Unit = js.native
  /**
    * This is called by tools to handle keyboard commands.
    */
  def doKeyDown(): scala.Unit = js.native
  /**
    * This is called by tools to handle keyboard commands.
    */
  def doKeyUp(): scala.Unit = js.native
  /**
    * Start in-place editing of a TextBlock in the selected Part.
    * @param {TextBlock=} textblock the TextBlock to start editing.
    */
  def editTextBlock(): scala.Unit = js.native
  def editTextBlock(textblock: TextBlock): scala.Unit = js.native
  /**
    * Expand all collapsed selected Groups.
    * @param {Group=} group if supplied, ignore the selection and expand this particular Group.
    */
  def expandSubGraph(): scala.Unit = js.native
  def expandSubGraph(group: Group): scala.Unit = js.native
  /**
    * Expand all collapsed selected Nodes.
    * @param {Node=} node if supplied, ignore the selection and collapse this particular Node subtree.
    */
  def expandTree(): scala.Unit = js.native
  def expandTree(node: Node): scala.Unit = js.native
  /**
    * Add a copy of .archetypeGroupData and add it to the diagram's model to create a new Group and then add the selected Parts to that new group.
    */
  def groupSelection(): scala.Unit = js.native
  /**
    * Increase the Diagram.scale by a given factor.
    * @param {number=} factor This defaults to .zoomFactor.  The value should be greater than one.
    */
  def increaseZoom(): scala.Unit = js.native
  def increaseZoom(factor: stdLib.Number): scala.Unit = js.native
  /**
    * This predicate is called to determine whether a Node may be added as a member of a Group.
    * @param {Group} group this may be null if the node is being added as a top-level node.
    * @param {Part} part a Part, usually a Node, possibly another Group, but not a Link or an Adornment.
    */
  def isValidMember(group: Group, part: Part): scala.Boolean = js.native
  /**Gets or sets the predicate that determines whether or not a node may become a member of a group. The default predicate is null, which is equivalent to simply returning true.*/
  def memberValidation(g: Group, p: Part): scala.Boolean = js.native
  /**
    * If the clipboard holds a collection of Parts, and if the Model.dataFormat matches that stored in the clipboard, this makes a copy of the clipboard's parts and adds the copies to this Diagram.
    */
  def pasteFromClipboard(): Set[Part] = js.native
  /**
    * Copy the contents of the clipboard into this diagram, and make those new parts the new selection.
    * @param {Point=} pos Point at which to center the newly pasted parts; if not present the parts are not moved.
    */
  def pasteSelection(): scala.Unit = js.native
  def pasteSelection(pos: Point): scala.Unit = js.native
  /**
    * Call UndoManager.redo.
    */
  def redo(): scala.Unit = js.native
  /**
    * Set the Diagram.scale to a new scale value, by default 1.
    * @param {number=} newscale This defaults to 1.  The value should be greater than zero.
    */
  def resetZoom(): scala.Unit = js.native
  def resetZoom(newscale: scala.Double): scala.Unit = js.native
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
  def scrollToPart(): scala.Unit = js.native
  def scrollToPart(part: Part): scala.Unit = js.native
  /**
    * Select all of the selectable Parts in the diagram.
    */
  def selectAll(): scala.Unit = js.native
  /**
    * Open the context menu of a given GraphObject.
    * The given GraphObject must have a GraphObject.contextMenu
    * defined in order to show anything.
    * @param {GraphObject|Diagram=} obj a GraphObject or Diagram with a contextMenu defined.
    * If none is given, this method will use the first selected object, or else the Diagram.
    */
  def showContextMenu(): scala.Unit = js.native
  def showContextMenu(obj: Diagram): scala.Unit = js.native
  def showContextMenu(obj: GraphObject): scala.Unit = js.native
  /**
    * Cancel the operation of the current tool.
    */
  def stopCommand(): scala.Unit = js.native
  /**
    * Call UndoManager.undo.
    */
  def undo(): scala.Unit = js.native
  /**
    * Remove the group from the diagram without removing its members from the diagram.
    * @param {Group=} group if supplied, ignore the selection and consider ungrouping this particular Group.
    */
  def ungroupSelection(): scala.Unit = js.native
  def ungroupSelection(group: Group): scala.Unit = js.native
  /**
    * Change the Diagram.scale so that the Diagram.documentBounds fits within the viewport.
    */
  def zoomToFit(): scala.Unit = js.native
}

