package typings.firebaseUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcSha1Mod {
  
  @JSImport("@firebase/util/dist/src/sha1", "Sha1")
  @js.native
  open class Sha1 () extends StObject {
    
    /**
      * An array of 80 bytes, each a part of the message to be hashed.  Referred to
      * as the message schedule in the docs.
      * @private
      */
    /* private */ var W_ : Any = js.native
    
    var blockSize: Double = js.native
    
    /**
      * A buffer holding the partially computed hash result.
      * @private
      */
    /* private */ var buf_ : Any = js.native
    
    /**
      * Holds the previous values of accumulated variables a-e in the compress_
      * function.
      * @private
      */
    /* private */ var chain_ : Any = js.native
    
    def compress_(buf: String): Unit = js.native
    def compress_(buf: String, offset: Double): Unit = js.native
    /**
      * Internal compress helper function.
      * @param buf Block to compress.
      * @param offset Offset of the block in the buffer.
      * @private
      */
    def compress_(buf: js.Array[Double]): Unit = js.native
    def compress_(buf: js.Array[Double], offset: Double): Unit = js.native
    def compress_(buf: js.typedarray.Uint8Array): Unit = js.native
    def compress_(buf: js.typedarray.Uint8Array, offset: Double): Unit = js.native
    
    /** @override */
    def digest(): js.Array[Double] = js.native
    
    /**
      * @private {number}
      */
    /* private */ var inbuf_ : Any = js.native
    
    /**
      * Contains data needed to pad messages less than 64 bytes.
      * @private
      */
    /* private */ var pad_ : Any = js.native
    
    def reset(): Unit = js.native
    
    /**
      * @private {number}
      */
    /* private */ var total_ : Any = js.native
    
    def update(): Unit = js.native
    def update(bytes: String): Unit = js.native
    def update(bytes: String, length: Double): Unit = js.native
    def update(bytes: js.Array[Double]): Unit = js.native
    def update(bytes: js.Array[Double], length: Double): Unit = js.native
    def update(bytes: js.typedarray.Uint8Array): Unit = js.native
    def update(bytes: js.typedarray.Uint8Array, length: Double): Unit = js.native
    def update(bytes: Unit, length: Double): Unit = js.native
  }
}
