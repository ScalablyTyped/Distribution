package typings.fb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeedDialogParams extends js.Object {
    // "feed"
  var app_id: String
  var caption: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var display: js.UndefOr[String] = js.undefined
  var from: js.UndefOr[String] = js.undefined
  var link: js.UndefOr[String] = js.undefined
  var method: String
  var name: String
  var picture: js.UndefOr[String] = js.undefined
  var redirect_uri: js.UndefOr[String] = js.undefined
  var ref: js.UndefOr[js.Any] = js.undefined
  var source: js.UndefOr[String] = js.undefined
  var to: js.UndefOr[String] = js.undefined
}

object FeedDialogParams {
  @scala.inline
  def apply(
    app_id: String,
    method: String,
    name: String,
    caption: String = null,
    description: String = null,
    display: String = null,
    from: String = null,
    link: String = null,
    picture: String = null,
    redirect_uri: String = null,
    ref: js.Any = null,
    source: String = null,
    to: String = null
  ): FeedDialogParams = {
    val __obj = js.Dynamic.literal(app_id = app_id, method = method, name = name)
    if (caption != null) __obj.updateDynamic("caption")(caption)
    if (description != null) __obj.updateDynamic("description")(description)
    if (display != null) __obj.updateDynamic("display")(display)
    if (from != null) __obj.updateDynamic("from")(from)
    if (link != null) __obj.updateDynamic("link")(link)
    if (picture != null) __obj.updateDynamic("picture")(picture)
    if (redirect_uri != null) __obj.updateDynamic("redirect_uri")(redirect_uri)
    if (ref != null) __obj.updateDynamic("ref")(ref)
    if (source != null) __obj.updateDynamic("source")(source)
    if (to != null) __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[FeedDialogParams]
  }
}

