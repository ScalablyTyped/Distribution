package typings.googleDashAppsDashScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Aliases extends js.Object {
  var aliases: js.UndefOr[js.Array[_]] = js.undefined
  var etag: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
}

object Aliases {
  @scala.inline
  def apply(aliases: js.Array[_] = null, etag: String = null, kind: String = null): Aliases = {
    val __obj = js.Dynamic.literal()
    if (aliases != null) __obj.updateDynamic("aliases")(aliases)
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[Aliases]
  }
}

