package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTInitMsg extends js.Object
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_InitMsg")
@js.native
object EnumDWTInitMsg extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTInitMsg with Double] = js.native
  
  @js.native
  sealed trait DownloadError extends EnumDWTInitMsg
  /* 4 */ @js.native
  object DownloadError extends TopLevel[DownloadError with Double]
  
  @js.native
  sealed trait DownloadNotRestartError extends EnumDWTInitMsg
  /* 5 */ @js.native
  object DownloadNotRestartError extends TopLevel[DownloadNotRestartError with Double]
  
  @js.native
  sealed trait Error extends EnumDWTInitMsg
  /* 2 */ @js.native
  object Error extends TopLevel[Error with Double]
  
  @js.native
  sealed trait Info extends EnumDWTInitMsg
  /* 1 */ @js.native
  object Info extends TopLevel[Info with Double]
  
  @js.native
  sealed trait NotInstalledError extends EnumDWTInitMsg
  /* 3 */ @js.native
  object NotInstalledError extends TopLevel[NotInstalledError with Double]
}
