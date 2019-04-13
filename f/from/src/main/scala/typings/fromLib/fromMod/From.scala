package typings
package fromLib.fromMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait From extends js.Object {
  def apply(chunks: js.Array[_]): nodeLib.NodeJSNs.ReadableStream = js.native
  def apply(getChunk: js.Function2[/* count */ scala.Double, /* next */ js.Function0[_], _]): nodeLib.NodeJSNs.ReadableStream = js.native
  def emit(`type`: java.lang.String, data: js.Any): scala.Unit = js.native
}

