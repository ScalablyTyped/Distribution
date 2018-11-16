package typings
package dwtLib

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
  sealed trait TWSX_FILE
    extends dwtLib.EnumDWT_TransferMode
  
  /** Buffered Memory Mode Transfers. */
  @js.native
  sealed trait TWSX_MEMORY
    extends dwtLib.EnumDWT_TransferMode
  
  /** Native transfers require the data to be transferred to a single large block of RAM. Therefore,
       *  they always face the risk of having an inadequate amount of RAM available to perform the transfer successfully.
       */
  @js.native
  sealed trait TWSX_NATIVE
    extends dwtLib.EnumDWT_TransferMode
  
  /* 1 */ val TWSX_FILE: TWSX_FILE with scala.Double = js.native
  /* 2 */ val TWSX_MEMORY: TWSX_MEMORY with scala.Double = js.native
  /* 0 */ val TWSX_NATIVE: TWSX_NATIVE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[dwtLib.EnumDWT_TransferMode with scala.Double] = js.native
}

