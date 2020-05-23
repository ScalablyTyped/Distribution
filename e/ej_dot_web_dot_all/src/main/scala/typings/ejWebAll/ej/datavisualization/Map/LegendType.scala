package typings.ejWebAll.ej.datavisualization.Map

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LegendType extends js.Object

@JSGlobal("ej.datavisualization.Map.LegendType")
@js.native
object LegendType extends js.Object {
  //specifies the bubbles type
  @js.native
  sealed trait Bubbles extends LegendType
  
  //specifies the layers type
  @js.native
  sealed trait Layers extends LegendType
  
}

