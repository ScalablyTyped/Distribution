package typings.ejWebAll.ej.datavisualization.HeatMap

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Effect extends js.Object

@JSGlobal("ej.datavisualization.HeatMap.Effect")
@js.native
object Effect extends js.Object {
  //Sets tooltip animation as Fade
  @js.native
  sealed trait Fade extends Effect
  
  //Sets tooltip animation as None
  @js.native
  sealed trait None extends Effect
  
  //Sets tooltip animation as Slide
  @js.native
  sealed trait Slide extends Effect
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Effect with Double] = js.native
  /* 1 */ @js.native
  object Fade extends TopLevel[Fade with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 2 */ @js.native
  object Slide extends TopLevel[Slide with Double]
  
}

