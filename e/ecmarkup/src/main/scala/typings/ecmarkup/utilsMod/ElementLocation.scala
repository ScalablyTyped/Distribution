package typings.ecmarkup.utilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementLocation extends js.Object {
  var endTag: Location | Null
  var startTag: Location
}

object ElementLocation {
  @scala.inline
  def apply(startTag: Location, endTag: Location = null): ElementLocation = {
    val __obj = js.Dynamic.literal(startTag = startTag.asInstanceOf[js.Any], endTag = endTag.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementLocation]
  }
}

