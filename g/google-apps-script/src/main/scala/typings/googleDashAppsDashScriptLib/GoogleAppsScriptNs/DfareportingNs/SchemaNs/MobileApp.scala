package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MobileApp extends js.Object {
  var directory: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var publisherName: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object MobileApp {
  @scala.inline
  def apply(
    directory: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    publisherName: java.lang.String = null,
    title: java.lang.String = null
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

