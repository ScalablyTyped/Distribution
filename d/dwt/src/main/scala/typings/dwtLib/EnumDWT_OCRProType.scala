package typings
package dwtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWT_OCRProType extends js.Object

@JSGlobal("EnumDWT_OCRProType")
@js.native
object EnumDWT_OCRProType extends js.Object {
  @js.native
  sealed trait OCRDT_File
    extends dwtLib.EnumDWT_OCRProType
  
  @js.native
  sealed trait OCRDT_Index
    extends dwtLib.EnumDWT_OCRProType
  
  /* 0 */ val OCRDT_File: OCRDT_File with scala.Double = js.native
  /* 1 */ val OCRDT_Index: OCRDT_Index with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[dwtLib.EnumDWT_OCRProType with scala.Double] = js.native
}

