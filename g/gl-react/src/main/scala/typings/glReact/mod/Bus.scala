package typings.glReact.mod

import typings.glReact.anon.GlParent
import typings.glReact.anon.GlParentAny
import typings.glReact.anon.GlParentBus
import typings.glReact.anon.GlSurface
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gl-react", "Bus")
@js.native
open class Bus protected ()
  extends Component[BusProps, js.Object, Any] {
  def this(props: BusProps) = this()
  /**
    * @deprecated
    * @see https://legacy.reactjs.org/docs/legacy-context.html
    */
  def this(props: BusProps, context: Any) = this()
  
  def capture(): js.Array[Any] = js.native
  def capture(x: Double): js.Array[Any] = js.native
  def capture(x: Double, y: Double): js.Array[Any] = js.native
  def capture(x: Double, y: Double, w: Double): js.Array[Any] = js.native
  def capture(x: Double, y: Double, w: Double, h: Double): js.Array[Any] = js.native
  def capture(x: Double, y: Double, w: Unit, h: Double): js.Array[Any] = js.native
  def capture(x: Double, y: Unit, w: Double): js.Array[Any] = js.native
  def capture(x: Double, y: Unit, w: Double, h: Double): js.Array[Any] = js.native
  def capture(x: Double, y: Unit, w: Unit, h: Double): js.Array[Any] = js.native
  def capture(x: Unit, y: Double): js.Array[Any] = js.native
  def capture(x: Unit, y: Double, w: Double): js.Array[Any] = js.native
  def capture(x: Unit, y: Double, w: Double, h: Double): js.Array[Any] = js.native
  def capture(x: Unit, y: Double, w: Unit, h: Double): js.Array[Any] = js.native
  def capture(x: Unit, y: Unit, w: Double): js.Array[Any] = js.native
  def capture(x: Unit, y: Unit, w: Double, h: Double): js.Array[Any] = js.native
  def capture(x: Unit, y: Unit, w: Unit, h: Double): js.Array[Any] = js.native
  
  @JSName("context")
  var context_Bus: GlParent = js.native
  
  var dependents: js.Array[Node | Surface[Any]] = js.native
  
  def getChildContext(): GlParentBus = js.native
  
  def getGLName(): String = js.native
  
  def getGLRenderableContent(): Any = js.native
  
  def getGLRenderableNode(): Node = js.native
  
  def getGLShortName(): String = js.native
  
  var glBusRootNode: Any = js.native
  
  var glNode: js.UndefOr[Node] = js.native
  
  var id: Double = js.native
  
  def onRef(ref: Any): Unit = js.native
  
  def redraw(): Unit = js.native
}
/* static members */
object Bus {
  
  @JSImport("gl-react", "Bus")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("gl-react", "Bus.childContextTypes")
  @js.native
  def childContextTypes: GlParentAny = js.native
  inline def childContextTypes_=(x: GlParentAny): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("childContextTypes")(x.asInstanceOf[js.Any])
  
  @JSImport("gl-react", "Bus.contextTypes")
  @js.native
  def contextTypes: GlSurface = js.native
  inline def contextTypes_=(x: GlSurface): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
  
  @JSImport("gl-react", "Bus.defaultProps")
  @js.native
  def defaultProps: BusProps = js.native
  inline def defaultProps_=(x: BusProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
