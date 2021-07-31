package typings.elasticElasticsearch.requestParamsMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.external
import typings.elasticElasticsearch.elasticElasticsearchStrings.external_gte
import typings.elasticElasticsearch.elasticElasticsearchStrings.force
import typings.elasticElasticsearch.elasticElasticsearchStrings.internal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Termvectors[T]
  extends StObject
     with Generic {
  
  var body: js.UndefOr[T] = js.undefined
  
  var field_statistics: js.UndefOr[Boolean] = js.undefined
  
  var fields: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var index: String
  
  var offsets: js.UndefOr[Boolean] = js.undefined
  
  var payloads: js.UndefOr[Boolean] = js.undefined
  
  var positions: js.UndefOr[Boolean] = js.undefined
  
  var preference: js.UndefOr[String] = js.undefined
  
  var realtime: js.UndefOr[Boolean] = js.undefined
  
  var routing: js.UndefOr[String] = js.undefined
  
  var term_statistics: js.UndefOr[Boolean] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var version: js.UndefOr[Double] = js.undefined
  
  var version_type: js.UndefOr[internal | external | external_gte | force] = js.undefined
}
object Termvectors {
  
  @scala.inline
  def apply[T](index: String): Termvectors[T] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[Termvectors[T]]
  }
  
  @scala.inline
  implicit class TermvectorsMutableBuilder[Self <: Termvectors[?], T] (val x: Self & Termvectors[T]) extends AnyVal {
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setField_statistics(value: Boolean): Self = StObject.set(x, "field_statistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setField_statisticsUndefined: Self = StObject.set(x, "field_statistics", js.undefined)
    
    @scala.inline
    def setFields(value: String | js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsets(value: Boolean): Self = StObject.set(x, "offsets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetsUndefined: Self = StObject.set(x, "offsets", js.undefined)
    
    @scala.inline
    def setPayloads(value: Boolean): Self = StObject.set(x, "payloads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadsUndefined: Self = StObject.set(x, "payloads", js.undefined)
    
    @scala.inline
    def setPositions(value: Boolean): Self = StObject.set(x, "positions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionsUndefined: Self = StObject.set(x, "positions", js.undefined)
    
    @scala.inline
    def setPreference(value: String): Self = StObject.set(x, "preference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferenceUndefined: Self = StObject.set(x, "preference", js.undefined)
    
    @scala.inline
    def setRealtime(value: Boolean): Self = StObject.set(x, "realtime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRealtimeUndefined: Self = StObject.set(x, "realtime", js.undefined)
    
    @scala.inline
    def setRouting(value: String): Self = StObject.set(x, "routing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutingUndefined: Self = StObject.set(x, "routing", js.undefined)
    
    @scala.inline
    def setTerm_statistics(value: Boolean): Self = StObject.set(x, "term_statistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerm_statisticsUndefined: Self = StObject.set(x, "term_statistics", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    @scala.inline
    def setVersion_type(value: internal | external | external_gte | force): Self = StObject.set(x, "version_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion_typeUndefined: Self = StObject.set(x, "version_type", js.undefined)
  }
}
