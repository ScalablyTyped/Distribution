package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CatRepositoriesRepositoriesRecord extends StObject {
  
  var id: js.UndefOr[String] = js.undefined
  
  var repoId: js.UndefOr[String] = js.undefined
  
  var t: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object CatRepositoriesRepositoriesRecord {
  
  inline def apply(): CatRepositoriesRepositoriesRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CatRepositoriesRepositoriesRecord]
  }
  
  extension [Self <: CatRepositoriesRepositoriesRecord](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setRepoId(value: String): Self = StObject.set(x, "repoId", value.asInstanceOf[js.Any])
    
    inline def setRepoIdUndefined: Self = StObject.set(x, "repoId", js.undefined)
    
    inline def setT(value: String): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
    
    inline def setTUndefined: Self = StObject.set(x, "t", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
