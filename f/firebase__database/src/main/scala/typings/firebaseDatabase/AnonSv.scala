package typings.firebaseDatabase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSv extends js.Object {
  @JSName(".sv")
  var Dotsv: String
}

object AnonSv {
  @scala.inline
  def apply(Dotsv: String): AnonSv = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic(".sv")(Dotsv.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSv]
  }
}

