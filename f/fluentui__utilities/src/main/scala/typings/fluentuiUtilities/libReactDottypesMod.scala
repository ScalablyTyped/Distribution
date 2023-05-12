package typings.fluentuiUtilities

import typings.react.mod.Key
import typings.react.mod.LegacyRef
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libReactDottypesMod {
  
  trait IReactProps[T] extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var key: js.UndefOr[Key] = js.undefined
    
    var ref: js.UndefOr[LegacyRef[T]] = js.undefined
  }
  object IReactProps {
    
    inline def apply[T](): IReactProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IReactProps[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IReactProps[?], T] (val x: Self & IReactProps[T]) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setRef(value: LegacyRef[T]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ T | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
}
