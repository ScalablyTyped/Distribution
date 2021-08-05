package typings.dispatchr

import org.scalablytyped.runtime.StringDictionary
import typings.dispatchr.dispatchrStrings.handlers
import typings.dispatchr.dispatchrStrings.mixins
import typings.dispatchr.dispatchrStrings.statics
import typings.dispatchr.dispatchrStrings.storeName
import typings.dispatchr.mod.Store
import typings.dispatchr.mod.StoreClass
import typings.std.Pick
import typings.std.ThisType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createStoreMod {
  
  inline def apply[T /* <: StoreOptions */](options: T & ThisType[StoreThis[T]]): StoreClass = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[StoreClass]
  
  @JSImport("dispatchr/addons/createStore", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Omit[T, K /* <: /* keyof T */ String */] = Pick[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: P} & {[ P in K ]: never} & {[x: string] : never, [x: number] : never}[keyof T] */ js.Any
  ]
  
  trait StoreOptions extends StObject {
    
    var dehydrate: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    var handlers: StringDictionary[String]
    
    var initialize: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var mixins: js.UndefOr[js.Array[js.Object]] = js.undefined
    
    var rehydrate: js.UndefOr[js.Function1[/* state */ js.Any, Unit]] = js.undefined
    
    var statics: js.UndefOr[StringDictionary[js.Any]] = js.undefined
    
    var storeName: String
  }
  object StoreOptions {
    
    inline def apply(handlers: StringDictionary[String], storeName: String): StoreOptions = {
      val __obj = js.Dynamic.literal(handlers = handlers.asInstanceOf[js.Any], storeName = storeName.asInstanceOf[js.Any])
      __obj.asInstanceOf[StoreOptions]
    }
    
    extension [Self <: StoreOptions](x: Self) {
      
      inline def setDehydrate(value: () => js.Any): Self = StObject.set(x, "dehydrate", js.Any.fromFunction0(value))
      
      inline def setDehydrateUndefined: Self = StObject.set(x, "dehydrate", js.undefined)
      
      inline def setHandlers(value: StringDictionary[String]): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
      
      inline def setInitialize(value: () => Unit): Self = StObject.set(x, "initialize", js.Any.fromFunction0(value))
      
      inline def setInitializeUndefined: Self = StObject.set(x, "initialize", js.undefined)
      
      inline def setMixins(value: js.Array[js.Object]): Self = StObject.set(x, "mixins", value.asInstanceOf[js.Any])
      
      inline def setMixinsUndefined: Self = StObject.set(x, "mixins", js.undefined)
      
      inline def setMixinsVarargs(value: js.Object*): Self = StObject.set(x, "mixins", js.Array(value :_*))
      
      inline def setRehydrate(value: /* state */ js.Any => Unit): Self = StObject.set(x, "rehydrate", js.Any.fromFunction1(value))
      
      inline def setRehydrateUndefined: Self = StObject.set(x, "rehydrate", js.undefined)
      
      inline def setStatics(value: StringDictionary[js.Any]): Self = StObject.set(x, "statics", value.asInstanceOf[js.Any])
      
      inline def setStaticsUndefined: Self = StObject.set(x, "statics", js.undefined)
      
      inline def setStoreName(value: String): Self = StObject.set(x, "storeName", value.asInstanceOf[js.Any])
    }
  }
  
  // see: https://github.com/yahoo/fluxible/blob/dispatchr-v1.2.0/packages/dispatchr/addons/createStore.js#L9
  type StoreThis[T /* <: StoreOptions */] = (Omit[T, statics | storeName | handlers | mixins]) & Store[js.Object]
}
