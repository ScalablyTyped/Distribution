package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BulkIndexByScrollFailure extends StObject {
  
  var cause: ErrorCause
  
  var id: Id
  
  var index: IndexName
  
  var status: integer
  
  var `type`: String
}
object BulkIndexByScrollFailure {
  
  inline def apply(cause: ErrorCause, id: Id, index: IndexName, status: integer, `type`: String): BulkIndexByScrollFailure = {
    val __obj = js.Dynamic.literal(cause = cause.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkIndexByScrollFailure]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BulkIndexByScrollFailure] (val x: Self) extends AnyVal {
    
    inline def setCause(value: ErrorCause): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: IndexName): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: integer): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
