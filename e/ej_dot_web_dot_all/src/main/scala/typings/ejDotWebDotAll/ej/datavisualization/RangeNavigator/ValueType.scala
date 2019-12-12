package typings.ejDotWebDotAll.ej.datavisualization.RangeNavigator

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.datavisualization.RangeNavigator.ValueType.DateTime
import typings.ejDotWebDotAll.ej.datavisualization.RangeNavigator.ValueType.Numeric
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ValueType with Double] = js.native
  /* 1 */ @js.native
  object DateTime extends TopLevel[DateTime with Double]
  
  /* 0 */ @js.native
  object Numeric extends TopLevel[Numeric with Double]
  
}

