package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.elasticElasticsearch.libApiTypesMod.MappingBinaryProperty
  - typings.elasticElasticsearch.libApiTypesMod.MappingBooleanProperty
  - typings.elasticElasticsearch.libApiTypesMod.MappingDynamicProperty
  - typings.elasticElasticsearch.libApiTypesMod.MappingJoinProperty
  - typings.elasticElasticsearch.libApiTypesMod.MappingKeywordProperty
  - typings.elasticElasticsearch.libApiTypesMod.MappingMatchOnlyTextProperty
  - typings.elasticElasticsearch.libApiTypesMod.MappingPercolatorProperty
  - typings.elasticElasticsearch.libApiTypesMod.MappingRankFeatureProperty
  - typings.elasticElasticsearch.libApiTypesMod.MappingRankFeaturesProperty
  - typings.elasticElasticsearch.libApiTypesMod.MappingSearchAsYouTypeProperty
  - typings.elasticElasticsearch.libApiTypesMod.MappingTextProperty
  - typings.elasticElasticsearch.libApiTypesMod.MappingVersionProperty
  - typings.elasticElasticsearch.libApiTypesMod.MappingWildcardProperty
  - typings.elasticElasticsearch.libApiTypesMod.MappingDateNanosProperty
  - typings.elasticElasticsearch.libApiTypesMod.MappingDateProperty
  - typings.elasticElasticsearch.libApiTypesMod.MappingAggregateMetricDoubleProperty
  - typings.elasticElasticsearch.libApiTypesMod.MappingDenseVectorProperty
  - typings.elasticElasticsearch.libApiTypesMod.MappingFlattenedProperty
  - typings.elasticElasticsearch.libApiTypesMod.MappingNestedProperty
  - typings.elasticElasticsearch.libApiTypesMod.MappingObjectProperty
  - typings.elasticElasticsearch.libApiTypesMod.MappingCompletionProperty
  - typings.elasticElasticsearch.libApiTypesMod.MappingConstantKeywordProperty
  - typings.elasticElasticsearch.libApiTypesMod.MappingFieldAliasProperty
  - typings.elasticElasticsearch.libApiTypesMod.MappingHistogramProperty
  - typings.elasticElasticsearch.libApiTypesMod.MappingIpProperty
  - typings.elasticElasticsearch.libApiTypesMod.MappingMurmur3HashProperty
  - typings.elasticElasticsearch.libApiTypesMod.MappingTokenCountProperty
  - typings.elasticElasticsearch.libApiTypesMod.MappingGeoPointProperty
  - typings.elasticElasticsearch.libApiTypesMod.MappingGeoShapeProperty
  - typings.elasticElasticsearch.libApiTypesMod.MappingPointProperty
  - typings.elasticElasticsearch.libApiTypesMod.MappingShapeProperty
  - typings.elasticElasticsearch.libApiTypesMod.MappingByteNumberProperty
  - typings.elasticElasticsearch.libApiTypesMod.MappingDoubleNumberProperty
  - typings.elasticElasticsearch.libApiTypesMod.MappingFloatNumberProperty
  - typings.elasticElasticsearch.libApiTypesMod.MappingHalfFloatNumberProperty
  - typings.elasticElasticsearch.libApiTypesMod.MappingIntegerNumberProperty
  - typings.elasticElasticsearch.libApiTypesMod.MappingLongNumberProperty
  - typings.elasticElasticsearch.libApiTypesMod.MappingScaledFloatNumberProperty
  - typings.elasticElasticsearch.libApiTypesMod.MappingShortNumberProperty
  - typings.elasticElasticsearch.libApiTypesMod.MappingUnsignedLongNumberProperty
  - typings.elasticElasticsearch.libApiTypesMod.MappingDateRangeProperty
  - typings.elasticElasticsearch.libApiTypesMod.MappingDoubleRangeProperty
  - typings.elasticElasticsearch.libApiTypesMod.MappingFloatRangeProperty
  - typings.elasticElasticsearch.libApiTypesMod.MappingIntegerRangeProperty
  - typings.elasticElasticsearch.libApiTypesMod.MappingIpRangeProperty
  - typings.elasticElasticsearch.libApiTypesMod.MappingLongRangeProperty
*/
trait MappingProperty extends StObject
object MappingProperty {
  
