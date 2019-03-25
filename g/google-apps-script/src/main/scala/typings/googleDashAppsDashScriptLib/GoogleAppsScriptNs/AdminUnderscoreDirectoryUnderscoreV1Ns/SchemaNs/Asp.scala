package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminUnderscoreDirectoryUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Asp extends js.Object {
  var codeId: js.UndefOr[scala.Double] = js.undefined
  var creationTime: js.UndefOr[java.lang.String] = js.undefined
  var etag: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var lastTimeUsed: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var userKey: js.UndefOr[java.lang.String] = js.undefined
}

object Asp {
  @scala.inline
  def apply(
    codeId: scala.Int | scala.Double = null,
    creationTime: java.lang.String = null,
    etag: java.lang.String = null,
    kind: java.lang.String = null,
    lastTimeUsed: java.lang.String = null,
    name: java.lang.String = null,
    userKey: java.lang.String = null
  ): Asp = {
    val __obj = js.Dynamic.literal()
    if (codeId != null) __obj.updateDynamic("codeId")(codeId.asInstanceOf[js.Any])
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime)
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (lastTimeUsed != null) __obj.updateDynamic("lastTimeUsed")(lastTimeUsed)
    if (name != null) __obj.updateDynamic("name")(name)
    if (userKey != null) __obj.updateDynamic("userKey")(userKey)
    __obj.asInstanceOf[Asp]
  }
}

