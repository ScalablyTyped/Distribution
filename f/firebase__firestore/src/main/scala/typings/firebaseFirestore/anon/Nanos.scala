package typings.firebaseFirestore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Nanos extends js.Object {
  var nanos: Double
  var seconds: Double
}

object Nanos {
  @scala.inline
  def apply(nanos: Double, seconds: Double): Nanos = {
    val __obj = js.Dynamic.literal(nanos = nanos.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nanos]
  }
}

