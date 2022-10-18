package typings.frctlFractal.mod

import typings.frctlFractal.anon.Content
import typings.frctlFractal.mod.fractal.core.entities.EntitySource
import typings.node.eventsMod.EventEmitter
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("@frctl/fractal", "Adapter")
@js.native
open class Adapter[TEngine] protected () extends EventEmitter {
  def this(engine: TEngine, source: EntitySource[Any, Any]) = this()
  
  /* protected */ def _resolve[T](value: T): js.Promise[T] = js.native
  /* protected */ def _resolve[T](value: PromiseLike[T]): js.Promise[T] = js.native
  
  /* protected */ var _source: EntitySource[Any, Any] = js.native
  
  val engine: TEngine = js.native
  
  def getReferencesForView(handle: String): js.Array[Any] = js.native
  
  def getView(handle: String): Any = js.native
  
  def load(): Unit = js.native
  
  def render(path: String, str: String, context: Any, meta: Any): js.Promise[String] = js.native
  
  def setHandlePrefix(prefix: String): this.type = js.native
  
  val views: js.Array[Content] = js.native
}
