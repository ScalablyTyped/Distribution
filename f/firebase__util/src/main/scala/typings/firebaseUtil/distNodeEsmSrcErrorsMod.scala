package typings.firebaseUtil

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeEsmSrcErrorsMod {
  
  @JSImport("@firebase/util/dist/node-esm/src/errors", "ErrorFactory")
  @js.native
  open class ErrorFactory[ErrorCode /* <: String */, ErrorParams /* <: /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in ErrorCode ]:? @firebase/util.@firebase/util/dist/node-esm/src/errors.ErrorData} */ js.Any */] protected () extends StObject {
    def this(service: String, serviceName: String, errors: ErrorMap[ErrorCode]) = this()
    
    def create[K /* <: ErrorCode */](
      code: K,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param data because its type K extends keyof ErrorParams ? [ErrorParams[K]] : [] is not an array type */ data: /* import warning: importer.ImportType#apply Failed type conversion: K extends keyof ErrorParams ? [ErrorParams[K]] : [] */ js.Any
    ): FirebaseError = js.native
    
    /* private */ val errors: Any = js.native
    
    /* private */ val service: Any = js.native
    
    /* private */ val serviceName: Any = js.native
  }
  
  @JSImport("@firebase/util/dist/node-esm/src/errors", "FirebaseError")
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
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {readonly [ K in ErrorCode ]: string}
    }}}
    */
  @js.native
  trait ErrorMap[ErrorCode /* <: String */] extends StObject
  
  trait StringLike extends StObject
}
