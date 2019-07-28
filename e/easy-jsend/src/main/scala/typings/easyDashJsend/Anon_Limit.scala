package typings.easyDashJsend

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Limit extends js.Object {
  var limit: Double
  var skip: Double
}

object Anon_Limit {
  @scala.inline
  def apply(limit: Double, skip: Double): Anon_Limit = {
    val __obj = js.Dynamic.literal(limit = limit, skip = skip)
  
    __obj.asInstanceOf[Anon_Limit]
  }
}

