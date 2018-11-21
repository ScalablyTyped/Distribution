package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Contains settings that specify parameters affecting how the Treemap dashboard item is Printing and Exporting.
 */

trait TreemapExportOptions extends js.Object {
  /**
       * Gets or sets whether the page orientation used to export a Treemap dashboard item is selected automatically.
       * Value: true, to automatically select the page orientation used to export a Treemap dashboard item; otherwise, false.
       */
  var AutomaticPageLayout: scala.Boolean
  /**
       * Gets or sets the export size mode for the Treemap dashboard item.
       * Value: A TreemapExportSizeMode enumeration member that specifies the print size mode for the Treemap dashboard item.
       */
  var SizeMode: java.lang.String
}

