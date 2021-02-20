package typings.expo

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rootErrorBoundaryMod {
  
  @JSImport("expo/build/launch/RootErrorBoundary", JSImport.Default)
  @js.native
  class default protected () extends RootErrorBoundary {
    def this(props: Props) = this()
  }
  /* static members */
  object default {
    
    /**
      * Test this by adding `throw new Error('example')` to your root component
      * when the AppLoading component is rendered.
      */
    @JSImport("expo/build/launch/RootErrorBoundary", "default.getDerivedStateFromError")
    @js.native
    def getDerivedStateFromError(_error: Error): typings.expo.anon.Error | Null = js.native
  }
  
  @js.native
  trait Props extends StObject {
    
    var children: ReactNode = js.native
  }
  object Props {
    
    @scala.inline
    def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
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
  
  @js.native
  trait State extends StObject {
    
    var error: Error | Null = js.native
  }
  object State {
    
    @scala.inline
    def apply(): State = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit class StateMutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorNull: Self = StObject.set(x, "error", null)
    }
  }
}
