package typings.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWTInitMsg extends js.Object

@JSGlobal("EnumDWT_InitMsg")
@js.native
object EnumDWTInitMsg extends js.Object {
  @js.native
  sealed trait DownloadError extends EnumDWTInitMsg
  
  @js.native
  sealed trait DownloadNotRestartError extends EnumDWTInitMsg
  
  @js.native
  sealed trait Error extends EnumDWTInitMsg
  
  @js.native
  sealed trait Info extends EnumDWTInitMsg
  
  @js.native
  sealed trait NotInstalledError extends EnumDWTInitMsg
  
}

