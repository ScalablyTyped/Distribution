package typings.followRedirects.mod

import typings.followRedirects.AnonHttp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FollowOptions[Options] extends js.Object {
  var agents: js.UndefOr[AnonHttp] = js.undefined
  var beforeRedirect: js.UndefOr[js.Function1[/* options */ Options with FollowOptions[Options], Unit]] = js.undefined
  var followRedirects: js.UndefOr[Boolean] = js.undefined
  var maxBodyLength: js.UndefOr[Double] = js.undefined
  var maxRedirects: js.UndefOr[Double] = js.undefined
  var trackRedirects: js.UndefOr[Boolean] = js.undefined
}

object FollowOptions {
  @scala.inline
  def apply[Options](
    agents: AnonHttp = null,
    beforeRedirect: /* options */ Options with FollowOptions[Options] => Unit = null,
    followRedirects: js.UndefOr[Boolean] = js.undefined,
    maxBodyLength: Int | Double = null,
    maxRedirects: Int | Double = null,
    trackRedirects: js.UndefOr[Boolean] = js.undefined
  ): FollowOptions[Options] = {
    val __obj = js.Dynamic.literal()
    if (agents != null) __obj.updateDynamic("agents")(agents.asInstanceOf[js.Any])
    if (beforeRedirect != null) __obj.updateDynamic("beforeRedirect")(js.Any.fromFunction1(beforeRedirect))
    if (!js.isUndefined(followRedirects)) __obj.updateDynamic("followRedirects")(followRedirects.asInstanceOf[js.Any])
    if (maxBodyLength != null) __obj.updateDynamic("maxBodyLength")(maxBodyLength.asInstanceOf[js.Any])
    if (maxRedirects != null) __obj.updateDynamic("maxRedirects")(maxRedirects.asInstanceOf[js.Any])
    if (!js.isUndefined(trackRedirects)) __obj.updateDynamic("trackRedirects")(trackRedirects.asInstanceOf[js.Any])
    __obj.asInstanceOf[FollowOptions[Options]]
  }
}

