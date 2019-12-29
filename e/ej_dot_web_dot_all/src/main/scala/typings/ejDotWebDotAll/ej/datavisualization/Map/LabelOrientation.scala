package typings.ejDotWebDotAll.ej.datavisualization.Map

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LabelOrientation extends js.Object

@JSGlobal("ej.datavisualization.Map.LabelOrientation")
@js.native
object LabelOrientation extends js.Object {
  //specifies the horizontal position
  @js.native
  sealed trait Horizontal extends LabelOrientation
  
  //specifies the vertical position
  @js.native
  sealed trait Vertical extends LabelOrientation
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LabelOrientation with Double] = js.native
  /* 0 */ @js.native
  object Horizontal extends TopLevel[Horizontal with Double]
  
  /* 1 */ @js.native
  object Vertical extends TopLevel[Vertical with Double]
  
}

