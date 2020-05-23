package typings.docxTemplates.anon

import typings.docxTemplates.typesMod.BufferStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Wp extends js.Object {
  @JSName("w:p")
  var wColonp: BufferStatus
  @JSName("w:tr")
  var wColontr: BufferStatus
}

object Wp {
  @scala.inline
  def apply(wColonp: BufferStatus, wColontr: BufferStatus): Wp = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("w:p")(wColonp.asInstanceOf[js.Any])
    __obj.updateDynamic("w:tr")(wColontr.asInstanceOf[js.Any])
    __obj.asInstanceOf[Wp]
  }
}

