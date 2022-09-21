package typings.ejWebAll.global.ej

import typings.ejWebAll.JQuery
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.TreeGrid")
@js.native
open class TreeGrid protected ()
  extends StObject
     with typings.ejWebAll.ej.TreeGrid {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejWebAll.ej.Model) = this()
  def this(element: Element, options: typings.ejWebAll.ej.Model) = this()
}
object TreeGrid {
  
  @JSGlobal("ej.TreeGrid")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("ej.TreeGrid.BatchEditMode")
  @js.native
  object BatchEditMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.TreeGrid.BatchEditMode & Double] = js.native
    
    /* 0 */ val Cell: typings.ejWebAll.ej.TreeGrid.BatchEditMode.Cell & Double = js.native
    
    /* 2 */ val Dialog: typings.ejWebAll.ej.TreeGrid.BatchEditMode.Dialog & Double = js.native
    
    /* 1 */ val Row: typings.ejWebAll.ej.TreeGrid.BatchEditMode.Row & Double = js.native
  }
  
  @JSGlobal("ej.TreeGrid.BeginEditAction")
  @js.native
  object BeginEditAction extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.TreeGrid.BeginEditAction & Double] = js.native
    
    /* 1 */ val Click: typings.ejWebAll.ej.TreeGrid.BeginEditAction.Click & Double = js.native
    
    /* 0 */ val DblClick: typings.ejWebAll.ej.TreeGrid.BeginEditAction.DblClick & Double = js.native
  }
  
  @JSGlobal("ej.TreeGrid.ClipMode")
  @js.native
  object ClipMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.TreeGrid.ClipMode & Double] = js.native
    
    /* 1 */ val Clip: typings.ejWebAll.ej.TreeGrid.ClipMode.Clip & Double = js.native
    
    /* 0 */ val Ellipsis: typings.ejWebAll.ej.TreeGrid.ClipMode.Ellipsis & Double = js.native
  }
  
  @JSGlobal("ej.TreeGrid.ColumnResizeMode")
  @js.native
  object ColumnResizeMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.TreeGrid.ColumnResizeMode & Double] = js.native
    
    /* 0 */ val FixedColumns: typings.ejWebAll.ej.TreeGrid.ColumnResizeMode.FixedColumns & Double = js.native
    
    /* 1 */ val NextColumn: typings.ejWebAll.ej.TreeGrid.ColumnResizeMode.NextColumn & Double = js.native
    
    /* 2 */ val Normal: typings.ejWebAll.ej.TreeGrid.ColumnResizeMode.Normal & Double = js.native
  }
  
  @JSGlobal("ej.TreeGrid.ContextMenuItems")
  @js.native
  object ContextMenuItems extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.TreeGrid.ContextMenuItems & Double] = js.native
    
    /* 0 */ val Add: typings.ejWebAll.ej.TreeGrid.ContextMenuItems.Add & Double = js.native
    
    /* 2 */ val Delete: typings.ejWebAll.ej.TreeGrid.ContextMenuItems.Delete & Double = js.native
    
    /* 1 */ val Edit: typings.ejWebAll.ej.TreeGrid.ContextMenuItems.Edit & Double = js.native
  }
  
  @JSGlobal("ej.TreeGrid.EditMode")
  @js.native
  object EditMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.TreeGrid.EditMode & Double] = js.native
    
    /* 3 */ val BatchEditing: typings.ejWebAll.ej.TreeGrid.EditMode.BatchEditing & Double = js.native
    
    /* 0 */ val CellEditing: typings.ejWebAll.ej.TreeGrid.EditMode.CellEditing & Double = js.native
    
    /* 2 */ val DialogEditing: typings.ejWebAll.ej.TreeGrid.EditMode.DialogEditing & Double = js.native
    
    /* 1 */ val RowEditing: typings.ejWebAll.ej.TreeGrid.EditMode.RowEditing & Double = js.native
  }
  
  @JSGlobal("ej.TreeGrid.EditingType")
  @js.native
  object EditingType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.TreeGrid.EditingType & Double] = js.native
    
    /* 1 */ val Boolean: typings.ejWebAll.ej.TreeGrid.EditingType.Boolean & Double = js.native
    
    /* 4 */ val DatePicker: typings.ejWebAll.ej.TreeGrid.EditingType.DatePicker & Double = js.native
    
    /* 5 */ val DateTimePicker: typings.ejWebAll.ej.TreeGrid.EditingType.DateTimePicker & Double = js.native
    
    /* 3 */ val Dropdown: typings.ejWebAll.ej.TreeGrid.EditingType.Dropdown & Double = js.native
    
    /* 6 */ val Maskedit: typings.ejWebAll.ej.TreeGrid.EditingType.Maskedit & Double = js.native
    
    /* 2 */ val Numeric: typings.ejWebAll.ej.TreeGrid.EditingType.Numeric & Double = js.native
    
    /* 0 */ val String: typings.ejWebAll.ej.TreeGrid.EditingType.String & Double = js.native
  }
  
  @JSGlobal("ej.TreeGrid.FilterHierarchyMode")
  @js.native
  object FilterHierarchyMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.TreeGrid.FilterHierarchyMode & Double] = js.native
    
    /* 2 */ val Both: typings.ejWebAll.ej.TreeGrid.FilterHierarchyMode.Both & Double = js.native
    
    /* 1 */ val Child: typings.ejWebAll.ej.TreeGrid.FilterHierarchyMode.Child & Double = js.native
    
    /* 3 */ val None: typings.ejWebAll.ej.TreeGrid.FilterHierarchyMode.None & Double = js.native
    
    /* 0 */ val Parent: typings.ejWebAll.ej.TreeGrid.FilterHierarchyMode.Parent & Double = js.native
  }
  
  @JSGlobal("ej.TreeGrid.FilterType")
  @js.native
  object FilterType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.TreeGrid.FilterType & Double] = js.native
    
    /* 1 */ val Excel: typings.ejWebAll.ej.TreeGrid.FilterType.Excel & Double = js.native
    
    /* 0 */ val Menu: typings.ejWebAll.ej.TreeGrid.FilterType.Menu & Double = js.native
  }
  
  @JSGlobal("ej.TreeGrid.HeaderTextOverflow")
  @js.native
  object HeaderTextOverflow extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.TreeGrid.HeaderTextOverflow & Double] = js.native
    
    /* 0 */ val None: typings.ejWebAll.ej.TreeGrid.HeaderTextOverflow.None & Double = js.native
    
    /* 1 */ val Wrap: typings.ejWebAll.ej.TreeGrid.HeaderTextOverflow.Wrap & Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.TreeGrid.Locale")
  @js.native
  def Locale: Any = js.native
  inline def Locale_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ej.TreeGrid.PageSizeMode")
  @js.native
  object PageSizeMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.TreeGrid.PageSizeMode & Double] = js.native
    
    /* 0 */ val All: typings.ejWebAll.ej.TreeGrid.PageSizeMode.All & Double = js.native
    
    /* 1 */ val Root: typings.ejWebAll.ej.TreeGrid.PageSizeMode.Root & Double = js.native
  }
  
  @JSGlobal("ej.TreeGrid.PrintMode")
  @js.native
  object PrintMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.TreeGrid.PrintMode & Double] = js.native
    
    /* 0 */ val AllPages: typings.ejWebAll.ej.TreeGrid.PrintMode.AllPages & Double = js.native
    
    /* 1 */ val CurrentPage: typings.ejWebAll.ej.TreeGrid.PrintMode.CurrentPage & Double = js.native
  }
  
  @JSGlobal("ej.TreeGrid.RowPosition")
  @js.native
  object RowPosition extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.TreeGrid.RowPosition & Double] = js.native
    
    /* 2 */ val Above: typings.ejWebAll.ej.TreeGrid.RowPosition.Above & Double = js.native
    
    /* 3 */ val Below: typings.ejWebAll.ej.TreeGrid.RowPosition.Below & Double = js.native
    
    /* 1 */ val Bottom: typings.ejWebAll.ej.TreeGrid.RowPosition.Bottom & Double = js.native
    
    /* 4 */ val Child: typings.ejWebAll.ej.TreeGrid.RowPosition.Child & Double = js.native
    
    /* 0 */ val Top: typings.ejWebAll.ej.TreeGrid.RowPosition.Top & Double = js.native
  }
  
  @JSGlobal("ej.TreeGrid.SearchHierarchyMode")
  @js.native
  object SearchHierarchyMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.TreeGrid.SearchHierarchyMode & Double] = js.native
    
    /* 2 */ val Both: typings.ejWebAll.ej.TreeGrid.SearchHierarchyMode.Both & Double = js.native
    
    /* 1 */ val Child: typings.ejWebAll.ej.TreeGrid.SearchHierarchyMode.Child & Double = js.native
    
    /* 3 */ val None: typings.ejWebAll.ej.TreeGrid.SearchHierarchyMode.None & Double = js.native
    
    /* 0 */ val Parent: typings.ejWebAll.ej.TreeGrid.SearchHierarchyMode.Parent & Double = js.native
  }
  
  @JSGlobal("ej.TreeGrid.SelectionMode")
  @js.native
  object SelectionMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.TreeGrid.SelectionMode & Double] = js.native
    
    /* 1 */ val Cell: typings.ejWebAll.ej.TreeGrid.SelectionMode.Cell & Double = js.native
    
    /* 0 */ val Row: typings.ejWebAll.ej.TreeGrid.SelectionMode.Row & Double = js.native
  }
  
  @JSGlobal("ej.TreeGrid.SelectionType")
  @js.native
  object SelectionType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.TreeGrid.SelectionType & Double] = js.native
    
    /* 2 */ val Checkbox: typings.ejWebAll.ej.TreeGrid.SelectionType.Checkbox & Double = js.native
    
    /* 1 */ val Multiple: typings.ejWebAll.ej.TreeGrid.SelectionType.Multiple & Double = js.native
    
    /* 0 */ val Single: typings.ejWebAll.ej.TreeGrid.SelectionType.Single & Double = js.native
  }
  
  @JSGlobal("ej.TreeGrid.SummaryType")
  @js.native
  object SummaryType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.TreeGrid.SummaryType & Double] = js.native
    
    /* 1 */ val Average: typings.ejWebAll.ej.TreeGrid.SummaryType.Average & Double = js.native
    
    /* 4 */ val Count: typings.ejWebAll.ej.TreeGrid.SummaryType.Count & Double = js.native
    
    /* 9 */ val Custom: typings.ejWebAll.ej.TreeGrid.SummaryType.Custom & Double = js.native
    
    /* 8 */ val FalseCount: typings.ejWebAll.ej.TreeGrid.SummaryType.FalseCount & Double = js.native
    
    /* 2 */ val Maximum: typings.ejWebAll.ej.TreeGrid.SummaryType.Maximum & Double = js.native
    
    /* 6 */ val MaximumDate: typings.ejWebAll.ej.TreeGrid.SummaryType.MaximumDate & Double = js.native
    
    /* 3 */ val Minimum: typings.ejWebAll.ej.TreeGrid.SummaryType.Minimum & Double = js.native
    
    /* 5 */ val MinimumDate: typings.ejWebAll.ej.TreeGrid.SummaryType.MinimumDate & Double = js.native
    
    /* 0 */ val Sum: typings.ejWebAll.ej.TreeGrid.SummaryType.Sum & Double = js.native
    
    /* 7 */ val TrueCount: typings.ejWebAll.ej.TreeGrid.SummaryType.TrueCount & Double = js.native
  }
  
  @JSGlobal("ej.TreeGrid.ToolbarItems")
  @js.native
  object ToolbarItems extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.TreeGrid.ToolbarItems & Double] = js.native
    
    /* 0 */ val Add: typings.ejWebAll.ej.TreeGrid.ToolbarItems.Add & Double = js.native
    
    /* 4 */ val Cancel: typings.ejWebAll.ej.TreeGrid.ToolbarItems.Cancel & Double = js.native
    
    /* 6 */ val CollapseAll: typings.ejWebAll.ej.TreeGrid.ToolbarItems.CollapseAll & Double = js.native
    
    /* 2 */ val Delete: typings.ejWebAll.ej.TreeGrid.ToolbarItems.Delete & Double = js.native
    
    /* 1 */ val Edit: typings.ejWebAll.ej.TreeGrid.ToolbarItems.Edit & Double = js.native
    
    /* 8 */ val ExcelExport: typings.ejWebAll.ej.TreeGrid.ToolbarItems.ExcelExport & Double = js.native
    
    /* 5 */ val ExpandAll: typings.ejWebAll.ej.TreeGrid.ToolbarItems.ExpandAll & Double = js.native
    
    /* 7 */ val PdfExport: typings.ejWebAll.ej.TreeGrid.ToolbarItems.PdfExport & Double = js.native
    
    /* 9 */ val Print: typings.ejWebAll.ej.TreeGrid.ToolbarItems.Print & Double = js.native
    
    /* 10 */ val Search: typings.ejWebAll.ej.TreeGrid.ToolbarItems.Search & Double = js.native
    
    /* 3 */ val Update: typings.ejWebAll.ej.TreeGrid.ToolbarItems.Update & Double = js.native
  }
  
  @JSGlobal("ej.TreeGrid.UnboundType")
  @js.native
  object UnboundType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.TreeGrid.UnboundType & Double] = js.native
    
    /* 3 */ val Cancel: typings.ejWebAll.ej.TreeGrid.UnboundType.Cancel & Double = js.native
    
    /* 2 */ val Delete: typings.ejWebAll.ej.TreeGrid.UnboundType.Delete & Double = js.native
    
    /* 0 */ val Edit: typings.ejWebAll.ej.TreeGrid.UnboundType.Edit & Double = js.native
    
    /* 1 */ val Save: typings.ejWebAll.ej.TreeGrid.UnboundType.Save & Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.TreeGrid.fn")
  @js.native
  def fn: typings.ejWebAll.ej.TreeGrid = js.native
  inline def fn_=(x: typings.ejWebAll.ej.TreeGrid): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
