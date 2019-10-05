package typings.googleDashAppsDashScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaylistPlayer extends js.Object {
  var embedHtml: js.UndefOr[String] = js.undefined
}

object PlaylistPlayer {
  @scala.inline
  def apply(embedHtml: String = null): PlaylistPlayer = {
    val __obj = js.Dynamic.literal()
    if (embedHtml != null) __obj.updateDynamic("embedHtml")(embedHtml)
    __obj.asInstanceOf[PlaylistPlayer]
  }
}

