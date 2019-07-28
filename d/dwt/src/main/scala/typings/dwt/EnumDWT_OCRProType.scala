package typings.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWT_OCRProType extends js.Object

@JSGlobal("EnumDWT_OCRProType")
@js.native
object EnumDWT_OCRProType extends js.Object {
  @js.native
  sealed trait OCRDT_File extends EnumDWT_OCRProType
  
  @js.native
  sealed trait OCRDT_Index extends EnumDWT_OCRProType
  
  /* 0 */ val OCRDT_File: typings.dwt.EnumDWT_OCRProType.OCRDT_File with Double = js.native
  /* 1 */ val OCRDT_Index: typings.dwt.EnumDWT_OCRProType.OCRDT_Index with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWT_OCRProType with Double] = js.native
}

