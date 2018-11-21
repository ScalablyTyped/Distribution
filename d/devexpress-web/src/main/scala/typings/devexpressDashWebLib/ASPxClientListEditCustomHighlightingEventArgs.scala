package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Provides data for the CustomHighlighting events.
 */

trait ASPxClientListEditCustomHighlightingEventArgs extends ASPxClientEventArgs {
  /**
       * Gets a string that is a filter condition for the editor's items typed by a user.
       * Value: A string value specifying the filter text typed by a user.
       */
  var filter: java.lang.String
  /**
       * Specifies rules according to which the editor highlights the filtered items.
       * Value: An object representing the highlighting rules.
       */
  var highlighting: js.Object
}

