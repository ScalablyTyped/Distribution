package typings.fluentuiUtilities

import typings.fluentuiUtilities.anon.RootRef
import typings.react.mod.Context
import typings.react.mod.FunctionComponent
import typings.react.mod.RefObject
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import typings.std.PointerEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useFocusRectsMod {
  
  @JSImport("@fluentui/utilities/lib/useFocusRects", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@fluentui/utilities/lib/useFocusRects", "FocusRects")
  @js.native
  val FocusRects: FunctionComponent[RootRef] = js.native
  
  @JSImport("@fluentui/utilities/lib/useFocusRects", "FocusRectsContext")
  @js.native
  val FocusRectsContext: Context[js.UndefOr[IFocusRectsContext]] = js.native
  
  inline def useFocusRects(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useFocusRects")().asInstanceOf[Unit]
  inline def useFocusRects(rootRef: RefObject[HTMLElement]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useFocusRects")(rootRef.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait IFocusRectsContext extends StObject {
    
    /**
      * Ref to the root element of the provider
      */
    val providerRef: RefObject[HTMLElement]
    
    /**
      * Used by child FocusRectsProviders to register their element with the parent provider.
      */
    def registerProvider(ref: RefObject[HTMLElement]): Unit
    
    /**
      * Array of this and all child provider elements under this one in the React tree.
      *
      * Tracking all child providers will allow a focus event in the parent to also set focus styling in its descendants.
      * This is needed for Combobox, for example, because the focus events happen on the parent context, but the visual
      * focus indicator is in the combobox callout. The callout needs to be notified on focus events from the parent.
      */
    val registeredProviders: js.Array[RefObject[HTMLElement]]
    
    /**
      * Used by child FocusRectsProviders to unregister their element from the parent provider.
      */
    def unregisterProvider(ref: RefObject[HTMLElement]): Unit
  }
  object IFocusRectsContext {
    
    inline def apply(
      providerRef: RefObject[HTMLElement],
      registerProvider: RefObject[HTMLElement] => Unit,
      registeredProviders: js.Array[RefObject[HTMLElement]],
      unregisterProvider: RefObject[HTMLElement] => Unit
    ): IFocusRectsContext = {
      val __obj = js.Dynamic.literal(providerRef = providerRef.asInstanceOf[js.Any], registerProvider = js.Any.fromFunction1(registerProvider), registeredProviders = registeredProviders.asInstanceOf[js.Any], unregisterProvider = js.Any.fromFunction1(unregisterProvider))
      __obj.asInstanceOf[IFocusRectsContext]
    }
    
    extension [Self <: IFocusRectsContext](x: Self) {
      
      inline def setProviderRef(value: RefObject[HTMLElement]): Self = StObject.set(x, "providerRef", value.asInstanceOf[js.Any])
      
      inline def setRegisterProvider(value: RefObject[HTMLElement] => Unit): Self = StObject.set(x, "registerProvider", js.Any.fromFunction1(value))
      
      inline def setRegisteredProviders(value: js.Array[RefObject[HTMLElement]]): Self = StObject.set(x, "registeredProviders", value.asInstanceOf[js.Any])
      
      inline def setRegisteredProvidersVarargs(value: RefObject[HTMLElement]*): Self = StObject.set(x, "registeredProviders", js.Array(value*))
      
      inline def setUnregisterProvider(value: RefObject[HTMLElement] => Unit): Self = StObject.set(x, "unregisterProvider", js.Any.fromFunction1(value))
    }
  }
  
  trait ListenerCallbacks extends StObject {
    
    def onKeyDown(ev: KeyboardEvent): Unit
    
    def onKeyUp(ev: KeyboardEvent): Unit
    
    def onMouseDown(ev: MouseEvent): Unit
    
    def onPointerDown(ev: PointerEvent): Unit
  }
  object ListenerCallbacks {
    
    inline def apply(
      onKeyDown: KeyboardEvent => Unit,
      onKeyUp: KeyboardEvent => Unit,
      onMouseDown: MouseEvent => Unit,
      onPointerDown: PointerEvent => Unit
    ): ListenerCallbacks = {
      val __obj = js.Dynamic.literal(onKeyDown = js.Any.fromFunction1(onKeyDown), onKeyUp = js.Any.fromFunction1(onKeyUp), onMouseDown = js.Any.fromFunction1(onMouseDown), onPointerDown = js.Any.fromFunction1(onPointerDown))
      __obj.asInstanceOf[ListenerCallbacks]
    }
    
    extension [Self <: ListenerCallbacks](x: Self) {
      
      inline def setOnKeyDown(value: KeyboardEvent => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnKeyUp(value: KeyboardEvent => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
      
      inline def setOnMouseDown(value: MouseEvent => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      inline def setOnPointerDown(value: PointerEvent => Unit): Self = StObject.set(x, "onPointerDown", js.Any.fromFunction1(value))
    }
  }
}
