package typings.expo

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rootErrorBoundaryMod {
  
  @JSImport("expo/build/launch/RootErrorBoundary", JSImport.Default)
  @js.native
  class default protected () extends RootErrorBoundary {
    def this(props: Props) = this()
  }
  /* static members */
  object default {
    
    @JSImport("expo/build/launch/RootErrorBoundary", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Test this by adding `throw new Error('example')` to your root component
      * when the AppLoading component is rendered.
      */
    inline def getDerivedStateFromError(_error: Error): typings.expo.anon.Error | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromError")(_error.asInstanceOf[js.Any]).asInstanceOf[typings.expo.anon.Error | Null]
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
    
    def _subscribeToGlobalErrors(): Unit = js.native
    
    def _unsubscribeFromGlobalErrors(): Unit = js.native
    
    @JSName("componentDidCatch")
    def componentDidCatch_MRootErrorBoundary(error: Error, _errorInfo: js.Any): Unit = js.native
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
