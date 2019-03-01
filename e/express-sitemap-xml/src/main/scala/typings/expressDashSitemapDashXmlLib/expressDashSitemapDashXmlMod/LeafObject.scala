package typings
package expressDashSitemapDashXmlLib.expressDashSitemapDashXmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeafObject extends js.Object {
  var changeFreq: js.UndefOr[java.lang.String] = js.undefined
  var lastMod: js.UndefOr[java.lang.String | stdLib.Date] = js.undefined
  var url: java.lang.String
}

object LeafObject {
  @scala.inline
  def apply(
    url: java.lang.String,
    changeFreq: java.lang.String = null,
    lastMod: java.lang.String | stdLib.Date = null
  ): LeafObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("url")(url)
    if (changeFreq != null) __obj.updateDynamic("changeFreq")(changeFreq)
    if (lastMod != null) __obj.updateDynamic("lastMod")(lastMod.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeafObject]
  }
}

