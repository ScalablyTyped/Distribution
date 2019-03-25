package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminUnderscoreDirectoryUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Group extends js.Object {
  var adminCreated: js.UndefOr[scala.Boolean] = js.undefined
  var aliases: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var directMembersCount: js.UndefOr[java.lang.String] = js.undefined
  var email: js.UndefOr[java.lang.String] = js.undefined
  var etag: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var nonEditableAliases: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Group {
  @scala.inline
  def apply(
    adminCreated: js.UndefOr[scala.Boolean] = js.undefined,
    aliases: js.Array[java.lang.String] = null,
    description: java.lang.String = null,
    directMembersCount: java.lang.String = null,
    email: java.lang.String = null,
    etag: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    name: java.lang.String = null,
    nonEditableAliases: js.Array[java.lang.String] = null
  ): Group = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(adminCreated)) __obj.updateDynamic("adminCreated")(adminCreated)
    if (aliases != null) __obj.updateDynamic("aliases")(aliases)
    if (description != null) __obj.updateDynamic("description")(description)
    if (directMembersCount != null) __obj.updateDynamic("directMembersCount")(directMembersCount)
    if (email != null) __obj.updateDynamic("email")(email)
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    if (nonEditableAliases != null) __obj.updateDynamic("nonEditableAliases")(nonEditableAliases)
    __obj.asInstanceOf[Group]
  }
}

