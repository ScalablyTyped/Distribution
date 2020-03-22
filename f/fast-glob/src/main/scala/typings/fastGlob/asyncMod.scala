package typings.fastGlob

import typings.fastGlob.tasksMod.Task
import typings.fastGlob.typesMod.EntryItem
import typings.fastGlob.typesMod.ReaderOptions
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-glob/out/providers/async", JSImport.Namespace)
@js.native
object asyncMod extends js.Object {
  @js.native
  trait ProviderAsync
    extends typings.fastGlob.providerMod.default[js.Promise[js.Array[EntryItem]]] {
    var _reader: typings.fastGlob.readersStreamMod.default = js.native
    def api(root: String, task: Task, options: ReaderOptions): Readable = js.native
  }
  
  @js.native
  class default () extends ProviderAsync
  
}

