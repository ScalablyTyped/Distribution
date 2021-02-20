package typings.expo

import typings.expo.appLoadingMod.default
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("expo", "AppLoading")
  @js.native
  class AppLoading () extends default
  
  @JSImport("expo", "DangerZone")
  @js.native
  val DangerZone: typings.expo.dangerZoneMod.DangerZone = js.native
  
  object Logs {
    
    @JSImport("expo", "Logs.disableExpoCliLogging")
    @js.native
    def disableExpoCliLogging(): Unit = js.native
    
    @JSImport("expo", "Logs.enableExpoCliLogging")
    @js.native
    def enableExpoCliLogging(): Unit = js.native
  }
  
  @JSImport("expo", "apisAreAvailable")
  @js.native
  def apisAreAvailable(): Boolean = js.native
  
  @JSImport("expo", "registerRootComponent")
  @js.native
  def registerRootComponent[P](component: ComponentType[P]): Unit = js.native
}
