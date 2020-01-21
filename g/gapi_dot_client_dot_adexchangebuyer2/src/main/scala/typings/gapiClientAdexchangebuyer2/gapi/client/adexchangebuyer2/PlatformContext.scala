package typings.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

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
    if (platforms != null) __obj.updateDynamic("platforms")(platforms.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlatformContext]
  }
}

