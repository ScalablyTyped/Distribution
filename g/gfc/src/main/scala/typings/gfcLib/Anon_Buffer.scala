package typings
package gfcLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Buffer extends js.Object {
  var encoding: js.UndefOr[nodeLib.BufferEncoding | gfcLib.gfcLibStrings.buffer | scala.Null] = js.undefined
}

object Anon_Buffer {
  @scala.inline
  def apply(encoding: nodeLib.BufferEncoding | gfcLib.gfcLibStrings.buffer = null): Anon_Buffer = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Buffer]
  }
}

