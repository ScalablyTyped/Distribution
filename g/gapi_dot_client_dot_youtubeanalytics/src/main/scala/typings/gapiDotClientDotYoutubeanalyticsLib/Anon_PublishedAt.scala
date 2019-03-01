package typings
package gapiDotClientDotYoutubeanalyticsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PublishedAt extends js.Object {
  var publishedAt: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_PublishedAt {
  @scala.inline
  def apply(publishedAt: java.lang.String = null, title: java.lang.String = null): Anon_PublishedAt = {
    val __obj = js.Dynamic.literal()
    if (publishedAt != null) __obj.updateDynamic("publishedAt")(publishedAt)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Anon_PublishedAt]
  }
}

