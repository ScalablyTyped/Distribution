package typings.expo

import typings.expo.anon.ErrorAny
import typings.expo.anon.ErrorNull
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rootErrorBoundaryWebMod {
  
  @JSImport("expo/build/launch/RootErrorBoundary.web", JSImport.Default)
  @js.native
  class default () extends RootErrorBoundary
  /* static members */
  object default {
    
    @JSImport("expo/build/launch/RootErrorBoundary.web", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def getDerivedStateFromError(error: js.Any): ErrorAny = ^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromError")(error.asInstanceOf[js.Any]).asInstanceOf[ErrorAny]
  }
  
  trait Props extends StObject {
    
    var children: ReactNode
  }
  object Props {
    
    inline def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  @js.native
  trait RootErrorBoundary
    extends Component[Props, State, js.Any] {
    
    @JSName("state")
    var state_RootErrorBoundary: ErrorNull = js.native
  }
  
  trait State extends StObject {
    
    var error: Error | Null
  }
  object State {
    
    inline def apply(): State = {
      val __obj = js.Dynamic.literal(error = null)
      __obj.asInstanceOf[State]
    }
    
    extension [Self <: State](x: Self) {
      
      inline def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorNull: Self = StObject.set(x, "error", null)
    }
  }
}
