package typings.giphyDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Count extends js.Object {
  var count: Double
  var offset: Double
  var total_count: Double
}

object Anon_Count {
  @scala.inline
  def apply(count: Double, offset: Double, total_count: Double): Anon_Count = {
    val __obj = js.Dynamic.literal(count = count, offset = offset, total_count = total_count)
  
    __obj.asInstanceOf[Anon_Count]
  }
}

