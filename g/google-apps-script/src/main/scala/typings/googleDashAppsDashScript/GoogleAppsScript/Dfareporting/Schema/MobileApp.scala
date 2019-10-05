package typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MobileApp extends js.Object {
  var directory: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var publisherName: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object MobileApp {
  @scala.inline
  def apply(
    directory: String = null,
    id: String = null,
    kind: String = null,
    publisherName: String = null,
    title: String = null
  ): MobileApp = {
    val __obj = js.Dynamic.literal()
    if (directory != null) __obj.updateDynamic("directory")(directory)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (publisherName != null) __obj.updateDynamic("publisherName")(publisherName)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[MobileApp]
  }
}

