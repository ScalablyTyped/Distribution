package typings.ejWebAll.global.ej

import typings.ejWebAll.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.ReportDesigner")
@js.native
class ReportDesigner protected ()
  extends typings.ejWebAll.ej.ReportDesigner {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejWebAll.ej.ReportDesigner.Model) = this()
  def this(element: Element, options: typings.ejWebAll.ej.ReportDesigner.Model) = this()
}

/* static members */
@JSGlobal("ej.ReportDesigner")
@js.native
object ReportDesigner extends js.Object {
  var Locale: js.Any = js.native
  var fn: typings.ejWebAll.ej.ReportDesigner = js.native
  @js.native
  object ConfigureItems extends js.Object {
    /* 4 */ val All: typings.ejWebAll.ej.ReportDesigner.ConfigureItems.All with Double = js.native
    /* 1 */ val Data: typings.ejWebAll.ej.ReportDesigner.ConfigureItems.Data with Double = js.native
    /* 3 */ val ImageManager: typings.ejWebAll.ej.ReportDesigner.ConfigureItems.ImageManager with Double = js.native
    /* 2 */ val Parameter: typings.ejWebAll.ej.ReportDesigner.ConfigureItems.Parameter with Double = js.native
    /* 0 */ val Property: typings.ejWebAll.ej.ReportDesigner.ConfigureItems.Property with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.ReportDesigner.ConfigureItems with Double] = js.native
  }
  
  @js.native
  object Permission extends js.Object {
    /* 3 */ val All: typings.ejWebAll.ej.ReportDesigner.Permission.All with Double = js.native
    /* 0 */ val Create: typings.ejWebAll.ej.ReportDesigner.Permission.Create with Double = js.native
    /* 2 */ val Delete: typings.ejWebAll.ej.ReportDesigner.Permission.Delete with Double = js.native
    /* 1 */ val Edit: typings.ejWebAll.ej.ReportDesigner.Permission.Edit with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.ReportDesigner.Permission with Double] = js.native
  }
  
  @js.native
  object ToolbarItems extends js.Object {
    /* 15 */ val AlignGrid: typings.ejWebAll.ej.ReportDesigner.ToolbarItems.AlignGrid with Double = js.native
    /* 12 */ val Alignment: typings.ejWebAll.ej.ReportDesigner.ToolbarItems.Alignment with Double = js.native
    /* 19 */ val All: typings.ejWebAll.ej.ReportDesigner.ToolbarItems.All with Double = js.native
    /* 11 */ val Center: typings.ejWebAll.ej.ReportDesigner.ToolbarItems.Center with Double = js.native
    /* 4 */ val Copy: typings.ejWebAll.ej.ReportDesigner.ToolbarItems.Copy with Double = js.native
    /* 3 */ val Cut: typings.ejWebAll.ej.ReportDesigner.ToolbarItems.Cut with Double = js.native
    /* 6 */ val Delete: typings.ejWebAll.ej.ReportDesigner.ToolbarItems.Delete with Double = js.native
    /* 13 */ val Distribute: typings.ejWebAll.ej.ReportDesigner.ToolbarItems.Distribute with Double = js.native
    /* 16 */ val EditDesign: typings.ejWebAll.ej.ReportDesigner.ToolbarItems.EditDesign with Double = js.native
    /* 0 */ val New: typings.ejWebAll.ej.ReportDesigner.ToolbarItems.New with Double = js.native
    /* 1 */ val Open: typings.ejWebAll.ej.ReportDesigner.ToolbarItems.Open with Double = js.native
    /* 10 */ val Order: typings.ejWebAll.ej.ReportDesigner.ToolbarItems.Order with Double = js.native
    /* 5 */ val Paste: typings.ejWebAll.ej.ReportDesigner.ToolbarItems.Paste with Double = js.native
    /* 18 */ val Preview: typings.ejWebAll.ej.ReportDesigner.ToolbarItems.Preview with Double = js.native
    /* 8 */ val Redo: typings.ejWebAll.ej.ReportDesigner.ToolbarItems.Redo with Double = js.native
    /* 2 */ val Save: typings.ejWebAll.ej.ReportDesigner.ToolbarItems.Save with Double = js.native
    /* 14 */ val Sizing: typings.ejWebAll.ej.ReportDesigner.ToolbarItems.Sizing with Double = js.native
    /* 7 */ val Undo: typings.ejWebAll.ej.ReportDesigner.ToolbarItems.Undo with Double = js.native
    /* 17 */ val View: typings.ejWebAll.ej.ReportDesigner.ToolbarItems.View with Double = js.native
    /* 9 */ val Zoom: typings.ejWebAll.ej.ReportDesigner.ToolbarItems.Zoom with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.ReportDesigner.ToolbarItems with Double] = js.native
  }
  
}

