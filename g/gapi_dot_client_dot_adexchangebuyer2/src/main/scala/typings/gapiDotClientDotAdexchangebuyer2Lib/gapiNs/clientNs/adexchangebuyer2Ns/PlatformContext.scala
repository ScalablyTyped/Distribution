package typings
package gapiDotClientDotAdexchangebuyer2Lib.gapiNs.clientNs.adexchangebuyer2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlatformContext extends js.Object {
  /** The platforms this restriction applies to. */
  var platforms: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object PlatformContext {
  @scala.inline
  def apply(platforms: js.Array[java.lang.String] = null): PlatformContext = {
    val __obj = js.Dynamic.literal()
    if (platforms != null) __obj.updateDynamic("platforms")(platforms)
    __obj.asInstanceOf[PlatformContext]
  }
}

