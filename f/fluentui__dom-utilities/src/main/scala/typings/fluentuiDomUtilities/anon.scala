package typings.fluentuiDomUtilities

import typings.fluentuiDomUtilities.ivirtualelementMod.IVirtualElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Children extends StObject {
    
    var children: js.Array[IVirtualElement]
    
    var parent: js.UndefOr[IVirtualElement] = js.undefined
  }
  object Children {
    
    inline def apply(children: js.Array[IVirtualElement]): Children = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[Children]
    }
    
    extension [Self <: Children](x: Self) {
      
      inline def setChildren(value: js.Array[IVirtualElement]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: IVirtualElement*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setParent(value: IVirtualElement): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    }
  }
}
