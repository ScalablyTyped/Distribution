package typings.ejWebAll.ej.datavisualization.Chart

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ValueType with scala.Double] = js.native
  /* 1 */ @js.native
  object Category
    extends TopLevel[Category with scala.Double]
  
  /* 2 */ @js.native
  object DateTime
    extends TopLevel[DateTime with scala.Double]
  
  /* 0 */ @js.native
  object Double
    extends TopLevel[Double with scala.Double]
  
  /* 3 */ @js.native
  object Logarithmic
    extends TopLevel[Logarithmic with scala.Double]
  
}

