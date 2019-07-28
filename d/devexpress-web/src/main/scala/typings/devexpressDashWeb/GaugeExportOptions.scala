package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings that specify parameters affecting how the Gauge dashboard item is exported.
  */
trait GaugeExportOptions extends js.Object {
  /**
    * Gets or sets whether dashboard item elements are arranged automatically on the exported page.
    * Value: true, to arrange dashboard item elements automatically on the exported page; otherwise, false.
    */
  var AutoArrangeContent: Boolean
}

object GaugeExportOptions {
  @scala.inline
  def apply(AutoArrangeContent: Boolean): GaugeExportOptions = {
    val __obj = js.Dynamic.literal(AutoArrangeContent = AutoArrangeContent)
  
    __obj.asInstanceOf[GaugeExportOptions]
  }
}

