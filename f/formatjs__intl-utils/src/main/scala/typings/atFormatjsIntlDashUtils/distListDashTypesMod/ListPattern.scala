package typings.atFormatjsIntlDashUtils.distListDashTypesMod

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
    val __obj = js.Dynamic.literal(end = end, middle = middle, pair = pair, start = start)
  
    __obj.asInstanceOf[ListPattern]
  }
}

