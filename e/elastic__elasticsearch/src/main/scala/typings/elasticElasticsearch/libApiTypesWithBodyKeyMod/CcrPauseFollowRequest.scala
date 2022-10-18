package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CcrPauseFollowRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var index: IndexName
}
object CcrPauseFollowRequest {
  
  inline def apply(index: IndexName): CcrPauseFollowRequest = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[CcrPauseFollowRequest]
  }
  
  extension [Self <: CcrPauseFollowRequest](x: Self) {
    
    inline def setIndex(value: IndexName): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
  }
}
