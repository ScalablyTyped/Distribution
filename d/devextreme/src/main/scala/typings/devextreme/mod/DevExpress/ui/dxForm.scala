package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.core.DxElement_
import typings.devextreme.mod.DevExpress.core.utils.DxPromise
import typings.devextreme.mod.DevExpress.events.ChangedOptionInfo
import typings.devextreme.mod.DevExpress.events.EventInfo
import typings.devextreme.mod.DevExpress.events.InitializedEventInfo
import typings.devextreme.mod.DevExpress.ui.Editor.Properties
import typings.devextreme.mod.DevExpress.ui.dxValidationGroup.ValidationResult
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxForm
  extends StObject
     with Widget[dxFormOptions] {
  
  /**
    * Gets a button&apos;s instance.
    */
  def getButton(name: String): js.UndefOr[dxButton] = js.native
  
  /**
    * Gets an editor instance. Takes effect only if the form item is visible.
    */
  def getEditor(dataField: String): js.UndefOr[Editor[Properties]] = js.native
  
  /**
    * Gets a form item&apos;s configuration.
    */
  def itemOption(id: String): Any = js.native
  /**
    * Updates the value of a single item option.
    */
  def itemOption(id: String, option: String, value: Any): Unit = js.native
  /**
    * Updates the values of several item properties.
    */
  def itemOption(id: String, options: Any): Unit = js.native
  
  /**
    * Resets the editor&apos;s value to undefined.
    */
  def resetValues(): Unit = js.native
  
  /**
    * Updates a formData field and the corresponding editor.
    */
  def updateData(dataField: String, value: Any): Unit = js.native
  /**
    * Merges the passed `data` object with formData. Matching properties in formData are overwritten and new properties added.
    */
  def updateData(data: Any): Unit = js.native
  
  /**
    * Updates the dimensions of the UI component contents.
    */
  def updateDimensions(): DxPromise[Unit] = js.native
  
  /**
    * Validates the values of all editors on the form against the list of the validation rules specified for each form item.
    */
  def validate(): ValidationResult = js.native
}
object dxForm {
  
  type ButtonItem = dxFormButtonItem
  
  type ContentReadyEvent = EventInfo[dxForm]
  
  type DisposingEvent = EventInfo[dxForm]
  
  trait EditorEnterKeyEvent
    extends StObject
       with EventInfo[dxForm] {
    
    val dataField: js.UndefOr[String] = js.undefined
  }
  object EditorEnterKeyEvent {
    
    inline def apply(component: dxForm, element: DxElement_[HTMLElement]): EditorEnterKeyEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[EditorEnterKeyEvent]
    }
    
    extension [Self <: EditorEnterKeyEvent](x: Self) {
      
      inline def setDataField(value: String): Self = StObject.set(x, "dataField", value.asInstanceOf[js.Any])
      
