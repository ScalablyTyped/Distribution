package typings.elasticsearch.mod

import typings.elasticsearch.elasticsearchStrings._empty
import typings.elasticsearch.elasticsearchStrings.g
import typings.elasticsearch.elasticsearchStrings.k
import typings.elasticsearch.elasticsearchStrings.m
import typings.elasticsearch.elasticsearchStrings.p
import typings.elasticsearch.elasticsearchStrings.t
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CatThreadPoolParams
  extends StObject
     with CatCommonParams {
  
  var size: js.UndefOr[_empty | k | m | g | t | p] = js.undefined
  
  var threadPoolPatterns: js.UndefOr[NameList] = js.undefined
}
object CatThreadPoolParams {
  
  inline def apply(format: String): CatThreadPoolParams = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[CatThreadPoolParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CatThreadPoolParams] (val x: Self) extends AnyVal {
    
    inline def setSize(value: _empty | k | m | g | t | p): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setThreadPoolPatterns(value: NameList): Self = StObject.set(x, "threadPoolPatterns", value.asInstanceOf[js.Any])
    
    inline def setThreadPoolPatternsUndefined: Self = StObject.set(x, "threadPoolPatterns", js.undefined)
    
    inline def setThreadPoolPatternsVarargs(value: String*): Self = StObject.set(x, "threadPoolPatterns", js.Array(value*))
  }
}
