package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Explanation extends js.Object {
  var explanation: js.UndefOr[String] = js.native
}

object Explanation {
  @scala.inline
  def apply(explanation: String = null): Explanation = {
    val __obj = js.Dynamic.literal()
    if (explanation != null) __obj.updateDynamic("explanation")(explanation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Explanation]
  }
}

