package typings.dockerode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRefCount extends js.Object {
  var RefCount: Double
  var Size: Double
}

object AnonRefCount {
  @scala.inline
  def apply(RefCount: Double, Size: Double): AnonRefCount = {
    val __obj = js.Dynamic.literal(RefCount = RefCount.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRefCount]
  }
}

