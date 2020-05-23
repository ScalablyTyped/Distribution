package typings.firebaseDatabase.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sv extends js.Object {
  @JSName(".sv")
  var Dotsv: String
}

object Sv {
  @scala.inline
  def apply(Dotsv: String): Sv = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic(".sv")(Dotsv.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sv]
  }
}

