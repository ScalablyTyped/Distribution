package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * A toolbox group that contains dashboard toolbox items.
 */

trait DashboardToolboxGroup extends js.Object {
  /**
       * Gets or sets a position of the toolbox group within the Toolbox.
       * Value: A zero-based integer specifying the position of the current toolbox group.
       */
  var index: scala.Double
  /**
       * Provides access to a collection of toolbox group items.
       * Value: A DashboardToolboxItem).
       */
  var items: knockoutLib.KnockoutObservableArray[_]
  /**
       * Gets or sets a unique name of the dashboard toolbox group.
       * Value: A string value that is a unique toolbox group name.
       */
  var name: java.lang.String
  /**
       * Gets or sets a dashboard toolbox group title.
       * Value: A string value that is a dashboard toolbox group title.
       */
  var title: java.lang.String
}

