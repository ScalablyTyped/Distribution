package typings.ejWebAll

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCount extends js.Object {
  var count: Double
  var result: js.Any
}

object AnonCount {
  @scala.inline
  def apply(count: Double, result: js.Any): AnonCount = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCount]
  }
}

