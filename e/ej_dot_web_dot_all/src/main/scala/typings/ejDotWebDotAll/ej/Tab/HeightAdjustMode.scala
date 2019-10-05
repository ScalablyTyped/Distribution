package typings.ejDotWebDotAll.ej.Tab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HeightAdjustMode extends js.Object

@JSGlobal("ej.Tab.HeightAdjustMode")
@js.native
object HeightAdjustMode extends js.Object {
  ///string
  @js.native
  sealed trait Auto extends HeightAdjustMode
  
  ///string
  @js.native
  sealed trait Content extends HeightAdjustMode
  
  ///string
  @js.native
  sealed trait Fill extends HeightAdjustMode
  
  ///string
  @js.native
  sealed trait None extends HeightAdjustMode
  
  /* 2 */ val Auto: typings.ejDotWebDotAll.ej.Tab.HeightAdjustMode.Auto with Double = js.native
  /* 1 */ val Content: typings.ejDotWebDotAll.ej.Tab.HeightAdjustMode.Content with Double = js.native
  /* 3 */ val Fill: typings.ejDotWebDotAll.ej.Tab.HeightAdjustMode.Fill with Double = js.native
  /* 0 */ val None: typings.ejDotWebDotAll.ej.Tab.HeightAdjustMode.None with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HeightAdjustMode with Double] = js.native
}

