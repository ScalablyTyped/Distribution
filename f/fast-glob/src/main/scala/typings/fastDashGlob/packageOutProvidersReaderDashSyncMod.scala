package typings.fastDashGlob

import typings.atMrmlncReaddirDashEnhanced.atMrmlncReaddirDashEnhancedMod.Options
import typings.fastDashGlob.packageOutManagersTasksMod.ITask
import typings.fastDashGlob.packageOutProvidersReaderDashSyncMod.ReaderSync
import typings.fastDashGlob.packageOutTypesEntriesMod.Entry
import typings.fastDashGlob.packageOutTypesEntriesMod.EntryItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-glob/package/out/providers/reader-sync", JSImport.Namespace)
@js.native
object packageOutProvidersReaderDashSyncMod extends js.Object {
  @js.native
  trait ReaderSync
    extends typings.fastDashGlob.packageOutProvidersReaderMod.default[js.Array[EntryItem]] {
    /**
      * Returns FileSystem adapter.
      */
    val fsAdapter: typings.fastDashGlob.packageOutAdaptersFsDashSyncMod.default = js.native
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

