package typings
package gamedigLib.gamedigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Player extends js.Object {
  var address: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var ping: js.UndefOr[scala.Double] = js.undefined
  var score: js.UndefOr[scala.Double] = js.undefined
  var team: js.UndefOr[java.lang.String] = js.undefined
}

object Player {
  @scala.inline
  def apply(
    address: java.lang.String = null,
    name: java.lang.String = null,
    ping: scala.Int | scala.Double = null,
    score: scala.Int | scala.Double = null,
    team: java.lang.String = null
  ): Player = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address)
    if (name != null) __obj.updateDynamic("name")(name)
    if (ping != null) __obj.updateDynamic("ping")(ping.asInstanceOf[js.Any])
    if (score != null) __obj.updateDynamic("score")(score.asInstanceOf[js.Any])
    if (team != null) __obj.updateDynamic("team")(team)
    __obj.asInstanceOf[Player]
  }
}

