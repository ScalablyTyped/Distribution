package typings.gamedig.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Player extends js.Object {
  var address: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var ping: js.UndefOr[Double] = js.undefined
  var score: js.UndefOr[Double] = js.undefined
  var team: js.UndefOr[String] = js.undefined
}

object Player {
  @scala.inline
  def apply(
    address: String = null,
    name: String = null,
    ping: js.UndefOr[Double] = js.undefined,
    score: js.UndefOr[Double] = js.undefined,
    team: String = null
  ): Player = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(ping)) __obj.updateDynamic("ping")(ping.get.asInstanceOf[js.Any])
    if (!js.isUndefined(score)) __obj.updateDynamic("score")(score.get.asInstanceOf[js.Any])
    if (team != null) __obj.updateDynamic("team")(team.asInstanceOf[js.Any])
    __obj.asInstanceOf[Player]
  }
}

