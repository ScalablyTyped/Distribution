package typings.emailValidator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("email-validator", "validate")
  @js.native
  def validate(email: String): Boolean = js.native
  
  @JSImport("email-validator", "validate_async")
  @js.native
  def validateAsync(email: String, callback: AsyncCallback): Unit = js.native
  
  type AsyncCallback = js.Function2[/* err */ js.Any, /* isValideEmail */ Boolean, js.Any]
}
