package typings.easyXHeaders

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHeapTotal extends js.Object {
  var heapTotal: Double
  var heapUsed: Double
  var rss: Double
}

object AnonHeapTotal {
  @scala.inline
  def apply(heapTotal: Double, heapUsed: Double, rss: Double): AnonHeapTotal = {
    val __obj = js.Dynamic.literal(heapTotal = heapTotal.asInstanceOf[js.Any], heapUsed = heapUsed.asInstanceOf[js.Any], rss = rss.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHeapTotal]
  }
}

