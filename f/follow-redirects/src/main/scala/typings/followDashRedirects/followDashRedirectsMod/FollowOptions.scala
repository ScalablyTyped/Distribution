package typings.followDashRedirects.followDashRedirectsMod

import typings.followDashRedirects.Anon_Http
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FollowOptions[Options] extends js.Object {
  var agents: js.UndefOr[Anon_Http] = js.undefined
  var beforeRedirect: js.UndefOr[js.Function1[/* options */ Options with FollowOptions[Options], Unit]] = js.undefined
  var followRedirects: js.UndefOr[Boolean] = js.undefined
  var maxBodyLength: js.UndefOr[Double] = js.undefined
  var maxRedirects: js.UndefOr[Double] = js.undefined
  var trackRedirects: js.UndefOr[Boolean] = js.undefined
}

object FollowOptions {
  @scala.inline
  def apply[Options](
    agents: Anon_Http = null,
    beforeRedirect: /* options */ Options with FollowOptions[Options] => Unit = null,
    followRedirects: js.UndefOr[Boolean] = js.undefined,
    maxBodyLength: Int | Double = null,
    maxRedirects: Int | Double = null,
    trackRedirects: js.UndefOr[Boolean] = js.undefined
  ): FollowOptions[Options] = {
    val __obj = js.Dynamic.literal()
    if (agents != null) __obj.updateDynamic("agents")(agents)
    if (beforeRedirect != null) __obj.updateDynamic("beforeRedirect")(js.Any.fromFunction1(beforeRedirect))
    if (!js.isUndefined(followRedirects)) __obj.updateDynamic("followRedirects")(followRedirects)
    if (maxBodyLength != null) __obj.updateDynamic("maxBodyLength")(maxBodyLength.asInstanceOf[js.Any])
    if (maxRedirects != null) __obj.updateDynamic("maxRedirects")(maxRedirects.asInstanceOf[js.Any])
    if (!js.isUndefined(trackRedirects)) __obj.updateDynamic("trackRedirects")(trackRedirects)
    __obj.asInstanceOf[FollowOptions[Options]]
  }
}

