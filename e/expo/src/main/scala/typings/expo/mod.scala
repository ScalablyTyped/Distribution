package typings.expo

import typings.expo.buildLaunchWithExpoRootDottypesMod.InitialProps
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("expo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object Logs {
    
    @JSImport("expo", "Logs")
    @js.native
    val ^ : js.Any = js.native
    
    inline def disableExpoCliLogging(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableExpoCliLogging")().asInstanceOf[Unit]
    
    inline def enableExpoCliLogging(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableExpoCliLogging")().asInstanceOf[Unit]
  }
  
  inline def disableErrorHandling(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableErrorHandling")().asInstanceOf[Unit]
  
  inline def registerRootComponent[P /* <: InitialProps */](component: ComponentType[P]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerRootComponent")(component.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
