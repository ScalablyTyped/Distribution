package typings.ejWebAll.global.ej

import typings.ejWebAll.JQuery
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.PdfViewer")
@js.native
class PdfViewer protected ()
  extends typings.ejWebAll.ej.PdfViewer {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejWebAll.ej.Model) = this()
  def this(element: Element, options: typings.ejWebAll.ej.Model) = this()
}
object PdfViewer {
  
  @JSGlobal("ej.PdfViewer")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("ej.PdfViewer.AnnotationType")
  @js.native
  object AnnotationType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.PdfViewer.AnnotationType with Double] = js.native
    
    /* 2 */ val Highlight: typings.ejWebAll.ej.PdfViewer.AnnotationType.Highlight with Double = js.native
    
    /* 1 */ val Strikethrough: typings.ejWebAll.ej.PdfViewer.AnnotationType.Strikethrough with Double = js.native
    
    /* 0 */ val Underline: typings.ejWebAll.ej.PdfViewer.AnnotationType.Underline with Double = js.native
  }
  
  @JSGlobal("ej.PdfViewer.BufferingMode")
  @js.native
  object BufferingMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.PdfViewer.BufferingMode with Double] = js.native
    
    /* 1 */ val Complete: typings.ejWebAll.ej.PdfViewer.BufferingMode.Complete with Double = js.native
    
    /* 0 */ val Default: typings.ejWebAll.ej.PdfViewer.BufferingMode.Default with Double = js.native
  }
  
  @JSGlobal("ej.PdfViewer.InteractionMode")
  @js.native
  object InteractionMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.PdfViewer.InteractionMode with Double] = js.native
    
    /* 1 */ val Pan: typings.ejWebAll.ej.PdfViewer.InteractionMode.Pan with Double = js.native
    
    /* 0 */ val TextSelection: typings.ejWebAll.ej.PdfViewer.InteractionMode.TextSelection with Double = js.native
  }
  
  @JSGlobal("ej.PdfViewer.LinkTarget")
  @js.native
  object LinkTarget extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.PdfViewer.LinkTarget with Double] = js.native
    
    /* 0 */ val Default: typings.ejWebAll.ej.PdfViewer.LinkTarget.Default with Double = js.native
    
    /* 1 */ val NewTab: typings.ejWebAll.ej.PdfViewer.LinkTarget.NewTab with Double = js.native
    
    /* 2 */ val NewWindow: typings.ejWebAll.ej.PdfViewer.LinkTarget.NewWindow with Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.PdfViewer.Locale")
  @js.native
  def Locale: js.Any = js.native
  @scala.inline
  def Locale_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ej.PdfViewer.PdfService")
  @js.native
  object PdfService extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.PdfViewer.PdfService with Double] = js.native
    
    /* 0 */ val Local: typings.ejWebAll.ej.PdfViewer.PdfService.Local with Double = js.native
    
    /* 1 */ val Remote: typings.ejWebAll.ej.PdfViewer.PdfService.Remote with Double = js.native
  }
  
  @JSGlobal("ej.PdfViewer.ToolbarItems")
  @js.native
  object ToolbarItems extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.PdfViewer.ToolbarItems with Double] = js.native
    
    /* 8 */ val All: typings.ejWebAll.ej.PdfViewer.ToolbarItems.All with Double = js.native
    
    /* 3 */ val DownloadTool: typings.ejWebAll.ej.PdfViewer.ToolbarItems.DownloadTool with Double = js.native
    
    /* 0 */ val MagnificationTools: typings.ejWebAll.ej.PdfViewer.ToolbarItems.MagnificationTools with Double = js.native
    
    /* 1 */ val PageNavigationTools: typings.ejWebAll.ej.PdfViewer.ToolbarItems.PageNavigationTools with Double = js.native
    
    /* 2 */ val PrintTools: typings.ejWebAll.ej.PdfViewer.ToolbarItems.PrintTools with Double = js.native
    
    /* 7 */ val SelectionTool: typings.ejWebAll.ej.PdfViewer.ToolbarItems.SelectionTool with Double = js.native
    
    /* 6 */ val SignatureTool: typings.ejWebAll.ej.PdfViewer.ToolbarItems.SignatureTool with Double = js.native
    
    /* 5 */ val TextMarkupAnnotationTools: typings.ejWebAll.ej.PdfViewer.ToolbarItems.TextMarkupAnnotationTools with Double = js.native
    
    /* 4 */ val TextSearchTool: typings.ejWebAll.ej.PdfViewer.ToolbarItems.TextSearchTool with Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.PdfViewer.fn")
  @js.native
  def fn: typings.ejWebAll.ej.PdfViewer = js.native
  @scala.inline
  def fn_=(x: typings.ejWebAll.ej.PdfViewer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
