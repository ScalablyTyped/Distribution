package typings.ejWebAll.ej.datavisualization.CircularGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LegendAlignment extends js.Object

@JSGlobal("ej.datavisualization.CircularGauge.LegendAlignment")
@js.native
object LegendAlignment extends js.Object {
  //string
  @js.native
  sealed trait Center extends LegendAlignment
  
  //string
  @js.native
  sealed trait Far extends LegendAlignment
  
  //string
  @js.native
  sealed trait Near extends LegendAlignment
  
}

