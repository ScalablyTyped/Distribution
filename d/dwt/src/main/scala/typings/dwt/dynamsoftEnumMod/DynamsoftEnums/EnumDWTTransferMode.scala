package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTTransferMode extends StObject
/** ICAP_XFERMECH values. */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_TransferMode")
@js.native
object EnumDWTTransferMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTTransferMode & Double] = js.native
  
  /** Disk File Mode Transfers. */
  @js.native
  sealed trait TWSX_FILE
    extends StObject
       with EnumDWTTransferMode
  /* 1 */ val TWSX_FILE: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTTransferMode.TWSX_FILE & Double = js.native
  
  /** Buffered Memory Mode Transfers. */
  @js.native
  sealed trait TWSX_MEMORY
    extends StObject
       with EnumDWTTransferMode
  /* 2 */ val TWSX_MEMORY: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTTransferMode.TWSX_MEMORY & Double = js.native
  
  /**
    * Native transfers require the data to be transferred to a single large block of RAM. Therefore,
    * they always face the risk of having an inadequate amount of RAM available to perform the transfer successfully.
    */
  @js.native
  sealed trait TWSX_NATIVE
    extends StObject
       with EnumDWTTransferMode
  /* 0 */ val TWSX_NATIVE: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTTransferMode.TWSX_NATIVE & Double = js.native
}
