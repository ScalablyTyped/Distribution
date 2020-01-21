package typings.getenv.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("getenv", "disableFallbacks")
@js.native
object disableFallbacks extends js.Object {
  /**
    * Disallows fallbacks in environments where you don't want to rely on brittle development
    * defaults (e.g production, integration testing). For example, to disable fallbacks if we
    * indicate production via `NODE_ENV`:
    * ```
    *   if (process.env.NODE_ENV === 'production') {
    *     getenv.disableFallbacks();
    *   }
    * ```
    */
  def apply(): Unit = js.native
}

