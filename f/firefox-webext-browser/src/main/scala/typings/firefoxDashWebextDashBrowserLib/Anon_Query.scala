package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Query extends js.Object {
  /** A string of words and quoted phrases that are matched against bookmark URLs and titles. */
  var query: js.UndefOr[java.lang.String] = js.undefined
  /** The title of the bookmark; matches verbatim. */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /** The URL of the bookmark; matches verbatim. Note that folders have no URL. */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Query {
  @scala.inline
  def apply(query: java.lang.String = null, title: java.lang.String = null, url: java.lang.String = null): Anon_Query = {
    val __obj = js.Dynamic.literal()
    if (query != null) __obj.updateDynamic("query")(query)
    if (title != null) __obj.updateDynamic("title")(title)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Anon_Query]
  }
}

