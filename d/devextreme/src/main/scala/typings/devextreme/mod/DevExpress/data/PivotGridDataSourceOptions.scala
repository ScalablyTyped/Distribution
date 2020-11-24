package typings.devextreme.mod.DevExpress.data

import typings.devextreme.anon.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PivotGridDataSourceOptions extends js.Object {
  
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
  implicit class PivotGridDataSourceOptionsOps[Self <: PivotGridDataSourceOptions] (val x: Self) extends AnyVal {
    
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
    def setFieldsVarargs(value: PivotGridDataSourceField*): Self = this.set("fields", js.Array(value :_*))
    
    @scala.inline
    def setFields(value: js.Array[PivotGridDataSourceField]): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setFilterVarargs(value: js.Any*): Self = this.set("filter", js.Array(value :_*))
    
    @scala.inline
    def setFilter(value: String | js.Array[_] | js.Function): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setOnChanged(value: js.Function): Self = this.set("onChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnChanged: Self = this.set("onChanged", js.undefined)
    
    @scala.inline
    def setOnFieldsPrepared(value: /* fields */ js.Array[PivotGridDataSourceField] => _): Self = this.set("onFieldsPrepared", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFieldsPrepared: Self = this.set("onFieldsPrepared", js.undefined)
    
    @scala.inline
    def setOnLoadError(value: /* error */ js.Any => _): Self = this.set("onLoadError", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnLoadError: Self = this.set("onLoadError", js.undefined)
    
    @scala.inline
    def setOnLoadingChanged(value: /* isLoading */ Boolean => _): Self = this.set("onLoadingChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnLoadingChanged: Self = this.set("onLoadingChanged", js.undefined)
    
    @scala.inline
    def setPaginate(value: Boolean): Self = this.set("paginate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaginate: Self = this.set("paginate", js.undefined)
    
    @scala.inline
    def setRemoteOperations(value: Boolean): Self = this.set("remoteOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoteOperations: Self = this.set("remoteOperations", js.undefined)
    
    @scala.inline
    def setRetrieveFields(value: Boolean): Self = this.set("retrieveFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetrieveFields: Self = this.set("retrieveFields", js.undefined)
    
    @scala.inline
    def setStoreVarargs(value: Type*): Self = this.set("store", js.Array(value :_*))
    
    @scala.inline
    def setStore(value: Store | StoreOptions[Store] | XmlaStore | XmlaStoreOptions | js.Array[Type] | Type): Self = this.set("store", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStore: Self = this.set("store", js.undefined)
  }
}
