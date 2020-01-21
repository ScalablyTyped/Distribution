package typings.firebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNanos extends js.Object {
  var nanos: Double
  var seconds: String
}

object AnonNanos {
  @scala.inline
  def apply(nanos: Double, seconds: String): AnonNanos = {
    val __obj = js.Dynamic.literal(nanos = nanos.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNanos]
  }
}

