package typings.devtools

import typings.puppeteerCore.jshandleMod.ElementHandle
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elementstoreMod {
  
  @JSImport("devtools/build/elementstore", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with ElementStore {
    
    /* private */ /* CompleteClass */
    var _elementMap: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _index: js.Any = js.native
    
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /* CompleteClass */
    override def get(index: String): js.Promise[js.UndefOr[ElementHandle[Element]]] = js.native
    
    /* CompleteClass */
    override def set(elementHandle: ElementHandle[Element]): String = js.native
  }
  
  trait ElementStore extends StObject {
    
    /* private */ var _elementMap: js.Any
    
    /* private */ var _index: js.Any
    
    def clear(): Unit
    
    def get(index: String): js.Promise[js.UndefOr[ElementHandle[Element]]]
    
    def set(elementHandle: ElementHandle[Element]): String
  }
  object ElementStore {
    
    inline def apply(
      _elementMap: js.Any,
      _index: js.Any,
      clear: () => Unit,
      get: String => js.Promise[js.UndefOr[ElementHandle[Element]]],
      set: ElementHandle[Element] => String
    ): ElementStore = {
      val __obj = js.Dynamic.literal(_elementMap = _elementMap.asInstanceOf[js.Any], _index = _index.asInstanceOf[js.Any], clear = js.Any.fromFunction0(clear), get = js.Any.fromFunction1(get), set = js.Any.fromFunction1(set))
      __obj.asInstanceOf[ElementStore]
    }
    
    extension [Self <: ElementStore](x: Self) {
      
      inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      inline def setGet(value: String => js.Promise[js.UndefOr[ElementHandle[Element]]]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setSet(value: ElementHandle[Element] => String): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
      
      inline def set_elementMap(value: js.Any): Self = StObject.set(x, "_elementMap", value.asInstanceOf[js.Any])
      
      inline def set_index(value: js.Any): Self = StObject.set(x, "_index", value.asInstanceOf[js.Any])
    }
  }
}
