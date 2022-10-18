package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchHighlightBase extends StObject {
  
  var boundary_chars: js.UndefOr[String] = js.undefined
  
  var boundary_max_scan: js.UndefOr[integer] = js.undefined
  
  var boundary_scanner: js.UndefOr[SearchBoundaryScanner] = js.undefined
  
  var boundary_scanner_locale: js.UndefOr[String] = js.undefined
  
  var force_source: js.UndefOr[Boolean] = js.undefined
  
  var fragment_size: js.UndefOr[integer] = js.undefined
  
  var fragmenter: js.UndefOr[SearchHighlighterFragmenter] = js.undefined
  
  var highlight_filter: js.UndefOr[Boolean] = js.undefined
  
  var highlight_query: js.UndefOr[QueryDslQueryContainer] = js.undefined
  
  var max_analyzed_offset: js.UndefOr[integer] = js.undefined
  
  var max_fragment_length: js.UndefOr[integer] = js.undefined
  
  var no_match_size: js.UndefOr[integer] = js.undefined
  
  var number_of_fragments: js.UndefOr[integer] = js.undefined
  
  var options: js.UndefOr[Record[String, Any]] = js.undefined
  
  var order: js.UndefOr[SearchHighlighterOrder] = js.undefined
  
  var phrase_limit: js.UndefOr[integer] = js.undefined
  
  var post_tags: js.UndefOr[js.Array[String]] = js.undefined
  
  var pre_tags: js.UndefOr[js.Array[String]] = js.undefined
  
  var require_field_match: js.UndefOr[Boolean] = js.undefined
  
  var tags_schema: js.UndefOr[SearchHighlighterTagsSchema] = js.undefined
  
  var `type`: js.UndefOr[SearchHighlighterType] = js.undefined
}
object SearchHighlightBase {
  
  inline def apply(): SearchHighlightBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchHighlightBase]
  }
  
  extension [Self <: SearchHighlightBase](x: Self) {
    
    inline def setBoundary_chars(value: String): Self = StObject.set(x, "boundary_chars", value.asInstanceOf[js.Any])
    
    inline def setBoundary_charsUndefined: Self = StObject.set(x, "boundary_chars", js.undefined)
    
    inline def setBoundary_max_scan(value: integer): Self = StObject.set(x, "boundary_max_scan", value.asInstanceOf[js.Any])
    
    inline def setBoundary_max_scanUndefined: Self = StObject.set(x, "boundary_max_scan", js.undefined)
    
    inline def setBoundary_scanner(value: SearchBoundaryScanner): Self = StObject.set(x, "boundary_scanner", value.asInstanceOf[js.Any])
    
    inline def setBoundary_scannerUndefined: Self = StObject.set(x, "boundary_scanner", js.undefined)
    
    inline def setBoundary_scanner_locale(value: String): Self = StObject.set(x, "boundary_scanner_locale", value.asInstanceOf[js.Any])
    
    inline def setBoundary_scanner_localeUndefined: Self = StObject.set(x, "boundary_scanner_locale", js.undefined)
    
    inline def setForce_source(value: Boolean): Self = StObject.set(x, "force_source", value.asInstanceOf[js.Any])
    
    inline def setForce_sourceUndefined: Self = StObject.set(x, "force_source", js.undefined)
    
    inline def setFragment_size(value: integer): Self = StObject.set(x, "fragment_size", value.asInstanceOf[js.Any])
    
    inline def setFragment_sizeUndefined: Self = StObject.set(x, "fragment_size", js.undefined)
    
    inline def setFragmenter(value: SearchHighlighterFragmenter): Self = StObject.set(x, "fragmenter", value.asInstanceOf[js.Any])
    
    inline def setFragmenterUndefined: Self = StObject.set(x, "fragmenter", js.undefined)
    
    inline def setHighlight_filter(value: Boolean): Self = StObject.set(x, "highlight_filter", value.asInstanceOf[js.Any])
    
    inline def setHighlight_filterUndefined: Self = StObject.set(x, "highlight_filter", js.undefined)
    
    inline def setHighlight_query(value: QueryDslQueryContainer): Self = StObject.set(x, "highlight_query", value.asInstanceOf[js.Any])
    
    inline def setHighlight_queryUndefined: Self = StObject.set(x, "highlight_query", js.undefined)
    
    inline def setMax_analyzed_offset(value: integer): Self = StObject.set(x, "max_analyzed_offset", value.asInstanceOf[js.Any])
    
    inline def setMax_analyzed_offsetUndefined: Self = StObject.set(x, "max_analyzed_offset", js.undefined)
    
    inline def setMax_fragment_length(value: integer): Self = StObject.set(x, "max_fragment_length", value.asInstanceOf[js.Any])
    
    inline def setMax_fragment_lengthUndefined: Self = StObject.set(x, "max_fragment_length", js.undefined)
    
    inline def setNo_match_size(value: integer): Self = StObject.set(x, "no_match_size", value.asInstanceOf[js.Any])
    
    inline def setNo_match_sizeUndefined: Self = StObject.set(x, "no_match_size", js.undefined)
    
    inline def setNumber_of_fragments(value: integer): Self = StObject.set(x, "number_of_fragments", value.asInstanceOf[js.Any])
    
    inline def setNumber_of_fragmentsUndefined: Self = StObject.set(x, "number_of_fragments", js.undefined)
    
    inline def setOptions(value: Record[String, Any]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setOrder(value: SearchHighlighterOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setPhrase_limit(value: integer): Self = StObject.set(x, "phrase_limit", value.asInstanceOf[js.Any])
    
    inline def setPhrase_limitUndefined: Self = StObject.set(x, "phrase_limit", js.undefined)
    
    inline def setPost_tags(value: js.Array[String]): Self = StObject.set(x, "post_tags", value.asInstanceOf[js.Any])
    
    inline def setPost_tagsUndefined: Self = StObject.set(x, "post_tags", js.undefined)
    
    inline def setPost_tagsVarargs(value: String*): Self = StObject.set(x, "post_tags", js.Array(value*))
    
    inline def setPre_tags(value: js.Array[String]): Self = StObject.set(x, "pre_tags", value.asInstanceOf[js.Any])
    
    inline def setPre_tagsUndefined: Self = StObject.set(x, "pre_tags", js.undefined)
    
    inline def setPre_tagsVarargs(value: String*): Self = StObject.set(x, "pre_tags", js.Array(value*))
    
    inline def setRequire_field_match(value: Boolean): Self = StObject.set(x, "require_field_match", value.asInstanceOf[js.Any])
    
    inline def setRequire_field_matchUndefined: Self = StObject.set(x, "require_field_match", js.undefined)
    
    inline def setTags_schema(value: SearchHighlighterTagsSchema): Self = StObject.set(x, "tags_schema", value.asInstanceOf[js.Any])
    
    inline def setTags_schemaUndefined: Self = StObject.set(x, "tags_schema", js.undefined)
    
    inline def setType(value: SearchHighlighterType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
