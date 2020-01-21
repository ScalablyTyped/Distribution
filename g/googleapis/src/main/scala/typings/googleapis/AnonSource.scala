package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSource extends js.Object {
  var source: js.UndefOr[AnonAttribution] = js.native
  var text: js.UndefOr[String] = js.native
}

object AnonSource {
  @scala.inline
  def apply(source: AnonAttribution = null, text: String = null): AnonSource = {
    val __obj = js.Dynamic.literal()
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSource]
  }
}

