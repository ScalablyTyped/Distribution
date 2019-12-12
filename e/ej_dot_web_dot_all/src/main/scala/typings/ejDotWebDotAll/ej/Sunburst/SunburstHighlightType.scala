package typings.ejDotWebDotAll.ej.Sunburst

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.Sunburst.SunburstHighlightType.Color
import typings.ejDotWebDotAll.ej.Sunburst.SunburstHighlightType.Opacity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SunburstHighlightType extends js.Object

@JSGlobal("ej.Sunburst.SunburstHighlightType")
@js.native
object SunburstHighlightType extends js.Object {
  //string
  @js.native
  sealed trait Color extends SunburstHighlightType
  
  //string
  @js.native
  sealed trait Opacity extends SunburstHighlightType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SunburstHighlightType with Double] = js.native
  /* 1 */ @js.native
  object Color extends TopLevel[Color with Double]
  
  /* 0 */ @js.native
  object Opacity extends TopLevel[Opacity with Double]
  
}

