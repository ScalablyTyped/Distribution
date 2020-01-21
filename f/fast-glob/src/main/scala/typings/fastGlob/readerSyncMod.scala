package typings.fastGlob

import typings.fastGlob.entriesMod.Entry
import typings.fastGlob.entriesMod.EntryItem
import typings.fastGlob.tasksMod.ITask
import typings.mrmlncReaddirEnhanced.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-glob/out/providers/reader-sync", JSImport.Namespace)
@js.native
object readerSyncMod extends js.Object {
  @js.native
  trait ReaderSync
    extends typings.fastGlob.readerMod.default[js.Array[EntryItem]] {
    /**
      * Returns FileSystem adapter.
      */
    val fsAdapter: typings.fastGlob.fsSyncMod.default = js.native
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

