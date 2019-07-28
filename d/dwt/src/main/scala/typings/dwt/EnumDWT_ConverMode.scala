package typings.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWT_ConverMode extends js.Object

@JSGlobal("EnumDWT_ConverMode")
@js.native
object EnumDWT_ConverMode extends js.Object {
  @js.native
  sealed trait CM_DEFAULT extends EnumDWT_ConverMode
  
  @js.native
  sealed trait CM_RENDERALL extends EnumDWT_ConverMode
  
  /* 0 */ val CM_DEFAULT: typings.dwt.EnumDWT_ConverMode.CM_DEFAULT with Double = js.native
  /* 1 */ val CM_RENDERALL: typings.dwt.EnumDWT_ConverMode.CM_RENDERALL with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWT_ConverMode with Double] = js.native
}

