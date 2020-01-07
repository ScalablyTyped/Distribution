package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Explanation extends js.Object {
  var explanation: js.UndefOr[String] = js.native
}

object Anon_Explanation {
  @scala.inline
  def apply(explanation: String = null): Anon_Explanation = {
    val __obj = js.Dynamic.literal()
    if (explanation != null) __obj.updateDynamic("explanation")(explanation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Explanation]
  }
}

