package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * The Web Dashboard Toolbox extension that provides access to the dashboard menu and allows you to add dashboard items, as well as undo or repeat user actions.
 */

trait ToolboxExtension extends IExtension {
  /**
       * Provides access to a collection of the dashboard menu items.
       * Value: A DashboardMenuItem).
       */
  var menuItems: knockoutLib.KnockoutObservableArray[_]
  /**
       * For internal use.
       */
  var menuVisible: KnockoutObservableBoolean
  /**
       * Provides access to a collection of toolbar groups from the Toolbox.
       * Value: A DashboardToolbarGroup).
       */
  var toolbarGroups: knockoutLib.KnockoutObservableArray[_]
  /**
       * Provides access to a collection of the Toolbox groups.
       * Value: A DashboardToolboxGroup).
       */
  var toolboxGroups: knockoutLib.KnockoutObservableArray[_]
  /**
       * Allows you to add a specified menu item to the dashboard menu.
       * @param menuItem A DashboardMenuItem object that is a dashboard menu item.
       */
  def addMenuItem(menuItem: DashboardMenuItem): scala.Unit
  /**
       * Allows you to add a specified toolbar item into a specified toolbar group.
       * @param groupName A string value that is a toolbar group name. To get a toolbar group name, use the name property.
       * @param toolbarItem A DashboardToolbarItem object that is a dashboard toolbar item.
       */
  def addToolbarItem(groupName: java.lang.String, toolbarItem: DashboardToolbarItem): scala.Unit
  /**
       * Allows you to add a specified toolbox item into a specified toolbox group.
       * @param groupName A string value that is a toolbox group name. To get a toolbox group name, use the name property.
       * @param toolboxItem A DashboardToolboxItem object that is a dashboard toolbox item.
       */
  def addToolboxItem(groupName: java.lang.String, toolboxItem: DashboardToolboxItem): scala.Unit
  /**
       * Removes the specified dashboard item from the dashboard menu.
       * @param menuItemId A string value that is a unique dashboard item name.
       */
  def removeMenuItem(menuItemId: java.lang.String): scala.Unit
  /**
       * Removes the specified toolbar item from the specified toolbar group.
       * @param groupName A string value that is a unique toolbar group name.
       * @param toolbarItemName A string value that is a unique toolbar item name.
       */
  def removeToolbarItem(groupName: java.lang.String, toolbarItemName: java.lang.String): scala.Unit
  /**
       * Removes the specified item from the specified toolbox group.
       * @param groupName A string value that is a unique toolbox group name (name).
       * @param toolboxItemName A string value that is a unique toolbox item name (name).
       */
  def removeToolboxItem(groupName: java.lang.String, toolboxItemName: java.lang.String): scala.Unit
  /**
       * Simulates a dashboard menu item selection.
       * @param menuItem A DashboardMenuItem object that is a dashboard menu item.
       */
  def selectMenuItem(menuItem: DashboardMenuItem): scala.Unit
}

