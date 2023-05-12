package typings.firebaseFirestore

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFirestoreSrcRemoteBloomFilterMod {
  
  @JSImport("@firebase/firestore/dist/firestore/src/remote/bloom_filter", "BloomFilter")
  @js.native
  open class BloomFilter protected () extends StObject {
    def this(bitmap: js.typedarray.Uint8Array, padding: Double, hashCount: Double) = this()
    
    val bitCount: Double = js.native
    
    /* private */ val bitCountInInteger: Any = js.native
    
    val bitmap: js.typedarray.Uint8Array = js.native
    
    /* private */ var getBitIndex: Any = js.native
    
    val hashCount: Double = js.native
    
    /* private */ var insert: Any = js.native
    
    /* private */ var isBitSet: Any = js.native
    
    def mightContain(value: String): Boolean = js.native
    
    val padding: Double = js.native
    
    /* private */ var setBit: Any = js.native
  }
  /* static members */
  object BloomFilter {
    
    @JSImport("@firebase/firestore/dist/firestore/src/remote/bloom_filter", "BloomFilter")
    @js.native
    val ^ : js.Any = js.native
    
    /** Create bloom filter for testing purposes only. */
    inline def create(bitCount: Double, hashCount: Double, contains: js.Array[String]): BloomFilter = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(bitCount.asInstanceOf[js.Any], hashCount.asInstanceOf[js.Any], contains.asInstanceOf[js.Any])).asInstanceOf[BloomFilter]
  }
  
  @JSImport("@firebase/firestore/dist/firestore/src/remote/bloom_filter", "BloomFilterError")
  @js.native
  open class BloomFilterError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
}
