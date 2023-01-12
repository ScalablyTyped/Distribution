package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsAggregationContainer extends StObject {
  
  var adjacency_matrix: js.UndefOr[AggregationsAdjacencyMatrixAggregation] = js.undefined
  
  var aggregations: js.UndefOr[Record[String, AggregationsAggregationContainer]] = js.undefined
  
  var aggs: js.UndefOr[Record[String, AggregationsAggregationContainer]] = js.undefined
  
  var auto_date_histogram: js.UndefOr[AggregationsAutoDateHistogramAggregation] = js.undefined
  
  var avg: js.UndefOr[AggregationsAverageAggregation] = js.undefined
  
  var avg_bucket: js.UndefOr[AggregationsAverageBucketAggregation] = js.undefined
  
  var boxplot: js.UndefOr[AggregationsBoxplotAggregation] = js.undefined
  
  var bucket_correlation: js.UndefOr[AggregationsBucketCorrelationAggregation] = js.undefined
  
  var bucket_count_ks_test: js.UndefOr[AggregationsBucketKsAggregation] = js.undefined
  
  var bucket_script: js.UndefOr[AggregationsBucketScriptAggregation] = js.undefined
  
  var bucket_selector: js.UndefOr[AggregationsBucketSelectorAggregation] = js.undefined
  
  var bucket_sort: js.UndefOr[AggregationsBucketSortAggregation] = js.undefined
  
  var cardinality: js.UndefOr[AggregationsCardinalityAggregation] = js.undefined
  
  var categorize_text: js.UndefOr[AggregationsCategorizeTextAggregation] = js.undefined
  
  var children: js.UndefOr[AggregationsChildrenAggregation] = js.undefined
  
  var composite: js.UndefOr[AggregationsCompositeAggregation] = js.undefined
  
  var cumulative_cardinality: js.UndefOr[AggregationsCumulativeCardinalityAggregation] = js.undefined
  
  var cumulative_sum: js.UndefOr[AggregationsCumulativeSumAggregation] = js.undefined
  
  var date_histogram: js.UndefOr[AggregationsDateHistogramAggregation] = js.undefined
  
  var date_range: js.UndefOr[AggregationsDateRangeAggregation] = js.undefined
  
  var derivative: js.UndefOr[AggregationsDerivativeAggregation] = js.undefined
  
  var diversified_sampler: js.UndefOr[AggregationsDiversifiedSamplerAggregation] = js.undefined
  
  var extended_stats: js.UndefOr[AggregationsExtendedStatsAggregation] = js.undefined
  
  var extended_stats_bucket: js.UndefOr[AggregationsExtendedStatsBucketAggregation] = js.undefined
  
  var filter: js.UndefOr[QueryDslQueryContainer] = js.undefined
  
  var filters: js.UndefOr[AggregationsFiltersAggregation] = js.undefined
  
  var geo_bounds: js.UndefOr[AggregationsGeoBoundsAggregation] = js.undefined
  
  var geo_centroid: js.UndefOr[AggregationsGeoCentroidAggregation] = js.undefined
  
  var geo_distance: js.UndefOr[AggregationsGeoDistanceAggregation] = js.undefined
  
  var geo_line: js.UndefOr[AggregationsGeoLineAggregation] = js.undefined
  
  var geohash_grid: js.UndefOr[AggregationsGeoHashGridAggregation] = js.undefined
  
  var geohex_grid: js.UndefOr[AggregationsGeohexGridAggregation] = js.undefined
  
  var geotile_grid: js.UndefOr[AggregationsGeoTileGridAggregation] = js.undefined
  
  var global: js.UndefOr[AggregationsGlobalAggregation] = js.undefined
  
  var histogram: js.UndefOr[AggregationsHistogramAggregation] = js.undefined
  
  var inference: js.UndefOr[AggregationsInferenceAggregation] = js.undefined
  
  var ip_prefix: js.UndefOr[AggregationsIpPrefixAggregation] = js.undefined
  
  var ip_range: js.UndefOr[AggregationsIpRangeAggregation] = js.undefined
  
  var line: js.UndefOr[AggregationsGeoLineAggregation] = js.undefined
  
  var matrix_stats: js.UndefOr[AggregationsMatrixStatsAggregation] = js.undefined
  
  var max: js.UndefOr[AggregationsMaxAggregation] = js.undefined
  
  var max_bucket: js.UndefOr[AggregationsMaxBucketAggregation] = js.undefined
  
  var median_absolute_deviation: js.UndefOr[AggregationsMedianAbsoluteDeviationAggregation] = js.undefined
  
  var meta: js.UndefOr[Metadata] = js.undefined
  
  var min: js.UndefOr[AggregationsMinAggregation] = js.undefined
  
  var min_bucket: js.UndefOr[AggregationsMinBucketAggregation] = js.undefined
  
  var missing: js.UndefOr[AggregationsMissingAggregation] = js.undefined
  
  var moving_avg: js.UndefOr[AggregationsMovingAverageAggregation] = js.undefined
  
  var moving_fn: js.UndefOr[AggregationsMovingFunctionAggregation] = js.undefined
  
  var moving_percentiles: js.UndefOr[AggregationsMovingPercentilesAggregation] = js.undefined
  
  var multi_terms: js.UndefOr[AggregationsMultiTermsAggregation] = js.undefined
  
  var nested: js.UndefOr[AggregationsNestedAggregation] = js.undefined
  
  var normalize: js.UndefOr[AggregationsNormalizeAggregation] = js.undefined
  
  var parent: js.UndefOr[AggregationsParentAggregation] = js.undefined
  
  var percentile_ranks: js.UndefOr[AggregationsPercentileRanksAggregation] = js.undefined
  
  var percentiles: js.UndefOr[AggregationsPercentilesAggregation] = js.undefined
  
  var percentiles_bucket: js.UndefOr[AggregationsPercentilesBucketAggregation] = js.undefined
  
  var range: js.UndefOr[AggregationsRangeAggregation] = js.undefined
  
  var rare_terms: js.UndefOr[AggregationsRareTermsAggregation] = js.undefined
  
  var rate: js.UndefOr[AggregationsRateAggregation] = js.undefined
  
  var reverse_nested: js.UndefOr[AggregationsReverseNestedAggregation] = js.undefined
  
  var sampler: js.UndefOr[AggregationsSamplerAggregation] = js.undefined
  
  var scripted_metric: js.UndefOr[AggregationsScriptedMetricAggregation] = js.undefined
  
  var serial_diff: js.UndefOr[AggregationsSerialDifferencingAggregation] = js.undefined
  
  var significant_terms: js.UndefOr[AggregationsSignificantTermsAggregation] = js.undefined
  
  var significant_text: js.UndefOr[AggregationsSignificantTextAggregation] = js.undefined
  
  var stats: js.UndefOr[AggregationsStatsAggregation] = js.undefined
  
  var stats_bucket: js.UndefOr[AggregationsStatsBucketAggregation] = js.undefined
  
  var string_stats: js.UndefOr[AggregationsStringStatsAggregation] = js.undefined
  
  var sum: js.UndefOr[AggregationsSumAggregation] = js.undefined
  
  var sum_bucket: js.UndefOr[AggregationsSumBucketAggregation] = js.undefined
  
  var t_test: js.UndefOr[AggregationsTTestAggregation] = js.undefined
  
  var terms: js.UndefOr[AggregationsTermsAggregation] = js.undefined
  
  var top_hits: js.UndefOr[AggregationsTopHitsAggregation] = js.undefined
  
  var top_metrics: js.UndefOr[AggregationsTopMetricsAggregation] = js.undefined
  
  var value_count: js.UndefOr[AggregationsValueCountAggregation] = js.undefined
  
  var variable_width_histogram: js.UndefOr[AggregationsVariableWidthHistogramAggregation] = js.undefined
  
  var weighted_avg: js.UndefOr[AggregationsWeightedAverageAggregation] = js.undefined
}
object AggregationsAggregationContainer {
  
