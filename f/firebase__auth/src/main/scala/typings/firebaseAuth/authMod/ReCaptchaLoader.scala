package typings.firebaseAuth.authMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * We need to mark this interface as internal explicitly to exclude it in the public typings, because
  * it references AuthInternal which has a circular dependency with UserInternal.
  *
  * @internal
  */
@js.native
trait ReCaptchaLoader extends StObject {
  
  def clearedOneInstance(): Unit = js.native
  
  def load(auth: AuthInternal): js.Promise[Recaptcha] = js.native
  def load(auth: AuthInternal, hl: String): js.Promise[Recaptcha] = js.native
}
