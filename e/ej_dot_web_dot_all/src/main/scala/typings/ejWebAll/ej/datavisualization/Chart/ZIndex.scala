package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ZIndex extends js.Object

@JSGlobal("ej.datavisualization.Chart.ZIndex")
@js.native
object ZIndex extends js.Object {
  //string
  @js.native
  sealed trait Inside extends ZIndex
  
  //string
  @js.native
  sealed trait Over extends ZIndex
  
}

