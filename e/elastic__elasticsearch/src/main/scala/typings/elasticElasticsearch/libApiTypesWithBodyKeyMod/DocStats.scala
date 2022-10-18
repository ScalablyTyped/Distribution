package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocStats extends StObject {
  
  var count: long
  
  var deleted: js.UndefOr[long] = js.undefined
}
object DocStats {
  
  inline def apply(count: long): DocStats = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocStats]
  }
  
  extension [Self <: DocStats](x: Self) {
    
    inline def setCount(value: long): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setDeleted(value: long): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
  }
}
