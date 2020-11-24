package typings.devtoolsProtocol.mod.Protocol.Browser

import typings.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Histogram extends js.Object {
  
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
  implicit class HistogramOps[Self <: Histogram] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBucketsVarargs(value: Bucket*): Self = this.set("buckets", js.Array(value :_*))
    
    @scala.inline
    def setBuckets(value: js.Array[Bucket]): Self = this.set("buckets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: integer): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSum(value: integer): Self = this.set("sum", value.asInstanceOf[js.Any])
  }
}
