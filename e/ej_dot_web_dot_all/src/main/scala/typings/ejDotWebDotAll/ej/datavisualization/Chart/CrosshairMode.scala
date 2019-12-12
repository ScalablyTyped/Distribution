package typings.ejDotWebDotAll.ej.datavisualization.Chart

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.datavisualization.Chart.CrosshairMode.Float
import typings.ejDotWebDotAll.ej.datavisualization.Chart.CrosshairMode.Grouping
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CrosshairMode extends js.Object

@JSGlobal("ej.datavisualization.Chart.CrosshairMode")
@js.native
object CrosshairMode extends js.Object {
  //string
  @js.native
  sealed trait Float extends CrosshairMode
  
  //string
  @js.native
  sealed trait Grouping extends CrosshairMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CrosshairMode with Double] = js.native
  /* 0 */ @js.native
  object Float extends TopLevel[Float with Double]
  
  /* 1 */ @js.native
  object Grouping extends TopLevel[Grouping with Double]
  
}

