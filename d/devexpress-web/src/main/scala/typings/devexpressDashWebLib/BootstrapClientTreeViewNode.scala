package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the TreeView's BootstrapTreeViewNode object.
  */
trait BootstrapClientTreeViewNode extends ASPxClientTreeViewNode {
  /**
    * Gets the current node's parent node.
    * Value: A BootstrapClientTreeViewNode object representing the node's immediate parent.
    */
  @JSName("parent")
  var parent_BootstrapClientTreeViewNode: BootstrapClientTreeViewNode
  /**
    * Gets the BootstrapClientTreeView object to which the current node belongs.
    * Value: A <see cref="BootstrapClientTreeView" /> object that is the node's owner.
    */
  @JSName("treeView")
  var treeView_BootstrapClientTreeViewNode: BootstrapClientTreeView
  /**
    * Gets the CSS class of the icon displayed within the node badge.
    */
  def GetBadgeIconCssClass(): java.lang.String
  /**
    * Gets the text displayed within the node badge.
    */
  def GetBadgeText(): java.lang.String
  /**
    * Gets the CSS class of the icon displayed by the node.
    */
  def GetIconCssClass(): java.lang.String
  /**
    * Sets the CSS class of the icon displayed within the node badge.
    * @param cssClass A string containing the name of a CSS class.
    */
  def SetBadgeIconCssClass(cssClass: java.lang.String): scala.Unit
  /**
    * Sets the text displayed within the node badge.
    * @param text A String specifying the badge text.
    */
  def SetBadgeText(text: java.lang.String): scala.Unit
  /**
    * Sets the CSS class of the icon displayed by the node.
    * @param cssClass A string containing the name of a CSS class.
    */
  def SetIconCssClass(cssClass: java.lang.String): scala.Unit
}

