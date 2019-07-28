package typings.ejDotWebDotAll.ejNs.SunburstNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SunburstTheme extends js.Object

@JSGlobal("ej.Sunburst.SunburstTheme")
@js.native
object SunburstTheme extends js.Object {
  //string
  @js.native
  sealed trait FlatDark extends SunburstTheme
  
  //string
  @js.native
  sealed trait FlatLight extends SunburstTheme
  
  /* 1 */ val FlatDark: typings.ejDotWebDotAll.ejNs.SunburstNs.SunburstTheme.FlatDark with Double = js.native
  /* 0 */ val FlatLight: typings.ejDotWebDotAll.ejNs.SunburstNs.SunburstTheme.FlatLight with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SunburstTheme with Double] = js.native
}

