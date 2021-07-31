package typings.go.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This simple layout places all of the Parts in a grid-like arrangement, ordered, spaced apart,
  * and wrapping as needed.  It ignores any Links connecting the Nodes being laid out.
  */
@JSImport("go", "Group")
@js.native
/**
  * Constructs an empty Group with no visual elements and no member parts; normally a Group will have some visual elements surrounding a Placeholder.
  * @param {EnumValue=} type if not supplied, the default Panel type is Panel.Position.
  */
class Group () extends Node {
  def this(`type`: EnumValue) = this()
  
  /**
    * Add the Parts in the given collection as members of this Group for those Parts for which CommandHandler.isValidMember returns true.
    * @param {Iterable<Part>} coll
    * @param {boolean=} check whether to call CommandHandler.isValidMember to confirm that it is valid to add the Part to be a member of this Group.
    */
  def addMembers(coll: Iterable[Part]): Boolean = js.native
  def addMembers(coll: Iterable[Part], check: Boolean): Boolean = js.native
  
  /**
    * See if the given collection of Parts contains non-Links all for which CommandHandler.isValidMember returns true.
    * @param {Iterable<Part>} coll
    */
  def canAddMembers(coll: Iterable[Part]): Boolean = js.native
  
  /**
    * This predicate returns true if .ungroupable is true, if the layer's Layer.allowUngroup is true, and if the diagram's Diagram.allowUngroup is true.
    */
  def canUngroup(): Boolean = js.native
  
  /**
    * Hide each of the member nodes and links of this group, and recursively collapse any member groups.
    */
  def collapseSubGraph(): Unit = js.native
  
  /**Gets or sets whether the size of the area of the Group's .placeholder should remain the same during a DraggingTool move until a drop occurs. The default value is false.*/
  var computesBoundsAfterDrag: Boolean = js.native
  
  /**Gets or sets whether the bounds of a Group's Placeholder includes the bounds of member Links. The default value is true.*/
  var computesBoundsIncludingLinks: Boolean = js.native
  
  /**Gets or sets whether the bounds of a Group's Placeholder includes the previous Group.location. The default value is false.*/
  var computesBoundsIncludingLocation: Boolean = js.native
  
  /**
    * Show each member node and link, and perhaps recursively expand nested subgraphs.
    */
  def expandSubGraph(): Unit = js.native
  
  /**
    * Returns an iterator over all of the Links that connect with this group or any node contained by this group,
    * in either direction, but that are not internal to this group.
    */
  def findExternalLinksConnected(): Iterator[Link] = js.native
  
  /**
    * Returns an iterator over all of the Nodes that are connected with this group or any node contained by this group,
    * by a link in either direction, but that are not internal to this group.
    */
  def findExternalNodesConnected(): Iterator[Node] = js.native
  
  /**
    * Return a collection of Parts that are all of the nodes and links that are members of this group, including inside nested groups, but excluding this group itself.
    */
  def findSubGraphParts(): Set[Part] = js.native
  
  /**Gets or sets whether drag-and-drop events may be bubbled up to this Group if not handled by member Parts.*/
  var handlesDragDropForMembers: Boolean = js.native
  
  /**Gets or sets whether the subgraph contained by this group is expanded. The default value is true.*/
  var isSubGraphExpanded: Boolean = js.native
  
  /**Gets or sets the Layout used to position all of the immediate member nodes and links in this group.*/
  var layout: Layout = js.native
  
  /**Gets or sets the function that is called after a member Part has been added to this Group.*/
  def memberAdded(a: Group, b: Part): Unit = js.native
  
  /**This read-only property returns an iterator over the member Parts of this Group.*/
  var memberParts: Iterator[Part] = js.native
  
  /**Gets or sets the function that is called after a member Part has been removed from this Group.*/
  def memberRemoved(a: Group, b: Part): Unit = js.native
  
  /**Gets or sets the predicate that determines whether or not a Part may become a member of this group.*/
  def memberValidation(a: Group, b: Part): Boolean = js.native
  
  /**This read-only property returns a Placeholder that this group may contain in its visual tree.*/
  var placeholder: Placeholder = js.native
  
  /**Gets or sets the function that is called when .isSubGraphExpanded has changed value.*/
  def subGraphExpandedChanged(a: Group): Unit = js.native
  
  /**Gets or sets whether the user may ungroup this group.*/
  var ungroupable: Boolean = js.native
  
  /**Gets or sets whether the subgraph starting at this group had been collapsed by a call to .expandSubGraph on the containing Group.*/
  var wasSubGraphExpanded: Boolean = js.native
}
