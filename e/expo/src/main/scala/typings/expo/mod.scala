package typings.expo

import typings.expo.appLoadingMod.default
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("expo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("expo", "AppLoading")
  @js.native
  class AppLoading () extends default
  
  @JSImport("expo", "DangerZone")
  @js.native
  val DangerZone: typings.expo.dangerZoneMod.DangerZone = js.native
  
  object Logs {
    
    @JSImport("expo", "Logs")
    @js.native
    val ^ : js.Any = js.native
    
    inline def disableExpoCliLogging(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableExpoCliLogging")().asInstanceOf[Unit]
    
    inline def enableExpoCliLogging(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableExpoCliLogging")().asInstanceOf[Unit]
  }
  
  inline def apisAreAvailable(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("apisAreAvailable")().asInstanceOf[Boolean]
  
  inline def registerRootComponent[P](component: ComponentType[P]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerRootComponent")(component.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
