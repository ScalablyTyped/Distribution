package typings.ejWebAll.global.ej

import typings.ejWebAll.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.TreeGrid")
@js.native
class TreeGrid protected ()
  extends typings.ejWebAll.ej.TreeGrid {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejWebAll.ej.TreeGrid.Model) = this()
  def this(element: Element, options: typings.ejWebAll.ej.TreeGrid.Model) = this()
}

/* static members */
@JSGlobal("ej.TreeGrid")
@js.native
object TreeGrid extends js.Object {
  var Locale: js.Any = js.native
  var fn: typings.ejWebAll.ej.TreeGrid = js.native
  @js.native
  object BatchEditMode extends js.Object {
    /* 0 */ val Cell: typings.ejWebAll.ej.TreeGrid.BatchEditMode.Cell with Double = js.native
    /* 2 */ val Dialog: typings.ejWebAll.ej.TreeGrid.BatchEditMode.Dialog with Double = js.native
    /* 1 */ val Row: typings.ejWebAll.ej.TreeGrid.BatchEditMode.Row with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.TreeGrid.BatchEditMode with Double] = js.native
  }
  
  @js.native
  object BeginEditAction extends js.Object {
    /* 1 */ val Click: typings.ejWebAll.ej.TreeGrid.BeginEditAction.Click with Double = js.native
    /* 0 */ val DblClick: typings.ejWebAll.ej.TreeGrid.BeginEditAction.DblClick with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.TreeGrid.BeginEditAction with Double] = js.native
  }
  
  @js.native
  object ClipMode extends js.Object {
    /* 1 */ val Clip: typings.ejWebAll.ej.TreeGrid.ClipMode.Clip with Double = js.native
    /* 0 */ val Ellipsis: typings.ejWebAll.ej.TreeGrid.ClipMode.Ellipsis with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.TreeGrid.ClipMode with Double] = js.native
  }
  
  @js.native
  object ColumnResizeMode extends js.Object {
    /* 0 */ val FixedColumns: typings.ejWebAll.ej.TreeGrid.ColumnResizeMode.FixedColumns with Double = js.native
    /* 1 */ val NextColumn: typings.ejWebAll.ej.TreeGrid.ColumnResizeMode.NextColumn with Double = js.native
    /* 2 */ val Normal: typings.ejWebAll.ej.TreeGrid.ColumnResizeMode.Normal with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.TreeGrid.ColumnResizeMode with Double] = js.native
  }
  
  @js.native
  object ContextMenuItems extends js.Object {
    /* 0 */ val Add: typings.ejWebAll.ej.TreeGrid.ContextMenuItems.Add with Double = js.native
    /* 2 */ val Delete: typings.ejWebAll.ej.TreeGrid.ContextMenuItems.Delete with Double = js.native
    /* 1 */ val Edit: typings.ejWebAll.ej.TreeGrid.ContextMenuItems.Edit with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.TreeGrid.ContextMenuItems with Double] = js.native
  }
  
  @js.native
  object EditMode extends js.Object {
    /* 3 */ val BatchEditing: typings.ejWebAll.ej.TreeGrid.EditMode.BatchEditing with Double = js.native
    /* 0 */ val CellEditing: typings.ejWebAll.ej.TreeGrid.EditMode.CellEditing with Double = js.native
    /* 2 */ val DialogEditing: typings.ejWebAll.ej.TreeGrid.EditMode.DialogEditing with Double = js.native
    /* 1 */ val RowEditing: typings.ejWebAll.ej.TreeGrid.EditMode.RowEditing with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.TreeGrid.EditMode with Double] = js.native
  }
  
  @js.native
  object EditingType extends js.Object {
    /* 1 */ val Boolean: typings.ejWebAll.ej.TreeGrid.EditingType.Boolean with Double = js.native
    /* 4 */ val DatePicker: typings.ejWebAll.ej.TreeGrid.EditingType.DatePicker with Double = js.native
    /* 5 */ val DateTimePicker: typings.ejWebAll.ej.TreeGrid.EditingType.DateTimePicker with Double = js.native
    /* 3 */ val Dropdown: typings.ejWebAll.ej.TreeGrid.EditingType.Dropdown with Double = js.native
    /* 6 */ val Maskedit: typings.ejWebAll.ej.TreeGrid.EditingType.Maskedit with Double = js.native
    /* 2 */ val Numeric: typings.ejWebAll.ej.TreeGrid.EditingType.Numeric with Double = js.native
    /* 0 */ val String: typings.ejWebAll.ej.TreeGrid.EditingType.String with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.TreeGrid.EditingType with Double] = js.native
  }
  
  @js.native
  object FilterHierarchyMode extends js.Object {
    /* 2 */ val Both: typings.ejWebAll.ej.TreeGrid.FilterHierarchyMode.Both with Double = js.native
    /* 1 */ val Child: typings.ejWebAll.ej.TreeGrid.FilterHierarchyMode.Child with Double = js.native
    /* 3 */ val None: typings.ejWebAll.ej.TreeGrid.FilterHierarchyMode.None with Double = js.native
    /* 0 */ val Parent: typings.ejWebAll.ej.TreeGrid.FilterHierarchyMode.Parent with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.TreeGrid.FilterHierarchyMode with Double] = js.native
  }
  
  @js.native
  object FilterType extends js.Object {
    /* 1 */ val Excel: typings.ejWebAll.ej.TreeGrid.FilterType.Excel with Double = js.native
    /* 0 */ val Menu: typings.ejWebAll.ej.TreeGrid.FilterType.Menu with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.TreeGrid.FilterType with Double] = js.native
  }
  
  @js.native
  object HeaderTextOverflow extends js.Object {
    /* 0 */ val None: typings.ejWebAll.ej.TreeGrid.HeaderTextOverflow.None with Double = js.native
    /* 1 */ val Wrap: typings.ejWebAll.ej.TreeGrid.HeaderTextOverflow.Wrap with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.TreeGrid.HeaderTextOverflow with Double] = js.native
  }
  
  @js.native
  object PageSizeMode extends js.Object {
    /* 0 */ val All: typings.ejWebAll.ej.TreeGrid.PageSizeMode.All with Double = js.native
    /* 1 */ val Root: typings.ejWebAll.ej.TreeGrid.PageSizeMode.Root with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.TreeGrid.PageSizeMode with Double] = js.native
  }
  
  @js.native
  object PrintMode extends js.Object {
    /* 0 */ val AllPages: typings.ejWebAll.ej.TreeGrid.PrintMode.AllPages with Double = js.native
    /* 1 */ val CurrentPage: typings.ejWebAll.ej.TreeGrid.PrintMode.CurrentPage with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.TreeGrid.PrintMode with Double] = js.native
  }
  
  @js.native
  object RowPosition extends js.Object {
    /* 2 */ val Above: typings.ejWebAll.ej.TreeGrid.RowPosition.Above with Double = js.native
    /* 3 */ val Below: typings.ejWebAll.ej.TreeGrid.RowPosition.Below with Double = js.native
    /* 1 */ val Bottom: typings.ejWebAll.ej.TreeGrid.RowPosition.Bottom with Double = js.native
    /* 4 */ val Child: typings.ejWebAll.ej.TreeGrid.RowPosition.Child with Double = js.native
    /* 0 */ val Top: typings.ejWebAll.ej.TreeGrid.RowPosition.Top with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.TreeGrid.RowPosition with Double] = js.native
  }
  
  @js.native
  object SearchHierarchyMode extends js.Object {
    /* 2 */ val Both: typings.ejWebAll.ej.TreeGrid.SearchHierarchyMode.Both with Double = js.native
    /* 1 */ val Child: typings.ejWebAll.ej.TreeGrid.SearchHierarchyMode.Child with Double = js.native
    /* 3 */ val None: typings.ejWebAll.ej.TreeGrid.SearchHierarchyMode.None with Double = js.native
    /* 0 */ val Parent: typings.ejWebAll.ej.TreeGrid.SearchHierarchyMode.Parent with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.TreeGrid.SearchHierarchyMode with Double] = js.native
  }
  
  @js.native
  object SelectionMode extends js.Object {
    /* 1 */ val Cell: typings.ejWebAll.ej.TreeGrid.SelectionMode.Cell with Double = js.native
    /* 0 */ val Row: typings.ejWebAll.ej.TreeGrid.SelectionMode.Row with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.TreeGrid.SelectionMode with Double] = js.native
  }
  
  @js.native
  object SelectionType extends js.Object {
    /* 2 */ val Checkbox: typings.ejWebAll.ej.TreeGrid.SelectionType.Checkbox with Double = js.native
    /* 1 */ val Multiple: typings.ejWebAll.ej.TreeGrid.SelectionType.Multiple with Double = js.native
    /* 0 */ val Single: typings.ejWebAll.ej.TreeGrid.SelectionType.Single with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.TreeGrid.SelectionType with Double] = js.native
  }
  
  @js.native
  object SummaryType extends js.Object {
    /* 1 */ val Average: typings.ejWebAll.ej.TreeGrid.SummaryType.Average with Double = js.native
    /* 4 */ val Count: typings.ejWebAll.ej.TreeGrid.SummaryType.Count with Double = js.native
    /* 9 */ val Custom: typings.ejWebAll.ej.TreeGrid.SummaryType.Custom with Double = js.native
    /* 8 */ val FalseCount: typings.ejWebAll.ej.TreeGrid.SummaryType.FalseCount with Double = js.native
    /* 2 */ val Maximum: typings.ejWebAll.ej.TreeGrid.SummaryType.Maximum with Double = js.native
    /* 6 */ val MaximumDate: typings.ejWebAll.ej.TreeGrid.SummaryType.MaximumDate with Double = js.native
    /* 3 */ val Minimum: typings.ejWebAll.ej.TreeGrid.SummaryType.Minimum with Double = js.native
    /* 5 */ val MinimumDate: typings.ejWebAll.ej.TreeGrid.SummaryType.MinimumDate with Double = js.native
    /* 0 */ val Sum: typings.ejWebAll.ej.TreeGrid.SummaryType.Sum with Double = js.native
    /* 7 */ val TrueCount: typings.ejWebAll.ej.TreeGrid.SummaryType.TrueCount with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.TreeGrid.SummaryType with Double] = js.native
  }
  
  @js.native
  object ToolbarItems extends js.Object {
    /* 0 */ val Add: typings.ejWebAll.ej.TreeGrid.ToolbarItems.Add with Double = js.native
    /* 4 */ val Cancel: typings.ejWebAll.ej.TreeGrid.ToolbarItems.Cancel with Double = js.native
    /* 6 */ val CollapseAll: typings.ejWebAll.ej.TreeGrid.ToolbarItems.CollapseAll with Double = js.native
    /* 2 */ val Delete: typings.ejWebAll.ej.TreeGrid.ToolbarItems.Delete with Double = js.native
    /* 1 */ val Edit: typings.ejWebAll.ej.TreeGrid.ToolbarItems.Edit with Double = js.native
    /* 8 */ val ExcelExport: typings.ejWebAll.ej.TreeGrid.ToolbarItems.ExcelExport with Double = js.native
    /* 5 */ val ExpandAll: typings.ejWebAll.ej.TreeGrid.ToolbarItems.ExpandAll with Double = js.native
    /* 7 */ val PdfExport: typings.ejWebAll.ej.TreeGrid.ToolbarItems.PdfExport with Double = js.native
    /* 9 */ val Print: typings.ejWebAll.ej.TreeGrid.ToolbarItems.Print with Double = js.native
    /* 10 */ val Search: typings.ejWebAll.ej.TreeGrid.ToolbarItems.Search with Double = js.native
    /* 3 */ val Update: typings.ejWebAll.ej.TreeGrid.ToolbarItems.Update with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.TreeGrid.ToolbarItems with Double] = js.native
  }
  
  @js.native
  object UnboundType extends js.Object {
    /* 3 */ val Cancel: typings.ejWebAll.ej.TreeGrid.UnboundType.Cancel with Double = js.native
    /* 2 */ val Delete: typings.ejWebAll.ej.TreeGrid.UnboundType.Delete with Double = js.native
    /* 0 */ val Edit: typings.ejWebAll.ej.TreeGrid.UnboundType.Edit with Double = js.native
    /* 1 */ val Save: typings.ejWebAll.ej.TreeGrid.UnboundType.Save with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.TreeGrid.UnboundType with Double] = js.native
  }
  
}

