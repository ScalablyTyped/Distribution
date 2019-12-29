package typings.ejDotWebDotAll.ej.datavisualization.LinearGauge

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Themes extends js.Object

@JSGlobal("ej.datavisualization.LinearGauge.Themes")
@js.native
object Themes extends js.Object {
  //string
  @js.native
  sealed trait FlatDark extends Themes
  
  //string
  @js.native
  sealed trait FlatLight extends Themes
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Themes with Double] = js.native
  /* 1 */ @js.native
  object FlatDark extends TopLevel[FlatDark with Double]
  
  /* 0 */ @js.native
  object FlatLight extends TopLevel[FlatLight with Double]
  
}

