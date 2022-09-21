package typings.firebaseUtil

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.std.Error
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcErrorsMod {
  
  @JSImport("@firebase/util/dist/src/errors", "ErrorFactory")
  @js.native
  open class ErrorFactory[ErrorCode /* <: String */, ErrorParams /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ K in ErrorCode ]:? @firebase/util.@firebase/util/dist/src/errors.ErrorData}
    */ typings.firebaseUtil.firebaseUtilStrings.ErrorFactory & TopLevel[Any] */] protected () extends StObject {
    def this(service: String, serviceName: String, errors: ErrorMap[ErrorCode]) = this()
    
    def create[K /* <: ErrorCode */](
      code: K,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param data because its type K extends keyof ErrorParams ? [ErrorParams[K]] : [] is not an array type */ data: js.Array[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: ErrorParams[K] */ js.Any)
        ]
    ): FirebaseError = js.native
    
    /* private */ val errors: Any = js.native
    
    /* private */ val service: Any = js.native
    
    /* private */ val serviceName: Any = js.native
  }
  
  @JSImport("@firebase/util/dist/src/errors", "FirebaseError")
  @js.native
  open class FirebaseError protected ()
    extends StObject
       with Error {
    def this(/** The error code for this error. */
    code: String, message: String) = this()
    def this(
      /** The error code for this error. */
    code: String,
      message: String,
      /** Custom data for this error. */
    customData: Record[String, Any]
    ) = this()
    
    /** The error code for this error. */
    val code: String = js.native
    
    /** Custom data for this error. */
    var customData: js.UndefOr[Record[String, Any]] = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  type ErrorData = StringDictionary[Any]
  
  type ErrorMap[ErrorCode /* <: String */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ K in ErrorCode ]: string}
    */ typings.firebaseUtil.firebaseUtilStrings.ErrorMap & TopLevel[Any]
  
  trait StringLike extends StObject
}
