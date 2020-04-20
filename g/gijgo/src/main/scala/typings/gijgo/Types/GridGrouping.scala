package typings.gijgo.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridGrouping extends js.Object {
  var groupBy: String
}

object GridGrouping {
  @scala.inline
  def apply(groupBy: String): GridGrouping = {
    val __obj = js.Dynamic.literal(groupBy = groupBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridGrouping]
  }
}