      inline def setDataFieldUndefined: Self = StObject.set(x, "dataField", js.undefined)
    }
  }
  
  type EmptyItem = dxFormEmptyItem
  
  trait FieldDataChangedEvent
    extends StObject
       with EventInfo[dxForm] {
    
    val dataField: js.UndefOr[String] = js.undefined
    
    val value: js.UndefOr[Any] = js.undefined
  }
  object FieldDataChangedEvent {
    
    inline def apply(component: dxForm, element: DxElement_[HTMLElement]): FieldDataChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldDataChangedEvent]
    }
    
    extension [Self <: FieldDataChangedEvent](x: Self) {
      
      inline def setDataField(value: String): Self = StObject.set(x, "dataField", value.asInstanceOf[js.Any])
      
      inline def setDataFieldUndefined: Self = StObject.set(x, "dataField", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.dxAutocomplete
    - typings.devextreme.devextremeStrings.dxCalendar
    - typings.devextreme.devextremeStrings.dxCheckBox
    - typings.devextreme.devextremeStrings.dxColorBox
    - typings.devextreme.devextremeStrings.dxDateBox
    - typings.devextreme.devextremeStrings.dxDropDownBox
    - typings.devextreme.devextremeStrings.dxHtmlEditor
    - typings.devextreme.devextremeStrings.dxLookup
    - typings.devextreme.devextremeStrings.dxNumberBox
    - typings.devextreme.devextremeStrings.dxRadioGroup
    - typings.devextreme.devextremeStrings.dxRangeSlider
    - typings.devextreme.devextremeStrings.dxSelectBox
    - typings.devextreme.devextremeStrings.dxSlider
    - typings.devextreme.devextremeStrings.dxSwitch
    - typings.devextreme.devextremeStrings.dxTagBox
    - typings.devextreme.devextremeStrings.dxTextArea
    - typings.devextreme.devextremeStrings.dxTextBox
  */
  trait FormItemComponent extends StObject
  object FormItemComponent {
    
    inline def dxAutocomplete: typings.devextreme.devextremeStrings.dxAutocomplete = "dxAutocomplete".asInstanceOf[typings.devextreme.devextremeStrings.dxAutocomplete]
    
    inline def dxCalendar: typings.devextreme.devextremeStrings.dxCalendar = "dxCalendar".asInstanceOf[typings.devextreme.devextremeStrings.dxCalendar]
    
    inline def dxCheckBox: typings.devextreme.devextremeStrings.dxCheckBox = "dxCheckBox".asInstanceOf[typings.devextreme.devextremeStrings.dxCheckBox]
    
    inline def dxColorBox: typings.devextreme.devextremeStrings.dxColorBox = "dxColorBox".asInstanceOf[typings.devextreme.devextremeStrings.dxColorBox]
    
    inline def dxDateBox: typings.devextreme.devextremeStrings.dxDateBox = "dxDateBox".asInstanceOf[typings.devextreme.devextremeStrings.dxDateBox]
    
    inline def dxDropDownBox: typings.devextreme.devextremeStrings.dxDropDownBox = "dxDropDownBox".asInstanceOf[typings.devextreme.devextremeStrings.dxDropDownBox]
    
    inline def dxHtmlEditor: typings.devextreme.devextremeStrings.dxHtmlEditor = "dxHtmlEditor".asInstanceOf[typings.devextreme.devextremeStrings.dxHtmlEditor]
    
    inline def dxLookup: typings.devextreme.devextremeStrings.dxLookup = "dxLookup".asInstanceOf[typings.devextreme.devextremeStrings.dxLookup]
    
    inline def dxNumberBox: typings.devextreme.devextremeStrings.dxNumberBox = "dxNumberBox".asInstanceOf[typings.devextreme.devextremeStrings.dxNumberBox]
    
    inline def dxRadioGroup: typings.devextreme.devextremeStrings.dxRadioGroup = "dxRadioGroup".asInstanceOf[typings.devextreme.devextremeStrings.dxRadioGroup]
    
    inline def dxRangeSlider: typings.devextreme.devextremeStrings.dxRangeSlider = "dxRangeSlider".asInstanceOf[typings.devextreme.devextremeStrings.dxRangeSlider]
    
    inline def dxSelectBox: typings.devextreme.devextremeStrings.dxSelectBox = "dxSelectBox".asInstanceOf[typings.devextreme.devextremeStrings.dxSelectBox]
    
    inline def dxSlider: typings.devextreme.devextremeStrings.dxSlider = "dxSlider".asInstanceOf[typings.devextreme.devextremeStrings.dxSlider]
    
    inline def dxSwitch: typings.devextreme.devextremeStrings.dxSwitch = "dxSwitch".asInstanceOf[typings.devextreme.devextremeStrings.dxSwitch]
    
    inline def dxTagBox: typings.devextreme.devextremeStrings.dxTagBox = "dxTagBox".asInstanceOf[typings.devextreme.devextremeStrings.dxTagBox]
    
    inline def dxTextArea: typings.devextreme.devextremeStrings.dxTextArea = "dxTextArea".asInstanceOf[typings.devextreme.devextremeStrings.dxTextArea]
    
    inline def dxTextBox: typings.devextreme.devextremeStrings.dxTextBox = "dxTextBox".asInstanceOf[typings.devextreme.devextremeStrings.dxTextBox]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.empty
    - typings.devextreme.devextremeStrings.group
    - typings.devextreme.devextremeStrings.simple
    - typings.devextreme.devextremeStrings.tabbed
    - typings.devextreme.devextremeStrings.button
  */
  trait FormItemType extends StObject
  object FormItemType {
    
    inline def button: typings.devextreme.devextremeStrings.button = "button".asInstanceOf[typings.devextreme.devextremeStrings.button]
    
    inline def empty: typings.devextreme.devextremeStrings.empty = "empty".asInstanceOf[typings.devextreme.devextremeStrings.empty]
    
    inline def group: typings.devextreme.devextremeStrings.group = "group".asInstanceOf[typings.devextreme.devextremeStrings.group]
    
    inline def simple: typings.devextreme.devextremeStrings.simple = "simple".asInstanceOf[typings.devextreme.devextremeStrings.simple]
    
    inline def tabbed: typings.devextreme.devextremeStrings.tabbed = "tabbed".asInstanceOf[typings.devextreme.devextremeStrings.tabbed]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.static
    - typings.devextreme.devextremeStrings.floating
    - typings.devextreme.devextremeStrings.hidden
    - typings.devextreme.devextremeStrings.outside
  */
  trait FormLabelMode extends StObject
  object FormLabelMode {
    
    inline def floating: typings.devextreme.devextremeStrings.floating = "floating".asInstanceOf[typings.devextreme.devextremeStrings.floating]
    
    inline def hidden: typings.devextreme.devextremeStrings.hidden = "hidden".asInstanceOf[typings.devextreme.devextremeStrings.hidden]
    
    inline def outside: typings.devextreme.devextremeStrings.outside = "outside".asInstanceOf[typings.devextreme.devextremeStrings.outside]
    
    inline def static: typings.devextreme.devextremeStrings.static = "static".asInstanceOf[typings.devextreme.devextremeStrings.static]
  }
  
  type GroupItem = dxFormGroupItem
  
  trait GroupItemTemplateData extends StObject {
    
    val component: dxForm
    
    val formData: js.UndefOr[Any] = js.undefined
  }
  object GroupItemTemplateData {
    
    inline def apply(component: dxForm): GroupItemTemplateData = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
      __obj.asInstanceOf[GroupItemTemplateData]
    }
    
    extension [Self <: GroupItemTemplateData](x: Self) {
      
      inline def setComponent(value: dxForm): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setFormData(value: Any): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
      
      inline def setFormDataUndefined: Self = StObject.set(x, "formData", js.undefined)
    }
  }
  
  type InitializedEvent = InitializedEventInfo[dxForm]
  
  type Item = SimpleItem | GroupItem | TabbedItem | EmptyItem | ButtonItem
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.left
    - typings.devextreme.devextremeStrings.right
    - typings.devextreme.devextremeStrings.top
  */
  trait LabelLocation extends StObject
  object LabelLocation {
    
    inline def left: typings.devextreme.devextremeStrings.left = "left".asInstanceOf[typings.devextreme.devextremeStrings.left]
    
    inline def right: typings.devextreme.devextremeStrings.right = "right".asInstanceOf[typings.devextreme.devextremeStrings.right]
    
    inline def top: typings.devextreme.devextremeStrings.top = "top".asInstanceOf[typings.devextreme.devextremeStrings.top]
  }
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxForm]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxForm, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  type Properties = dxFormOptions
  
  type SimpleItem = dxFormSimpleItem
  
  trait SimpleItemTemplateData extends StObject {
    
    val component: dxForm
    
    val dataField: js.UndefOr[String] = js.undefined
    
    val editorOptions: js.UndefOr[Any] = js.undefined
    
    val editorType: js.UndefOr[String] = js.undefined
    
    val name: js.UndefOr[String] = js.undefined
  }
  object SimpleItemTemplateData {
    
    inline def apply(component: dxForm): SimpleItemTemplateData = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
      __obj.asInstanceOf[SimpleItemTemplateData]
    }
    
    extension [Self <: SimpleItemTemplateData](x: Self) {
      
      inline def setComponent(value: dxForm): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setDataField(value: String): Self = StObject.set(x, "dataField", value.asInstanceOf[js.Any])
      
      inline def setDataFieldUndefined: Self = StObject.set(x, "dataField", js.undefined)
      
      inline def setEditorOptions(value: Any): Self = StObject.set(x, "editorOptions", value.asInstanceOf[js.Any])
      
      inline def setEditorOptionsUndefined: Self = StObject.set(x, "editorOptions", js.undefined)
      
      inline def setEditorType(value: String): Self = StObject.set(x, "editorType", value.asInstanceOf[js.Any])
      
      inline def setEditorTypeUndefined: Self = StObject.set(x, "editorType", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  type TabbedItem = dxFormTabbedItem
}
