package typings.fluentuiUtilities

import typings.react.mod.FC
import typings.react.mod.RefObject
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFocusRectsProviderMod {
  
  @JSImport("@fluentui/utilities/lib/FocusRectsProvider", "FocusRectsProvider")
  @js.native
  val FocusRectsProvider: FC[FocusRectsProviderProps] = js.native
  
  trait FocusRectsProviderProps extends StObject {
    
    /**
      * Indicates that this is the root of a layer, and should not inherit the providerRef from a parent context.
      */
    var layerRoot: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Ref to the root element that this is providing focus rects for.
      */
    var providerRef: RefObject[HTMLElement]
  }
  object FocusRectsProviderProps {
    
    inline def apply(providerRef: RefObject[HTMLElement]): FocusRectsProviderProps = {
      val __obj = js.Dynamic.literal(providerRef = providerRef.asInstanceOf[js.Any])
      __obj.asInstanceOf[FocusRectsProviderProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FocusRectsProviderProps] (val x: Self) extends AnyVal {
      
      inline def setLayerRoot(value: Boolean): Self = StObject.set(x, "layerRoot", value.asInstanceOf[js.Any])
      
      inline def setLayerRootUndefined: Self = StObject.set(x, "layerRoot", js.undefined)
      
      inline def setProviderRef(value: RefObject[HTMLElement]): Self = StObject.set(x, "providerRef", value.asInstanceOf[js.Any])
    }
  }
}
