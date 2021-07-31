package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Lists values used to specify how a Map dashboard item should be resized when being exported.
  */
@JSGlobal("MapExportSizeMode")
@js.native
class MapExportSizeMode ()
  extends StObject
     with typings.devexpressWeb.MapExportSizeMode
object MapExportSizeMode {
  
  /**
    * A map dashboard item is exported in a size identical to that shown on the dashboard
    */
  /* static member */
  @JSGlobal("MapExportSizeMode.None")
  @js.native
  val None: String = js.native
  
  /**
    * A map dashboard item is resized proportionally to best fit the exported page.
    */
  /* static member */
  @JSGlobal("MapExportSizeMode.Zoom")
  @js.native
  val Zoom: String = js.native
}
