package typings.gapiDotClientDotCustomsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HtmlTitle extends js.Object {
  var htmlTitle: js.UndefOr[String] = js.undefined
  var link: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object Anon_HtmlTitle {
  @scala.inline
  def apply(htmlTitle: String = null, link: String = null, title: String = null, url: String = null): Anon_HtmlTitle = {
    val __obj = js.Dynamic.literal()
    if (htmlTitle != null) __obj.updateDynamic("htmlTitle")(htmlTitle)
    if (link != null) __obj.updateDynamic("link")(link)
    if (title != null) __obj.updateDynamic("title")(title)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Anon_HtmlTitle]
  }
}

