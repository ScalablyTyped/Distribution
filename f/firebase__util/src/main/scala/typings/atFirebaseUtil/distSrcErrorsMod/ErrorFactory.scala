package typings.atFirebaseUtil.distSrcErrorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/util/dist/src/errors", "ErrorFactory")
@js.native
class ErrorFactory[ErrorCode /* <: String */, ErrorParams /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{readonly [ K in ErrorCode ]:? @firebase/util.@firebase/util/dist/src/errors.ErrorData}
  */ typings.atFirebaseUtil.atFirebaseUtilStrings.ErrorFactory with js.Any */] protected () extends js.Object {
  def this(service: String, serviceName: String, errors: ErrorMap[ErrorCode]) = this()
  val errors: js.Any = js.native
  val service: js.Any = js.native
  val serviceName: js.Any = js.native
  def create[K /* <: ErrorCode */](
    code: K,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param data because its type K extends keyof ErrorParams ? [ErrorParams[K]] : [] is not an array type */ data: js.Array[js.Any]
  ): FirebaseError = js.native
}

