package typings.elasticsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBulk extends js.Object {
  var bulk: Double
  var search: Double
}

object AnonBulk {
  @scala.inline
  def apply(bulk: Double, search: Double): AnonBulk = {
    val __obj = js.Dynamic.literal(bulk = bulk.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBulk]
  }
}

