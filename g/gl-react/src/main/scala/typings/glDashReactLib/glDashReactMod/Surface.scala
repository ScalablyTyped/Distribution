package typings
package glDashReactLib.glDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gl-react", "Surface")
@js.native
class Surface[T] ()
  extends reactLib.reactMod.Component[SurfaceProps, SurfaceState, js.Any] {
  var buffer: stdLib.WebGLBuffer = js.native
  var gl: js.UndefOr[stdLib.WebGLRenderingContext] = js.native
  var glView: T = js.native
  var id: scala.Double = js.native
  var loaderResolver: js.UndefOr[js.Any] = js.native
  var root: Node = js.native
  var shaders: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  def capture(): js.Array[_] = js.native
  def capture(x: scala.Double): js.Array[_] = js.native
  def capture(x: scala.Double, y: scala.Double): js.Array[_] = js.native
  def capture(x: scala.Double, y: scala.Double, w: scala.Double): js.Array[_] = js.native
  def capture(x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double): js.Array[_] = js.native
  def captureAsBlob(args: js.Any*): js.Promise[stdLib.Blob] = js.native
  def captureAsDataURL(args: js.Any*): java.lang.String = js.native
  def flush(): scala.Unit = js.native
  def getEmptyTexture(): stdLib.WebGLTexture = js.native
  def getGLName(): java.lang.String = js.native
  def getGLShortName(): java.lang.String = js.native
  def getGLSize(): js.Tuple2[scala.Double, scala.Double] = js.native
  def getVisitors(): js.Array[Visitor] = js.native
  def glIsAvailable(): scala.Boolean = js.native
  def mapRenderableContent(inst: js.Any): js.Any = js.native
  def rebootForDebug(): scala.Unit = js.native
  def redraw(): scala.Unit = js.native
}

