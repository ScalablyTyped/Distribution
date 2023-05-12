package typings.firebaseFirestore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applied extends StObject {
  
  /**
    * Whether a full requery was averted by using the bloom filter. If false,
    * then something happened, such as a false positive, to prevent using the
    * bloom filter to avoid a full requery.
    */
  var applied: Boolean
  
  /** The number of bytes in the bloom filter's bitmask. */
  var bitmapLength: Double
  
  /** The number of hash functions used in the bloom filter. */
  var hashCount: Double
  
  /** The number of bits of padding in the last byte of the bloom filter. */
  var padding: Double
}
object Applied {
  
  inline def apply(applied: Boolean, bitmapLength: Double, hashCount: Double, padding: Double): Applied = {
    val __obj = js.Dynamic.literal(applied = applied.asInstanceOf[js.Any], bitmapLength = bitmapLength.asInstanceOf[js.Any], hashCount = hashCount.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applied]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Applied] (val x: Self) extends AnyVal {
    
    inline def setApplied(value: Boolean): Self = StObject.set(x, "applied", value.asInstanceOf[js.Any])
    
    inline def setBitmapLength(value: Double): Self = StObject.set(x, "bitmapLength", value.asInstanceOf[js.Any])
    
    inline def setHashCount(value: Double): Self = StObject.set(x, "hashCount", value.asInstanceOf[js.Any])
    
    inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
  }
}
