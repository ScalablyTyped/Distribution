package typings
package exceljsLib.exceljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PaperSize extends js.Object

@JSImport("exceljs", "PaperSize")
@js.native
object PaperSize extends js.Object {
  @js.native
  sealed trait A4
    extends exceljsLib.exceljsMod.PaperSize
  
  @js.native
  sealed trait A5
    extends exceljsLib.exceljsMod.PaperSize
  
  @js.native
  sealed trait B5
    extends exceljsLib.exceljsMod.PaperSize
  
  @js.native
  sealed trait Double_Japan_Postcard_Rotated
    extends exceljsLib.exceljsMod.PaperSize
  
  @js.native
  sealed trait Envelope_10
    extends exceljsLib.exceljsMod.PaperSize
  
  @js.native
  sealed trait Envelope_B5
    extends exceljsLib.exceljsMod.PaperSize
  
  @js.native
  sealed trait Envelope_C5
    extends exceljsLib.exceljsMod.PaperSize
  
  @js.native
  sealed trait Envelope_DL
    extends exceljsLib.exceljsMod.PaperSize
  
  @js.native
  sealed trait Envelope_Monarch
    extends exceljsLib.exceljsMod.PaperSize
  
  @js.native
  sealed trait Executive
    extends exceljsLib.exceljsMod.PaperSize
  
  @js.native
  sealed trait K16_197x273_mm
    extends exceljsLib.exceljsMod.PaperSize
  
  @js.native
  sealed trait Legal
    extends exceljsLib.exceljsMod.PaperSize
  
  /* 9 */ val A4: A4 with scala.Double = js.native
  /* 11 */ val A5: A5 with scala.Double = js.native
  /* 13 */ val B5: B5 with scala.Double = js.native
  /* 82 */ val Double_Japan_Postcard_Rotated: Double_Japan_Postcard_Rotated with scala.Double = js.native
  /* 20 */ val Envelope_10: Envelope_10 with scala.Double = js.native
  /* 34 */ val Envelope_B5: Envelope_B5 with scala.Double = js.native
  /* 28 */ val Envelope_C5: Envelope_C5 with scala.Double = js.native
  /* 27 */ val Envelope_DL: Envelope_DL with scala.Double = js.native
  /* 37 */ val Envelope_Monarch: Envelope_Monarch with scala.Double = js.native
  /* 7 */ val Executive: Executive with scala.Double = js.native
  /* 119 */ val K16_197x273_mm: K16_197x273_mm with scala.Double = js.native
  /* 5 */ val Legal: Legal with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[exceljsLib.exceljsMod.PaperSize with scala.Double] = js.native
}

