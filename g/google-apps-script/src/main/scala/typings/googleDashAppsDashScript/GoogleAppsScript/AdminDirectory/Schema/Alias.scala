package typings.googleDashAppsDashScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alias extends js.Object {
  var alias: js.UndefOr[String] = js.undefined
  var etag: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var primaryEmail: js.UndefOr[String] = js.undefined
}

object Alias {
  @scala.inline
  def apply(
    alias: String = null,
    etag: String = null,
    id: String = null,
    kind: String = null,
    primaryEmail: String = null
  ): Alias = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (primaryEmail != null) __obj.updateDynamic("primaryEmail")(primaryEmail)
    __obj.asInstanceOf[Alias]
  }
}

