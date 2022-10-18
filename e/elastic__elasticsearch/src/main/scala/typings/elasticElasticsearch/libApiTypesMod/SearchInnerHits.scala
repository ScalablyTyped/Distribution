package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchInnerHits extends StObject {
  
  var _source: js.UndefOr[SearchSourceConfig] = js.undefined
  
  var collapse: js.UndefOr[SearchFieldCollapse] = js.undefined
  
  var docvalue_fields: js.UndefOr[js.Array[QueryDslFieldAndFormat | Field]] = js.undefined
  
  var explain: js.UndefOr[Boolean] = js.undefined
  
  var fields: js.UndefOr[Fields] = js.undefined
  
  var from: js.UndefOr[integer] = js.undefined
  
  var highlight: js.UndefOr[SearchHighlight] = js.undefined
  
  var ignore_unmapped: js.UndefOr[Boolean] = js.undefined
  
  var name: js.UndefOr[Name] = js.undefined
  
  var script_fields: js.UndefOr[Record[Field, ScriptField]] = js.undefined
  
  var seq_no_primary_term: js.UndefOr[Boolean] = js.undefined
  
  var size: js.UndefOr[integer] = js.undefined
  
  var sort: js.UndefOr[Sort] = js.undefined
  
  var stored_field: js.UndefOr[Fields] = js.undefined
  
  var track_scores: js.UndefOr[Boolean] = js.undefined
  
  var version: js.UndefOr[Boolean] = js.undefined
}
object SearchInnerHits {
  
  inline def apply(): SearchInnerHits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchInnerHits]
  }
  
  extension [Self <: SearchInnerHits](x: Self) {
    
    inline def setCollapse(value: SearchFieldCollapse): Self = StObject.set(x, "collapse", value.asInstanceOf[js.Any])
    
    inline def setCollapseUndefined: Self = StObject.set(x, "collapse", js.undefined)
    
    inline def setDocvalue_fields(value: js.Array[QueryDslFieldAndFormat | Field]): Self = StObject.set(x, "docvalue_fields", value.asInstanceOf[js.Any])
    
    inline def setDocvalue_fieldsUndefined: Self = StObject.set(x, "docvalue_fields", js.undefined)
    
    inline def setDocvalue_fieldsVarargs(value: (QueryDslFieldAndFormat | Field)*): Self = StObject.set(x, "docvalue_fields", js.Array(value*))
    
    inline def setExplain(value: Boolean): Self = StObject.set(x, "explain", value.asInstanceOf[js.Any])
    
    inline def setExplainUndefined: Self = StObject.set(x, "explain", js.undefined)
    
    inline def setFields(value: Fields): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: Field*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setFrom(value: integer): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setHighlight(value: SearchHighlight): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
    
    inline def setHighlightUndefined: Self = StObject.set(x, "highlight", js.undefined)
    
    inline def setIgnore_unmapped(value: Boolean): Self = StObject.set(x, "ignore_unmapped", value.asInstanceOf[js.Any])
    
    inline def setIgnore_unmappedUndefined: Self = StObject.set(x, "ignore_unmapped", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setScript_fields(value: Record[Field, ScriptField]): Self = StObject.set(x, "script_fields", value.asInstanceOf[js.Any])
    
    inline def setScript_fieldsUndefined: Self = StObject.set(x, "script_fields", js.undefined)
    
    inline def setSeq_no_primary_term(value: Boolean): Self = StObject.set(x, "seq_no_primary_term", value.asInstanceOf[js.Any])
    
    inline def setSeq_no_primary_termUndefined: Self = StObject.set(x, "seq_no_primary_term", js.undefined)
    
    inline def setSize(value: integer): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSort(value: Sort): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setSortVarargs(value: SortCombinations*): Self = StObject.set(x, "sort", js.Array(value*))
    
    inline def setStored_field(value: Fields): Self = StObject.set(x, "stored_field", value.asInstanceOf[js.Any])
    
    inline def setStored_fieldUndefined: Self = StObject.set(x, "stored_field", js.undefined)
    
    inline def setStored_fieldVarargs(value: Field*): Self = StObject.set(x, "stored_field", js.Array(value*))
    
    inline def setTrack_scores(value: Boolean): Self = StObject.set(x, "track_scores", value.asInstanceOf[js.Any])
    
    inline def setTrack_scoresUndefined: Self = StObject.set(x, "track_scores", js.undefined)
    
    inline def setVersion(value: Boolean): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def set_source(value: SearchSourceConfig): Self = StObject.set(x, "_source", value.asInstanceOf[js.Any])
    
    inline def set_sourceUndefined: Self = StObject.set(x, "_source", js.undefined)
    
    inline def set_sourceVarargs(value: Field*): Self = StObject.set(x, "_source", js.Array(value*))
  }
}
