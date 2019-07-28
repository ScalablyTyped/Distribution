package typings.atFirebaseUtil.atFirebaseUtilMod

import typings.atFirebaseUtil.distSrcErrorsMod.ErrorMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/util", "ErrorFactory")
@js.native
class ErrorFactory[ErrorCode /* <: String */, ErrorParams /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
{readonly [ K in ErrorCode ]:? @firebase/util.@firebase/util/dist/src/errors.ErrorData}
  */ typings.atFirebaseUtil.atFirebaseUtilStrings.ErrorFactory with js.Any */] protected ()
  extends typings.atFirebaseUtil.distSrcErrorsMod.ErrorFactory[ErrorCode, ErrorParams] {
  def this(service: String, serviceName: String, errors: ErrorMap[ErrorCode]) = this()
}

