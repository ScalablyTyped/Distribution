package typings.ejWebAll.ej.ReportViewer

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PaperSize extends js.Object

@JSGlobal("ej.ReportViewer.PaperSize")
@js.native
object PaperSize extends js.Object {
  ///Specifies the A3 as value in pageSettings.paperSize to get specified size.
  @js.native
  sealed trait A3 extends PaperSize
  
  ///Specifies the B4(JIS) as value in pageSettings.paperSize to get specified size.
  @js.native
  sealed trait B4_JIS extends PaperSize
  
  ///Specifies the B5(JIS) as value in pageSettings.paperSize to get specified size.
  @js.native
  sealed trait B5_JIS extends PaperSize
  
  ///Specifies the Custom as value in pageSettings.paperSize to get specified size.
  @js.native
  sealed trait Custom extends PaperSize
  
  ///Specifies the Envelope #10 as value in pageSettings.paperSize to get specified size.
  @js.native
  sealed trait Envelope_10 extends PaperSize
  
  ///Specifies the Envelope as value in pageSettings.paperSize to get specified size.
  @js.native
  sealed trait Envelope_Monarch extends PaperSize
  
  ///Specifies the Executive as value in pageSettings.paperSize to get specified size.
  @js.native
  sealed trait Executive extends PaperSize
  
  ///Specifies the Legal as value in pageSettings.paperSize to get specified size.
  @js.native
  sealed trait Legal extends PaperSize
  
  ///Specifies the Letter as value in pageSettings.paperSize to get specified size.
  @js.native
  sealed trait Letter extends PaperSize
  
  ///Specifies the A4 as value in pageSettings.paperSize to get specified size.
  @js.native
  sealed trait Portrait extends PaperSize
  
  ///Specifies the Tabloid as value in pageSettings.paperSize to get specified size.
  @js.native
  sealed trait Tabloid extends PaperSize
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PaperSize with Double] = js.native
  /* 0 */ @js.native
  object A3 extends TopLevel[A3 with Double]
  
  /* 2 */ @js.native
  object B4_JIS extends TopLevel[B4_JIS with Double]
  
  /* 3 */ @js.native
  object B5_JIS extends TopLevel[B5_JIS with Double]
  
  /* 10 */ @js.native
  object Custom extends TopLevel[Custom with Double]
  
  /* 4 */ @js.native
  object Envelope_10 extends TopLevel[Envelope_10 with Double]
  
  /* 5 */ @js.native
  object Envelope_Monarch extends TopLevel[Envelope_Monarch with Double]
  
  /* 6 */ @js.native
  object Executive extends TopLevel[Executive with Double]
  
  /* 7 */ @js.native
  object Legal extends TopLevel[Legal with Double]
  
  /* 8 */ @js.native
  object Letter extends TopLevel[Letter with Double]
  
  /* 1 */ @js.native
  object Portrait extends TopLevel[Portrait with Double]
  
  /* 9 */ @js.native
  object Tabloid extends TopLevel[Tabloid with Double]
  
}

