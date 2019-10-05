package typings.evernote.evernoteMod.Evernote

import typings.evernote.Anon_BusinessIdBusinessName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This structure is used to provide information about an Evernote Business
  * membership, for members who are part of a business.
  *
  * <dl>
  * <dt>businessId</dt>
  *     <dd>The ID of the Evernote Business account that the user is a member of.
  * <dt>businessName</dt>
  *     <dd>The human-readable name of the Evernote Business account that the user
  *             is a member of.</dd>
  * <dt>role</dt>
  *     <dd>The role of the user within the Evernote Business account that
  *             they are a member of.</dd>
  * <dt>email</dt>
  *     <dd>An e-mail address that will be used by the service in the context of your
  *             Evernote Business activities.    For example, this e-mail address will be used
  *             when you e-mail a business note, when you update notes in the account of
  *             your business, etc.    The business e-mail cannot be used for identification
  *             purposes such as for logging into the service.
  *     </dd>
  * </dl>
  */
@JSImport("evernote", "Evernote.BusinessUserInfo")
@js.native
class BusinessUserInfo () extends js.Object {
  def this(args: Anon_BusinessIdBusinessName) = this()
  var businessId: Double = js.native
  var businessName: String = js.native
  var email: String = js.native
  var role: BusinessUserRole = js.native
}

