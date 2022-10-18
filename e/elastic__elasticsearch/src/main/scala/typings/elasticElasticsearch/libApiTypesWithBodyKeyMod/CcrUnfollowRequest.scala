package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CcrUnfollowRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var index: IndexName
}
object CcrUnfollowRequest {
  
  inline def apply(index: IndexName): CcrUnfollowRequest = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[CcrUnfollowRequest]
  }
  
  extension [Self <: CcrUnfollowRequest](x: Self) {
    
    inline def setIndex(value: IndexName): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
  }
}
