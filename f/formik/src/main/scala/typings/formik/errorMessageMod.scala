package typings.formik

import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorMessageMod {
  
  @JSImport("formik/dist/ErrorMessage", "ErrorMessage")
  @js.native
  val ErrorMessage: ComponentType[ErrorMessageProps] = js.native
  
  trait ErrorMessageProps extends StObject {
    
    var children: js.UndefOr[js.Function1[/* errorMessage */ String, ReactNode]] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var component: js.UndefOr[String | ComponentType[js.Object]] = js.undefined
    
    var name: String
    
    var render: js.UndefOr[js.Function1[/* errorMessage */ String, ReactNode]] = js.undefined
  }
  object ErrorMessageProps {
    
    inline def apply(name: String): ErrorMessageProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorMessageProps]
    }
    
    extension [Self <: ErrorMessageProps](x: Self) {
      
      inline def setChildren(value: /* errorMessage */ String => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setComponent(value: String | ComponentType[js.Object]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRender(value: /* errorMessage */ String => ReactNode): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    }
  }
}
