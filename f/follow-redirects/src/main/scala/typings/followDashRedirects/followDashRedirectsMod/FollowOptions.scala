package typings.followDashRedirects.followDashRedirectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FollowOptions extends js.Object {
  var maxBodyLength: js.UndefOr[Double] = js.undefined
  var maxRedirects: js.UndefOr[Double] = js.undefined
}

object FollowOptions {
  @scala.inline
  def apply(maxBodyLength: Int | Double = null, maxRedirects: Int | Double = null): FollowOptions = {
    val __obj = js.Dynamic.literal()
    if (maxBodyLength != null) __obj.updateDynamic("maxBodyLength")(maxBodyLength.asInstanceOf[js.Any])
    if (maxRedirects != null) __obj.updateDynamic("maxRedirects")(maxRedirects.asInstanceOf[js.Any])
    __obj.asInstanceOf[FollowOptions]
  }
}

