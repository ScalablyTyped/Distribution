package typings.fluentuiUtilities

import typings.fluentuiUtilities.baseComponentTypesMod.IBaseProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object initializeComponentRefMod {
  
  @JSImport("@fluentui/utilities/lib/initializeComponentRef", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def initializeComponentRef[TProps /* <: IBaseProps[Any] */, TState](obj: Component[TProps, TState, Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initializeComponentRef")(obj.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
