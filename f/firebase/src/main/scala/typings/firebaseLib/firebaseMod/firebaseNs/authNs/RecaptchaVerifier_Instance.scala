package typings
package firebaseLib.firebaseMod.firebaseNs.authNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @hidden
  */
trait RecaptchaVerifier_Instance extends ApplicationVerifier {
  /**
    * Clears the reCAPTCHA widget from the page and destroys the current instance.
    */
  def clear(): scala.Unit
  /**
    * Renders the reCAPTCHA widget on the page.
    * @return {!firebase.Promise<number>} A Promise that resolves with the
    *     reCAPTCHA widget ID.
    */
  def render(): js.Promise[scala.Double]
}

object RecaptchaVerifier_Instance {
  @scala.inline
  def apply(
    clear: () => scala.Unit,
    render: () => js.Promise[scala.Double],
    `type`: java.lang.String,
    verify: () => js.Promise[java.lang.String]
  ): RecaptchaVerifier_Instance = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), render = js.Any.fromFunction0(render), verify = js.Any.fromFunction0(verify))
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RecaptchaVerifier_Instance]
  }
}

