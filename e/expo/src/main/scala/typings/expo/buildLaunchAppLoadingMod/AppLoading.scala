package typings.expo.buildLaunchAppLoadingMod

import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

