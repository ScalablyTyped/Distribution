package typings.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWTMouseShape extends js.Object

@JSGlobal("EnumDWT_MouseShape")
@js.native
object EnumDWTMouseShape extends js.Object {
  @js.native
  sealed trait Crosshair extends EnumDWTMouseShape
  
  @js.native
  sealed trait Default extends EnumDWTMouseShape
  
  @js.native
  sealed trait Hand extends EnumDWTMouseShape
  
  @js.native
  sealed trait Zoom extends EnumDWTMouseShape
  
}

