package typings
package gapiDotClientDotCustomsearchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HtmlTitle extends js.Object {
  var htmlTitle: js.UndefOr[java.lang.String] = js.undefined
  var link: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_HtmlTitle {
  @scala.inline
  def apply(
    htmlTitle: java.lang.String = null,
    link: java.lang.String = null,
    title: java.lang.String = null,
    url: java.lang.String = null
  ): Anon_HtmlTitle = {
    val __obj = js.Dynamic.literal()
    if (htmlTitle != null) __obj.updateDynamic("htmlTitle")(htmlTitle)
    if (link != null) __obj.updateDynamic("link")(link)
    if (title != null) __obj.updateDynamic("title")(title)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Anon_HtmlTitle]
  }
}

