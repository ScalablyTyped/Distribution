package typings.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWT_TransferMode extends js.Object

/** ICAP_XFERMECH values. */
@JSGlobal("EnumDWT_TransferMode")
@js.native
object EnumDWT_TransferMode extends js.Object {
  /** Disk File Mode Transfers. */
  @js.native
  sealed trait TWSX_FILE extends EnumDWT_TransferMode
  
  /** Buffered Memory Mode Transfers. */
  @js.native
  sealed trait TWSX_MEMORY extends EnumDWT_TransferMode
  
  /** Native transfers require the data to be transferred to a single large block of RAM. Therefore,
    *  they always face the risk of having an inadequate amount of RAM available to perform the transfer successfully.
    */
  @js.native
  sealed trait TWSX_NATIVE extends EnumDWT_TransferMode
  
  /* 1 */ val TWSX_FILE: typings.dwt.EnumDWT_TransferMode.TWSX_FILE with Double = js.native
  /* 2 */ val TWSX_MEMORY: typings.dwt.EnumDWT_TransferMode.TWSX_MEMORY with Double = js.native
  /* 0 */ val TWSX_NATIVE: typings.dwt.EnumDWT_TransferMode.TWSX_NATIVE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWT_TransferMode with Double] = js.native
}

