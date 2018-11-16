package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Serves as a base for objects implementing different element styles.
 */

trait StyleBase extends js.Object {
  /**
       * Gets whether the specified style is marked as deleted.
       * Value: true, if the style is deleted; otherwise, false.
       */
  var isDeleted: scala.Boolean
  /**
       * Gets or sets the name of the style.
       * Value: A string specifying the style name.
       */
  var name: java.lang.String
}

