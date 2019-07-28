package typings.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWT_InitMsg extends js.Object

@JSGlobal("EnumDWT_InitMsg")
@js.native
object EnumDWT_InitMsg extends js.Object {
  @js.native
  sealed trait DownloadError extends EnumDWT_InitMsg
  
  @js.native
  sealed trait DownloadNotRestartError extends EnumDWT_InitMsg
  
  @js.native
  sealed trait Error extends EnumDWT_InitMsg
  
  @js.native
  sealed trait Info extends EnumDWT_InitMsg
  
  @js.native
  sealed trait NotInstalledError extends EnumDWT_InitMsg
  
  /* 4 */ val DownloadError: typings.dwt.EnumDWT_InitMsg.DownloadError with Double = js.native
  /* 5 */ val DownloadNotRestartError: typings.dwt.EnumDWT_InitMsg.DownloadNotRestartError with Double = js.native
  /* 2 */ val Error: typings.dwt.EnumDWT_InitMsg.Error with Double = js.native
  /* 1 */ val Info: typings.dwt.EnumDWT_InitMsg.Info with Double = js.native
  /* 3 */ val NotInstalledError: typings.dwt.EnumDWT_InitMsg.NotInstalledError with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWT_InitMsg with Double] = js.native
}

