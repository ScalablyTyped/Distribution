package typings.ejDotWebDotAll.ej.datavisualization.Sunburst

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.datavisualization.Sunburst.SunburstTheme.FlatDark
import typings.ejDotWebDotAll.ej.datavisualization.Sunburst.SunburstTheme.FlatLight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SunburstTheme extends js.Object

@JSGlobal("ej.datavisualization.Sunburst.SunburstTheme")
@js.native
object SunburstTheme extends js.Object {
  //string
  @js.native
  sealed trait FlatDark extends SunburstTheme
  
  //string
  @js.native
  sealed trait FlatLight extends SunburstTheme
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SunburstTheme with Double] = js.native
  /* 1 */ @js.native
  object FlatDark extends TopLevel[FlatDark with Double]
  
  /* 0 */ @js.native
  object FlatLight extends TopLevel[FlatLight with Double]
  
}

