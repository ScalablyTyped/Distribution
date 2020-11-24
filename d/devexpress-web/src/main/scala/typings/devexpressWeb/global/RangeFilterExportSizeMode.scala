package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Lists values used to specify how a Range Filter dashboard item should be resized when being exported.
  */
@JSGlobal("RangeFilterExportSizeMode")
@js.native
class RangeFilterExportSizeMode ()
  extends typings.devexpressWeb.RangeFilterExportSizeMode
/* static members */
@JSGlobal("RangeFilterExportSizeMode")
@js.native
object RangeFilterExportSizeMode extends js.Object {
  
  /**
    * A Range Filter dashboard item is exported in a size identical to that shown on the dashboard.
    */
  val None: String = js.native
  
  /**
    * A Range Filter dashboard item is stretched or shrunk to fit the page to which it is exported.
    */
  val Stretch: String = js.native
  
  /**
    * A Range Filter dashboard item is resized proportionally to best fit the printed page.
    */
  val Zoom: String = js.native
}
