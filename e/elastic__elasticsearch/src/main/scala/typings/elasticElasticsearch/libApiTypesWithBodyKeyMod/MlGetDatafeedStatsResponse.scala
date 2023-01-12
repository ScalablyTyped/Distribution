package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlGetDatafeedStatsResponse extends StObject {
  
  var count: long
  
  var datafeeds: js.Array[MlDatafeedStats]
}
object MlGetDatafeedStatsResponse {
  
  inline def apply(count: long, datafeeds: js.Array[MlDatafeedStats]): MlGetDatafeedStatsResponse = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], datafeeds = datafeeds.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlGetDatafeedStatsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlGetDatafeedStatsResponse] (val x: Self) extends AnyVal {
    
    inline def setCount(value: long): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setDatafeeds(value: js.Array[MlDatafeedStats]): Self = StObject.set(x, "datafeeds", value.asInstanceOf[js.Any])
    
    inline def setDatafeedsVarargs(value: MlDatafeedStats*): Self = StObject.set(x, "datafeeds", js.Array(value*))
  }
}
