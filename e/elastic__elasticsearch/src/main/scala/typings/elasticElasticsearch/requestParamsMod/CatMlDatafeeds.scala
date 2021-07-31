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

trait CatMlDatafeeds
  extends StObject
     with Generic {
  
  var allow_no_datafeeds: js.UndefOr[Boolean] = js.undefined
  
  var allow_no_match: js.UndefOr[Boolean] = js.undefined
  
  var datafeed_id: js.UndefOr[String] = js.undefined
  
  var format: js.UndefOr[String] = js.undefined
  
  var h: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var help: js.UndefOr[Boolean] = js.undefined
  
  var s: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var time: js.UndefOr[d | h | m | s | ms | micros | nanos] = js.undefined
  
  var v: js.UndefOr[Boolean] = js.undefined
}
object CatMlDatafeeds {
  
  @scala.inline
  def apply(): CatMlDatafeeds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CatMlDatafeeds]
  }
  
  @scala.inline
  implicit class CatMlDatafeedsMutableBuilder[Self <: CatMlDatafeeds] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllow_no_datafeeds(value: Boolean): Self = StObject.set(x, "allow_no_datafeeds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllow_no_datafeedsUndefined: Self = StObject.set(x, "allow_no_datafeeds", js.undefined)
    
    @scala.inline
    def setAllow_no_match(value: Boolean): Self = StObject.set(x, "allow_no_match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllow_no_matchUndefined: Self = StObject.set(x, "allow_no_match", js.undefined)
    
    @scala.inline
    def setDatafeed_id(value: String): Self = StObject.set(x, "datafeed_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatafeed_idUndefined: Self = StObject.set(x, "datafeed_id", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setH(value: String | js.Array[String]): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHUndefined: Self = StObject.set(x, "h", js.undefined)
    
    @scala.inline
    def setHVarargs(value: String*): Self = StObject.set(x, "h", js.Array(value :_*))
    
    @scala.inline
    def setHelp(value: Boolean): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
    
    @scala.inline
    def setS(value: String | js.Array[String]): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSUndefined: Self = StObject.set(x, "s", js.undefined)
    
    @scala.inline
    def setSVarargs(value: String*): Self = StObject.set(x, "s", js.Array(value :_*))
    
    @scala.inline
    def setTime(value: d | h | m | s | ms | micros | nanos): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    
    @scala.inline
    def setV(value: Boolean): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVUndefined: Self = StObject.set(x, "v", js.undefined)
  }
}
