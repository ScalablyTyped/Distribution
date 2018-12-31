package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings that specify parameters affecting how Map dashboard items are exported.
  */
trait MapExportOptions extends js.Object {
  /**
    * Gets or sets whether the page orientation used to export a map dashboard item is selected automatically.
    * Value: true, to automatically select the page orientation used to export a map dashboard item; otherwise, false.
    */
  var AutomaticPageLayout: scala.Boolean
  /**
    * Gets or sets the export size mode for the map dashboard item.
    * Value: A value returned by the MapExportSizeMode class that specifies specifies the export size mode for the map dashboard item.
    */
  var SizeMode: java.lang.String
}

