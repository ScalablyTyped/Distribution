package typings.expoDashKeepDashAwake

import typings.expoDashKeepDashAwake.expoDashKeepDashAwakeMod.KeepAwake
import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo-keep-awake", JSImport.Namespace)
@js.native
object expoDashKeepDashAwakeMod extends js.Object {
  @js.native
  trait KeepAwake
    extends Component[js.Object, js.Object, js.Any] {
    @JSName("componentDidMount")
    def componentDidMount_MKeepAwake(): Unit = js.native
    @JSName("componentWillUnmount")
    def componentWillUnmount_MKeepAwake(): Unit = js.native
  }
  
  @js.native
  class default () extends KeepAwake
  
  def activate(): Unit = js.native
  def activate(tag: String): Unit = js.native
  def activateKeepAwake(): Unit = js.native
  def activateKeepAwake(tag: String): Unit = js.native
  def deactivate(): Unit = js.native
  def deactivate(tag: String): Unit = js.native
  def deactivateKeepAwake(): Unit = js.native
  def deactivateKeepAwake(tag: String): Unit = js.native
  def useKeepAwake(): Unit = js.native
  def useKeepAwake(tag: String): Unit = js.native
  /* static members */
  @js.native
  object default extends js.Object {
    def activate(): Unit = js.native
    def activate(tag: String): Unit = js.native
    def deactivate(): Unit = js.native
    def deactivate(tag: String): Unit = js.native
  }
  
}