  inline def apply(): AggregationsAggregationContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationsAggregationContainer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregationsAggregationContainer] (val x: Self) extends AnyVal {
    
    inline def setAdjacency_matrix(value: AggregationsAdjacencyMatrixAggregation): Self = StObject.set(x, "adjacency_matrix", value.asInstanceOf[js.Any])
    
    inline def setAdjacency_matrixUndefined: Self = StObject.set(x, "adjacency_matrix", js.undefined)
    
    inline def setAggregations(value: Record[String, AggregationsAggregationContainer]): Self = StObject.set(x, "aggregations", value.asInstanceOf[js.Any])
    
    inline def setAggregationsUndefined: Self = StObject.set(x, "aggregations", js.undefined)
    
    inline def setAggs(value: Record[String, AggregationsAggregationContainer]): Self = StObject.set(x, "aggs", value.asInstanceOf[js.Any])
    
    inline def setAggsUndefined: Self = StObject.set(x, "aggs", js.undefined)
    
    inline def setAuto_date_histogram(value: AggregationsAutoDateHistogramAggregation): Self = StObject.set(x, "auto_date_histogram", value.asInstanceOf[js.Any])
    
    inline def setAuto_date_histogramUndefined: Self = StObject.set(x, "auto_date_histogram", js.undefined)
    
    inline def setAvg(value: AggregationsAverageAggregation): Self = StObject.set(x, "avg", value.asInstanceOf[js.Any])
    
    inline def setAvgUndefined: Self = StObject.set(x, "avg", js.undefined)
    
    inline def setAvg_bucket(value: AggregationsAverageBucketAggregation): Self = StObject.set(x, "avg_bucket", value.asInstanceOf[js.Any])
    
    inline def setAvg_bucketUndefined: Self = StObject.set(x, "avg_bucket", js.undefined)
    
    inline def setBoxplot(value: AggregationsBoxplotAggregation): Self = StObject.set(x, "boxplot", value.asInstanceOf[js.Any])
    
    inline def setBoxplotUndefined: Self = StObject.set(x, "boxplot", js.undefined)
    
    inline def setBucket_correlation(value: AggregationsBucketCorrelationAggregation): Self = StObject.set(x, "bucket_correlation", value.asInstanceOf[js.Any])
    
    inline def setBucket_correlationUndefined: Self = StObject.set(x, "bucket_correlation", js.undefined)
    
    inline def setBucket_count_ks_test(value: AggregationsBucketKsAggregation): Self = StObject.set(x, "bucket_count_ks_test", value.asInstanceOf[js.Any])
    
    inline def setBucket_count_ks_testUndefined: Self = StObject.set(x, "bucket_count_ks_test", js.undefined)
    
    inline def setBucket_script(value: AggregationsBucketScriptAggregation): Self = StObject.set(x, "bucket_script", value.asInstanceOf[js.Any])
    
    inline def setBucket_scriptUndefined: Self = StObject.set(x, "bucket_script", js.undefined)
    
    inline def setBucket_selector(value: AggregationsBucketSelectorAggregation): Self = StObject.set(x, "bucket_selector", value.asInstanceOf[js.Any])
    
    inline def setBucket_selectorUndefined: Self = StObject.set(x, "bucket_selector", js.undefined)
    
    inline def setBucket_sort(value: AggregationsBucketSortAggregation): Self = StObject.set(x, "bucket_sort", value.asInstanceOf[js.Any])
    
    inline def setBucket_sortUndefined: Self = StObject.set(x, "bucket_sort", js.undefined)
    
    inline def setCardinality(value: AggregationsCardinalityAggregation): Self = StObject.set(x, "cardinality", value.asInstanceOf[js.Any])
    
    inline def setCardinalityUndefined: Self = StObject.set(x, "cardinality", js.undefined)
    
    inline def setCategorize_text(value: AggregationsCategorizeTextAggregation): Self = StObject.set(x, "categorize_text", value.asInstanceOf[js.Any])
    
    inline def setCategorize_textUndefined: Self = StObject.set(x, "categorize_text", js.undefined)
    
    inline def setChildren(value: AggregationsChildrenAggregation): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setComposite(value: AggregationsCompositeAggregation): Self = StObject.set(x, "composite", value.asInstanceOf[js.Any])
    
    inline def setCompositeUndefined: Self = StObject.set(x, "composite", js.undefined)
    
    inline def setCumulative_cardinality(value: AggregationsCumulativeCardinalityAggregation): Self = StObject.set(x, "cumulative_cardinality", value.asInstanceOf[js.Any])
    
    inline def setCumulative_cardinalityUndefined: Self = StObject.set(x, "cumulative_cardinality", js.undefined)
    
    inline def setCumulative_sum(value: AggregationsCumulativeSumAggregation): Self = StObject.set(x, "cumulative_sum", value.asInstanceOf[js.Any])
    
    inline def setCumulative_sumUndefined: Self = StObject.set(x, "cumulative_sum", js.undefined)
    
    inline def setDate_histogram(value: AggregationsDateHistogramAggregation): Self = StObject.set(x, "date_histogram", value.asInstanceOf[js.Any])
    
    inline def setDate_histogramUndefined: Self = StObject.set(x, "date_histogram", js.undefined)
    
    inline def setDate_range(value: AggregationsDateRangeAggregation): Self = StObject.set(x, "date_range", value.asInstanceOf[js.Any])
    
    inline def setDate_rangeUndefined: Self = StObject.set(x, "date_range", js.undefined)
    
    inline def setDerivative(value: AggregationsDerivativeAggregation): Self = StObject.set(x, "derivative", value.asInstanceOf[js.Any])
    
    inline def setDerivativeUndefined: Self = StObject.set(x, "derivative", js.undefined)
    
    inline def setDiversified_sampler(value: AggregationsDiversifiedSamplerAggregation): Self = StObject.set(x, "diversified_sampler", value.asInstanceOf[js.Any])
    
    inline def setDiversified_samplerUndefined: Self = StObject.set(x, "diversified_sampler", js.undefined)
    
    inline def setExtended_stats(value: AggregationsExtendedStatsAggregation): Self = StObject.set(x, "extended_stats", value.asInstanceOf[js.Any])
    
    inline def setExtended_statsUndefined: Self = StObject.set(x, "extended_stats", js.undefined)
    
    inline def setExtended_stats_bucket(value: AggregationsExtendedStatsBucketAggregation): Self = StObject.set(x, "extended_stats_bucket", value.asInstanceOf[js.Any])
    
    inline def setExtended_stats_bucketUndefined: Self = StObject.set(x, "extended_stats_bucket", js.undefined)
    
    inline def setFilter(value: QueryDslQueryContainer): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setFilters(value: AggregationsFiltersAggregation): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setGeo_bounds(value: AggregationsGeoBoundsAggregation): Self = StObject.set(x, "geo_bounds", value.asInstanceOf[js.Any])
    
    inline def setGeo_boundsUndefined: Self = StObject.set(x, "geo_bounds", js.undefined)
    
    inline def setGeo_centroid(value: AggregationsGeoCentroidAggregation): Self = StObject.set(x, "geo_centroid", value.asInstanceOf[js.Any])
    
    inline def setGeo_centroidUndefined: Self = StObject.set(x, "geo_centroid", js.undefined)
    
    inline def setGeo_distance(value: AggregationsGeoDistanceAggregation): Self = StObject.set(x, "geo_distance", value.asInstanceOf[js.Any])
    
    inline def setGeo_distanceUndefined: Self = StObject.set(x, "geo_distance", js.undefined)
    
    inline def setGeo_line(value: AggregationsGeoLineAggregation): Self = StObject.set(x, "geo_line", value.asInstanceOf[js.Any])
    
    inline def setGeo_lineUndefined: Self = StObject.set(x, "geo_line", js.undefined)
    
    inline def setGeohash_grid(value: AggregationsGeoHashGridAggregation): Self = StObject.set(x, "geohash_grid", value.asInstanceOf[js.Any])
    
    inline def setGeohash_gridUndefined: Self = StObject.set(x, "geohash_grid", js.undefined)
    
    inline def setGeohex_grid(value: AggregationsGeohexGridAggregation): Self = StObject.set(x, "geohex_grid", value.asInstanceOf[js.Any])
    
    inline def setGeohex_gridUndefined: Self = StObject.set(x, "geohex_grid", js.undefined)
    
    inline def setGeotile_grid(value: AggregationsGeoTileGridAggregation): Self = StObject.set(x, "geotile_grid", value.asInstanceOf[js.Any])
    
    inline def setGeotile_gridUndefined: Self = StObject.set(x, "geotile_grid", js.undefined)
    
    inline def setGlobal(value: AggregationsGlobalAggregation): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    
    inline def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
    
    inline def setHistogram(value: AggregationsHistogramAggregation): Self = StObject.set(x, "histogram", value.asInstanceOf[js.Any])
    
    inline def setHistogramUndefined: Self = StObject.set(x, "histogram", js.undefined)
    
    inline def setInference(value: AggregationsInferenceAggregation): Self = StObject.set(x, "inference", value.asInstanceOf[js.Any])
    
    inline def setInferenceUndefined: Self = StObject.set(x, "inference", js.undefined)
    
    inline def setIp_prefix(value: AggregationsIpPrefixAggregation): Self = StObject.set(x, "ip_prefix", value.asInstanceOf[js.Any])
    
    inline def setIp_prefixUndefined: Self = StObject.set(x, "ip_prefix", js.undefined)
    
    inline def setIp_range(value: AggregationsIpRangeAggregation): Self = StObject.set(x, "ip_range", value.asInstanceOf[js.Any])
    
    inline def setIp_rangeUndefined: Self = StObject.set(x, "ip_range", js.undefined)
    
    inline def setLine(value: AggregationsGeoLineAggregation): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    inline def setMatrix_stats(value: AggregationsMatrixStatsAggregation): Self = StObject.set(x, "matrix_stats", value.asInstanceOf[js.Any])
    
    inline def setMatrix_statsUndefined: Self = StObject.set(x, "matrix_stats", js.undefined)
    
    inline def setMax(value: AggregationsMaxAggregation): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMax_bucket(value: AggregationsMaxBucketAggregation): Self = StObject.set(x, "max_bucket", value.asInstanceOf[js.Any])
    
    inline def setMax_bucketUndefined: Self = StObject.set(x, "max_bucket", js.undefined)
    
    inline def setMedian_absolute_deviation(value: AggregationsMedianAbsoluteDeviationAggregation): Self = StObject.set(x, "median_absolute_deviation", value.asInstanceOf[js.Any])
    
    inline def setMedian_absolute_deviationUndefined: Self = StObject.set(x, "median_absolute_deviation", js.undefined)
    
    inline def setMeta(value: Metadata): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    inline def setMin(value: AggregationsMinAggregation): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setMin_bucket(value: AggregationsMinBucketAggregation): Self = StObject.set(x, "min_bucket", value.asInstanceOf[js.Any])
    
    inline def setMin_bucketUndefined: Self = StObject.set(x, "min_bucket", js.undefined)
    
    inline def setMissing(value: AggregationsMissingAggregation): Self = StObject.set(x, "missing", value.asInstanceOf[js.Any])
    
    inline def setMissingUndefined: Self = StObject.set(x, "missing", js.undefined)
    
    inline def setMoving_avg(value: AggregationsMovingAverageAggregation): Self = StObject.set(x, "moving_avg", value.asInstanceOf[js.Any])
    
    inline def setMoving_avgUndefined: Self = StObject.set(x, "moving_avg", js.undefined)
    
    inline def setMoving_fn(value: AggregationsMovingFunctionAggregation): Self = StObject.set(x, "moving_fn", value.asInstanceOf[js.Any])
    
    inline def setMoving_fnUndefined: Self = StObject.set(x, "moving_fn", js.undefined)
    
    inline def setMoving_percentiles(value: AggregationsMovingPercentilesAggregation): Self = StObject.set(x, "moving_percentiles", value.asInstanceOf[js.Any])
    
    inline def setMoving_percentilesUndefined: Self = StObject.set(x, "moving_percentiles", js.undefined)
    
    inline def setMulti_terms(value: AggregationsMultiTermsAggregation): Self = StObject.set(x, "multi_terms", value.asInstanceOf[js.Any])
    
    inline def setMulti_termsUndefined: Self = StObject.set(x, "multi_terms", js.undefined)
    
    inline def setNested(value: AggregationsNestedAggregation): Self = StObject.set(x, "nested", value.asInstanceOf[js.Any])
    
    inline def setNestedUndefined: Self = StObject.set(x, "nested", js.undefined)
    
    inline def setNormalize(value: AggregationsNormalizeAggregation): Self = StObject.set(x, "normalize", value.asInstanceOf[js.Any])
    
    inline def setNormalizeUndefined: Self = StObject.set(x, "normalize", js.undefined)
    
    inline def setParent(value: AggregationsParentAggregation): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setPercentile_ranks(value: AggregationsPercentileRanksAggregation): Self = StObject.set(x, "percentile_ranks", value.asInstanceOf[js.Any])
    
    inline def setPercentile_ranksUndefined: Self = StObject.set(x, "percentile_ranks", js.undefined)
    
    inline def setPercentiles(value: AggregationsPercentilesAggregation): Self = StObject.set(x, "percentiles", value.asInstanceOf[js.Any])
    
    inline def setPercentilesUndefined: Self = StObject.set(x, "percentiles", js.undefined)
    
    inline def setPercentiles_bucket(value: AggregationsPercentilesBucketAggregation): Self = StObject.set(x, "percentiles_bucket", value.asInstanceOf[js.Any])
    
    inline def setPercentiles_bucketUndefined: Self = StObject.set(x, "percentiles_bucket", js.undefined)
    
    inline def setRange(value: AggregationsRangeAggregation): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setRare_terms(value: AggregationsRareTermsAggregation): Self = StObject.set(x, "rare_terms", value.asInstanceOf[js.Any])
    
    inline def setRare_termsUndefined: Self = StObject.set(x, "rare_terms", js.undefined)
    
    inline def setRate(value: AggregationsRateAggregation): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
    
    inline def setRateUndefined: Self = StObject.set(x, "rate", js.undefined)
    
    inline def setReverse_nested(value: AggregationsReverseNestedAggregation): Self = StObject.set(x, "reverse_nested", value.asInstanceOf[js.Any])
    
    inline def setReverse_nestedUndefined: Self = StObject.set(x, "reverse_nested", js.undefined)
    
    inline def setSampler(value: AggregationsSamplerAggregation): Self = StObject.set(x, "sampler", value.asInstanceOf[js.Any])
    
    inline def setSamplerUndefined: Self = StObject.set(x, "sampler", js.undefined)
    
    inline def setScripted_metric(value: AggregationsScriptedMetricAggregation): Self = StObject.set(x, "scripted_metric", value.asInstanceOf[js.Any])
    
    inline def setScripted_metricUndefined: Self = StObject.set(x, "scripted_metric", js.undefined)
    
    inline def setSerial_diff(value: AggregationsSerialDifferencingAggregation): Self = StObject.set(x, "serial_diff", value.asInstanceOf[js.Any])
    
    inline def setSerial_diffUndefined: Self = StObject.set(x, "serial_diff", js.undefined)
    
    inline def setSignificant_terms(value: AggregationsSignificantTermsAggregation): Self = StObject.set(x, "significant_terms", value.asInstanceOf[js.Any])
    
    inline def setSignificant_termsUndefined: Self = StObject.set(x, "significant_terms", js.undefined)
    
    inline def setSignificant_text(value: AggregationsSignificantTextAggregation): Self = StObject.set(x, "significant_text", value.asInstanceOf[js.Any])
    
    inline def setSignificant_textUndefined: Self = StObject.set(x, "significant_text", js.undefined)
    
    inline def setStats(value: AggregationsStatsAggregation): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    inline def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
    
    inline def setStats_bucket(value: AggregationsStatsBucketAggregation): Self = StObject.set(x, "stats_bucket", value.asInstanceOf[js.Any])
    
    inline def setStats_bucketUndefined: Self = StObject.set(x, "stats_bucket", js.undefined)
    
    inline def setString_stats(value: AggregationsStringStatsAggregation): Self = StObject.set(x, "string_stats", value.asInstanceOf[js.Any])
    
    inline def setString_statsUndefined: Self = StObject.set(x, "string_stats", js.undefined)
    
    inline def setSum(value: AggregationsSumAggregation): Self = StObject.set(x, "sum", value.asInstanceOf[js.Any])
    
    inline def setSumUndefined: Self = StObject.set(x, "sum", js.undefined)
    
    inline def setSum_bucket(value: AggregationsSumBucketAggregation): Self = StObject.set(x, "sum_bucket", value.asInstanceOf[js.Any])
    
    inline def setSum_bucketUndefined: Self = StObject.set(x, "sum_bucket", js.undefined)
    
    inline def setT_test(value: AggregationsTTestAggregation): Self = StObject.set(x, "t_test", value.asInstanceOf[js.Any])
    
    inline def setT_testUndefined: Self = StObject.set(x, "t_test", js.undefined)
    
    inline def setTerms(value: AggregationsTermsAggregation): Self = StObject.set(x, "terms", value.asInstanceOf[js.Any])
    
    inline def setTermsUndefined: Self = StObject.set(x, "terms", js.undefined)
    
    inline def setTop_hits(value: AggregationsTopHitsAggregation): Self = StObject.set(x, "top_hits", value.asInstanceOf[js.Any])
    
    inline def setTop_hitsUndefined: Self = StObject.set(x, "top_hits", js.undefined)
    
    inline def setTop_metrics(value: AggregationsTopMetricsAggregation): Self = StObject.set(x, "top_metrics", value.asInstanceOf[js.Any])
    
    inline def setTop_metricsUndefined: Self = StObject.set(x, "top_metrics", js.undefined)
    
    inline def setValue_count(value: AggregationsValueCountAggregation): Self = StObject.set(x, "value_count", value.asInstanceOf[js.Any])
    
    inline def setValue_countUndefined: Self = StObject.set(x, "value_count", js.undefined)
    
    inline def setVariable_width_histogram(value: AggregationsVariableWidthHistogramAggregation): Self = StObject.set(x, "variable_width_histogram", value.asInstanceOf[js.Any])
    
    inline def setVariable_width_histogramUndefined: Self = StObject.set(x, "variable_width_histogram", js.undefined)
    
    inline def setWeighted_avg(value: AggregationsWeightedAverageAggregation): Self = StObject.set(x, "weighted_avg", value.asInstanceOf[js.Any])
    
    inline def setWeighted_avgUndefined: Self = StObject.set(x, "weighted_avg", js.undefined)
  }
}
