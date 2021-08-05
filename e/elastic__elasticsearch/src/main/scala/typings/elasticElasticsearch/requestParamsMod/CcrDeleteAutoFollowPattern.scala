package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CcrDeleteAutoFollowPattern
  extends StObject
     with Generic {
  
  var name: String
}
object CcrDeleteAutoFollowPattern {
  
  inline def apply(name: String): CcrDeleteAutoFollowPattern = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CcrDeleteAutoFollowPattern]
  }
  
  extension [Self <: CcrDeleteAutoFollowPattern](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
