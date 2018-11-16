package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Provides data for the CellDoubleClick events.
 */

trait CellClickEventArgs extends ASPxClientEventArgs {
  /**
       * Provides access to an object containing information about an HTML element representing the clicked time cell.
       * Value: An object containing information about an HTML element.
       */
  var htmlElement: js.Object
  /**
       * Provides access to a time interval occupied by the clicked time cell.
       * Value: An <see cref="ASPxClientTimeInterval" /> object.
       */
  var interval: ASPxClientTimeInterval
  /**
       * Gets the name of a resource to which the clicked time cell belongs.
       * Value: A string containing the name of a resource.
       */
  var resource: java.lang.String
}

