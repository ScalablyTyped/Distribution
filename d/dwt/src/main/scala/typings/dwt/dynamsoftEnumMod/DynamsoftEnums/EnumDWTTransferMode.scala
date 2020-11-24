package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTTransferMode extends js.Object
/** ICAP_XFERMECH values. */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_TransferMode")
@js.native
object EnumDWTTransferMode extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTTransferMode with Double] = js.native
  
  /** Disk File Mode Transfers. */
  @js.native
  sealed trait TWSX_FILE extends EnumDWTTransferMode
  /* 1 */ @js.native
  object TWSX_FILE extends TopLevel[TWSX_FILE with Double]
  
  /** Buffered Memory Mode Transfers. */
  @js.native
  sealed trait TWSX_MEMORY extends EnumDWTTransferMode
  /* 2 */ @js.native
  object TWSX_MEMORY extends TopLevel[TWSX_MEMORY with Double]
  
  /**
    * Native transfers require the data to be transferred to a single large block of RAM. Therefore,
    * they always face the risk of having an inadequate amount of RAM available to perform the transfer successfully.
    */
  @js.native
  sealed trait TWSX_NATIVE extends EnumDWTTransferMode
  /* 0 */ @js.native
  object TWSX_NATIVE extends TopLevel[TWSX_NATIVE with Double]
}
