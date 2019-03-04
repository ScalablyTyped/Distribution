package typings
package giphyDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Count extends js.Object {
  var count: scala.Double
  var offset: scala.Double
  var total_count: scala.Double
}

object Anon_Count {
  @scala.inline
  def apply(count: scala.Double, offset: scala.Double, total_count: scala.Double): Anon_Count = {
    val __obj = js.Dynamic.literal(count = count, offset = offset, total_count = total_count)
  
    __obj.asInstanceOf[Anon_Count]
  }
}

