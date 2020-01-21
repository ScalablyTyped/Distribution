package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPublishedAt extends js.Object {
  var publishedAt: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
}

object AnonPublishedAt {
  @scala.inline
  def apply(publishedAt: String = null, title: String = null): AnonPublishedAt = {
    val __obj = js.Dynamic.literal()
    if (publishedAt != null) __obj.updateDynamic("publishedAt")(publishedAt.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPublishedAt]
  }
}

