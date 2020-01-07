package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_IfGenerationMatch extends js.Object {
  var ifGenerationMatch: js.UndefOr[String] = js.native
}

object Anon_IfGenerationMatch {
  @scala.inline
  def apply(ifGenerationMatch: String = null): Anon_IfGenerationMatch = {
    val __obj = js.Dynamic.literal()
    if (ifGenerationMatch != null) __obj.updateDynamic("ifGenerationMatch")(ifGenerationMatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IfGenerationMatch]
  }
}

