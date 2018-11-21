package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * A client-side equivalent of the BootstrapTagBox object.
 */
@js.native
trait BootstrapClientTagBox extends ASPxClientTokenBox {
  /**
       * Fires on the client side after the tag collection has been changed.
       */
  var TagsChanged: ASPxClientEvent[ASPxClientEventHandler[BootstrapClientTagBox]] = js.native
  /**
       * Use the TagsChanged event instead.
       */
  @JSName("TokensChanged")
  var TokensChanged_BootstrapClientTagBox: ASPxClientEvent[ASPxClientEventHandler[BootstrapClientTagBox]] = js.native
  /**
       * Adds a new tag with the specified text to the end of the control's tag collection.
       * @param text A string value specifying the tag's text.
       */
  def AddTag(text: java.lang.String): scala.Unit = js.native
  /**
       * Removes all tags contained in the tag box.
       */
  def ClearTagCollection(): scala.Unit = js.native
  /**
       * Gets the CSS class of the icon displayed within a Tag Box item badge.
       * @param index The index of a Tag Box item.
       */
  def GetItemBadgeIconCssClass(index: scala.Double): java.lang.String = js.native
  /**
       * Gets the text displayed within a Tag Box item badge.
       * @param index The index of a Tag Box item.
       */
  def GetItemBadgeText(index: scala.Double): java.lang.String = js.native
  /**
       * Returns a collection of tags.
       */
  def GetTagCollection(): js.Array[java.lang.String] = js.native
  /**
       * Returns an HTML span element that corresponds to the specified tag.
       * @param index An integer value that is the tag index.
       */
  def GetTagHtmlElement(index: scala.Double): js.Object = js.native
  /**
       * Returns the index of a tag specified by its text.
       * @param text A string value that specifies the text of the tag.
       */
  def GetTagIndexByText(text: java.lang.String): scala.Double = js.native
  /**
       * Returns an HTML span element that corresponds to the specified tag's remove button.
       * @param index An integer value that is the tag index.
       */
  def GetTagRemoveButtonHtmlElement(index: scala.Double): js.Object = js.native
  /**
       * Returns an HTML span element that corresponds to the specified tag's text.
       * @param index An integer value that is the tag index.
       */
  def GetTagTextHtmlElement(index: scala.Double): js.Object = js.native
  /**
       * Returns a value that indicates if the specified tag (string) is a custom tag.
       * @param text A string value that is a tag.
       * @param caseSensitive true, if tags are case sensitive; otherwise, false.
       */
  def IsCustomTag(text: java.lang.String, caseSensitive: scala.Boolean): scala.Boolean = js.native
  /**
       * Removes a tag specified by its index from the tag box on the client.
       * @param index An integer value that is the index of the tag to be removed.
       */
  def RemoveTag(index: scala.Double): scala.Unit = js.native
  /**
       * Removes a tag specified by its text from the tag box on the client.
       * @param text A string value that is the text of the tag to be removed.
       */
  def RemoveTagByText(text: java.lang.String): scala.Unit = js.native
  /**
       * Sets the CSS class of the icon displayed within a Tag Box item badge.
       * @param index The index of a Tag Box item.
       * @param cssClass A String containing the name of a CSS class.
       */
  def SetItemBadgeIconCssClass(index: scala.Double, cssClass: java.lang.String): scala.Unit = js.native
  /**
       * Sets the text displayed within a Tag Box item badge.
       * @param index The index of a Tag Box item.
       * @param text A String specifying the badge text.
       */
  def SetItemBadgeText(index: scala.Double, text: java.lang.String): scala.Unit = js.native
  /**
       * This member is not in effect for this class. It is overridden only for the purpose of preventing it from appearing in Microsoft Visual Studio designer tools.
       * @param item 
       */
  def SetSelectedItem(item: BootstrapClientListBoxItem): scala.Unit = js.native
  /**
       * Sets a collection of tags.
       * @param collection An  object that is the collection of tags.
       */
  def SetTagCollection(collection: js.Array[java.lang.String]): scala.Unit = js.native
}

