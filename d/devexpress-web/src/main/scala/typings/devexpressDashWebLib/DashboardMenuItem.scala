package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * A dashboard menu item.
 */

trait DashboardMenuItem extends js.Object {
  /**
       * Gets or sets a custom function that is invoked when a click occurs.
       * Value: A custom function that is invoked when a click occurs.
       */
  var click: js.Function
  /**
       * Gets or sets data that is used by a menu item.
       * Value: An object that contains data used by a menu item.
       */
  var data: js.Object
  /**
       * Gets whether a dashboard menu item is disabled.
       * Value: true, if a dashboard menu item should be disabled; otherwise, false.
       */
  var disabled: KnockoutObservableBoolean
  /**
       * Gets or sets whether a dashboard menu item has a separator.
       * Value: true, if a dashboard menu item has a separator; otherwise, false.
       */
  var hasSeparator: scala.Boolean
  /**
       * Gets or sets a code of the key used in the keyboard shortcut. This shortcut allows you to invoke the current menu item.
       * Value: An integer value that specifies a key code.
       */
  var hotKey: scala.Double
  /**
       * Gets or sets a unique identifier of a dashboard menu item.
       * Value: A string value that is a menu item's unique identifier.
       */
  var id: java.lang.String
  /**
       * Gets or sets a position of the dashboard menu item within the dashboard menu.
       * Value: A zero-based integer specifying the position of the current dashboard menu item.
       */
  var index: scala.Double
  /**
       * Gets or sets whether the dashboard menu item is selected.
       * Value: true, if the dashboard menu item is selected; otherwise, false;
       */
  var selected: KnockoutObservableBoolean
  /**
       * Gets or sets a knockout template for the extension.
       * Value: A string value that is an id of the knockout template.
       */
  var template: java.lang.String
  /**
       * Gets or sets a dashboard menu item title.
       * Value: A string value that is a dashboard menu item title.
       */
  var title: java.lang.String
}

