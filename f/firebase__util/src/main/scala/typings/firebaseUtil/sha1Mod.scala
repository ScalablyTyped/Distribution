package typings.firebaseUtil

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/util/dist/src/sha1", JSImport.Namespace)
@js.native
object sha1Mod extends js.Object {
  
  @js.native
  class Sha1 () extends js.Object {
    
    /**
      * An array of 80 bytes, each a part of the message to be hashed.  Referred to
      * as the message schedule in the docs.
      * @private
      */
    var W_ : js.Any = js.native
    
    var blockSize: Double = js.native
    
    /**
      * A buffer holding the partially computed hash result.
      * @private
      */
    var buf_ : js.Any = js.native
    
    /**
      * Holds the previous values of accumulated variables a-e in the compress_
      * function.
      * @private
      */
    var chain_ : js.Any = js.native
    
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
    def compress_(buf: Uint8Array): Unit = js.native
    def compress_(buf: Uint8Array, offset: Double): Unit = js.native
    
    /** @override */
    def digest(): js.Array[Double] = js.native
    
    /**
      * @private {number}
      */
    var inbuf_ : js.Any = js.native
    
    /**
      * Contains data needed to pad messages less than 64 bytes.
      * @private
      */
    var pad_ : js.Any = js.native
    
    def reset(): Unit = js.native
    
    /**
      * @private {number}
      */
    var total_ : js.Any = js.native
    
    def update(): Unit = js.native
    def update(bytes: js.UndefOr[scala.Nothing], length: Double): Unit = js.native
    def update(bytes: String): Unit = js.native
    def update(bytes: String, length: Double): Unit = js.native
    def update(bytes: js.Array[Double]): Unit = js.native
    def update(bytes: js.Array[Double], length: Double): Unit = js.native
    def update(bytes: Uint8Array): Unit = js.native
    def update(bytes: Uint8Array, length: Double): Unit = js.native
  }
}
