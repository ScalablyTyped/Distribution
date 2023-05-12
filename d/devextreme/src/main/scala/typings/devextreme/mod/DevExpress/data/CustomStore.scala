package typings.devextreme.mod.DevExpress.data

import typings.devextreme.anon.GroupCount
import typings.devextreme.mod.DevExpress.core.utils.DxExtendedPromise
import typings.devextreme.mod.DevExpress.data.CustomStore.ResolvedData
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomStore[TItem, TKey]
  extends StObject
     with Store[TItem, TKey]
     with typings.devextreme.mod.DevExpress.data.utils.Store[TItem, TKey] {
  
  /**
    * Deletes data from the cache. Takes effect only if the cacheRawData property is true.
    */
  def clearRawDataCache(): Unit = js.native
  
  /**
    * 
    */
  def load(): DxExtendedPromise[ResolvedData[TItem]] = js.native
  /**
    * 
    */
  def load(options: LoadOptions[TItem]): DxExtendedPromise[ResolvedData[TItem]] = js.native
}
object CustomStore {
  
  trait GroupItem[TItem] extends StObject {
    
    var count: js.UndefOr[Double] = js.undefined
    
    var items: (js.Array[GroupItem[TItem] | TItem]) | Null
    
    var key: Any | String | Double
    
    var summary: js.UndefOr[js.Array[Any]] = js.undefined
  }
  object GroupItem {
    
    inline def apply[TItem](key: Any | String | Double): GroupItem[TItem] = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], items = null)
      __obj.asInstanceOf[GroupItem[TItem]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GroupItem[?], TItem] (val x: Self & GroupItem[TItem]) extends AnyVal {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      inline def setItems(value: js.Array[GroupItem[TItem] | TItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsNull: Self = StObject.set(x, "items", null)
      
      inline def setItemsVarargs(value: (GroupItem[TItem] | TItem)*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setKey(value: Any | String | Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setSummary(value: js.Array[Any]): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
      
      inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
      
      inline def setSummaryVarargs(value: Any*): Self = StObject.set(x, "summary", js.Array(value*))
    }
  }
  
  /**
    * @deprecated Attention! This type is for internal purposes only. If you used it previously, please submit a ticket to our {@link https://supportcenter.devexpress.com/ticket/create Support Center}. We will check if there is an alternative solution.
    */
  type ItemsArray[TItem] = js.Array[GroupItem[TItem] | TItem]
  
  /**
    * @deprecated Attention! This type is for internal purposes only. If you used it previously, please submit a ticket to our {@link https://supportcenter.devexpress.com/ticket/create Support Center}. We will check if there is an alternative solution.
    */
  type LoadResult[T] = T | js.Promise[T] | PromiseLike[T]
  
  type Options[TItem, TKey] = CustomStoreOptions[TItem, TKey]
  
  type ResolvedData[TItem] = js.Object | ItemsArray[TItem] | GroupCount[TItem]
}
