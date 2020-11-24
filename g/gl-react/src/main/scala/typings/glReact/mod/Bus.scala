package typings.glReact.mod

import typings.glReact.anon.GlParent
import typings.glReact.anon.GlParentAny
import typings.glReact.anon.GlParentBus
import typings.glReact.anon.GlSurface
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gl-react", "Bus")
@js.native
class Bus ()
  extends Component[BusProps, js.Object, js.Any] {
  
  def capture(): js.Array[_] = js.native
  def capture(
    x: js.UndefOr[scala.Nothing],
    y: js.UndefOr[scala.Nothing],
    w: js.UndefOr[scala.Nothing],
    h: Double
  ): js.Array[_] = js.native
  def capture(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], w: Double): js.Array[_] = js.native
  def capture(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], w: Double, h: Double): js.Array[_] = js.native
  def capture(x: js.UndefOr[scala.Nothing], y: Double): js.Array[_] = js.native
  def capture(x: js.UndefOr[scala.Nothing], y: Double, w: js.UndefOr[scala.Nothing], h: Double): js.Array[_] = js.native
  def capture(x: js.UndefOr[scala.Nothing], y: Double, w: Double): js.Array[_] = js.native
  def capture(x: js.UndefOr[scala.Nothing], y: Double, w: Double, h: Double): js.Array[_] = js.native
  def capture(x: Double): js.Array[_] = js.native
  def capture(x: Double, y: js.UndefOr[scala.Nothing], w: js.UndefOr[scala.Nothing], h: Double): js.Array[_] = js.native
  def capture(x: Double, y: js.UndefOr[scala.Nothing], w: Double): js.Array[_] = js.native
  def capture(x: Double, y: js.UndefOr[scala.Nothing], w: Double, h: Double): js.Array[_] = js.native
  def capture(x: Double, y: Double): js.Array[_] = js.native
  def capture(x: Double, y: Double, w: js.UndefOr[scala.Nothing], h: Double): js.Array[_] = js.native
  def capture(x: Double, y: Double, w: Double): js.Array[_] = js.native
  def capture(x: Double, y: Double, w: Double, h: Double): js.Array[_] = js.native
  
  @JSName("context")
  var context_Bus: GlParent = js.native
  
  var dependents: js.Array[Node | Surface[_]] = js.native
  
  def getChildContext(): GlParentBus = js.native
  
  def getGLName(): String = js.native
  
  def getGLRenderableContent(): js.Any = js.native
  
  def getGLRenderableNode(): Node = js.native
  
  def getGLShortName(): String = js.native
  
  var glBusRootNode: js.Any = js.native
  
  var glNode: js.UndefOr[Node] = js.native
  
  var id: Double = js.native
  
  def onRef(ref: js.Any): Unit = js.native
  
  def redraw(): Unit = js.native
}
/* static members */
@JSImport("gl-react", "Bus")
@js.native
object Bus extends js.Object {
  
  var childContextTypes: GlParentAny = js.native
  
  var contextTypes: GlSurface = js.native
  
  var defaultProps: BusProps = js.native
}
