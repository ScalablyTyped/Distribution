package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchableSnapshotsStatsRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var index: js.UndefOr[Indices] = js.undefined
  
  var level: js.UndefOr[SearchableSnapshotsStatsLevel] = js.undefined
}
object SearchableSnapshotsStatsRequest {
  
  inline def apply(): SearchableSnapshotsStatsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchableSnapshotsStatsRequest]
  }
  
  extension [Self <: SearchableSnapshotsStatsRequest](x: Self) {
    
    inline def setIndex(value: Indices): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setIndexVarargs(value: IndexName*): Self = StObject.set(x, "index", js.Array(value*))
    
    inline def setLevel(value: SearchableSnapshotsStatsLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
  }
}
