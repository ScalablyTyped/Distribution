package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Provides functionality for a tab displayed a report in the Web Report Designer.
 */

trait ASPxDesignerNavigateTab extends js.Object {
  /**
       * Provides access to a value that specifies the display name of the current tab.
       * Value: A knockout computed string that specifies the tab's display name.
       */
  var displayName: js.Any
  /**
       * Provides access to a value that specifies whether or not the report in the current tab has been changed.
       * Value: A knockout computed boolean object, whose value is true if the report has been modified, and false otherwise.
       */
  var isDirty: js.Any
  /**
       * Provides access to a report opened in the current tab.
       * Value: A knockout observable object that specifies a report opened in the current tab.
       */
  var report: js.Any
  /**
       * Provides access to an engine that manages undo and redo operations in the Web Report Designer.
       * Value: An object that specifies an undo/redo engine.
       */
  var undoEngine: ASPxDesignerUndoEngine
  /**
       * Provides access to the URL of a report opened in the current tab.
       * Value: A knockout observable string that specifies the report URL.
       */
  var url: js.Any
}

