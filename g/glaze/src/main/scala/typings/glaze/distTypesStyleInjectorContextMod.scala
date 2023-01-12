package typings.glaze

import typings.glaze.distTypesStyleInjectorMod.StyleInjector
import typings.react.mod.Context
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesStyleInjectorContextMod {
  
  @JSImport("glaze/dist-types/StyleInjectorContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("glaze/dist-types/StyleInjectorContext", "StyleInjectorContext")
  @js.native
  val StyleInjectorContext: Context[StyleInjector] = js.native
  
  inline def StyleInjectorProvider(param0: StyleInjectorProviderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("StyleInjectorProvider")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait StyleInjectorProviderProps extends StObject {
    
    var children: ReactNode
    
    var injector: js.UndefOr[StyleInjector] = js.undefined
  }
  object StyleInjectorProviderProps {
    
    inline def apply(): StyleInjectorProviderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StyleInjectorProviderProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StyleInjectorProviderProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setInjector(value: StyleInjector): Self = StObject.set(x, "injector", value.asInstanceOf[js.Any])
      
      inline def setInjectorUndefined: Self = StObject.set(x, "injector", js.undefined)
    }
  }
}
