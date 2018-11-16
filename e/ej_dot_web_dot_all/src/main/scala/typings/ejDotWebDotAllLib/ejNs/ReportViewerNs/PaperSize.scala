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
  
  val A3: A3 with java.lang.String = js.native
  val B4_JIS: B4_JIS with java.lang.String = js.native
  val B5_JIS: B5_JIS with java.lang.String = js.native
  val Custom: Custom with java.lang.String = js.native
  val Envelope_10: Envelope_10 with java.lang.String = js.native
  val Envelope_Monarch: Envelope_Monarch with java.lang.String = js.native
  val Executive: Executive with java.lang.String = js.native
  val Legal: Legal with java.lang.String = js.native
  val Letter: Letter with java.lang.String = js.native
  val Portrait: Portrait with java.lang.String = js.native
  val Tabloid: Tabloid with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.ReportViewerNs.PaperSize with java.lang.String] = js.native
}

