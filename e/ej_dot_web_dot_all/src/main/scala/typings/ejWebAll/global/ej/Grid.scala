package typings.ejWebAll.global.ej

import typings.ejWebAll.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.Grid")
@js.native
class Grid protected ()
  extends typings.ejWebAll.ej.Grid {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejWebAll.ej.Grid.Model) = this()
  def this(element: Element, options: typings.ejWebAll.ej.Grid.Model) = this()
}
/* static members */
@JSGlobal("ej.Grid")
@js.native
object Grid extends js.Object {
  
  var Locale: js.Any = js.native
  
  var fn: typings.ejWebAll.ej.Grid = js.native
  
  @js.native
  object CellSelectionMode extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Grid.CellSelectionMode with Double] = js.native
    
    /* 1 */ val Box: typings.ejWebAll.ej.Grid.CellSelectionMode.Box with Double = js.native
    
    /* 0 */ val Flow: typings.ejWebAll.ej.Grid.CellSelectionMode.Flow with Double = js.native
  }
  
  @js.native
  object ClipMode extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Grid.ClipMode with Double] = js.native
    
    /* 1 */ val Clip: typings.ejWebAll.ej.Grid.ClipMode.Clip with Double = js.native
    
    /* 0 */ val Ellipsis: typings.ejWebAll.ej.Grid.ClipMode.Ellipsis with Double = js.native
    
    /* 2 */ val EllipsisWithTooltip: typings.ejWebAll.ej.Grid.ClipMode.EllipsisWithTooltip with Double = js.native
  }
  
  @js.native
  object ColumnLayout extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Grid.ColumnLayout with Double] = js.native
    
    /* 0 */ val Auto: typings.ejWebAll.ej.Grid.ColumnLayout.Auto with Double = js.native
    
    /* 1 */ val Fixed: typings.ejWebAll.ej.Grid.ColumnLayout.Fixed with Double = js.native
  }
  
  @js.native
  object DragBehavior extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Grid.DragBehavior with Double] = js.native
    
    /* 1 */ val Copy: typings.ejWebAll.ej.Grid.DragBehavior.Copy with Double = js.native
    
    /* 0 */ val Move: typings.ejWebAll.ej.Grid.DragBehavior.Move with Double = js.native
  }
  
  @js.native
  object EditMode extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Grid.EditMode with Double] = js.native
    
    /* 3 */ val Batch: typings.ejWebAll.ej.Grid.EditMode.Batch with Double = js.native
    
    /* 1 */ val Dialog: typings.ejWebAll.ej.Grid.EditMode.Dialog with Double = js.native
    
    /* 2 */ val DialogTemplate: typings.ejWebAll.ej.Grid.EditMode.DialogTemplate with Double = js.native
    
    /* 6 */ val ExternalForm: typings.ejWebAll.ej.Grid.EditMode.ExternalForm with Double = js.native
    
    /* 7 */ val ExternalFormTemplate: typings.ejWebAll.ej.Grid.EditMode.ExternalFormTemplate with Double = js.native
    
    /* 4 */ val InlineForm: typings.ejWebAll.ej.Grid.EditMode.InlineForm with Double = js.native
    
    /* 5 */ val InlineTemplateForm: typings.ejWebAll.ej.Grid.EditMode.InlineTemplateForm with Double = js.native
    
    /* 0 */ val Normal: typings.ejWebAll.ej.Grid.EditMode.Normal with Double = js.native
  }
  
  @js.native
  object EditingType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Grid.EditingType with Double] = js.native
    
    /* 1 */ val Boolean: typings.ejWebAll.ej.Grid.EditingType.Boolean with Double = js.native
    
    /* 4 */ val DatePicker: typings.ejWebAll.ej.Grid.EditingType.DatePicker with Double = js.native
    
    /* 5 */ val DateTimePicker: typings.ejWebAll.ej.Grid.EditingType.DateTimePicker with Double = js.native
    
    /* 3 */ val Dropdown: typings.ejWebAll.ej.Grid.EditingType.Dropdown with Double = js.native
    
    /* 2 */ val Numeric: typings.ejWebAll.ej.Grid.EditingType.Numeric with Double = js.native
    
    /* 0 */ val String: typings.ejWebAll.ej.Grid.EditingType.String with Double = js.native
  }
  
  @js.native
  object FilterBarMode extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Grid.FilterBarMode with Double] = js.native
    
    /* 0 */ val Immediate: typings.ejWebAll.ej.Grid.FilterBarMode.Immediate with Double = js.native
    
    /* 1 */ val OnEnter: typings.ejWebAll.ej.Grid.FilterBarMode.OnEnter with Double = js.native
  }
  
  @js.native
  object FilterType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Grid.FilterType with Double] = js.native
    
    /* 1 */ val Excel: typings.ejWebAll.ej.Grid.FilterType.Excel with Double = js.native
    
    /* 0 */ val Menu: typings.ejWebAll.ej.Grid.FilterType.Menu with Double = js.native
  }
  
  @js.native
  object FormPosition extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Grid.FormPosition with Double] = js.native
    
    /* 0 */ val BottomLeft: typings.ejWebAll.ej.Grid.FormPosition.BottomLeft with Double = js.native
    
    /* 1 */ val TopRight: typings.ejWebAll.ej.Grid.FormPosition.TopRight with Double = js.native
  }
  
  @js.native
  object GridLines extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Grid.GridLines with Double] = js.native
    
    /* 0 */ val Both: typings.ejWebAll.ej.Grid.GridLines.Both with Double = js.native
    
    /* 1 */ val Horizontal: typings.ejWebAll.ej.Grid.GridLines.Horizontal with Double = js.native
    
    /* 3 */ val None: typings.ejWebAll.ej.Grid.GridLines.None with Double = js.native
    
    /* 2 */ val Vertical: typings.ejWebAll.ej.Grid.GridLines.Vertical with Double = js.native
  }
  
  @js.native
  object PrintMode extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Grid.PrintMode with Double] = js.native
    
    /* 0 */ val AllPages: typings.ejWebAll.ej.Grid.PrintMode.AllPages with Double = js.native
    
    /* 1 */ val CurrentPage: typings.ejWebAll.ej.Grid.PrintMode.CurrentPage with Double = js.native
  }
  
  @js.native
  object ResizeMode extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Grid.ResizeMode with Double] = js.native
    
    /* 2 */ val Control: typings.ejWebAll.ej.Grid.ResizeMode.Control with Double = js.native
    
    /* 1 */ val NextColumn: typings.ejWebAll.ej.Grid.ResizeMode.NextColumn with Double = js.native
    
    /* 0 */ val Normal: typings.ejWebAll.ej.Grid.ResizeMode.Normal with Double = js.native
  }
  
  @js.native
  object RowPosition extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Grid.RowPosition with Double] = js.native
    
    /* 1 */ val Bottom: typings.ejWebAll.ej.Grid.RowPosition.Bottom with Double = js.native
    
    /* 0 */ val Top: typings.ejWebAll.ej.Grid.RowPosition.Top with Double = js.native
  }
  
  @js.native
  object SelectionType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Grid.SelectionType with Double] = js.native
    
    /* 1 */ val Multiple: typings.ejWebAll.ej.Grid.SelectionType.Multiple with Double = js.native
    
    /* 0 */ val Single: typings.ejWebAll.ej.Grid.SelectionType.Single with Double = js.native
  }
  
  @js.native
  object SummaryType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Grid.SummaryType with Double] = js.native
    
    /* 0 */ val Average: typings.ejWebAll.ej.Grid.SummaryType.Average with Double = js.native
    
    /* 3 */ val Count: typings.ejWebAll.ej.Grid.SummaryType.Count with Double = js.native
    
    /* 5 */ val Custom: typings.ejWebAll.ej.Grid.SummaryType.Custom with Double = js.native
    
    /* 7 */ val FalseCount: typings.ejWebAll.ej.Grid.SummaryType.FalseCount with Double = js.native
    
    /* 2 */ val Maximum: typings.ejWebAll.ej.Grid.SummaryType.Maximum with Double = js.native
    
    /* 1 */ val Minimum: typings.ejWebAll.ej.Grid.SummaryType.Minimum with Double = js.native
    
    /* 4 */ val Sum: typings.ejWebAll.ej.Grid.SummaryType.Sum with Double = js.native
    
    /* 6 */ val TrueCount: typings.ejWebAll.ej.Grid.SummaryType.TrueCount with Double = js.native
  }
  
  @js.native
  object ToolBarItems extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Grid.ToolBarItems with Double] = js.native
    
    /* 0 */ val Add: typings.ejWebAll.ej.Grid.ToolBarItems.Add with Double = js.native
    
    /* 4 */ val Cancel: typings.ejWebAll.ej.Grid.ToolBarItems.Cancel with Double = js.native
    
    /* 2 */ val Delete: typings.ejWebAll.ej.Grid.ToolBarItems.Delete with Double = js.native
    
    /* 1 */ val Edit: typings.ejWebAll.ej.Grid.ToolBarItems.Edit with Double = js.native
    
    /* 6 */ val PdfExport: typings.ejWebAll.ej.Grid.ToolBarItems.PdfExport with Double = js.native
    
    /* 7 */ val PrintGrid: typings.ejWebAll.ej.Grid.ToolBarItems.PrintGrid with Double = js.native
    
    /* 5 */ val Search: typings.ejWebAll.ej.Grid.ToolBarItems.Search with Double = js.native
    
    /* 3 */ val Update: typings.ejWebAll.ej.Grid.ToolBarItems.Update with Double = js.native
    
    /* 8 */ val WordExport: typings.ejWebAll.ej.Grid.ToolBarItems.WordExport with Double = js.native
  }
  
  @js.native
  object UnboundType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Grid.UnboundType with Double] = js.native
    
    /* 3 */ val Cancel: typings.ejWebAll.ej.Grid.UnboundType.Cancel with Double = js.native
    
    /* 2 */ val Delete: typings.ejWebAll.ej.Grid.UnboundType.Delete with Double = js.native
    
    /* 0 */ val Edit: typings.ejWebAll.ej.Grid.UnboundType.Edit with Double = js.native
    
    /* 1 */ val Save: typings.ejWebAll.ej.Grid.UnboundType.Save with Double = js.native
  }
  
  @js.native
  object VirtualScrollMode extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Grid.VirtualScrollMode with Double] = js.native
    
    /* 1 */ val Continuous: typings.ejWebAll.ej.Grid.VirtualScrollMode.Continuous with Double = js.native
    
    /* 0 */ val Normal: typings.ejWebAll.ej.Grid.VirtualScrollMode.Normal with Double = js.native
  }
  
  @js.native
  object WrapMode extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Grid.WrapMode with Double] = js.native
    
    /* 0 */ val Both: typings.ejWebAll.ej.Grid.WrapMode.Both with Double = js.native
    
    /* 1 */ val Content: typings.ejWebAll.ej.Grid.WrapMode.Content with Double = js.native
    
    /* 2 */ val Header: typings.ejWebAll.ej.Grid.WrapMode.Header with Double = js.native
  }
}
