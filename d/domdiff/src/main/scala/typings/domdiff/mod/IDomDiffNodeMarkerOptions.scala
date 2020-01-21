package typings.domdiff.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDomDiffNodeMarkerOptions[T] extends js.Object {
  /**
    * A specific live node to use as boundary for all nodes operations.
    * With live nodes [a,d] and {before: d}, the operation [] => [b, c]
    * would place nodes right before d, resulting a live collection of [a, b, c, d].
    * 
    * `before` doesn't necessarily have to be a node
    */
  var before: T
}

object IDomDiffNodeMarkerOptions {
  @scala.inline
  def apply[T](before: T): IDomDiffNodeMarkerOptions[T] = {
    val __obj = js.Dynamic.literal(before = before.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IDomDiffNodeMarkerOptions[T]]
  }
}

