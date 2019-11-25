package typings.expo

import typings.expo.buildLaunchAppLoadingMod.AppLoading
import typings.expo.buildLaunchAppLoadingMod.Props
import typings.fbemitter.fbemitterMod.EventEmitter
import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo/build/launch/AppLoading", JSImport.Namespace)
@js.native
object buildLaunchAppLoadingMod extends js.Object {
  @js.native
  trait AppLoading
    extends Component[Props, js.Object, js.Any] {
    var _isMounted: Boolean = js.native
    def _startLoadingAppResourcesAsync(): js.Promise[Unit] = js.native
    @JSName("componentDidMount")
    def componentDidMount_MAppLoading(): Unit = js.native
    @JSName("componentWillUnmount")
    def componentWillUnmount_MAppLoading(): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.expo.Anon_AutoHideSplash
    - typings.expo.Anon_OnError
  */
  trait Props extends js.Object
  
  @js.native
  class default () extends AppLoading
  
  def getAppLoadingLifecycleEmitter(): EventEmitter = js.native
}

