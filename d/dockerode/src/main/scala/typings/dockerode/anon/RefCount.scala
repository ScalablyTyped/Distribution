package typings.dockerode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefCount extends js.Object {
  var RefCount: Double
  var Size: Double
}

object RefCount {
  @scala.inline
  def apply(RefCount: Double, Size: Double): RefCount = {
    val __obj = js.Dynamic.literal(RefCount = RefCount.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefCount]
  }
}

