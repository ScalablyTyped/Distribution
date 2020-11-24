package typings.evernote.mod.Types

import typings.evernote.anon.Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("evernote", "Types.Contact")
@js.native
class Contact () extends js.Object {
  def this(args: Id) = this()
  
  var id: js.UndefOr[String] = js.native
  
  var messagingPermit: js.UndefOr[String] = js.native
  
  var messagingPermitExpires: js.UndefOr[Timestamp] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var photoLastUpdated: js.UndefOr[Timestamp] = js.native
  
  var photoUrl: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[ContactType] = js.native
}
