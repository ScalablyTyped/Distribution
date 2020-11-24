package typings.elasticsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type DeleteDocumentByQueryResponse = typings.elasticsearch.mod.ReindexResponse
  
  type InfoParams = typings.elasticsearch.mod.GenericParams
  
  type NameList = java.lang.String | js.Array[java.lang.String] | scala.Boolean
  
  type PingParams = typings.elasticsearch.mod.GenericParams
  
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - typings.elasticsearch.elasticsearchStrings.wait_for
    - typings.elasticsearch.elasticsearchStrings._empty
  */
  type Refresh = typings.elasticsearch.mod._Refresh | scala.Boolean
  
  type TimeSpan = java.lang.String
  
  type UpdateDocumentByQueryResponse = typings.elasticsearch.mod.ReindexResponse
}
