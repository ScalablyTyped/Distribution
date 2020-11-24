package typings.devextreme.mod.DevExpress.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StoreOptions[T] extends js.Object {
  
  /**
    * [descr:Store.Options.errorHandler]
    */
  var errorHandler: js.UndefOr[js.Function] = js.native
  
  /**
    * [descr:Store.Options.key]
    */
  var key: js.UndefOr[String | js.Array[String]] = js.native
  
  /**
    * [descr:Store.Options.onInserted]
    */
  var onInserted: js.UndefOr[js.Function2[/* values */ js.Any, /* key */ js.Any | String | Double, _]] = js.native
  
  /**
    * [descr:Store.Options.onInserting]
    */
  var onInserting: js.UndefOr[js.Function1[/* values */ js.Any, _]] = js.native
  
  /**
    * [descr:Store.Options.onLoaded]
    */
  var onLoaded: js.UndefOr[js.Function1[/* result */ js.Array[_], _]] = js.native
  
  /**
    * [descr:Store.Options.onLoading]
    */
  var onLoading: js.UndefOr[js.Function1[/* loadOptions */ LoadOptions, _]] = js.native
  
  /**
    * [descr:Store.Options.onModified]
    */
  var onModified: js.UndefOr[js.Function] = js.native
  
  /**
    * [descr:Store.Options.onModifying]
    */
  var onModifying: js.UndefOr[js.Function] = js.native
  
  /**
    * [descr:Store.Options.onPush]
    */
  var onPush: js.UndefOr[js.Function1[/* changes */ js.Array[_], _]] = js.native
  
  /**
    * [descr:Store.Options.onRemoved]
    */
  var onRemoved: js.UndefOr[js.Function1[/* key */ js.Any | String | Double, _]] = js.native
  
  /**
    * [descr:Store.Options.onRemoving]
    */
  var onRemoving: js.UndefOr[js.Function1[/* key */ js.Any | String | Double, _]] = js.native
  
  /**
    * [descr:Store.Options.onUpdated]
    */
  var onUpdated: js.UndefOr[js.Function2[/* key */ js.Any | String | Double, /* values */ js.Any, _]] = js.native
  
  /**
    * [descr:Store.Options.onUpdating]
    */
  var onUpdating: js.UndefOr[js.Function2[/* key */ js.Any | String | Double, /* values */ js.Any, _]] = js.native
}
object StoreOptions {
  
  @scala.inline
  def apply[T](): StoreOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StoreOptions[T]]
  }
  
  @scala.inline
  implicit class StoreOptionsOps[Self <: StoreOptions[_], T] (val x: Self with StoreOptions[T]) extends AnyVal {
    
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
    def setErrorHandler(value: js.Function): Self = this.set("errorHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorHandler: Self = this.set("errorHandler", js.undefined)
    
    @scala.inline
    def setKeyVarargs(value: String*): Self = this.set("key", js.Array(value :_*))
    
    @scala.inline
    def setKey(value: String | js.Array[String]): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setOnInserted(value: (/* values */ js.Any, /* key */ js.Any | String | Double) => _): Self = this.set("onInserted", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnInserted: Self = this.set("onInserted", js.undefined)
    
    @scala.inline
    def setOnInserting(value: /* values */ js.Any => _): Self = this.set("onInserting", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnInserting: Self = this.set("onInserting", js.undefined)
    
    @scala.inline
    def setOnLoaded(value: /* result */ js.Array[_] => _): Self = this.set("onLoaded", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnLoaded: Self = this.set("onLoaded", js.undefined)
    
    @scala.inline
    def setOnLoading(value: /* loadOptions */ LoadOptions => _): Self = this.set("onLoading", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnLoading: Self = this.set("onLoading", js.undefined)
    
    @scala.inline
    def setOnModified(value: js.Function): Self = this.set("onModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnModified: Self = this.set("onModified", js.undefined)
    
    @scala.inline
    def setOnModifying(value: js.Function): Self = this.set("onModifying", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnModifying: Self = this.set("onModifying", js.undefined)
    
    @scala.inline
    def setOnPush(value: /* changes */ js.Array[_] => _): Self = this.set("onPush", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPush: Self = this.set("onPush", js.undefined)
    
    @scala.inline
    def setOnRemoved(value: /* key */ js.Any | String | Double => _): Self = this.set("onRemoved", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnRemoved: Self = this.set("onRemoved", js.undefined)
    
    @scala.inline
    def setOnRemoving(value: /* key */ js.Any | String | Double => _): Self = this.set("onRemoving", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnRemoving: Self = this.set("onRemoving", js.undefined)
    
    @scala.inline
    def setOnUpdated(value: (/* key */ js.Any | String | Double, /* values */ js.Any) => _): Self = this.set("onUpdated", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnUpdated: Self = this.set("onUpdated", js.undefined)
    
    @scala.inline
    def setOnUpdating(value: (/* key */ js.Any | String | Double, /* values */ js.Any) => _): Self = this.set("onUpdating", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnUpdating: Self = this.set("onUpdating", js.undefined)
  }
}
