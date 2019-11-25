package typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema

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
    if (browserVersionId != null) __obj.updateDynamic("browserVersionId")(browserVersionId.asInstanceOf[js.Any])
    if (dartId != null) __obj.updateDynamic("dartId")(dartId.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (majorVersion != null) __obj.updateDynamic("majorVersion")(majorVersion.asInstanceOf[js.Any])
    if (minorVersion != null) __obj.updateDynamic("minorVersion")(minorVersion.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Browser]
  }
}

