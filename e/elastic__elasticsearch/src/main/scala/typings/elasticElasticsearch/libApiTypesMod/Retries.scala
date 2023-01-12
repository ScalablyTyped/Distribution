package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Retries extends StObject {
  
  var bulk: long
  
  var search: long
}
object Retries {
  
  inline def apply(bulk: long, search: long): Retries = {
    val __obj = js.Dynamic.literal(bulk = bulk.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
    __obj.asInstanceOf[Retries]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Retries] (val x: Self) extends AnyVal {
    
    inline def setBulk(value: long): Self = StObject.set(x, "bulk", value.asInstanceOf[js.Any])
    
    inline def setSearch(value: long): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
  }
}
