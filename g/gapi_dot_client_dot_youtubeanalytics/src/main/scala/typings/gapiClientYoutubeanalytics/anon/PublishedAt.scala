package typings.gapiClientYoutubeanalytics.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublishedAt extends js.Object {
  var publishedAt: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object PublishedAt {
  @scala.inline
  def apply(publishedAt: String = null, title: String = null): PublishedAt = {
    val __obj = js.Dynamic.literal()
    if (publishedAt != null) __obj.updateDynamic("publishedAt")(publishedAt.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishedAt]
  }
}

