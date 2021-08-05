package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RollupGetJobs
  extends StObject
     with Generic {
  
  var id: js.UndefOr[String] = js.undefined
}
object RollupGetJobs {
  
  inline def apply(): RollupGetJobs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RollupGetJobs]
  }
  
  extension [Self <: RollupGetJobs](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
