package typings.giphyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCount extends js.Object {
  var count: Double
  var offset: Double
  var total_count: Double
}

object AnonCount {
  @scala.inline
  def apply(count: Double, offset: Double, total_count: Double): AnonCount = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCount]
  }
}

