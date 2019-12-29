package typings.fastDashGlob

import typings.atMrmlncReaddirDashEnhanced.atMrmlncReaddirDashEnhancedMod.Options
import typings.fastDashGlob.packageOutManagersTasksMod.ITask
import typings.fastDashGlob.packageOutTypesEntriesMod.EntryItem
import typings.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-glob/package/out/providers/reader-async", JSImport.Namespace)
@js.native
object packageOutProvidersReaderDashAsyncMod extends js.Object {
  @js.native
  trait ReaderAsync
    extends typings.fastDashGlob.packageOutProvidersReaderMod.default[js.Promise[js.Array[EntryItem]]] {
    /**
      * Returns FileSystem adapter.
      */
    val fsAdapter: typings.fastDashGlob.packageOutAdaptersFsDashStreamMod.default = js.native
    /**
      * Returns founded paths.
      */
    def api(root: String, task: ITask, options: Options): ReadableStream = js.native
    /**
      * Api for dynamic tasks.
      */
    def dynamicApi(root: String, options: Options): ReadableStream = js.native
    /**
      * Api for static tasks.
      */
    def staticApi(task: ITask, options: Options): ReadableStream = js.native
  }
  
  @js.native
  class default () extends ReaderAsync
  
}

