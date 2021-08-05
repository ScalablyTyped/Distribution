package typings.devtoolsProtocol.mod.Protocol.Browser

import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bucket extends StObject {
  
  /**
    * Number of samples.
    */
  var count: integer
  
  /**
    * Maximum value (exclusive).
    */
  var high: integer
  
  /**
    * Minimum value (inclusive).
    */
  var low: integer
}
object Bucket {
  
  inline def apply(count: integer, high: integer, low: integer): Bucket = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], high = high.asInstanceOf[js.Any], low = low.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bucket]
  }
  
  extension [Self <: Bucket](x: Self) {
    
    inline def setCount(value: integer): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setHigh(value: integer): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
    
    inline def setLow(value: integer): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
  }
}
