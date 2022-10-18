package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _AggregationsAggregate extends StObject
object _AggregationsAggregate {
  
  inline def AggregationsAutoDateHistogramAggregate(buckets: AggregationsBuckets[AggregationsDateHistogramBucket], interval: DurationLarge): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsAutoDateHistogramAggregate = {
    val __obj = js.Dynamic.literal(buckets = buckets.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsAutoDateHistogramAggregate]
  }
  
  inline def AggregationsBoxPlotAggregate(lower: double, max: double, min: double, q1: double, q2: double, q3: double, upper: double): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsBoxPlotAggregate = {
    val __obj = js.Dynamic.literal(lower = lower.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], q1 = q1.asInstanceOf[js.Any], q2 = q2.asInstanceOf[js.Any], q3 = q3.asInstanceOf[js.Any], upper = upper.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsBoxPlotAggregate]
  }
  
  inline def AggregationsBucketMetricValueAggregate(keys: js.Array[String]): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsBucketMetricValueAggregate = {
    val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any], value = null)
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsBucketMetricValueAggregate]
  }
  
  inline def AggregationsCardinalityAggregate(value: long): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsCardinalityAggregate = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsCardinalityAggregate]
  }
  
  inline def AggregationsChildrenAggregate(doc_count: long): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsChildrenAggregate = {
    val __obj = js.Dynamic.literal(doc_count = doc_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsChildrenAggregate]
  }
  
  inline def AggregationsCompositeAggregate(buckets: AggregationsBuckets[AggregationsCompositeBucket]): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsCompositeAggregate = {
    val __obj = js.Dynamic.literal(buckets = buckets.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsCompositeAggregate]
  }
  
  inline def AggregationsCumulativeCardinalityAggregate(value: long): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsCumulativeCardinalityAggregate = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsCumulativeCardinalityAggregate]
  }
  
  inline def AggregationsDerivativeAggregate(): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsDerivativeAggregate = {
    val __obj = js.Dynamic.literal(value = null)
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsDerivativeAggregate]
  }
  
  inline def AggregationsExtendedStatsAggregate(count: long, sum: double): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsExtendedStatsAggregate = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], sum = sum.asInstanceOf[js.Any], avg = null, max = null, min = null, std_deviation = null, sum_of_squares = null, variance = null, variance_population = null, variance_sampling = null)
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsExtendedStatsAggregate]
  }
  
  inline def AggregationsFilterAggregate(doc_count: long): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsFilterAggregate = {
    val __obj = js.Dynamic.literal(doc_count = doc_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsFilterAggregate]
  }
  
  inline def AggregationsGeoBoundsAggregate(): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsGeoBoundsAggregate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsGeoBoundsAggregate]
  }
  
  inline def AggregationsGeoCentroidAggregate(count: long): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsGeoCentroidAggregate = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsGeoCentroidAggregate]
  }
  
  inline def AggregationsGeoLineAggregate(geometry: GeoLine, `type`: String): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsGeoLineAggregate = {
    val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsGeoLineAggregate]
  }
  
  inline def AggregationsGlobalAggregate(doc_count: long): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsGlobalAggregate = {
    val __obj = js.Dynamic.literal(doc_count = doc_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsGlobalAggregate]
  }
  
  inline def AggregationsInferenceAggregate(): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsInferenceAggregate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsInferenceAggregate]
  }
  
  inline def AggregationsMatrixStatsAggregate(doc_count: long, fields: js.Array[AggregationsMatrixStatsFields]): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsMatrixStatsAggregate = {
    val __obj = js.Dynamic.literal(doc_count = doc_count.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsMatrixStatsAggregate]
  }
  
  inline def AggregationsMissingAggregate(doc_count: long): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsMissingAggregate = {
    val __obj = js.Dynamic.literal(doc_count = doc_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsMissingAggregate]
  }
  
  inline def AggregationsNestedAggregate(doc_count: long): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsNestedAggregate = {
    val __obj = js.Dynamic.literal(doc_count = doc_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsNestedAggregate]
  }
  
  inline def AggregationsParentAggregate(doc_count: long): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsParentAggregate = {
    val __obj = js.Dynamic.literal(doc_count = doc_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsParentAggregate]
  }
  
  inline def AggregationsRateAggregate(value: double): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsRateAggregate = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsRateAggregate]
  }
  
  inline def AggregationsReverseNestedAggregate(doc_count: long): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsReverseNestedAggregate = {
    val __obj = js.Dynamic.literal(doc_count = doc_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsReverseNestedAggregate]
  }
  
  inline def AggregationsSamplerAggregate(doc_count: long): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsSamplerAggregate = {
    val __obj = js.Dynamic.literal(doc_count = doc_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsSamplerAggregate]
  }
  
  inline def AggregationsScriptedMetricAggregate(value: Any): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsScriptedMetricAggregate = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsScriptedMetricAggregate]
  }
  
  inline def AggregationsStatsAggregate(count: long, sum: double): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsStatsAggregate = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], sum = sum.asInstanceOf[js.Any], avg = null, max = null, min = null)
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsStatsAggregate]
  }
  
  inline def AggregationsStringStatsAggregate(count: long): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsStringStatsAggregate = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], avg_length = null, entropy = null, max_length = null, min_length = null)
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsStringStatsAggregate]
  }
  
  inline def AggregationsTTestAggregate(): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsTTestAggregate = {
    val __obj = js.Dynamic.literal(value = null)
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsTTestAggregate]
  }
  
  inline def AggregationsTopHitsAggregate(hits: SearchHitsMetadata[Any]): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsTopHitsAggregate = {
    val __obj = js.Dynamic.literal(hits = hits.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsTopHitsAggregate]
  }
  
  inline def AggregationsTopMetricsAggregate(top: js.Array[AggregationsTopMetrics]): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsTopMetricsAggregate = {
    val __obj = js.Dynamic.literal(top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsTopMetricsAggregate]
  }
  
  inline def AggregationsUnmappedSamplerAggregate(doc_count: long): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsUnmappedSamplerAggregate = {
    val __obj = js.Dynamic.literal(doc_count = doc_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsUnmappedSamplerAggregate]
  }
}
