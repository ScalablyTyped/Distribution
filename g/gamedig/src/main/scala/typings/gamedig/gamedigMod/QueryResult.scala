package typings.gamedig.gamedigMod

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
    val __obj = js.Dynamic.literal(bots = bots, map = map, maxplayers = maxplayers, name = name, notes = notes, password = password, players = players)
    if (query != null) __obj.updateDynamic("query")(query)
    if (raw != null) __obj.updateDynamic("raw")(raw)
    __obj.asInstanceOf[QueryResult]
  }
}

