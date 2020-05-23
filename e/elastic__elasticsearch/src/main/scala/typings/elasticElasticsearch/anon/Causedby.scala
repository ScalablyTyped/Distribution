package typings.elasticElasticsearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Causedby extends js.Object {
  var caused_by: Reason
  var reason: String
  var `type`: String
}

object Causedby {
  @scala.inline
  def apply(caused_by: Reason, reason: String, `type`: String): Causedby = {
    val __obj = js.Dynamic.literal(caused_by = caused_by.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Causedby]
  }
}

