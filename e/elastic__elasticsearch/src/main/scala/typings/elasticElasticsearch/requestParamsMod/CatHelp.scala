package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CatHelp
  extends StObject
     with Generic {
  
  var help: js.UndefOr[Boolean] = js.undefined
  
  var s: js.UndefOr[String | js.Array[String]] = js.undefined
}
object CatHelp {
  
  inline def apply(): CatHelp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CatHelp]
  }
  
  extension [Self <: CatHelp](x: Self) {
    
    inline def setHelp(value: Boolean): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
    
    inline def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
    
    inline def setS(value: String | js.Array[String]): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    
    inline def setSUndefined: Self = StObject.set(x, "s", js.undefined)
    
    inline def setSVarargs(value: String*): Self = StObject.set(x, "s", js.Array(value :_*))
  }
}
