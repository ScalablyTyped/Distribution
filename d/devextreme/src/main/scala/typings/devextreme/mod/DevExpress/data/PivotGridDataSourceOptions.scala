package typings.devextreme.mod.DevExpress.data

import typings.devextreme.anon.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PivotGridDataSourceOptions extends StObject {
  
  /**
    * [descr:PivotGridDataSource.Options.fields]
    */
  var fields: js.UndefOr[js.Array[PivotGridDataSourceField]] = js.native
  
  /**
    * [descr:PivotGridDataSource.Options.filter]
    */
  var filter: js.UndefOr[String | js.Array[_] | js.Function] = js.native
  
  /**
    * [descr:PivotGridDataSource.Options.onChanged]
    */
  var onChanged: js.UndefOr[js.Function] = js.native
  
  /**
    * [descr:PivotGridDataSource.Options.onFieldsPrepared]
    */
  var onFieldsPrepared: js.UndefOr[js.Function1[/* fields */ js.Array[PivotGridDataSourceField], _]] = js.native
  
  /**
    * [descr:PivotGridDataSource.Options.onLoadError]
    */
  var onLoadError: js.UndefOr[js.Function1[/* error */ js.Any, _]] = js.native
  
  /**
    * [descr:PivotGridDataSource.Options.onLoadingChanged]
    */
  var onLoadingChanged: js.UndefOr[js.Function1[/* isLoading */ Boolean, _]] = js.native
  
  /**
    * [descr:PivotGridDataSource.Options.paginate]
    */
  var paginate: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:PivotGridDataSource.Options.remoteOperations]
    */
  var remoteOperations: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:PivotGridDataSource.Options.retrieveFields]
    */
  var retrieveFields: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:PivotGridDataSource.Options.store]
    */
  var store: js.UndefOr[
    Store | StoreOptions[Store] | XmlaStore | XmlaStoreOptions | js.Array[Type] | Type
  ] = js.native
}
object PivotGridDataSourceOptions {
  
  @scala.inline
  def apply(): PivotGridDataSourceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotGridDataSourceOptions]
  }
  
  @scala.inline
  implicit class PivotGridDataSourceOptionsMutableBuilder[Self <: PivotGridDataSourceOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: js.Array[PivotGridDataSourceField]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: PivotGridDataSourceField*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setFilter(value: String | js.Array[_] | js.Function): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setFilterVarargs(value: js.Any*): Self = StObject.set(x, "filter", js.Array(value :_*))
    
    @scala.inline
    def setOnChanged(value: js.Function): Self = StObject.set(x, "onChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnChangedUndefined: Self = StObject.set(x, "onChanged", js.undefined)
    
    @scala.inline
    def setOnFieldsPrepared(value: /* fields */ js.Array[PivotGridDataSourceField] => _): Self = StObject.set(x, "onFieldsPrepared", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnFieldsPreparedUndefined: Self = StObject.set(x, "onFieldsPrepared", js.undefined)
    
    @scala.inline
    def setOnLoadError(value: /* error */ js.Any => _): Self = StObject.set(x, "onLoadError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnLoadErrorUndefined: Self = StObject.set(x, "onLoadError", js.undefined)
    
    @scala.inline
    def setOnLoadingChanged(value: /* isLoading */ Boolean => _): Self = StObject.set(x, "onLoadingChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnLoadingChangedUndefined: Self = StObject.set(x, "onLoadingChanged", js.undefined)
    
    @scala.inline
    def setPaginate(value: Boolean): Self = StObject.set(x, "paginate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaginateUndefined: Self = StObject.set(x, "paginate", js.undefined)
    
    @scala.inline
    def setRemoteOperations(value: Boolean): Self = StObject.set(x, "remoteOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteOperationsUndefined: Self = StObject.set(x, "remoteOperations", js.undefined)
    
    @scala.inline
    def setRetrieveFields(value: Boolean): Self = StObject.set(x, "retrieveFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetrieveFieldsUndefined: Self = StObject.set(x, "retrieveFields", js.undefined)
    
    @scala.inline
    def setStore(value: Store | StoreOptions[Store] | XmlaStore | XmlaStoreOptions | js.Array[Type] | Type): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
    
    @scala.inline
    def setStoreVarargs(value: Type*): Self = StObject.set(x, "store", js.Array(value :_*))
  }
}
