package typings.gamedig.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryResult extends js.Object {
  var bots: js.Array[Player]
  var map: String
  var maxplayers: Double
  var name: String
  var notes: js.Object
  var password: Boolean
  var players: js.Array[Player]
  var query: js.UndefOr[js.Object] = js.undefined
  var raw: js.UndefOr[js.Object] = js.undefined
}

object QueryResult {
  @scala.inline
  def apply(
    bots: js.Array[Player],
    map: String,
    maxplayers: Double,
    name: String,
    notes: js.Object,
    password: Boolean,
    players: js.Array[Player],
    query: js.Object = null,
    raw: js.Object = null
  ): QueryResult = {
    val __obj = js.Dynamic.literal(bots = bots.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], maxplayers = maxplayers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], notes = notes.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], players = players.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (raw != null) __obj.updateDynamic("raw")(raw.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryResult]
  }
}

