package typings.firebase.firebaseMod.firebase.auth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @webonly
  * @hidden
  */
trait RecaptchaVerifierInstance
  extends StObject
     with ApplicationVerifier {
  
  /**
    * Clears the reCAPTCHA widget from the page and destroys the current instance.
    */
  def clear(): Unit
  
  /**
    * Renders the reCAPTCHA widget on the page.
    * @return A Promise that resolves with the
    *     reCAPTCHA widget ID.
    */
  def render(): js.Promise[Double]
}
object RecaptchaVerifierInstance {
  
  inline def apply(
    clear: () => Unit,
    render: () => js.Promise[Double],
    `type`: String,
    verify: () => js.Promise[String]
  ): RecaptchaVerifierInstance = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), render = js.Any.fromFunction0(render), verify = js.Any.fromFunction0(verify))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecaptchaVerifierInstance]
  }
  
  extension [Self <: RecaptchaVerifierInstance](x: Self) {
    
    inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    inline def setRender(value: () => js.Promise[Double]): Self = StObject.set(x, "render", js.Any.fromFunction0(value))
  }
}
