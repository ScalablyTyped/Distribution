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

