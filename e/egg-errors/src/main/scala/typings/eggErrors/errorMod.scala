package typings.eggErrors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorMod {
  
  @JSImport("egg-errors/lib/error", JSImport.Default)
  @js.native
  open class default ()
    extends typings.eggErrors.baseErrorMod.default[typings.eggErrors.errorOptionsMod.default] {
    def this(message: String) = this()
  }
  
  type EggError = typings.eggErrors.baseErrorMod.default[typings.eggErrors.errorOptionsMod.default]
}
