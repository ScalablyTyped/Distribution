package typings.atFirebaseAuthDashTypes.atFirebaseAuthDashTypesMod

import typings.atFirebaseAppDashTypes.atFirebaseAppDashTypesMod.FirebaseApp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/auth-types", "RecaptchaVerifier_Instance")
@js.native
class RecaptchaVerifier_Instance protected () extends ApplicationVerifier {
  def this(container: String) = this()
  def this(container: js.Any) = this()
  def this(container: String, parameters: js.Object) = this()
  def this(container: js.Any, parameters: js.Object) = this()
  def this(container: String, parameters: js.Object, app: FirebaseApp) = this()
  def this(container: String, parameters: Null, app: FirebaseApp) = this()
  def this(container: js.Any, parameters: js.Object, app: FirebaseApp) = this()
  def this(container: js.Any, parameters: Null, app: FirebaseApp) = this()
  /* CompleteClass */
  override var `type`: String = js.native
  def clear(): Unit = js.native
  def render(): js.Promise[Double] = js.native
  /* CompleteClass */
  override def verify(): js.Promise[String] = js.native
}

