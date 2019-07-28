package typings.emailDashValidator.emailDashValidatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("email-validator", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def validate(email: String): Boolean = js.native
  def validate_async(email: String, callback: AsyncCallback): Unit = js.native
}

