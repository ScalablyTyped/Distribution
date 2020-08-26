package typings.firebase.mod.auth

import typings.firebase.mod.app.App
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @webonly
  * @hidden
  */
@JSImport("firebase", "auth.RecaptchaVerifier_Instance")
@js.native
class RecaptchaVerifierInstance protected () extends ApplicationVerifier {
  def this(container: String) = this()
  def this(container: js.Any) = this()
  def this(container: String, parameters: js.Object) = this()
  def this(container: js.Any, parameters: js.Object) = this()
  def this(container: String, parameters: js.UndefOr[scala.Nothing], app: App) = this()
  def this(container: String, parameters: js.Object, app: App) = this()
  def this(container: String, parameters: Null, app: App) = this()
  def this(container: js.Any, parameters: js.UndefOr[scala.Nothing], app: App) = this()
  def this(container: js.Any, parameters: js.Object, app: App) = this()
  def this(container: js.Any, parameters: Null, app: App) = this()
  /**
    * Clears the reCAPTCHA widget from the page and destroys the current instance.
    */
  def clear(): Unit = js.native
  /**
    * Renders the reCAPTCHA widget on the page.
    * @return A Promise that resolves with the
    *     reCAPTCHA widget ID.
    */
  def render(): js.Promise[Double] = js.native
}

