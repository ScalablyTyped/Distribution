package typings.dwt

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWT_OCRProType with Double] = js.native
  /* 0 */ @js.native
  object OCRDT_File extends TopLevel[OCRDT_File with Double]
  
  /* 1 */ @js.native
  object OCRDT_Index extends TopLevel[OCRDT_Index with Double]
  
}

