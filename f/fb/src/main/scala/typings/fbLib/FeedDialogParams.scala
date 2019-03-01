package typings
package fbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeedDialogParams extends js.Object {
    // "feed"
  var app_id: java.lang.String
  var caption: js.UndefOr[java.lang.String] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var display: js.UndefOr[java.lang.String] = js.undefined
  var from: js.UndefOr[java.lang.String] = js.undefined
  var link: js.UndefOr[java.lang.String] = js.undefined
  var method: java.lang.String
  var name: java.lang.String
  var picture: js.UndefOr[java.lang.String] = js.undefined
  var redirect_uri: js.UndefOr[java.lang.String] = js.undefined
  var ref: js.UndefOr[js.Any] = js.undefined
  var source: js.UndefOr[java.lang.String] = js.undefined
  var to: js.UndefOr[java.lang.String] = js.undefined
}

object FeedDialogParams {
  @scala.inline
  def apply(
    app_id: java.lang.String,
    method: java.lang.String,
    name: java.lang.String,
    caption: java.lang.String = null,
    description: java.lang.String = null,
    display: java.lang.String = null,
    from: java.lang.String = null,
    link: java.lang.String = null,
    picture: java.lang.String = null,
    redirect_uri: java.lang.String = null,
    ref: js.Any = null,
    source: java.lang.String = null,
    to: java.lang.String = null
  ): FeedDialogParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("app_id")(app_id)
    __obj.updateDynamic("method")(method)
    __obj.updateDynamic("name")(name)
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

