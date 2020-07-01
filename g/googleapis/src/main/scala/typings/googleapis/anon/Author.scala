package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Author extends js.Object {
  var author: js.UndefOr[String] = js.native
  var canonicalVolumeLink: js.UndefOr[String] = js.native
  var coverUrl: js.UndefOr[String] = js.native
  var description: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
  var volumeId: js.UndefOr[String] = js.native
}

object Author {
  @scala.inline
  def apply(
    author: String = null,
    canonicalVolumeLink: String = null,
    coverUrl: String = null,
    description: String = null,
    title: String = null,
    volumeId: String = null
  ): Author = {
    val __obj = js.Dynamic.literal()
    if (author != null) __obj.updateDynamic("author")(author.asInstanceOf[js.Any])
    if (canonicalVolumeLink != null) __obj.updateDynamic("canonicalVolumeLink")(canonicalVolumeLink.asInstanceOf[js.Any])
    if (coverUrl != null) __obj.updateDynamic("coverUrl")(coverUrl.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (volumeId != null) __obj.updateDynamic("volumeId")(volumeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Author]
  }
}

