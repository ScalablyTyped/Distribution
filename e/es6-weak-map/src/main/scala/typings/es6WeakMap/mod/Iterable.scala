package typings.es6WeakMap.mod

import typings.std.Iterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Iterable[T] extends js.Object {
  
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[Iterator[T, _, js.UndefOr[scala.Nothing]]] = js.native
}
