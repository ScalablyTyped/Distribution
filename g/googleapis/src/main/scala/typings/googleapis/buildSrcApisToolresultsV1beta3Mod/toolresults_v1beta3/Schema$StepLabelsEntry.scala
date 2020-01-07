package typings.googleapis.buildSrcApisToolresultsV1beta3Mod.toolresults_v1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$StepLabelsEntry extends js.Object {
  var key: js.UndefOr[String] = js.native
  var value: js.UndefOr[String] = js.native
}

object Schema$StepLabelsEntry {
  @scala.inline
  def apply(key: String = null, value: String = null): Schema$StepLabelsEntry = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$StepLabelsEntry]
  }
}

