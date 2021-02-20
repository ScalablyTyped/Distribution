package typings.devtoolsProtocol.mod.Protocol.Browser

import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Histogram extends StObject {
  
  /**
    * Buckets.
    */
  var buckets: js.Array[Bucket] = js.native
  
  /**
    * Total number of samples.
    */
  var count: integer = js.native
  
  /**
    * Name.
    */
  var name: String = js.native
  
  /**
    * Sum of sample values.
    */
  var sum: integer = js.native
}
object Histogram {
  
  @scala.inline
  def apply(buckets: js.Array[Bucket], count: integer, name: String, sum: integer): Histogram = {
    val __obj = js.Dynamic.literal(buckets = buckets.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sum = sum.asInstanceOf[js.Any])
    __obj.asInstanceOf[Histogram]
  }
  
  @scala.inline
  implicit class HistogramMutableBuilder[Self <: Histogram] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuckets(value: js.Array[Bucket]): Self = StObject.set(x, "buckets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketsVarargs(value: Bucket*): Self = StObject.set(x, "buckets", js.Array(value :_*))
    
    @scala.inline
    def setCount(value: integer): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSum(value: integer): Self = StObject.set(x, "sum", value.asInstanceOf[js.Any])
  }
}
