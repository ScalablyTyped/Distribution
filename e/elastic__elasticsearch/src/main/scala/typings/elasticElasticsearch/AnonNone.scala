package typings.elasticElasticsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNone extends js.Object {
  var none: Double
  var optimistic: Double
  var ping: Double
}

object AnonNone {
  @scala.inline
  def apply(none: Double, optimistic: Double, ping: Double): AnonNone = {
    val __obj = js.Dynamic.literal(none = none.asInstanceOf[js.Any], optimistic = optimistic.asInstanceOf[js.Any], ping = ping.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNone]
  }
}

