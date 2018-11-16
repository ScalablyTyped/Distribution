package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Provides functionality for the Save dialog on the client side of the Web Report Designer.
 */

trait ASPxDesignerSaveDialog extends ASPxDesignerReportDialogBase {
  /**
       * Provides access to the Save Report dialog that appears if a user selected to save changes in the Save dialog.
       * Value: An object that specifies the Save As dialog.
       */
  var saveReportDialog: ASPxDesignerSaveAsDialog
  /**
       * Closes the dialog without saving the current report.
       */
  def notSave(): scala.Unit
  /**
       * Saves the report with the specified URL.
       * @param url A string that specifies an URL of the report to be saved.
       */
  def save(url: java.lang.String): scala.Unit
}

