package typings.ffmpeg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  title  :string,   author  :string,   copyright  :string,   comment  :string,   rating  :string}> */
trait WMVMetadata extends js.Object {
  var author: js.UndefOr[String] = js.undefined
  var comment: js.UndefOr[String] = js.undefined
  var copyright: js.UndefOr[String] = js.undefined
  var rating: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object WMVMetadata {
  @scala.inline
  def apply(
    author: String = null,
    comment: String = null,
    copyright: String = null,
    rating: String = null,
    title: String = null
  ): WMVMetadata = {
    val __obj = js.Dynamic.literal()
    if (author != null) __obj.updateDynamic("author")(author.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (copyright != null) __obj.updateDynamic("copyright")(copyright.asInstanceOf[js.Any])
    if (rating != null) __obj.updateDynamic("rating")(rating.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[WMVMetadata]
  }
}

