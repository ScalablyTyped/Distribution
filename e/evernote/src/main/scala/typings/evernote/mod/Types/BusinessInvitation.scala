package typings.evernote.mod.Types

import typings.evernote.anon.BusinessId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("evernote", "Types.BusinessInvitation")
@js.native
class BusinessInvitation () extends StObject {
  def this(args: BusinessId) = this()
  
  var businessId: js.UndefOr[Double] = js.native
  
  var created: js.UndefOr[Timestamp] = js.native
  
  var email: js.UndefOr[String] = js.native
  
  var fromWorkChat: js.UndefOr[Boolean] = js.native
  
  var requesterId: js.UndefOr[UserID] = js.native
  
  var role: js.UndefOr[BusinessUserRole] = js.native
  
  var status: js.UndefOr[BusinessInvitationStatus] = js.native
}
