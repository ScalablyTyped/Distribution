package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Represents a base for the ASPxClientPageControl objects.
 */

trait ASPxClientTabControlBase extends ASPxClientControl {
  /**
       * Fires on the client side after the active tab has been changed within a tab control.
       */
  var ActiveTabChanged: ASPxClientEvent[ASPxClientTabControlTabEventHandler[ASPxClientTabControlBase]]
  /**
       * Fires on the client side before the active tab is changed within a tab control.
       */
  var ActiveTabChanging: ASPxClientEvent[ASPxClientTabControlTabCancelEventHandler[ASPxClientTabControlBase]]
  /**
       * Occurs when a callback for server-side processing is initiated.
       */
  var BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientTabControlBase]]
  /**
       * Fires on the client if any server error occurs during server-side processing of a callback sent by a client tab control.
       */
  var CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientTabControlBase]]
  /**
       * Occurs on the client side after a callback's server-side processing has been completed.
       */
  var EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientTabControlBase]]
  /**
       * Fires when a tab is clicked.
       */
  var TabClick: ASPxClientEvent[ASPxClientTabControlTabClickEventHandler[ASPxClientTabControlBase]]
  /**
       * Modifies a tab page's size in accordance with the content.
       */
  def AdjustSize(): scala.Unit
  /**
       * Returns the active tab within the tab control.
       */
  def GetActiveTab(): ASPxClientTab
  /**
       * Returns the index of the active tab within the tab control.
       */
  def GetActiveTabIndex(): scala.Double
  /**
       * Returns a tab specified by its index.
       * @param index An integer value specifying the zero-based index of the tab object to retrieve.
       */
  def GetTab(index: scala.Double): ASPxClientTab
  /**
       * Returns a tab specified by its name.
       * @param name A string value specifying the name of the tab.
       */
  def GetTabByName(name: java.lang.String): ASPxClientTab
  /**
       * Returns the number of tabs in the ASPxTabControl.
       */
  def GetTabCount(): scala.Double
  /**
       * Makes the specified tab active within the tab control on the client side.
       * @param tab An ASPxClientTab object specifying the tab to select.
       */
  def SetActiveTab(tab: ASPxClientTab): scala.Unit
  /**
       * Makes a tab active within the tab control, specifying the tab's index.
       * @param index An integer value specifying the index of the tab to select.
       */
  def SetActiveTabIndex(index: scala.Double): scala.Unit
}

