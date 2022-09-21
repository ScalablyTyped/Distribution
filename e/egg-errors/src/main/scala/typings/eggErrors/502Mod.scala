package typings.eggErrors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `502Mod` {
  
  @JSImport("egg-errors/lib/http/502", JSImport.Default)
  @js.native
  open class default ()
    extends typings.eggErrors.httpErrorMod.default {
    def this(message: String) = this()
  }
  
  type BadGatewayError = typings.eggErrors.httpErrorMod.default
}
