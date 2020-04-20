package typings.docxTemplates

import typings.docxTemplates.typesMod.BufferStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonWp extends js.Object {
  @JSName("w:p")
  var wColonp: BufferStatus
  @JSName("w:tr")
  var wColontr: BufferStatus
}

object AnonWp {
  @scala.inline
  def apply(wColonp: BufferStatus, wColontr: BufferStatus): AnonWp = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("w:p")(wColonp.asInstanceOf[js.Any])
    __obj.updateDynamic("w:tr")(wColontr.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonWp]
  }
}

