package typings.atFirebaseUtil

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distSrcErrorsMod {
  type ErrorData = StringDictionary[js.UndefOr[StringLike]]
  type ErrorMap[ErrorCode /* <: String */] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {readonly [ K in ErrorCode ]: string}
    */ typings.atFirebaseUtil.atFirebaseUtilStrings.ErrorMap with js.Any
}
