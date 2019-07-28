package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Browser extends js.Object {
  var browserVersionId: js.UndefOr[String] = js.undefined
  var dartId: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var majorVersion: js.UndefOr[String] = js.undefined
  var minorVersion: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
}

object Browser {
  @scala.inline
  def apply(
    browserVersionId: String = null,
    dartId: String = null,
    kind: String = null,
    majorVersion: String = null,
    minorVersion: String = null,
    name: String = null
  ): Browser = {
    val __obj = js.Dynamic.literal()
    if (browserVersionId != null) __obj.updateDynamic("browserVersionId")(browserVersionId)
    if (dartId != null) __obj.updateDynamic("dartId")(dartId)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (majorVersion != null) __obj.updateDynamic("majorVersion")(majorVersion)
    if (minorVersion != null) __obj.updateDynamic("minorVersion")(minorVersion)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Browser]
  }
}

