package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.And
import typings.devextreme.anon.Contains
import typings.devextreme.anon.EditorElement
import typings.devextreme.anon.EditorName
import typings.devextreme.anon.ElementModelPreviousValue
import typings.devextreme.devextremeStrings.and
import typings.devextreme.devextremeStrings.notAnd
import typings.devextreme.devextremeStrings.notOr
import typings.devextreme.devextremeStrings.or
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxFilterBuilderOptions extends WidgetOptions[dxFilterBuilder] {
  
  /**
    * [descr:dxFilterBuilder.Options.allowHierarchicalFields]
    */
  var allowHierarchicalFields: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxFilterBuilder.Options.customOperations]
    */
  var customOperations: js.UndefOr[js.Array[dxFilterBuilderCustomOperation]] = js.native
  
  /**
    * [descr:dxFilterBuilder.Options.fields]
    */
  var fields: js.UndefOr[js.Array[dxFilterBuilderField]] = js.native
  
  /**
    * [descr:dxFilterBuilder.Options.filterOperationDescriptions]
    */
  var filterOperationDescriptions: js.UndefOr[Contains] = js.native
  
  /**
    * [descr:dxFilterBuilder.Options.groupOperationDescriptions]
    */
  var groupOperationDescriptions: js.UndefOr[And] = js.native
  
  /**
    * [descr:dxFilterBuilder.Options.groupOperations]
    */
  var groupOperations: js.UndefOr[js.Array[and | or | notAnd | notOr]] = js.native
  
  /**
    * [descr:dxFilterBuilder.Options.maxGroupLevel]
    */
  var maxGroupLevel: js.UndefOr[Double] = js.native
  
  /**
    * [descr:dxFilterBuilder.Options.onEditorPrepared]
    */
  var onEditorPrepared: js.UndefOr[js.Function1[/* e */ EditorElement, _]] = js.native
  
  /**
    * [descr:dxFilterBuilder.Options.onEditorPreparing]
    */
  var onEditorPreparing: js.UndefOr[js.Function1[/* e */ EditorName, _]] = js.native
  
  /**
    * [descr:dxFilterBuilder.Options.onValueChanged]
    */
  var onValueChanged: js.UndefOr[js.Function1[/* e */ ElementModelPreviousValue, _]] = js.native
  
  /**
    * [descr:dxFilterBuilder.Options.value]
    */
  var value: js.UndefOr[String | js.Array[_] | js.Function] = js.native
}
object dxFilterBuilderOptions {
  
  @scala.inline
  def apply(): dxFilterBuilderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxFilterBuilderOptions]
  }
  
  @scala.inline
  implicit class dxFilterBuilderOptionsOps[Self <: dxFilterBuilderOptions] (val x: Self) extends AnyVal {
    
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
    def setAllowHierarchicalFields(value: Boolean): Self = this.set("allowHierarchicalFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowHierarchicalFields: Self = this.set("allowHierarchicalFields", js.undefined)
    
    @scala.inline
    def setCustomOperationsVarargs(value: dxFilterBuilderCustomOperation*): Self = this.set("customOperations", js.Array(value :_*))
    
    @scala.inline
    def setCustomOperations(value: js.Array[dxFilterBuilderCustomOperation]): Self = this.set("customOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomOperations: Self = this.set("customOperations", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: dxFilterBuilderField*): Self = this.set("fields", js.Array(value :_*))
    
    @scala.inline
    def setFields(value: js.Array[dxFilterBuilderField]): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setFilterOperationDescriptions(value: Contains): Self = this.set("filterOperationDescriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterOperationDescriptions: Self = this.set("filterOperationDescriptions", js.undefined)
    
    @scala.inline
    def setGroupOperationDescriptions(value: And): Self = this.set("groupOperationDescriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupOperationDescriptions: Self = this.set("groupOperationDescriptions", js.undefined)
    
    @scala.inline
    def setGroupOperationsVarargs(value: (and | or | notAnd | notOr)*): Self = this.set("groupOperations", js.Array(value :_*))
    
    @scala.inline
    def setGroupOperations(value: js.Array[and | or | notAnd | notOr]): Self = this.set("groupOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupOperations: Self = this.set("groupOperations", js.undefined)
    
    @scala.inline
    def setMaxGroupLevel(value: Double): Self = this.set("maxGroupLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxGroupLevel: Self = this.set("maxGroupLevel", js.undefined)
    
    @scala.inline
    def setOnEditorPrepared(value: /* e */ EditorElement => _): Self = this.set("onEditorPrepared", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnEditorPrepared: Self = this.set("onEditorPrepared", js.undefined)
    
    @scala.inline
    def setOnEditorPreparing(value: /* e */ EditorName => _): Self = this.set("onEditorPreparing", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnEditorPreparing: Self = this.set("onEditorPreparing", js.undefined)
    
    @scala.inline
    def setOnValueChanged(value: /* e */ ElementModelPreviousValue => _): Self = this.set("onValueChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnValueChanged: Self = this.set("onValueChanged", js.undefined)
    
    @scala.inline
    def setValueVarargs(value: js.Any*): Self = this.set("value", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: String | js.Array[_] | js.Function): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
