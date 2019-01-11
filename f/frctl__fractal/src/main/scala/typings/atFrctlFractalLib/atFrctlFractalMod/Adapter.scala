package typings
package atFrctlFractalLib.atFrctlFractalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@frctl/fractal", "Adapter")
@js.native
abstract class Adapter[TEngine] protected ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(engine: TEngine, source: atFrctlFractalLib.atFrctlFractalMod.fractalNs.coreNs.entitiesNs.EntitySource[_, _]) = this()
  var _source: atFrctlFractalLib.atFrctlFractalMod.fractalNs.coreNs.entitiesNs.EntitySource[_, _] = js.native
  val engine: TEngine = js.native
  val views: js.Array[atFrctlFractalLib.Anon_Content] = js.native
  /* protected */ def _resolve[T](value: T): js.Promise[T] = js.native
  /* protected */ def _resolve[T](value: js.Thenable[T]): js.Promise[T] = js.native
  def getReferencesForView(handle: java.lang.String): js.Array[_] = js.native
  def getView(handle: java.lang.String): js.Any = js.native
  def load(): scala.Unit = js.native
  def render(path: java.lang.String, str: java.lang.String, context: js.Any, meta: js.Any): js.Promise[java.lang.String] = js.native
  def setHandlePrefix(prefix: java.lang.String): this.type = js.native
}

