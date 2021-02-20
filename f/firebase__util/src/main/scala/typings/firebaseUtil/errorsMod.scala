package typings.firebaseUtil

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.std.Error
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorsMod {
  
  @JSImport("@firebase/util/dist/src/errors", "ErrorFactory")
  @js.native
  class ErrorFactory[ErrorCode /* <: String */, ErrorParams /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ K in ErrorCode ]:? @firebase/util.@firebase/util/dist/src/errors.ErrorData}
    */ typings.firebaseUtil.firebaseUtilStrings.ErrorFactory with TopLevel[js.Any] */] protected () extends StObject {
    def this(service: String, serviceName: String, errors: ErrorMap[ErrorCode]) = this()
    
    def create[K /* <: ErrorCode */](
      code: K,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param data because its type K extends keyof ErrorParams ? [ErrorParams[K]] : [] is not an array type */ data: js.Array[js.Any]
    ): FirebaseError = js.native
    
    val errors: js.Any = js.native
    
    val service: js.Any = js.native
    
    val serviceName: js.Any = js.native
  }
  
  @JSImport("@firebase/util/dist/src/errors", "FirebaseError")
  @js.native
  class FirebaseError protected () extends Error {
    def this(code: String, message: String) = this()
    def this(code: String, message: String, customData: Record[String, _]) = this()
    
    val code: String = js.native
    
    var customData: js.UndefOr[Record[String, _]] = js.native
  }
  
  type ErrorData = StringDictionary[js.Any]
  
  type ErrorMap[ErrorCode /* <: String */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ K in ErrorCode ]: string}
    */ typings.firebaseUtil.firebaseUtilStrings.ErrorMap with TopLevel[js.Any]
  
  @js.native
  trait StringLike extends StObject
}
