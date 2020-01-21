package typings.dwt

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWTConverMode extends js.Object

@JSGlobal("EnumDWT_ConverMode")
@js.native
object EnumDWTConverMode extends js.Object {
  @js.native
  sealed trait CM_DEFAULT extends EnumDWTConverMode
  
  @js.native
  sealed trait CM_RENDERALL extends EnumDWTConverMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTConverMode with Double] = js.native
  /* 0 */ @js.native
  object CM_DEFAULT extends TopLevel[CM_DEFAULT with Double]
  
  /* 1 */ @js.native
  object CM_RENDERALL extends TopLevel[CM_RENDERALL with Double]
  
}

