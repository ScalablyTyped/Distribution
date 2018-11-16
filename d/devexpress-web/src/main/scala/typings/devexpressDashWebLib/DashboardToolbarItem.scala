package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * A toolbar item of the specified dashboard toolbar group.
 */

trait DashboardToolbarItem extends js.Object {
  /**
       * Gets or sets a custom function that is invoked when a click occurs.
       * Value: A custom function that is invoked when a click occurs.
       */
  var click: js.Function
  /**
       * Gets or sets whether a toolbar item should be disabled.
       * Value: true, if a toolbar item is disabled; otherwise, false.
       */
  var disabled: KnockoutObservableBoolean
  /**
       * Gets or sets an icon of the dashboard toolbar item.
       * Value: A string value that is the icon id from the SVG definition.
       */
  var icon: java.lang.String
  /**
       * Gets or sets a unique name of the dashboard toolbar item.
       * Value: A string value that is a unique toolbar item name.
       */
  var name: java.lang.String
  /**
       * Gets or sets a knockout extension template.
       * Value: A string value that is an id of the knockout template.
       */
  var template: java.lang.String
  /**
       * Gets or sets a dashboard toolbar item title.
       * Value: A string value that is a dashboard toolbar item title.
       */
  var title: java.lang.String
}

