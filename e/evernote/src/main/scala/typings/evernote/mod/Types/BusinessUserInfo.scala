package typings.evernote.mod.Types

import typings.evernote.AnonBusinessName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("evernote", "Types.BusinessUserInfo")
@js.native
class BusinessUserInfo () extends js.Object {
  def this(args: AnonBusinessName) = this()
  var businessId: js.UndefOr[Double] = js.native
  var businessName: js.UndefOr[String] = js.native
  var email: js.UndefOr[String] = js.native
  var role: js.UndefOr[BusinessUserRole] = js.native
  var updated: js.UndefOr[Timestamp] = js.native
}

