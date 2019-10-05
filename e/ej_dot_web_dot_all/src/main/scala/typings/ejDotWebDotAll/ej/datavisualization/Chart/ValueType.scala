package typings.ejDotWebDotAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ValueType extends js.Object

@JSGlobal("ej.datavisualization.Chart.ValueType")
@js.native
object ValueType extends js.Object {
  //string
  @js.native
  sealed trait Category extends ValueType
  
  //string
  @js.native
  sealed trait DateTime extends ValueType
  
  //string
  @js.native
  sealed trait Double extends ValueType
  
  //string
  @js.native
  sealed trait Logarithmic extends ValueType
  
  /* 1 */ val Category: typings.ejDotWebDotAll.ej.datavisualization.Chart.ValueType.Category with scala.Double = js.native
  /* 2 */ val DateTime: typings.ejDotWebDotAll.ej.datavisualization.Chart.ValueType.DateTime with scala.Double = js.native
  /* 0 */ val Double: typings.ejDotWebDotAll.ej.datavisualization.Chart.ValueType.Double with scala.Double = js.native
  /* 3 */ val Logarithmic: typings.ejDotWebDotAll.ej.datavisualization.Chart.ValueType.Logarithmic with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ValueType with scala.Double] = js.native
}

