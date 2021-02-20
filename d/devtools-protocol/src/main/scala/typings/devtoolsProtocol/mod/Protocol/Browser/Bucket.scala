package typings.devtoolsProtocol.mod.Protocol.Browser

import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bucket extends StObject {
  
  /**
    * Number of samples.
    */
  var count: integer = js.native
  
  /**
    * Maximum value (exclusive).
    */
  var high: integer = js.native
  
  /**
    * Minimum value (inclusive).
    */
  var low: integer = js.native
}
object Bucket {
  
  @scala.inline
  def apply(count: integer, high: integer, low: integer): Bucket = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], high = high.asInstanceOf[js.Any], low = low.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bucket]
  }
  
  @scala.inline
  implicit class BucketMutableBuilder[Self <: Bucket] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: integer): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHigh(value: integer): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLow(value: integer): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
  }
}
