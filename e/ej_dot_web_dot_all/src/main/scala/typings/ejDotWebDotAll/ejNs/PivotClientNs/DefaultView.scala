package typings.ejDotWebDotAll.ejNs.PivotClientNs

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
  
  /* 0 */ val Chart: typings.ejDotWebDotAll.ejNs.PivotClientNs.DefaultView.Chart with Double = js.native
  /* 1 */ val Grid: typings.ejDotWebDotAll.ejNs.PivotClientNs.DefaultView.Grid with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DefaultView with Double] = js.native
}

