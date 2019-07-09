package typings
package gitlabLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distInfrastructureMod {
  type DelResponse = js.Object
  type GetResponse = PaginationResponse | js.Object | js.Array[js.Object]
  type Mapper[T /* <: org.scalablytyped.runtime.StringDictionary[Constructor] */, P /* <: java.lang.String */] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ name in P ]: std.InstanceType<T[name]>}
    */ gitlabLib.gitlabLibStrings.Mapper with T
  type PostResponse = js.Object
  type PutResponse = js.Object
}
