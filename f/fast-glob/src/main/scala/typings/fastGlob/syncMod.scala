package typings.fastGlob

import typings.fastGlob.tasksMod.Task
import typings.fastGlob.typesMod.Entry
import typings.fastGlob.typesMod.EntryItem
import typings.fastGlob.typesMod.ReaderOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object syncMod {
  
  @JSImport("fast-glob/out/providers/sync", JSImport.Default)
  @js.native
  class default () extends ProviderSync
  
  @js.native
  trait ProviderSync
    extends typings.fastGlob.providerMod.default[js.Array[EntryItem]] {
    
    /* protected */ var _reader: typings.fastGlob.readersSyncMod.default = js.native
    
    def api(root: String, task: Task, options: ReaderOptions): js.Array[Entry] = js.native
  }
}
