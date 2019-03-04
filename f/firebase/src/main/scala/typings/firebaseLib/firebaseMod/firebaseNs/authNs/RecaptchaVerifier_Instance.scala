package typings
package firebaseLib.firebaseMod.firebaseNs.authNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecaptchaVerifier_Instance extends ApplicationVerifier {
  def clear(): scala.Unit
  def render(): js.Promise[scala.Double]
}

object RecaptchaVerifier_Instance {
  @scala.inline
  def apply(
    clear: js.Function0[scala.Unit],
    render: js.Function0[js.Promise[scala.Double]],
    `type`: java.lang.String,
    verify: js.Function0[js.Promise[java.lang.String]]
  ): RecaptchaVerifier_Instance = {
    val __obj = js.Dynamic.literal(clear = clear, render = render, verify = verify)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RecaptchaVerifier_Instance]
  }
}

