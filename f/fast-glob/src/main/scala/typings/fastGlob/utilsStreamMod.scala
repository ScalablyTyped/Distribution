package typings.fastGlob

import typings.node.NodeJS.ReadableStream
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-glob/out/utils/stream", JSImport.Namespace)
@js.native
object utilsStreamMod extends js.Object {
  def merge(streams: js.Array[Readable]): ReadableStream = js.native
}