  inline def MappingAggregateMetricDoubleProperty(default_metric: String, metrics: js.Array[String]): typings.elasticElasticsearch.libApiTypesMod.MappingAggregateMetricDoubleProperty = {
    val __obj = js.Dynamic.literal(default_metric = default_metric.asInstanceOf[js.Any], metrics = metrics.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("aggregate_metric_double")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.MappingAggregateMetricDoubleProperty]
  }
  
  inline def MappingBinaryProperty(): typings.elasticElasticsearch.libApiTypesMod.MappingBinaryProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("binary")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.MappingBinaryProperty]
  }
  
  inline def MappingBooleanProperty(): typings.elasticElasticsearch.libApiTypesMod.MappingBooleanProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("boolean")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.MappingBooleanProperty]
  }
  
  inline def MappingByteNumberProperty(): typings.elasticElasticsearch.libApiTypesMod.MappingByteNumberProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("byte")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.MappingByteNumberProperty]
  }
  
  inline def MappingCompletionProperty(): typings.elasticElasticsearch.libApiTypesMod.MappingCompletionProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("completion")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.MappingCompletionProperty]
  }
  
  inline def MappingConstantKeywordProperty(): typings.elasticElasticsearch.libApiTypesMod.MappingConstantKeywordProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("constant_keyword")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.MappingConstantKeywordProperty]
  }
  
  inline def MappingDateNanosProperty(): typings.elasticElasticsearch.libApiTypesMod.MappingDateNanosProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("date_nanos")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.MappingDateNanosProperty]
  }
  
  inline def MappingDateProperty(): typings.elasticElasticsearch.libApiTypesMod.MappingDateProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("date")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.MappingDateProperty]
  }
  
  inline def MappingDateRangeProperty(): typings.elasticElasticsearch.libApiTypesMod.MappingDateRangeProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("date_range")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.MappingDateRangeProperty]
  }
  
  inline def MappingDenseVectorProperty(dims: integer): typings.elasticElasticsearch.libApiTypesMod.MappingDenseVectorProperty = {
    val __obj = js.Dynamic.literal(dims = dims.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("dense_vector")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.MappingDenseVectorProperty]
  }
  
  inline def MappingDoubleNumberProperty(): typings.elasticElasticsearch.libApiTypesMod.MappingDoubleNumberProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("double")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.MappingDoubleNumberProperty]
  }
  
  inline def MappingDoubleRangeProperty(): typings.elasticElasticsearch.libApiTypesMod.MappingDoubleRangeProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("double_range")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.MappingDoubleRangeProperty]
  }
  
  inline def MappingDynamicProperty(): typings.elasticElasticsearch.libApiTypesMod.MappingDynamicProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("{dynamic_property}")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.MappingDynamicProperty]
  }
  
  inline def MappingFieldAliasProperty(): typings.elasticElasticsearch.libApiTypesMod.MappingFieldAliasProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("alias")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.MappingFieldAliasProperty]
  }
  
  inline def MappingFlattenedProperty(): typings.elasticElasticsearch.libApiTypesMod.MappingFlattenedProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("flattened")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.MappingFlattenedProperty]
  }
  
  inline def MappingFloatNumberProperty(): typings.elasticElasticsearch.libApiTypesMod.MappingFloatNumberProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("float")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.MappingFloatNumberProperty]
  }
  
  inline def MappingFloatRangeProperty(): typings.elasticElasticsearch.libApiTypesMod.MappingFloatRangeProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("float_range")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.MappingFloatRangeProperty]
  }
  
  inline def MappingGeoPointProperty(): typings.elasticElasticsearch.libApiTypesMod.MappingGeoPointProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("geo_point")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.MappingGeoPointProperty]
  }
  
  inline def MappingGeoShapeProperty(): typings.elasticElasticsearch.libApiTypesMod.MappingGeoShapeProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("geo_shape")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.MappingGeoShapeProperty]
  }
  
  inline def MappingHalfFloatNumberProperty(): typings.elasticElasticsearch.libApiTypesMod.MappingHalfFloatNumberProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("half_float")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.MappingHalfFloatNumberProperty]
  }
  
  inline def MappingHistogramProperty(): typings.elasticElasticsearch.libApiTypesMod.MappingHistogramProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("histogram")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.MappingHistogramProperty]
  }
  
  inline def MappingIntegerNumberProperty(): typings.elasticElasticsearch.libApiTypesMod.MappingIntegerNumberProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("integer")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.MappingIntegerNumberProperty]
  }
  
  inline def MappingIntegerRangeProperty(): typings.elasticElasticsearch.libApiTypesMod.MappingIntegerRangeProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("integer_range")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.MappingIntegerRangeProperty]
  }
  
  inline def MappingIpProperty(): typings.elasticElasticsearch.libApiTypesMod.MappingIpProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ip")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.MappingIpProperty]
  }
  
  inline def MappingIpRangeProperty(): typings.elasticElasticsearch.libApiTypesMod.MappingIpRangeProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ip_range")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.MappingIpRangeProperty]
  }
  
  inline def MappingJoinProperty(): typings.elasticElasticsearch.libApiTypesMod.MappingJoinProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("join")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.MappingJoinProperty]
  }
  
  inline def MappingKeywordProperty(): typings.elasticElasticsearch.libApiTypesMod.MappingKeywordProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("keyword")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.MappingKeywordProperty]
  }
  
  inline def MappingLongNumberProperty(): typings.elasticElasticsearch.libApiTypesMod.MappingLongNumberProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("long")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.MappingLongNumberProperty]
  }
  
  inline def MappingLongRangeProperty(): typings.elasticElasticsearch.libApiTypesMod.MappingLongRangeProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("long_range")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.MappingLongRangeProperty]
  }
  
  inline def MappingMatchOnlyTextProperty(): typings.elasticElasticsearch.libApiTypesMod.MappingMatchOnlyTextProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("match_only_text")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.MappingMatchOnlyTextProperty]
  }
  
  inline def MappingMurmur3HashProperty(): typings.elasticElasticsearch.libApiTypesMod.MappingMurmur3HashProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("murmur3")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.MappingMurmur3HashProperty]
  }
  
  inline def MappingNestedProperty(): typings.elasticElasticsearch.libApiTypesMod.MappingNestedProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("nested")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.MappingNestedProperty]
  }
  
  inline def MappingObjectProperty(): typings.elasticElasticsearch.libApiTypesMod.MappingObjectProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.MappingObjectProperty]
  }
  
  inline def MappingPercolatorProperty(): typings.elasticElasticsearch.libApiTypesMod.MappingPercolatorProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("percolator")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.MappingPercolatorProperty]
  }
  
  inline def MappingPointProperty(): typings.elasticElasticsearch.libApiTypesMod.MappingPointProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("point")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.MappingPointProperty]
  }
  
  inline def MappingRankFeatureProperty(): typings.elasticElasticsearch.libApiTypesMod.MappingRankFeatureProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("rank_feature")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.MappingRankFeatureProperty]
  }
  
  inline def MappingRankFeaturesProperty(): typings.elasticElasticsearch.libApiTypesMod.MappingRankFeaturesProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("rank_features")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.MappingRankFeaturesProperty]
  }
  
  inline def MappingScaledFloatNumberProperty(): typings.elasticElasticsearch.libApiTypesMod.MappingScaledFloatNumberProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("scaled_float")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.MappingScaledFloatNumberProperty]
  }
  
  inline def MappingSearchAsYouTypeProperty(): typings.elasticElasticsearch.libApiTypesMod.MappingSearchAsYouTypeProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("search_as_you_type")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.MappingSearchAsYouTypeProperty]
  }
  
  inline def MappingShapeProperty(): typings.elasticElasticsearch.libApiTypesMod.MappingShapeProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("shape")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.MappingShapeProperty]
  }
  
  inline def MappingShortNumberProperty(): typings.elasticElasticsearch.libApiTypesMod.MappingShortNumberProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("short")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.MappingShortNumberProperty]
  }
  
  inline def MappingTextProperty(): typings.elasticElasticsearch.libApiTypesMod.MappingTextProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("text")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.MappingTextProperty]
  }
  
  inline def MappingTokenCountProperty(): typings.elasticElasticsearch.libApiTypesMod.MappingTokenCountProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("token_count")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.MappingTokenCountProperty]
  }
  
  inline def MappingUnsignedLongNumberProperty(): typings.elasticElasticsearch.libApiTypesMod.MappingUnsignedLongNumberProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("unsigned_long")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.MappingUnsignedLongNumberProperty]
  }
  
  inline def MappingVersionProperty(): typings.elasticElasticsearch.libApiTypesMod.MappingVersionProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("version")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.MappingVersionProperty]
  }
  
  inline def MappingWildcardProperty(): typings.elasticElasticsearch.libApiTypesMod.MappingWildcardProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("wildcard")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.MappingWildcardProperty]
  }
}
