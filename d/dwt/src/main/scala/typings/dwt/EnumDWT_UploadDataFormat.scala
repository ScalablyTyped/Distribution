package typings.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWT_UploadDataFormat extends js.Object

@JSGlobal("EnumDWT_UploadDataFormat")
@js.native
object EnumDWT_UploadDataFormat extends js.Object {
  @js.native
  sealed trait Base64 extends EnumDWT_UploadDataFormat
  
  @js.native
  sealed trait Binary extends EnumDWT_UploadDataFormat
  
  /* 1 */ val Base64: typings.dwt.EnumDWT_UploadDataFormat.Base64 with Double = js.native
  /* 0 */ val Binary: typings.dwt.EnumDWT_UploadDataFormat.Binary with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWT_UploadDataFormat with Double] = js.native
}

