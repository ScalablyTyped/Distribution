package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * A toolbar group that contains dashboard toolbar items.
 */

trait DashboardToolbarGroup extends js.Object {
  /**
       * Gets or sets a position of the toolbar group within the Toolbox.
       * Value: A zero-based integer specifying the position of the current toolbar group.
       */
  var index: scala.Double
  /**
       * Provides access to a collection of toolbar group items.
       * Value: A DashboardToolbarItem).
       */
  var items: knockoutLib.KnockoutObservableArray[_]
  /**
       * Gets or sets a unique name of the dashboard toolbar group.
       * Value: A string value that is a unique toolbar group name.
       */
  var name: java.lang.String
  /**
       * Gets or sets a dashboard toolbar group title.
       * Value: A string value that is a dashboard toolbar group title.
       */
  var title: java.lang.String
}

