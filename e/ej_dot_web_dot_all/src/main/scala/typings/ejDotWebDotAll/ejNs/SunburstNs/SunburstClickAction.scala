package typings.ejDotWebDotAll.ejNs.SunburstNs

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
  
  /* 0 */ val None: typings.ejDotWebDotAll.ejNs.SunburstNs.SunburstClickAction.None with Double = js.native
  /* 2 */ val ToggleSegmentSelection: typings.ejDotWebDotAll.ejNs.SunburstNs.SunburstClickAction.ToggleSegmentSelection with Double = js.native
  /* 1 */ val ToggleSegmentVisibility: typings.ejDotWebDotAll.ejNs.SunburstNs.SunburstClickAction.ToggleSegmentVisibility with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SunburstClickAction with Double] = js.native
}

