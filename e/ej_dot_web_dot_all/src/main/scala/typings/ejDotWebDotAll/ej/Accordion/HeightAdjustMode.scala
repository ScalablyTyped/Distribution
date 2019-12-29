package typings.ejDotWebDotAll.ej.Accordion

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HeightAdjustMode with Double] = js.native
  /* 1 */ @js.native
  object Auto extends TopLevel[Auto with Double]
  
  /* 0 */ @js.native
  object Content extends TopLevel[Content with Double]
  
  /* 2 */ @js.native
  object Fill extends TopLevel[Fill with Double]
  
}

