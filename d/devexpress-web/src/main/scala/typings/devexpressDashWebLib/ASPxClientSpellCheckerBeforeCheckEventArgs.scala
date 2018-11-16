package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Provides data for an event that occurs before a spelling check is started. Represents the client-side equivalent of the BeforeCheckEventArgs class.
 */

trait ASPxClientSpellCheckerBeforeCheckEventArgs extends ASPxClientCancelEventArgs {
  /**
       * Gets the programmatic identifier assigned to the control which is going to be checked.
       * Value: A string, containing the control's identifier.
       */
  var controlId: java.lang.String
}

