package typings.epub.epubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TocElement extends js.Object {
  var href: js.UndefOr[String] = js.undefined
  var id: String
  var level: Double
  var order: Double
  var title: String
}

object TocElement {
  @scala.inline
  def apply(id: String, level: Double, order: Double, title: String, href: String = null): TocElement = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    __obj.asInstanceOf[TocElement]
  }
}

