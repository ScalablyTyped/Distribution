package typings.fastGlob

import typings.fastGlob.outManagersTasksMod.Task
import typings.fastGlob.outTypesMod.Entry
import typings.fastGlob.outTypesMod.EntryItem
import typings.fastGlob.outTypesMod.ReaderOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outProvidersSyncMod {
  
  @JSImport("fast-glob/out/providers/sync", JSImport.Default)
  @js.native
  open class default () extends ProviderSync
  
  @js.native
  trait ProviderSync
    extends typings.fastGlob.outProvidersProviderMod.default[js.Array[EntryItem]] {
    
    /* protected */ var _reader: typings.fastGlob.outReadersSyncMod.default = js.native
    
    def api(root: String, task: Task, options: ReaderOptions): js.Array[Entry] = js.native
  }
}
