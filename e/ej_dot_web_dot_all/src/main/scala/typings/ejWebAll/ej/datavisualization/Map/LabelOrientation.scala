package typings.ejWebAll.ej.datavisualization.Map

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LabelOrientation extends js.Object

@JSGlobal("ej.datavisualization.Map.LabelOrientation")
@js.native
object LabelOrientation extends js.Object {
  //specifies the horizontal position
  @js.native
  sealed trait Horizontal extends LabelOrientation
  
  //specifies the vertical position
  @js.native
  sealed trait Vertical extends LabelOrientation
  
}

