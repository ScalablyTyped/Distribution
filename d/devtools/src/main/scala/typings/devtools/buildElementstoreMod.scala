package typings.devtools

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildElementstoreMod {
  
  @JSImport("devtools/build/elementstore", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with ElementStore
  
  @js.native
  trait ElementStore extends StObject {
    
    /* private */ var _elementMap: Any = js.native
    
    /* private */ var _frameMap: Any = js.native
    
    /* private */ var _index: Any = js.native
    
    def clear(): Unit = js.native
    def clear(
      frame: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Frame */ Any
    ): Unit = js.native
    
    def get(index: String): js.Promise[
        js.UndefOr[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ElementHandle<Element> */ Any
        ]
      ] = js.native
    
    def set(
      elementHandle: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ElementHandle */ Any
    ): String = js.native
  }
}
