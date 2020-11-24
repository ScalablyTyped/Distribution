package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Lists values used to specify how a Map dashboard item should be resized when being exported.
  */
@JSGlobal("MapExportSizeMode")
@js.native
class MapExportSizeMode ()
  extends typings.devexpressWeb.MapExportSizeMode
/* static members */
@JSGlobal("MapExportSizeMode")
@js.native
object MapExportSizeMode extends js.Object {
  
  /**
    * A map dashboard item is exported in a size identical to that shown on the dashboard
    */
  val None: String = js.native
  
  /**
    * A map dashboard item is resized proportionally to best fit the exported page.
    */
  val Zoom: String = js.native
}
