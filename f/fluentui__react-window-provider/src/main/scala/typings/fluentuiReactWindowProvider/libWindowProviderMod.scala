package typings.fluentuiReactWindowProvider

import typings.react.mod.Context
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactNode
import typings.std.Document
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libWindowProviderMod {
  
  @JSImport("@fluentui/react-window-provider/lib/WindowProvider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@fluentui/react-window-provider/lib/WindowProvider", "WindowContext")
  @js.native
  val WindowContext: Context[WindowProviderProps] = js.native
  
  @JSImport("@fluentui/react-window-provider/lib/WindowProvider", "WindowProvider")
  @js.native
  val WindowProvider: FunctionComponent[WindowProviderProps] = js.native
  
  inline def useDocument(): js.UndefOr[Document] = ^.asInstanceOf[js.Dynamic].applyDynamic("useDocument")().asInstanceOf[js.UndefOr[Document]]
  
  inline def useWindow(): js.UndefOr[Window] = ^.asInstanceOf[js.Dynamic].applyDynamic("useWindow")().asInstanceOf[js.UndefOr[Window]]
  
  trait WindowProviderProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Provide the active window.
      */
    var window: js.UndefOr[Window] = js.undefined
  }
  object WindowProviderProps {
    
    inline def apply(): WindowProviderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WindowProviderProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WindowProviderProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setWindow(value: Window): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
      
      inline def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
    }
  }
}
