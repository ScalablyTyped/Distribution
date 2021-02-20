package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A client-side equivalent of the ASPxTokenBox object.
  */
@js.native
trait ASPxClientTokenBox extends ASPxClientComboBox {
  
  /**
    * Adds a new token with the specified text to the end of the control's token collection.
    * @param text A string value specifying the token's text.
    */
  def AddToken(text: String): Unit = js.native
  
  /**
    * For internal use only.
    */
  @JSName("ButtonClick")
  var ButtonClick_ASPxClientTokenBox: ASPxClientEvent[ASPxClientButtonEditClickEventHandler[ASPxClientTokenBox]] = js.native
  
  /**
    * Removes all tokens contained in the token box.
    */
  def ClearTokenCollection(): Unit = js.native
  
  /**
    * Returns a collection of tokens.
    */
  def GetTokenCollection(): js.Array[String] = js.native
  
  /**
    * Returns an HTML span element that corresponds to the specified token. An object that is the HTML span element that corresponds to the specified token.
    * @param index An integer value that is the token index.
    */
  def GetTokenHtmlElement(index: Double): js.Any = js.native
  
  /**
    * Returns the index of a token specified by its text. An integer value that is the token index
    * @param text A string value that specifies the text of the token.
    */
  def GetTokenIndexByText(text: String): Double = js.native
  
  /**
    * Returns an HTML span element that corresponds to the specified token's remove button. An object that is the HTML span element that corresponds to the specified token's remove button.
    * @param index An integer value that is the token index.
    */
  def GetTokenRemoveButtonHtmlElement(index: Double): js.Any = js.native
  
  /**
    * Returns an HTML span element that corresponds to the specified token's text. An object that is the HTML span element that corresponds to the specified token's text.
    * @param index An integer value that is the token index.
    */
  def GetTokenTextHtmlElement(index: Double): js.Any = js.native
  
  /**
    * Returns a value that indicates if the specified token (string) is a custom token. true, if the token is not contained in the predefined ASPxAutoCompleteBoxBase.Items collection; otherwise, false.
    * @param text A string value that is a token.
    * @param caseSensitive true, if tokens are case sensitive; otherwise, false.
    */
  def IsCustomToken(text: String, caseSensitive: Boolean): Boolean = js.native
  
  /**
    * Removes a token specified by its index from the client token box.
    * @param index An integer value that is the index of the token to be removed.
    */
  def RemoveToken(index: Double): Unit = js.native
  
  /**
    * Removes a token specified by its text from the client token box.
    * @param text A string value that is the text of the token to be removed.
    */
  def RemoveTokenByText(text: String): Unit = js.native
  
  /**
    * Sets a collection of tokens.
    * @param collection A  object that is the collection of tokens.
    */
  def SetTokenCollection(collection: js.Array[String]): Unit = js.native
  
  /**
    * Sets the editor value.
    * @param value A string that is the editor value.
    */
  def SetValue(value: String): Unit = js.native
  
  /**
    * Fires on the client side after the token collection has been changed.
    */
  var TokensChanged: ASPxClientEvent[ASPxClientEventHandler[ASPxClientTokenBox]] = js.native
}
