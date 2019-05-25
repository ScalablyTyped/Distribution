package typings
package atFirebaseUtilLib.atFirebaseUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/util", "ErrorFactory")
@js.native
class ErrorFactory[ErrorCode /* <: java.lang.String */, ErrorParams /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
{readonly [ K in ErrorCode ]:? @firebase/util.@firebase/util/dist/src/errors.ErrorData}
  */ atFirebaseUtilLib.atFirebaseUtilLibStrings.ErrorFactory with js.Any */] protected ()
  extends atFirebaseUtilLib.distSrcErrorsMod.ErrorFactory[ErrorCode, ErrorParams] {
  def this(service: java.lang.String, serviceName: java.lang.String, errors: atFirebaseUtilLib.distSrcErrorsMod.ErrorMap[ErrorCode]) = this()
}

