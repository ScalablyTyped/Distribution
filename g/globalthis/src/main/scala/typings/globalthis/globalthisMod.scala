package typings.globalthis

import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("globalthis", JSImport.Namespace)
@js.native
object globalthisMod extends js.Object {
  /**
  	 * The `globalThis` object.
  	 */
  val implementation: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof globalThis */ js.Any = js.native
  def apply(): js.Any = js.native
  /**
  	 * Gets the `globalThis` object.
  	 */
  def getPolyfill(): ReturnType[
    js.Function0[
      /* import warning: ImportType.apply Failed type conversion: typeof implementation */ js.Any
    ]
  ] = js.native
  /**
  	 * Installs the `globalThis` property onto the global object.
  	 */
  def shim(): ReturnType[
    js.Function0[
      /* import warning: ImportType.apply Failed type conversion: typeof implementation */ js.Any
    ]
  ] = js.native
}

