package typings.elasticElasticsearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ALIVE extends js.Object {
  var ALIVE: String
  var DEAD: String
}

object ALIVE {
  @scala.inline
  def apply(ALIVE: String, DEAD: String): ALIVE = {
    val __obj = js.Dynamic.literal(ALIVE = ALIVE.asInstanceOf[js.Any], DEAD = DEAD.asInstanceOf[js.Any])
    __obj.asInstanceOf[ALIVE]
  }
}

