package typings.gapiDotClientDotYoutubeanalytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PublishedAt extends js.Object {
  var publishedAt: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object Anon_PublishedAt {
  @scala.inline
  def apply(publishedAt: String = null, title: String = null): Anon_PublishedAt = {
    val __obj = js.Dynamic.literal()
    if (publishedAt != null) __obj.updateDynamic("publishedAt")(publishedAt)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Anon_PublishedAt]
  }
}

