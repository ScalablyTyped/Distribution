package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherIndexResultSummary extends StObject {
  
  var created: Boolean
  
  var id: Id
  
  var index: IndexName
  
  var result: Result
  
  var version: VersionNumber
}
object WatcherIndexResultSummary {
  
  inline def apply(created: Boolean, id: Id, index: IndexName, result: Result, version: VersionNumber): WatcherIndexResultSummary = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherIndexResultSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WatcherIndexResultSummary] (val x: Self) extends AnyVal {
    
    inline def setCreated(value: Boolean): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: IndexName): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setResult(value: Result): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: VersionNumber): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
