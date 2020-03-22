package typings.fastGlob

import typings.fastGlob.tasksMod.Task
import typings.fastGlob.typesMod.ReaderOptions
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-glob/out/providers/stream", JSImport.Namespace)
@js.native
object streamMod extends js.Object {
  @js.native
  trait ProviderStream
    extends typings.fastGlob.providerMod.default[Readable] {
    var _reader: typings.fastGlob.readersStreamMod.default = js.native
    def api(root: String, task: Task, options: ReaderOptions): Readable = js.native
  }
  
  @js.native
  class default () extends ProviderStream
  
}

