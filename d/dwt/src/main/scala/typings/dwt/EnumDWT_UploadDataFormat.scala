package typings.dwt

import org.scalablytyped.runtime.TopLevel
import typings.dwt.EnumDWT_UploadDataFormat.Base64
import typings.dwt.EnumDWT_UploadDataFormat.Binary
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWT_UploadDataFormat with Double] = js.native
  /* 1 */ @js.native
  object Base64 extends TopLevel[Base64 with Double]
  
  /* 0 */ @js.native
  object Binary extends TopLevel[Binary with Double]
  
}

