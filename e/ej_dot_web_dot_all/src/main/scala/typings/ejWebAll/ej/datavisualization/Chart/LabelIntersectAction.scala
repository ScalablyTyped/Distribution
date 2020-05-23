package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LabelIntersectAction extends js.Object

@JSGlobal("ej.datavisualization.Chart.LabelIntersectAction")
@js.native
object LabelIntersectAction extends js.Object {
  //string
  @js.native
  sealed trait Hide extends LabelIntersectAction
  
  //string
  @js.native
  sealed trait MultipleRows extends LabelIntersectAction
  
  //string
  @js.native
  sealed trait None extends LabelIntersectAction
  
  //string
  @js.native
  sealed trait Rotate45 extends LabelIntersectAction
  
  //string
  @js.native
  sealed trait Rotate90 extends LabelIntersectAction
  
  //string
  @js.native
  sealed trait Trim extends LabelIntersectAction
  
  //string
  @js.native
  sealed trait Wrap extends LabelIntersectAction
  
  //string
  @js.native
  sealed trait WrapByword extends LabelIntersectAction
  
}

