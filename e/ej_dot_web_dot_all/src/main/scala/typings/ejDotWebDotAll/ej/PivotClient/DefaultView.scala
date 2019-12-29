package typings.ejDotWebDotAll.ej.PivotClient

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DefaultView extends js.Object

@JSGlobal("ej.PivotClient.DefaultView")
@js.native
object DefaultView extends js.Object {
  ///To set PivotChart as a default control in view.
  @js.native
  sealed trait Chart extends DefaultView
  
  ///To set PivotGrid as a default control in view.
  @js.native
  sealed trait Grid extends DefaultView
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DefaultView with Double] = js.native
  /* 0 */ @js.native
  object Chart extends TopLevel[Chart with Double]
  
  /* 1 */ @js.native
  object Grid extends TopLevel[Grid with Double]
  
}

