package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CcrDeleteAutoFollowPatternRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var name: Name
}
object CcrDeleteAutoFollowPatternRequest {
  
  inline def apply(name: Name): CcrDeleteAutoFollowPatternRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CcrDeleteAutoFollowPatternRequest]
  }
  
  extension [Self <: CcrDeleteAutoFollowPatternRequest](x: Self) {
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
