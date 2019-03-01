package typings
package easyDashXDashHeadersLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HeapTotal extends js.Object {
  var heapTotal: scala.Double
  var heapUsed: scala.Double
  var rss: scala.Double
}

object Anon_HeapTotal {
  @scala.inline
  def apply(heapTotal: scala.Double, heapUsed: scala.Double, rss: scala.Double): Anon_HeapTotal = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("heapTotal")(heapTotal)
    __obj.updateDynamic("heapUsed")(heapUsed)
    __obj.updateDynamic("rss")(rss)
    __obj.asInstanceOf[Anon_HeapTotal]
  }
}

