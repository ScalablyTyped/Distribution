package typings.firebasePerformance.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TraceName extends js.Object {
  var traceName: String
}

object TraceName {
  @scala.inline
  def apply(traceName: String): TraceName = {
    val __obj = js.Dynamic.literal(traceName = traceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TraceName]
  }
}

