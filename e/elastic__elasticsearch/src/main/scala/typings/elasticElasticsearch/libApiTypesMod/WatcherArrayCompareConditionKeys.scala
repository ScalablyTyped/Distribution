package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherArrayCompareConditionKeys extends StObject {
  
  var path: String
}
object WatcherArrayCompareConditionKeys {
  
  inline def apply(path: String): WatcherArrayCompareConditionKeys = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherArrayCompareConditionKeys]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WatcherArrayCompareConditionKeys] (val x: Self) extends AnyVal {
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
