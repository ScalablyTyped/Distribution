package typings.elasticElasticsearch.requestParamsMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.b
import typings.elasticElasticsearch.elasticElasticsearchStrings.d
import typings.elasticElasticsearch.elasticElasticsearchStrings.g
import typings.elasticElasticsearch.elasticElasticsearchStrings.gb
import typings.elasticElasticsearch.elasticElasticsearchStrings.h
import typings.elasticElasticsearch.elasticElasticsearchStrings.k
import typings.elasticElasticsearch.elasticElasticsearchStrings.kb
import typings.elasticElasticsearch.elasticElasticsearchStrings.m
import typings.elasticElasticsearch.elasticElasticsearchStrings.mb
import typings.elasticElasticsearch.elasticElasticsearchStrings.micros
import typings.elasticElasticsearch.elasticElasticsearchStrings.ms
import typings.elasticElasticsearch.elasticElasticsearchStrings.nanos
import typings.elasticElasticsearch.elasticElasticsearchStrings.p
import typings.elasticElasticsearch.elasticElasticsearchStrings.pb
import typings.elasticElasticsearch.elasticElasticsearchStrings.s
import typings.elasticElasticsearch.elasticElasticsearchStrings.t
import typings.elasticElasticsearch.elasticElasticsearchStrings.tb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CatRecovery
  extends StObject
     with Generic {
  
  var active_only: js.UndefOr[Boolean] = js.undefined
  
  var bytes: js.UndefOr[b | k | kb | m | mb | g | gb | t | tb | p | pb] = js.undefined
  
  var detailed: js.UndefOr[Boolean] = js.undefined
  
  var format: js.UndefOr[String] = js.undefined
  
  var h: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var help: js.UndefOr[Boolean] = js.undefined
  
  var index: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var s: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var time: js.UndefOr[d | h | m | s | ms | micros | nanos] = js.undefined
  
  var v: js.UndefOr[Boolean] = js.undefined
}
object CatRecovery {
  
  inline def apply(): CatRecovery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CatRecovery]
  }
  
  extension [Self <: CatRecovery](x: Self) {
    
    inline def setActive_only(value: Boolean): Self = StObject.set(x, "active_only", value.asInstanceOf[js.Any])
    
    inline def setActive_onlyUndefined: Self = StObject.set(x, "active_only", js.undefined)
    
    inline def setBytes(value: b | k | kb | m | mb | g | gb | t | tb | p | pb): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
    
    inline def setBytesUndefined: Self = StObject.set(x, "bytes", js.undefined)
    
    inline def setDetailed(value: Boolean): Self = StObject.set(x, "detailed", value.asInstanceOf[js.Any])
    
    inline def setDetailedUndefined: Self = StObject.set(x, "detailed", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setH(value: String | js.Array[String]): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
    
    inline def setHUndefined: Self = StObject.set(x, "h", js.undefined)
    
    inline def setHVarargs(value: String*): Self = StObject.set(x, "h", js.Array(value :_*))
    
    inline def setHelp(value: Boolean): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
    
    inline def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
    
    inline def setIndex(value: String | js.Array[String]): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setIndexVarargs(value: String*): Self = StObject.set(x, "index", js.Array(value :_*))
    
    inline def setS(value: String | js.Array[String]): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    
    inline def setSUndefined: Self = StObject.set(x, "s", js.undefined)
    
    inline def setSVarargs(value: String*): Self = StObject.set(x, "s", js.Array(value :_*))
    
    inline def setTime(value: d | h | m | s | ms | micros | nanos): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    
    inline def setV(value: Boolean): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    
    inline def setVUndefined: Self = StObject.set(x, "v", js.undefined)
  }
}
