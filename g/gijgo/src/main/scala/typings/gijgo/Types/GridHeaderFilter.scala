package typings.gijgo.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridHeaderFilter extends js.Object {
  var `type`: String
}

object GridHeaderFilter {
  @scala.inline
  def apply(`type`: String): GridHeaderFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridHeaderFilter]
  }
}

