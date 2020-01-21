package typings.ejWebAll.ej.datavisualization.Chart

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LineCap extends js.Object

@JSGlobal("ej.datavisualization.Chart.LineCap")
@js.native
object LineCap extends js.Object {
  //string
  @js.native
  sealed trait Butt extends LineCap
  
  //string
  @js.native
  sealed trait Round extends LineCap
  
  //string
  @js.native
  sealed trait Square extends LineCap
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LineCap with Double] = js.native
  /* 0 */ @js.native
  object Butt extends TopLevel[Butt with Double]
  
  /* 1 */ @js.native
  object Round extends TopLevel[Round with Double]
  
  /* 2 */ @js.native
  object Square extends TopLevel[Square with Double]
  
}

