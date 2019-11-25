package typings.atFormatjsIntlDashUtils.libListDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPattern extends js.Object {
  var end: String
  var middle: String
  var pair: String
  var start: String
}

object ListPattern {
  @scala.inline
  def apply(end: String, middle: String, pair: String, start: String): ListPattern = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], middle = middle.asInstanceOf[js.Any], pair = pair.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ListPattern]
  }
}

