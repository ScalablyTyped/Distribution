package typings.fluentuiUtilities

import typings.react.mod.RefObject
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSetFocusVisibilityMod {
  
  @JSImport("@fluentui/utilities/lib/setFocusVisibility", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@fluentui/utilities/lib/setFocusVisibility", "IsFocusHiddenClassName")
  @js.native
  val IsFocusHiddenClassName: /* "ms-Fabric--isFocusHidden" */ String = js.native
  
  @JSImport("@fluentui/utilities/lib/setFocusVisibility", "IsFocusVisibleClassName")
  @js.native
  val IsFocusVisibleClassName: /* "ms-Fabric--isFocusVisible" */ String = js.native
  
  inline def setFocusVisibility(enabled: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setFocusVisibility")(enabled.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setFocusVisibility(enabled: Boolean, target: Unit, registeredProviders: js.Array[RefObject[HTMLElement]]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setFocusVisibility")(enabled.asInstanceOf[js.Any], target.asInstanceOf[js.Any], registeredProviders.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setFocusVisibility(enabled: Boolean, target: Element): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setFocusVisibility")(enabled.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setFocusVisibility(enabled: Boolean, target: Element, registeredProviders: js.Array[RefObject[HTMLElement]]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setFocusVisibility")(enabled.asInstanceOf[js.Any], target.asInstanceOf[js.Any], registeredProviders.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
