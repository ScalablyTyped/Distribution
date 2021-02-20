package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Lists constants used to specify how a Chart dashboard item should be resized when being exported.
  */
@JSGlobal("ChartExportSizeMode")
@js.native
class ChartExportSizeMode ()
  extends typings.devexpressWeb.ChartExportSizeMode
object ChartExportSizeMode {
  
  /**
    * A chart dashboard item is exported in a size identical to that shown on the dashboard.
    */
  /* static member */
  @JSGlobal("ChartExportSizeMode.None")
  @js.native
  val None: String = js.native
  
  /**
    * A chart dashboard item is stretched or shrunk to fit the page to which it is exported.
    */
  /* static member */
  @JSGlobal("ChartExportSizeMode.Stretch")
  @js.native
  val Stretch: String = js.native
  
  /**
    * A chart dashboard item is resized proportionally to best fit the exported page.
    */
  /* static member */
  @JSGlobal("ChartExportSizeMode.Zoom")
  @js.native
  val Zoom: String = js.native
}
