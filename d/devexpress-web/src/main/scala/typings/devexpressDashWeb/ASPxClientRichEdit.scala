package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side equivalent of the ASPxRichEdit object.
  */
@JSGlobal("ASPxClientRichEdit")
@js.native
class ASPxClientRichEdit () extends ASPxClientControl {
  /**
    * Occurs when the active sub-document is substituted with another sub-document.
    */
  var ActiveSubDocumentChanged: ASPxClientEvent[ASPxClientEventHandler[ASPxClientRichEdit]] = js.native
  /**
    * Fires when text is typed in the control.
    */
  var AutoCorrect: ASPxClientEvent[ASPxClientRichEditAutoCorrectEventHandler] = js.native
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  var BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientRichEdit]] = js.native
  /**
    * Fires after a client change has been made to the document and the client-server synchronization starts to apply the change on the server.
    */
  var BeginSynchronization: ASPxClientEvent[ASPxClientEventHandler[ASPxClientRichEdit]] = js.native
  /**
    * Fires on the client if any server error occurs during server-side processing of a callback sent by the RichEdit.
    */
  var CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientRichEdit]] = js.native
  /**
    * Occurs when the characters' formatting is changed.
    */
  var CharacterPropertiesChanged: ASPxClientEvent[ASPxClientRichEditCharacterPropertiesChangedEventHandler] = js.native
  /**
    * Occurs when content is inserted into the document.
    */
  var ContentInserted: ASPxClientEvent[ASPxClientRichEditContentInsertedEventHandler] = js.native
  /**
    * Occurs when content is removed from the document.
    */
  var ContentRemoved: ASPxClientEvent[ASPxClientRichEditContentRemovedEventHandler] = js.native
  /**
    * Occurs after a custom command has been executed on the client side.
    */
  var CustomCommandExecuted: ASPxClientEvent[ASPxClientRichEditCustomCommandExecutedEventHandler] = js.native
  /**
    * Fires if any change is made to the RichEdit's document on the client.
    */
  var DocumentChanged: ASPxClientEvent[ASPxClientEventHandler[ASPxClientRichEdit]] = js.native
  /**
    * Occurs on the client side when a document layout is formatted.
    */
  var DocumentFormatted: ASPxClientEvent[ASPxClientRichEditDocumentFormattedEventHandler] = js.native
  /**
    * Occurs on the client side when a document model is loaded into the control.
    */
  var DocumentLoaded: ASPxClientEvent[ASPxClientEventHandler[ASPxClientRichEdit]] = js.native
  /**
    * Occurs on the client side after a callback's server-side processing has been completed.
    */
  var EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientRichEdit]] = js.native
  /**
    * Fires after a document change has been applied to the server and server and client document models have been synchronized.
    */
  var EndSynchronization: ASPxClientEvent[ASPxClientEventHandler[ASPxClientRichEdit]] = js.native
  /**
    * Occurs when the control receives focus.
    */
  var GotFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientRichEdit]] = js.native
  /**
    * Occurs when a hyperlink is activated within the document.
    */
  var HyperlinkClick: ASPxClientEvent[ASPxClientRichEditHyperlinkClickEventHandler] = js.native
  /**
    * Occurs when a key is pressed while the ASPxRichEdit's document has focus.
    */
  var KeyDown: ASPxClientEvent[ASPxClientRichEditKeyDownEventHandler] = js.native
  /**
    * Occurs when a key is released while the ASPxRichEdit's document has focus.
    */
  var KeyUp: ASPxClientEvent[ASPxClientRichEditKeyUpEventHandler] = js.native
  /**
    * Occurs when the control loses focus.
    */
  var LostFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientRichEdit]] = js.native
  /**
    * Occurs when a paragraph's formatting is changed.
    */
  var ParagraphPropertiesChanged: ASPxClientEvent[ASPxClientRichEditParagraphPropertiesChangedEventHandler] = js.native
  /**
    * Occurs when the mouse pointer is over the RichEdit's document and a mouse button is pressed.
    */
  var PointerDown: ASPxClientEvent[ASPxClientRichEditPointerDownEventHandler] = js.native
  /**
    * Occurs when the mouse button is released if it was pressed within the RichEdit's document.
    */
  var PointerUp: ASPxClientEvent[ASPxClientRichEditPointerUpEventHandler] = js.native
  /**
    * Occurs when a pop-up menu is about to be shown.
    */
  var PopupMenuShowing: ASPxClientEvent[ASPxClientRichEditPopupMenuShowingEventHandler] = js.native
  /**
    * Occurs when the selection is changed within the document.
    */
  var SelectionChanged: ASPxClientEvent[ASPxClientEventHandler[ASPxClientRichEdit]] = js.native
  /**
    * Provides access to the RichEdit's client-side commands.
    */
  var commands: RichEditCommands = js.native
  /**
    * Provides access to document structural elements.
    */
  var document: RichEditDocument = js.native
  /**
    * Provides access to a document's layout functionality.
    */
  var layout: RichEditLayout = js.native
  /**
    * Provides access to settings related to a loading panel functionality.
    */
  var loadingPanel: LoadingPanel = js.native
  /**
    * Provides access to request settings.
    */
  var requestSettings: RequestSettings = js.native
  /**
    * Provides access to the client methods that change the selection.
    */
  var selection: RichEditSelection = js.native
  /**
    * Gets a unit converter.
    */
  var unitConverter: RichEditUnitConverter = js.native
  /**
    * Sets input focus to the RichEdit.
    */
  def Focus(): Unit = js.native
  /**
    * Provides access to an object implementing the RichEdit's ribbon UI.
    */
  def GetRibbon(): ASPxClientRibbon = js.native
  /**
    * Indicates whether any unsaved changes are contained in the current document.
    */
  def HasUnsavedChanges(): Boolean = js.native
  /**
    * Sends a callback to the server and generates the server-side ASPxRichEdit.Callback event, passing it the specified argument.
    * @param parameter A string value that represents any information that needs to be sent to the server-side event.
    * @param onSuccess A client action to perform if the server round-trip completed successfully.
    */
  def PerformCallback(parameter: String): Unit = js.native
  def PerformCallback(parameter: String, onSuccess: js.Function1[/* arg */ String, Unit]): Unit = js.native
  /**
    * Reconnects the RichEdit to an external ribbon.
    */
  def ReconnectToExternalRibbon(): Unit = js.native
  /**
    * Enables you to switch the full-screen mode of the Rich Text Editor.
    * @param fullscreen true to activate full-screen mode; false to deactivate full-screen mode.
    */
  def SetFullscreenMode(fullscreen: Boolean): Unit = js.native
}

/* static members */
@JSGlobal("ASPxClientRichEdit")
@js.native
object ASPxClientRichEdit extends js.Object {
  /**
    * Converts the specified object to the ASPxClientRichEdit type. The converted client object specified by the obj parameter.
    * @param obj The client object to be type cast.
    */
  def Cast(obj: js.Any): ASPxClientRichEdit = js.native
}

