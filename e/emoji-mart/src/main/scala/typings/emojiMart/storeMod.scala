package typings.emojiMart

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storeMod {
  
  object default {
    
    @JSImport("emoji-mart/dist-es/utils/store", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def get(key: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(key.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @scala.inline
    def set(key: String, value: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def setHandlers(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setHandlers")().asInstanceOf[Unit]
    @scala.inline
    def setHandlers(handlers: StoreHandlers): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setHandlers")(handlers.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def setNamespace(namespace: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setNamespace")(namespace.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def update(state: StringDictionary[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("update")(state.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  trait StoreHandlers extends StObject {
    
    var getter: js.UndefOr[js.Function1[/* key */ String, js.Any]] = js.undefined
    
    var setter: js.UndefOr[js.Function2[/* key */ String, /* value */ js.Any, Unit]] = js.undefined
  }
  object StoreHandlers {
    
    @scala.inline
    def apply(): StoreHandlers = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StoreHandlers]
    }
    
    @scala.inline
    implicit class StoreHandlersMutableBuilder[Self <: StoreHandlers] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetter(value: /* key */ String => js.Any): Self = StObject.set(x, "getter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetterUndefined: Self = StObject.set(x, "getter", js.undefined)
      
      @scala.inline
      def setSetter(value: (/* key */ String, /* value */ js.Any) => Unit): Self = StObject.set(x, "setter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetterUndefined: Self = StObject.set(x, "setter", js.undefined)
    }
  }
}
