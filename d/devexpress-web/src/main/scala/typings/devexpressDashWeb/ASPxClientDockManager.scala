package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side equivalent of the ASPxDockManager
object.
  */
@JSGlobal("ASPxClientDockManager")
@js.native
class ASPxClientDockManager () extends ASPxClientControl {
  /**
    * Fires on the client side after a panel is docked in a zone.
    */
  var AfterDock: ASPxClientEvent[ASPxClientDockManagerProcessingModeEventHandler[ASPxClientDockManager]] = js.native
  /**
    * Fires on the client side after a panel is undocked from a zone.
    */
  var AfterFloat: ASPxClientEvent[ASPxClientDockManagerProcessingModeEventHandler[ASPxClientDockManager]] = js.native
  /**
    * Fires on the client side before a panel is docked in a zone and allows you to cancel the action.
    */
  var BeforeDock: ASPxClientEvent[ASPxClientDockManagerProcessingModeCancelEventHandler[ASPxClientDockManager]] = js.native
  /**
    * Fires on the client side before a panel is made floating (undocked from a zone) and allows you to cancel the action.
    */
  var BeforeFloat: ASPxClientEvent[ASPxClientDockManagerProcessingModeCancelEventHandler[ASPxClientDockManager]] = js.native
  /**
    * Occurs after a panel dragging operation is complete.
    */
  var EndPanelDragging: ASPxClientEvent[ASPxClientDockManagerEventHandler[ASPxClientDockManager]] = js.native
  /**
    * Occurs on the client side when a panel is closed.
    */
  var PanelCloseUp: ASPxClientEvent[ASPxClientDockManagerEventHandler[ASPxClientDockManager]] = js.native
  /**
    * Occurs on the client side before a panel is closed, and allows you to cancel the action.
    */
  var PanelClosing: ASPxClientEvent[ASPxClientDockManagerCancelEventHandler[ASPxClientDockManager]] = js.native
  /**
    * Occurs on the client side when a panel pops up.
    */
  var PanelPopUp: ASPxClientEvent[ASPxClientDockManagerEventHandler[ASPxClientDockManager]] = js.native
  /**
    * Occurs on the client side after a panel has been resized.
    */
  var PanelResize: ASPxClientEvent[ASPxClientDockManagerEventHandler[ASPxClientDockManager]] = js.native
  /**
    * Occurs on the client side after a panel has been invoked.
    */
  var PanelShown: ASPxClientEvent[ASPxClientDockManagerEventHandler[ASPxClientDockManager]] = js.native
  /**
    * Occurs when a panel dragging operation is started.
    */
  var StartPanelDragging: ASPxClientEvent[ASPxClientDockManagerEventHandler[ASPxClientDockManager]] = js.native
  /**
    * Returns a panel specified by its unique identifier (panelUID). An ASPxClientDockPanel object that is the panel with the specified unique identifier.
    * @param panelUID A string value specifying the unique identifier of the panel.
    */
  def GetPanelByUID(panelUID: String): ASPxClientDockPanel = js.native
  /**
    * Returns an array of panels that are contained in a page and meet a specified criteria. An array of ASPxClientDockPanel objects.
    * @param filterPredicate An ASPxClientDockingFilterPredicate delegate that defines a set of criteria and determines whether a panel meets those criteria.
    */
  def GetPanels(): js.Array[ASPxClientDockPanel] = js.native
  def GetPanels(filterPredicate: ASPxClientDockingFilterPredicate): js.Array[ASPxClientDockPanel] = js.native
  /**
    * Returns a zone specified by its unique identifier (zoneUID). An ASPxClientDockZone object that is the zone with the specified unique identifier.
    * @param zoneUID A string value specifying the unique identifier of the zone.
    */
  def GetZoneByUID(zoneUID: String): ASPxClientDockZone = js.native
  /**
    * Returns an array of zones that are contained in a page and meet a specified criteria. An array of ASPxClientDockZone objects.
    * @param filterPredicate An ASPxClientDockingFilterPredicate delegate that defines a set of criteria and determines whether a zone meets those criteria.
    */
  def GetZones(): js.Array[ASPxClientDockZone] = js.native
  def GetZones(filterPredicate: ASPxClientDockingFilterPredicate): js.Array[ASPxClientDockZone] = js.native
  /**
    * Sends a callback to the server and generates the server-side ASPxDockManager.Callback event, passing it the specified argument.
    * @param parameter A string value that contains any information that needs to be sent to the server-side ASPxDockManager.Callback event.
    * @param onSuccess A client action to perform if the server round-trip completed successfully.
    */
  def PerformCallback(parameter: String): Unit = js.native
  def PerformCallback(parameter: String, onSuccess: js.Function1[/* arg */ String, Unit]): Unit = js.native
}

/* static members */
@JSGlobal("ASPxClientDockManager")
@js.native
object ASPxClientDockManager extends js.Object {
  /**
    * Converts the specified object to the ASPxClientDockManager type. The converted client object specified by the obj parameter.
    * @param obj The client object to be type cast.
    */
  def Cast(obj: js.Any): ASPxClientDockManager = js.native
}

