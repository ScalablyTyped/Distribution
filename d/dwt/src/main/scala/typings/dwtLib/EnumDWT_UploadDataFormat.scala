package typings
package dwtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWT_UploadDataFormat extends js.Object

@JSGlobal("EnumDWT_UploadDataFormat")
@js.native
object EnumDWT_UploadDataFormat extends js.Object {
  @js.native
  sealed trait Base64
    extends dwtLib.EnumDWT_UploadDataFormat
  
  @js.native
  sealed trait Binary
    extends dwtLib.EnumDWT_UploadDataFormat
  
  /* 1 */ val Base64: Base64 with scala.Double = js.native
  /* 0 */ val Binary: Binary with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[dwtLib.EnumDWT_UploadDataFormat with scala.Double] = js.native
}

