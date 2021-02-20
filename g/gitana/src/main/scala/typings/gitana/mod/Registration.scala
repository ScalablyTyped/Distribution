package typings.gitana.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitana", "Registration")
@js.native
class Registration protected () extends StObject {
  def this(application: js.Any, `object`: js.Any) = this()
  
  def base(): Unit = js.native
  
  def confirm(newUserPassword: js.Any, paymentMethodObject: js.Any): js.Any = js.native
  
  def getType(): js.Any = js.native
  
  def getUri(): js.Any = js.native
  
  def sendConfirmationEmail(): js.Any = js.native
  
  def sendWelcomeEmail(): js.Any = js.native
}
object Registration {
  
  /* static member */
  @JSImport("gitana", "Registration.extend")
  @js.native
  def extend(_instance: js.Any, _static: js.Any, args: js.Any*): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "Registration.forEach")
  @js.native
  def forEach(`object`: js.Any, block: js.Any, context: js.Any): Unit = js.native
  
  /* static member */
  @JSImport("gitana", "Registration.implement")
  @js.native
  def implement(args: js.Any*): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "Registration.toString")
  @js.native
  def toString_(): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "Registration.valueOf")
  @js.native
  def valueOf_(`type`: js.Any): js.Any = js.native
}
