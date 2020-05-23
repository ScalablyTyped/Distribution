package typings.firebaseDatabase.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SvIncrement extends js.Object {
  @JSName(".sv")
  var Dotsv: Increment
}

object SvIncrement {
  @scala.inline
  def apply(Dotsv: Increment): SvIncrement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic(".sv")(Dotsv.asInstanceOf[js.Any])
    __obj.asInstanceOf[SvIncrement]
  }
}

