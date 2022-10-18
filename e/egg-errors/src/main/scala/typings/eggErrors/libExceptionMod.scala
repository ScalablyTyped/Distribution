package typings.eggErrors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libExceptionMod {
  
  @JSImport("egg-errors/lib/exception", JSImport.Default)
  @js.native
  open class default ()
    extends typings.eggErrors.libBaseExceptionMod.default[typings.eggErrors.libErrorOptionsMod.default] {
    def this(message: String) = this()
  }
  
  type EggException = typings.eggErrors.libBaseExceptionMod.default[typings.eggErrors.libErrorOptionsMod.default]
}
