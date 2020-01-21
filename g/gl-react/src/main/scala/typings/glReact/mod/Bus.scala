package typings.glReact.mod

import typings.glReact.AnonGlParent
import typings.glReact.AnonGlParentAny
import typings.glReact.AnonGlParentBus
import typings.glReact.AnonGlParentGlSurface
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gl-react", "Bus")
@js.native
class Bus ()
  extends Component[BusProps, js.Object, js.Any] {
  @JSName("context")
  var context_Bus: AnonGlParent = js.native
  var dependents: js.Array[Node | Surface[_]] = js.native
  var glBusRootNode: js.Any = js.native
  var glNode: js.UndefOr[Node] = js.native
  var id: Double = js.native
  def capture(): js.Array[_] = js.native
  def capture(x: Double): js.Array[_] = js.native
  def capture(x: Double, y: Double): js.Array[_] = js.native
  def capture(x: Double, y: Double, w: Double): js.Array[_] = js.native
  def capture(x: Double, y: Double, w: Double, h: Double): js.Array[_] = js.native
  def getChildContext(): AnonGlParentBus = js.native
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
  var childContextTypes: AnonGlParentAny = js.native
  var contextTypes: AnonGlParentGlSurface = js.native
  var defaultProps: BusProps = js.native
}

