package typings.easyDashXDashHeaders

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HeapTotal extends js.Object {
  var heapTotal: Double
  var heapUsed: Double
  var rss: Double
}

object Anon_HeapTotal {
  @scala.inline
  def apply(heapTotal: Double, heapUsed: Double, rss: Double): Anon_HeapTotal = {
    val __obj = js.Dynamic.literal(heapTotal = heapTotal.asInstanceOf[js.Any], heapUsed = heapUsed.asInstanceOf[js.Any], rss = rss.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_HeapTotal]
  }
}

