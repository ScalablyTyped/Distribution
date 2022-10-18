package typings.fastGlob

import typings.fastGlob.outManagersTasksMod.Task
import typings.fastGlob.outTypesMod.Entry
import typings.fastGlob.outTypesMod.EntryItem
import typings.fastGlob.outTypesMod.ReaderOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outProvidersAsyncMod {
  
  @JSImport("fast-glob/out/providers/async", JSImport.Default)
  @js.native
  open class default () extends ProviderAsync
  
  @js.native
  trait ProviderAsync
    extends typings.fastGlob.outProvidersProviderMod.default[js.Promise[js.Array[EntryItem]]] {
    
    /* protected */ var _reader: typings.fastGlob.outReadersAsyncMod.default = js.native
    
    def api(root: String, task: Task, options: ReaderOptions): js.Promise[js.Array[Entry]] = js.native
  }
}
