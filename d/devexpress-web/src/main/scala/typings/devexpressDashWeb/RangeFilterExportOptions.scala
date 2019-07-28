package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings that specify parameters affecting how the Range Filter dashboard item is exported.
  */
trait RangeFilterExportOptions extends js.Object {
  /**
    * Gets or sets whether the page orientation used to export a Range Filter dashboard item is selected automatically.
    * Value: true, to automatically select the page orientation used to export a Range Filter dashboard item; otherwise, false.
    */
  var AutomaticPageLayout: Boolean
  /**
    * Gets or sets the export size mode for the Range Filter dashboard item.
    * Value: A value returned by the RangeFilterExportSizeMode class that specifies the export size mode for the Range Filter dashboard item.
    */
  var SizeMode: String
}

object RangeFilterExportOptions {
  @scala.inline
  def apply(AutomaticPageLayout: Boolean, SizeMode: String): RangeFilterExportOptions = {
    val __obj = js.Dynamic.literal(AutomaticPageLayout = AutomaticPageLayout, SizeMode = SizeMode)
  
    __obj.asInstanceOf[RangeFilterExportOptions]
  }
}

