package typings
package followDashRedirectsLib.followDashRedirectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FollowOptions extends js.Object {
  var maxBodyLength: js.UndefOr[scala.Double] = js.undefined
  var maxRedirects: js.UndefOr[scala.Double] = js.undefined
}

object FollowOptions {
  @scala.inline
  def apply(maxBodyLength: scala.Int | scala.Double = null, maxRedirects: scala.Int | scala.Double = null): FollowOptions = {
    val __obj = js.Dynamic.literal()
    if (maxBodyLength != null) __obj.updateDynamic("maxBodyLength")(maxBodyLength.asInstanceOf[js.Any])
    if (maxRedirects != null) __obj.updateDynamic("maxRedirects")(maxRedirects.asInstanceOf[js.Any])
    __obj.asInstanceOf[FollowOptions]
  }
}

