package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CcrGetAutoFollowPattern
  extends StObject
     with Generic {
  
  var name: js.UndefOr[String] = js.undefined
}
object CcrGetAutoFollowPattern {
  
  inline def apply(): CcrGetAutoFollowPattern = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CcrGetAutoFollowPattern]
  }
  
  extension [Self <: CcrGetAutoFollowPattern](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
