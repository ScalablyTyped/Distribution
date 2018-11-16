package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * A client-side equivalent of the ASPxDockManager   object.
 */
@js.native
trait ASPxClientDockManager extends ASPxClientControl {
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
       * Returns a panel specified by its unique identifier (panelUID).
       * @param panelUID A string value specifying the unique identifier of the panel.
       */
  def GetPanelByUID(panelUID: java.lang.String): ASPxClientDockPanel = js.native
  /**
       * Returns an array of panels contained in a page.
       */
  def GetPanels(): js.Array[ASPxClientDockPanel] = js.native
  /**
       * Returns an array of panels that are contained in a page and meet a specified criteria.
       * @param filterPredicate An ASPxClientDockingFilterPredicate delegate that defines a set of criteria and determines whether a panel meets those criteria.
       */
  def GetPanels(filterPredicate: ASPxClientDockingFilterPredicate): js.Array[ASPxClientDockPanel] = js.native
  /**
       * Returns a zone specified by its unique identifier (zoneUID).
       * @param zoneUID A string value specifying the unique identifier of the zone.
       */
  def GetZoneByUID(zoneUID: java.lang.String): ASPxClientDockZone = js.native
  /**
       * Returns an array of zones contained in a page.
       */
  def GetZones(): js.Array[ASPxClientDockZone] = js.native
  /**
       * Returns an array of zones that are contained in a page and meet a specified criteria.
       * @param filterPredicate An ASPxClientDockingFilterPredicate delegate that defines a set of criteria and determines whether a zone meets those criteria.
       */
  def GetZones(filterPredicate: ASPxClientDockingFilterPredicate): js.Array[ASPxClientDockZone] = js.native
  /**
       * Sends a callback to the server and generates the server-side Callback event, passing it the specified argument.
       * @param parameter A string value that contains any information that needs to be sent to the server-side Callback event.
       */
  def PerformCallback(parameter: java.lang.String): scala.Unit = js.native
  /**
       * Sends a callback to the server and generates the server-side Callback event, passing it the specified argument.
       * @param parameter A string value that contains any information that needs to be sent to the server-side Callback event.
       * @param onSuccess A client action to perform if the server round-trip completed successfully.
       */
  def PerformCallback(parameter: java.lang.String, onSuccess: js.Function1[/* arg1 */ java.lang.String, scala.Unit]): scala.Unit = js.native
}

