package typings.elasticElasticsearch.requestParamsMod

import typings.elasticElasticsearch.elasticElasticsearchStrings._empty
import typings.elasticElasticsearch.elasticElasticsearchStrings.g
import typings.elasticElasticsearch.elasticElasticsearchStrings.k
import typings.elasticElasticsearch.elasticElasticsearchStrings.m
import typings.elasticElasticsearch.elasticElasticsearchStrings.p
import typings.elasticElasticsearch.elasticElasticsearchStrings.t
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CatThreadPool
  extends StObject
     with Generic {
  
  var format: js.UndefOr[String] = js.undefined
  
  var h: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var help: js.UndefOr[Boolean] = js.undefined
  
  var local: js.UndefOr[Boolean] = js.undefined
  
  var master_timeout: js.UndefOr[String] = js.undefined
  
  var s: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var size: js.UndefOr[_empty | k | m | g | t | p] = js.undefined
  
  var thread_pool_patterns: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var v: js.UndefOr[Boolean] = js.undefined
}
object CatThreadPool {
  
  inline def apply(): CatThreadPool = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CatThreadPool]
  }
  
  extension [Self <: CatThreadPool](x: Self) {
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setH(value: String | js.Array[String]): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
    
    inline def setHUndefined: Self = StObject.set(x, "h", js.undefined)
    
    inline def setHVarargs(value: String*): Self = StObject.set(x, "h", js.Array(value :_*))
    
    inline def setHelp(value: Boolean): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
    
    inline def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
    
    inline def setLocal(value: Boolean): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    inline def setLocalUndefined: Self = StObject.set(x, "local", js.undefined)
    
    inline def setMaster_timeout(value: String): Self = StObject.set(x, "master_timeout", value.asInstanceOf[js.Any])
    
    inline def setMaster_timeoutUndefined: Self = StObject.set(x, "master_timeout", js.undefined)
    
    inline def setS(value: String | js.Array[String]): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    
    inline def setSUndefined: Self = StObject.set(x, "s", js.undefined)
    
    inline def setSVarargs(value: String*): Self = StObject.set(x, "s", js.Array(value :_*))
    
    inline def setSize(value: _empty | k | m | g | t | p): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setThread_pool_patterns(value: String | js.Array[String]): Self = StObject.set(x, "thread_pool_patterns", value.asInstanceOf[js.Any])
    
    inline def setThread_pool_patternsUndefined: Self = StObject.set(x, "thread_pool_patterns", js.undefined)
    
    inline def setThread_pool_patternsVarargs(value: String*): Self = StObject.set(x, "thread_pool_patterns", js.Array(value :_*))
    
    inline def setV(value: Boolean): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    
    inline def setVUndefined: Self = StObject.set(x, "v", js.undefined)
  }
}
