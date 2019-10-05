package typings.ejDotWebDotAll.ej.Sunburst

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SunburstClickAction extends js.Object

@JSGlobal("ej.Sunburst.SunburstClickAction")
@js.native
object SunburstClickAction extends js.Object {
  //string
  @js.native
  sealed trait None extends SunburstClickAction
  
  //string
  @js.native
  sealed trait ToggleSegmentSelection extends SunburstClickAction
  
  //string
  @js.native
  sealed trait ToggleSegmentVisibility extends SunburstClickAction
  
  /* 0 */ val None: typings.ejDotWebDotAll.ej.Sunburst.SunburstClickAction.None with Double = js.native
  /* 2 */ val ToggleSegmentSelection: typings.ejDotWebDotAll.ej.Sunburst.SunburstClickAction.ToggleSegmentSelection with Double = js.native
  /* 1 */ val ToggleSegmentVisibility: typings.ejDotWebDotAll.ej.Sunburst.SunburstClickAction.ToggleSegmentVisibility with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SunburstClickAction with Double] = js.native
}

