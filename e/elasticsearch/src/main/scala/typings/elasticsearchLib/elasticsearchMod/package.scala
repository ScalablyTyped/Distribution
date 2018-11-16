package typings
package elasticsearchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object elasticsearchMod {
  type CatBytes = elasticsearchLib.elasticsearchLibStrings.b | elasticsearchLib.elasticsearchLibStrings.k | elasticsearchLib.elasticsearchLibStrings.kb | elasticsearchLib.elasticsearchLibStrings.m | elasticsearchLib.elasticsearchLibStrings.mb | elasticsearchLib.elasticsearchLibStrings.g | elasticsearchLib.elasticsearchLibStrings.gb | elasticsearchLib.elasticsearchLibStrings.t | elasticsearchLib.elasticsearchLibStrings.tb | elasticsearchLib.elasticsearchLibStrings.p | elasticsearchLib.elasticsearchLibStrings.pb
  type Conflicts = elasticsearchLib.elasticsearchLibStrings.abort | elasticsearchLib.elasticsearchLibStrings.proceed
  type DefaultOperator = elasticsearchLib.elasticsearchLibStrings.AND | elasticsearchLib.elasticsearchLibStrings.OR
  type DeleteDocumentByQueryResponse = ReindexResponse
  type ExpandWildcards = elasticsearchLib.elasticsearchLibStrings.open | elasticsearchLib.elasticsearchLibStrings.closed | elasticsearchLib.elasticsearchLibStrings.none | elasticsearchLib.elasticsearchLibStrings.all
  type InfoParams = GenericParams
  type NameList = java.lang.String | js.Array[java.lang.String] | scala.Boolean
  type PingParams = GenericParams
  type Refresh = scala.Boolean | elasticsearchLib.elasticsearchLibStrings.`true` | elasticsearchLib.elasticsearchLibStrings.`false` | elasticsearchLib.elasticsearchLibStrings.wait_for | elasticsearchLib.elasticsearchLibStrings.Empty
  type TimeSpan = java.lang.String
  type UpdateDocumentByQueryResponse = ReindexResponse
  type VersionType = elasticsearchLib.elasticsearchLibStrings.internal | elasticsearchLib.elasticsearchLibStrings.external | elasticsearchLib.elasticsearchLibStrings.external_gte | elasticsearchLib.elasticsearchLibStrings.force
}
