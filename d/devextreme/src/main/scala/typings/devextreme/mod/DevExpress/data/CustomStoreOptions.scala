package typings.devextreme.mod.DevExpress.data

import typings.devextreme.anon.Filter
import typings.devextreme.devextremeStrings.processed
import typings.devextreme.devextremeStrings.raw
import typings.devextreme.mod.global.JQueryPromise
import typings.devextreme.mod.global.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomStoreOptions extends StoreOptions[CustomStore] {
  
  /**
    * [descr:CustomStore.Options.byKey]
    */
  var byKey: js.UndefOr[js.Function1[/* key */ js.Any | String | Double, Promise[_] | JQueryPromise[_]]] = js.native
  
  /**
    * [descr:CustomStore.Options.cacheRawData]
    */
  var cacheRawData: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:CustomStore.Options.insert]
    */
  var insert: js.UndefOr[js.Function1[/* values */ js.Any, Promise[_] | JQueryPromise[_]]] = js.native
  
  /**
    * [descr:CustomStore.Options.load]
    */
  var load: js.UndefOr[
    js.Function1[/* options */ LoadOptions, Promise[_] | JQueryPromise[_] | js.Array[_]]
  ] = js.native
  
  /**
    * [descr:CustomStore.Options.loadMode]
    */
  var loadMode: js.UndefOr[processed | raw] = js.native
  
  /**
    * [descr:CustomStore.Options.remove]
    */
  var remove: js.UndefOr[
    js.Function1[/* key */ js.Any | String | Double, Promise[Unit] | JQueryPromise[Unit]]
  ] = js.native
  
  /**
    * [descr:CustomStore.Options.totalCount]
    */
  var totalCount: js.UndefOr[js.Function1[/* loadOptions */ Filter, Promise[Double] | JQueryPromise[Double]]] = js.native
  
  /**
    * [descr:CustomStore.Options.update]
    */
  var update: js.UndefOr[
    js.Function2[
      /* key */ js.Any | String | Double, 
      /* values */ js.Any, 
      Promise[_] | JQueryPromise[_]
    ]
  ] = js.native
  
  /**
    * [descr:CustomStore.Options.useDefaultSearch]
    */
  var useDefaultSearch: js.UndefOr[Boolean] = js.native
}
object CustomStoreOptions {
  
  @scala.inline
  def apply(): CustomStoreOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomStoreOptions]
  }
  
  @scala.inline
  implicit class CustomStoreOptionsOps[Self <: CustomStoreOptions] (val x: Self) extends AnyVal {
    
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
    def setByKey(value: /* key */ js.Any | String | Double => Promise[_] | JQueryPromise[_]): Self = this.set("byKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteByKey: Self = this.set("byKey", js.undefined)
    
    @scala.inline
    def setCacheRawData(value: Boolean): Self = this.set("cacheRawData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheRawData: Self = this.set("cacheRawData", js.undefined)
    
    @scala.inline
    def setInsert(value: /* values */ js.Any => Promise[_] | JQueryPromise[_]): Self = this.set("insert", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteInsert: Self = this.set("insert", js.undefined)
    
    @scala.inline
    def setLoad(value: /* options */ LoadOptions => Promise[_] | JQueryPromise[_] | js.Array[_]): Self = this.set("load", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteLoad: Self = this.set("load", js.undefined)
    
    @scala.inline
    def setLoadMode(value: processed | raw): Self = this.set("loadMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadMode: Self = this.set("loadMode", js.undefined)
    
    @scala.inline
    def setRemove(value: /* key */ js.Any | String | Double => Promise[Unit] | JQueryPromise[Unit]): Self = this.set("remove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRemove: Self = this.set("remove", js.undefined)
    
    @scala.inline
    def setTotalCount(value: /* loadOptions */ Filter => Promise[Double] | JQueryPromise[Double]): Self = this.set("totalCount", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTotalCount: Self = this.set("totalCount", js.undefined)
    
    @scala.inline
    def setUpdate(value: (/* key */ js.Any | String | Double, /* values */ js.Any) => Promise[_] | JQueryPromise[_]): Self = this.set("update", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
    
    @scala.inline
    def setUseDefaultSearch(value: Boolean): Self = this.set("useDefaultSearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseDefaultSearch: Self = this.set("useDefaultSearch", js.undefined)
  }
}
