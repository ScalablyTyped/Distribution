package typings.fluentuiReactWindowProvider

import typings.react.mod.Context
import typings.react.mod.FunctionComponent
import typings.std.Document
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object windowProviderMod {
  
  @JSImport("@fluentui/react-window-provider/lib/WindowProvider", "WindowContext")
  @js.native
  val WindowContext: Context[WindowProviderProps] = js.native
  
  @JSImport("@fluentui/react-window-provider/lib/WindowProvider", "WindowProvider")
  @js.native
  val WindowProvider: FunctionComponent[WindowProviderProps] = js.native
  
  @JSImport("@fluentui/react-window-provider/lib/WindowProvider", "useDocument")
  @js.native
  def useDocument(): js.UndefOr[Document] = js.native
  
  @JSImport("@fluentui/react-window-provider/lib/WindowProvider", "useWindow")
  @js.native
  def useWindow(): js.UndefOr[Window] = js.native
  
  @js.native
  trait WindowProviderProps extends StObject {
    
    /**
      * Provide the active window.
      */
    var window: js.UndefOr[Window] = js.native
  }
  object WindowProviderProps {
    
    @scala.inline
    def apply(): WindowProviderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WindowProviderProps]
    }
    
    @scala.inline
    implicit class WindowProviderPropsMutableBuilder[Self <: WindowProviderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setWindow(value: Window): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
    }
  }
}
