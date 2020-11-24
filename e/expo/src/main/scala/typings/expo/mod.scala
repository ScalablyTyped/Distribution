package typings.expo

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("expo", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val DangerZone: typings.expo.dangerZoneMod.DangerZone = js.native
  
  def apisAreAvailable(): Boolean = js.native
  
  def registerRootComponent[P](component: ComponentType[P]): Unit = js.native
  
  @js.native
  class AppLoading ()
    extends typings.expo.appLoadingMod.AppLoading
  
  @js.native
  object Logs extends js.Object {
    
    def disableExpoCliLogging(): Unit = js.native
    
    def enableExpoCliLogging(): Unit = js.native
  }
}
