package typings.googleDashAppsDashScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Group extends js.Object {
  var adminCreated: js.UndefOr[Boolean] = js.undefined
  var aliases: js.UndefOr[js.Array[String]] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var directMembersCount: js.UndefOr[String] = js.undefined
  var email: js.UndefOr[String] = js.undefined
  var etag: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var nonEditableAliases: js.UndefOr[js.Array[String]] = js.undefined
}

object Group {
  @scala.inline
  def apply(
    adminCreated: js.UndefOr[Boolean] = js.undefined,
    aliases: js.Array[String] = null,
    description: String = null,
    directMembersCount: String = null,
    email: String = null,
    etag: String = null,
    id: String = null,
    kind: String = null,
    name: String = null,
    nonEditableAliases: js.Array[String] = null
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

