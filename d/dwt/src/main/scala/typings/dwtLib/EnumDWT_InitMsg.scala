package typings
package dwtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWT_InitMsg extends js.Object

@JSGlobal("EnumDWT_InitMsg")
@js.native
object EnumDWT_InitMsg extends js.Object {
  @js.native
  sealed trait DownloadError
    extends dwtLib.EnumDWT_InitMsg
  
  @js.native
  sealed trait DownloadNotRestartError
    extends dwtLib.EnumDWT_InitMsg
  
  @js.native
  sealed trait Error
    extends dwtLib.EnumDWT_InitMsg
  
  @js.native
  sealed trait Info
    extends dwtLib.EnumDWT_InitMsg
  
  @js.native
  sealed trait NotInstalledError
    extends dwtLib.EnumDWT_InitMsg
  
  /* 4 */ val DownloadError: DownloadError with scala.Double = js.native
  /* 5 */ val DownloadNotRestartError: DownloadNotRestartError with scala.Double = js.native
  /* 2 */ val Error: Error with scala.Double = js.native
  /* 1 */ val Info: Info with scala.Double = js.native
  /* 3 */ val NotInstalledError: NotInstalledError with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[dwtLib.EnumDWT_InitMsg with scala.Double] = js.native
}

