package typings.devtoolsProtocol.mod.Protocol.Browser

import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Histogram extends StObject {
  
  /**
    * Buckets.
    */
  var buckets: js.Array[Bucket]
  
  /**
    * Total number of samples.
    */
  var count: integer
  
  /**
    * Name.
    */
  var name: String
  
  /**
    * Sum of sample values.
    */
  var sum: integer
}
object Histogram {
  
  inline def apply(buckets: js.Array[Bucket], count: integer, name: String, sum: integer): Histogram = {
    val __obj = js.Dynamic.literal(buckets = buckets.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sum = sum.asInstanceOf[js.Any])
    __obj.asInstanceOf[Histogram]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Histogram] (val x: Self) extends AnyVal {
    
    inline def setBuckets(value: js.Array[Bucket]): Self = StObject.set(x, "buckets", value.asInstanceOf[js.Any])
    
    inline def setBucketsVarargs(value: Bucket*): Self = StObject.set(x, "buckets", js.Array(value*))
    
    inline def setCount(value: integer): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSum(value: integer): Self = StObject.set(x, "sum", value.asInstanceOf[js.Any])
  }
}
