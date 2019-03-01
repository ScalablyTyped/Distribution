package typings
package gapiDotClientDotBooksLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Author extends js.Object {
  var author: js.UndefOr[java.lang.String] = js.undefined
  var canonicalVolumeLink: js.UndefOr[java.lang.String] = js.undefined
  var coverUrl: js.UndefOr[java.lang.String] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var volumeId: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Author {
  @scala.inline
  def apply(
    author: java.lang.String = null,
    canonicalVolumeLink: java.lang.String = null,
    coverUrl: java.lang.String = null,
    description: java.lang.String = null,
    title: java.lang.String = null,
    volumeId: java.lang.String = null
  ): Anon_Author = {
    val __obj = js.Dynamic.literal()
    if (author != null) __obj.updateDynamic("author")(author)
    if (canonicalVolumeLink != null) __obj.updateDynamic("canonicalVolumeLink")(canonicalVolumeLink)
    if (coverUrl != null) __obj.updateDynamic("coverUrl")(coverUrl)
    if (description != null) __obj.updateDynamic("description")(description)
    if (title != null) __obj.updateDynamic("title")(title)
    if (volumeId != null) __obj.updateDynamic("volumeId")(volumeId)
    __obj.asInstanceOf[Anon_Author]
  }
}

