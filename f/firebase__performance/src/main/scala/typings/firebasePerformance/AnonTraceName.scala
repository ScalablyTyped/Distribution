package typings.firebasePerformance

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTraceName extends js.Object {
  var traceName: String
}

object AnonTraceName {
  @scala.inline
  def apply(traceName: String): AnonTraceName = {
    val __obj = js.Dynamic.literal(traceName = traceName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonTraceName]
  }
}

