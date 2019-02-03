package typings
package glDashReactLib.glDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gl-react", "Bus")
@js.native
class Bus ()
  extends reactLib.reactMod.Component[BusProps, js.Object, js.Any] {
  @JSName("context")
  var context_Bus: glDashReactLib.Anon_GlParent = js.native
  var dependents: js.Array[Node | Surface[_]] = js.native
  var glBusRootNode: js.Any = js.native
  var glNode: js.UndefOr[Node] = js.native
  var id: scala.Double = js.native
  def capture(): js.Array[_] = js.native
  def capture(x: scala.Double): js.Array[_] = js.native
  def capture(x: scala.Double, y: scala.Double): js.Array[_] = js.native
  def capture(x: scala.Double, y: scala.Double, w: scala.Double): js.Array[_] = js.native
  def capture(x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double): js.Array[_] = js.native
  def getChildContext(): glDashReactLib.Anon_GlParentBus = js.native
  def getGLName(): java.lang.String = js.native
  def getGLRenderableContent(): js.Any = js.native
  def getGLRenderableNode(): Node = js.native
  def getGLShortName(): java.lang.String = js.native
  def onRef(ref: js.Any): scala.Unit = js.native
  def redraw(): scala.Unit = js.native
}

/* static members */
@JSImport("gl-react", "Bus")
@js.native
object Bus extends js.Object {
  var childContextTypes: glDashReactLib.Anon_GlParentAny = js.native
  var contextTypes: glDashReactLib.Anon_GlParentGlSurface = js.native
  var defaultProps: glDashReactLib.glDashReactMod.BusProps = js.native
}

