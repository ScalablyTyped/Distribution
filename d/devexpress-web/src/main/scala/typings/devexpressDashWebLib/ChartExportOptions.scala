package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings that specify parameters affecting how Chart dashboard items are exported.
  */
trait ChartExportOptions extends js.Object {
  /**
    * Gets or sets whether the page orientation used to export a Chart dashboard item is selected automatically.
    * Value: true, to automatically select the page orientation used to export a Chart dashboard item; otherwise, false.
    */
  var AutomaticPageLayout: scala.Boolean
  /**
    * Gets or sets the export size mode for the Chart dashboard item.
    * Value: A value returned by the ChartExportSizeMode class that specifies the export size mode for the Chart dashboard item.
    */
  var SizeMode: java.lang.String
}

object ChartExportOptions {
  @scala.inline
  def apply(AutomaticPageLayout: scala.Boolean, SizeMode: java.lang.String): ChartExportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AutomaticPageLayout")(AutomaticPageLayout)
    __obj.updateDynamic("SizeMode")(SizeMode)
    __obj.asInstanceOf[ChartExportOptions]
  }
}

