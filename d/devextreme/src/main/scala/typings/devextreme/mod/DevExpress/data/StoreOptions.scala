package typings.devextreme.mod.DevExpress.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StoreOptions[TItem, TKey] extends StObject {
  
  /**
    * Specifies the function that is executed when the store throws an error.
    */
  var errorHandler: js.UndefOr[js.Function] = js.undefined
  
  /**
    * Specifies the key property (or properties) that provide(s) key values to access data items. Each key value must be unique.
    */
  var key: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /**
    * A function that is executed after a data item is added to the store.
    */
  var onInserted: js.UndefOr[js.Function2[/* values */ TItem, /* key */ TKey, Unit]] = js.undefined
  
  /**
    * A function that is executed before a data item is added to the store.
    */
  var onInserting: js.UndefOr[js.Function1[/* values */ TItem, Unit]] = js.undefined
  
  /**
    * A function that is executed after data is loaded to the store.
    */
  var onLoaded: js.UndefOr[
    js.Function2[/* result */ js.Array[TItem], /* loadOptions */ LoadOptions[TItem], Unit]
  ] = js.undefined
  
  /**
    * A function that is executed before data is loaded to the store.
    */
  var onLoading: js.UndefOr[js.Function1[/* loadOptions */ LoadOptions[TItem], Unit]] = js.undefined
  
  /**
    * A function that is executed after a data item is added, updated, or removed from the store.
    */
  var onModified: js.UndefOr[js.Function] = js.undefined
  
  /**
    * A function that is executed before a data item is added, updated, or removed from the store.
    */
  var onModifying: js.UndefOr[js.Function] = js.undefined
  
  /**
    * The function executed before changes are pushed to the store.
    */
  var onPush: js.UndefOr[js.Function1[/* changes */ js.Array[TItem], Unit]] = js.undefined
  
  /**
    * A function that is executed after a data item is removed from the store.
    */
  var onRemoved: js.UndefOr[js.Function1[/* key */ TKey, Unit]] = js.undefined
  
  /**
    * A function that is executed before a data item is removed from the store.
    */
  var onRemoving: js.UndefOr[js.Function1[/* key */ TKey, Unit]] = js.undefined
  
  /**
    * A function that is executed after a data item is updated in the store.
    */
  var onUpdated: js.UndefOr[js.Function2[/* key */ TKey, /* values */ TItem, Unit]] = js.undefined
  
  /**
    * A function that is executed before a data item is updated in the store.
    */
  var onUpdating: js.UndefOr[js.Function2[/* key */ TKey, /* values */ TItem, Unit]] = js.undefined
}
object StoreOptions {
  
  inline def apply[TItem, TKey](): StoreOptions[TItem, TKey] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StoreOptions[TItem, TKey]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StoreOptions[?, ?], TItem, TKey] (val x: Self & (StoreOptions[TItem, TKey])) extends AnyVal {
    
    inline def setErrorHandler(value: js.Function): Self = StObject.set(x, "errorHandler", value.asInstanceOf[js.Any])
    
    inline def setErrorHandlerUndefined: Self = StObject.set(x, "errorHandler", js.undefined)
    
    inline def setKey(value: String | js.Array[String]): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setKeyVarargs(value: String*): Self = StObject.set(x, "key", js.Array(value*))
    
    inline def setOnInserted(value: (/* values */ TItem, /* key */ TKey) => Unit): Self = StObject.set(x, "onInserted", js.Any.fromFunction2(value))
    
    inline def setOnInsertedUndefined: Self = StObject.set(x, "onInserted", js.undefined)
    
    inline def setOnInserting(value: /* values */ TItem => Unit): Self = StObject.set(x, "onInserting", js.Any.fromFunction1(value))
    
    inline def setOnInsertingUndefined: Self = StObject.set(x, "onInserting", js.undefined)
    
    inline def setOnLoaded(value: (/* result */ js.Array[TItem], /* loadOptions */ LoadOptions[TItem]) => Unit): Self = StObject.set(x, "onLoaded", js.Any.fromFunction2(value))
    
    inline def setOnLoadedUndefined: Self = StObject.set(x, "onLoaded", js.undefined)
    
    inline def setOnLoading(value: /* loadOptions */ LoadOptions[TItem] => Unit): Self = StObject.set(x, "onLoading", js.Any.fromFunction1(value))
    
    inline def setOnLoadingUndefined: Self = StObject.set(x, "onLoading", js.undefined)
    
    inline def setOnModified(value: js.Function): Self = StObject.set(x, "onModified", value.asInstanceOf[js.Any])
    
    inline def setOnModifiedUndefined: Self = StObject.set(x, "onModified", js.undefined)
    
    inline def setOnModifying(value: js.Function): Self = StObject.set(x, "onModifying", value.asInstanceOf[js.Any])
    
    inline def setOnModifyingUndefined: Self = StObject.set(x, "onModifying", js.undefined)
    
    inline def setOnPush(value: /* changes */ js.Array[TItem] => Unit): Self = StObject.set(x, "onPush", js.Any.fromFunction1(value))
    
    inline def setOnPushUndefined: Self = StObject.set(x, "onPush", js.undefined)
    
    inline def setOnRemoved(value: /* key */ TKey => Unit): Self = StObject.set(x, "onRemoved", js.Any.fromFunction1(value))
    
    inline def setOnRemovedUndefined: Self = StObject.set(x, "onRemoved", js.undefined)
    
    inline def setOnRemoving(value: /* key */ TKey => Unit): Self = StObject.set(x, "onRemoving", js.Any.fromFunction1(value))
    
    inline def setOnRemovingUndefined: Self = StObject.set(x, "onRemoving", js.undefined)
    
    inline def setOnUpdated(value: (/* key */ TKey, /* values */ TItem) => Unit): Self = StObject.set(x, "onUpdated", js.Any.fromFunction2(value))
    
    inline def setOnUpdatedUndefined: Self = StObject.set(x, "onUpdated", js.undefined)
    
    inline def setOnUpdating(value: (/* key */ TKey, /* values */ TItem) => Unit): Self = StObject.set(x, "onUpdating", js.Any.fromFunction2(value))
    
    inline def setOnUpdatingUndefined: Self = StObject.set(x, "onUpdating", js.undefined)
  }
}
