package typings.ejDotWebDotAll.ejNs.ReportViewerNs

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
  
  /* 0 */ val A3: typings.ejDotWebDotAll.ejNs.ReportViewerNs.PaperSize.A3 with Double = js.native
  /* 2 */ val B4_JIS: typings.ejDotWebDotAll.ejNs.ReportViewerNs.PaperSize.B4_JIS with Double = js.native
  /* 3 */ val B5_JIS: typings.ejDotWebDotAll.ejNs.ReportViewerNs.PaperSize.B5_JIS with Double = js.native
  /* 10 */ val Custom: typings.ejDotWebDotAll.ejNs.ReportViewerNs.PaperSize.Custom with Double = js.native
  /* 4 */ val Envelope_10: typings.ejDotWebDotAll.ejNs.ReportViewerNs.PaperSize.Envelope_10 with Double = js.native
  /* 5 */ val Envelope_Monarch: typings.ejDotWebDotAll.ejNs.ReportViewerNs.PaperSize.Envelope_Monarch with Double = js.native
  /* 6 */ val Executive: typings.ejDotWebDotAll.ejNs.ReportViewerNs.PaperSize.Executive with Double = js.native
  /* 7 */ val Legal: typings.ejDotWebDotAll.ejNs.ReportViewerNs.PaperSize.Legal with Double = js.native
  /* 8 */ val Letter: typings.ejDotWebDotAll.ejNs.ReportViewerNs.PaperSize.Letter with Double = js.native
  /* 1 */ val Portrait: typings.ejDotWebDotAll.ejNs.ReportViewerNs.PaperSize.Portrait with Double = js.native
  /* 9 */ val Tabloid: typings.ejDotWebDotAll.ejNs.ReportViewerNs.PaperSize.Tabloid with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PaperSize with Double] = js.native
}

