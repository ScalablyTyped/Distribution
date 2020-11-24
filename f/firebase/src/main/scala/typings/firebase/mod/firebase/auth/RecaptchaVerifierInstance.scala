package typings.firebase.mod.firebase.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @webonly
  * @hidden
  */
@js.native
trait RecaptchaVerifierInstance extends ApplicationVerifier {
  
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
object RecaptchaVerifierInstance {
  
  @scala.inline
  def apply(
    clear: () => Unit,
    render: () => js.Promise[Double],
    `type`: String,
    verify: () => js.Promise[String]
  ): RecaptchaVerifierInstance = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), render = js.Any.fromFunction0(render), verify = js.Any.fromFunction0(verify))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecaptchaVerifierInstance]
  }
  
  @scala.inline
  implicit class RecaptchaVerifierInstanceOps[Self <: RecaptchaVerifierInstance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRender(value: () => js.Promise[Double]): Self = this.set("render", js.Any.fromFunction0(value))
  }
}
