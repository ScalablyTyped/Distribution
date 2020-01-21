package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the ASPxDataView object.
  */
@JSGlobal("ASPxClientDataView")
@js.native
class ASPxClientDataView () extends ASPxClientControl {
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  var BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientDataView]] = js.native
  /**
    * Fires on the client if any server error occurs during server-side processing of a callback sent by the ASPxClientDataView.
    */
  var CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientDataView]] = js.native
  /**
    * Occurs on the client side after a callback's server-side processing has been completed.
    */
  var EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientDataView]] = js.native
  /**
    * Activates the first page.
    */
  def FirstPage(): Unit = js.native
  /**
    * Gets the number of pages into which the ASPxDataView's data is divided.
    */
  def GetPageCount(): Double = js.native
  /**
    * Gets the index of the page that is currently active.
    */
  def GetPageIndex(): Double = js.native
  /**
    * Gets the size of a single ASPxDataView's page.
    */
  def GetPageSize(): Double = js.native
  /**
    * Activates the specified page.
    * @param pageIndex An integer value that specifies the active page's index.
    */
  def GotoPage(pageIndex: Double): Unit = js.native
  /**
    * Activates the last page.
    */
  def LastPage(): Unit = js.native
  /**
    * Activates the next page.
    */
  def NextPage(): Unit = js.native
  /**
    * Sends a callback to the server and generates the server-side ASPxDataViewBase.CustomCallback event, passing it the specified argument.
    * @param parameter A string value that represents any information that needs to be sent to the server-side ASPxDataViewBase.CustomCallback event.
    * @param onSuccess A client action to perform if the server round-trip completed successfully.
    */
  def PerformCallback(parameter: String): Unit = js.native
  def PerformCallback(parameter: String, onSuccess: js.Function1[/* arg */ String, Unit]): Unit = js.native
  /**
    * Activates the previous page.
    */
  def PrevPage(): Unit = js.native
  /**
    * Sets the size of a single ASPxDataView's page.
    * @param pageSize An integer value that specifies the page size.
    */
  def SetPageSize(pageSize: Double): Unit = js.native
}

/* static members */
@JSGlobal("ASPxClientDataView")
@js.native
object ASPxClientDataView extends js.Object {
  /**
    * Converts the specified object to the ASPxClientDataView type. The converted client object specified by the obj parameter.
    * @param obj The client object to be type cast.
    */
  def Cast(obj: js.Any): ASPxClientDataView = js.native
}

