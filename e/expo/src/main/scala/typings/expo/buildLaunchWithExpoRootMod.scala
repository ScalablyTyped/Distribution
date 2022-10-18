package typings.expo

import typings.expo.buildLaunchWithExpoRootDottypesMod.InitialProps
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildLaunchWithExpoRootMod {
  
  @JSImport("expo/build/launch/withExpoRoot", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[P /* <: InitialProps */](AppRootComponent: ComponentType[P]): ComponentType[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(AppRootComponent.asInstanceOf[js.Any]).asInstanceOf[ComponentType[P]]
}
