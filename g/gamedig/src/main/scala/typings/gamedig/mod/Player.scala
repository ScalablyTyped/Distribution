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
    ping: Int | Double = null,
    score: Int | Double = null,
    team: String = null
  ): Player = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (ping != null) __obj.updateDynamic("ping")(ping.asInstanceOf[js.Any])
    if (score != null) __obj.updateDynamic("score")(score.asInstanceOf[js.Any])
    if (team != null) __obj.updateDynamic("team")(team.asInstanceOf[js.Any])
    __obj.asInstanceOf[Player]
  }
}

