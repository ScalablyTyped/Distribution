package typings.ejWebAll.global.ej

import typings.ejWebAll.JQuery
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.Grid")
@js.native
open class Grid protected ()
  extends StObject
     with typings.ejWebAll.ej.Grid {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejWebAll.ej.Model) = this()
  def this(element: Element, options: typings.ejWebAll.ej.Model) = this()
}
object Grid {
  
  @JSGlobal("ej.Grid")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("ej.Grid.CellSelectionMode")
  @js.native
  object CellSelectionMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Grid.CellSelectionMode & Double] = js.native
    
    /* 1 */ val Box: typings.ejWebAll.ej.Grid.CellSelectionMode.Box & Double = js.native
    
    /* 0 */ val Flow: typings.ejWebAll.ej.Grid.CellSelectionMode.Flow & Double = js.native
  }
  
  @JSGlobal("ej.Grid.ClipMode")
  @js.native
  object ClipMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Grid.ClipMode & Double] = js.native
    
    /* 1 */ val Clip: typings.ejWebAll.ej.Grid.ClipMode.Clip & Double = js.native
    
    /* 0 */ val Ellipsis: typings.ejWebAll.ej.Grid.ClipMode.Ellipsis & Double = js.native
    
    /* 2 */ val EllipsisWithTooltip: typings.ejWebAll.ej.Grid.ClipMode.EllipsisWithTooltip & Double = js.native
  }
  
  @JSGlobal("ej.Grid.ColumnLayout")
  @js.native
  object ColumnLayout extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Grid.ColumnLayout & Double] = js.native
    
    /* 0 */ val Auto: typings.ejWebAll.ej.Grid.ColumnLayout.Auto & Double = js.native
    
    /* 1 */ val Fixed: typings.ejWebAll.ej.Grid.ColumnLayout.Fixed & Double = js.native
  }
  
  @JSGlobal("ej.Grid.DragBehavior")
  @js.native
  object DragBehavior extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Grid.DragBehavior & Double] = js.native
    
    /* 1 */ val Copy: typings.ejWebAll.ej.Grid.DragBehavior.Copy & Double = js.native
    
    /* 0 */ val Move: typings.ejWebAll.ej.Grid.DragBehavior.Move & Double = js.native
  }
  
  @JSGlobal("ej.Grid.EditMode")
  @js.native
  object EditMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Grid.EditMode & Double] = js.native
    
    /* 3 */ val Batch: typings.ejWebAll.ej.Grid.EditMode.Batch & Double = js.native
    
    /* 1 */ val Dialog: typings.ejWebAll.ej.Grid.EditMode.Dialog & Double = js.native
    
    /* 2 */ val DialogTemplate: typings.ejWebAll.ej.Grid.EditMode.DialogTemplate & Double = js.native
    
    /* 6 */ val ExternalForm: typings.ejWebAll.ej.Grid.EditMode.ExternalForm & Double = js.native
    
    /* 7 */ val ExternalFormTemplate: typings.ejWebAll.ej.Grid.EditMode.ExternalFormTemplate & Double = js.native
    
    /* 4 */ val InlineForm: typings.ejWebAll.ej.Grid.EditMode.InlineForm & Double = js.native
    
    /* 5 */ val InlineTemplateForm: typings.ejWebAll.ej.Grid.EditMode.InlineTemplateForm & Double = js.native
    
    /* 0 */ val Normal: typings.ejWebAll.ej.Grid.EditMode.Normal & Double = js.native
  }
  
  @JSGlobal("ej.Grid.EditingType")
  @js.native
  object EditingType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Grid.EditingType & Double] = js.native
    
    /* 1 */ val Boolean: typings.ejWebAll.ej.Grid.EditingType.Boolean & Double = js.native
    
    /* 4 */ val DatePicker: typings.ejWebAll.ej.Grid.EditingType.DatePicker & Double = js.native
    
    /* 5 */ val DateTimePicker: typings.ejWebAll.ej.Grid.EditingType.DateTimePicker & Double = js.native
    
    /* 3 */ val Dropdown: typings.ejWebAll.ej.Grid.EditingType.Dropdown & Double = js.native
    
    /* 2 */ val Numeric: typings.ejWebAll.ej.Grid.EditingType.Numeric & Double = js.native
    
    /* 0 */ val String: typings.ejWebAll.ej.Grid.EditingType.String & Double = js.native
  }
  
  @JSGlobal("ej.Grid.FilterBarMode")
  @js.native
  object FilterBarMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Grid.FilterBarMode & Double] = js.native
    
    /* 0 */ val Immediate: typings.ejWebAll.ej.Grid.FilterBarMode.Immediate & Double = js.native
    
    /* 1 */ val OnEnter: typings.ejWebAll.ej.Grid.FilterBarMode.OnEnter & Double = js.native
  }
  
  @JSGlobal("ej.Grid.FilterType")
  @js.native
  object FilterType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Grid.FilterType & Double] = js.native
    
    /* 1 */ val Excel: typings.ejWebAll.ej.Grid.FilterType.Excel & Double = js.native
    
    /* 0 */ val Menu: typings.ejWebAll.ej.Grid.FilterType.Menu & Double = js.native
  }
  
  @JSGlobal("ej.Grid.FormPosition")
  @js.native
  object FormPosition extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Grid.FormPosition & Double] = js.native
    
    /* 0 */ val BottomLeft: typings.ejWebAll.ej.Grid.FormPosition.BottomLeft & Double = js.native
    
    /* 1 */ val TopRight: typings.ejWebAll.ej.Grid.FormPosition.TopRight & Double = js.native
  }
  
  @JSGlobal("ej.Grid.GridLines")
  @js.native
  object GridLines extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Grid.GridLines & Double] = js.native
    
    /* 0 */ val Both: typings.ejWebAll.ej.Grid.GridLines.Both & Double = js.native
    
    /* 1 */ val Horizontal: typings.ejWebAll.ej.Grid.GridLines.Horizontal & Double = js.native
    
    /* 3 */ val None: typings.ejWebAll.ej.Grid.GridLines.None & Double = js.native
    
    /* 2 */ val Vertical: typings.ejWebAll.ej.Grid.GridLines.Vertical & Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.Grid.Locale")
  @js.native
  def Locale: Any = js.native
  inline def Locale_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ej.Grid.PrintMode")
  @js.native
  object PrintMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Grid.PrintMode & Double] = js.native
    
    /* 0 */ val AllPages: typings.ejWebAll.ej.Grid.PrintMode.AllPages & Double = js.native
    
    /* 1 */ val CurrentPage: typings.ejWebAll.ej.Grid.PrintMode.CurrentPage & Double = js.native
  }
  
  @JSGlobal("ej.Grid.ResizeMode")
  @js.native
  object ResizeMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Grid.ResizeMode & Double] = js.native
    
    /* 2 */ val Control: typings.ejWebAll.ej.Grid.ResizeMode.Control & Double = js.native
    
    /* 1 */ val NextColumn: typings.ejWebAll.ej.Grid.ResizeMode.NextColumn & Double = js.native
    
    /* 0 */ val Normal: typings.ejWebAll.ej.Grid.ResizeMode.Normal & Double = js.native
  }
  
  @JSGlobal("ej.Grid.RowPosition")
  @js.native
  object RowPosition extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Grid.RowPosition & Double] = js.native
    
    /* 1 */ val Bottom: typings.ejWebAll.ej.Grid.RowPosition.Bottom & Double = js.native
    
    /* 0 */ val Top: typings.ejWebAll.ej.Grid.RowPosition.Top & Double = js.native
  }
  
  @JSGlobal("ej.Grid.SelectionType")
  @js.native
  object SelectionType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Grid.SelectionType & Double] = js.native
    
    /* 1 */ val Multiple: typings.ejWebAll.ej.Grid.SelectionType.Multiple & Double = js.native
    
    /* 0 */ val Single: typings.ejWebAll.ej.Grid.SelectionType.Single & Double = js.native
  }
  
  @JSGlobal("ej.Grid.SummaryType")
  @js.native
  object SummaryType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Grid.SummaryType & Double] = js.native
    
    /* 0 */ val Average: typings.ejWebAll.ej.Grid.SummaryType.Average & Double = js.native
    
    /* 3 */ val Count: typings.ejWebAll.ej.Grid.SummaryType.Count & Double = js.native
    
    /* 5 */ val Custom: typings.ejWebAll.ej.Grid.SummaryType.Custom & Double = js.native
    
    /* 7 */ val FalseCount: typings.ejWebAll.ej.Grid.SummaryType.FalseCount & Double = js.native
    
    /* 2 */ val Maximum: typings.ejWebAll.ej.Grid.SummaryType.Maximum & Double = js.native
    
    /* 1 */ val Minimum: typings.ejWebAll.ej.Grid.SummaryType.Minimum & Double = js.native
    
    /* 4 */ val Sum: typings.ejWebAll.ej.Grid.SummaryType.Sum & Double = js.native
    
    /* 6 */ val TrueCount: typings.ejWebAll.ej.Grid.SummaryType.TrueCount & Double = js.native
  }
  
  @JSGlobal("ej.Grid.ToolBarItems")
  @js.native
  object ToolBarItems extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Grid.ToolBarItems & Double] = js.native
    
    /* 0 */ val Add: typings.ejWebAll.ej.Grid.ToolBarItems.Add & Double = js.native
    
    /* 4 */ val Cancel: typings.ejWebAll.ej.Grid.ToolBarItems.Cancel & Double = js.native
    
    /* 2 */ val Delete: typings.ejWebAll.ej.Grid.ToolBarItems.Delete & Double = js.native
    
    /* 1 */ val Edit: typings.ejWebAll.ej.Grid.ToolBarItems.Edit & Double = js.native
    
    /* 6 */ val PdfExport: typings.ejWebAll.ej.Grid.ToolBarItems.PdfExport & Double = js.native
    
    /* 7 */ val PrintGrid: typings.ejWebAll.ej.Grid.ToolBarItems.PrintGrid & Double = js.native
    
    /* 5 */ val Search: typings.ejWebAll.ej.Grid.ToolBarItems.Search & Double = js.native
    
    /* 3 */ val Update: typings.ejWebAll.ej.Grid.ToolBarItems.Update & Double = js.native
    
    /* 8 */ val WordExport: typings.ejWebAll.ej.Grid.ToolBarItems.WordExport & Double = js.native
  }
  
  @JSGlobal("ej.Grid.UnboundType")
  @js.native
  object UnboundType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Grid.UnboundType & Double] = js.native
    
    /* 3 */ val Cancel: typings.ejWebAll.ej.Grid.UnboundType.Cancel & Double = js.native
    
    /* 2 */ val Delete: typings.ejWebAll.ej.Grid.UnboundType.Delete & Double = js.native
    
    /* 0 */ val Edit: typings.ejWebAll.ej.Grid.UnboundType.Edit & Double = js.native
    
    /* 1 */ val Save: typings.ejWebAll.ej.Grid.UnboundType.Save & Double = js.native
  }
  
  @JSGlobal("ej.Grid.VirtualScrollMode")
  @js.native
  object VirtualScrollMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Grid.VirtualScrollMode & Double] = js.native
    
    /* 1 */ val Continuous: typings.ejWebAll.ej.Grid.VirtualScrollMode.Continuous & Double = js.native
    
    /* 0 */ val Normal: typings.ejWebAll.ej.Grid.VirtualScrollMode.Normal & Double = js.native
  }
  
  @JSGlobal("ej.Grid.WrapMode")
  @js.native
  object WrapMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Grid.WrapMode & Double] = js.native
    
    /* 0 */ val Both: typings.ejWebAll.ej.Grid.WrapMode.Both & Double = js.native
    
    /* 1 */ val Content: typings.ejWebAll.ej.Grid.WrapMode.Content & Double = js.native
    
    /* 2 */ val Header: typings.ejWebAll.ej.Grid.WrapMode.Header & Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.Grid.fn")
  @js.native
  def fn: typings.ejWebAll.ej.Grid = js.native
  inline def fn_=(x: typings.ejWebAll.ej.Grid): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
