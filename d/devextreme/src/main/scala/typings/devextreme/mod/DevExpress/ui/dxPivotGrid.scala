package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.AlternateDataFields
import typings.devextreme.mod.DevExpress.core.DxElement_
import typings.devextreme.mod.DevExpress.data.PivotGridDataSource
import typings.devextreme.mod.DevExpress.data.PivotGridDataSource.Field
import typings.devextreme.mod.DevExpress.events.Cancelable
import typings.devextreme.mod.DevExpress.events.ChangedOptionInfo
import typings.devextreme.mod.DevExpress.events.EventInfo
import typings.devextreme.mod.DevExpress.events.InitializedEventInfo
import typings.devextreme.mod.DevExpress.events.NativeEventInfo
import typings.devextreme.mod.DevExpress.ui.dxPopup.Properties
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.PointerEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxPivotGrid
  extends StObject
     with Widget[dxPivotGridOptions] {
  
  /**
    * Binds a Chart to the PivotGrid.
    */
  def bindChart(chart: String, integrationOptions: AlternateDataFields): js.Function & Null = js.native
  def bindChart(chart: Any, integrationOptions: AlternateDataFields): js.Function & Null = js.native
  def bindChart(chart: DxElement_[HTMLElement], integrationOptions: AlternateDataFields): js.Function & Null = js.native
  
  /**
    * Gets the PivotGridDataSource instance.
    */
  def getDataSource(): PivotGridDataSource = js.native
  
  /**
    * Gets the Popup instance of the field chooser window.
    */
  def getFieldChooserPopup(): dxPopup[Properties] = js.native
  
  /**
    * Updates the UI component to the size of its content.
    */
  def updateDimensions(): Unit = js.native
}
object dxPivotGrid {
  
  type Cell = dxPivotGridPivotGridCell
  
  trait CellClickEvent
    extends StObject
       with Cancelable
       with NativeEventInfo[dxPivotGrid, MouseEvent | PointerEvent] {
    
    val area: js.UndefOr[String] = js.undefined
    
    val cell: js.UndefOr[Cell] = js.undefined
    
    val cellElement: js.UndefOr[DxElement_[HTMLElement]] = js.undefined
    
    val columnFields: js.UndefOr[js.Array[Field]] = js.undefined
    
    val columnIndex: js.UndefOr[Double] = js.undefined
    
    val dataFields: js.UndefOr[js.Array[Field]] = js.undefined
    
    val rowFields: js.UndefOr[js.Array[Field]] = js.undefined
    
    val rowIndex: js.UndefOr[Double] = js.undefined
  }
  object CellClickEvent {
    
    inline def apply(component: dxPivotGrid, element: DxElement_[HTMLElement]): CellClickEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[CellClickEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CellClickEvent] (val x: Self) extends AnyVal {
      
      inline def setArea(value: String): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
      
      inline def setAreaUndefined: Self = StObject.set(x, "area", js.undefined)
      
      inline def setCell(value: Cell): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
      
      inline def setCellElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "cellElement", value.asInstanceOf[js.Any])
      
      inline def setCellElementUndefined: Self = StObject.set(x, "cellElement", js.undefined)
      
      inline def setCellUndefined: Self = StObject.set(x, "cell", js.undefined)
      
      inline def setColumnFields(value: js.Array[Field]): Self = StObject.set(x, "columnFields", value.asInstanceOf[js.Any])
      
      inline def setColumnFieldsUndefined: Self = StObject.set(x, "columnFields", js.undefined)
      
      inline def setColumnFieldsVarargs(value: Field*): Self = StObject.set(x, "columnFields", js.Array(value*))
      
      inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
      
      inline def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
      
      inline def setDataFields(value: js.Array[Field]): Self = StObject.set(x, "dataFields", value.asInstanceOf[js.Any])
      
      inline def setDataFieldsUndefined: Self = StObject.set(x, "dataFields", js.undefined)
      
      inline def setDataFieldsVarargs(value: Field*): Self = StObject.set(x, "dataFields", js.Array(value*))
      
      inline def setRowFields(value: js.Array[Field]): Self = StObject.set(x, "rowFields", value.asInstanceOf[js.Any])
      
      inline def setRowFieldsUndefined: Self = StObject.set(x, "rowFields", js.undefined)
      
      inline def setRowFieldsVarargs(value: Field*): Self = StObject.set(x, "rowFields", js.Array(value*))
      
      inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      inline def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
    }
  }
  
  trait CellPreparedEvent
    extends StObject
       with EventInfo[dxPivotGrid] {
    
    val area: js.UndefOr[String] = js.undefined
    
    val cell: js.UndefOr[Cell] = js.undefined
    
    val cellElement: js.UndefOr[DxElement_[HTMLElement]] = js.undefined
    
    val columnIndex: js.UndefOr[Double] = js.undefined
    
    val rowIndex: js.UndefOr[Double] = js.undefined
  }
  object CellPreparedEvent {
    
    inline def apply(component: dxPivotGrid, element: DxElement_[HTMLElement]): CellPreparedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[CellPreparedEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CellPreparedEvent] (val x: Self) extends AnyVal {
      
      inline def setArea(value: String): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
      
      inline def setAreaUndefined: Self = StObject.set(x, "area", js.undefined)
      
      inline def setCell(value: Cell): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
      
      inline def setCellElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "cellElement", value.asInstanceOf[js.Any])
      
      inline def setCellElementUndefined: Self = StObject.set(x, "cellElement", js.undefined)
      
      inline def setCellUndefined: Self = StObject.set(x, "cell", js.undefined)
      
      inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
      
      inline def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
      
      inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      inline def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
    }
  }
  
  type ContentReadyEvent = EventInfo[dxPivotGrid]
  
  trait ContextMenuPreparingEvent
    extends StObject
       with EventInfo[dxPivotGrid] {
    
    val area: js.UndefOr[String] = js.undefined
    
    val cell: js.UndefOr[Cell] = js.undefined
    
    val cellElement: js.UndefOr[DxElement_[HTMLElement]] = js.undefined
    
    val columnFields: js.UndefOr[js.Array[Field]] = js.undefined
    
    val columnIndex: js.UndefOr[Double] = js.undefined
    
    val dataFields: js.UndefOr[js.Array[Field]] = js.undefined
    
    val field: js.UndefOr[Field] = js.undefined
    
    var items: js.UndefOr[js.Array[Any]] = js.undefined
    
    val rowFields: js.UndefOr[js.Array[Field]] = js.undefined
    
    val rowIndex: js.UndefOr[Double] = js.undefined
  }
  object ContextMenuPreparingEvent {
    
    inline def apply(component: dxPivotGrid, element: DxElement_[HTMLElement]): ContextMenuPreparingEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContextMenuPreparingEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContextMenuPreparingEvent] (val x: Self) extends AnyVal {
      
      inline def setArea(value: String): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
      
      inline def setAreaUndefined: Self = StObject.set(x, "area", js.undefined)
      
      inline def setCell(value: Cell): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
      
      inline def setCellElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "cellElement", value.asInstanceOf[js.Any])
      
      inline def setCellElementUndefined: Self = StObject.set(x, "cellElement", js.undefined)
      
      inline def setCellUndefined: Self = StObject.set(x, "cell", js.undefined)
      
      inline def setColumnFields(value: js.Array[Field]): Self = StObject.set(x, "columnFields", value.asInstanceOf[js.Any])
      
      inline def setColumnFieldsUndefined: Self = StObject.set(x, "columnFields", js.undefined)
      
      inline def setColumnFieldsVarargs(value: Field*): Self = StObject.set(x, "columnFields", js.Array(value*))
      
      inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
      
      inline def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
      
      inline def setDataFields(value: js.Array[Field]): Self = StObject.set(x, "dataFields", value.asInstanceOf[js.Any])
      
      inline def setDataFieldsUndefined: Self = StObject.set(x, "dataFields", js.undefined)
      
      inline def setDataFieldsVarargs(value: Field*): Self = StObject.set(x, "dataFields", js.Array(value*))
      
      inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
      
      inline def setItems(value: js.Array[Any]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: Any*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setRowFields(value: js.Array[Field]): Self = StObject.set(x, "rowFields", value.asInstanceOf[js.Any])
      
      inline def setRowFieldsUndefined: Self = StObject.set(x, "rowFields", js.undefined)
      
      inline def setRowFieldsVarargs(value: Field*): Self = StObject.set(x, "rowFields", js.Array(value*))
      
      inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      inline def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
    }
  }
  
  type DisposingEvent = EventInfo[dxPivotGrid]
  
  trait ExportingEvent
    extends StObject
       with Cancelable
       with EventInfo[dxPivotGrid] {
    
    var fileName: js.UndefOr[String] = js.undefined
  }
  object ExportingEvent {
    
    inline def apply(component: dxPivotGrid, element: DxElement_[HTMLElement]): ExportingEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExportingEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExportingEvent] (val x: Self) extends AnyVal {
      
      inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    }
  }
  
  type InitializedEvent = InitializedEventInfo[dxPivotGrid]
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxPivotGrid]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxPivotGrid, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.column
    - typings.devextreme.devextremeStrings.row
  */
  trait PivotGridDataFieldArea extends StObject
  object PivotGridDataFieldArea {
    
    inline def column: typings.devextreme.devextremeStrings.column = "column".asInstanceOf[typings.devextreme.devextremeStrings.column]
    
    inline def row: typings.devextreme.devextremeStrings.row = "row".asInstanceOf[typings.devextreme.devextremeStrings.row]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.standard
    - typings.devextreme.devextremeStrings.tree
  */
  trait PivotGridRowHeaderLayout extends StObject
  object PivotGridRowHeaderLayout {
    
    inline def standard: typings.devextreme.devextremeStrings.standard = "standard".asInstanceOf[typings.devextreme.devextremeStrings.standard]
    
    inline def tree: typings.devextreme.devextremeStrings.tree = "tree".asInstanceOf[typings.devextreme.devextremeStrings.tree]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.both
    - typings.devextreme.devextremeStrings.columns
    - typings.devextreme.devextremeStrings.none
    - typings.devextreme.devextremeStrings.rows
  */
  trait PivotGridTotalDisplayMode extends StObject
  object PivotGridTotalDisplayMode {
    
    inline def both: typings.devextreme.devextremeStrings.both = "both".asInstanceOf[typings.devextreme.devextremeStrings.both]
    
    inline def columns: typings.devextreme.devextremeStrings.columns = "columns".asInstanceOf[typings.devextreme.devextremeStrings.columns]
    
    inline def none: typings.devextreme.devextremeStrings.none = "none".asInstanceOf[typings.devextreme.devextremeStrings.none]
    
    inline def rows: typings.devextreme.devextremeStrings.rows = "rows".asInstanceOf[typings.devextreme.devextremeStrings.rows]
  }
  
  type Properties = dxPivotGridOptions
}
