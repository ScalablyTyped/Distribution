package typings.fastGlob

import typings.fastGlob.tasksMod.Task
import typings.fastGlob.typesMod.Entry
import typings.fastGlob.typesMod.EntryItem
import typings.fastGlob.typesMod.ReaderOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fast-glob/out/providers/sync", JSImport.Namespace)
@js.native
object syncMod extends js.Object {
  
  @js.native
  trait ProviderSync
    extends typings.fastGlob.providerMod.default[js.Array[EntryItem]] {
    
    var _reader: typings.fastGlob.readersSyncMod.default = js.native
    
    def api(root: String, task: Task, options: ReaderOptions): js.Array[Entry] = js.native
  }
  
  @js.native
  class default () extends ProviderSync
}
