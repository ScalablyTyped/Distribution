package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * A toolbox item of the specified dashboard toolbox group.
 */

trait DashboardToolboxItem extends js.Object {
  /**
       * Gets or sets a custom function that is invoked when a click occurs.
       * Value: A custom function that is invoked when a click occurs.
       */
  var click: js.Function
  /**
       * Gets or sets whether a toolbox item should be disabled.
       * Value: true, if a toolbox item should be disabled; otherwise, false.
       */
  var disabled: KnockoutObservableBoolean
  /**
       * Gets or sets an icon of the dashboard toolbox item.
       * Value: A string value that is the icon id from the SVG definition.
       */
  var icon: java.lang.String
  /**
       * Gets or sets a unique name of the dashboard toolbox item.
       * Value: A string value that is a toolbox item's unique name.
       */
  var name: java.lang.String
  /**
       * Gets or sets a dashboard toolbox item title.
       * Value: A string value that is a dashboard toolbox item title.
       */
  var title: java.lang.String
  /**
       * Gets or sets a dashboard item type.
       * Value: A string value that is a dashboard item type.
       */
  var `type`: java.lang.String
}

