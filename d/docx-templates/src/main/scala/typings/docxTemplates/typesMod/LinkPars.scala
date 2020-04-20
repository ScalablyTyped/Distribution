package typings.docxTemplates.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkPars extends js.Object {
  var label: js.UndefOr[String] = js.undefined
  var url: String
}

object LinkPars {
  @scala.inline
  def apply(url: String, label: String = null): LinkPars = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkPars]
  }
}

