package typings.glDashReact.glDashReactMod

import typings.glDashReact.Anon_GlParent
import typings.glDashReact.Anon_GlParentAny
import typings.glDashReact.Anon_GlParentBus
import typings.glDashReact.Anon_GlParentGlSurface
import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gl-react", "Bus")
@js.native
class Bus ()
  extends Component[BusProps, js.Object, js.Any] {
  @JSName("context")
  var context_Bus: Anon_GlParent = js.native
  var dependents: js.Array[Node | Surface[_]] = js.native
  var glBusRootNode: js.Any = js.native
  var glNode: js.UndefOr[Node] = js.native
  var id: Double = js.native
  def capture(): js.Array[_] = js.native
  def capture(x: Double): js.Array[_] = js.native
  def capture(x: Double, y: Double): js.Array[_] = js.native
  def capture(x: Double, y: Double, w: Double): js.Array[_] = js.native
  def capture(x: Double, y: Double, w: Double, h: Double): js.Array[_] = js.native
  def getChildContext(): Anon_GlParentBus = js.native
  def getGLName(): String = js.native
  def getGLRenderableContent(): js.Any = js.native
  def getGLRenderableNode(): Node = js.native
  def getGLShortName(): String = js.native
  def onRef(ref: js.Any): Unit = js.native
  def redraw(): Unit = js.native
}

/* static members */
@JSImport("gl-react", "Bus")
@js.native
object Bus extends js.Object {
  var childContextTypes: Anon_GlParentAny = js.native
  var contextTypes: Anon_GlParentGlSurface = js.native
  var defaultProps: BusProps = js.native
}

