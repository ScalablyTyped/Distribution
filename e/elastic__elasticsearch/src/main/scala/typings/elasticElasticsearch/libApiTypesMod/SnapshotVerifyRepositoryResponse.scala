package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnapshotVerifyRepositoryResponse extends StObject {
  
  var nodes: Record[String, SnapshotVerifyRepositoryCompactNodeInfo]
}
object SnapshotVerifyRepositoryResponse {
  
  inline def apply(nodes: Record[String, SnapshotVerifyRepositoryCompactNodeInfo]): SnapshotVerifyRepositoryResponse = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotVerifyRepositoryResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SnapshotVerifyRepositoryResponse] (val x: Self) extends AnyVal {
    
    inline def setNodes(value: Record[String, SnapshotVerifyRepositoryCompactNodeInfo]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
  }
}
