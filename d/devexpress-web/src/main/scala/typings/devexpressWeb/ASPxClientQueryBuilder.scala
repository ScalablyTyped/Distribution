package typings.devexpressWeb

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The client-side equivalent of the ASPxQueryBuilder control.
  */
@js.native
trait ASPxClientQueryBuilder extends ASPxClientControl {
  
  /**
    * Occurs before the Query Builder UI is initialized.
    */
  var BeforeRender: ASPxClientEvent[ASPxClientQueryBuilderBeforeRenderEventHandler[ASPxClientQueryBuilder]] = js.native
  
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  var BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientQueryBuilder]] = js.native
  
  /**
    * Fires on the client if any server error occurs during server-side processing of a callback sent by ASPxClientQueryBuilder.
    */
  var CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientQueryBuilder]] = js.native
  
  /**
    * Enables you to customize the Query Builder's localization strings.
    */
  var CustomizeLocalization: ASPxClientEvent[ASPxClientQueryBuilderCustomizeLocalizationEventHandler[ASPxClientQueryBuilder]] = js.native
  
  /**
    * Enables you to customize the menu actions of a Query Builder.
    */
  var CustomizeToolbarActions: ASPxClientEvent[
    ASPxClientQueryBuilderCustomizeToolbarActionsEventHandler[ASPxClientQueryBuilder]
  ] = js.native
  
  /**
    * Occurs on the client after a callback's server-side processing has been completed.
    */
  var EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientQueryBuilder]] = js.native
  
  /**
    * Returns the object model of a Query Builder.
    */
  def GetDesignerModel(): js.Any = js.native
  
  /**
    * Gets a client-side model of the currently opened query serialized to Json.
    */
  def GetJsonQueryModel(): String = js.native
  
  /**
    * Specifies whether or not the current query is a valid SQL string.
    */
  def IsQueryValid(): Boolean = js.native
  
  /**
    * Occurs on the client each time a server-side error raises.
    */
  var OnServerError: ASPxClientEvent[ASPxClientQueryBuilderErrorEventHandler[ASPxClientQueryBuilder]] = js.native
  
  /**
    * Sends a callback to the server and generates the server-side event, passing it the specified argument.
    * @param arg A string value that represents any information that needs to be sent to the server-side event.
    * @param onSuccess A client action to perform if the server round-trip completed successfully.
    */
  def PerformCallback(arg: String): Unit = js.native
  def PerformCallback(arg: String, onSuccess: js.Function1[/* arg */ String, Unit]): Unit = js.native
  
  /**
    * Saves the current query.
    */
  def Save(): Unit = js.native
  
  /**
    * Occurs when executing the Save command on the client.
    */
  var SaveCommandExecute: ASPxClientEvent[ASPxClientQueryBuilderSaveCommandExecuteEventHandler[ASPxClientQueryBuilder]] = js.native
  
  /**
    * Invokes a Previewing Results for the current query.
    */
  def ShowPreview(): Unit = js.native
  
  /**
    * Updates the ASPxClientQueryBuilder properties' localization settings.
    * @param localization A dictionary containing the property names, along with their localized equivalents.
    */
  def UpdateLocalization(localization: StringDictionary[String]): Unit = js.native
}
