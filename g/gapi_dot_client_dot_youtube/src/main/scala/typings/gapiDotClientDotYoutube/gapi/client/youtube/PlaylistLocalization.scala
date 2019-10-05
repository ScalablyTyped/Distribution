package typings.gapiDotClientDotYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaylistLocalization extends js.Object {
  /** The localized strings for playlist's description. */
  var description: js.UndefOr[String] = js.undefined
  /** The localized strings for playlist's title. */
  var title: js.UndefOr[String] = js.undefined
}

object PlaylistLocalization {
  @scala.inline
  def apply(description: String = null, title: String = null): PlaylistLocalization = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[PlaylistLocalization]
  }
}

