package typings.elasticsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object elasticsearchMod {
  type DeleteDocumentByQueryResponse = ReindexResponse
  type InfoParams = GenericParams
  type NameList = String | js.Array[String] | Boolean
  type PingParams = GenericParams
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - typings.elasticsearch.elasticsearchStrings.wait_for
    - typings.elasticsearch.elasticsearchStrings.Empty
  */
  type Refresh = _Refresh | Boolean
  type TimeSpan = String
  type UpdateDocumentByQueryResponse = ReindexResponse
}
