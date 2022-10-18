package typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTInitMsg extends StObject
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_InitMsg")
@js.native
object EnumDWTInitMsg extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTInitMsg & Double] = js.native
  
  @js.native
  sealed trait DownloadError
    extends StObject
       with EnumDWTInitMsg
  /* 4 */ val DownloadError: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTInitMsg.DownloadError & Double = js.native
  
  @js.native
  sealed trait DownloadNotRestartError
    extends StObject
       with EnumDWTInitMsg
  /* 5 */ val DownloadNotRestartError: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTInitMsg.DownloadNotRestartError & Double = js.native
  
  @js.native
  sealed trait Error
    extends StObject
       with EnumDWTInitMsg
  /* 2 */ val Error: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTInitMsg.Error & Double = js.native
  
  @js.native
  sealed trait Info
    extends StObject
       with EnumDWTInitMsg
  /* 1 */ val Info: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTInitMsg.Info & Double = js.native
  
  @js.native
  sealed trait NotInstalledError
    extends StObject
       with EnumDWTInitMsg
  /* 3 */ val NotInstalledError: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTInitMsg.NotInstalledError & Double = js.native
}
