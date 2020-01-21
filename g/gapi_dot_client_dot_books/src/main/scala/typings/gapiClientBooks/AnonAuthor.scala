package typings.gapiClientBooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAuthor extends js.Object {
  var author: js.UndefOr[String] = js.undefined
  var canonicalVolumeLink: js.UndefOr[String] = js.undefined
  var coverUrl: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var volumeId: js.UndefOr[String] = js.undefined
}

object AnonAuthor {
  @scala.inline
  def apply(
    author: String = null,
    canonicalVolumeLink: String = null,
    coverUrl: String = null,
    description: String = null,
    title: String = null,
    volumeId: String = null
  ): AnonAuthor = {
    val __obj = js.Dynamic.literal()
    if (author != null) __obj.updateDynamic("author")(author.asInstanceOf[js.Any])
    if (canonicalVolumeLink != null) __obj.updateDynamic("canonicalVolumeLink")(canonicalVolumeLink.asInstanceOf[js.Any])
    if (coverUrl != null) __obj.updateDynamic("coverUrl")(coverUrl.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (volumeId != null) __obj.updateDynamic("volumeId")(volumeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAuthor]
  }
}

