package typings.devextreme.mod.DevExpress.data

import typings.devextreme.anon.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PivotGridDataSourceOptions extends StObject {
  
  /**
    * [descr:PivotGridDataSource.Options.fields]
    */
  var fields: js.UndefOr[js.Array[PivotGridDataSourceField]] = js.undefined
  
  /**
    * [descr:PivotGridDataSource.Options.filter]
    */
  var filter: js.UndefOr[String | js.Array[js.Any] | js.Function] = js.undefined
  
  /**
    * [descr:PivotGridDataSource.Options.onChanged]
    */
  var onChanged: js.UndefOr[js.Function] = js.undefined
  
  /**
    * [descr:PivotGridDataSource.Options.onFieldsPrepared]
    */
  var onFieldsPrepared: js.UndefOr[js.Function1[/* fields */ js.Array[PivotGridDataSourceField], js.Any]] = js.undefined
  
  /**
    * [descr:PivotGridDataSource.Options.onLoadError]
    */
  var onLoadError: js.UndefOr[js.Function1[/* error */ js.Any, js.Any]] = js.undefined
  
  /**
    * [descr:PivotGridDataSource.Options.onLoadingChanged]
    */
  var onLoadingChanged: js.UndefOr[js.Function1[/* isLoading */ Boolean, js.Any]] = js.undefined
  
  /**
    * [descr:PivotGridDataSource.Options.paginate]
    */
  var paginate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * [descr:PivotGridDataSource.Options.remoteOperations]
    */
  var remoteOperations: js.UndefOr[Boolean] = js.undefined
  
  /**
    * [descr:PivotGridDataSource.Options.retrieveFields]
    */
  var retrieveFields: js.UndefOr[Boolean] = js.undefined
  
  /**
    * [descr:PivotGridDataSource.Options.store]
    */
  var store: js.UndefOr[
    Store | StoreOptions[Store] | XmlaStore | XmlaStoreOptions | js.Array[Type] | Type
  ] = js.undefined
}
object PivotGridDataSourceOptions {
  
  inline def apply(): PivotGridDataSourceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotGridDataSourceOptions]
  }
  
  extension [Self <: PivotGridDataSourceOptions](x: Self) {
    
    inline def setFields(value: js.Array[PivotGridDataSourceField]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: PivotGridDataSourceField*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    inline def setFilter(value: String | js.Array[js.Any] | js.Function): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setFilterVarargs(value: js.Any*): Self = StObject.set(x, "filter", js.Array(value :_*))
    
    inline def setOnChanged(value: js.Function): Self = StObject.set(x, "onChanged", value.asInstanceOf[js.Any])
    
    inline def setOnChangedUndefined: Self = StObject.set(x, "onChanged", js.undefined)
    
    inline def setOnFieldsPrepared(value: /* fields */ js.Array[PivotGridDataSourceField] => js.Any): Self = StObject.set(x, "onFieldsPrepared", js.Any.fromFunction1(value))
    
    inline def setOnFieldsPreparedUndefined: Self = StObject.set(x, "onFieldsPrepared", js.undefined)
    
    inline def setOnLoadError(value: /* error */ js.Any => js.Any): Self = StObject.set(x, "onLoadError", js.Any.fromFunction1(value))
    
    inline def setOnLoadErrorUndefined: Self = StObject.set(x, "onLoadError", js.undefined)
    
    inline def setOnLoadingChanged(value: /* isLoading */ Boolean => js.Any): Self = StObject.set(x, "onLoadingChanged", js.Any.fromFunction1(value))
    
    inline def setOnLoadingChangedUndefined: Self = StObject.set(x, "onLoadingChanged", js.undefined)
    
    inline def setPaginate(value: Boolean): Self = StObject.set(x, "paginate", value.asInstanceOf[js.Any])
    
    inline def setPaginateUndefined: Self = StObject.set(x, "paginate", js.undefined)
    
    inline def setRemoteOperations(value: Boolean): Self = StObject.set(x, "remoteOperations", value.asInstanceOf[js.Any])
    
    inline def setRemoteOperationsUndefined: Self = StObject.set(x, "remoteOperations", js.undefined)
    
    inline def setRetrieveFields(value: Boolean): Self = StObject.set(x, "retrieveFields", value.asInstanceOf[js.Any])
    
    inline def setRetrieveFieldsUndefined: Self = StObject.set(x, "retrieveFields", js.undefined)
    
    inline def setStore(value: Store | StoreOptions[Store] | XmlaStore | XmlaStoreOptions | js.Array[Type] | Type): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    
    inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
    
    inline def setStoreVarargs(value: Type*): Self = StObject.set(x, "store", js.Array(value :_*))
  }
}
