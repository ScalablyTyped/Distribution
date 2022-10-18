package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CcrPauseAutoFollowPatternRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var name: Name
}
object CcrPauseAutoFollowPatternRequest {
  
  inline def apply(name: Name): CcrPauseAutoFollowPatternRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CcrPauseAutoFollowPatternRequest]
  }
  
  extension [Self <: CcrPauseAutoFollowPatternRequest](x: Self) {
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
