package typings.gitana.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitana", "Registration")
@js.native
class Registration protected () extends js.Object {
  def this(application: js.Any, `object`: js.Any) = this()
  def base(): Unit = js.native
  def confirm(newUserPassword: js.Any, paymentMethodObject: js.Any): js.Any = js.native
  def getType(): js.Any = js.native
  def getUri(): js.Any = js.native
  def sendConfirmationEmail(): js.Any = js.native
  def sendWelcomeEmail(): js.Any = js.native
}

/* static members */
@JSImport("gitana", "Registration")
@js.native
object Registration extends js.Object {
  def extend(_instance: js.Any, _static: js.Any, args: js.Any*): js.Any = js.native
  def forEach(`object`: js.Any, block: js.Any, context: js.Any): Unit = js.native
  def implement(args: js.Any*): js.Any = js.native
  def valueOf(`type`: js.Any): js.Any = js.native
}

