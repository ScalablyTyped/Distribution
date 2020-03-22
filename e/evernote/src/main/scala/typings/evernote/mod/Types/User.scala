package typings.evernote.mod.Types

import typings.evernote.AnonAccountLimits
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("evernote", "Types.User")
@js.native
class User () extends js.Object {
  def this(args: AnonAccountLimits) = this()
  var accountLimits: js.UndefOr[AccountLimits] = js.native
  var accounting: js.UndefOr[Accounting] = js.native
  var active: js.UndefOr[Boolean] = js.native
  var attributes: js.UndefOr[UserAttributes] = js.native
  var businessUserInfo: js.UndefOr[BusinessUserInfo] = js.native
  var created: js.UndefOr[Timestamp] = js.native
  var deleted: js.UndefOr[Timestamp] = js.native
  var email: js.UndefOr[String] = js.native
  var id: js.UndefOr[UserID] = js.native
  var name: js.UndefOr[String] = js.native
  var photoLastUpdated: js.UndefOr[Timestamp] = js.native
  var photoUrl: js.UndefOr[String] = js.native
  var privilege: js.UndefOr[PrivilegeLevel] = js.native
  var serviceLevel: js.UndefOr[ServiceLevel] = js.native
  var shardId: js.UndefOr[String] = js.native
  var timezone: js.UndefOr[String] = js.native
  var updated: js.UndefOr[Timestamp] = js.native
  var username: js.UndefOr[String] = js.native
}

