package typings.googleDashAppsDashScript.GoogleAppsScriptNs.ClassroomNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YouTubeVideo extends js.Object {
  var alternateLink: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var thumbnailUrl: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object YouTubeVideo {
  @scala.inline
  def apply(alternateLink: String = null, id: String = null, thumbnailUrl: String = null, title: String = null): YouTubeVideo = {
    val __obj = js.Dynamic.literal()
    if (alternateLink != null) __obj.updateDynamic("alternateLink")(alternateLink)
    if (id != null) __obj.updateDynamic("id")(id)
    if (thumbnailUrl != null) __obj.updateDynamic("thumbnailUrl")(thumbnailUrl)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[YouTubeVideo]
  }
}

