package typings.fragmentedStore

import org.scalablytyped.runtime.StringDictionary
import typings.fragmentedStore.mod.StateHook
import typings.react.mod.Dispatch
import typings.react.mod.ExoticComponent
import typings.react.mod.ReactNode
import typings.react.mod.SetStateAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Children extends StObject {
    
    var children: ReactNode
  }
  object Children {
    
    inline def apply(): Children = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Children]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Children] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  trait Provider[Store /* <: StringDictionary[Any] */] extends StObject {
    
    var Provider: ExoticComponent[Children]
    
    var useStore: StateHook[Store]
  }
  object Provider {
    
    inline def apply[Store /* <: StringDictionary[Any] */](
      Provider: ExoticComponent[Children],
      useStore: () => js.Tuple2[Store, Dispatch[SetStateAction[Store]]]
    ): Provider[Store] = {
      val __obj = js.Dynamic.literal(Provider = Provider.asInstanceOf[js.Any], useStore = js.Any.fromFunction0(useStore))
      __obj.asInstanceOf[Provider[Store]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Provider[?], Store /* <: StringDictionary[Any] */] (val x: Self & Provider[Store]) extends AnyVal {
      
      inline def setProvider(value: ExoticComponent[Children]): Self = StObject.set(x, "Provider", value.asInstanceOf[js.Any])
      
      inline def setUseStore(value: () => js.Tuple2[Store, Dispatch[SetStateAction[Store]]]): Self = StObject.set(x, "useStore", js.Any.fromFunction0(value))
    }
  }
}
