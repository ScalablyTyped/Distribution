package typings.fastDashGlob

import typings.atMrmlncReaddirDashEnhanced.atMrmlncReaddirDashEnhancedMod.Options
import typings.fastDashGlob.outManagersTasksMod.ITask
import typings.fastDashGlob.outProvidersReaderDashSyncMod.ReaderSync
import typings.fastDashGlob.outTypesEntriesMod.Entry
import typings.fastDashGlob.outTypesEntriesMod.EntryItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-glob/out/providers/reader-sync", JSImport.Namespace)
@js.native
object outProvidersReaderDashSyncMod extends js.Object {
  @js.native
  trait ReaderSync
    extends typings.fastDashGlob.outProvidersReaderMod.default[js.Array[EntryItem]] {
    /**
      * Returns FileSystem adapter.
      */
    val fsAdapter: typings.fastDashGlob.outAdaptersFsDashSyncMod.default = js.native
    /**
      * Returns founded paths.
      */
    def api(root: String, task: ITask, options: Options): js.Array[Entry] = js.native
    /**
      * Api for dynamic tasks.
      */
    def dynamicApi(root: String, options: Options): js.Array[Entry] = js.native
    /**
      * Api for static tasks.
      */
    def staticApi(task: ITask, options: Options): js.Array[Entry] = js.native
  }
  
  @js.native
  class default () extends ReaderSync
  
}

