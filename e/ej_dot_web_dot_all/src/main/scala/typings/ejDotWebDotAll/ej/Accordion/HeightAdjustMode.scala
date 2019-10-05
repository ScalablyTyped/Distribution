package typings.ejDotWebDotAll.ej.Accordion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HeightAdjustMode extends js.Object

@JSGlobal("ej.Accordion.HeightAdjustMode")
@js.native
object HeightAdjustMode extends js.Object {
  ///Height set to the largest content in the panel
  @js.native
  sealed trait Auto extends HeightAdjustMode
  
  ///Height fit to the content in the panel
  @js.native
  sealed trait Content extends HeightAdjustMode
  
  ///Height filled to the content of the panel
  @js.native
  sealed trait Fill extends HeightAdjustMode
  
  /* 1 */ val Auto: typings.ejDotWebDotAll.ej.Accordion.HeightAdjustMode.Auto with Double = js.native
  /* 0 */ val Content: typings.ejDotWebDotAll.ej.Accordion.HeightAdjustMode.Content with Double = js.native
  /* 2 */ val Fill: typings.ejDotWebDotAll.ej.Accordion.HeightAdjustMode.Fill with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HeightAdjustMode with Double] = js.native
}

