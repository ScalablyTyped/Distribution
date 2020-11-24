package typings.extjs.Ext.grid.property

import typings.extjs.Ext.grid.IPanel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGrid extends IPanel {
  
  /** [Config Option] (Object) */
  var customEditors: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Object) */
  var customRenderers: js.UndefOr[js.Any] = js.native
  
  /** [Method] Gets the source data object containing the property data
    * @returns Object The data object.
    */
  var getSource: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Config Option] (Boolean) */
  var inferTypes: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Number/String) */
  var nameColumnWidth: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (String) */
  var nameField: js.UndefOr[String] = js.native
  
  /** [Config Option] (Object) */
  var propertyNames: js.UndefOr[js.Any] = js.native
  
  /** [Method] Removes a property from the grid
    * @param prop String The name of the property to remove.
    */
  var removeProperty: js.UndefOr[js.Function1[/* prop */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of a property
    * @param prop String The name of the property to set.
    * @param value Object The value to test.
    * @param create Boolean true to create the property if it doesn't already exist.
    */
  var setProperty: js.UndefOr[
    js.Function3[
      /* prop */ js.UndefOr[String], 
      /* value */ js.UndefOr[js.Any], 
      /* create */ js.UndefOr[Boolean], 
      Unit
    ]
  ] = js.native
  
  /** [Method] Sets the source data object containing the property data
    * @param source Object The data object.
    * @param sourceConfig Object A new object. If this argument is not passed the current configuration will be re-used. To reset the config, pass null or an empty object literal.
    */
  var setSource: js.UndefOr[
    js.Function2[/* source */ js.UndefOr[js.Any], /* sourceConfig */ js.UndefOr[js.Any], Unit]
  ] = js.native
  
  /** [Config Option] (Object) */
  var source: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Object) */
  var sourceConfig: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (String) */
  var valueField: js.UndefOr[String] = js.native
}
object IGrid {
  
  @scala.inline
  def apply(): IGrid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGrid]
  }
  
  @scala.inline
  implicit class IGridOps[Self <: IGrid] (val x: Self) extends AnyVal {
    
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
    def setCustomEditors(value: js.Any): Self = this.set("customEditors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomEditors: Self = this.set("customEditors", js.undefined)
    
    @scala.inline
    def setCustomRenderers(value: js.Any): Self = this.set("customRenderers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomRenderers: Self = this.set("customRenderers", js.undefined)
    
    @scala.inline
    def setGetSource(value: () => _): Self = this.set("getSource", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetSource: Self = this.set("getSource", js.undefined)
    
    @scala.inline
    def setInferTypes(value: Boolean): Self = this.set("inferTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInferTypes: Self = this.set("inferTypes", js.undefined)
    
    @scala.inline
    def setNameColumnWidth(value: js.Any): Self = this.set("nameColumnWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNameColumnWidth: Self = this.set("nameColumnWidth", js.undefined)
    
    @scala.inline
    def setNameField(value: String): Self = this.set("nameField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNameField: Self = this.set("nameField", js.undefined)
    
    @scala.inline
    def setPropertyNames(value: js.Any): Self = this.set("propertyNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePropertyNames: Self = this.set("propertyNames", js.undefined)
    
    @scala.inline
    def setRemoveProperty(value: /* prop */ js.UndefOr[String] => Unit): Self = this.set("removeProperty", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRemoveProperty: Self = this.set("removeProperty", js.undefined)
    
    @scala.inline
    def setSetProperty(
      value: (/* prop */ js.UndefOr[String], /* value */ js.UndefOr[js.Any], /* create */ js.UndefOr[Boolean]) => Unit
    ): Self = this.set("setProperty", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteSetProperty: Self = this.set("setProperty", js.undefined)
    
    @scala.inline
    def setSetSource(value: (/* source */ js.UndefOr[js.Any], /* sourceConfig */ js.UndefOr[js.Any]) => Unit): Self = this.set("setSource", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSetSource: Self = this.set("setSource", js.undefined)
    
    @scala.inline
    def setSource(value: js.Any): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    
    @scala.inline
    def setSourceConfig(value: js.Any): Self = this.set("sourceConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceConfig: Self = this.set("sourceConfig", js.undefined)
    
    @scala.inline
    def setValueField(value: String): Self = this.set("valueField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueField: Self = this.set("valueField", js.undefined)
  }
}
