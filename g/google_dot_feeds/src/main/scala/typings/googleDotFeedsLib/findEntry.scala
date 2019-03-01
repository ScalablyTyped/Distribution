package typings
package googleDotFeedsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait findEntry extends js.Object {
  var contentSnippet: java.lang.String
  var link: java.lang.String
  var title: java.lang.String
  var url: java.lang.String
}

object findEntry {
  @scala.inline
  def apply(
    contentSnippet: java.lang.String,
    link: java.lang.String,
    title: java.lang.String,
    url: java.lang.String
  ): findEntry = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("contentSnippet")(contentSnippet)
    __obj.updateDynamic("link")(link)
    __obj.updateDynamic("title")(title)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[findEntry]
  }
}

