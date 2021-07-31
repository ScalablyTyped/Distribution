package typings.expo

import typings.expo.withExpoRootTypesMod.InitialProps
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withExpoRootWebMod {
  
  @JSImport("expo/build/launch/withExpoRoot.web", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[P /* <: InitialProps */](AppRootComponent: ComponentType[P]): ComponentClass[P, ComponentState] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(AppRootComponent.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[P, ComponentState]]
}
