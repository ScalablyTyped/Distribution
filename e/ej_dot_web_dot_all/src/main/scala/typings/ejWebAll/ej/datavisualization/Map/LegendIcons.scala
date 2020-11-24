package typings.ejWebAll.ej.datavisualization.Map

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LegendIcons extends js.Object
@JSGlobal("ej.datavisualization.Map.LegendIcons")
@js.native
object LegendIcons extends js.Object {
  
  //specifies the circle position
  @js.native
  sealed trait Circle extends LegendIcons
  
  //specifies the rectangle position
  @js.native
  sealed trait Rectangle extends LegendIcons
}
