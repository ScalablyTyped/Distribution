package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchStats extends StObject {
  
  var fetch_current: long
  
  var fetch_time: js.UndefOr[Duration] = js.undefined
  
  var fetch_time_in_millis: DurationValue[UnitMillis]
  
  var fetch_total: long
  
  var groups: js.UndefOr[Record[String, SearchStats]] = js.undefined
  
  var open_contexts: js.UndefOr[long] = js.undefined
  
  var query_current: long
  
  var query_time: js.UndefOr[Duration] = js.undefined
  
  var query_time_in_millis: DurationValue[UnitMillis]
  
  var query_total: long
  
  var scroll_current: long
  
  var scroll_time: js.UndefOr[Duration] = js.undefined
  
  var scroll_time_in_millis: DurationValue[UnitMillis]
  
  var scroll_total: long
  
  var suggest_current: long
  
  var suggest_time: js.UndefOr[Duration] = js.undefined
  
  var suggest_time_in_millis: DurationValue[UnitMillis]
  
  var suggest_total: long
}
object SearchStats {
  
  inline def apply(
    fetch_current: long,
    fetch_time_in_millis: DurationValue[UnitMillis],
    fetch_total: long,
    query_current: long,
    query_time_in_millis: DurationValue[UnitMillis],
    query_total: long,
    scroll_current: long,
    scroll_time_in_millis: DurationValue[UnitMillis],
    scroll_total: long,
    suggest_current: long,
    suggest_time_in_millis: DurationValue[UnitMillis],
    suggest_total: long
  ): SearchStats = {
    val __obj = js.Dynamic.literal(fetch_current = fetch_current.asInstanceOf[js.Any], fetch_time_in_millis = fetch_time_in_millis.asInstanceOf[js.Any], fetch_total = fetch_total.asInstanceOf[js.Any], query_current = query_current.asInstanceOf[js.Any], query_time_in_millis = query_time_in_millis.asInstanceOf[js.Any], query_total = query_total.asInstanceOf[js.Any], scroll_current = scroll_current.asInstanceOf[js.Any], scroll_time_in_millis = scroll_time_in_millis.asInstanceOf[js.Any], scroll_total = scroll_total.asInstanceOf[js.Any], suggest_current = suggest_current.asInstanceOf[js.Any], suggest_time_in_millis = suggest_time_in_millis.asInstanceOf[js.Any], suggest_total = suggest_total.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchStats]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchStats] (val x: Self) extends AnyVal {
    
    inline def setFetch_current(value: long): Self = StObject.set(x, "fetch_current", value.asInstanceOf[js.Any])
    
    inline def setFetch_time(value: Duration): Self = StObject.set(x, "fetch_time", value.asInstanceOf[js.Any])
    
    inline def setFetch_timeUndefined: Self = StObject.set(x, "fetch_time", js.undefined)
    
    inline def setFetch_time_in_millis(value: DurationValue[UnitMillis]): Self = StObject.set(x, "fetch_time_in_millis", value.asInstanceOf[js.Any])
    
    inline def setFetch_total(value: long): Self = StObject.set(x, "fetch_total", value.asInstanceOf[js.Any])
    
    inline def setGroups(value: Record[String, SearchStats]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    inline def setOpen_contexts(value: long): Self = StObject.set(x, "open_contexts", value.asInstanceOf[js.Any])
    
    inline def setOpen_contextsUndefined: Self = StObject.set(x, "open_contexts", js.undefined)
    
    inline def setQuery_current(value: long): Self = StObject.set(x, "query_current", value.asInstanceOf[js.Any])
    
    inline def setQuery_time(value: Duration): Self = StObject.set(x, "query_time", value.asInstanceOf[js.Any])
    
    inline def setQuery_timeUndefined: Self = StObject.set(x, "query_time", js.undefined)
    
    inline def setQuery_time_in_millis(value: DurationValue[UnitMillis]): Self = StObject.set(x, "query_time_in_millis", value.asInstanceOf[js.Any])
    
    inline def setQuery_total(value: long): Self = StObject.set(x, "query_total", value.asInstanceOf[js.Any])
    
    inline def setScroll_current(value: long): Self = StObject.set(x, "scroll_current", value.asInstanceOf[js.Any])
    
    inline def setScroll_time(value: Duration): Self = StObject.set(x, "scroll_time", value.asInstanceOf[js.Any])
    
    inline def setScroll_timeUndefined: Self = StObject.set(x, "scroll_time", js.undefined)
    
    inline def setScroll_time_in_millis(value: DurationValue[UnitMillis]): Self = StObject.set(x, "scroll_time_in_millis", value.asInstanceOf[js.Any])
    
    inline def setScroll_total(value: long): Self = StObject.set(x, "scroll_total", value.asInstanceOf[js.Any])
    
    inline def setSuggest_current(value: long): Self = StObject.set(x, "suggest_current", value.asInstanceOf[js.Any])
    
    inline def setSuggest_time(value: Duration): Self = StObject.set(x, "suggest_time", value.asInstanceOf[js.Any])
    
    inline def setSuggest_timeUndefined: Self = StObject.set(x, "suggest_time", js.undefined)
    
    inline def setSuggest_time_in_millis(value: DurationValue[UnitMillis]): Self = StObject.set(x, "suggest_time_in_millis", value.asInstanceOf[js.Any])
    
    inline def setSuggest_total(value: long): Self = StObject.set(x, "suggest_total", value.asInstanceOf[js.Any])
  }
}
