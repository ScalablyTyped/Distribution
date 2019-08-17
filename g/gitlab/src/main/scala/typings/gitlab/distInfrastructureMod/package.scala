package typings.gitlab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distInfrastructureMod {
  import org.scalablytyped.runtime.StringDictionary

  type DelResponse = js.Object
  type GetResponse = PaginationResponse | js.Object | js.Array[js.Object]
  type Mapper[T /* <: StringDictionary[Constructor] */, P /* <: String */] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ name in P ]: std.InstanceType<T[name]>}
    */ typings.gitlab.gitlabStrings.Mapper with T
  type PostResponse = js.Object
  type PutResponse = js.Object
}
