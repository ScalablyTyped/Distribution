package typings.dwt

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWT_ConvertMode extends js.Object

@JSGlobal("EnumDWT_ConvertMode")
@js.native
object EnumDWT_ConvertMode extends js.Object {
  @js.native
  sealed trait CM_DEFAULT extends EnumDWT_ConvertMode
  
  @js.native
  sealed trait CM_RENDERALL extends EnumDWT_ConvertMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWT_ConvertMode with Double] = js.native
  /* 0 */ @js.native
  object CM_DEFAULT extends TopLevel[CM_DEFAULT with Double]
  
  /* 1 */ @js.native
  object CM_RENDERALL extends TopLevel[CM_RENDERALL with Double]
  
}

