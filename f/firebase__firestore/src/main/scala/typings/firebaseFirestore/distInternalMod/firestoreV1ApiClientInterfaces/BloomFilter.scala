package typings.firebaseFirestore.distInternalMod.firestoreV1ApiClientInterfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BloomFilter extends StObject {
  
  var bits: js.UndefOr[BitSequence] = js.undefined
  
  var hashCount: js.UndefOr[Double] = js.undefined
}
object BloomFilter {
  
  inline def apply(): BloomFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BloomFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BloomFilter] (val x: Self) extends AnyVal {
    
    inline def setBits(value: BitSequence): Self = StObject.set(x, "bits", value.asInstanceOf[js.Any])
    
    inline def setBitsUndefined: Self = StObject.set(x, "bits", js.undefined)
    
    inline def setHashCount(value: Double): Self = StObject.set(x, "hashCount", value.asInstanceOf[js.Any])
    
    inline def setHashCountUndefined: Self = StObject.set(x, "hashCount", js.undefined)
  }
}
