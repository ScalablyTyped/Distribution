package typings.googleDashAppsDashScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Asp extends js.Object {
  var codeId: js.UndefOr[Double] = js.undefined
  var creationTime: js.UndefOr[String] = js.undefined
  var etag: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var lastTimeUsed: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var userKey: js.UndefOr[String] = js.undefined
}

object Asp {
  @scala.inline
  def apply(
    codeId: Int | Double = null,
    creationTime: String = null,
    etag: String = null,
    kind: String = null,
    lastTimeUsed: String = null,
    name: String = null,
    userKey: String = null
  ): Asp = {
    val __obj = js.Dynamic.literal()
    if (codeId != null) __obj.updateDynamic("codeId")(codeId.asInstanceOf[js.Any])
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (lastTimeUsed != null) __obj.updateDynamic("lastTimeUsed")(lastTimeUsed.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (userKey != null) __obj.updateDynamic("userKey")(userKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Asp]
  }
}

