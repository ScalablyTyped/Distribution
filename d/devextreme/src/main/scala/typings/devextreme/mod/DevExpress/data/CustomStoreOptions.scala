package typings.devextreme.mod.DevExpress.data

import typings.devextreme.anon.Filter
import typings.devextreme.devextremeStrings.processed
import typings.devextreme.devextremeStrings.raw
import typings.devextreme.mod.DevExpress.data.CustomStore.GroupItem
import typings.devextreme.mod.DevExpress.data.CustomStore.ResolvedData
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomStoreOptions[TItem, TKey]
  extends StObject
     with StoreOptions[TItem, TKey] {
  
  /**
    * Specifies a custom implementation of the byKey(key) method.
    */
  var byKey: js.UndefOr[js.Function1[/* key */ TKey, PromiseLike[TItem]]] = js.undefined
  
  /**
    * Specifies whether raw data should be saved in the cache. Applies only if loadMode is &apos;raw&apos;.
    */
  var cacheRawData: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies a custom implementation of the insert(values) method.
    */
  var insert: js.UndefOr[js.Function1[/* values */ TItem, PromiseLike[TItem]]] = js.undefined
  
  /**
    * Specifies a custom implementation of the load(options) method.
    */
  def load(options: LoadOptions[TItem]): js.Promise[ResolvedData[TItem]] | PromiseLike[ResolvedData[TItem]] | (js.Array[GroupItem[Any] | TItem])
  
  /**
    * Specifies how data returned by the load function is treated.
    */
  var loadMode: js.UndefOr[processed | raw] = js.undefined
  
  /**
    * Specifies a custom implementation of the remove(key) method.
    */
  var remove: js.UndefOr[js.Function1[/* key */ TKey, PromiseLike[Unit]]] = js.undefined
  
  /**
    * Specifies a custom implementation of the totalCount(options) method.
    */
  var totalCount: js.UndefOr[js.Function1[/* loadOptions */ Filter[TItem], PromiseLike[Double]]] = js.undefined
  
  /**
    * Specifies a custom implementation of the update(key, values) method.
    */
  var update: js.UndefOr[js.Function2[/* key */ TKey, /* values */ TItem, PromiseLike[Any]]] = js.undefined
  
  /**
    * Specifies whether the store combines the search and filter expressions. Defaults to true if the loadMode is &apos;raw&apos; and false if it is &apos;processed&apos;.
    */
  var useDefaultSearch: js.UndefOr[Boolean] = js.undefined
}
object CustomStoreOptions {
  
  inline def apply[TItem, TKey](
    load: LoadOptions[TItem] => js.Promise[ResolvedData[TItem]] | PromiseLike[ResolvedData[TItem]] | (js.Array[GroupItem[Any] | TItem])
  ): CustomStoreOptions[TItem, TKey] = {
    val __obj = js.Dynamic.literal(load = js.Any.fromFunction1(load))
    __obj.asInstanceOf[CustomStoreOptions[TItem, TKey]]
  }
  
  extension [Self <: CustomStoreOptions[?, ?], TItem, TKey](x: Self & (CustomStoreOptions[TItem, TKey])) {
    
    inline def setByKey(value: /* key */ TKey => PromiseLike[TItem]): Self = StObject.set(x, "byKey", js.Any.fromFunction1(value))
    
    inline def setByKeyUndefined: Self = StObject.set(x, "byKey", js.undefined)
    
    inline def setCacheRawData(value: Boolean): Self = StObject.set(x, "cacheRawData", value.asInstanceOf[js.Any])
    
    inline def setCacheRawDataUndefined: Self = StObject.set(x, "cacheRawData", js.undefined)
    
    inline def setInsert(value: /* values */ TItem => PromiseLike[TItem]): Self = StObject.set(x, "insert", js.Any.fromFunction1(value))
    
    inline def setInsertUndefined: Self = StObject.set(x, "insert", js.undefined)
    
    inline def setLoad(
      value: LoadOptions[TItem] => js.Promise[ResolvedData[TItem]] | PromiseLike[ResolvedData[TItem]] | (js.Array[GroupItem[Any] | TItem])
    ): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
    
    inline def setLoadMode(value: processed | raw): Self = StObject.set(x, "loadMode", value.asInstanceOf[js.Any])
    
    inline def setLoadModeUndefined: Self = StObject.set(x, "loadMode", js.undefined)
    
    inline def setRemove(value: /* key */ TKey => PromiseLike[Unit]): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    
    inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    
    inline def setTotalCount(value: /* loadOptions */ Filter[TItem] => PromiseLike[Double]): Self = StObject.set(x, "totalCount", js.Any.fromFunction1(value))
    
    inline def setTotalCountUndefined: Self = StObject.set(x, "totalCount", js.undefined)
    
    inline def setUpdate(value: (/* key */ TKey, /* values */ TItem) => PromiseLike[Any]): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    
    inline def setUseDefaultSearch(value: Boolean): Self = StObject.set(x, "useDefaultSearch", value.asInstanceOf[js.Any])
    
    inline def setUseDefaultSearchUndefined: Self = StObject.set(x, "useDefaultSearch", js.undefined)
  }
}
