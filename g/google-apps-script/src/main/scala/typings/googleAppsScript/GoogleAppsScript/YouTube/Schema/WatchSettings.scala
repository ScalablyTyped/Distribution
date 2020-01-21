package typings.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WatchSettings extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.undefined
  var featuredPlaylistId: js.UndefOr[String] = js.undefined
  var textColor: js.UndefOr[String] = js.undefined
}

object WatchSettings {
  @scala.inline
  def apply(backgroundColor: String = null, featuredPlaylistId: String = null, textColor: String = null): WatchSettings = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (featuredPlaylistId != null) __obj.updateDynamic("featuredPlaylistId")(featuredPlaylistId.asInstanceOf[js.Any])
    if (textColor != null) __obj.updateDynamic("textColor")(textColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatchSettings]
  }
}

