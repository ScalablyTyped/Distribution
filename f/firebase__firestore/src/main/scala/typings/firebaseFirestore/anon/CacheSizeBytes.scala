package typings.firebaseFirestore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CacheSizeBytes extends StObject {
  
  var cacheSizeBytes: js.UndefOr[Double] = js.undefined
}
object CacheSizeBytes {
  
  inline def apply(): CacheSizeBytes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheSizeBytes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CacheSizeBytes] (val x: Self) extends AnyVal {
    
    inline def setCacheSizeBytes(value: Double): Self = StObject.set(x, "cacheSizeBytes", value.asInstanceOf[js.Any])
    
    inline def setCacheSizeBytesUndefined: Self = StObject.set(x, "cacheSizeBytes", js.undefined)
  }
}
