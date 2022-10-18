package typings.elasticElasticsearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Jobids extends StObject {
  
  var description: js.UndefOr[String] = js.undefined
  
  var job_ids: js.UndefOr[js.Array[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Id]] = js.undefined
}
object Jobids {
  
  inline def apply(): Jobids = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Jobids]
  }
  
  extension [Self <: Jobids](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setJob_ids(value: js.Array[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Id]): Self = StObject.set(x, "job_ids", value.asInstanceOf[js.Any])
    
    inline def setJob_idsUndefined: Self = StObject.set(x, "job_ids", js.undefined)
    
    inline def setJob_idsVarargs(value: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Id*): Self = StObject.set(x, "job_ids", js.Array(value*))
  }
}
