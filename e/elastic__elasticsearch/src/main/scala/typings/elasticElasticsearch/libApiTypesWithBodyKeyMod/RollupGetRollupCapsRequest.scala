package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RollupGetRollupCapsRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var id: js.UndefOr[Id] = js.undefined
}
object RollupGetRollupCapsRequest {
  
  inline def apply(): RollupGetRollupCapsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RollupGetRollupCapsRequest]
  }
  
  extension [Self <: RollupGetRollupCapsRequest](x: Self) {
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
