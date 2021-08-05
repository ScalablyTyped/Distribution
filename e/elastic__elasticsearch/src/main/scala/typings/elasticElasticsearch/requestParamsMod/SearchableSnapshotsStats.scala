package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchableSnapshotsStats
  extends StObject
     with Generic {
  
  var index: js.UndefOr[String | js.Array[String]] = js.undefined
}
object SearchableSnapshotsStats {
  
  inline def apply(): SearchableSnapshotsStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchableSnapshotsStats]
  }
  
  extension [Self <: SearchableSnapshotsStats](x: Self) {
    
    inline def setIndex(value: String | js.Array[String]): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setIndexVarargs(value: String*): Self = StObject.set(x, "index", js.Array(value :_*))
  }
}
