package typings.dispatchr.createStoreMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StoreOptions extends js.Object {
  
  var dehydrate: js.UndefOr[js.Function0[_]] = js.native
  
  var handlers: StringDictionary[String] = js.native
  
  var initialize: js.UndefOr[js.Function0[Unit]] = js.native
  
  var mixins: js.UndefOr[js.Array[js.Object]] = js.native
  
  var rehydrate: js.UndefOr[js.Function1[/* state */ js.Any, Unit]] = js.native
  
  var statics: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var storeName: String = js.native
}
object StoreOptions {
  
  @scala.inline
  def apply(handlers: StringDictionary[String], storeName: String): StoreOptions = {
    val __obj = js.Dynamic.literal(handlers = handlers.asInstanceOf[js.Any], storeName = storeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreOptions]
  }
  
  @scala.inline
  implicit class StoreOptionsOps[Self <: StoreOptions] (val x: Self) extends AnyVal {
    
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
    def setHandlers(value: StringDictionary[String]): Self = this.set("handlers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoreName(value: String): Self = this.set("storeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDehydrate(value: () => _): Self = this.set("dehydrate", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteDehydrate: Self = this.set("dehydrate", js.undefined)
    
    @scala.inline
    def setInitialize(value: () => Unit): Self = this.set("initialize", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteInitialize: Self = this.set("initialize", js.undefined)
    
    @scala.inline
    def setMixinsVarargs(value: js.Object*): Self = this.set("mixins", js.Array(value :_*))
    
    @scala.inline
    def setMixins(value: js.Array[js.Object]): Self = this.set("mixins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMixins: Self = this.set("mixins", js.undefined)
    
    @scala.inline
    def setRehydrate(value: /* state */ js.Any => Unit): Self = this.set("rehydrate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRehydrate: Self = this.set("rehydrate", js.undefined)
    
    @scala.inline
    def setStatics(value: StringDictionary[js.Any]): Self = this.set("statics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatics: Self = this.set("statics", js.undefined)
  }
}
