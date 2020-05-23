package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VerticalTextAlignment extends js.Object

@JSGlobal("ej.datavisualization.Chart.VerticalTextAlignment")
@js.native
object VerticalTextAlignment extends js.Object {
  //string
  @js.native
  sealed trait Center extends VerticalTextAlignment
  
  //string
  @js.native
  sealed trait Far extends VerticalTextAlignment
  
  //string
  @js.native
  sealed trait Near extends VerticalTextAlignment
  
}

