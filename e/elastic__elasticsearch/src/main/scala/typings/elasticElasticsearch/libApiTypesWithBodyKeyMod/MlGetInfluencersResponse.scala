package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlGetInfluencersResponse extends StObject {
  
  var count: long
  
  var influencers: js.Array[MlInfluencer]
}
object MlGetInfluencersResponse {
  
  inline def apply(count: long, influencers: js.Array[MlInfluencer]): MlGetInfluencersResponse = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], influencers = influencers.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlGetInfluencersResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlGetInfluencersResponse] (val x: Self) extends AnyVal {
    
    inline def setCount(value: long): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setInfluencers(value: js.Array[MlInfluencer]): Self = StObject.set(x, "influencers", value.asInstanceOf[js.Any])
    
    inline def setInfluencersVarargs(value: MlInfluencer*): Self = StObject.set(x, "influencers", js.Array(value*))
  }
}
