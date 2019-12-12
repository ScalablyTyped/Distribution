package typings.ejDotWebDotAll.ej.datavisualization.Map

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.datavisualization.Map.LegendType.Bubbles
import typings.ejDotWebDotAll.ej.datavisualization.Map.LegendType.Layers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LegendType extends js.Object

@JSGlobal("ej.datavisualization.Map.LegendType")
@js.native
object LegendType extends js.Object {
  //specifies the bubbles type
  @js.native
  sealed trait Bubbles extends LegendType
  
  //specifies the layers type
  @js.native
  sealed trait Layers extends LegendType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LegendType with Double] = js.native
  /* 1 */ @js.native
  object Bubbles extends TopLevel[Bubbles with Double]
  
  /* 0 */ @js.native
  object Layers extends TopLevel[Layers with Double]
  
}

