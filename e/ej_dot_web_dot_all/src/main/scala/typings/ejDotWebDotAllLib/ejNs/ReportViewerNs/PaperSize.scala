package typings
package ejDotWebDotAllLib.ejNs.ReportViewerNs

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
  sealed trait A3
    extends ejDotWebDotAllLib.ejNs.ReportViewerNs.PaperSize
  
  ///Specifies the B4(JIS) as value in pageSettings.paperSize to get specified size.
  @js.native
  sealed trait B4_JIS
    extends ejDotWebDotAllLib.ejNs.ReportViewerNs.PaperSize
  
  ///Specifies the B5(JIS) as value in pageSettings.paperSize to get specified size.
  @js.native
  sealed trait B5_JIS
    extends ejDotWebDotAllLib.ejNs.ReportViewerNs.PaperSize
  
  ///Specifies the Custom as value in pageSettings.paperSize to get specified size.
  @js.native
  sealed trait Custom
    extends ejDotWebDotAllLib.ejNs.ReportViewerNs.PaperSize
  
  ///Specifies the Envelope #10 as value in pageSettings.paperSize to get specified size.
  @js.native
  sealed trait Envelope_10
    extends ejDotWebDotAllLib.ejNs.ReportViewerNs.PaperSize
  
  ///Specifies the Envelope as value in pageSettings.paperSize to get specified size.
  @js.native
  sealed trait Envelope_Monarch
    extends ejDotWebDotAllLib.ejNs.ReportViewerNs.PaperSize
  
  ///Specifies the Executive as value in pageSettings.paperSize to get specified size.
  @js.native
  sealed trait Executive
    extends ejDotWebDotAllLib.ejNs.ReportViewerNs.PaperSize
  
  ///Specifies the Legal as value in pageSettings.paperSize to get specified size.
  @js.native
  sealed trait Legal
    extends ejDotWebDotAllLib.ejNs.ReportViewerNs.PaperSize
  
  ///Specifies the Letter as value in pageSettings.paperSize to get specified size.
  @js.native
  sealed trait Letter
    extends ejDotWebDotAllLib.ejNs.ReportViewerNs.PaperSize
  
  ///Specifies the A4 as value in pageSettings.paperSize to get specified size.
  @js.native
  sealed trait Portrait
    extends ejDotWebDotAllLib.ejNs.ReportViewerNs.PaperSize
  
  ///Specifies the Tabloid as value in pageSettings.paperSize to get specified size.
  @js.native
  sealed trait Tabloid
    extends ejDotWebDotAllLib.ejNs.ReportViewerNs.PaperSize
  
  /* 0 */ val A3: A3 with scala.Double = js.native
  /* 2 */ val B4_JIS: B4_JIS with scala.Double = js.native
  /* 3 */ val B5_JIS: B5_JIS with scala.Double = js.native
  /* 10 */ val Custom: Custom with scala.Double = js.native
  /* 4 */ val Envelope_10: Envelope_10 with scala.Double = js.native
  /* 5 */ val Envelope_Monarch: Envelope_Monarch with scala.Double = js.native
  /* 6 */ val Executive: Executive with scala.Double = js.native
  /* 7 */ val Legal: Legal with scala.Double = js.native
  /* 8 */ val Letter: Letter with scala.Double = js.native
  /* 1 */ val Portrait: Portrait with scala.Double = js.native
  /* 9 */ val Tabloid: Tabloid with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.ReportViewerNs.PaperSize with scala.Double] = js.native
}

