package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the TreeView's BootstrapTreeViewNode object.
  */
@JSGlobal("BootstrapClientTreeViewNode")
@js.native
class BootstrapClientTreeViewNode () extends ASPxClientTreeViewNode {
  /**
    * Gets the current node's parent node.
    */
  @JSName("parent")
  var parent_BootstrapClientTreeViewNode: BootstrapClientTreeViewNode = js.native
  /**
    * Gets the BootstrapClientTreeView object to which the current node belongs.
    */
  @JSName("treeView")
  var treeView_BootstrapClientTreeViewNode: BootstrapClientTreeView = js.native
  /**
    * Gets the CSS class of the icon displayed within the node badge.
    */
  def GetBadgeIconCssClass(): String = js.native
  /**
    * Gets the text displayed within the node badge.
    */
  def GetBadgeText(): String = js.native
  /**
    * Gets the CSS class of the icon displayed by the node.
    */
  def GetIconCssClass(): String = js.native
  /**
    * Sets the CSS class of the icon displayed within the node badge.
    * @param cssClass A string containing the name of a CSS class.
    */
  def SetBadgeIconCssClass(cssClass: String): Unit = js.native
  /**
    * Sets the text displayed within the node badge.
    * @param text A String specifying the badge text.
    */
  def SetBadgeText(text: String): Unit = js.native
  /**
    * Sets the CSS class of the icon displayed by the node.
    * @param cssClass A string containing the name of a CSS class.
    */
  def SetIconCssClass(cssClass: String): Unit = js.native
}

