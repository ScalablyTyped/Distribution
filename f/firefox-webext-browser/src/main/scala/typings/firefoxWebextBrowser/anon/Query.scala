package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Query extends js.Object {
  /** A string of words and quoted phrases that are matched against bookmark URLs and titles. */
  var query: js.UndefOr[String] = js.undefined
  /** The title of the bookmark; matches verbatim. */
  var title: js.UndefOr[String] = js.undefined
  /** The URL of the bookmark; matches verbatim. Note that folders have no URL. */
  var url: js.UndefOr[String] = js.undefined
}

object Query {
  @scala.inline
  def apply(query: String = null, title: String = null, url: String = null): Query = {
    val __obj = js.Dynamic.literal()
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query]
  }
}

