package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.common.Mode
import typings.devextreme.mod.DevExpress.ui.dxForm.EditorEnterKeyEvent
import typings.devextreme.mod.DevExpress.ui.dxForm.FieldDataChangedEvent
import typings.devextreme.mod.DevExpress.ui.dxForm.FormLabelMode
import typings.devextreme.mod.DevExpress.ui.dxForm.Item
import typings.devextreme.mod.DevExpress.ui.dxForm.LabelLocation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxFormOptions
  extends StObject
     with WidgetOptions[dxForm] {
  
  /**
    * Specifies whether all item labels are aligned. Applies only if the labelMode is &apos;outside&apos;.
    */
  var alignItemLabels: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether item labels in all groups are aligned. Applies only if the labelMode is &apos;outside&apos;.
    */
  var alignItemLabelsInAllGroups: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The count of columns in the form layout.
    */
  var colCount: js.UndefOr[Double | Mode] = js.undefined
  
  /**
    * Specifies dependency between the screen factor and the count of columns in the form layout.
    */
  var colCountByScreen: js.UndefOr[Any] = js.undefined
  
  /**
    * Specifies a function that customizes a form item after it has been created.
    */
  var customizeItem: js.UndefOr[js.Function1[/* item */ Item, Unit]] = js.undefined
  
  /**
    * Provides the Form&apos;s data. Gets updated every time form fields change.
    */
  var formData: js.UndefOr[Any] = js.undefined
  
  /**
    * Holds an array of form items.
    */
  var items: js.UndefOr[js.Array[Item]] = js.undefined
  
  /**
    * Specifies the location of a label against the editor. Applies only if the labelMode is &apos;outside&apos;.
    */
  var labelLocation: js.UndefOr[LabelLocation] = js.undefined
  
  /**
    * Specifies a display mode for item labels.
    */
  var labelMode: js.UndefOr[FormLabelMode] = js.undefined
  
  /**
    * The minimum column width used for calculating column count in the form layout. Applies only if colCount property is &apos;auto&apos;.
    */
  var minColWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * A function that is executed when the Enter key has been pressed while an editor is focused.
    */
  var onEditorEnterKey: js.UndefOr[js.Function1[/* e */ EditorEnterKeyEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed when the value of a formData object field is changed.
    */
  var onFieldDataChanged: js.UndefOr[js.Function1[/* e */ FieldDataChangedEvent, Unit]] = js.undefined
  
  /**
    * The text displayed for optional fields.
    */
  var optionalMark: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether all editors on the form are read-only. Applies only to non-templated items.
    */
  var readOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The text displayed for required fields.
    */
  var requiredMark: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the message that is shown for end-users if a required field value is not specified.
    */
  var requiredMessage: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies a function that categorizes screens by their width.
    */
  var screenByWidth: js.UndefOr[js.Function] = js.undefined
  
  /**
    * A Boolean value specifying whether to enable or disable form scrolling.
    */
  var scrollingEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether or not a colon is displayed at the end of form labels.
    */
  var showColonAfterLabel: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether or not the optional mark is displayed for optional fields.
    */
  var showOptionalMark: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether or not the required mark is displayed for required fields.
    */
  var showRequiredMark: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether or not the total validation summary is displayed on the form.
    */
  var showValidationSummary: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gives a name to the internal validation group.
    */
  var validationGroup: js.UndefOr[String] = js.undefined
}
object dxFormOptions {
  
  inline def apply(): dxFormOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxFormOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxFormOptions] (val x: Self) extends AnyVal {
    
    inline def setAlignItemLabels(value: Boolean): Self = StObject.set(x, "alignItemLabels", value.asInstanceOf[js.Any])
    
    inline def setAlignItemLabelsInAllGroups(value: Boolean): Self = StObject.set(x, "alignItemLabelsInAllGroups", value.asInstanceOf[js.Any])
    
    inline def setAlignItemLabelsInAllGroupsUndefined: Self = StObject.set(x, "alignItemLabelsInAllGroups", js.undefined)
    
    inline def setAlignItemLabelsUndefined: Self = StObject.set(x, "alignItemLabels", js.undefined)
    
    inline def setColCount(value: Double | Mode): Self = StObject.set(x, "colCount", value.asInstanceOf[js.Any])
    
    inline def setColCountByScreen(value: Any): Self = StObject.set(x, "colCountByScreen", value.asInstanceOf[js.Any])
    
    inline def setColCountByScreenUndefined: Self = StObject.set(x, "colCountByScreen", js.undefined)
    
    inline def setColCountUndefined: Self = StObject.set(x, "colCount", js.undefined)
    
    inline def setCustomizeItem(value: /* item */ Item => Unit): Self = StObject.set(x, "customizeItem", js.Any.fromFunction1(value))
    
    inline def setCustomizeItemUndefined: Self = StObject.set(x, "customizeItem", js.undefined)
    
    inline def setFormData(value: Any): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
    
    inline def setFormDataUndefined: Self = StObject.set(x, "formData", js.undefined)
    
    inline def setItems(value: js.Array[Item]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: Item*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setLabelLocation(value: LabelLocation): Self = StObject.set(x, "labelLocation", value.asInstanceOf[js.Any])
    
    inline def setLabelLocationUndefined: Self = StObject.set(x, "labelLocation", js.undefined)
    
    inline def setLabelMode(value: FormLabelMode): Self = StObject.set(x, "labelMode", value.asInstanceOf[js.Any])
    
    inline def setLabelModeUndefined: Self = StObject.set(x, "labelMode", js.undefined)
    
    inline def setMinColWidth(value: Double): Self = StObject.set(x, "minColWidth", value.asInstanceOf[js.Any])
    
    inline def setMinColWidthUndefined: Self = StObject.set(x, "minColWidth", js.undefined)
    
    inline def setOnEditorEnterKey(value: /* e */ EditorEnterKeyEvent => Unit): Self = StObject.set(x, "onEditorEnterKey", js.Any.fromFunction1(value))
    
    inline def setOnEditorEnterKeyUndefined: Self = StObject.set(x, "onEditorEnterKey", js.undefined)
    
    inline def setOnFieldDataChanged(value: /* e */ FieldDataChangedEvent => Unit): Self = StObject.set(x, "onFieldDataChanged", js.Any.fromFunction1(value))
    
    inline def setOnFieldDataChangedUndefined: Self = StObject.set(x, "onFieldDataChanged", js.undefined)
    
    inline def setOptionalMark(value: String): Self = StObject.set(x, "optionalMark", value.asInstanceOf[js.Any])
    
    inline def setOptionalMarkUndefined: Self = StObject.set(x, "optionalMark", js.undefined)
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    inline def setRequiredMark(value: String): Self = StObject.set(x, "requiredMark", value.asInstanceOf[js.Any])
    
    inline def setRequiredMarkUndefined: Self = StObject.set(x, "requiredMark", js.undefined)
    
    inline def setRequiredMessage(value: String): Self = StObject.set(x, "requiredMessage", value.asInstanceOf[js.Any])
    
    inline def setRequiredMessageUndefined: Self = StObject.set(x, "requiredMessage", js.undefined)
    
    inline def setScreenByWidth(value: js.Function): Self = StObject.set(x, "screenByWidth", value.asInstanceOf[js.Any])
    
    inline def setScreenByWidthUndefined: Self = StObject.set(x, "screenByWidth", js.undefined)
    
    inline def setScrollingEnabled(value: Boolean): Self = StObject.set(x, "scrollingEnabled", value.asInstanceOf[js.Any])
    
    inline def setScrollingEnabledUndefined: Self = StObject.set(x, "scrollingEnabled", js.undefined)
    
    inline def setShowColonAfterLabel(value: Boolean): Self = StObject.set(x, "showColonAfterLabel", value.asInstanceOf[js.Any])
    
    inline def setShowColonAfterLabelUndefined: Self = StObject.set(x, "showColonAfterLabel", js.undefined)
    
    inline def setShowOptionalMark(value: Boolean): Self = StObject.set(x, "showOptionalMark", value.asInstanceOf[js.Any])
    
    inline def setShowOptionalMarkUndefined: Self = StObject.set(x, "showOptionalMark", js.undefined)
    
    inline def setShowRequiredMark(value: Boolean): Self = StObject.set(x, "showRequiredMark", value.asInstanceOf[js.Any])
    
    inline def setShowRequiredMarkUndefined: Self = StObject.set(x, "showRequiredMark", js.undefined)
    
    inline def setShowValidationSummary(value: Boolean): Self = StObject.set(x, "showValidationSummary", value.asInstanceOf[js.Any])
    
    inline def setShowValidationSummaryUndefined: Self = StObject.set(x, "showValidationSummary", js.undefined)
    
    inline def setValidationGroup(value: String): Self = StObject.set(x, "validationGroup", value.asInstanceOf[js.Any])
    
    inline def setValidationGroupUndefined: Self = StObject.set(x, "validationGroup", js.undefined)
  }
}
