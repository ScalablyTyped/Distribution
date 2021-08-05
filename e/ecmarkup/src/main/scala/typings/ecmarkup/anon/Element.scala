package typings.ecmarkup.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Element extends StObject {
  
  var element: typings.std.Element
  
  var tree: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EcmarkdownNode */ js.Any
  ] = js.undefined
}
object Element {
  
  inline def apply(element: typings.std.Element): Element = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
    __obj.asInstanceOf[Element]
  }
  
  extension [Self <: Element](x: Self) {
    
    inline def setElement(value: typings.std.Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setTree(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EcmarkdownNode */ js.Any
    ): Self = StObject.set(x, "tree", value.asInstanceOf[js.Any])
    
    inline def setTreeUndefined: Self = StObject.set(x, "tree", js.undefined)
  }
}
