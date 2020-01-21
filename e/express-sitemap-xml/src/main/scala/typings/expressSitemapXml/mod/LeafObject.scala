package typings.expressSitemapXml.mod

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
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (changeFreq != null) __obj.updateDynamic("changeFreq")(changeFreq.asInstanceOf[js.Any])
    if (lastMod != null) __obj.updateDynamic("lastMod")(lastMod.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeafObject]
  }
}

