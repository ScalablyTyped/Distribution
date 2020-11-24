package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.ComponentDataField
import typings.devextreme.anon.DataFieldElement
import typings.devextreme.devextremeStrings.auto
import typings.devextreme.devextremeStrings.left
import typings.devextreme.devextremeStrings.right
import typings.devextreme.devextremeStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxFormOptions extends WidgetOptions[dxForm] {
  
  /**
    * [descr:dxForm.Options.alignItemLabels]
    */
  var alignItemLabels: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxForm.Options.alignItemLabelsInAllGroups]
    */
  var alignItemLabelsInAllGroups: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxForm.Options.colCount]
    */
  var colCount: js.UndefOr[Double | auto] = js.native
  
  /**
    * [descr:dxForm.Options.colCountByScreen]
    */
  var colCountByScreen: js.UndefOr[js.Any] = js.native
  
  /**
    * [descr:dxForm.Options.customizeItem]
    */
  var customizeItem: js.UndefOr[
    js.Function1[
      /* item */ dxFormSimpleItem | dxFormGroupItem | dxFormTabbedItem | dxFormEmptyItem | dxFormButtonItem, 
      _
    ]
  ] = js.native
  
  /**
    * [descr:dxForm.Options.formData]
    */
  var formData: js.UndefOr[js.Any] = js.native
  
  /**
    * [descr:dxForm.Options.items]
    */
  var items: js.UndefOr[
    js.Array[
      dxFormSimpleItem | dxFormGroupItem | dxFormTabbedItem | dxFormEmptyItem | dxFormButtonItem
    ]
  ] = js.native
  
  /**
    * [descr:dxForm.Options.labelLocation]
    */
  var labelLocation: js.UndefOr[left | right | top] = js.native
  
  /**
    * [descr:dxForm.Options.minColWidth]
    */
  var minColWidth: js.UndefOr[Double] = js.native
  
  /**
    * [descr:dxForm.Options.onEditorEnterKey]
    */
  var onEditorEnterKey: js.UndefOr[js.Function1[/* e */ ComponentDataField, _]] = js.native
  
  /**
    * [descr:dxForm.Options.onFieldDataChanged]
    */
  var onFieldDataChanged: js.UndefOr[js.Function1[/* e */ DataFieldElement, _]] = js.native
  
  /**
    * [descr:dxForm.Options.optionalMark]
    */
  var optionalMark: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxForm.Options.readOnly]
    */
  var readOnly: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxForm.Options.requiredMark]
    */
  var requiredMark: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxForm.Options.requiredMessage]
    */
  var requiredMessage: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxForm.Options.screenByWidth]
    */
  var screenByWidth: js.UndefOr[js.Function] = js.native
  
  /**
    * [descr:dxForm.Options.scrollingEnabled]
    */
  var scrollingEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxForm.Options.showColonAfterLabel]
    */
  var showColonAfterLabel: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxForm.Options.showOptionalMark]
    */
  var showOptionalMark: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxForm.Options.showRequiredMark]
    */
  var showRequiredMark: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxForm.Options.showValidationSummary]
    */
  var showValidationSummary: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxForm.Options.validationGroup]
    */
  var validationGroup: js.UndefOr[String] = js.native
}
object dxFormOptions {
  
  @scala.inline
  def apply(): dxFormOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxFormOptions]
  }
  
  @scala.inline
  implicit class dxFormOptionsOps[Self <: dxFormOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAlignItemLabels(value: Boolean): Self = this.set("alignItemLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignItemLabels: Self = this.set("alignItemLabels", js.undefined)
    
    @scala.inline
    def setAlignItemLabelsInAllGroups(value: Boolean): Self = this.set("alignItemLabelsInAllGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignItemLabelsInAllGroups: Self = this.set("alignItemLabelsInAllGroups", js.undefined)
    
    @scala.inline
    def setColCount(value: Double | auto): Self = this.set("colCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColCount: Self = this.set("colCount", js.undefined)
    
    @scala.inline
    def setColCountByScreen(value: js.Any): Self = this.set("colCountByScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColCountByScreen: Self = this.set("colCountByScreen", js.undefined)
    
    @scala.inline
    def setCustomizeItem(
      value: /* item */ dxFormSimpleItem | dxFormGroupItem | dxFormTabbedItem | dxFormEmptyItem | dxFormButtonItem => _
    ): Self = this.set("customizeItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCustomizeItem: Self = this.set("customizeItem", js.undefined)
    
    @scala.inline
    def setFormData(value: js.Any): Self = this.set("formData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormData: Self = this.set("formData", js.undefined)
    
    @scala.inline
    def setItemsVarargs(
      value: (dxFormSimpleItem | dxFormGroupItem | dxFormTabbedItem | dxFormEmptyItem | dxFormButtonItem)*
    ): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(
      value: js.Array[
          dxFormSimpleItem | dxFormGroupItem | dxFormTabbedItem | dxFormEmptyItem | dxFormButtonItem
        ]
    ): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setLabelLocation(value: left | right | top): Self = this.set("labelLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelLocation: Self = this.set("labelLocation", js.undefined)
    
    @scala.inline
    def setMinColWidth(value: Double): Self = this.set("minColWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinColWidth: Self = this.set("minColWidth", js.undefined)
    
    @scala.inline
    def setOnEditorEnterKey(value: /* e */ ComponentDataField => _): Self = this.set("onEditorEnterKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnEditorEnterKey: Self = this.set("onEditorEnterKey", js.undefined)
    
    @scala.inline
    def setOnFieldDataChanged(value: /* e */ DataFieldElement => _): Self = this.set("onFieldDataChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFieldDataChanged: Self = this.set("onFieldDataChanged", js.undefined)
    
    @scala.inline
    def setOptionalMark(value: String): Self = this.set("optionalMark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptionalMark: Self = this.set("optionalMark", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    
    @scala.inline
    def setRequiredMark(value: String): Self = this.set("requiredMark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequiredMark: Self = this.set("requiredMark", js.undefined)
    
    @scala.inline
    def setRequiredMessage(value: String): Self = this.set("requiredMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequiredMessage: Self = this.set("requiredMessage", js.undefined)
    
    @scala.inline
    def setScreenByWidth(value: js.Function): Self = this.set("screenByWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScreenByWidth: Self = this.set("screenByWidth", js.undefined)
    
    @scala.inline
    def setScrollingEnabled(value: Boolean): Self = this.set("scrollingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollingEnabled: Self = this.set("scrollingEnabled", js.undefined)
    
    @scala.inline
    def setShowColonAfterLabel(value: Boolean): Self = this.set("showColonAfterLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowColonAfterLabel: Self = this.set("showColonAfterLabel", js.undefined)
    
    @scala.inline
    def setShowOptionalMark(value: Boolean): Self = this.set("showOptionalMark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowOptionalMark: Self = this.set("showOptionalMark", js.undefined)
    
    @scala.inline
    def setShowRequiredMark(value: Boolean): Self = this.set("showRequiredMark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowRequiredMark: Self = this.set("showRequiredMark", js.undefined)
    
    @scala.inline
    def setShowValidationSummary(value: Boolean): Self = this.set("showValidationSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowValidationSummary: Self = this.set("showValidationSummary", js.undefined)
    
    @scala.inline
    def setValidationGroup(value: String): Self = this.set("validationGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationGroup: Self = this.set("validationGroup", js.undefined)
  }
}
