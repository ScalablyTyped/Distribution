package typings.devextreme.mod.DevExpress.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StoreOptions[T] extends StObject {
  
  /**
    * [descr:Store.Options.errorHandler]
    */
  var errorHandler: js.UndefOr[js.Function] = js.undefined
  
  /**
    * [descr:Store.Options.key]
    */
  var key: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /**
    * [descr:Store.Options.onInserted]
    */
  var onInserted: js.UndefOr[js.Function2[/* values */ js.Any, /* key */ js.Any | String | Double, js.Any]] = js.undefined
  
  /**
    * [descr:Store.Options.onInserting]
    */
  var onInserting: js.UndefOr[js.Function1[/* values */ js.Any, js.Any]] = js.undefined
  
  /**
    * [descr:Store.Options.onLoaded]
    */
  var onLoaded: js.UndefOr[js.Function1[/* result */ js.Array[js.Any], js.Any]] = js.undefined
  
  /**
    * [descr:Store.Options.onLoading]
    */
  var onLoading: js.UndefOr[js.Function1[/* loadOptions */ LoadOptions, js.Any]] = js.undefined
  
  /**
    * [descr:Store.Options.onModified]
    */
  var onModified: js.UndefOr[js.Function] = js.undefined
  
  /**
    * [descr:Store.Options.onModifying]
    */
  var onModifying: js.UndefOr[js.Function] = js.undefined
  
  /**
    * [descr:Store.Options.onPush]
    */
  var onPush: js.UndefOr[js.Function1[/* changes */ js.Array[js.Any], js.Any]] = js.undefined
  
  /**
    * [descr:Store.Options.onRemoved]
    */
  var onRemoved: js.UndefOr[js.Function1[/* key */ js.Any | String | Double, js.Any]] = js.undefined
  
  /**
    * [descr:Store.Options.onRemoving]
    */
  var onRemoving: js.UndefOr[js.Function1[/* key */ js.Any | String | Double, js.Any]] = js.undefined
  
  /**
    * [descr:Store.Options.onUpdated]
    */
  var onUpdated: js.UndefOr[js.Function2[/* key */ js.Any | String | Double, /* values */ js.Any, js.Any]] = js.undefined
  
  /**
    * [descr:Store.Options.onUpdating]
    */
  var onUpdating: js.UndefOr[js.Function2[/* key */ js.Any | String | Double, /* values */ js.Any, js.Any]] = js.undefined
}
object StoreOptions {
  
  @scala.inline
  def apply[T](): StoreOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StoreOptions[T]]
  }
  
  @scala.inline
  implicit class StoreOptionsMutableBuilder[Self <: StoreOptions[?], T] (val x: Self & StoreOptions[T]) extends AnyVal {
    
    @scala.inline
    def setErrorHandler(value: js.Function): Self = StObject.set(x, "errorHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorHandlerUndefined: Self = StObject.set(x, "errorHandler", js.undefined)
    
    @scala.inline
    def setKey(value: String | js.Array[String]): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setKeyVarargs(value: String*): Self = StObject.set(x, "key", js.Array(value :_*))
    
    @scala.inline
    def setOnInserted(value: (/* values */ js.Any, /* key */ js.Any | String | Double) => js.Any): Self = StObject.set(x, "onInserted", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnInsertedUndefined: Self = StObject.set(x, "onInserted", js.undefined)
    
    @scala.inline
    def setOnInserting(value: /* values */ js.Any => js.Any): Self = StObject.set(x, "onInserting", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnInsertingUndefined: Self = StObject.set(x, "onInserting", js.undefined)
    
    @scala.inline
    def setOnLoaded(value: /* result */ js.Array[js.Any] => js.Any): Self = StObject.set(x, "onLoaded", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnLoadedUndefined: Self = StObject.set(x, "onLoaded", js.undefined)
    
    @scala.inline
    def setOnLoading(value: /* loadOptions */ LoadOptions => js.Any): Self = StObject.set(x, "onLoading", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnLoadingUndefined: Self = StObject.set(x, "onLoading", js.undefined)
    
    @scala.inline
    def setOnModified(value: js.Function): Self = StObject.set(x, "onModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnModifiedUndefined: Self = StObject.set(x, "onModified", js.undefined)
    
    @scala.inline
    def setOnModifying(value: js.Function): Self = StObject.set(x, "onModifying", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnModifyingUndefined: Self = StObject.set(x, "onModifying", js.undefined)
    
    @scala.inline
    def setOnPush(value: /* changes */ js.Array[js.Any] => js.Any): Self = StObject.set(x, "onPush", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPushUndefined: Self = StObject.set(x, "onPush", js.undefined)
    
    @scala.inline
    def setOnRemoved(value: /* key */ js.Any | String | Double => js.Any): Self = StObject.set(x, "onRemoved", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnRemovedUndefined: Self = StObject.set(x, "onRemoved", js.undefined)
    
    @scala.inline
    def setOnRemoving(value: /* key */ js.Any | String | Double => js.Any): Self = StObject.set(x, "onRemoving", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnRemovingUndefined: Self = StObject.set(x, "onRemoving", js.undefined)
    
    @scala.inline
    def setOnUpdated(value: (/* key */ js.Any | String | Double, /* values */ js.Any) => js.Any): Self = StObject.set(x, "onUpdated", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnUpdatedUndefined: Self = StObject.set(x, "onUpdated", js.undefined)
    
    @scala.inline
    def setOnUpdating(value: (/* key */ js.Any | String | Double, /* values */ js.Any) => js.Any): Self = StObject.set(x, "onUpdating", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnUpdatingUndefined: Self = StObject.set(x, "onUpdating", js.undefined)
  }
}
