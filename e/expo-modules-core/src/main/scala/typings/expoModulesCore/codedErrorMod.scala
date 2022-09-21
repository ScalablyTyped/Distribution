package typings.expoModulesCore

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object codedErrorMod {
  
  @JSImport("expo-modules-core/build/errors/CodedError", "CodedError")
  @js.native
  open class CodedError protected ()
    extends StObject
       with Error {
    def this(code: String, message: String) = this()
    
    var code: String = js.native
    
    var info: js.UndefOr[Any] = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
}
