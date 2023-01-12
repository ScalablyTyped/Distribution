package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CatSnapshotsRequest
  extends StObject
     with CatCatRequestBase {
  
  var ignore_unavailable: js.UndefOr[Boolean] = js.undefined
  
  var repository: js.UndefOr[Names] = js.undefined
}
object CatSnapshotsRequest {
  
  inline def apply(): CatSnapshotsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CatSnapshotsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CatSnapshotsRequest] (val x: Self) extends AnyVal {
    
    inline def setIgnore_unavailable(value: Boolean): Self = StObject.set(x, "ignore_unavailable", value.asInstanceOf[js.Any])
    
    inline def setIgnore_unavailableUndefined: Self = StObject.set(x, "ignore_unavailable", js.undefined)
    
    inline def setRepository(value: Names): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
    
    inline def setRepositoryVarargs(value: Name*): Self = StObject.set(x, "repository", js.Array(value*))
  }
}
