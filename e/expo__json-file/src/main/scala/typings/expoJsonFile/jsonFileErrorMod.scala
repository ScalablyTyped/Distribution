package typings.expoJsonFile

import typings.expoJsonFile.expoJsonFileBooleans.`true`
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsonFileErrorMod {
  
  @JSImport("@expo/json-file/build/JsonFileError", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with JsonFileError {
    def this(message: String) = this()
    def this(message: String, cause: js.Error) = this()
    def this(message: String, cause: js.Error, code: String) = this()
    def this(message: String, cause: Unit, code: String) = this()
    def this(message: String, cause: js.Error, code: String, fileName: String) = this()
    def this(message: String, cause: js.Error, code: Unit, fileName: String) = this()
    def this(message: String, cause: Unit, code: String, fileName: String) = this()
    def this(message: String, cause: Unit, code: Unit, fileName: String) = this()
    
    /* CompleteClass */
    var isJsonFileError: `true` = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("@expo/json-file/build/JsonFileError", "EmptyJsonFileError")
  @js.native
  open class EmptyJsonFileError ()
    extends StObject
       with JsonFileError {
    def this(fileName: String) = this()
    
    /* CompleteClass */
    var isJsonFileError: `true` = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  trait JsonFileError
    extends StObject
       with Error {
    
    @JSName("cause")
    var cause_JsonFileError: js.UndefOr[js.Error] = js.undefined
    
    var code: js.UndefOr[String] = js.undefined
    
    var fileName: js.UndefOr[String] = js.undefined
    
    var isJsonFileError: `true`
  }
  object JsonFileError {
    
    inline def apply(message: String, name: String): JsonFileError = {
      val __obj = js.Dynamic.literal(isJsonFileError = true, message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[JsonFileError]
    }
    
    extension [Self <: JsonFileError](x: Self) {
      
      inline def setCause(value: js.Error): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
      
      inline def setCauseUndefined: Self = StObject.set(x, "cause", js.undefined)
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
      
      inline def setIsJsonFileError(value: `true`): Self = StObject.set(x, "isJsonFileError", value.asInstanceOf[js.Any])
    }
  }
}
