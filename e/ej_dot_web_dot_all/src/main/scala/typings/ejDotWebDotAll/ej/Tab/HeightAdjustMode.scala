package typings.ejDotWebDotAll.ej.Tab

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HeightAdjustMode with Double] = js.native
  /* 2 */ @js.native
  object Auto extends TopLevel[Auto with Double]
  
  /* 1 */ @js.native
  object Content extends TopLevel[Content with Double]
  
  /* 3 */ @js.native
  object Fill extends TopLevel[Fill with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
}

