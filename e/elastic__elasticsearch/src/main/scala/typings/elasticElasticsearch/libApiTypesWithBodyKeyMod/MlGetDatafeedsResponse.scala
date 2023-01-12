package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlGetDatafeedsResponse extends StObject {
  
  var count: long
  
  var datafeeds: js.Array[MlDatafeed]
}
object MlGetDatafeedsResponse {
  
  inline def apply(count: long, datafeeds: js.Array[MlDatafeed]): MlGetDatafeedsResponse = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], datafeeds = datafeeds.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlGetDatafeedsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlGetDatafeedsResponse] (val x: Self) extends AnyVal {
    
    inline def setCount(value: long): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setDatafeeds(value: js.Array[MlDatafeed]): Self = StObject.set(x, "datafeeds", value.asInstanceOf[js.Any])
    
    inline def setDatafeedsVarargs(value: MlDatafeed*): Self = StObject.set(x, "datafeeds", js.Array(value*))
  }
}
