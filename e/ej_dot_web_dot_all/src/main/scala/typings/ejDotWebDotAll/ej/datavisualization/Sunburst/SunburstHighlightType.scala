package typings.ejDotWebDotAll.ej.datavisualization.Sunburst

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SunburstHighlightType extends js.Object

@JSGlobal("ej.datavisualization.Sunburst.SunburstHighlightType")
@js.native
object SunburstHighlightType extends js.Object {
  //string
  @js.native
  sealed trait Color extends SunburstHighlightType
  
  //string
  @js.native
  sealed trait Opacity extends SunburstHighlightType
  
  /* 1 */ val Color: typings.ejDotWebDotAll.ej.datavisualization.Sunburst.SunburstHighlightType.Color with Double = js.native
  /* 0 */ val Opacity: typings.ejDotWebDotAll.ej.datavisualization.Sunburst.SunburstHighlightType.Opacity with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SunburstHighlightType with Double] = js.native
}

