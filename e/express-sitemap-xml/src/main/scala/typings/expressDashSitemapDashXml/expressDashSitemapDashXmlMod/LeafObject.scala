package typings.expressDashSitemapDashXml.expressDashSitemapDashXmlMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeafObject extends js.Object {
  var changeFreq: js.UndefOr[String] = js.undefined
  var lastMod: js.UndefOr[String | Date] = js.undefined
  var url: String
}

object LeafObject {
  @scala.inline
  def apply(url: String, changeFreq: String = null, lastMod: String | Date = null): LeafObject = {
    val __obj = js.Dynamic.literal(url = url)
    if (changeFreq != null) __obj.updateDynamic("changeFreq")(changeFreq)
    if (lastMod != null) __obj.updateDynamic("lastMod")(lastMod.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeafObject]
  }
}

