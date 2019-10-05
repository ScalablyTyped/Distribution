package typings.ejDotWebDotAll.ej.ReportViewer

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
  
  /* 0 */ val A3: typings.ejDotWebDotAll.ej.ReportViewer.PaperSize.A3 with Double = js.native
  /* 2 */ val B4_JIS: typings.ejDotWebDotAll.ej.ReportViewer.PaperSize.B4_JIS with Double = js.native
  /* 3 */ val B5_JIS: typings.ejDotWebDotAll.ej.ReportViewer.PaperSize.B5_JIS with Double = js.native
  /* 10 */ val Custom: typings.ejDotWebDotAll.ej.ReportViewer.PaperSize.Custom with Double = js.native
  /* 4 */ val Envelope_10: typings.ejDotWebDotAll.ej.ReportViewer.PaperSize.Envelope_10 with Double = js.native
  /* 5 */ val Envelope_Monarch: typings.ejDotWebDotAll.ej.ReportViewer.PaperSize.Envelope_Monarch with Double = js.native
  /* 6 */ val Executive: typings.ejDotWebDotAll.ej.ReportViewer.PaperSize.Executive with Double = js.native
  /* 7 */ val Legal: typings.ejDotWebDotAll.ej.ReportViewer.PaperSize.Legal with Double = js.native
  /* 8 */ val Letter: typings.ejDotWebDotAll.ej.ReportViewer.PaperSize.Letter with Double = js.native
  /* 1 */ val Portrait: typings.ejDotWebDotAll.ej.ReportViewer.PaperSize.Portrait with Double = js.native
  /* 9 */ val Tabloid: typings.ejDotWebDotAll.ej.ReportViewer.PaperSize.Tabloid with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PaperSize with Double] = js.native
}

