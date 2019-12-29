package typings.dwt

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWT_TransferMode with Double] = js.native
  /* 1 */ @js.native
  object TWSX_FILE extends TopLevel[TWSX_FILE with Double]
  
  /* 2 */ @js.native
  object TWSX_MEMORY extends TopLevel[TWSX_MEMORY with Double]
  
  /* 0 */ @js.native
  object TWSX_NATIVE extends TopLevel[TWSX_NATIVE with Double]
  
}

