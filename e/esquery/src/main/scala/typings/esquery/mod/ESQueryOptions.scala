package typings.esquery.mod

import org.scalablytyped.runtime.StringDictionary
import typings.estree.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ESQueryOptions extends StObject {
  
  var fallback: js.UndefOr[js.Function1[/* node */ Node, js.Array[String]]] = js.undefined
  
  var matchClass: js.UndefOr[
    js.Function3[/* className */ String, /* node */ Node, /* ancestry */ js.Array[Node], Boolean]
  ] = js.undefined
  
  var nodeTypeKey: js.UndefOr[String] = js.undefined
  
  var visitorKeys: js.UndefOr[StringDictionary[js.Array[String]]] = js.undefined
}
object ESQueryOptions {
  
  inline def apply(): ESQueryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ESQueryOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ESQueryOptions] (val x: Self) extends AnyVal {
    
    inline def setFallback(value: /* node */ Node => js.Array[String]): Self = StObject.set(x, "fallback", js.Any.fromFunction1(value))
    
    inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
    
    inline def setMatchClass(value: (/* className */ String, /* node */ Node, /* ancestry */ js.Array[Node]) => Boolean): Self = StObject.set(x, "matchClass", js.Any.fromFunction3(value))
    
    inline def setMatchClassUndefined: Self = StObject.set(x, "matchClass", js.undefined)
    
    inline def setNodeTypeKey(value: String): Self = StObject.set(x, "nodeTypeKey", value.asInstanceOf[js.Any])
    
    inline def setNodeTypeKeyUndefined: Self = StObject.set(x, "nodeTypeKey", js.undefined)
    
    inline def setVisitorKeys(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "visitorKeys", value.asInstanceOf[js.Any])
    
    inline def setVisitorKeysUndefined: Self = StObject.set(x, "visitorKeys", js.undefined)
  }
}
