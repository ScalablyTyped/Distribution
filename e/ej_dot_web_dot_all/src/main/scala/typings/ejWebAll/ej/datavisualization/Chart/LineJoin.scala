package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LineJoin extends js.Object

@JSGlobal("ej.datavisualization.Chart.LineJoin")
@js.native
object LineJoin extends js.Object {
  //string
  @js.native
  sealed trait Bevel extends LineJoin
  
  //string
  @js.native
  sealed trait Miter extends LineJoin
  
  //string
  @js.native
  sealed trait Round extends LineJoin
  
}

