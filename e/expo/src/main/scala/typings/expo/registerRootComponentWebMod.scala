package typings.expo

import typings.expo.withExpoRootTypesMod.InitialProps
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object registerRootComponentWebMod {
  
  @JSImport("expo/build/launch/registerRootComponent.web", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[P /* <: InitialProps */](component: ComponentType[P]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(component.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
