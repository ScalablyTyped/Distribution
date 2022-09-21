package typings.eggErrors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exceptionMod {
  
  @JSImport("egg-errors/lib/exception", JSImport.Default)
  @js.native
  open class default ()
    extends typings.eggErrors.baseExceptionMod.default[typings.eggErrors.errorOptionsMod.default] {
    def this(message: String) = this()
  }
  
  type EggException = typings.eggErrors.baseExceptionMod.default[typings.eggErrors.errorOptionsMod.default]
}
