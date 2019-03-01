package typings
package getDashStreamLib.getDashStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Encoding of the incoming stream.
    * @default 'utf8'
    */
  var encoding: js.UndefOr[nodeLib.BufferEncoding | getDashStreamLib.getDashStreamLibStrings.buffer] = js.undefined
  /**
    * Maximum length of the returned string. If it exceeds this value before
    * the stream ends, the promise will be rejected.
    * @default Infinity
    */
  var maxBuffer: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    encoding: nodeLib.BufferEncoding | getDashStreamLib.getDashStreamLibStrings.buffer = null,
    maxBuffer: scala.Int | scala.Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (maxBuffer != null) __obj.updateDynamic("maxBuffer")(maxBuffer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

