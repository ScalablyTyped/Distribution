package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsMatrixStatsFields extends StObject {
  
  var correlation: Record[Field, double]
  
  var count: long
  
  var covariance: Record[Field, double]
  
  var kurtosis: double
  
  var mean: double
  
  var name: Field
  
  var skewness: double
  
  var variance: double
}
object AggregationsMatrixStatsFields {
  
  inline def apply(
    correlation: Record[Field, double],
    count: long,
    covariance: Record[Field, double],
    kurtosis: double,
    mean: double,
    name: Field,
    skewness: double,
    variance: double
  ): AggregationsMatrixStatsFields = {
    val __obj = js.Dynamic.literal(correlation = correlation.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], covariance = covariance.asInstanceOf[js.Any], kurtosis = kurtosis.asInstanceOf[js.Any], mean = mean.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], skewness = skewness.asInstanceOf[js.Any], variance = variance.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsMatrixStatsFields]
  }
  
  extension [Self <: AggregationsMatrixStatsFields](x: Self) {
    
    inline def setCorrelation(value: Record[Field, double]): Self = StObject.set(x, "correlation", value.asInstanceOf[js.Any])
    
    inline def setCount(value: long): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCovariance(value: Record[Field, double]): Self = StObject.set(x, "covariance", value.asInstanceOf[js.Any])
    
    inline def setKurtosis(value: double): Self = StObject.set(x, "kurtosis", value.asInstanceOf[js.Any])
    
    inline def setMean(value: double): Self = StObject.set(x, "mean", value.asInstanceOf[js.Any])
    
    inline def setName(value: Field): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSkewness(value: double): Self = StObject.set(x, "skewness", value.asInstanceOf[js.Any])
    
    inline def setVariance(value: double): Self = StObject.set(x, "variance", value.asInstanceOf[js.Any])
  }
}
