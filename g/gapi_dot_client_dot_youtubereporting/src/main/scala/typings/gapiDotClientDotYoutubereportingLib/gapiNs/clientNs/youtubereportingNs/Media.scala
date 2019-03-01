package typings
package gapiDotClientDotYoutubereportingLib.gapiNs.clientNs.youtubereportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Media extends js.Object {
  /** Name of the media resource. */
  var resourceName: js.UndefOr[java.lang.String] = js.undefined
}

object Media {
  @scala.inline
  def apply(resourceName: java.lang.String = null): Media = {
    val __obj = js.Dynamic.literal()
    if (resourceName != null) __obj.updateDynamic("resourceName")(resourceName)
    __obj.asInstanceOf[Media]
  }
}

