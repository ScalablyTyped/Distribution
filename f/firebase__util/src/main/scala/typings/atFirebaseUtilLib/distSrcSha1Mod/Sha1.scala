package typings
package atFirebaseUtilLib.distSrcSha1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/util/dist/src/sha1", "Sha1")
@js.native
class Sha1 ()
  extends atFirebaseUtilLib.distSrcHashMod.Hash {
  /**
       * An array of 80 bytes, each a part of the message to be hashed.  Referred to
       * as the message schedule in the docs.
       * @type {!Array<number>}
       * @private
       */
  var `W_`: js.Any = js.native
  /**
       * A buffer holding the partially computed hash result.
       * @type {!Array<number>}
       * @private
       */
  var `buf_`: js.Any = js.native
  /**
       * Holds the previous values of accumulated variables a-e in the compress_
       * function.
       * @type {!Array<number>}
       * @private
       */
  var `chain_`: js.Any = js.native
  /**
       * @private {number}
       */
  var `inbuf_`: js.Any = js.native
  /**
       * Contains data needed to pad messages less than 64 bytes.
       * @type {!Array<number>}
       * @private
       */
  var `pad_`: js.Any = js.native
  /**
       * @private {number}
       */
  var `total_`: js.Any = js.native
  /**
       * Internal compress helper function.
       * @param {!Array<number>|!Uint8Array|string} buf Block to compress.
       * @param {number=} opt_offset Offset of the block in the buffer.
       * @private
       */
  def `compress_`(buf: js.Any): scala.Unit = js.native
  /**
       * Internal compress helper function.
       * @param {!Array<number>|!Uint8Array|string} buf Block to compress.
       * @param {number=} opt_offset Offset of the block in the buffer.
       * @private
       */
  def `compress_`(buf: js.Any, opt_offset: js.Any): scala.Unit = js.native
  /** @override */
  def digest(): js.Array[_] = js.native
  def reset(): scala.Unit = js.native
  def update(bytes: js.Any): scala.Unit = js.native
  def update(bytes: js.Any, opt_length: js.Any): scala.Unit = js.native
}

