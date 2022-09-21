package typings.eggErrors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `429Mod` {
  
  @JSImport("egg-errors/lib/http/429", JSImport.Default)
  @js.native
  open class default ()
    extends typings.eggErrors.httpErrorMod.default {
    def this(message: String) = this()
  }
  
  type TooManyRequestsError = typings.eggErrors.httpErrorMod.default
}
