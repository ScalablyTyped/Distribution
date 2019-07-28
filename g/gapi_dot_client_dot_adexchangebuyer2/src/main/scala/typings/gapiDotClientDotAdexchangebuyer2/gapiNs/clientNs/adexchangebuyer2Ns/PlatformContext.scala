package typings.gapiDotClientDotAdexchangebuyer2.gapiNs.clientNs.adexchangebuyer2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlatformContext extends js.Object {
  /** The platforms this restriction applies to. */
  var platforms: js.UndefOr[js.Array[String]] = js.undefined
}

object PlatformContext {
  @scala.inline
  def apply(platforms: js.Array[String] = null): PlatformContext = {
    val __obj = js.Dynamic.literal()
    if (platforms != null) __obj.updateDynamic("platforms")(platforms)
    __obj.asInstanceOf[PlatformContext]
  }
}

