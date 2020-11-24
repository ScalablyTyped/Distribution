package typings.emailCheck.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("email-check", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(email: String): js.Promise[Boolean] = js.native
  def apply(email: String, options: EmailCheckOptions): js.Promise[Boolean] = js.native
}
