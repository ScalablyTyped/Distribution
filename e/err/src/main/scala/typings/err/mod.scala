package typings.err

import typings.std.Error
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /** Create a custom error object. */
  @JSImport("err", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Error {
    def this(error: RequiredData & Data) = this()
    def this(error: String) = this()
    def this(error: js.Error) = this()
    def this(error: String, code: String) = this()
    def this(error: String, data: Data) = this()
    def this(error: js.Error, code: String) = this()
    def this(error: js.Error, data: Data) = this()
    def this(error: String, code: String, data: Data) = this()
    def this(error: String, code: Unit, data: Data) = this()
    def this(error: js.Error, code: String, data: Data) = this()
    def this(error: js.Error, code: Unit, data: Data) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  /** Arbitrary data to include in the error. */
  type Data = Record[String, String]
  
  /** Create a custom error object. */
  type Err = js.Error
  
  /** Values required if the only argument to the constructor is an object. */
  trait RequiredData extends StObject {
    
    var code: String
    
    var message: String
  }
  object RequiredData {
    
    inline def apply(code: String, message: String): RequiredData = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequiredData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequiredData] (val x: Self) extends AnyVal {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
}
