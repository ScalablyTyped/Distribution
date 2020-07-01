package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IfGenerationMatch extends js.Object {
  var ifGenerationMatch: js.UndefOr[String] = js.native
}

object IfGenerationMatch {
  @scala.inline
  def apply(ifGenerationMatch: String = null): IfGenerationMatch = {
    val __obj = js.Dynamic.literal()
    if (ifGenerationMatch != null) __obj.updateDynamic("ifGenerationMatch")(ifGenerationMatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[IfGenerationMatch]
  }
}

