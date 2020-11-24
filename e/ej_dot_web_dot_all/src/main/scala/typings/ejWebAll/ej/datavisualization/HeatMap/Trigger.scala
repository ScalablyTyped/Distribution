package typings.ejWebAll.ej.datavisualization.HeatMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Trigger extends js.Object
@JSGlobal("ej.datavisualization.HeatMap.Trigger")
@js.native
object Trigger extends js.Object {
  
  //Tooltip can be triggered on mouse click
  @js.native
  sealed trait Click extends Trigger
  
  //Tooltip can be triggered on mouse hovers
  @js.native
  sealed trait Hover extends Trigger
}
