package typings.ejWebAll.global.ej

import typings.ejWebAll.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.ReportViewer")
@js.native
class ReportViewer protected ()
  extends typings.ejWebAll.ej.ReportViewer {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejWebAll.ej.ReportViewer.Model) = this()
  def this(element: Element, options: typings.ejWebAll.ej.ReportViewer.Model) = this()
}
/* static members */
@JSGlobal("ej.ReportViewer")
@js.native
object ReportViewer extends js.Object {
  
  var Locale: js.Any = js.native
  
  var fn: typings.ejWebAll.ej.ReportViewer = js.native
  
  @js.native
  object ExcelFormats extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.ReportViewer.ExcelFormats with Double] = js.native
    
    /* 1 */ val Excel2007: typings.ejWebAll.ej.ReportViewer.ExcelFormats.Excel2007 with Double = js.native
    
    /* 2 */ val Excel2010: typings.ejWebAll.ej.ReportViewer.ExcelFormats.Excel2010 with Double = js.native
    
    /* 3 */ val Excel2013: typings.ejWebAll.ej.ReportViewer.ExcelFormats.Excel2013 with Double = js.native
    
    /* 0 */ val Excel97to2003: typings.ejWebAll.ej.ReportViewer.ExcelFormats.Excel97to2003 with Double = js.native
  }
  
  @js.native
  object ExportOptions extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.ReportViewer.ExportOptions with Double] = js.native
    
    /* 0 */ val All: typings.ejWebAll.ej.ReportViewer.ExportOptions.All with Double = js.native
    
    /* 6 */ val CSV: typings.ejWebAll.ej.ReportViewer.ExportOptions.CSV with Double = js.native
    
    /* 7 */ val CustomItems: typings.ejWebAll.ej.ReportViewer.ExportOptions.CustomItems with Double = js.native
    
    /* 3 */ val Excel: typings.ejWebAll.ej.ReportViewer.ExportOptions.Excel with Double = js.native
    
    /* 4 */ val Html: typings.ejWebAll.ej.ReportViewer.ExportOptions.Html with Double = js.native
    
    /* 5 */ val PPT: typings.ejWebAll.ej.ReportViewer.ExportOptions.PPT with Double = js.native
    
    /* 1 */ val Pdf: typings.ejWebAll.ej.ReportViewer.ExportOptions.Pdf with Double = js.native
    
    /* 2 */ val Word: typings.ejWebAll.ej.ReportViewer.ExportOptions.Word with Double = js.native
  }
  
  @js.native
  object Orientation extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.ReportViewer.Orientation with Double] = js.native
    
    /* 0 */ val Landscape: typings.ejWebAll.ej.ReportViewer.Orientation.Landscape with Double = js.native
    
    /* 1 */ val Portrait: typings.ejWebAll.ej.ReportViewer.Orientation.Portrait with Double = js.native
  }
  
  @js.native
  object PPTFormats extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.ReportViewer.PPTFormats with Double] = js.native
    
    /* 1 */ val PowerPoint2007: typings.ejWebAll.ej.ReportViewer.PPTFormats.PowerPoint2007 with Double = js.native
    
    /* 2 */ val PowerPoint2010: typings.ejWebAll.ej.ReportViewer.PPTFormats.PowerPoint2010 with Double = js.native
    
    /* 3 */ val PowerPoint2013: typings.ejWebAll.ej.ReportViewer.PPTFormats.PowerPoint2013 with Double = js.native
    
    /* 0 */ val PowerPoint97to2003: typings.ejWebAll.ej.ReportViewer.PPTFormats.PowerPoint97to2003 with Double = js.native
  }
  
  @js.native
  object PaperSize extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.ReportViewer.PaperSize with Double] = js.native
    
    /* 0 */ val A3: typings.ejWebAll.ej.ReportViewer.PaperSize.A3 with Double = js.native
    
    /* 2 */ val B4_JIS: typings.ejWebAll.ej.ReportViewer.PaperSize.B4_JIS with Double = js.native
    
    /* 3 */ val B5_JIS: typings.ejWebAll.ej.ReportViewer.PaperSize.B5_JIS with Double = js.native
    
    /* 10 */ val Custom: typings.ejWebAll.ej.ReportViewer.PaperSize.Custom with Double = js.native
    
    /* 4 */ val Envelope_10: typings.ejWebAll.ej.ReportViewer.PaperSize.Envelope_10 with Double = js.native
    
    /* 5 */ val Envelope_Monarch: typings.ejWebAll.ej.ReportViewer.PaperSize.Envelope_Monarch with Double = js.native
    
    /* 6 */ val Executive: typings.ejWebAll.ej.ReportViewer.PaperSize.Executive with Double = js.native
    
    /* 7 */ val Legal: typings.ejWebAll.ej.ReportViewer.PaperSize.Legal with Double = js.native
    
    /* 8 */ val Letter: typings.ejWebAll.ej.ReportViewer.PaperSize.Letter with Double = js.native
    
    /* 1 */ val Portrait: typings.ejWebAll.ej.ReportViewer.PaperSize.Portrait with Double = js.native
    
    /* 9 */ val Tabloid: typings.ejWebAll.ej.ReportViewer.PaperSize.Tabloid with Double = js.native
  }
  
  @js.native
  object PrintOptions extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.ReportViewer.PrintOptions with Double] = js.native
    
    /* 0 */ val Default: typings.ejWebAll.ej.ReportViewer.PrintOptions.Default with Double = js.native
    
    /* 1 */ val NewTab: typings.ejWebAll.ej.ReportViewer.PrintOptions.NewTab with Double = js.native
    
    /* 2 */ val None: typings.ejWebAll.ej.ReportViewer.PrintOptions.None with Double = js.native
  }
  
  @js.native
  object ProcessingMode extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.ReportViewer.ProcessingMode with Double] = js.native
    
    /* 1 */ val Local: typings.ejWebAll.ej.ReportViewer.ProcessingMode.Local with Double = js.native
    
    /* 0 */ val Remote: typings.ejWebAll.ej.ReportViewer.ProcessingMode.Remote with Double = js.native
  }
  
  @js.native
  object RenderMode extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.ReportViewer.RenderMode with Double] = js.native
    
    /* 0 */ val Default: typings.ejWebAll.ej.ReportViewer.RenderMode.Default with Double = js.native
    
    /* 2 */ val Desktop: typings.ejWebAll.ej.ReportViewer.RenderMode.Desktop with Double = js.native
    
    /* 1 */ val Mobile: typings.ejWebAll.ej.ReportViewer.RenderMode.Mobile with Double = js.native
  }
  
  @js.native
  object ToolbarItems extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.ReportViewer.ToolbarItems with Double] = js.native
    
    /* 4 */ val Export: typings.ejWebAll.ej.ReportViewer.ToolbarItems.Export with Double = js.native
    
    /* 3 */ val FittoPage: typings.ejWebAll.ej.ReportViewer.ToolbarItems.FittoPage with Double = js.native
    
    /* 5 */ val PageNavigation: typings.ejWebAll.ej.ReportViewer.ToolbarItems.PageNavigation with Double = js.native
    
    /* 8 */ val PageSetup: typings.ejWebAll.ej.ReportViewer.ToolbarItems.PageSetup with Double = js.native
    
    /* 6 */ val Parameters: typings.ejWebAll.ej.ReportViewer.ToolbarItems.Parameters with Double = js.native
    
    /* 0 */ val Print: typings.ejWebAll.ej.ReportViewer.ToolbarItems.Print with Double = js.native
    
    /* 7 */ val PrintLayout: typings.ejWebAll.ej.ReportViewer.ToolbarItems.PrintLayout with Double = js.native
    
    /* 1 */ val Refresh: typings.ejWebAll.ej.ReportViewer.ToolbarItems.Refresh with Double = js.native
    
    /* 2 */ val Zoom: typings.ejWebAll.ej.ReportViewer.ToolbarItems.Zoom with Double = js.native
  }
  
  @js.native
  object WordFormats extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.ReportViewer.WordFormats with Double] = js.native
    
    /* 20 */ val Automatic: typings.ejWebAll.ej.ReportViewer.WordFormats.Automatic with Double = js.native
    
    /* 2 */ val DOCX: typings.ejWebAll.ej.ReportViewer.WordFormats.DOCX with Double = js.native
    
    /* 0 */ val Doc: typings.ejWebAll.ej.ReportViewer.WordFormats.Doc with Double = js.native
    
    /* 1 */ val Dot: typings.ejWebAll.ej.ReportViewer.WordFormats.Dot with Double = js.native
    
    /* 17 */ val EPUB: typings.ejWebAll.ej.ReportViewer.WordFormats.EPUB with Double = js.native
    
    /* 18 */ val HTML: typings.ejWebAll.ej.ReportViewer.WordFormats.HTML with Double = js.native
    
    /* 15 */ val RTF: typings.ejWebAll.ej.ReportViewer.WordFormats.RTF with Double = js.native
    
    /* 16 */ val Txt: typings.ejWebAll.ej.ReportViewer.WordFormats.Txt with Double = js.native
    
    /* 3 */ val Word2007: typings.ejWebAll.ej.ReportViewer.WordFormats.Word2007 with Double = js.native
    
    /* 9 */ val Word2007Docm: typings.ejWebAll.ej.ReportViewer.WordFormats.Word2007Docm with Double = js.native
    
    /* 12 */ val Word2007Dotm: typings.ejWebAll.ej.ReportViewer.WordFormats.Word2007Dotm with Double = js.native
    
    /* 6 */ val Word2007Dotx: typings.ejWebAll.ej.ReportViewer.WordFormats.Word2007Dotx with Double = js.native
    
    /* 4 */ val Word2010: typings.ejWebAll.ej.ReportViewer.WordFormats.Word2010 with Double = js.native
    
    /* 10 */ val Word2010Docm: typings.ejWebAll.ej.ReportViewer.WordFormats.Word2010Docm with Double = js.native
    
    /* 13 */ val Word2010Dotm: typings.ejWebAll.ej.ReportViewer.WordFormats.Word2010Dotm with Double = js.native
    
    /* 7 */ val Word2010Dotx: typings.ejWebAll.ej.ReportViewer.WordFormats.Word2010Dotx with Double = js.native
    
    /* 5 */ val Word2013: typings.ejWebAll.ej.ReportViewer.WordFormats.Word2013 with Double = js.native
    
    /* 11 */ val Word2013Docm: typings.ejWebAll.ej.ReportViewer.WordFormats.Word2013Docm with Double = js.native
    
    /* 14 */ val Word2013Dotm: typings.ejWebAll.ej.ReportViewer.WordFormats.Word2013Dotm with Double = js.native
    
    /* 8 */ val Word2013Dotx: typings.ejWebAll.ej.ReportViewer.WordFormats.Word2013Dotx with Double = js.native
    
    /* 19 */ val XML: typings.ejWebAll.ej.ReportViewer.WordFormats.XML with Double = js.native
  }
}
