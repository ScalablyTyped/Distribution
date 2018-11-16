package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * A client-side equivalent of the ASPxTokenBox object.
 */
@js.native
trait ASPxClientTokenBox extends ASPxClientComboBox {
  /**
       * Fires on the client side after the token collection has been changed.
       */
  var TokensChanged: ASPxClientEvent[ASPxClientEventHandler[ASPxClientTokenBox]] = js.native
  /**
       * Adds a new token with the specified text to the end of the control's token collection.
       * @param text A string value specifying the token's text.
       */
  def AddToken(text: java.lang.String): scala.Unit = js.native
  /**
       * Removes all tokens contained in the token box.
       */
  def ClearTokenCollection(): scala.Unit = js.native
  /**
       * Returns a collection of tokens.
       */
  def GetTokenCollection(): js.Array[java.lang.String] = js.native
  /**
       * Returns an HTML span element that corresponds to the specified token.
       * @param index An integer value that is the token index.
       */
  def GetTokenHtmlElement(index: scala.Double): js.Object = js.native
  /**
       * Returns the index of a token specified by its text.
       * @param text A string value that specifies the text of the token.
       */
  def GetTokenIndexByText(text: java.lang.String): scala.Double = js.native
  /**
       * Returns an HTML span element that corresponds to the specified token's remove button.
       * @param index An integer value that is the token index.
       */
  def GetTokenRemoveButtonHtmlElement(index: scala.Double): js.Object = js.native
  /**
       * Returns an HTML span element that corresponds to the specified token's text.
       * @param index An integer value that is the token index.
       */
  def GetTokenTextHtmlElement(index: scala.Double): js.Object = js.native
  /**
       * Returns a value that indicates if the specified token (string) is a custom token.
       * @param text A string value that is a token.
       * @param caseSensitive true, if tokens are case sensitive; otherwise, false.
       */
  def IsCustomToken(text: java.lang.String, caseSensitive: scala.Boolean): scala.Boolean = js.native
  /**
       * Removes a token specified by its index from the client token box.
       * @param index An integer value that is the index of the token to be removed.
       */
  def RemoveToken(index: scala.Double): scala.Unit = js.native
  /**
       * Removes a token specified by its text from the client token box.
       * @param text A string value that is the text of the token to be removed.
       */
  def RemoveTokenByText(text: java.lang.String): scala.Unit = js.native
  /**
       * Sets a collection of tokens.
       * @param collection A  object that is the collection of tokens.
       */
  def SetTokenCollection(collection: js.Array[java.lang.String]): scala.Unit = js.native
  /**
       * Sets the editor value.
       * @param value A string that is the editor value.
       */
  def SetValue(value: java.lang.String): scala.Unit = js.native
}

