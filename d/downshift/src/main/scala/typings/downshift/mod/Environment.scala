package typings.downshift.mod

import typings.std.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Environment extends StObject {
  
  var addEventListener: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof window.addEventListener */ Any
  
  var document: Document
  
  var removeEventListener: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof window.removeEventListener */ Any
}
object Environment {
  
  inline def apply(
    addEventListener: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof window.addEventListener */ Any,
    document: Document,
    removeEventListener: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof window.removeEventListener */ Any
  ): Environment = {
    val __obj = js.Dynamic.literal(addEventListener = addEventListener.asInstanceOf[js.Any], document = document.asInstanceOf[js.Any], removeEventListener = removeEventListener.asInstanceOf[js.Any])
    __obj.asInstanceOf[Environment]
  }
  
  extension [Self <: Environment](x: Self) {
    
    inline def setAddEventListener(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof window.addEventListener */ Any
    ): Self = StObject.set(x, "addEventListener", value.asInstanceOf[js.Any])
    
    inline def setDocument(value: Document): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setRemoveEventListener(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof window.removeEventListener */ Any
    ): Self = StObject.set(x, "removeEventListener", value.asInstanceOf[js.Any])
  }
}
