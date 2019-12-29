package typings.ejDotWebDotAll.ej.datavisualization.Map

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LegendIcons extends js.Object

@JSGlobal("ej.datavisualization.Map.LegendIcons")
@js.native
object LegendIcons extends js.Object {
  //specifies the circle position
  @js.native
  sealed trait Circle extends LegendIcons
  
  //specifies the rectangle position
  @js.native
  sealed trait Rectangle extends LegendIcons
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LegendIcons with Double] = js.native
  /* 1 */ @js.native
  object Circle extends TopLevel[Circle with Double]
  
  /* 0 */ @js.native
  object Rectangle extends TopLevel[Rectangle with Double]
  
}

