package typings.elasticElasticsearch.requestParamsMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.d
import typings.elasticElasticsearch.elasticElasticsearchStrings.h
import typings.elasticElasticsearch.elasticElasticsearchStrings.m
import typings.elasticElasticsearch.elasticElasticsearchStrings.micros
import typings.elasticElasticsearch.elasticElasticsearchStrings.ms
import typings.elasticElasticsearch.elasticElasticsearchStrings.nanos
import typings.elasticElasticsearch.elasticElasticsearchStrings.s
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CatHealth
  extends StObject
     with Generic {
  
  var format: js.UndefOr[String] = js.undefined
  
  var h: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var help: js.UndefOr[Boolean] = js.undefined
  
  var s: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var time: js.UndefOr[d | h | m | s | ms | micros | nanos] = js.undefined
  
  var ts: js.UndefOr[Boolean] = js.undefined
  
  var v: js.UndefOr[Boolean] = js.undefined
}
object CatHealth {
  
  inline def apply(): CatHealth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CatHealth]
  }
  
  extension [Self <: CatHealth](x: Self) {
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setH(value: String | js.Array[String]): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
    
    inline def setHUndefined: Self = StObject.set(x, "h", js.undefined)
    
    inline def setHVarargs(value: String*): Self = StObject.set(x, "h", js.Array(value :_*))
    
    inline def setHelp(value: Boolean): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
    
    inline def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
    
    inline def setS(value: String | js.Array[String]): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    
    inline def setSUndefined: Self = StObject.set(x, "s", js.undefined)
    
    inline def setSVarargs(value: String*): Self = StObject.set(x, "s", js.Array(value :_*))
    
    inline def setTime(value: d | h | m | s | ms | micros | nanos): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    
    inline def setTs(value: Boolean): Self = StObject.set(x, "ts", value.asInstanceOf[js.Any])
    
    inline def setTsUndefined: Self = StObject.set(x, "ts", js.undefined)
    
    inline def setV(value: Boolean): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    
    inline def setVUndefined: Self = StObject.set(x, "v", js.undefined)
  }
}
