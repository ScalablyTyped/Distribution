package typings.extjs.Ext.util

import typings.extjs.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFilter extends IBase {
  
  /** [Config Option] (Boolean) */
  var anyMatch: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean) */
  var caseSensitive: js.UndefOr[Boolean] = js.native
  
  /** [Property] (Boolean) */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean) */
  var exactMatch: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Function) */
  var filterFn: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (String) */
  var id: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var operator: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var property: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var root: js.UndefOr[String] = js.native
  
  /** [Method] Changes the filtering function which this Filter uses to choose items to include
    * @param filterFn Function A function which returns true or false to either include or exclude the passed object.
    */
  var setFilterFn: js.UndefOr[js.Function1[/* filterFn */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Changes the value that this filter tests its configured  link cfg property with
    * @param value Mixed The new value to compare the property with.
    */
  var setValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Config Option] (Mixed) */
  var value: js.UndefOr[js.Any] = js.native
}
object IFilter {
  
  @scala.inline
  def apply(): IFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFilter]
  }
  
  @scala.inline
  implicit class IFilterMutableBuilder[Self <: IFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnyMatch(value: Boolean): Self = StObject.set(x, "anyMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnyMatchUndefined: Self = StObject.set(x, "anyMatch", js.undefined)
    
    @scala.inline
    def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setExactMatch(value: Boolean): Self = StObject.set(x, "exactMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExactMatchUndefined: Self = StObject.set(x, "exactMatch", js.undefined)
    
    @scala.inline
    def setFilterFn(value: js.Any): Self = StObject.set(x, "filterFn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterFnUndefined: Self = StObject.set(x, "filterFn", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
    
    @scala.inline
    def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    @scala.inline
    def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    @scala.inline
    def setSetFilterFn(value: /* filterFn */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setFilterFn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetFilterFnUndefined: Self = StObject.set(x, "setFilterFn", js.undefined)
    
    @scala.inline
    def setSetValue(value: /* value */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetValueUndefined: Self = StObject.set(x, "setValue", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
