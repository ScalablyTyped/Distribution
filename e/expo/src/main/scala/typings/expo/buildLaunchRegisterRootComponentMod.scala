package typings.expo

import typings.expo.buildLaunchWithExpoRootDottypesMod.InitialProps
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildLaunchRegisterRootComponentMod {
  
  @JSImport("expo/build/launch/registerRootComponent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[P /* <: InitialProps */](component: ComponentType[P]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(component.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
