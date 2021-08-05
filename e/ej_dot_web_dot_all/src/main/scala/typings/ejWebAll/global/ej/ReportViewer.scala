package typings.ejWebAll.global.ej

import typings.ejWebAll.JQuery
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.ReportViewer")
@js.native
class ReportViewer protected ()
  extends StObject
     with typings.ejWebAll.ej.ReportViewer {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejWebAll.ej.Model) = this()
  def this(element: Element, options: typings.ejWebAll.ej.Model) = this()
}
object ReportViewer {
  
  @JSGlobal("ej.ReportViewer")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("ej.ReportViewer.ExcelFormats")
  @js.native
  object ExcelFormats extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.ReportViewer.ExcelFormats & Double] = js.native
    
    /* 1 */ val Excel2007: typings.ejWebAll.ej.ReportViewer.ExcelFormats.Excel2007 & Double = js.native
    
    /* 2 */ val Excel2010: typings.ejWebAll.ej.ReportViewer.ExcelFormats.Excel2010 & Double = js.native
    
    /* 3 */ val Excel2013: typings.ejWebAll.ej.ReportViewer.ExcelFormats.Excel2013 & Double = js.native
    
    /* 0 */ val Excel97to2003: typings.ejWebAll.ej.ReportViewer.ExcelFormats.Excel97to2003 & Double = js.native
  }
  
  @JSGlobal("ej.ReportViewer.ExportOptions")
  @js.native
  object ExportOptions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.ReportViewer.ExportOptions & Double] = js.native
    
    /* 0 */ val All: typings.ejWebAll.ej.ReportViewer.ExportOptions.All & Double = js.native
    
    /* 6 */ val CSV: typings.ejWebAll.ej.ReportViewer.ExportOptions.CSV & Double = js.native
    
    /* 7 */ val CustomItems: typings.ejWebAll.ej.ReportViewer.ExportOptions.CustomItems & Double = js.native
    
    /* 3 */ val Excel: typings.ejWebAll.ej.ReportViewer.ExportOptions.Excel & Double = js.native
    
    /* 4 */ val Html: typings.ejWebAll.ej.ReportViewer.ExportOptions.Html & Double = js.native
    
    /* 5 */ val PPT: typings.ejWebAll.ej.ReportViewer.ExportOptions.PPT & Double = js.native
    
    /* 1 */ val Pdf: typings.ejWebAll.ej.ReportViewer.ExportOptions.Pdf & Double = js.native
    
    /* 2 */ val Word: typings.ejWebAll.ej.ReportViewer.ExportOptions.Word & Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.ReportViewer.Locale")
  @js.native
  def Locale: js.Any = js.native
  inline def Locale_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ej.ReportViewer.Orientation")
  @js.native
  object Orientation extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.ReportViewer.Orientation & Double] = js.native
    
    /* 0 */ val Landscape: typings.ejWebAll.ej.ReportViewer.Orientation.Landscape & Double = js.native
    
    /* 1 */ val Portrait: typings.ejWebAll.ej.ReportViewer.Orientation.Portrait & Double = js.native
  }
  
  @JSGlobal("ej.ReportViewer.PPTFormats")
  @js.native
  object PPTFormats extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.ReportViewer.PPTFormats & Double] = js.native
    
    /* 1 */ val PowerPoint2007: typings.ejWebAll.ej.ReportViewer.PPTFormats.PowerPoint2007 & Double = js.native
    
    /* 2 */ val PowerPoint2010: typings.ejWebAll.ej.ReportViewer.PPTFormats.PowerPoint2010 & Double = js.native
    
    /* 3 */ val PowerPoint2013: typings.ejWebAll.ej.ReportViewer.PPTFormats.PowerPoint2013 & Double = js.native
    
    /* 0 */ val PowerPoint97to2003: typings.ejWebAll.ej.ReportViewer.PPTFormats.PowerPoint97to2003 & Double = js.native
  }
  
  @JSGlobal("ej.ReportViewer.PaperSize")
  @js.native
  object PaperSize extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.ReportViewer.PaperSize & Double] = js.native
    
    /* 0 */ val A3: typings.ejWebAll.ej.ReportViewer.PaperSize.A3 & Double = js.native
    
    /* 2 */ val B4_JIS: typings.ejWebAll.ej.ReportViewer.PaperSize.B4_JIS & Double = js.native
    
    /* 3 */ val B5_JIS: typings.ejWebAll.ej.ReportViewer.PaperSize.B5_JIS & Double = js.native
    
    /* 10 */ val Custom: typings.ejWebAll.ej.ReportViewer.PaperSize.Custom & Double = js.native
    
    /* 4 */ val Envelope_10: typings.ejWebAll.ej.ReportViewer.PaperSize.Envelope_10 & Double = js.native
    
    /* 5 */ val Envelope_Monarch: typings.ejWebAll.ej.ReportViewer.PaperSize.Envelope_Monarch & Double = js.native
    
    /* 6 */ val Executive: typings.ejWebAll.ej.ReportViewer.PaperSize.Executive & Double = js.native
    
    /* 7 */ val Legal: typings.ejWebAll.ej.ReportViewer.PaperSize.Legal & Double = js.native
    
    /* 8 */ val Letter: typings.ejWebAll.ej.ReportViewer.PaperSize.Letter & Double = js.native
    
    /* 1 */ val Portrait: typings.ejWebAll.ej.ReportViewer.PaperSize.Portrait & Double = js.native
    
    /* 9 */ val Tabloid: typings.ejWebAll.ej.ReportViewer.PaperSize.Tabloid & Double = js.native
  }
  
  @JSGlobal("ej.ReportViewer.PrintOptions")
  @js.native
  object PrintOptions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.ReportViewer.PrintOptions & Double] = js.native
    
    /* 0 */ val Default: typings.ejWebAll.ej.ReportViewer.PrintOptions.Default & Double = js.native
    
    /* 1 */ val NewTab: typings.ejWebAll.ej.ReportViewer.PrintOptions.NewTab & Double = js.native
    
    /* 2 */ val None: typings.ejWebAll.ej.ReportViewer.PrintOptions.None & Double = js.native
  }
  
  @JSGlobal("ej.ReportViewer.ProcessingMode")
  @js.native
  object ProcessingMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.ReportViewer.ProcessingMode & Double] = js.native
    
    /* 1 */ val Local: typings.ejWebAll.ej.ReportViewer.ProcessingMode.Local & Double = js.native
    
    /* 0 */ val Remote: typings.ejWebAll.ej.ReportViewer.ProcessingMode.Remote & Double = js.native
  }
  
  @JSGlobal("ej.ReportViewer.RenderMode")
  @js.native
  object RenderMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.ReportViewer.RenderMode & Double] = js.native
    
    /* 0 */ val Default: typings.ejWebAll.ej.ReportViewer.RenderMode.Default & Double = js.native
    
    /* 2 */ val Desktop: typings.ejWebAll.ej.ReportViewer.RenderMode.Desktop & Double = js.native
    
    /* 1 */ val Mobile: typings.ejWebAll.ej.ReportViewer.RenderMode.Mobile & Double = js.native
  }
  
  @JSGlobal("ej.ReportViewer.ToolbarItems")
  @js.native
  object ToolbarItems extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.ReportViewer.ToolbarItems & Double] = js.native
    
    /* 4 */ val Export: typings.ejWebAll.ej.ReportViewer.ToolbarItems.Export & Double = js.native
    
    /* 3 */ val FittoPage: typings.ejWebAll.ej.ReportViewer.ToolbarItems.FittoPage & Double = js.native
    
    /* 5 */ val PageNavigation: typings.ejWebAll.ej.ReportViewer.ToolbarItems.PageNavigation & Double = js.native
    
    /* 8 */ val PageSetup: typings.ejWebAll.ej.ReportViewer.ToolbarItems.PageSetup & Double = js.native
    
    /* 6 */ val Parameters: typings.ejWebAll.ej.ReportViewer.ToolbarItems.Parameters & Double = js.native
    
    /* 0 */ val Print: typings.ejWebAll.ej.ReportViewer.ToolbarItems.Print & Double = js.native
    
    /* 7 */ val PrintLayout: typings.ejWebAll.ej.ReportViewer.ToolbarItems.PrintLayout & Double = js.native
    
    /* 1 */ val Refresh: typings.ejWebAll.ej.ReportViewer.ToolbarItems.Refresh & Double = js.native
    
    /* 2 */ val Zoom: typings.ejWebAll.ej.ReportViewer.ToolbarItems.Zoom & Double = js.native
  }
  
  @JSGlobal("ej.ReportViewer.WordFormats")
  @js.native
  object WordFormats extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.ReportViewer.WordFormats & Double] = js.native
    
    /* 20 */ val Automatic: typings.ejWebAll.ej.ReportViewer.WordFormats.Automatic & Double = js.native
    
    /* 2 */ val DOCX: typings.ejWebAll.ej.ReportViewer.WordFormats.DOCX & Double = js.native
    
    /* 0 */ val Doc: typings.ejWebAll.ej.ReportViewer.WordFormats.Doc & Double = js.native
    
    /* 1 */ val Dot: typings.ejWebAll.ej.ReportViewer.WordFormats.Dot & Double = js.native
    
    /* 17 */ val EPUB: typings.ejWebAll.ej.ReportViewer.WordFormats.EPUB & Double = js.native
    
    /* 18 */ val HTML: typings.ejWebAll.ej.ReportViewer.WordFormats.HTML & Double = js.native
    
    /* 15 */ val RTF: typings.ejWebAll.ej.ReportViewer.WordFormats.RTF & Double = js.native
    
    /* 16 */ val Txt: typings.ejWebAll.ej.ReportViewer.WordFormats.Txt & Double = js.native
    
    /* 3 */ val Word2007: typings.ejWebAll.ej.ReportViewer.WordFormats.Word2007 & Double = js.native
    
    /* 9 */ val Word2007Docm: typings.ejWebAll.ej.ReportViewer.WordFormats.Word2007Docm & Double = js.native
    
    /* 12 */ val Word2007Dotm: typings.ejWebAll.ej.ReportViewer.WordFormats.Word2007Dotm & Double = js.native
    
    /* 6 */ val Word2007Dotx: typings.ejWebAll.ej.ReportViewer.WordFormats.Word2007Dotx & Double = js.native
    
    /* 4 */ val Word2010: typings.ejWebAll.ej.ReportViewer.WordFormats.Word2010 & Double = js.native
    
    /* 10 */ val Word2010Docm: typings.ejWebAll.ej.ReportViewer.WordFormats.Word2010Docm & Double = js.native
    
    /* 13 */ val Word2010Dotm: typings.ejWebAll.ej.ReportViewer.WordFormats.Word2010Dotm & Double = js.native
    
    /* 7 */ val Word2010Dotx: typings.ejWebAll.ej.ReportViewer.WordFormats.Word2010Dotx & Double = js.native
    
    /* 5 */ val Word2013: typings.ejWebAll.ej.ReportViewer.WordFormats.Word2013 & Double = js.native
    
    /* 11 */ val Word2013Docm: typings.ejWebAll.ej.ReportViewer.WordFormats.Word2013Docm & Double = js.native
    
    /* 14 */ val Word2013Dotm: typings.ejWebAll.ej.ReportViewer.WordFormats.Word2013Dotm & Double = js.native
    
    /* 8 */ val Word2013Dotx: typings.ejWebAll.ej.ReportViewer.WordFormats.Word2013Dotx & Double = js.native
    
    /* 19 */ val XML: typings.ejWebAll.ej.ReportViewer.WordFormats.XML & Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.ReportViewer.fn")
  @js.native
  def fn: typings.ejWebAll.ej.ReportViewer = js.native
  inline def fn_=(x: typings.ejWebAll.ej.ReportViewer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
