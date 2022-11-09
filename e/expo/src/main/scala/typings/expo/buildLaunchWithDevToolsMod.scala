package typings.expo

import typings.react.mod.ComponentProps
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildLaunchWithDevToolsMod {
  
  @JSImport("expo/build/launch/withDevTools", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def withDevTools[TComponent /* <: ComponentType[Any] */](AppRootComponent: TComponent): ComponentType[ComponentProps[TComponent]] = ^.asInstanceOf[js.Dynamic].applyDynamic("withDevTools")(AppRootComponent.asInstanceOf[js.Any]).asInstanceOf[ComponentType[ComponentProps[TComponent]]]
}
