package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherReportingEmailAttachment extends StObject {
  
  var `inline`: js.UndefOr[Boolean] = js.undefined
  
  var interval: js.UndefOr[Duration] = js.undefined
  
  var request: js.UndefOr[WatcherHttpInputRequestDefinition] = js.undefined
  
  var retries: js.UndefOr[integer] = js.undefined
  
  var url: String
}
object WatcherReportingEmailAttachment {
  
  inline def apply(url: String): WatcherReportingEmailAttachment = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherReportingEmailAttachment]
  }
  
  extension [Self <: WatcherReportingEmailAttachment](x: Self) {
    
    inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
    
    inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
    
    inline def setInterval(value: Duration): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    inline def setRequest(value: WatcherHttpInputRequestDefinition): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    inline def setRetries(value: integer): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
    
    inline def setRetriesUndefined: Self = StObject.set(x, "retries", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
