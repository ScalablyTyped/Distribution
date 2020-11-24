package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ExportModes extends js.Object
@JSGlobal("ej.datavisualization.Diagram.ExportModes")
@js.native
object ExportModes extends js.Object {
  
  //Used to export the diagram as raw data.
  @js.native
  sealed trait Data extends ExportModes
  
  //Used to export the diagram as a file.
  @js.native
  sealed trait Download extends ExportModes
}
