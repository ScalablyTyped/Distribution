package typings
package epubLib.epubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TocElement extends js.Object {
  var href: js.UndefOr[java.lang.String] = js.undefined
  var id: java.lang.String
  var level: scala.Double
  var order: scala.Double
  var title: java.lang.String
}

object TocElement {
  @scala.inline
  def apply(
    id: java.lang.String,
    level: scala.Double,
    order: scala.Double,
    title: java.lang.String,
    href: java.lang.String = null
  ): TocElement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("level")(level)
    __obj.updateDynamic("order")(order)
    __obj.updateDynamic("title")(title)
    if (href != null) __obj.updateDynamic("href")(href)
    __obj.asInstanceOf[TocElement]
  }
}

