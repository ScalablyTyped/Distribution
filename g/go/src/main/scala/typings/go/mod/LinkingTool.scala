package typings.go.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  */
@JSImport("go", "LinkingTool")
@js.native
/**
  * You do not normally need to create an instance of this tool because one already exists as the ToolManager.linkingTool, which you can modify.
  */
open class LinkingTool () extends LinkingBaseTool {
  
  /**Gets or sets an optional node data object representing a link label, that is copied by .insertLink and added to the GraphLinksModel when creating a new Link. The value must be an Object or null.*/
  var archetypeLabelNodeData: Any = js.native
  
  /**Gets or sets a data object that is copied by .insertLink and added to the GraphLinksModel when creating a new Link. The value must be an Object or null.*/
  var archetypeLinkData: Any = js.native
  
  /**Gets or sets the direction in which new links may be drawn.*/
  var direction: EnumValue = js.native
  
  /**
    * Return the GraphObject at the mouse-down point, if it is part of a node and if it is valid to link with it.
    */
  def findLinkablePort(): GraphObject = js.native
  
  /**
    * Make a copy of the .archetypeLinkData, set its node and port properties, and add it to the model.
    * @param {Node} fromnode
    * @param {GraphObject} fromport
    * @param {Node} tonode
    * @param {GraphObject} toport
    */
  def insertLink(fromnode: Node, fromport: GraphObject, tonode: Node, toport: GraphObject): Link = js.native
  
  /**Gets or sets the GraphObject at which .findLinkablePort should start its search.*/
  var startObject: GraphObject = js.native
}
object LinkingTool {
  
  @JSImport("go", "LinkingTool")
  @js.native
  val ^ : js.Any = js.native
  
  /**This value for LinkingTool.direction indicates that users may draw new links backwards only.*/
  /* static member */
  @JSImport("go", "LinkingTool.BackwardsOnly")
  @js.native
  def BackwardsOnly: EnumValue = js.native
  inline def BackwardsOnly_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BackwardsOnly")(x.asInstanceOf[js.Any])
  
  /**This value for LinkingTool.direction indicates that users may draw new links in either direction.*/
  /* static member */
  @JSImport("go", "LinkingTool.Either")
  @js.native
  def Either: EnumValue = js.native
  inline def Either_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Either")(x.asInstanceOf[js.Any])
  
  /**This value for LinkingTool.direction indicates that users may draw new links forwards only.*/
  /* static member */
  @JSImport("go", "LinkingTool.ForwardsOnly")
  @js.native
  def ForwardsOnly: EnumValue = js.native
  inline def ForwardsOnly_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ForwardsOnly")(x.asInstanceOf[js.Any])
}
