package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.UrlshortenerUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringCount extends js.Object {
  var count: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
}

object StringCount {
  @scala.inline
  def apply(count: java.lang.String = null, id: java.lang.String = null): StringCount = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[StringCount]
  }
}

