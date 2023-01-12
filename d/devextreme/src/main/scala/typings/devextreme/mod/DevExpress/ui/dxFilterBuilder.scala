package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.core.DxElement_
import typings.devextreme.mod.DevExpress.data.DataSource
import typings.devextreme.mod.DevExpress.data.DataSource.DataSourceLike
import typings.devextreme.mod.DevExpress.events.Cancelable
import typings.devextreme.mod.DevExpress.events.ChangedOptionInfo
import typings.devextreme.mod.DevExpress.events.EventInfo
import typings.devextreme.mod.DevExpress.events.InitializedEventInfo
import typings.std.Exclude
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxFilterBuilder
  extends StObject
     with Widget[dxFilterBuilderOptions] {
  
  /**
    * Gets a filter expression that contains only operations supported by the DataSource.
    */
  def getFilterExpression(): String | js.Array[Any] | js.Function = js.native
}
object dxFilterBuilder {
  
  type ContentReadyEvent = EventInfo[dxFilterBuilder]
  
  type CustomOperation = dxFilterBuilderCustomOperation
  
  trait CustomOperationEditorTemplate extends StObject {
    
    val field: Field
    
    val setValue: js.Function
    
    val value: js.UndefOr[String | Double | js.Date] = js.undefined
  }
  object CustomOperationEditorTemplate {
    
