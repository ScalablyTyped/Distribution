package typings.elasticElasticsearch.libHelpersMod

import typings.elasticElasticsearch.libApiTypesMod.BulkIndexOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexAction
  extends StObject
     with _Action {
  
  var index: BulkIndexOperation
}
object IndexAction {
  
  inline def apply(index: BulkIndexOperation): IndexAction = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndexAction] (val x: Self) extends AnyVal {
    
    inline def setIndex(value: BulkIndexOperation): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
  }
}
