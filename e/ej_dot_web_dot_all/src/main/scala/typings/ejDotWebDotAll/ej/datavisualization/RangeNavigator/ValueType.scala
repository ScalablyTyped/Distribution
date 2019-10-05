package typings.ejDotWebDotAll.ej.datavisualization.RangeNavigator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ValueType extends js.Object

@JSGlobal("ej.datavisualization.RangeNavigator.ValueType")
@js.native
object ValueType extends js.Object {
  //string
  @js.native
  sealed trait DateTime extends ValueType
  
  //string
  @js.native
  sealed trait Numeric extends ValueType
  
  /* 1 */ val DateTime: typings.ejDotWebDotAll.ej.datavisualization.RangeNavigator.ValueType.DateTime with Double = js.native
  /* 0 */ val Numeric: typings.ejDotWebDotAll.ej.datavisualization.RangeNavigator.ValueType.Numeric with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ValueType with Double] = js.native
}

