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
    val __obj = js.Dynamic.literal(id = id, level = level, order = order, title = title)
    if (href != null) __obj.updateDynamic("href")(href)
    __obj.asInstanceOf[TocElement]
  }
}

