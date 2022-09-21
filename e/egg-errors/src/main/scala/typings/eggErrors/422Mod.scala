package typings.eggErrors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `422Mod` {
  
  @JSImport("egg-errors/lib/http/422", JSImport.Default)
  @js.native
  open class default ()
    extends typings.eggErrors.httpErrorMod.default {
    def this(message: String) = this()
  }
  
  type UnprocessableEntityError = typings.eggErrors.httpErrorMod.default
}
