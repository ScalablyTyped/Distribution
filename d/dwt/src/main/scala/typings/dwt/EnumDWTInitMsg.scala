package typings.dwt

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTInitMsg with Double] = js.native
  /* 4 */ @js.native
  object DownloadError extends TopLevel[DownloadError with Double]
  
  /* 5 */ @js.native
  object DownloadNotRestartError extends TopLevel[DownloadNotRestartError with Double]
  
  /* 2 */ @js.native
  object Error extends TopLevel[Error with Double]
  
  /* 1 */ @js.native
  object Info extends TopLevel[Info with Double]
  
  /* 3 */ @js.native
  object NotInstalledError extends TopLevel[NotInstalledError with Double]
  
}

