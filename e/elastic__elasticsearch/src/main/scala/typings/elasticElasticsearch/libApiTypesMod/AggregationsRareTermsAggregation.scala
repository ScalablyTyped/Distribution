package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsRareTermsAggregation
  extends StObject
     with AggregationsAggregation {
  
  var exclude: js.UndefOr[AggregationsTermsExclude] = js.undefined
  
  var field: js.UndefOr[Field] = js.undefined
  
  var include: js.UndefOr[AggregationsTermsInclude] = js.undefined
  
  var max_doc_count: js.UndefOr[long] = js.undefined
  
  var missing: js.UndefOr[AggregationsMissing] = js.undefined
  
  var precision: js.UndefOr[double] = js.undefined
  
  var value_type: js.UndefOr[String] = js.undefined
}
object AggregationsRareTermsAggregation {
  
  inline def apply(): AggregationsRareTermsAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationsRareTermsAggregation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregationsRareTermsAggregation] (val x: Self) extends AnyVal {
    
    inline def setExclude(value: AggregationsTermsExclude): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value*))
    
    inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setInclude(value: AggregationsTermsInclude): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    inline def setIncludeVarargs(value: String*): Self = StObject.set(x, "include", js.Array(value*))
    
    inline def setMax_doc_count(value: long): Self = StObject.set(x, "max_doc_count", value.asInstanceOf[js.Any])
    
    inline def setMax_doc_countUndefined: Self = StObject.set(x, "max_doc_count", js.undefined)
    
    inline def setMissing(value: AggregationsMissing): Self = StObject.set(x, "missing", value.asInstanceOf[js.Any])
    
    inline def setMissingUndefined: Self = StObject.set(x, "missing", js.undefined)
    
    inline def setPrecision(value: double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    
    inline def setValue_type(value: String): Self = StObject.set(x, "value_type", value.asInstanceOf[js.Any])
    
    inline def setValue_typeUndefined: Self = StObject.set(x, "value_type", js.undefined)
  }
}
