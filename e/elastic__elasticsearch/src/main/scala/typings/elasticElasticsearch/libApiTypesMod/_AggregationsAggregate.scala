package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _AggregationsAggregate extends StObject
object _AggregationsAggregate {
  
  inline def AggregationsAutoDateHistogramAggregate(buckets: AggregationsBuckets[AggregationsDateHistogramBucket], interval: DurationLarge): typings.elasticElasticsearch.libApiTypesMod.AggregationsAutoDateHistogramAggregate = {
    val __obj = js.Dynamic.literal(buckets = buckets.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AggregationsAutoDateHistogramAggregate]
  }
  
  inline def AggregationsBoxPlotAggregate(lower: double, max: double, min: double, q1: double, q2: double, q3: double, upper: double): typings.elasticElasticsearch.libApiTypesMod.AggregationsBoxPlotAggregate = {
    val __obj = js.Dynamic.literal(lower = lower.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], q1 = q1.asInstanceOf[js.Any], q2 = q2.asInstanceOf[js.Any], q3 = q3.asInstanceOf[js.Any], upper = upper.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AggregationsBoxPlotAggregate]
  }
  
  inline def AggregationsBucketMetricValueAggregate(keys: js.Array[String]): typings.elasticElasticsearch.libApiTypesMod.AggregationsBucketMetricValueAggregate = {
    val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any], value = null)
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AggregationsBucketMetricValueAggregate]
  }
  
  inline def AggregationsCardinalityAggregate(value: long): typings.elasticElasticsearch.libApiTypesMod.AggregationsCardinalityAggregate = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AggregationsCardinalityAggregate]
  }
  
  inline def AggregationsChildrenAggregate(doc_count: long): typings.elasticElasticsearch.libApiTypesMod.AggregationsChildrenAggregate = {
    val __obj = js.Dynamic.literal(doc_count = doc_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AggregationsChildrenAggregate]
  }
  
  inline def AggregationsCompositeAggregate(buckets: AggregationsBuckets[AggregationsCompositeBucket]): typings.elasticElasticsearch.libApiTypesMod.AggregationsCompositeAggregate = {
    val __obj = js.Dynamic.literal(buckets = buckets.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AggregationsCompositeAggregate]
  }
  
  inline def AggregationsCumulativeCardinalityAggregate(value: long): typings.elasticElasticsearch.libApiTypesMod.AggregationsCumulativeCardinalityAggregate = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AggregationsCumulativeCardinalityAggregate]
  }
  
  inline def AggregationsDerivativeAggregate(): typings.elasticElasticsearch.libApiTypesMod.AggregationsDerivativeAggregate = {
    val __obj = js.Dynamic.literal(value = null)
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AggregationsDerivativeAggregate]
  }
  
  inline def AggregationsExtendedStatsAggregate(count: long, sum: double): typings.elasticElasticsearch.libApiTypesMod.AggregationsExtendedStatsAggregate = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], sum = sum.asInstanceOf[js.Any], avg = null, max = null, min = null, std_deviation = null, std_deviation_population = null, std_deviation_sampling = null, sum_of_squares = null, variance = null, variance_population = null, variance_sampling = null)
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AggregationsExtendedStatsAggregate]
  }
  
  inline def AggregationsFilterAggregate(doc_count: long): typings.elasticElasticsearch.libApiTypesMod.AggregationsFilterAggregate = {
    val __obj = js.Dynamic.literal(doc_count = doc_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AggregationsFilterAggregate]
  }
  
  inline def AggregationsGeoBoundsAggregate(): typings.elasticElasticsearch.libApiTypesMod.AggregationsGeoBoundsAggregate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AggregationsGeoBoundsAggregate]
  }
  
  inline def AggregationsGeoCentroidAggregate(count: long): typings.elasticElasticsearch.libApiTypesMod.AggregationsGeoCentroidAggregate = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AggregationsGeoCentroidAggregate]
  }
  
  inline def AggregationsGeoLineAggregate(geometry: GeoLine, properties: Any, `type`: String): typings.elasticElasticsearch.libApiTypesMod.AggregationsGeoLineAggregate = {
    val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AggregationsGeoLineAggregate]
  }
  
  inline def AggregationsGlobalAggregate(doc_count: long): typings.elasticElasticsearch.libApiTypesMod.AggregationsGlobalAggregate = {
    val __obj = js.Dynamic.literal(doc_count = doc_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AggregationsGlobalAggregate]
  }
  
  inline def AggregationsInferenceAggregate(): typings.elasticElasticsearch.libApiTypesMod.AggregationsInferenceAggregate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AggregationsInferenceAggregate]
  }
  
  inline def AggregationsMatrixStatsAggregate(doc_count: long, fields: js.Array[AggregationsMatrixStatsFields]): typings.elasticElasticsearch.libApiTypesMod.AggregationsMatrixStatsAggregate = {
    val __obj = js.Dynamic.literal(doc_count = doc_count.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AggregationsMatrixStatsAggregate]
  }
  
  inline def AggregationsMissingAggregate(doc_count: long): typings.elasticElasticsearch.libApiTypesMod.AggregationsMissingAggregate = {
    val __obj = js.Dynamic.literal(doc_count = doc_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AggregationsMissingAggregate]
  }
  
  inline def AggregationsNestedAggregate(doc_count: long): typings.elasticElasticsearch.libApiTypesMod.AggregationsNestedAggregate = {
    val __obj = js.Dynamic.literal(doc_count = doc_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AggregationsNestedAggregate]
  }
  
  inline def AggregationsParentAggregate(doc_count: long): typings.elasticElasticsearch.libApiTypesMod.AggregationsParentAggregate = {
    val __obj = js.Dynamic.literal(doc_count = doc_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AggregationsParentAggregate]
  }
  
  inline def AggregationsRateAggregate(value: double): typings.elasticElasticsearch.libApiTypesMod.AggregationsRateAggregate = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AggregationsRateAggregate]
  }
  
  inline def AggregationsReverseNestedAggregate(doc_count: long): typings.elasticElasticsearch.libApiTypesMod.AggregationsReverseNestedAggregate = {
    val __obj = js.Dynamic.literal(doc_count = doc_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AggregationsReverseNestedAggregate]
  }
  
  inline def AggregationsSamplerAggregate(doc_count: long): typings.elasticElasticsearch.libApiTypesMod.AggregationsSamplerAggregate = {
    val __obj = js.Dynamic.literal(doc_count = doc_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AggregationsSamplerAggregate]
  }
  
  inline def AggregationsScriptedMetricAggregate(value: Any): typings.elasticElasticsearch.libApiTypesMod.AggregationsScriptedMetricAggregate = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AggregationsScriptedMetricAggregate]
  }
  
  inline def AggregationsStatsAggregate(count: long, sum: double): typings.elasticElasticsearch.libApiTypesMod.AggregationsStatsAggregate = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], sum = sum.asInstanceOf[js.Any], avg = null, max = null, min = null)
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AggregationsStatsAggregate]
  }
  
  inline def AggregationsStringStatsAggregate(count: long): typings.elasticElasticsearch.libApiTypesMod.AggregationsStringStatsAggregate = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], avg_length = null, entropy = null, max_length = null, min_length = null)
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AggregationsStringStatsAggregate]
  }
  
  inline def AggregationsTTestAggregate(): typings.elasticElasticsearch.libApiTypesMod.AggregationsTTestAggregate = {
    val __obj = js.Dynamic.literal(value = null)
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AggregationsTTestAggregate]
  }
  
  inline def AggregationsTopHitsAggregate(hits: SearchHitsMetadata[Any]): typings.elasticElasticsearch.libApiTypesMod.AggregationsTopHitsAggregate = {
    val __obj = js.Dynamic.literal(hits = hits.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AggregationsTopHitsAggregate]
  }
  
  inline def AggregationsTopMetricsAggregate(top: js.Array[AggregationsTopMetrics]): typings.elasticElasticsearch.libApiTypesMod.AggregationsTopMetricsAggregate = {
    val __obj = js.Dynamic.literal(top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AggregationsTopMetricsAggregate]
  }
  
  inline def AggregationsUnmappedSamplerAggregate(doc_count: long): typings.elasticElasticsearch.libApiTypesMod.AggregationsUnmappedSamplerAggregate = {
    val __obj = js.Dynamic.literal(doc_count = doc_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AggregationsUnmappedSamplerAggregate]
  }
}
