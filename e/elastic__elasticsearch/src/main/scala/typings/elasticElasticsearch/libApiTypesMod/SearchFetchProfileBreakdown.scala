package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchFetchProfileBreakdown extends StObject {
  
  var load_source: js.UndefOr[integer] = js.undefined
  
  var load_source_count: js.UndefOr[integer] = js.undefined
  
  var load_stored_fields: js.UndefOr[integer] = js.undefined
  
  var load_stored_fields_count: js.UndefOr[integer] = js.undefined
  
  var next_reader: js.UndefOr[integer] = js.undefined
  
  var next_reader_count: js.UndefOr[integer] = js.undefined
  
  var process: js.UndefOr[integer] = js.undefined
  
  var process_count: js.UndefOr[integer] = js.undefined
}
object SearchFetchProfileBreakdown {
  
  inline def apply(): SearchFetchProfileBreakdown = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchFetchProfileBreakdown]
  }
  
  extension [Self <: SearchFetchProfileBreakdown](x: Self) {
    
    inline def setLoad_source(value: integer): Self = StObject.set(x, "load_source", value.asInstanceOf[js.Any])
    
    inline def setLoad_sourceUndefined: Self = StObject.set(x, "load_source", js.undefined)
    
    inline def setLoad_source_count(value: integer): Self = StObject.set(x, "load_source_count", value.asInstanceOf[js.Any])
    
    inline def setLoad_source_countUndefined: Self = StObject.set(x, "load_source_count", js.undefined)
    
    inline def setLoad_stored_fields(value: integer): Self = StObject.set(x, "load_stored_fields", value.asInstanceOf[js.Any])
    
    inline def setLoad_stored_fieldsUndefined: Self = StObject.set(x, "load_stored_fields", js.undefined)
    
    inline def setLoad_stored_fields_count(value: integer): Self = StObject.set(x, "load_stored_fields_count", value.asInstanceOf[js.Any])
    
    inline def setLoad_stored_fields_countUndefined: Self = StObject.set(x, "load_stored_fields_count", js.undefined)
    
    inline def setNext_reader(value: integer): Self = StObject.set(x, "next_reader", value.asInstanceOf[js.Any])
    
    inline def setNext_readerUndefined: Self = StObject.set(x, "next_reader", js.undefined)
    
    inline def setNext_reader_count(value: integer): Self = StObject.set(x, "next_reader_count", value.asInstanceOf[js.Any])
    
    inline def setNext_reader_countUndefined: Self = StObject.set(x, "next_reader_count", js.undefined)
    
    inline def setProcess(value: integer): Self = StObject.set(x, "process", value.asInstanceOf[js.Any])
    
    inline def setProcessUndefined: Self = StObject.set(x, "process", js.undefined)
    
    inline def setProcess_count(value: integer): Self = StObject.set(x, "process_count", value.asInstanceOf[js.Any])
    
    inline def setProcess_countUndefined: Self = StObject.set(x, "process_count", js.undefined)
  }
}
