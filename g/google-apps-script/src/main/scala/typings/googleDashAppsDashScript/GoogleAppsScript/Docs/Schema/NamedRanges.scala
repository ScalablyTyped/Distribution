package typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NamedRanges extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var namedRanges: js.UndefOr[js.Array[NamedRange]] = js.undefined
}

object NamedRanges {
  @scala.inline
  def apply(name: String = null, namedRanges: js.Array[NamedRange] = null): NamedRanges = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namedRanges != null) __obj.updateDynamic("namedRanges")(namedRanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamedRanges]
  }
}