    inline def apply(field: Field, setValue: js.Function): CustomOperationEditorTemplate = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], setValue = setValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomOperationEditorTemplate]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CustomOperationEditorTemplate] (val x: Self) extends AnyVal {
      
      inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      inline def setSetValue(value: js.Function): Self = StObject.set(x, "setValue", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String | Double | js.Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type DisposingEvent = EventInfo[dxFilterBuilder]
  
  trait EditorPreparedEvent
    extends StObject
       with EventInfo[dxFilterBuilder] {
    
    val dataField: js.UndefOr[String] = js.undefined
    
    val disabled: Boolean
    
    val editorElement: DxElement_[HTMLElement]
    
    val editorName: String
    
    val filterOperation: js.UndefOr[String] = js.undefined
    
    val readOnly: Boolean
    
    val rtlEnabled: Boolean
    
    val setValue: Any
    
    val updateValueTimeout: js.UndefOr[Double] = js.undefined
    
    val value: js.UndefOr[Any] = js.undefined
    
    val width: js.UndefOr[Double] = js.undefined
  }
  object EditorPreparedEvent {
    
    inline def apply(
      component: dxFilterBuilder,
      disabled: Boolean,
      editorElement: DxElement_[HTMLElement],
      editorName: String,
      element: DxElement_[HTMLElement],
      readOnly: Boolean,
      rtlEnabled: Boolean,
      setValue: Any
    ): EditorPreparedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], editorElement = editorElement.asInstanceOf[js.Any], editorName = editorName.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], rtlEnabled = rtlEnabled.asInstanceOf[js.Any], setValue = setValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[EditorPreparedEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EditorPreparedEvent] (val x: Self) extends AnyVal {
      
      inline def setDataField(value: String): Self = StObject.set(x, "dataField", value.asInstanceOf[js.Any])
      
      inline def setDataFieldUndefined: Self = StObject.set(x, "dataField", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setEditorElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "editorElement", value.asInstanceOf[js.Any])
      
      inline def setEditorName(value: String): Self = StObject.set(x, "editorName", value.asInstanceOf[js.Any])
      
      inline def setFilterOperation(value: String): Self = StObject.set(x, "filterOperation", value.asInstanceOf[js.Any])
      
      inline def setFilterOperationUndefined: Self = StObject.set(x, "filterOperation", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setRtlEnabled(value: Boolean): Self = StObject.set(x, "rtlEnabled", value.asInstanceOf[js.Any])
      
      inline def setSetValue(value: Any): Self = StObject.set(x, "setValue", value.asInstanceOf[js.Any])
      
      inline def setUpdateValueTimeout(value: Double): Self = StObject.set(x, "updateValueTimeout", value.asInstanceOf[js.Any])
      
      inline def setUpdateValueTimeoutUndefined: Self = StObject.set(x, "updateValueTimeout", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait EditorPreparingEvent
    extends StObject
       with Cancelable
       with EventInfo[dxFilterBuilder] {
    
    val dataField: js.UndefOr[String] = js.undefined
    
    val disabled: Boolean
    
    val editorElement: js.UndefOr[DxElement_[HTMLElement]] = js.undefined
    
    var editorName: String
    
    var editorOptions: js.UndefOr[Any] = js.undefined
    
    val filterOperation: js.UndefOr[String] = js.undefined
    
    val readOnly: Boolean
    
    val rtlEnabled: Boolean
    
    val setValue: Any
    
    var updateValueTimeout: js.UndefOr[Double] = js.undefined
    
    val value: js.UndefOr[Any] = js.undefined
    
    val width: js.UndefOr[Double] = js.undefined
  }
  object EditorPreparingEvent {
    
    inline def apply(
      component: dxFilterBuilder,
      disabled: Boolean,
      editorName: String,
      element: DxElement_[HTMLElement],
      readOnly: Boolean,
      rtlEnabled: Boolean,
      setValue: Any
    ): EditorPreparingEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], editorName = editorName.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], rtlEnabled = rtlEnabled.asInstanceOf[js.Any], setValue = setValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[EditorPreparingEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EditorPreparingEvent] (val x: Self) extends AnyVal {
      
      inline def setDataField(value: String): Self = StObject.set(x, "dataField", value.asInstanceOf[js.Any])
      
      inline def setDataFieldUndefined: Self = StObject.set(x, "dataField", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setEditorElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "editorElement", value.asInstanceOf[js.Any])
      
      inline def setEditorElementUndefined: Self = StObject.set(x, "editorElement", js.undefined)
      
      inline def setEditorName(value: String): Self = StObject.set(x, "editorName", value.asInstanceOf[js.Any])
      
      inline def setEditorOptions(value: Any): Self = StObject.set(x, "editorOptions", value.asInstanceOf[js.Any])
      
      inline def setEditorOptionsUndefined: Self = StObject.set(x, "editorOptions", js.undefined)
      
      inline def setFilterOperation(value: String): Self = StObject.set(x, "filterOperation", value.asInstanceOf[js.Any])
      
      inline def setFilterOperationUndefined: Self = StObject.set(x, "filterOperation", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setRtlEnabled(value: Boolean): Self = StObject.set(x, "rtlEnabled", value.asInstanceOf[js.Any])
      
      inline def setSetValue(value: Any): Self = StObject.set(x, "setValue", value.asInstanceOf[js.Any])
      
      inline def setUpdateValueTimeout(value: Double): Self = StObject.set(x, "updateValueTimeout", value.asInstanceOf[js.Any])
      
      inline def setUpdateValueTimeoutUndefined: Self = StObject.set(x, "updateValueTimeout", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  type Field = dxFilterBuilderField
  
  trait FieldEditorTemplate extends StObject {
    
    val field: Field
    
    val filterOperation: js.UndefOr[String] = js.undefined
    
    val setValue: js.Function
    
    val value: js.UndefOr[String | Double | js.Date] = js.undefined
  }
  object FieldEditorTemplate {
    
    inline def apply(field: Field, setValue: js.Function): FieldEditorTemplate = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], setValue = setValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldEditorTemplate]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FieldEditorTemplate] (val x: Self) extends AnyVal {
      
      inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      inline def setFilterOperation(value: String): Self = StObject.set(x, "filterOperation", value.asInstanceOf[js.Any])
      
      inline def setFilterOperationUndefined: Self = StObject.set(x, "filterOperation", js.undefined)
      
      inline def setSetValue(value: js.Function): Self = StObject.set(x, "setValue", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String | Double | js.Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.Equalssign
    - typings.devextreme.devextremeStrings.LessthansignGreaterthansign
    - typings.devextreme.devextremeStrings.Lessthansign
    - typings.devextreme.devextremeStrings.LessthansignEqualssign
    - typings.devextreme.devextremeStrings.Greaterthansign
    - typings.devextreme.devextremeStrings.GreaterthansignEqualssign
    - typings.devextreme.devextremeStrings.contains
    - typings.devextreme.devextremeStrings.endswith
    - typings.devextreme.devextremeStrings.isblank
    - typings.devextreme.devextremeStrings.isnotblank
    - typings.devextreme.devextremeStrings.notcontains
    - typings.devextreme.devextremeStrings.startswith
    - typings.devextreme.devextremeStrings.between
  */
  trait FilterBuilderOperation extends StObject
  object FilterBuilderOperation {
    
    inline def Equalssign: typings.devextreme.devextremeStrings.Equalssign = "=".asInstanceOf[typings.devextreme.devextremeStrings.Equalssign]
    
    inline def Greaterthansign: typings.devextreme.devextremeStrings.Greaterthansign = ">".asInstanceOf[typings.devextreme.devextremeStrings.Greaterthansign]
    
    inline def GreaterthansignEqualssign: typings.devextreme.devextremeStrings.GreaterthansignEqualssign = ">=".asInstanceOf[typings.devextreme.devextremeStrings.GreaterthansignEqualssign]
    
    inline def Lessthansign: typings.devextreme.devextremeStrings.Lessthansign = "<".asInstanceOf[typings.devextreme.devextremeStrings.Lessthansign]
    
    inline def LessthansignEqualssign: typings.devextreme.devextremeStrings.LessthansignEqualssign = "<=".asInstanceOf[typings.devextreme.devextremeStrings.LessthansignEqualssign]
    
    inline def LessthansignGreaterthansign: typings.devextreme.devextremeStrings.LessthansignGreaterthansign = "<>".asInstanceOf[typings.devextreme.devextremeStrings.LessthansignGreaterthansign]
    
    inline def between: typings.devextreme.devextremeStrings.between = "between".asInstanceOf[typings.devextreme.devextremeStrings.between]
    
    inline def contains: typings.devextreme.devextremeStrings.contains = "contains".asInstanceOf[typings.devextreme.devextremeStrings.contains]
    
    inline def endswith: typings.devextreme.devextremeStrings.endswith = "endswith".asInstanceOf[typings.devextreme.devextremeStrings.endswith]
    
    inline def isblank: typings.devextreme.devextremeStrings.isblank = "isblank".asInstanceOf[typings.devextreme.devextremeStrings.isblank]
    
    inline def isnotblank: typings.devextreme.devextremeStrings.isnotblank = "isnotblank".asInstanceOf[typings.devextreme.devextremeStrings.isnotblank]
    
    inline def notcontains: typings.devextreme.devextremeStrings.notcontains = "notcontains".asInstanceOf[typings.devextreme.devextremeStrings.notcontains]
    
    inline def startswith: typings.devextreme.devextremeStrings.startswith = "startswith".asInstanceOf[typings.devextreme.devextremeStrings.startswith]
  }
  
  type FilterLookupDataSource[T] = Exclude[DataSourceLike[T, Any], String | (DataSource[Any, Any])]
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.and
    - typings.devextreme.devextremeStrings.or
    - typings.devextreme.devextremeStrings.notAnd
    - typings.devextreme.devextremeStrings.notOr
  */
  trait GroupOperation extends StObject
  object GroupOperation {
    
    inline def and: typings.devextreme.devextremeStrings.and = "and".asInstanceOf[typings.devextreme.devextremeStrings.and]
    
    inline def notAnd: typings.devextreme.devextremeStrings.notAnd = "notAnd".asInstanceOf[typings.devextreme.devextremeStrings.notAnd]
    
    inline def notOr: typings.devextreme.devextremeStrings.notOr = "notOr".asInstanceOf[typings.devextreme.devextremeStrings.notOr]
    
    inline def or: typings.devextreme.devextremeStrings.or = "or".asInstanceOf[typings.devextreme.devextremeStrings.or]
  }
  
  type InitializedEvent = InitializedEventInfo[dxFilterBuilder]
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxFilterBuilder]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxFilterBuilder, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  type Properties = dxFilterBuilderOptions
  
  trait ValueChangedEvent
    extends StObject
       with EventInfo[dxFilterBuilder] {
    
    val previousValue: js.UndefOr[Any] = js.undefined
    
    val value: js.UndefOr[Any] = js.undefined
  }
  object ValueChangedEvent {
    
    inline def apply(component: dxFilterBuilder, element: DxElement_[HTMLElement]): ValueChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueChangedEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ValueChangedEvent] (val x: Self) extends AnyVal {
      
      inline def setPreviousValue(value: Any): Self = StObject.set(x, "previousValue", value.asInstanceOf[js.Any])
      
      inline def setPreviousValueUndefined: Self = StObject.set(x, "previousValue", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
