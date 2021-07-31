package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A client-side equivalent of the BootstrapTagBox object.
  */
@js.native
trait BootstrapClientTagBox
  extends StObject
     with ASPxClientTokenBox {
  
  /**
    * Adds a new tag with the specified text to the end of the control's tag collection.
    * @param text A string value specifying the tag's text.
    */
  def AddTag(text: String): Unit = js.native
  
  /**
    * Removes all tags contained in the tag box.
    */
  def ClearTagCollection(): Unit = js.native
  
  /**
    * Gets the CSS class of the icon displayed within a Tag Box item badge. A String containing the name of a CSS class.
    * @param index The index of a Tag Box item.
    */
  def GetItemBadgeIconCssClass(index: Double): String = js.native
  
  /**
    * Gets the text displayed within a Tag Box item badge. A String specifying the badge text.
    * @param index The index of a Tag Box item.
    */
  def GetItemBadgeText(index: Double): String = js.native
  
  /**
    * Returns a collection of tags.
    */
  def GetTagCollection(): js.Array[String] = js.native
  
  /**
    * Returns an HTML span element that corresponds to the specified tag. An object that is the HTML span element that corresponds to the specified tag.
    * @param index An integer value that is the tag index.
    */
  def GetTagHtmlElement(index: Double): js.Any = js.native
  
  /**
    * Returns the index of a tag specified by its text. An integer value that is the tag index
    * @param text A string value that specifies the text of the tag.
    */
  def GetTagIndexByText(text: String): Double = js.native
  
  /**
    * Returns an HTML span element that corresponds to the specified tag's remove button. An object that is the HTML span element that corresponds to the specified tag's remove button.
    * @param index An integer value that is the tag index.
    */
  def GetTagRemoveButtonHtmlElement(index: Double): js.Any = js.native
  
  /**
    * Returns an HTML span element that corresponds to the specified tag's text. An object that is the HTML span element that corresponds to the specified tag's text.
    * @param index An integer value that is the tag index.
    */
  def GetTagTextHtmlElement(index: Double): js.Any = js.native
  
  /**
    * Returns a value that indicates if the specified tag (string) is a custom tag. true, if the tag is not contained in the predefined BootstrapTagBox.Items collection; otherwise, false.
    * @param text A string value that is a tag.
    * @param caseSensitive true, if tags are case sensitive; otherwise, false.
    */
  def IsCustomTag(text: String, caseSensitive: Boolean): Boolean = js.native
  
  /**
    * Removes a tag specified by its index from the tag box on the client.
    * @param index An integer value that is the index of the tag to be removed.
    */
  def RemoveTag(index: Double): Unit = js.native
  
  /**
    * Removes a tag specified by its text from the tag box on the client.
    * @param text A string value that is the text of the tag to be removed.
    */
  def RemoveTagByText(text: String): Unit = js.native
  
  /**
    * Sets the CSS class of the icon displayed within a Tag Box item badge.
    * @param index The index of a Tag Box item.
    * @param cssClass A String containing the name of a CSS class.
    */
  def SetItemBadgeIconCssClass(index: Double, cssClass: String): Unit = js.native
  
  /**
    * Sets the text displayed within a Tag Box item badge.
    * @param index The index of a Tag Box item.
    * @param text A String specifying the badge text.
    */
  def SetItemBadgeText(index: Double, text: String): Unit = js.native
  
  /**
    * This member is not in effect for this class. It is overridden only for the purpose of preventing it from appearing in Microsoft Visual Studio designer tools.
    */
  def SetSelectedItem(item: BootstrapClientListBoxItem): Unit = js.native
  
  /**
    * Sets a collection of tags.
    * @param collection An  object that is the collection of tags.
    */
  def SetTagCollection(collection: js.Array[String]): Unit = js.native
  
  /**
    * Fires on the client side after the tag collection has been changed.
    */
  var TagsChanged: ASPxClientEvent[ASPxClientEventHandler[BootstrapClientTagBox]] = js.native
  
  /** @deprecated This event is now obsolete. Use the TagsChanged event instead. */
  /**
    * Use the BootstrapClientTagBox.TagsChanged event instead.
    */
  @JSName("TokensChanged")
  var TokensChanged_BootstrapClientTagBox: ASPxClientEvent[ASPxClientEventHandler[BootstrapClientTagBox]] = js.native
}
