package typings.go.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  */
@JSImport("go", "LinkingTool")
@js.native
/**
  * You do not normally need to create an instance of this tool because one already exists as the ToolManager.linkingTool, which you can modify.
  */
class LinkingTool () extends LinkingBaseTool {
  /**Gets or sets an optional node data object representing a link label, that is copied by .insertLink and added to the GraphLinksModel when creating a new Link. The value must be an Object or null.*/
  var archetypeLabelNodeData: js.Any = js.native
  /**Gets or sets a data object that is copied by .insertLink and added to the GraphLinksModel when creating a new Link. The value must be an Object or null.*/
  var archetypeLinkData: js.Any = js.native
  /**Gets or sets the direction in which new links may be drawn.*/
  var direction: EnumValue = js.native
  /**Gets or sets the GraphObject at which .findLinkablePort should start its search.*/
  var startObject: GraphObject = js.native
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
}

/* static members */
@JSImport("go", "LinkingTool")
@js.native
object LinkingTool extends js.Object {
  /**This value for LinkingTool.direction indicates that users may draw new links backwards only.*/
  var BackwardsOnly: EnumValue = js.native
  /**This value for LinkingTool.direction indicates that users may draw new links in either direction.*/
  var Either: EnumValue = js.native
  /**This value for LinkingTool.direction indicates that users may draw new links forwards only.*/
  var ForwardsOnly: EnumValue = js.native
}

