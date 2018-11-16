package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * A Web Dashboard extension that allows you to keep track of all user actions, and cancel or repeat them.
 */

trait UndoRedoExtension extends IExtension {
  /**
       * Allows you to track whether the Web Dashboard has unsaved changes.
       */
  def isChanged(): scala.Boolean
}

