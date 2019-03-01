package typings
package gamedigLib.gamedigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryResult extends js.Object {
  var bots: js.Array[Player]
  var map: java.lang.String
  var maxplayers: scala.Double
  var name: java.lang.String
  var notes: js.Object
  var password: scala.Boolean
  var players: js.Array[Player]
  var query: js.UndefOr[js.Object] = js.undefined
  var raw: js.UndefOr[js.Object] = js.undefined
}

object QueryResult {
  @scala.inline
  def apply(
    bots: js.Array[Player],
    map: java.lang.String,
    maxplayers: scala.Double,
    name: java.lang.String,
    notes: js.Object,
    password: scala.Boolean,
    players: js.Array[Player],
    query: js.Object = null,
    raw: js.Object = null
  ): QueryResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bots")(bots)
    __obj.updateDynamic("map")(map)
    __obj.updateDynamic("maxplayers")(maxplayers)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("notes")(notes)
    __obj.updateDynamic("password")(password)
    __obj.updateDynamic("players")(players)
    if (query != null) __obj.updateDynamic("query")(query)
    if (raw != null) __obj.updateDynamic("raw")(raw)
    __obj.asInstanceOf[QueryResult]
  }
}

