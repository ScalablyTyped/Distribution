package typings.frctlFractal.mod

import typings.frctlFractal.anon.Content
import typings.frctlFractal.mod.fractal.core.entities.EntitySource
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@frctl/fractal", "Adapter")
@js.native
abstract class Adapter[TEngine] protected () extends EventEmitter {
  def this(engine: TEngine, source: EntitySource[_, _]) = this()
  var _source: EntitySource[_, _] = js.native
  val engine: TEngine = js.native
  val views: js.Array[Content] = js.native
  /* protected */ def _resolve[T](value: T): js.Promise[T] = js.native
  /* protected */ def _resolve[T](value: js.Thenable[T]): js.Promise[T] = js.native
  def getReferencesForView(handle: String): js.Array[_] = js.native
  def getView(handle: String): js.Any = js.native
  def load(): Unit = js.native
  def render(path: String, str: String, context: js.Any, meta: js.Any): js.Promise[String] = js.native
  def setHandlePrefix(prefix: String): this.type = js.native
}

