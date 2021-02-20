package typings.emojiMart

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storeMod {
  
  object default {
    
    @JSImport("emoji-mart/dist-es/utils/store", "default.get")
    @js.native
    def get(key: String): js.Any = js.native
    
    @JSImport("emoji-mart/dist-es/utils/store", "default.set")
    @js.native
    def set(key: String, value: js.Any): Unit = js.native
    
    @JSImport("emoji-mart/dist-es/utils/store", "default.setHandlers")
    @js.native
    def setHandlers(): Unit = js.native
    @JSImport("emoji-mart/dist-es/utils/store", "default.setHandlers")
    @js.native
    def setHandlers(handlers: StoreHandlers): Unit = js.native
    
    @JSImport("emoji-mart/dist-es/utils/store", "default.setNamespace")
    @js.native
    def setNamespace(namespace: String): Unit = js.native
    
    @JSImport("emoji-mart/dist-es/utils/store", "default.update")
    @js.native
    def update(state: StringDictionary[js.Any]): Unit = js.native
  }
  
  @js.native
  trait StoreHandlers extends StObject {
    
    var getter: js.UndefOr[js.Function1[/* key */ String, _]] = js.native
    
    var setter: js.UndefOr[js.Function2[/* key */ String, /* value */ js.Any, Unit]] = js.native
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
      def setGetter(value: /* key */ String => _): Self = StObject.set(x, "getter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetterUndefined: Self = StObject.set(x, "getter", js.undefined)
      
      @scala.inline
      def setSetter(value: (/* key */ String, /* value */ js.Any) => Unit): Self = StObject.set(x, "setter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetterUndefined: Self = StObject.set(x, "setter", js.undefined)
    }
  }
}
