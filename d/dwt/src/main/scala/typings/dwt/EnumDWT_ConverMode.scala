package typings.dwt

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWT_ConverMode with Double] = js.native
  /* 0 */ @js.native
  object CM_DEFAULT extends TopLevel[CM_DEFAULT with Double]
  
  /* 1 */ @js.native
  object CM_RENDERALL extends TopLevel[CM_RENDERALL with Double]
  
}

