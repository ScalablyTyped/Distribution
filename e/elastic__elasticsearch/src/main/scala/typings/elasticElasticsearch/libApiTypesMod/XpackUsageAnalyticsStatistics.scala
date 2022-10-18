package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XpackUsageAnalyticsStatistics extends StObject {
  
  var boxplot_usage: long
  
  var cumulative_cardinality_usage: long
  
  var moving_percentiles_usage: long
  
  var multi_terms_usage: js.UndefOr[long] = js.undefined
  
  var normalize_usage: long
  
  var rate_usage: long
  
  var string_stats_usage: long
  
  var t_test_usage: long
  
  var top_metrics_usage: long
}
object XpackUsageAnalyticsStatistics {
  
  inline def apply(
    boxplot_usage: long,
    cumulative_cardinality_usage: long,
    moving_percentiles_usage: long,
    normalize_usage: long,
    rate_usage: long,
    string_stats_usage: long,
    t_test_usage: long,
    top_metrics_usage: long
  ): XpackUsageAnalyticsStatistics = {
    val __obj = js.Dynamic.literal(boxplot_usage = boxplot_usage.asInstanceOf[js.Any], cumulative_cardinality_usage = cumulative_cardinality_usage.asInstanceOf[js.Any], moving_percentiles_usage = moving_percentiles_usage.asInstanceOf[js.Any], normalize_usage = normalize_usage.asInstanceOf[js.Any], rate_usage = rate_usage.asInstanceOf[js.Any], string_stats_usage = string_stats_usage.asInstanceOf[js.Any], t_test_usage = t_test_usage.asInstanceOf[js.Any], top_metrics_usage = top_metrics_usage.asInstanceOf[js.Any])
    __obj.asInstanceOf[XpackUsageAnalyticsStatistics]
  }
  
  extension [Self <: XpackUsageAnalyticsStatistics](x: Self) {
    
    inline def setBoxplot_usage(value: long): Self = StObject.set(x, "boxplot_usage", value.asInstanceOf[js.Any])
    
    inline def setCumulative_cardinality_usage(value: long): Self = StObject.set(x, "cumulative_cardinality_usage", value.asInstanceOf[js.Any])
    
    inline def setMoving_percentiles_usage(value: long): Self = StObject.set(x, "moving_percentiles_usage", value.asInstanceOf[js.Any])
    
    inline def setMulti_terms_usage(value: long): Self = StObject.set(x, "multi_terms_usage", value.asInstanceOf[js.Any])
    
    inline def setMulti_terms_usageUndefined: Self = StObject.set(x, "multi_terms_usage", js.undefined)
    
    inline def setNormalize_usage(value: long): Self = StObject.set(x, "normalize_usage", value.asInstanceOf[js.Any])
    
    inline def setRate_usage(value: long): Self = StObject.set(x, "rate_usage", value.asInstanceOf[js.Any])
    
    inline def setString_stats_usage(value: long): Self = StObject.set(x, "string_stats_usage", value.asInstanceOf[js.Any])
    
    inline def setT_test_usage(value: long): Self = StObject.set(x, "t_test_usage", value.asInstanceOf[js.Any])
    
    inline def setTop_metrics_usage(value: long): Self = StObject.set(x, "top_metrics_usage", value.asInstanceOf[js.Any])
  }
}
