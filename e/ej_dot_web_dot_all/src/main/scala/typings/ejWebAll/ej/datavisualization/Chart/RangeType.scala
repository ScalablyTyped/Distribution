package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RangeType extends js.Object

@JSGlobal("ej.datavisualization.Chart.RangeType")
@js.native
object RangeType extends js.Object {
  //string
  @js.native
  sealed trait X extends RangeType
  
  //string
  @js.native
  sealed trait XY extends RangeType
  
  //string
  @js.native
  sealed trait Y extends RangeType
  
}

