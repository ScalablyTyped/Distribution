package typings.ejWebAll.ej.datavisualization.CircularGauge

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NeedleType extends js.Object

@JSGlobal("ej.datavisualization.CircularGauge.NeedleType")
@js.native
object NeedleType extends js.Object {
  //string
  @js.native
  sealed trait Arrow extends NeedleType
  
  //string
  @js.native
  sealed trait Image extends NeedleType
  
  //string
  @js.native
  sealed trait Rectangle extends NeedleType
  
  //string
  @js.native
  sealed trait Trapezoid extends NeedleType
  
  //string
  @js.native
  sealed trait Triangle extends NeedleType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NeedleType with Double] = js.native
  /* 2 */ @js.native
  object Arrow extends TopLevel[Arrow with Double]
  
  /* 3 */ @js.native
  object Image extends TopLevel[Image with Double]
  
  /* 1 */ @js.native
  object Rectangle extends TopLevel[Rectangle with Double]
  
  /* 4 */ @js.native
  object Trapezoid extends TopLevel[Trapezoid with Double]
  
  /* 0 */ @js.native
  object Triangle extends TopLevel[Triangle with Double]
  
}

