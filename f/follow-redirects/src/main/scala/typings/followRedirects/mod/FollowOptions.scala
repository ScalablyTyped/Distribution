package typings.followRedirects.mod

import typings.followRedirects.anon.Http
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FollowOptions[Options] extends js.Object {
  var agents: js.UndefOr[Http] = js.undefined
  var beforeRedirect: js.UndefOr[js.Function1[/* options */ Options with FollowOptions[Options], Unit]] = js.undefined
  var followRedirects: js.UndefOr[Boolean] = js.undefined
  var maxBodyLength: js.UndefOr[Double] = js.undefined
  var maxRedirects: js.UndefOr[Double] = js.undefined
  var trackRedirects: js.UndefOr[Boolean] = js.undefined
}

object FollowOptions {
  @scala.inline
  def apply[Options](
    agents: Http = null,
    beforeRedirect: /* options */ Options with FollowOptions[Options] => Unit = null,
    followRedirects: js.UndefOr[Boolean] = js.undefined,
    maxBodyLength: js.UndefOr[Double] = js.undefined,
    maxRedirects: js.UndefOr[Double] = js.undefined,
    trackRedirects: js.UndefOr[Boolean] = js.undefined
  ): FollowOptions[Options] = {
    val __obj = js.Dynamic.literal()
    if (agents != null) __obj.updateDynamic("agents")(agents.asInstanceOf[js.Any])
    if (beforeRedirect != null) __obj.updateDynamic("beforeRedirect")(js.Any.fromFunction1(beforeRedirect))
    if (!js.isUndefined(followRedirects)) __obj.updateDynamic("followRedirects")(followRedirects.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxBodyLength)) __obj.updateDynamic("maxBodyLength")(maxBodyLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRedirects)) __obj.updateDynamic("maxRedirects")(maxRedirects.get.asInstanceOf[js.Any])
    if (!js.isUndefined(trackRedirects)) __obj.updateDynamic("trackRedirects")(trackRedirects.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FollowOptions[Options]]
  }
}

