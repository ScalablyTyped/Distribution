package typings.externalEditor

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object readFileErrorMod {
  
  @JSImport("external-editor/main/errors/ReadFileError", "ReadFileError")
  @js.native
  open class ReadFileError protected ()
    extends StObject
       with Error {
    def this(originalError: js.Error) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    var originalError: js.Error = js.native
  }
}
