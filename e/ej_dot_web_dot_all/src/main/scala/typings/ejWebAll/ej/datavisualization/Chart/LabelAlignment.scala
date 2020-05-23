package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LabelAlignment extends js.Object

@JSGlobal("ej.datavisualization.Chart.LabelAlignment")
@js.native
object LabelAlignment extends js.Object {
  //string
  @js.native
  sealed trait Center extends LabelAlignment
  
  //string
  @js.native
  sealed trait Far extends LabelAlignment
  
  //string
  @js.native
  sealed trait Near extends LabelAlignment
  
}

