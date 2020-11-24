package typings.evernote.mod.Types

import typings.evernote.anon.BusinessName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("evernote", "Types.BusinessUserInfo")
@js.native
class BusinessUserInfo () extends js.Object {
  def this(args: BusinessName) = this()
  
  var businessId: js.UndefOr[Double] = js.native
  
  var businessName: js.UndefOr[String] = js.native
  
  var email: js.UndefOr[String] = js.native
  
  var role: js.UndefOr[BusinessUserRole] = js.native
  
  var updated: js.UndefOr[Timestamp] = js.native
}
