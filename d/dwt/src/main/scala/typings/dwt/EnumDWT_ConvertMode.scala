package typings.dwt

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
  
  /* 0 */ val CM_DEFAULT: typings.dwt.EnumDWT_ConvertMode.CM_DEFAULT with Double = js.native
  /* 1 */ val CM_RENDERALL: typings.dwt.EnumDWT_ConvertMode.CM_RENDERALL with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWT_ConvertMode with Double] = js.native
}

