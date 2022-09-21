package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Lists values used to specify how a Range Filter dashboard item should be resized when being exported.
  */
@JSGlobal("RangeFilterExportSizeMode")
@js.native
open class RangeFilterExportSizeMode ()
  extends StObject
     with typings.devexpressWeb.RangeFilterExportSizeMode
object RangeFilterExportSizeMode {
  
  /**
    * A Range Filter dashboard item is exported in a size identical to that shown on the dashboard.
    */
  /* static member */
  @JSGlobal("RangeFilterExportSizeMode.None")
  @js.native
  val None: String = js.native
  
  /**
    * A Range Filter dashboard item is stretched or shrunk to fit the page to which it is exported.
    */
  /* static member */
  @JSGlobal("RangeFilterExportSizeMode.Stretch")
  @js.native
  val Stretch: String = js.native
  
  /**
    * A Range Filter dashboard item is resized proportionally to best fit the printed page.
    */
  /* static member */
  @JSGlobal("RangeFilterExportSizeMode.Zoom")
  @js.native
  val Zoom: String = js.native
}
