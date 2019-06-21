package typings
package atFirebaseUtilLib.distSrcSha1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/util/dist/src/sha1", "Sha1")
@js.native
class Sha1 () extends js.Object {
  /**
    * An array of 80 bytes, each a part of the message to be hashed.  Referred to
    * as the message schedule in the docs.
    * @private
    */
  var W_ : js.Any = js.native
  var blockSize: scala.Double = js.native
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
  /**
    * @private {number}
    */
  var inbuf_ : js.Any = js.native
  /**
    * Contains data needed to pad messages less than 64 bytes.
    * @private
    */
  var pad_ : js.Any = js.native
  /**
    * @private {number}
    */
  var total_ : js.Any = js.native
  def compress_(buf: java.lang.String): scala.Unit = js.native
  def compress_(buf: java.lang.String, offset: scala.Double): scala.Unit = js.native
  /**
    * Internal compress helper function.
    * @param buf Block to compress.
    * @param offset Offset of the block in the buffer.
    * @private
    */
  def compress_(buf: js.Array[scala.Double]): scala.Unit = js.native
  def compress_(buf: js.Array[scala.Double], offset: scala.Double): scala.Unit = js.native
  def compress_(buf: stdLib.Uint8Array): scala.Unit = js.native
  def compress_(buf: stdLib.Uint8Array, offset: scala.Double): scala.Unit = js.native
  /** @override */
  def digest(): js.Array[scala.Double] = js.native
  def reset(): scala.Unit = js.native
  def update(): scala.Unit = js.native
  def update(bytes: java.lang.String): scala.Unit = js.native
  def update(bytes: java.lang.String, length: scala.Double): scala.Unit = js.native
  def update(bytes: js.Array[scala.Double]): scala.Unit = js.native
  def update(bytes: js.Array[scala.Double], length: scala.Double): scala.Unit = js.native
  def update(bytes: stdLib.Uint8Array): scala.Unit = js.native
  def update(bytes: stdLib.Uint8Array, length: scala.Double): scala.Unit = js.native
}

